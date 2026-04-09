package org.snmp4j.security;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Vector;
import org.snmp4j.SNMP4JSettings;
import org.snmp4j.TransportStateReference;
import org.snmp4j.asn1.BER;
import org.snmp4j.asn1.BERInputStream;
import org.snmp4j.asn1.BEROutputStream;
import org.snmp4j.event.CounterEvent;
import org.snmp4j.event.UsmUserEvent;
import org.snmp4j.event.UsmUserListener;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.mp.CounterSupport;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.mp.StatusInformation;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.VariableBinding;

/* loaded from: classes2.dex */
public class USM extends SNMPv3SecurityModel {
    private static final int MAXLEN_USMUSERNAME = 32;
    private static final LogAdapter logger = LogFactory.getLogger(USM.class);
    private CounterSupport counterSupport;
    private boolean engineDiscoveryEnabled;
    private SecurityProtocols securityProtocols;
    private UsmTimeTable timeTable;
    private UsmUserTable userTable;
    private transient Vector<UsmUserListener> usmUserListeners;

    public USM(SecurityProtocols securityProtocols, OctetString octetString, int i10) {
        this.engineDiscoveryEnabled = true;
        this.localEngineID = octetString;
        this.timeTable = new UsmTimeTable(octetString, i10);
        this.userTable = new UsmUserTable();
        this.securityProtocols = securityProtocols;
        this.counterSupport = CounterSupport.getInstance();
    }

    private OctetString getSecurityName(OctetString octetString, OctetString octetString2) {
        UsmUserEntry user;
        if (octetString2.length() == 0) {
            return octetString2;
        }
        UsmUserEntry user2 = this.userTable.getUser(octetString, octetString2);
        if (user2 != null) {
            return user2.getUsmUser().getSecurityName();
        }
        if (!isEngineDiscoveryEnabled() || (user = this.userTable.getUser(octetString2)) == null) {
            return null;
        }
        return user.getUsmUser().getSecurityName();
    }

    private static OctetString randomID() {
        byte[] bArr = new byte[8];
        new Random().nextBytes(bArr);
        return new OctetString(bArr);
    }

    public UsmUserEntry addLocalizedUser(byte[] bArr, OctetString octetString, OID oid, byte[] bArr2, OID oid2, byte[] bArr3) {
        UsmUserEntry usmUserEntry = new UsmUserEntry(bArr, octetString, oid, bArr2, oid2, bArr3);
        this.userTable.addUser(usmUserEntry);
        fireUsmUserChange(new UsmUserEvent(this, usmUserEntry, 1));
        return usmUserEntry;
    }

    public void addUser(OctetString octetString, UsmUser usmUser) {
        addUser(octetString, new OctetString(), usmUser);
    }

    public void addUsmUserEntry(UsmUserEntry usmUserEntry) {
        this.userTable.addUser(usmUserEntry);
        fireUsmUserChange(new UsmUserEvent(this, usmUserEntry, 1));
    }

