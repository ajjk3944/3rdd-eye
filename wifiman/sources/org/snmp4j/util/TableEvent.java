package org.snmp4j.util;

import java.util.Arrays;
import org.snmp4j.PDU;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.util.TableUtils;

/* loaded from: classes2.dex */
public class TableEvent extends RetrievalEvent {
    private static final long serialVersionUID = 3340523737695933621L;
    private OID index;

    protected TableEvent(TableUtils.TableRequest tableRequest, Object obj) {
        super(tableRequest, obj);
        this.userObject = obj;
    }

    public VariableBinding[] getColumns() {
        return this.vbs;
    }

    public OID getIndex() {
        return this.index;
    }

    @Override // org.snmp4j.util.RetrievalEvent, java.util.EventObject
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName());
        sb2.append("[index=");
        sb2.append(this.index);
        sb2.append(",vbs=");
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

    public TableEvent(TableUtils.TableRequest tableRequest, Object obj, int i10) {
        this(tableRequest, obj);
        this.status = i10;
    }

    public TableEvent(TableUtils.TableRequest tableRequest, Object obj, Exception exc) {
        this(tableRequest, obj);
        this.exception = exc;
        this.status = -4;
    }

    public TableEvent(TableUtils.TableRequest tableRequest, Object obj, PDU pdu) {
        this(tableRequest, obj);
        this.reportPDU = pdu;
        this.status = -3;
    }

    public TableEvent(TableUtils.TableRequest tableRequest, Object obj, OID oid, VariableBinding[] variableBindingArr) {
        super(tableRequest, obj, variableBindingArr);
        this.index = oid;
    }
}
