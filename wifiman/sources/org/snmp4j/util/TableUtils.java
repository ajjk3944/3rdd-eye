package org.snmp4j.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
import org.snmp4j.PDU;
import org.snmp4j.Session;
import org.snmp4j.Target;
import org.snmp4j.event.ResponseEvent;
import org.snmp4j.event.ResponseListener;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.mp.PduHandle;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.Variable;
import org.snmp4j.smi.VariableBinding;

/* loaded from: classes2.dex */
public class TableUtils extends AbstractSnmpUtility {
    public static final int ROWSTATUS_ACTIVE = 1;
    public static final int ROWSTATUS_CREATEANDGO = 4;
    public static final int ROWSTATUS_CREATEANDWAIT = 5;
    public static final int ROWSTATUS_DESTROY = 6;
    public static final int ROWSTATUS_NOTINSERVICE = 2;
    public static final int ROWSTATUS_NOTREADY = 3;
    private static final LogAdapter logger = LogFactory.getLogger(TableUtils.class);
    private boolean checkLexicographicOrdering;
    private int ignoreMaxLexicographicRowOrderingErrors;
    private int maxNumColumnsPerPDU;
    private int maxNumOfRowsPerPDU;
    private boolean sendColumnPDUsMultiThreaded;

    protected class ColumnsOfRequest {
        private List<Integer> columnIDs;
        private LastReceived lastReceived;
        private int requestSerial;

        public ColumnsOfRequest(List<Integer> list, int i10, LastReceived lastReceived) {
            this.columnIDs = list;
            this.requestSerial = i10;
            this.lastReceived = lastReceived;
        }

        public List<Integer> getColumnIDs() {
            return this.columnIDs;
        }

        public LastReceived getLastReceived() {
            return this.lastReceived;
        }

        public int getRequestSerial() {
            return this.requestSerial;
        }
    }

