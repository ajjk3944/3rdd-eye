package org.snmp4j.util;

import java.util.Arrays;
import java.util.EventListener;
import java.util.EventObject;
import org.snmp4j.PDU;
import org.snmp4j.event.ResponseListener;
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.util.TreeUtils;

/* loaded from: classes2.dex */
public abstract class RetrievalEvent extends EventObject {
    public static final int STATUS_EXCEPTION = -4;
    public static final int STATUS_OK = 0;
    public static final int STATUS_REPORT = -3;
    public static final int STATUS_TIMEOUT = -1;
    public static final int STATUS_WRONG_ORDER = -2;
    protected Exception exception;
    protected PDU reportPDU;
    protected int status;
    protected Object userObject;
    protected VariableBinding[] vbs;

    protected RetrievalEvent(EventListener eventListener, Object obj) {
        super(eventListener);
        this.status = 0;
        this.userObject = obj;
    }

    public String getErrorMessage() {
        int i10 = this.status;
        if (i10 == -4) {
            return this.exception.getMessage();
        }
        if (i10 != -3) {
            return i10 != -2 ? i10 != -1 ? PDU.toErrorStatusText(i10) : "Request timed out." : "Agent did not return variable bindings in lexicographic order.";
        }
        return "Report: " + this.reportPDU.get(0);
    }

    public Exception getException() {
        return this.exception;
    }

    public PDU getReportPDU() {
        return this.reportPDU;
    }

    public int getStatus() {
        return this.status;
    }

    public Object getUserObject() {
        return this.userObject;
    }

    public boolean isError() {
        return this.status != 0;
    }

    @Override // java.util.EventObject
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName());
        sb2.append("[vbs=");
        if (this.vbs == null) {
            str = "null";
        } else {
            str = "" + Arrays.asList(this.vbs);
        }
        sb2.append(str);
        sb2.append(",status=");
        sb2.append(this.status);
        sb2.append(",exception=");
        sb2.append(this.exception);
        sb2.append(",report=");
        sb2.append(this.reportPDU);
        sb2.append("]");
        return sb2.toString();
    }

    public RetrievalEvent(TreeUtils.TreeRequest treeRequest, Object obj, int i10) {
        this(treeRequest, obj);
        this.status = i10;
    }

    public RetrievalEvent(TreeUtils.TreeRequest treeRequest, Object obj, Exception exc) {
        this(treeRequest, obj);
        this.exception = exc;
        this.status = -4;
    }

    public RetrievalEvent(TreeUtils.TreeRequest treeRequest, Object obj, PDU pdu) {
        this(treeRequest, obj);
        this.reportPDU = pdu;
        this.status = -3;
    }

    public RetrievalEvent(ResponseListener responseListener, Object obj, VariableBinding[] variableBindingArr) {
        this(responseListener, obj);
        this.vbs = variableBindingArr;
    }
}
