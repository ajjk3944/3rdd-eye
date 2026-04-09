package org.snmp4j.util;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import org.snmp4j.PDU;
import org.snmp4j.Session;
import org.snmp4j.Target;
import org.snmp4j.event.ResponseListener;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.VariableBinding;

/* loaded from: classes2.dex */
public class TreeUtils extends AbstractSnmpUtility {
    private static final LogAdapter logger = LogFactory.getLogger(TreeUtils.class);
    private boolean ignoreLexicographicOrder;
    private int maxRepetitions;

    class InternalTreeListener implements TreeListener {
        private List<TreeEvent> collectedEvents;
        private volatile boolean finished = false;

        public InternalTreeListener(List<TreeEvent> list) {
            this.collectedEvents = list;
        }

        @Override // org.snmp4j.util.TreeListener
        public synchronized void finished(TreeEvent treeEvent) {
            this.collectedEvents.add(treeEvent);
            this.finished = true;
            notify();
        }

        public List<TreeEvent> getCollectedEvents() {
            return this.collectedEvents;
        }

        @Override // org.snmp4j.util.TreeListener
        public boolean isFinished() {
            return this.finished;
        }

        @Override // org.snmp4j.util.TreeListener
        public synchronized boolean next(TreeEvent treeEvent) {
            this.collectedEvents.add(treeEvent);
            return true;
        }
    }

    class TreeRequest implements ResponseListener {
        private TreeListener listener;
        private PDU request;
        private OID[] rootOIDs;
        private Target target;
        private Object userObject;

        public TreeRequest(TreeListener treeListener, OID[] oidArr, Target target, Object obj, PDU pdu) {
            this.listener = treeListener;
            this.userObject = obj;
            this.request = pdu;
            this.rootOIDs = oidArr;
            this.target = target;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00f6  */
        @Override // org.snmp4j.event.ResponseListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onResponse(org.snmp4j.event.ResponseEvent r11) {
            /*
                Method dump skipped, instructions count: 485
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.snmp4j.util.TreeUtils.TreeRequest.onResponse(org.snmp4j.event.ResponseEvent):void");
        }

        public void send() {
            try {
                TreeUtils.this.session.send(this.request, this.target, null, this);
            } catch (IOException e10) {
                this.listener.finished(new TreeEvent(this, this.userObject, e10));
            }
        }
    }

    public TreeUtils(Session session, PDUFactory pDUFactory) {
        super(session, pDUFactory);
        this.maxRepetitions = 10;
    }

    public int getMaxRepetitions() {
        return this.maxRepetitions;
    }

    public List<TreeEvent> getSubtree(Target target, OID oid) {
        LinkedList linkedList = new LinkedList();
        InternalTreeListener internalTreeListener = new InternalTreeListener(linkedList);
        synchronized (internalTreeListener) {
            walk(target, new OID[]{oid}, null, internalTreeListener);
            try {
                internalTreeListener.wait();
            } catch (InterruptedException e10) {
                logger.warn("Tree retrieval interrupted: " + e10.getMessage());
            }
        }
        return linkedList;
    }

    public boolean isIgnoreLexicographicOrder() {
        return this.ignoreLexicographicOrder;
    }

    public void setIgnoreLexicographicOrder(boolean z10) {
        this.ignoreLexicographicOrder = z10;
    }

    public void setMaxRepetitions(int i10) {
        this.maxRepetitions = i10;
    }

    public List<TreeEvent> walk(Target target, OID[] oidArr) {
        LinkedList linkedList = new LinkedList();
        InternalTreeListener internalTreeListener = new InternalTreeListener(linkedList);
        synchronized (internalTreeListener) {
            walk(target, oidArr, null, internalTreeListener);
            try {
                internalTreeListener.wait();
            } catch (InterruptedException e10) {
                logger.warn("Tree retrieval interrupted: " + e10.getMessage());
            }
        }
        return linkedList;
    }

    public void walk(Target target, OID[] oidArr, Object obj, TreeListener treeListener) {
        PDU pduCreatePDU = this.pduFactory.createPDU(target);
        for (OID oid : oidArr) {
            pduCreatePDU.add(new VariableBinding(oid));
        }
        if (target.getVersion() == 0) {
            pduCreatePDU.setType(-95);
        } else if (pduCreatePDU.getType() != -95) {
            pduCreatePDU.setType(-91);
            pduCreatePDU.setMaxRepetitions(this.maxRepetitions);
        }
        new TreeRequest(treeListener, oidArr, target, obj, pduCreatePDU).send();
    }

    public void getSubtree(Target target, OID oid, Object obj, TreeListener treeListener) {
        walk(target, new OID[]{oid}, obj, treeListener);
    }
}