    class DenseTableRequest extends TableRequest {
        protected DenseTableRequest(Target target, OID[] oidArr, TableListener tableListener, Object obj, OID oid, OID oid2) {
            super(target, oidArr, tableListener, obj, oid, oid2);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
        @Override // org.snmp4j.util.TableUtils.TableRequest, org.snmp4j.event.ResponseListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public synchronized void onResponse(org.snmp4j.event.ResponseEvent r19) {
            /*
                Method dump skipped, instructions count: 266
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.snmp4j.util.TableUtils.DenseTableRequest.onResponse(org.snmp4j.event.ResponseEvent):void");
        }
    }

    class InternalTableListener implements TableListener {
        private List<TableEvent> rows = new LinkedList();
        private volatile boolean finished = false;

        InternalTableListener() {
        }

        @Override // org.snmp4j.util.TableListener
        public synchronized void finished(TableEvent tableEvent) {
            try {
                if (tableEvent.getStatus() != 0 || tableEvent.getIndex() != null) {
                    this.rows.add(tableEvent);
                }
                this.finished = true;
                notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public List<TableEvent> getRows() {
            return this.rows;
        }

        @Override // org.snmp4j.util.TableListener
        public boolean isFinished() {
            return this.finished;
        }

        @Override // org.snmp4j.util.TableListener
        public boolean next(TableEvent tableEvent) {
            this.rows.add(tableEvent);
            return true;
        }
    }

    class LastReceived {
        private List<LastReceivedColumnInfo> columnInfos;

        public LastReceived(LastReceived lastReceived) {
            this.columnInfos = new ArrayList(lastReceived.size());
            Iterator<LastReceivedColumnInfo> it = lastReceived.columnInfos.iterator();
            while (it.hasNext()) {
                this.columnInfos.add(it.next());
            }
        }

        public OID get(int i10) {
            return this.columnInfos.get(i10).getOid();
        }

        public List<LastReceivedColumnInfo> getColumnInfos() {
            return this.columnInfos;
        }

        public void set(int i10, OID oid) {
            this.columnInfos.set(i10, TableUtils.this.new LastReceivedColumnInfo(oid, null));
        }

        public void setColumnInfos(List<LastReceivedColumnInfo> list) {
            this.columnInfos = list;
        }

        public int size() {
            return this.columnInfos.size();
        }

        public void set(int i10, OID oid, Row row) {
            this.columnInfos.set(i10, TableUtils.this.new LastReceivedColumnInfo(oid, row));
        }

        public LastReceived(List<OID> list) {
            this.columnInfos = new ArrayList(list.size());
            Iterator<OID> it = list.iterator();
            while (it.hasNext()) {
                this.columnInfos.add(TableUtils.this.new LastReceivedColumnInfo(it.next(), null));
            }
        }
    }

    class LastReceivedColumnInfo {
        private Row basedOn;
        private OID oid;

        public LastReceivedColumnInfo(OID oid, Row row) {
            this.oid = oid;
            this.basedOn = row;
        }

        public Row getBasedOn() {
            return this.basedOn;
        }

        public OID getOid() {
            return this.oid;
        }
    }

    class Row extends Vector<VariableBinding> {
        private static final long serialVersionUID = -2297277440117636627L;
        private OID index;
        private boolean orderError;

        public Row(OID oid) {
            this.index = oid;
        }

        public int getNumComplete() {
            return super.size();
        }

        public OID getRowIndex() {
            return this.index;
        }

        public boolean isOrderError() {
            return this.orderError;
        }

        public boolean setNumComplete(int i10) {
            int numComplete = i10 - getNumComplete();
            for (int i11 = 0; i11 < numComplete; i11++) {
                super.add(null);
            }
            return numComplete >= 0;
        }
    }

    public class TableRequest implements ResponseListener {
        OID[] columnOIDs;
        protected LastReceived lastReceived;
        TableListener listener;
        OID lowerBoundIndex;
        Target target;
        OID upperBoundIndex;
        Object userObject;
        private int sent = 0;
        private boolean anyMatch = false;
        private Vector<OID> lastSent = null;
        private LinkedList<Row> rowCache = new LinkedList<>();
        private int requestSerial = PduHandle.NONE;
        private List<Integer> requestSerialsPending = Collections.synchronizedList(new LinkedList());
        private int numLexicographicErrors = 0;
        volatile boolean finished = false;

        public TableRequest(Target target, OID[] oidArr, TableListener tableListener, Object obj, OID oid, OID oid2) {
            this.target = target;
            this.columnOIDs = oidArr;
            this.listener = tableListener;
            this.userObject = obj;
            this.lastReceived = TableUtils.this.new LastReceived((List<OID>) Arrays.asList(oidArr));
            this.upperBoundIndex = oid2;
            this.lowerBoundIndex = oid;
            if (oid != null) {
                for (int i10 = 0; i10 < this.lastReceived.size(); i10++) {
                    OID oid3 = new OID(this.lastReceived.get(i10));
                    oid3.append(oid);
                    this.lastReceived.set(i10, oid3);
                }
            }
        }

        private void emptyCache() {
            while (this.rowCache.size() > 0) {
                TableEvent tableEvent = getTableEvent();
                if (tableEvent != null && (tableEvent.getStatus() != -2 || this.numLexicographicErrors <= TableUtils.this.ignoreMaxLexicographicRowOrderingErrors)) {
                    if (!this.listener.next(tableEvent)) {
                        return;
                    }
                }
            }
        }

        private TableEvent getTableEvent() {
            if (this.rowCache.isEmpty()) {
                return null;
            }
            Row rowRemoveFirst = this.rowCache.removeFirst();
            rowRemoveFirst.setNumComplete(this.columnOIDs.length);
            VariableBinding[] variableBindingArr = new VariableBinding[rowRemoveFirst.size()];
            rowRemoveFirst.copyInto(variableBindingArr);
            TableEvent tableEvent = new TableEvent(this, this.userObject, rowRemoveFirst.getRowIndex(), variableBindingArr);
            if (rowRemoveFirst.isOrderError()) {
                tableEvent.status = -2;
                this.numLexicographicErrors++;
            }
            return tableEvent;
        }

        protected boolean checkResponse(ResponseEvent responseEvent) {
            if (responseEvent.getError() != null) {
                this.finished = true;
                emptyCache();
                this.listener.finished(new TableEvent(this, this.userObject, responseEvent.getError()));
                return false;
            }
            if (responseEvent.getResponse() == null) {
                this.finished = true;
                emptyCache();
                this.listener.finished(new TableEvent(this, this.userObject, -1));
                return false;
            }
            if (responseEvent.getResponse().getType() == -88) {
                this.finished = true;
                emptyCache();
                this.listener.finished(new TableEvent(this, this.userObject, responseEvent.getResponse()));
                return false;
            }
            if (responseEvent.getResponse().getErrorStatus() == 0) {
                return true;
            }
            this.finished = true;
            emptyCache();
            this.listener.finished(new TableEvent(this, this.userObject, responseEvent.getResponse().getErrorStatus()));
            return false;
        }

        public int getNumLexicographicErrors() {
            return this.numLexicographicErrors;
        }

        public Row getRow(OID oid) {
            LinkedList<Row> linkedList = this.rowCache;
            ListIterator<Row> listIterator = linkedList.listIterator(linkedList.size() + 1);
            while (listIterator.hasPrevious()) {
                Row rowPrevious = listIterator.previous();
                if (oid.equals(rowPrevious.getRowIndex())) {
                    return rowPrevious;
                }
            }
            return null;
        }

        protected int getTableStatus() {
            return this.numLexicographicErrors > 0 ? -2 : 0;
        }

        @Override // org.snmp4j.event.ResponseListener
        public void onResponse(ResponseEvent responseEvent) {
            boolean zSendNextChunk;
            TableEvent tableEvent;
            int i10;
            PDU pdu;
            TableUtils.this.session.cancel(responseEvent.getRequest(), this);
            if (this.finished) {
                return;
            }
            synchronized (this) {
                try {
                    if (checkResponse(responseEvent)) {
                        ColumnsOfRequest columnsOfRequest = (ColumnsOfRequest) responseEvent.getUserObject();
                        boolean zRemovePending = removePending(columnsOfRequest.getRequestSerial());
                        PDU request = responseEvent.getRequest();
                        PDU response = responseEvent.getResponse();
                        int size = request.size();
                        int size2 = response.size() / size;
                        boolean z10 = false;
                        OID oid = null;
                        for (int i11 = 0; i11 < size2; i11++) {
                            z10 = false;
                            int i12 = 0;
                            Row rowPrevious = null;
                            while (i12 < size) {
                                int iIntValue = columnsOfRequest.getColumnIDs().get(i12).intValue();
                                VariableBinding variableBinding = response.get((i11 * size) + i12);
                                if (variableBinding.isException()) {
                                    i10 = size;
                                    pdu = response;
                                } else {
                                    OID oid2 = variableBinding.getOid();
                                    OID oid3 = this.columnOIDs[iIntValue];
                                    if (oid2.startsWith(oid3)) {
                                        i10 = size;
                                        pdu = response;
                                        OID oid4 = new OID(oid2.getValue(), oid3.size(), oid2.size() - oid3.size());
                                        OID oid5 = this.upperBoundIndex;
                                        if (oid5 == null || oid4.compareTo((Variable) oid5) <= 0) {
                                            if (oid == null || oid4.compareTo((Variable) oid) < 0) {
                                                oid = oid4;
                                            }
                                            if (rowPrevious == null || !rowPrevious.getRowIndex().equals(oid4)) {
                                                LinkedList<Row> linkedList = this.rowCache;
                                                ListIterator<Row> listIterator = linkedList.listIterator(linkedList.size());
                                                while (listIterator.hasPrevious()) {
                                                    rowPrevious = listIterator.previous();
                                                    int iCompareTo = oid4.compareTo((Variable) rowPrevious.getRowIndex());
                                                    if (iCompareTo != 0) {
                                                        if (iCompareTo > 0) {
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                                rowPrevious = null;
                                            }
                                            if (rowPrevious == null) {
                                                Row row = TableUtils.this.new Row(oid4);
                                                if (this.rowCache.size() == 0) {
                                                    this.rowCache.add(row);
                                                } else if (this.rowCache.getFirst().getRowIndex().compareTo((Variable) oid4) < 0) {
                                                    LinkedList<Row> linkedList2 = this.rowCache;
                                                    ListIterator<Row> listIterator2 = linkedList2.listIterator(linkedList2.size());
                                                    while (true) {
                                                        if (!listIterator2.hasPrevious()) {
                                                            break;
                                                        }
                                                        Row rowPrevious2 = listIterator2.previous();
                                                        if (oid4.compareTo((Variable) rowPrevious2.index) >= 0) {
                                                            listIterator2.set(row);
                                                            listIterator2.add(rowPrevious2);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    this.rowCache.addFirst(row);
                                                }
                                                rowPrevious = row;
                                            }
                                            rowPrevious.setNumComplete(iIntValue);
                                            if (iIntValue < rowPrevious.getNumComplete()) {
                                                rowPrevious.set(iIntValue, variableBinding);
                                            } else {
                                                rowPrevious.add(variableBinding);
                                            }
                                            if (TableUtils.this.isCheckLexicographicOrdering()) {
                                                if (oid2.compareTo((Variable) responseEvent.getRequest().get(i12).getOid()) <= 0) {
                                                    if (!rowPrevious.orderError) {
                                                        rowPrevious.orderError = true;
                                                    }
                                                } else if (columnsOfRequest.lastReceived != null) {
                                                    try {
                                                        Row basedOn = columnsOfRequest.lastReceived.getColumnInfos().get(iIntValue).getBasedOn();
                                                        if (basedOn != null && basedOn.isOrderError()) {
                                                            rowPrevious.orderError = true;
                                                        }
                                                    } catch (Exception unused) {
                                                    }
                                                }
                                            }
                                            this.lastReceived.set(iIntValue, variableBinding.getOid(), rowPrevious);
                                            z10 = true;
                                        }
                                    } else {
                                        i10 = size;
                                        pdu = response;
                                        this.lastReceived.set(iIntValue, variableBinding.getOid());
                                    }
                                }
                                i12++;
                                size = i10;
                                response = pdu;
                            }
                        }
                        this.anyMatch |= z10;
                        do {
                            Row first = this.rowCache.isEmpty() ? null : this.rowCache.getFirst();
                            if (first != null && first.getNumComplete() == this.columnOIDs.length && zRemovePending && (oid == null || first.orderError || first.getRowIndex().compareTo((Variable) oid) < 0)) {
                                tableEvent = getTableEvent();
                                if (TableUtils.this.isCheckLexicographicOrdering() && tableEvent != null && tableEvent.status == -2 && this.numLexicographicErrors >= TableUtils.this.ignoreMaxLexicographicRowOrderingErrors) {
                                    if (TableUtils.this.ignoreMaxLexicographicRowOrderingErrors > 0) {
                                        this.listener.next(tableEvent);
                                    }
                                    emptyCache();
                                    this.finished = true;
                                    this.listener.finished(new TableEvent(this, this.userObject, -2));
                                    return;
                                }
                                if (tableEvent == null) {
                                    break;
                                }
                            } else if (zRemovePending && !(zSendNextChunk = sendNextChunk())) {
                                if (this.anyMatch) {
                                    this.sent = 0;
                                    this.anyMatch = false;
                                    zSendNextChunk = sendNextChunk();
                                }
                                if (!zSendNextChunk) {
                                    emptyCache();
                                    this.finished = true;
                                    this.listener.finished(new TableEvent(this, this.userObject, getTableStatus()));
                                }
                            }
                        } while (this.listener.next(tableEvent));
                        emptyCache();
                        this.finished = true;
                        this.listener.finished(new TableEvent(this, this.userObject, getTableStatus()));
                    }
                } finally {
                }
            }
        }

        protected synchronized boolean removePending(int i10) {
            boolean z10;
            Iterator<Integer> it = this.requestSerialsPending.iterator();
            z10 = true;
            while (it.hasNext()) {
                if (it.next().intValue() == i10) {
                    it.remove();
                } else {
                    z10 = false;
                }
            }
            return z10;
        }

        public boolean sendNextChunk() {
            if (this.sent >= this.lastReceived.size()) {
                return false;
            }
            PDU pduCreatePDU = TableUtils.this.pduFactory.createPDU(this.target);
            if (this.target.getVersion() == 0) {
                pduCreatePDU.setType(-95);
            } else if (pduCreatePDU.getType() != -95) {
                pduCreatePDU.setType(-91);
            }
            int iMin = Math.min(this.lastReceived.size() - this.sent, TableUtils.this.maxNumColumnsPerPDU);
            if (pduCreatePDU.getType() == -91) {
                if (TableUtils.this.maxNumOfRowsPerPDU > 0) {
                    pduCreatePDU.setMaxRepetitions(TableUtils.this.maxNumOfRowsPerPDU);
                    pduCreatePDU.setNonRepeaters(0);
                } else {
                    pduCreatePDU.setNonRepeaters(iMin);
                    pduCreatePDU.setMaxRepetitions(0);
                }
            }
            this.lastSent = new Vector<>(iMin + 1);
            ArrayList arrayList = new ArrayList(iMin);
            int i10 = this.sent;
            int i11 = 0;
            while (true) {
                if (i10 < this.sent + iMin) {
                    OID oid = this.lastReceived.get(i10);
                    if (oid.startsWith(this.columnOIDs[i10])) {
                        pduCreatePDU.add(new VariableBinding(oid));
                        if (pduCreatePDU.getBERLength() > this.target.getMaxSizeRequestPDU()) {
                            pduCreatePDU.trim();
                            break;
                        }
                        this.lastSent.add(this.lastReceived.get(i10));
                        i11++;
                        arrayList.add(Integer.valueOf(i10));
                    } else {
                        i11++;
                    }
                    i10++;
                }
            }
            try {
                this.sent += i11;
                if (pduCreatePDU.size() == 0) {
                    return false;
                }
                TableUtils tableUtils = TableUtils.this;
                int i12 = this.requestSerial;
                this.requestSerial = i12 + 1;
                sendRequest(pduCreatePDU, this.target, tableUtils.new ColumnsOfRequest(arrayList, i12, tableUtils.isCheckLexicographicOrdering() ? TableUtils.this.new LastReceived(this.lastReceived) : null));
                return true;
            } catch (Exception e10) {
                TableUtils.logger.error(e10);
                if (TableUtils.logger.isDebugEnabled()) {
                    e10.printStackTrace();
                }
                this.listener.finished(new TableEvent(this, this.userObject, e10));
                return false;
            }
        }

        protected void sendRequest(PDU pdu, Target target, ColumnsOfRequest columnsOfRequest) throws IOException {
            this.requestSerialsPending.add(Integer.valueOf(columnsOfRequest.getRequestSerial()));
            TableUtils.this.session.send(pdu, target, columnsOfRequest, this);
        }
    }

    public TableUtils(Session session, PDUFactory pDUFactory) {
        super(session, pDUFactory);
        this.maxNumOfRowsPerPDU = 10;
        this.maxNumColumnsPerPDU = 10;
        this.checkLexicographicOrdering = true;
        this.ignoreMaxLexicographicRowOrderingErrors = 3;
    }

    public ResponseEvent createRow(Target target, OID oid, OID oid2, VariableBinding[] variableBindingArr) {
        PDU pduCreatePDU = this.pduFactory.createPDU(target);
        OID oid3 = new OID(oid);
        oid3.append(oid2);
        VariableBinding variableBinding = new VariableBinding(oid3);
        if (variableBindingArr != null) {
            variableBinding.setVariable(new Integer32(4));
        } else {
            variableBinding.setVariable(new Integer32(5));
        }
        pduCreatePDU.add(variableBinding);
        if (variableBindingArr != null) {
            for (VariableBinding variableBinding2 : variableBindingArr) {
                OID oid4 = new OID(variableBinding2.getOid());
                oid4.append(oid2);
                variableBinding2.setOid(oid4);
            }
            pduCreatePDU.addAll(variableBindingArr);
        }
        pduCreatePDU.setType(-93);
        try {
            return this.session.send(pduCreatePDU, target);
        } catch (IOException e10) {
            logger.error(e10);
            return null;
        }
    }

    protected TableRequest createTableRequest(Target target, OID[] oidArr, TableListener tableListener, Object obj, OID oid, OID oid2) {
        return new TableRequest(target, oidArr, tableListener, obj, oid, oid2);
    }

    public ResponseEvent destroyRow(Target target, OID oid, OID oid2) {
        PDU pduCreatePDU = this.pduFactory.createPDU(target);
        OID oid3 = new OID(oid);
        oid3.append(oid2);
        VariableBinding variableBinding = new VariableBinding(oid3);
        variableBinding.setVariable(new Integer32(6));
        pduCreatePDU.add(variableBinding);
        pduCreatePDU.setType(-93);
        try {
            return this.session.send(pduCreatePDU, target);
        } catch (IOException e10) {
            logger.error(e10);
            return null;
        }
    }

    public void getDenseTable(Target target, OID[] oidArr, TableListener tableListener, Object obj, OID oid, OID oid2) {
        if (oidArr == null || oidArr.length == 0) {
            throw new IllegalArgumentException("No column OIDs specified");
        }
        new TableRequest(target, oidArr, tableListener, obj, oid, oid2).sendNextChunk();
    }

    public int getIgnoreMaxLexicographicRowOrderingErrors() {
        return this.ignoreMaxLexicographicRowOrderingErrors;
    }

    public int getMaxNumColumnsPerPDU() {
        return this.maxNumColumnsPerPDU;
    }

    public int getMaxNumRowsPerPDU() {
        return this.maxNumOfRowsPerPDU;
    }

    public List<TableEvent> getTable(Target target, OID[] oidArr, OID oid, OID oid2) {
        if (oidArr == null || oidArr.length == 0) {
            throw new IllegalArgumentException("No column OIDs specified");
        }
        InternalTableListener internalTableListener = new InternalTableListener();
        TableRequest tableRequestCreateTableRequest = createTableRequest(target, oidArr, internalTableListener, null, oid, oid2);
        synchronized (internalTableListener) {
            if (tableRequestCreateTableRequest.sendNextChunk()) {
                while (!internalTableListener.isFinished()) {
                    try {
                        internalTableListener.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        return internalTableListener.getRows();
    }

    public boolean isCheckLexicographicOrdering() {
        return this.checkLexicographicOrdering;
    }

    public boolean isSendColumnPDUsMultiThreaded() {
        return this.sendColumnPDUsMultiThreaded;
    }

    public void setCheckLexicographicOrdering(boolean z10) {
        this.checkLexicographicOrdering = z10;
    }

    public void setIgnoreMaxLexicographicRowOrderingErrors(int i10) {
        this.ignoreMaxLexicographicRowOrderingErrors = i10;
    }

    public void setMaxNumColumnsPerPDU(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("The number of columns per PDU must be > 0");
        }
        this.maxNumColumnsPerPDU = i10;
    }

    public void setMaxNumRowsPerPDU(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("The number of rows per PDU must be > 0");
        }
        this.maxNumOfRowsPerPDU = i10;
    }

    public void setSendColumnPDUsMultiThreaded(boolean z10) {
        this.sendColumnPDUsMultiThreaded = z10;
    }

    public void getTable(Target target, OID[] oidArr, TableListener tableListener, Object obj, OID oid, OID oid2) {
        if (oidArr != null && oidArr.length != 0) {
            TableRequest tableRequest = new TableRequest(target, oidArr, tableListener, obj, oid, oid2);
            for (boolean zSendNextChunk = tableRequest.sendNextChunk(); this.sendColumnPDUsMultiThreaded && zSendNextChunk; zSendNextChunk = tableRequest.sendNextChunk()) {
            }
            return;
        }
        throw new IllegalArgumentException("No column OIDs specified");
    }
}
