package com.handpay.arch.stat.rpc;

import com.handpay.arch.stat.anno.GroupKey;
import com.handpay.arch.stat.anno.ValueKey;
import com.handpay.arch.stat.bean.CommonResult;
import org.apache.commons.lang3.AnnotationUtils;

import java.io.Serializable;
import java.lang.reflect.Field;

/**
 * Created by sxjiang on 2016/11/1.
 */
public class DubboStatusResult extends CommonResult implements Serializable {
    private static final long serialVersionUID = 1L;
    @GroupKey
    private String serverHost;
    @ValueKey(order=10)
    private String successRatio;

    public String getServerHost() {
        return serverHost;
    }

    public void setServerHost(String serverHost) {
        this.serverHost = serverHost;
    }

    public String getSuccessRatio() {
        return successRatio;
    }

    public void setSuccessRatio(String successRatio) {
        this.successRatio = successRatio;
    }

    @Override
    public String toString() {
        return "DubboStatusResult{" +
                "serverHost='" + serverHost + '\'' +
                ", successRatio='" + successRatio + '\'' +
                '}' +super.toString();
    }


}
