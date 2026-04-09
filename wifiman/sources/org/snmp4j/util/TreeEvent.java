package org.snmp4j.util;

import org.snmp4j.PDU;
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.util.TreeUtils;

/* loaded from: classes2.dex */
public class TreeEvent extends RetrievalEvent {
    private static final long serialVersionUID = 5660517240029018420L;

    public TreeEvent(TreeUtils.TreeRequest treeRequest, Object obj, VariableBinding[] variableBindingArr) {
        super(treeRequest, obj, variableBindingArr);
    }

    public VariableBinding[] getVariableBindings() {
        return this.vbs;
    }

    public TreeEvent(TreeUtils.TreeRequest treeRequest, Object obj, int i10) {
        super(treeRequest, obj, i10);
    }

    public TreeEvent(TreeUtils.TreeRequest treeRequest, Object obj, PDU pdu) {
        super(treeRequest, obj, pdu);
    }

    public TreeEvent(TreeUtils.TreeRequest treeRequest, Object obj, Exception exc) {
        super(treeRequest, obj, exc);
    }
}
