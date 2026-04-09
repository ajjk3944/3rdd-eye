package org.snmp4j.mp;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.WeakHashMap;
import org.snmp4j.MessageDispatcher;
import org.snmp4j.MessageException;
import org.snmp4j.PDU;
import org.snmp4j.SNMP4JSettings;
import org.snmp4j.ScopedPDU;
import org.snmp4j.Target;
import org.snmp4j.asn1.BER;
import org.snmp4j.asn1.BERInputStream;
import org.snmp4j.asn1.BERSerializable;
import org.snmp4j.event.CounterEvent;
import org.snmp4j.event.SnmpEngineEvent;
import org.snmp4j.event.SnmpEngineListener;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.security.AuthenticationProtocol;
import org.snmp4j.security.PrivacyProtocol;
import org.snmp4j.security.SecurityModel;
import org.snmp4j.security.SecurityModels;
import org.snmp4j.security.SecurityProtocols;
import org.snmp4j.security.SecurityStateReference;
import org.snmp4j.security.USM;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.util.PDUFactory;

/* loaded from: classes2.dex */
public class MPv3 implements MessageProcessingModel, EngineIdCacheSize {
    public static final int ID = 3;
    private static final int INT_LOW_16BIT_MASK = 65535;
    public static final OctetString LOCAL_ENGINE_ID = OctetString.fromHexString("80:00:00:00:06");
    public static final int MAXLEN_ENGINE_ID = 32;
    private static final int MAX_HEADER_LENGTH;
    private static final int MAX_HEADER_PAYLOAD_LENGTH;
    public static final int MAX_MESSAGE_ID = Integer.MAX_VALUE;
    public static final int MINLEN_ENGINE_ID = 5;
    public static final int MPv3_REPORTABLE_FLAG = 4;
    private static final LogAdapter logger;
    private Cache cache;
    private CounterSupport counterSupport;
    private int currentMsgID;
    private Map<Address, OctetString> engineIDs;
    protected EngineIdCacheFactory engineIdCacheFactory;
    protected PDUFactory incomingPDUFactory;
    private byte[] localEngineID;
    private int maxEngineIdCacheSize;
    private SecurityModels securityModels;
    private SecurityProtocols securityProtocols;
    transient List<SnmpEngineListener> snmpEngineListeners;

    protected static class Cache {
        private Map<PduHandle, StateReference<?>> entries = new WeakHashMap(25);
        private Map<MessageID, WeakReference<PduHandle>> msgIdToPduHandleMapping = new WeakHashMap(25);

        protected Cache() {
        }