    public synchronized void addUsmUserListener(UsmUserListener usmUserListener) {
        try {
            if (this.usmUserListeners == null) {
                this.usmUserListeners = new Vector<>(2);
            }
            if (!this.usmUserListeners.contains(usmUserListener)) {
                this.usmUserListeners.add(usmUserListener);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected void fireIncrementCounter(CounterEvent counterEvent) {
        this.counterSupport.fireIncrementCounter(counterEvent);
    }

    protected void fireUsmUserChange(UsmUserEvent usmUserEvent) {
        Vector<UsmUserListener> vector = this.usmUserListeners;
        if (vector != null) {
            Iterator<UsmUserListener> it = vector.iterator();
            while (it.hasNext()) {
                it.next().usmUserChange(usmUserEvent);
            }
        }
    }

    @Override // org.snmp4j.security.SecurityModel
    public int generateRequestMessage(int i10, byte[] bArr, int i11, int i12, byte[] bArr2, byte[] bArr3, int i13, BERInputStream bERInputStream, SecurityParameters securityParameters, BEROutputStream bEROutputStream, TransportStateReference transportStateReference) throws IOException {
        return generateResponseMessage(i10, bArr, i11, i12, bArr2, bArr3, i13, bERInputStream, null, securityParameters, bEROutputStream);
    }

    @Override // org.snmp4j.security.SecurityModel
    public int generateResponseMessage(int i10, byte[] bArr, int i11, int i12, byte[] bArr2, byte[] bArr3, int i13, BERInputStream bERInputStream, SecurityStateReference securityStateReference, SecurityParameters securityParameters, BEROutputStream bEROutputStream) throws IOException {
        UsmUserEntry user;
        byte[] bArrBuildWholeMessage;
        UsmSecurityParameters usmSecurityParameters = (UsmSecurityParameters) securityParameters;
        if (securityStateReference != null) {
            UsmSecurityStateReference usmSecurityStateReference = (UsmSecurityStateReference) securityStateReference;
            if (usmSecurityStateReference.getSecurityEngineID() == null) {
                usmSecurityParameters.setAuthoritativeEngineID(bArr2);
                usmSecurityStateReference.setSecurityEngineID(bArr2);
            }
            if (usmSecurityStateReference.getSecurityName() == null) {
                OctetString octetString = new OctetString(bArr3);
                usmSecurityStateReference.setSecurityName(octetString.getValue());
                usmSecurityParameters.setUserName(octetString);
                OctetString securityName = getSecurityName(new OctetString(bArr2), octetString);
                if (securityName != null && securityName.length() <= 32) {
                    usmSecurityParameters.setUserName(securityName);
                }
            } else {
                usmSecurityParameters.setUserName(new OctetString(usmSecurityStateReference.getSecurityName()));
            }
            usmSecurityParameters.setAuthenticationProtocol(usmSecurityStateReference.getAuthenticationProtocol());
            usmSecurityParameters.setPrivacyProtocol(usmSecurityStateReference.getPrivacyProtocol());
            usmSecurityParameters.setAuthenticationKey(usmSecurityStateReference.getAuthenticationKey());
            usmSecurityParameters.setPrivacyKey(usmSecurityStateReference.getPrivacyKey());
        } else {
            OctetString octetString2 = new OctetString();
            if (bArr2 != null) {
                octetString2.setValue(bArr2);
            }
            OctetString octetString3 = new OctetString(bArr3);
            if (octetString2.length() != 0) {
                user = getUser(octetString2, octetString3);
            } else {
                if (!isEngineDiscoveryEnabled()) {
                    LogAdapter logAdapter = logger;
                    if (!logAdapter.isDebugEnabled()) {
                        return SnmpConstants.SNMPv3_USM_UNKNOWN_ENGINEID;
                    }
                    logAdapter.debug("Engine ID unknown and discovery disabled");
                    return SnmpConstants.SNMPv3_USM_UNKNOWN_ENGINEID;
                }
                user = null;
                if (hasUser(null, octetString3)) {
                    user = new UsmUserEntry();
                }
            }
            if (user == null) {
                LogAdapter logAdapter2 = logger;
                if (!logAdapter2.isDebugEnabled()) {
                    return SnmpConstants.SNMPv3_USM_UNKNOWN_SECURITY_NAME;
                }
                logAdapter2.debug("Security name not found for engineID=" + octetString2.toHexString() + ", securityName=" + octetString3.toHexString());
                return SnmpConstants.SNMPv3_USM_UNKNOWN_SECURITY_NAME;
            }
            AuthenticationProtocol authenticationProtocol = this.securityProtocols.getAuthenticationProtocol(user.getUsmUser().getAuthenticationProtocol());
            PrivacyProtocol privacyProtocol = this.securityProtocols.getPrivacyProtocol(user.getUsmUser().getPrivacyProtocol());
            usmSecurityParameters.setAuthenticationProtocol(authenticationProtocol);
            usmSecurityParameters.setPrivacyProtocol(privacyProtocol);
            usmSecurityParameters.setAuthenticationKey(user.getAuthenticationKey());
            usmSecurityParameters.setPrivacyKey(user.getPrivacyKey());
            usmSecurityParameters.setUserName(user.getUsmUser().getSecurityName());
            usmSecurityParameters.setAuthoritativeEngineID(octetString2.getValue());
        }
        if (usmSecurityParameters.getAuthoritativeEngineID().length > 32) {
            logger.error("Engine ID too long: " + usmSecurityParameters.getAuthoritativeEngineID().length + ">32 for " + new OctetString(usmSecurityParameters.getAuthoritativeEngineID()).toHexString());
            return SnmpConstants.SNMPv3_USM_ENGINE_ID_TOO_LONG;
        }
        if (bArr3.length > 32) {
            logger.error("Security name too long: " + usmSecurityParameters.getAuthoritativeEngineID().length + ">32 for " + new OctetString(bArr3).toHexString());
            return SnmpConstants.SNMPv3_USM_SECURITY_NAME_TOO_LONG;
        }
        if (i13 >= 2) {
            if (securityStateReference != null) {
                usmSecurityParameters.setAuthoritativeEngineBoots(getEngineBoots());
                usmSecurityParameters.setAuthoritativeEngineTime(getEngineTime());
            } else {
                OctetString octetString4 = new OctetString(bArr2);
                UsmTimeEntry time = this.timeTable.getTime(octetString4);
                if (time == null) {
                    this.timeTable.addEntry(new UsmTimeEntry(octetString4, usmSecurityParameters.getAuthoritativeEngineBoots(), usmSecurityParameters.getAuthoritativeEngineTime()));
                } else {
                    usmSecurityParameters.setAuthoritativeEngineBoots(time.getEngineBoots());
                    usmSecurityParameters.setAuthoritativeEngineTime(time.getLatestReceivedTime());
                }
            }
        }
        if (i13 >= 2 && usmSecurityParameters.getAuthenticationProtocol() == null) {
            return SnmpConstants.SNMPv3_USM_UNSUPPORTED_SECURITY_LEVEL;
        }
        byte[] bArrBuildMessageBuffer = SNMPv3SecurityModel.buildMessageBuffer(bERInputStream);
        if (i13 != 3) {
            logger.debug("RFC3414 §3.1.4.b Outgoing message is not encrypted");
            usmSecurityParameters.setPrivacyParameters(new OctetString());
        } else {
            if (usmSecurityParameters.getPrivacyProtocol() == null) {
                LogAdapter logAdapter3 = logger;
                if (logAdapter3.isDebugEnabled()) {
                    logAdapter3.debug("Unsupported security level (missing or unsupported privacy protocol): Security params are " + usmSecurityParameters);
                }
                return SnmpConstants.SNMPv3_USM_UNSUPPORTED_SECURITY_LEVEL;
            }
            LogAdapter logAdapter4 = logger;
            logAdapter4.debug("RFC3414 §3.1.4.a Outgoing message needs to be encrypted");
            DecryptParams decryptParams = new DecryptParams();
            byte[] bArrEncrypt = usmSecurityParameters.getPrivacyProtocol().encrypt(bArrBuildMessageBuffer, 0, bArrBuildMessageBuffer.length, usmSecurityParameters.getPrivacyKey(), usmSecurityParameters.getAuthoritativeEngineBoots(), usmSecurityParameters.getAuthoritativeEngineTime(), decryptParams);
            if (bArrEncrypt == null) {
                if (!logAdapter4.isDebugEnabled()) {
                    return SnmpConstants.SNMPv3_USM_ENCRYPTION_ERROR;
                }
                logAdapter4.debug("Encryption error");
                return SnmpConstants.SNMPv3_USM_ENCRYPTION_ERROR;
            }
            usmSecurityParameters.setPrivacyParameters(new OctetString(decryptParams.array));
            OctetString octetString5 = new OctetString(bArrEncrypt);
            BEROutputStream bEROutputStream2 = new BEROutputStream(ByteBuffer.allocate(octetString5.getBERLength()));
            octetString5.encodeBER(bEROutputStream2);
            bArrBuildMessageBuffer = bEROutputStream2.getBuffer().array();
        }
        if (i13 >= 2) {
            AuthenticationProtocol authenticationProtocol2 = usmSecurityParameters.getAuthenticationProtocol();
            usmSecurityParameters.setAuthenticationParameters(new OctetString(new byte[authenticationProtocol2.getAuthenticationCodeLength()]));
            bArrBuildWholeMessage = SNMPv3SecurityModel.buildWholeMessage(new Integer32(i10), bArrBuildMessageBuffer, bArr, usmSecurityParameters);
            if (!usmSecurityParameters.getAuthenticationProtocol().authenticate(usmSecurityParameters.getAuthenticationKey(), bArrBuildWholeMessage, 0, bArrBuildWholeMessage.length, new ByteArrayWindow(bArrBuildWholeMessage, usmSecurityParameters.getAuthParametersPosition() + usmSecurityParameters.getSecurityParametersPosition(), authenticationProtocol2.getAuthenticationCodeLength()))) {
                LogAdapter logAdapter5 = logger;
                if (!logAdapter5.isDebugEnabled()) {
                    return SnmpConstants.SNMPv3_USM_AUTHENTICATION_ERROR;
                }
                logAdapter5.debug("Outgoing message could not be authenticated");
                return SnmpConstants.SNMPv3_USM_AUTHENTICATION_ERROR;
            }
        } else {
            usmSecurityParameters.setAuthoritativeEngineBoots(0);
            usmSecurityParameters.setAuthenticationParameters(new OctetString());
            usmSecurityParameters.setAuthoritativeEngineTime(0);
            bArrBuildWholeMessage = SNMPv3SecurityModel.buildWholeMessage(new Integer32(i10), bArrBuildMessageBuffer, bArr, usmSecurityParameters);
        }
        bEROutputStream.setBuffer((ByteBuffer) ByteBuffer.wrap(bArrBuildWholeMessage).position(bArrBuildWholeMessage.length));
        return 0;
    }

    public CounterSupport getCounterSupport() {
        return this.counterSupport;
    }

    public int getEngineBoots() {
        return this.timeTable.getEngineBoots();
    }

    public int getEngineTime() {
        return this.timeTable.getEngineTime();
    }

    @Override // org.snmp4j.security.SecurityModel
    public int getID() {
        return 3;
    }

    public SecurityProtocols getSecurityProtocols() {
        return this.securityProtocols;
    }

    public UsmTimeTable getTimeTable() {
        return this.timeTable;
    }

    public UsmUserEntry getUser(OctetString octetString, OctetString octetString2) {
        LogAdapter logAdapter = logger;
        if (logAdapter.isDebugEnabled()) {
            logAdapter.debug("getUser(engineID=" + octetString.toHexString() + ", securityName=" + octetString2.toString() + ")");
        }
        UsmUserEntry user = this.userTable.getUser(octetString, octetString2);
        if (user != null) {
            return user;
        }
        UsmUserEntry user2 = this.userTable.getUser(octetString2);
        if (user2 == null && octetString2.length() > 0) {
            if (logAdapter.isDebugEnabled()) {
                logAdapter.debug("USM.getUser - User '" + octetString2 + "' unknown");
            }
            return null;
        }
        if (user2 == null || octetString.length() == 0) {
            UsmUserEntry usmUserEntry = new UsmUserEntry();
            usmUserEntry.setUserName(octetString2);
            usmUserEntry.setUsmUser(new UsmUser(octetString2, null, null, null, null));
            return usmUserEntry;
        }
        OID authenticationProtocol = user2.getUsmUser().getAuthenticationProtocol();
        OID privacyProtocol = user2.getUsmUser().getPrivacyProtocol();
        if (authenticationProtocol != null) {
            return addLocalizedUser(octetString.getValue(), octetString2, authenticationProtocol, user2.getUsmUser().isLocalized() ? user2.getUsmUser().getAuthenticationPassphrase().getValue() : this.securityProtocols.passwordToKey(authenticationProtocol, user2.getUsmUser().getAuthenticationPassphrase(), octetString.getValue()), privacyProtocol, privacyProtocol != null ? user2.getUsmUser().isLocalized() ? user2.getUsmUser().getPrivacyPassphrase().getValue() : this.securityProtocols.passwordToKey(privacyProtocol, authenticationProtocol, user2.getUsmUser().getPrivacyPassphrase(), octetString.getValue()) : null);
        }
        return user2;
    }

    public UsmUserTable getUserTable() {
        return this.userTable;
    }

    @Override // org.snmp4j.security.SecurityModel
    public boolean hasAuthoritativeEngineID() {
        return true;
    }

    public boolean hasUser(OctetString octetString, OctetString octetString2) {
        return (this.userTable.getUser(octetString, octetString2) == null && this.userTable.getUser(octetString2) == null && octetString2.length() > 0) ? false : true;
    }

    public boolean isEngineDiscoveryEnabled() {
        return this.engineDiscoveryEnabled;
    }

    @Override // org.snmp4j.security.SecurityModel
    public SecurityParameters newSecurityParametersInstance() {
        return new UsmSecurityParameters();
    }

    @Override // org.snmp4j.security.SecurityModel
    public SecurityStateReference newSecurityStateReference() {
        return new UsmSecurityStateReference();
    }

    @Override // org.snmp4j.security.SecurityModel
    public int processIncomingMsg(int i10, int i11, SecurityParameters securityParameters, SecurityModel securityModel, int i12, BERInputStream bERInputStream, TransportStateReference transportStateReference, OctetString octetString, OctetString octetString2, BEROutputStream bEROutputStream, Integer32 integer32, SecurityStateReference securityStateReference, StatusInformation statusInformation) throws IOException {
        int i13;
        PrivacyProtocol privacyProtocol;
        int i14;
        UsmSecurityParameters usmSecurityParameters = (UsmSecurityParameters) securityParameters;
        UsmSecurityStateReference usmSecurityStateReference = (UsmSecurityStateReference) securityStateReference;
        octetString.setValue(usmSecurityParameters.getAuthoritativeEngineID());
        byte[] bArrBuildMessageBuffer = SNMPv3SecurityModel.buildMessageBuffer(bERInputStream);
        if (octetString.length() == 0 || this.timeTable.checkEngineID(octetString, isEngineDiscoveryEnabled(), usmSecurityParameters.getAuthoritativeEngineBoots(), usmSecurityParameters.getAuthoritativeEngineTime()) != 0) {
            LogAdapter logAdapter = logger;
            if (logAdapter.isDebugEnabled()) {
                logAdapter.debug("RFC3414 §3.2.3 Unknown engine ID: " + octetString.toHexString());
            }
            octetString.setValue(usmSecurityParameters.getAuthoritativeEngineID());
            octetString2.setValue(usmSecurityParameters.getUserName().getValue());
            if (statusInformation == null) {
                return SnmpConstants.SNMPv3_USM_UNKNOWN_ENGINEID;
            }
            CounterEvent counterEvent = new CounterEvent(this, SnmpConstants.usmStatsUnknownEngineIDs);
            fireIncrementCounter(counterEvent);
            statusInformation.setSecurityLevel(new Integer32(i12));
            statusInformation.setErrorIndication(new VariableBinding(counterEvent.getOid(), counterEvent.getCurrentValue()));
            return SnmpConstants.SNMPv3_USM_UNKNOWN_ENGINEID;
        }
        octetString2.setValue(usmSecurityParameters.getUserName().getValue());
        int scopedPduPosition = usmSecurityParameters.getScopedPduPosition();
        if (usmSecurityParameters.getUserName().length() <= 0 && i12 <= 1) {
            LogAdapter logAdapter2 = logger;
            if (logAdapter2.isDebugEnabled()) {
                logAdapter2.debug("Accepting zero length security name");
            }
            octetString2.setValue(new byte[0]);
        } else if (getSecurityName(octetString, usmSecurityParameters.getUserName()) == null) {
            LogAdapter logAdapter3 = logger;
            if (logAdapter3.isDebugEnabled()) {
                logAdapter3.debug("RFC3414 §3.2.4 Unknown security name: " + octetString2.toHexString() + " (" + octetString2 + ")");
            }
            if (statusInformation != null) {
                CounterEvent counterEvent2 = new CounterEvent(this, SnmpConstants.usmStatsUnknownUserNames);
                fireIncrementCounter(counterEvent2);
                statusInformation.setSecurityLevel(new Integer32(1));
                statusInformation.setErrorIndication(new VariableBinding(counterEvent2.getOid(), counterEvent2.getCurrentValue()));
            }
            return SnmpConstants.SNMPv3_USM_UNKNOWN_SECURITY_NAME;
        }
        if (usmSecurityParameters.getUserName().length() > 0 || i12 > 1) {
            UsmUserEntry user = getUser(octetString, octetString2);
            if (user == null) {
                LogAdapter logAdapter4 = logger;
                if (logAdapter4.isDebugEnabled()) {
                    logAdapter4.debug("RFC3414 §3.2.4 Unknown security name: " + octetString2.toHexString() + "( " + octetString2 + ") for engine ID " + octetString.toHexString());
                }
                CounterEvent counterEvent3 = new CounterEvent(this, SnmpConstants.usmStatsUnknownUserNames);
                fireIncrementCounter(counterEvent3);
                if (statusInformation != null) {
                    if (SNMP4JSettings.getReportSecurityLevelStrategy() == SNMP4JSettings.ReportSecurityLevelStrategy.noAuthNoPrivIfNeeded) {
                        statusInformation.setSecurityLevel(new Integer32(1));
                    }
                    statusInformation.setErrorIndication(new VariableBinding(counterEvent3.getOid(), counterEvent3.getCurrentValue()));
                }
                return SnmpConstants.SNMPv3_USM_UNKNOWN_SECURITY_NAME;
            }
            usmSecurityStateReference.setUserName(user.getUserName().getValue());
            AuthenticationProtocol authenticationProtocol = this.securityProtocols.getAuthenticationProtocol(user.getUsmUser().getAuthenticationProtocol());
            PrivacyProtocol privacyProtocol2 = this.securityProtocols.getPrivacyProtocol(user.getUsmUser().getPrivacyProtocol());
            usmSecurityStateReference.setAuthenticationKey(user.getAuthenticationKey());
            usmSecurityStateReference.setPrivacyKey(user.getPrivacyKey());
            usmSecurityStateReference.setAuthenticationProtocol(authenticationProtocol);
            usmSecurityStateReference.setPrivacyProtocol(privacyProtocol2);
            if ((i12 >= 2 && authenticationProtocol == null) || (i12 >= 3 && privacyProtocol2 == null)) {
                LogAdapter logAdapter5 = logger;
                if (logAdapter5.isDebugEnabled()) {
                    logAdapter5.debug("RFC3414 §3.2.5 - Unsupported security level: " + i12 + " by user " + user);
                }
                CounterEvent counterEvent4 = new CounterEvent(this, SnmpConstants.usmStatsUnsupportedSecLevels);
                fireIncrementCounter(counterEvent4);
                if (SNMP4JSettings.getReportSecurityLevelStrategy() == SNMP4JSettings.ReportSecurityLevelStrategy.noAuthNoPrivIfNeeded) {
                    statusInformation.setSecurityLevel(new Integer32(1));
                }
                statusInformation.setErrorIndication(new VariableBinding(counterEvent4.getOid(), counterEvent4.getCurrentValue()));
                return SnmpConstants.SNMPv3_USM_UNSUPPORTED_SECURITY_LEVEL;
            }
            if (i12 >= 2) {
                if (statusInformation != null) {
                    privacyProtocol = privacyProtocol2;
                    i14 = scopedPduPosition;
                    if (!authenticationProtocol.isAuthentic(user.getAuthenticationKey(), bArrBuildMessageBuffer, 0, bArrBuildMessageBuffer.length, new ByteArrayWindow(bArrBuildMessageBuffer, usmSecurityParameters.getAuthParametersPosition() + usmSecurityParameters.getSecurityParametersPosition(), authenticationProtocol.getAuthenticationCodeLength()))) {
                        LogAdapter logAdapter6 = logger;
                        if (logAdapter6.isDebugEnabled()) {
                            logAdapter6.debug("RFC3414 §3.2.6 Wrong digest -> authentication failure: " + usmSecurityParameters.getAuthenticationParameters().toHexString());
                        }
                        CounterEvent counterEvent5 = new CounterEvent(this, SnmpConstants.usmStatsWrongDigests);
                        fireIncrementCounter(counterEvent5);
                        if (SNMP4JSettings.getReportSecurityLevelStrategy() == SNMP4JSettings.ReportSecurityLevelStrategy.noAuthNoPrivIfNeeded) {
                            statusInformation.setSecurityLevel(new Integer32(1));
                        }
                        statusInformation.setErrorIndication(new VariableBinding(counterEvent5.getOid(), counterEvent5.getCurrentValue()));
                        return SnmpConstants.SNMPv3_USM_AUTHENTICATION_FAILURE;
                    }
                    int iCheckTime = this.timeTable.checkTime(new UsmTimeEntry(octetString, usmSecurityParameters.getAuthoritativeEngineBoots(), usmSecurityParameters.getAuthoritativeEngineTime()));
                    if (iCheckTime == 1410) {
                        LogAdapter logAdapter7 = logger;
                        if (logAdapter7.isDebugEnabled()) {
                            logAdapter7.debug("RFC3414 §3.2.7.b - Unknown engine ID: " + octetString);
                        }
                        CounterEvent counterEvent6 = new CounterEvent(this, SnmpConstants.usmStatsUnknownEngineIDs);
                        fireIncrementCounter(counterEvent6);
                        if (SNMP4JSettings.getReportSecurityLevelStrategy() == SNMP4JSettings.ReportSecurityLevelStrategy.noAuthNoPrivIfNeeded) {
                            statusInformation.setSecurityLevel(new Integer32(1));
                        }
                        statusInformation.setErrorIndication(new VariableBinding(counterEvent6.getOid(), counterEvent6.getCurrentValue()));
                        return iCheckTime;
                    }
                    if (iCheckTime == 1411) {
                        logger.debug("RFC3414 §3.2.7.a Not in time window; engineID='" + octetString + "', engineBoots=" + usmSecurityParameters.getAuthoritativeEngineBoots() + ", engineTime=" + usmSecurityParameters.getAuthoritativeEngineTime());
                        CounterEvent counterEvent7 = new CounterEvent(this, SnmpConstants.usmStatsNotInTimeWindows);
                        fireIncrementCounter(counterEvent7);
                        statusInformation.setSecurityLevel(new Integer32(2));
                        statusInformation.setErrorIndication(new VariableBinding(counterEvent7.getOid(), counterEvent7.getCurrentValue()));
                        return iCheckTime;
                    }
                } else {
                    privacyProtocol = privacyProtocol2;
                    i14 = scopedPduPosition;
                }
                if (i12 >= 3) {
                    OctetString privacyParameters = usmSecurityParameters.getPrivacyParameters();
                    DecryptParams decryptParams = new DecryptParams(privacyParameters.getValue(), 0, privacyParameters.length());
                    try {
                        int i15 = i14;
                        BERInputStream bERInputStream2 = new BERInputStream(ByteBuffer.wrap(bArrBuildMessageBuffer, i15, bArrBuildMessageBuffer.length - i15));
                        long position = bERInputStream2.getPosition();
                        int iDecodeHeader = BER.decodeHeader(bERInputStream2, new BER.MutableByte());
                        int position2 = i15 + ((int) (bERInputStream2.getPosition() - position));
                        bERInputStream2.close();
                        i13 = 0;
                        bEROutputStream.setFilledBuffer(ByteBuffer.wrap(privacyProtocol.decrypt(bArrBuildMessageBuffer, position2, iDecodeHeader, user.getPrivacyKey(), usmSecurityParameters.getAuthoritativeEngineBoots(), usmSecurityParameters.getAuthoritativeEngineTime(), decryptParams)));
                    } catch (Exception e10) {
                        logger.debug("RFC 3414 §3.2.8 Decryption error: " + e10.getMessage());
                        return SnmpConstants.SNMPv3_USM_DECRYPTION_ERROR;
                    }
                } else {
                    int i16 = i14;
                    i13 = 0;
                    bEROutputStream.setFilledBuffer(ByteBuffer.wrap(bArrBuildMessageBuffer, i16, bArrBuildMessageBuffer.length - i16));
                }
            } else {
                i13 = 0;
                bEROutputStream.setFilledBuffer(ByteBuffer.wrap(bArrBuildMessageBuffer, scopedPduPosition, bArrBuildMessageBuffer.length - scopedPduPosition));
            }
        } else {
            bEROutputStream.setFilledBuffer(ByteBuffer.wrap(bArrBuildMessageBuffer, scopedPduPosition, bArrBuildMessageBuffer.length - scopedPduPosition));
            i13 = 0;
        }
        integer32.setValue(i11 - usmSecurityParameters.getBERMaxLength(i12));
        usmSecurityStateReference.setSecurityName(octetString2.getValue());
        return i13;
    }

    public List<UsmUser> removeAllUsers(OctetString octetString, OctetString octetString2) {
        List<UsmUserEntry> listRemoveAllUsers = this.userTable.removeAllUsers(octetString, octetString2);
        if (listRemoveAllUsers.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (UsmUserEntry usmUserEntry : listRemoveAllUsers) {
            arrayList.add(usmUserEntry.getUsmUser());
            fireUsmUserChange(new UsmUserEvent(this, usmUserEntry, 2));
        }
        return arrayList;
    }

    public void removeEngineTime(OctetString octetString) {
        this.timeTable.removeEntry(octetString);
    }

    public UsmUser removeUser(OctetString octetString, OctetString octetString2) {
        UsmUserEntry usmUserEntryRemoveUser = this.userTable.removeUser(octetString, octetString2);
        if (usmUserEntryRemoveUser == null) {
            return null;
        }
        fireUsmUserChange(new UsmUserEvent(this, usmUserEntryRemoveUser, 2));
        return usmUserEntryRemoveUser.getUsmUser();
    }

    public synchronized void removeUsmUserListener(UsmUserListener usmUserListener) {
        Vector<UsmUserListener> vector = this.usmUserListeners;
        if (vector != null && vector.contains(usmUserListener)) {
            this.usmUserListeners.remove(usmUserListener);
        }
    }

    public void setCounterSupport(CounterSupport counterSupport) {
        counterSupport.getClass();
        this.counterSupport = counterSupport;
    }

    public void setEngineBoots(int i10) {
        this.timeTable.setEngineBoots(i10);
    }

    public void setEngineDiscoveryEnabled(boolean z10) {
        this.engineDiscoveryEnabled = z10;
    }

    public void setLocalEngine(OctetString octetString, int i10, int i11) {
        this.localEngineID = octetString;
        this.timeTable.setLocalTime(new UsmTimeEntry(octetString, i10, i11));
    }

    public void setUsers(UsmUser[] usmUserArr) {
        if (usmUserArr == null || usmUserArr.length == 0) {
            this.userTable.clear();
            return;
        }
        Vector vector = new Vector(usmUserArr.length);
        for (UsmUser usmUser : usmUserArr) {
            vector.add(new UsmUserEntry(usmUser.getSecurityName(), (UsmUser) usmUser.clone()));
        }
        this.userTable.setUsers(vector);
    }

    @Override // org.snmp4j.security.SecurityModel
    public boolean supportsEngineIdDiscovery() {
        return true;
    }

    public void updateUser(UsmUserEntry usmUserEntry) {
        UsmUserEntry usmUserEntryAddUser = this.userTable.addUser(usmUserEntry);
        if (usmUserEntryAddUser != null && usmUserEntry.getStorageType() == null) {
            usmUserEntry.setStorageType(usmUserEntryAddUser.getStorageType());
        }
        fireUsmUserChange(new UsmUserEvent(this, usmUserEntry, usmUserEntryAddUser == null ? 1 : 3));
    }

    public void addUser(UsmUser usmUser) {
        addUser(usmUser.getSecurityName(), new OctetString(), usmUser);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addUser(org.snmp4j.smi.OctetString r8, org.snmp4j.smi.OctetString r9, org.snmp4j.security.UsmUser r10) {
        /*
            r7 = this;
            org.snmp4j.smi.OctetString r0 = r10.getSecurityName()
            int r0 = r0.length()
            java.lang.String r1 = "User '"
            r2 = 32
            if (r0 > r2) goto Lc2
            r0 = 0
            if (r9 == 0) goto La0
            int r3 = r9.length()
            if (r3 <= 0) goto La0
            int r3 = r9.length()
            r4 = 5
            if (r3 < r4) goto L7a
            int r3 = r9.length()
            if (r3 > r2) goto L7a
            org.snmp4j.smi.OID r1 = r10.getAuthenticationProtocol()
            if (r1 == 0) goto La0
            boolean r1 = r10.isLocalized()
            if (r1 == 0) goto L39
            org.snmp4j.smi.OctetString r1 = r10.getAuthenticationPassphrase()
            byte[] r1 = r1.getValue()
            goto L4b
        L39:
            org.snmp4j.security.SecurityProtocols r1 = r7.securityProtocols
            org.snmp4j.smi.OID r2 = r10.getAuthenticationProtocol()
            org.snmp4j.smi.OctetString r3 = r10.getAuthenticationPassphrase()
            byte[] r4 = r9.getValue()
            byte[] r1 = r1.passwordToKey(r2, r3, r4)
        L4b:
            org.snmp4j.smi.OID r2 = r10.getPrivacyProtocol()
            if (r2 == 0) goto L5f
            boolean r0 = r10.isLocalized()
            if (r0 == 0) goto L63
            org.snmp4j.smi.OctetString r0 = r10.getPrivacyPassphrase()
            byte[] r0 = r0.getValue()
        L5f:
            r6 = r1
            r1 = r0
            r0 = r6
            goto La1
        L63:
            org.snmp4j.security.SecurityProtocols r0 = r7.securityProtocols
            org.snmp4j.smi.OID r2 = r10.getPrivacyProtocol()
            org.snmp4j.smi.OID r3 = r10.getAuthenticationProtocol()
            org.snmp4j.smi.OctetString r4 = r10.getPrivacyPassphrase()
            byte[] r5 = r9.getValue()
            byte[] r0 = r0.passwordToKey(r2, r3, r4, r5)
            goto L5f
        L7a:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            r10.append(r8)
            java.lang.String r8 = "' not added because of an engine ID of incorrect length "
            r10.append(r8)
            int r8 = r9.length()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            org.snmp4j.log.LogAdapter r9 = org.snmp4j.security.USM.logger
            r9.warn(r8)
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r8)
            throw r9
        La0:
            r1 = r0
        La1:
            boolean r2 = r10.isLocalized()
            if (r2 == 0) goto Lac
            org.snmp4j.smi.OctetString r9 = r10.getLocalizationEngineID()
            goto Lb3
        Lac:
            if (r9 != 0) goto Lb3
            org.snmp4j.smi.OctetString r9 = new org.snmp4j.smi.OctetString
            r9.<init>()
        Lb3:
            org.snmp4j.security.UsmUserEntry r2 = new org.snmp4j.security.UsmUserEntry
            r2.<init>(r8, r9, r10)
            r2.setAuthenticationKey(r0)
            r2.setPrivacyKey(r1)
            r7.addUsmUserEntry(r2)
            return
        Lc2:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r1)
            org.snmp4j.smi.OctetString r9 = r10.getSecurityName()
            r8.append(r9)
            java.lang.String r9 = "' not added because of its too long security name with length "
            r8.append(r9)
            org.snmp4j.smi.OctetString r9 = r10.getSecurityName()
            int r9 = r9.length()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            org.snmp4j.log.LogAdapter r9 = org.snmp4j.security.USM.logger
            r9.warn(r8)
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.snmp4j.security.USM.addUser(org.snmp4j.smi.OctetString, org.snmp4j.smi.OctetString, org.snmp4j.security.UsmUser):void");
    }

    public USM() {
        this(SecurityProtocols.getInstance().addDefaultProtocols(), new OctetString(MPv3.createLocalEngineID(randomID())), 0);
    }

    public List<UsmUser> removeAllUsers(OctetString octetString) {
        return removeAllUsers(octetString, null);
    }

    public void removeAllUsers() {
        this.userTable.clear();
        fireUsmUserChange(new UsmUserEvent(this, null, 2));
    }
}
