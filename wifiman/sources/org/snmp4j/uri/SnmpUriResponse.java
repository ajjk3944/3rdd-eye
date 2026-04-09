package org.snmp4j.uri;

import java.util.List;
import org.snmp4j.smi.VariableBinding;

/* loaded from: classes2.dex */
public class SnmpUriResponse {
    private List<VariableBinding[]> data;
    private String errorMessage;
    private int errorStatus;
    private Type responseType;

    public enum Type {
        FINAL,
        NEXT,
        TIMEOUT,
        SNMP_ERROR,
        IO_ERROR,
        SECURITY_ERROR,
        LEXICOGRAPHIC_ORDER_ERROR
    }

    public SnmpUriResponse(List<VariableBinding[]> list) {
        this.errorStatus = 0;
        this.responseType = Type.FINAL;
        this.data = list;
    }

    public List<VariableBinding[]> getData() {
        return this.data;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public int getErrorStatus() {
        return this.errorStatus;
    }

    public Type getResponseType() {
        return this.responseType;
    }

    public void setResponseType(Type type) {
        this.responseType = type;
    }

    public String toString() {
        return "SnmpUriResponse{data=" + this.data + ", errorStatus=" + this.errorStatus + ", responseType=" + this.responseType + ", errorMessage='" + this.errorMessage + "'}";
    }

    public SnmpUriResponse(Type type) {
        this.errorStatus = 0;
        Type type2 = Type.FINAL;
        this.responseType = type;
    }

    public SnmpUriResponse(Type type, String str) {
        this.errorStatus = 0;
        Type type2 = Type.FINAL;
        this.responseType = type;
        this.errorMessage = str;
    }

    public SnmpUriResponse(int i10) {
        this.errorStatus = 0;
        this.responseType = Type.FINAL;
        this.errorStatus = i10;
        this.responseType = Type.SNMP_ERROR;
    }

    public SnmpUriResponse(List<VariableBinding[]> list, int i10) {
        this(list);
        this.errorStatus = i10;
        this.responseType = Type.SNMP_ERROR;
    }

    public SnmpUriResponse(List<VariableBinding[]> list, Type type) {
        this(list);
        this.responseType = type;
    }
}