        public synchronized int addEntry(StateReference<?> stateReference) {
            try {
                if (MPv3.logger.isDebugEnabled()) {
                    MPv3.logger.debug("Adding cache entry: " + stateReference);
                }
                StateReference<?> stateReference2 = this.entries.get(stateReference.getPduHandle());
                if (stateReference2 != null) {
                    stateReference2.setPduHandle(stateReference.getPduHandle());
                    if (stateReference2.equals(stateReference)) {
                        if (MPv3.logger.isDebugEnabled()) {
                            MPv3.logger.debug("Doubled message: " + stateReference);
                        }
                        stateReference2.setPduHandle(null);
                        return SnmpConstants.SNMP_MP_DOUBLED_MESSAGE;
                    }
                    if (stateReference2.equalsExceptMsgID(stateReference)) {
                        if (MPv3.logger.isDebugEnabled()) {
                            MPv3.logger.debug("Adding previous message IDs " + stateReference2.getMessageIDs() + " to new entry " + stateReference);
                        }
                        stateReference.addMessageIDs(stateReference2.getMessageIDs());
                    } else if (MPv3.logger.isDebugEnabled()) {
                        MPv3.logger.debug("New entry does not match existing, although request ID is the same " + stateReference + " != " + stateReference2);
                    }
                    stateReference2.setPduHandle(null);
                }
                PduHandle pduHandle = stateReference.getPduHandle();
                stateReference.setPduHandle(null);
                this.entries.put(pduHandle, stateReference);
                WeakReference<PduHandle> weakReference = new WeakReference<>(pduHandle);
                this.msgIdToPduHandleMapping.put(stateReference.getMsgID(), weakReference);
                if (stateReference.getMessageIDs() != null) {
                    Iterator<MessageID> it = stateReference.getMessageIDs().iterator();
                    while (it.hasNext()) {
                        this.msgIdToPduHandleMapping.put(it.next(), weakReference);
                    }
                }
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized boolean deleteEntry(PduHandle pduHandle) {
            StateReference<?> stateReferenceRemove;
            try {
                stateReferenceRemove = this.entries.remove(pduHandle);
                if (stateReferenceRemove != null) {
                    this.msgIdToPduHandleMapping.remove(stateReferenceRemove.getMsgID());
                    if (stateReferenceRemove.getMessageIDs() != null) {
                        Iterator<MessageID> it = stateReferenceRemove.getMessageIDs().iterator();
                        while (it.hasNext()) {
                            this.msgIdToPduHandleMapping.remove(it.next());
                        }
                    }
                    if (MPv3.logger.isDebugEnabled()) {
                        MPv3.logger.debug("Removed cache entry: " + stateReferenceRemove);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return stateReferenceRemove != null;
        }

        public synchronized StateReference<?> popEntry(MessageID messageID) {
            PduHandle pduHandle;
            StateReference<?> stateReference;
            WeakReference<PduHandle> weakReference = this.msgIdToPduHandleMapping.get(messageID);
            if (weakReference == null || (pduHandle = weakReference.get()) == null || (stateReference = this.entries.get(pduHandle)) == null || !stateReference.isMatchingMessageID(messageID)) {
                return null;
            }
            deleteEntry(pduHandle);
            this.entries.remove(pduHandle);
            stateReference.setPduHandle(pduHandle);
            return stateReference;
        }
    }

    protected static class CacheEntry<A extends Address> extends StateReference<A> {
        private static final long serialVersionUID = 8698046643337640719L;
        byte[] contextEngineID;
        byte[] contextName;
        int errorCode;
        int msgID;
        byte[] secEngineID;
        int secLevel;
        SecurityModel secModel;
        byte[] secName;
        SecurityStateReference secStateReference;
        long transactionID;

        public CacheEntry(int i10, long j10, byte[] bArr, SecurityModel securityModel, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4, SecurityStateReference securityStateReference, int i12) {
            this.msgID = i10;
            this.transactionID = j10;
            this.secEngineID = bArr;
            this.secModel = securityModel;
            this.secName = bArr2;
            this.secLevel = i11;
            this.contextEngineID = bArr3;
            this.contextName = bArr4;
            this.secStateReference = securityStateReference;
            this.errorCode = i12;
        }
    }

    public interface EngineIdCacheFactory {
        Map<Address, OctetString> createEngineIdMap(EngineIdCacheSize engineIdCacheSize);
    }

    public static class HeaderData implements BERSerializable {
        public static final byte FLAG_AUTH = 1;
        public static final byte FLAG_PRIV = 2;
        Integer32 msgID = new Integer32(0);
        Integer32 msgMaxSize = new Integer32(MPv3.MAX_MESSAGE_ID);
        OctetString msgFlags = new OctetString(new byte[1]);
        Integer32 securityModel = new Integer32(0);

        @Override // org.snmp4j.asn1.BERSerializable
        public void decodeBER(BERInputStream bERInputStream) throws IOException {
            BER.MutableByte mutableByte = new BER.MutableByte();
            int iDecodeHeader = BER.decodeHeader(bERInputStream, mutableByte);
            if (mutableByte.getValue() != 48) {
                throw new IOException("Unexpected sequence header type: " + ((int) mutableByte.getValue()));
            }
            long position = bERInputStream.getPosition();
            this.msgID.decodeBER(bERInputStream);
            this.msgMaxSize.decodeBER(bERInputStream);
            if (this.msgMaxSize.getValue() < 484) {
                throw new IOException("Invalid msgMaxSize: " + this.msgMaxSize);
            }
            this.msgFlags.decodeBER(bERInputStream);
            if (this.msgFlags.length() != 1) {
                throw new IOException("Message flags length != 1: " + this.msgFlags.length());
            }
            this.securityModel.decodeBER(bERInputStream);
            if (MPv3.logger.isDebugEnabled()) {
                MPv3.logger.debug("SNMPv3 header decoded: msgId=" + this.msgID + ", msgMaxSize=" + this.msgMaxSize + ", msgFlags=" + this.msgFlags.toHexString() + ", secModel=" + this.securityModel);
            }
            BER.checkSequenceLength(iDecodeHeader, (int) (bERInputStream.getPosition() - position), this);
        }

        @Override // org.snmp4j.asn1.BERSerializable
        public void encodeBER(OutputStream outputStream) throws IOException {
            BER.encodeHeader(outputStream, 48, getBERPayloadLength());
            this.msgID.encodeBER(outputStream);
            this.msgMaxSize.encodeBER(outputStream);
            this.msgFlags.encodeBER(outputStream);
            this.securityModel.encodeBER(outputStream);
        }

        @Override // org.snmp4j.asn1.BERSerializable
        public int getBERLength() {
            int bERPayloadLength = getBERPayloadLength();
            return bERPayloadLength + BER.getBERLengthOfLength(bERPayloadLength) + 1;
        }

        @Override // org.snmp4j.asn1.BERSerializable
        public int getBERPayloadLength() {
            return this.msgID.getBERLength() + this.msgMaxSize.getBERLength() + this.msgFlags.getBERLength() + this.securityModel.getBERLength();
        }

        public int getMsgFlags() {
            return this.msgFlags.getValue()[0] & 255;
        }

        public int getMsgID() {
            return this.msgID.getValue();
        }

        public int getMsgMaxSize() {
            return this.msgMaxSize.getValue();
        }

        public int getSecurityModel() {
            return this.securityModel.getValue();
        }

        public void setMsgFlags(int i10) {
            this.msgFlags.getValue()[0] = (byte) i10;
        }

        public void setMsgID(int i10) {
            this.msgID.setValue(i10);
        }

        public void setMsgMaxSize(int i10) {
            this.msgMaxSize.setValue(i10);
        }

        public void setSecurityModel(int i10) {
            this.securityModel.setValue(i10);
        }
    }

    private static class LimitedCapacityEngineIdCacheFactory implements EngineIdCacheFactory {
        private LimitedCapacityEngineIdCacheFactory() {
        }

        @Override // org.snmp4j.mp.MPv3.EngineIdCacheFactory
        public Map<Address, OctetString> createEngineIdMap(EngineIdCacheSize engineIdCacheSize) {
            return Collections.synchronizedMap(new HashMap());
        }
    }

    static {
        int bERLength = new OctetString("\u0000").getBERLength() + (new Integer32(MAX_MESSAGE_ID).getBERLength() * 3);
        MAX_HEADER_PAYLOAD_LENGTH = bERLength;
        MAX_HEADER_LENGTH = bERLength + BER.getBERLengthOfLength(bERLength) + 1;
        logger = LogFactory.getLogger(MPv3.class);
    }

    public MPv3() {
        this(createLocalEngineID(), null);
    }

    public static byte[] createLocalEngineID() {
        int enterpriseID = SNMP4JSettings.getEnterpriseID();
        byte[] bArr = {(byte) (((enterpriseID >> 24) & 255) | 128), (byte) ((enterpriseID >> 16) & 255), (byte) ((enterpriseID >> 8) & 255), (byte) (enterpriseID & 255), 2};
        OctetString octetString = new OctetString();
        try {
            byte[] address = InetAddress.getLocalHost().getAddress();
            if (address.length == 4) {
                bArr[4] = 1;
            }
            octetString.setValue(address);
        } catch (UnknownHostException unused) {
            logger.debug("Local host cannot be determined for creation of local engine ID");
            bArr[4] = 4;
            octetString.setValue("SNMP4J".getBytes());
        }
        OctetString octetString2 = new OctetString(bArr);
        byte[] bArr2 = new byte[4];
        new Random(System.nanoTime()).nextBytes(bArr2);
        octetString2.append(octetString);
        octetString2.append(bArr2);
        return octetString2.getValue();
    }

    public static int randomMsgID(int i10) {
        return ((i10 & INT_LOW_16BIT_MASK) << 16) | (new Random().nextInt(MAX_MESSAGE_ID) & INT_LOW_16BIT_MASK);
    }

    public boolean addEngineID(Address address, OctetString octetString) {
        if (!Arrays.equals(this.localEngineID, octetString.getValue())) {
            try {
                OctetString octetStringAddEngineIdToCache = addEngineIdToCache(address, octetString);
                if (this.snmpEngineListeners != null && (octetStringAddEngineIdToCache == null || !octetStringAddEngineIdToCache.equals(octetString))) {
                    fireEngineChanged(new SnmpEngineEvent(this, 1, octetString, address));
                }
                return true;
            } catch (IllegalArgumentException unused) {
                fireEngineChanged(new SnmpEngineEvent(this, 3, octetString, address));
            }
        }
        return false;
    }

    protected OctetString addEngineIdToCache(Address address, OctetString octetString) {
        if (this.maxEngineIdCacheSize <= 0 || this.engineIDs.size() < this.maxEngineIdCacheSize) {
            return this.engineIDs.put(address, octetString);
        }
        if (this.engineIDs.containsKey(address)) {
            return this.engineIDs.put(address, octetString);
        }
        String str = "MPv3: Failed to add engineID '" + octetString.toHexString() + "' for address '" + address + "' to local cache because its size limit of " + this.maxEngineIdCacheSize + "has been reached";
        logger.warn(str);
        throw new IllegalArgumentException(str);
    }

    public synchronized void addSnmpEngineListener(SnmpEngineListener snmpEngineListener) {
        try {
            ArrayList arrayList = this.snmpEngineListeners == null ? new ArrayList() : new ArrayList(this.snmpEngineListeners);
            arrayList.add(snmpEngineListener);
            this.snmpEngineListeners = arrayList;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Deprecated
    public PDU createPDU(Target target) {
        return this.incomingPDUFactory.createPDU(target);
    }

    protected void fireEngineChanged(SnmpEngineEvent snmpEngineEvent) {
        List<SnmpEngineListener> list = this.snmpEngineListeners;
        if (list != null) {
            Iterator<SnmpEngineListener> it = list.iterator();
            while (it.hasNext()) {
                it.next().engineChanged(snmpEngineEvent);
            }
        }
    }

    protected void fireIncrementCounter(CounterEvent counterEvent) {
        CounterSupport counterSupport = this.counterSupport;
        if (counterSupport != null) {
            counterSupport.fireIncrementCounter(counterEvent);
        }
    }

    public AuthenticationProtocol getAuthProtocol(OID oid) {
        return this.securityProtocols.getAuthenticationProtocol(oid);
    }

    public CounterSupport getCounterSupport() {
        return this.counterSupport;
    }

    public OctetString getEngineID(Address address) {
        return this.engineIDs.get(address);
    }

    public EngineIdCacheFactory getEngineIdCacheFactory() {
        return this.engineIdCacheFactory;
    }

    public int getEngineIdCacheSize() {
        return this.engineIDs.size();
    }

    @Override // org.snmp4j.mp.MessageProcessingModel
    public int getID() {
        return 3;
    }

    public byte[] getLocalEngineID() {
        byte[] bArr = this.localEngineID;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    @Override // org.snmp4j.mp.EngineIdCacheSize
    public int getMaxEngineIdCacheSize() {
        return this.maxEngineIdCacheSize;
    }

    public synchronized int getNextMessageID() {
        int i10;
        try {
            if (this.currentMsgID >= Integer.MAX_VALUE) {
                this.currentMsgID = 1;
            }
            i10 = this.currentMsgID;
            this.currentMsgID = i10 + 1;
        } catch (Throwable th2) {
            throw th2;
        }
        return i10;
    }

    public int getNextMsgID() {
        return this.currentMsgID;
    }

    public PrivacyProtocol getPrivProtocol(OID oid) {
        return this.securityProtocols.getPrivacyProtocol(oid);
    }

    public SecurityModel getSecurityModel(int i10) {
        return this.securityModels.getSecurityModel(new Integer32(i10));
    }

    public SecurityModels getSecurityModels() {
        return this.securityModels;
    }

    public SecurityProtocols getSecurityProtocols() {
        return this.securityProtocols;
    }

    public void initDefaults() {
        this.securityProtocols.addDefaultProtocols();
    }

    @Override // org.snmp4j.mp.MessageProcessingModel
    public boolean isProtocolVersionSupported(int i10) {
        return i10 == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x03a2  */
    @Override // org.snmp4j.mp.MessageProcessingModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int prepareDataElements(org.snmp4j.MessageDispatcher r30, org.snmp4j.smi.Address r31, org.snmp4j.asn1.BERInputStream r32, org.snmp4j.TransportStateReference r33, org.snmp4j.smi.Integer32 r34, org.snmp4j.smi.Integer32 r35, org.snmp4j.smi.OctetString r36, org.snmp4j.smi.Integer32 r37, org.snmp4j.MutablePDU r38, org.snmp4j.mp.PduHandle r39, org.snmp4j.smi.Integer32 r40, org.snmp4j.mp.StatusInformation r41, org.snmp4j.mp.MutableStateReference r42) {
        /*
            Method dump skipped, instructions count: 1416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.snmp4j.mp.MPv3.prepareDataElements(org.snmp4j.MessageDispatcher, org.snmp4j.smi.Address, org.snmp4j.asn1.BERInputStream, org.snmp4j.TransportStateReference, org.snmp4j.smi.Integer32, org.snmp4j.smi.Integer32, org.snmp4j.smi.OctetString, org.snmp4j.smi.Integer32, org.snmp4j.MutablePDU, org.snmp4j.mp.PduHandle, org.snmp4j.smi.Integer32, org.snmp4j.mp.StatusInformation, org.snmp4j.mp.MutableStateReference):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0135 A[PHI: r4
  0x0135: PHI (r4v9 int) = (r4v2 int), (r4v10 int) binds: [B:56:0x012f, B:58:0x0132] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0141  */
    @Override // org.snmp4j.mp.MessageProcessingModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int prepareOutgoingMessage(org.snmp4j.smi.Address r23, int r24, int r25, int r26, byte[] r27, int r28, org.snmp4j.PDU r29, boolean r30, org.snmp4j.mp.PduHandle r31, org.snmp4j.smi.Address r32, org.snmp4j.asn1.BEROutputStream r33, org.snmp4j.TransportStateReference r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.snmp4j.mp.MPv3.prepareOutgoingMessage(org.snmp4j.smi.Address, int, int, int, byte[], int, org.snmp4j.PDU, boolean, org.snmp4j.mp.PduHandle, org.snmp4j.smi.Address, org.snmp4j.asn1.BEROutputStream, org.snmp4j.TransportStateReference):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063 A[PHI: r6
  0x0063: PHI (r6v5 int) = (r6v0 int), (r6v6 int) binds: [B:13:0x005d, B:15:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // org.snmp4j.mp.MessageProcessingModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int prepareResponseMessage(int r14, int r15, int r16, byte[] r17, int r18, org.snmp4j.PDU r19, int r20, org.snmp4j.mp.StateReference r21, org.snmp4j.mp.StatusInformation r22, org.snmp4j.asn1.BEROutputStream r23) throws java.io.IOException {
        /*
            r13 = this;
            r0 = r13
            r5 = r16
            r8 = r18
            r1 = r19
            org.snmp4j.mp.MPv3$Cache r2 = r0.cache
            org.snmp4j.mp.MessageID r3 = r21.getMsgID()
            org.snmp4j.mp.StateReference r2 = r2.popEntry(r3)
            if (r2 != 0) goto L16
            r1 = -1409(0xfffffffffffffa7f, float:NaN)
            return r1
        L16:
            int r3 = r19.getBERLength()
            r4 = 0
            r6 = 1
            r7 = r20
            if (r3 <= r7) goto L49
            org.snmp4j.ScopedPDU r3 = new org.snmp4j.ScopedPDU
            r7 = r1
            org.snmp4j.ScopedPDU r7 = (org.snmp4j.ScopedPDU) r7
            r3.<init>(r7)
            r3.clear()
            org.snmp4j.smi.Integer32 r7 = r19.getRequestID()
            r3.setRequestID(r7)
            r3.setErrorStatus(r6)
            r3.setErrorIndex(r4)
            int r7 = r3.getBERLength()
            org.snmp4j.asn1.BEROutputStream r9 = new org.snmp4j.asn1.BEROutputStream
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r7)
            r9.<init>(r7)
            r3.encodeBER(r9)
            goto L55
        L49:
            org.snmp4j.asn1.BEROutputStream r9 = new org.snmp4j.asn1.BEROutputStream
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)
            r9.<init>(r3)
            r1.encodeBER(r9)
        L55:
            org.snmp4j.mp.MPv3$HeaderData r3 = new org.snmp4j.mp.MPv3$HeaderData
            r3.<init>()
            if (r8 == r6) goto L64
            r7 = 2
            if (r8 == r7) goto L63
            r6 = 3
            if (r8 == r6) goto L63
            goto L64
        L63:
            r4 = r6
        L64:
            r3.setMsgFlags(r4)
            org.snmp4j.mp.MessageID r4 = r21.getMsgID()
            int r4 = r4.getID()
            r3.setMsgID(r4)
            r4 = r15
            r3.setMsgMaxSize(r15)
            r3.setSecurityModel(r5)
            int r6 = r3.getBERLength()
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r6)
            org.snmp4j.asn1.BEROutputStream r7 = new org.snmp4j.asn1.BEROutputStream
            r7.<init>(r6)
            r3.encodeBER(r7)
            int r1 = r19.getType()
            r3 = -94
            if (r1 == r3) goto La7
            r3 = -92
            if (r1 == r3) goto La7
            r3 = -89
            if (r1 == r3) goto La7
            r3 = -88
            if (r1 == r3) goto La7
            org.snmp4j.smi.OctetString r1 = new org.snmp4j.smi.OctetString
            byte[] r3 = r2.getSecurityEngineID()
            r1.<init>(r3)
            goto Lae
        La7:
            org.snmp4j.smi.OctetString r1 = new org.snmp4j.smi.OctetString
            byte[] r3 = r0.localEngineID
            r1.<init>(r3)
        Lae:
            org.snmp4j.asn1.BERInputStream r10 = new org.snmp4j.asn1.BERInputStream
            java.nio.ByteBuffer r3 = r9.rewind()
            r10.<init>(r3)
            org.snmp4j.security.SecurityModels r3 = r0.securityModels
            org.snmp4j.smi.Integer32 r7 = new org.snmp4j.smi.Integer32
            r7.<init>(r5)
            org.snmp4j.security.SecurityModel r3 = r3.getSecurityModel(r7)
            org.snmp4j.security.SecurityParameters r11 = r3.newSecurityParametersInstance()
            int r7 = r13.getID()
            byte[] r6 = r6.array()
            byte[] r9 = r1.getValue()
            org.snmp4j.security.SecurityStateReference r12 = r2.getSecurityStateReference()
            r1 = r3
            r2 = r7
            r3 = r6
            r4 = r15
            r5 = r16
            r6 = r9
            r7 = r17
            r8 = r18
            r9 = r10
            r10 = r12
            r12 = r23
            int r1 = r1.generateResponseMessage(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.snmp4j.mp.MPv3.prepareResponseMessage(int, int, int, byte[], int, org.snmp4j.PDU, int, org.snmp4j.mp.StateReference, org.snmp4j.mp.StatusInformation, org.snmp4j.asn1.BEROutputStream):int");
    }

    @Override // org.snmp4j.mp.MessageProcessingModel
    public void releaseStateReference(PduHandle pduHandle) {
        this.cache.deleteEntry(pduHandle);
    }

    public OctetString removeEngineID(Address address) {
        OctetString octetStringRemove = this.engineIDs.remove(address);
        if (octetStringRemove != null && this.snmpEngineListeners != null) {
            fireEngineChanged(new SnmpEngineEvent(this, 2, octetStringRemove, address));
        }
        return octetStringRemove;
    }

    public synchronized void removeSnmpEngineListener(SnmpEngineListener snmpEngineListener) {
        List<SnmpEngineListener> list = this.snmpEngineListeners;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list);
            arrayList.remove(snmpEngineListener);
            this.snmpEngineListeners = arrayList;
        }
    }

    public int sendReport(MessageDispatcher messageDispatcher, ScopedPDU scopedPDU, int i10, int i11, OctetString octetString, int i12, StateReference<?> stateReference, VariableBinding variableBinding) {
        ScopedPDU scopedPDU2 = new ScopedPDU();
        scopedPDU2.setType(-88);
        if (scopedPDU != null) {
            scopedPDU2.setContextEngineID(scopedPDU.getContextEngineID());
            scopedPDU2.setContextName(scopedPDU.getContextName());
            scopedPDU2.setRequestID(scopedPDU.getRequestID());
        } else {
            scopedPDU2.setContextEngineID(new OctetString(getLocalEngineID()));
        }
        scopedPDU2.add(variableBinding);
        try {
            int iReturnResponsePdu = messageDispatcher.returnResponsePdu(getID(), i11, octetString.getValue(), i10, scopedPDU2, i12, stateReference, new StatusInformation());
            if (iReturnResponsePdu == 0) {
                return 0;
            }
            logger.warn("Error while sending report: " + iReturnResponsePdu);
            return SnmpConstants.SNMP_MP_ERROR;
        } catch (MessageException e10) {
            logger.error("Error while sending report: " + e10.getMessage());
            return SnmpConstants.SNMP_MP_ERROR;
        }
    }

    public void setCounterSupport(CounterSupport counterSupport) {
        counterSupport.getClass();
        this.counterSupport = counterSupport;
    }

    public void setCurrentMsgID(int i10) {
        this.currentMsgID = i10;
    }

    public void setEngineIdCacheFactory(EngineIdCacheFactory engineIdCacheFactory) {
        this.engineIDs = engineIdCacheFactory.createEngineIdMap(this);
        this.engineIdCacheFactory = engineIdCacheFactory;
    }

    public void setLocalEngineID(byte[] bArr) {
        if (bArr == null || bArr.length < 5 || bArr.length > 32) {
            throw new IllegalArgumentException("Illegal (local) engine ID");
        }
        this.localEngineID = bArr;
    }

    public void setMaxEngineIdCacheSize(int i10) {
        this.maxEngineIdCacheSize = i10;
    }

    public void setSecurityModels(SecurityModels securityModels) {
        this.securityModels = securityModels;
    }

    public void setSecurityProtocols(SecurityProtocols securityProtocols) {
        this.securityProtocols = securityProtocols;
    }

    public MPv3(byte[] bArr) {
        this(bArr, null);
        setLocalEngineID(bArr);
    }

    public MPv3(byte[] bArr, PDUFactory pDUFactory) {
        this(bArr, pDUFactory, SecurityProtocols.getInstance(), SecurityModels.getInstance(), CounterSupport.getInstance());
    }

    public MPv3(USM usm) {
        this(usm.getLocalEngineID().getValue(), null, SecurityProtocols.getInstance(), SecurityModels.getCollection(new SecurityModel[]{usm}), CounterSupport.getInstance());
    }

    public MPv3(byte[] bArr, PDUFactory pDUFactory, SecurityProtocols securityProtocols, SecurityModels securityModels, CounterSupport counterSupport) {
        this.maxEngineIdCacheSize = SNMP4JSettings.getMaxEngineIdCacheSize();
        this.currentMsgID = new Random().nextInt(MAX_MESSAGE_ID);
        this.engineIdCacheFactory = new LimitedCapacityEngineIdCacheFactory();
        this.incomingPDUFactory = new PDUFactory() { // from class: org.snmp4j.mp.MPv3.1
            @Override // org.snmp4j.util.PDUFactory
            public PDU createPDU(Target target) {
                return new ScopedPDU();
            }

            @Override // org.snmp4j.util.PDUFactory
            public PDU createPDU(MessageProcessingModel messageProcessingModel) {
                return new ScopedPDU();
            }
        };
        if (pDUFactory != null) {
            this.incomingPDUFactory = pDUFactory;
        }
        this.engineIDs = this.engineIdCacheFactory.createEngineIdMap(this);
        this.cache = new Cache();
        securityProtocols.getClass();
        this.securityProtocols = securityProtocols;
        securityModels.getClass();
        this.securityModels = securityModels;
        counterSupport.getClass();
        this.counterSupport = counterSupport;
        setLocalEngineID(bArr);
        SecurityModel securityModel = securityModels.getSecurityModel(new Integer32(3));
        if (securityModel instanceof USM) {
            setCurrentMsgID(randomMsgID(((USM) securityModel).getEngineBoots()));
        }
    }

    public static byte[] createLocalEngineID(OctetString octetString) {
        int enterpriseID = SNMP4JSettings.getEnterpriseID();
        OctetString octetString2 = new OctetString(new byte[]{(byte) (((enterpriseID >> 24) & 255) | 128), (byte) ((enterpriseID >> 16) & 255), (byte) ((enterpriseID >> 8) & 255), (byte) (enterpriseID & 255), 4});
        octetString2.append(octetString);
        return octetString2.getValue();
    }
}
