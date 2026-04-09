package org.snmp4j.mp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.snmp4j.SNMP4JSettings;
import org.snmp4j.TransportMapping;
import org.snmp4j.security.SecurityModel;
import org.snmp4j.security.SecurityStateReference;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public class StateReference<A extends Address> implements Serializable {
    private static final long serialVersionUID = 7385215386971310699L;
    private A address;
    private byte[] contextEngineID;
    private byte[] contextName;
    private int errorCode;
    private int matchedMsgID;
    private int maxSizeResponseScopedPDU;
    private int msgFlags;
    private MessageID msgID;
    private PduHandle pduHandle;
    private long responseRuntimeNanos;
    protected List<MessageID> retryMsgIDs;
    private byte[] securityEngineID;
    private int securityLevel;
    private SecurityModel securityModel;
    private byte[] securityName;
    private SecurityStateReference securityStateReference;
    private transient TransportMapping<? super A> transportMapping;

    public StateReference() {
        this.errorCode = 0;
    }

    public static MessageID createMessageID(int i10) {
        return SNMP4JSettings.getSnmp4jStatistics() == SNMP4JSettings.Snmp4jStatistics.extended ? new TimedMessageID(i10) : new SimpleMessageID(i10);
    }

    public synchronized void addMessageIDs(List<MessageID> list) {
        try {
            if (this.retryMsgIDs == null) {
                this.retryMsgIDs = new ArrayList(list.size());
            }
            this.retryMsgIDs.addAll(list);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public boolean equals(Object obj) {
        List<MessageID> list;
        if (!(obj instanceof StateReference)) {
            return false;
        }
        StateReference<?> stateReference = (StateReference) obj;
        return (isMatchingMessageID(stateReference.msgID) || ((list = stateReference.retryMsgIDs) != null && list.contains(this.msgID))) && equalsExceptMsgID(stateReference);
    }

    public boolean equalsExceptMsgID(StateReference<?> stateReference) {
        PduHandle pduHandle = this.pduHandle;
        return (pduHandle == null && stateReference.pduHandle == null) || (pduHandle != null && pduHandle.equals(stateReference.getPduHandle()) && Arrays.equals(this.securityEngineID, stateReference.securityEngineID) && this.securityModel.equals(stateReference.securityModel) && Arrays.equals(this.securityName, stateReference.securityName) && this.securityLevel == stateReference.securityLevel && Arrays.equals(this.contextEngineID, stateReference.contextEngineID) && Arrays.equals(this.contextName, stateReference.contextName));
    }

    public A getAddress() {
        return this.address;
    }

    public byte[] getContextEngineID() {
        return this.contextEngineID;
    }

    public byte[] getContextName() {
        return this.contextName;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public int getMaxSizeResponseScopedPDU() {
        return this.maxSizeResponseScopedPDU;
    }

    public synchronized List<MessageID> getMessageIDs() {
        ArrayList arrayList;
        try {
            List<MessageID> list = this.retryMsgIDs;
            arrayList = new ArrayList(1 + (list != null ? list.size() : 0));
            arrayList.add(this.msgID);
            List<MessageID> list2 = this.retryMsgIDs;
            if (list2 != null) {
                arrayList.addAll(list2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public int getMsgFlags() {
        return this.msgFlags;
    }

    public MessageID getMsgID() {
        return this.msgID;
    }

    public PduHandle getPduHandle() {
        return this.pduHandle;
    }

    public byte[] getSecurityEngineID() {
        return this.securityEngineID;
    }

    public int getSecurityLevel() {
        return this.securityLevel;
    }

    public SecurityModel getSecurityModel() {
        return this.securityModel;
    }

    public byte[] getSecurityName() {
        return this.securityName;
    }

    public SecurityStateReference getSecurityStateReference() {
        return this.securityStateReference;
    }

    public TransportMapping<? super A> getTransportMapping() {
        return this.transportMapping;
    }

    public int hashCode() {
        return this.msgID.getID();
    }

    protected boolean isMatchingMessageID(MessageID messageID) {
        return isMatchingMessageID(messageID.getID());
    }

    public boolean isReportable() {
        return (this.msgFlags & 4) > 0;
    }

    public void setAddress(A a10) {
        this.address = a10;
    }

    public void setContextEngineID(byte[] bArr) {
        this.contextEngineID = bArr;
    }

    public void setContextName(byte[] bArr) {
        this.contextName = bArr;
    }

    public void setErrorCode(int i10) {
        this.errorCode = i10;
    }

    public void setMaxSizeResponseScopedPDU(int i10) {
        this.maxSizeResponseScopedPDU = i10;
    }

    public void setMsgFlags(int i10) {
        this.msgFlags = i10;
    }

    public void setMsgID(MessageID messageID) {
        this.msgID = messageID;
    }

    public void setPduHandle(PduHandle pduHandle) {
        this.pduHandle = pduHandle;
        updateRequestStatisticsPduHandle(pduHandle);
    }

    public void setSecurityEngineID(byte[] bArr) {
        this.securityEngineID = bArr;
    }

    public void setSecurityLevel(int i10) {
        this.securityLevel = i10;
    }

    public void setSecurityModel(SecurityModel securityModel) {
        this.securityModel = securityModel;
    }

    public void setSecurityName(byte[] bArr) {
        this.securityName = bArr;
    }

    public void setSecurityStateReference(SecurityStateReference securityStateReference) {
        this.securityStateReference = securityStateReference;
    }

    public void setTransportMapping(TransportMapping<? super A> transportMapping) {
        this.transportMapping = transportMapping;
    }

    public String toString() {
        return "StateReference[msgID=" + this.msgID + ",pduHandle=" + this.pduHandle + ",securityEngineID=" + OctetString.fromByteArray(this.securityEngineID) + ",securityModel=" + this.securityModel + ",securityName=" + OctetString.fromByteArray(this.securityName) + ",securityLevel=" + this.securityLevel + ",contextEngineID=" + OctetString.fromByteArray(this.contextEngineID) + ",contextName=" + OctetString.fromByteArray(this.contextName) + ",retryMsgIDs=" + this.retryMsgIDs + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void updateRequestStatisticsPduHandle(PduHandle pduHandle) {
        if (pduHandle instanceof RequestStatistics) {
            RequestStatistics requestStatistics = (RequestStatistics) pduHandle;
            List<MessageID> list = this.retryMsgIDs;
            int i10 = 1;
            requestStatistics.setTotalMessagesSent((list != null ? list.size() : 0) + 1);
            requestStatistics.setResponseRuntimeNanos(this.responseRuntimeNanos);
            if (this.msgID.getID() == this.matchedMsgID) {
                requestStatistics.setIndexOfMessageResponded(0);
                return;
            }
            List<MessageID> list2 = this.retryMsgIDs;
            if (list2 != null) {
                Iterator<MessageID> it = list2.iterator();
                while (it.hasNext()) {
                    if (it.next().getID() == this.matchedMsgID) {
                        requestStatistics.setIndexOfMessageResponded(i10);
                        return;
                    }
                    i10++;
                }
            }
        }
    }

    public boolean isMatchingMessageID(int i10) {
        if (this.msgID.getID() == i10) {
            this.matchedMsgID = i10;
            if (this.msgID instanceof TimedMessageID) {
                this.responseRuntimeNanos = System.nanoTime() - ((TimedMessageID) this.msgID).getCreationNanoTime();
            }
        } else {
            List<MessageID> list = this.retryMsgIDs;
            if (list != null) {
                Iterator<MessageID> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (it.next().getID() == i10) {
                        this.matchedMsgID = i10;
                        if (this.msgID instanceof TimedMessageID) {
                            this.responseRuntimeNanos = System.nanoTime() - ((TimedMessageID) this.msgID).getCreationNanoTime();
                        }
                    }
                }
            }
        }
        updateRequestStatisticsPduHandle(this.pduHandle);
        return this.matchedMsgID == i10;
    }

    public void setMsgID(int i10) {
        this.msgID = createMessageID(i10);
    }

    public StateReference(PduHandle pduHandle, A a10, TransportMapping<? super A> transportMapping, SecurityModel securityModel, byte[] bArr, int i10) {
        this(0, 0, 65535, pduHandle, a10, transportMapping, null, securityModel, bArr, 1, null, null, null, i10);
    }

    public StateReference(int i10, int i11, int i12, PduHandle pduHandle, A a10, TransportMapping<? super A> transportMapping, byte[] bArr, SecurityModel securityModel, byte[] bArr2, int i13, byte[] bArr3, byte[] bArr4, SecurityStateReference securityStateReference, int i14) {
        this.errorCode = 0;
        this.msgID = createMessageID(i10);
        this.msgFlags = i11;
        this.maxSizeResponseScopedPDU = i12;
        this.pduHandle = pduHandle;
        this.address = a10;
        this.transportMapping = transportMapping;
        this.securityEngineID = bArr;
        this.securityModel = securityModel;
        this.securityName = bArr2;
        this.securityLevel = i13;
        this.contextEngineID = bArr3;
        this.contextName = bArr4;
        this.securityStateReference = securityStateReference;
        this.errorCode = i14;
    }
}
