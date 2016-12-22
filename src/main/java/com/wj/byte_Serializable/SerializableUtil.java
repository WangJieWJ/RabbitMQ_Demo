package com.wj.byte_Serializable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.*;

/**
 * 功能概述：序列化工具类，负责byte[]和object之间的相互转换。
 * Created by wangjie on 2016/12/22 0022.
 */
public class SerializableUtil {

    public static Log logger = LogFactory.getLog(SerializableUtil.class);

    /**
     * 进行序列化
     *
     * @param resource
     * @return
     */
    public static byte[] Serialize(Object resource) {
        ByteArrayOutputStream byteOut = null;
        ObjectOutputStream object = null;
        try {
            byteOut = new ByteArrayOutputStream();
            object = new ObjectOutputStream(byteOut);
            object.writeObject(resource);
            object.flush();
        } catch (IOException e) {
            logger.error(resource.getClass().getName() + " Serialized error !", e);
        } finally {
            try {
                if (object != null) {
                    object.close();
                }
            } catch (IOException e) {
                object = null;
            }
        }
        return byteOut.toByteArray();
    }

    public static Object deSerialize(byte[] source) {
        ObjectInputStream objIn = null;
        Object retVal = null;
        try {
            ByteArrayInputStream byteIn = new ByteArrayInputStream(source);
            objIn = new ObjectInputStream(byteIn);
            retVal = objIn.readObject();
        } catch (Exception e) {
            logger.error("deSerialized error !", e);
        } finally {
            try {
                if (null != objIn) {
                    objIn.close();
                }
            } catch (IOException exception) {
                objIn = null;
            }
        }
        return retVal;
    }
}
