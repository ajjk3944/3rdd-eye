package org.snmp4j.util;

import org.snmp4j.PDU;
import org.snmp4j.PDUv1;
import org.snmp4j.ScopedPDU;
import org.snmp4j.Target;
import org.snmp4j.mp.MessageProcessingModel;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public class DefaultPDUFactory implements PDUFactory {
    public static final int GETBULK_DEFAULT_MAX_REPETITIONS = 5;
    public static final int GETBULK_DEFAULT_NON_REPEATERS = 0;
    private OctetString contextEngineID;
    private OctetString contextName;
    private int maxRepetitions;
    private int nonRepeaters;
    private int pduType;

    public DefaultPDUFactory() {
        this.pduType = -96;
        this.maxRepetitions = 5;
        this.nonRepeaters = 0;
    }

    private static PDU createPduByMP(MessageProcessingModel messageProcessingModel) {
        int id2 = messageProcessingModel.getID();
        return id2 != 0 ? id2 != 3 ? new PDU() : new ScopedPDU() : new PDUv1();
    }

    protected void applyContextInfoToScopedPDU(PDU pdu) {
        if (pdu instanceof ScopedPDU) {
            ScopedPDU scopedPDU = (ScopedPDU) pdu;
            scopedPDU.setContextEngineID(this.contextEngineID);
            scopedPDU.setContextName(this.contextName);
        }
    }

    @Override // org.snmp4j.util.PDUFactory
    public PDU createPDU(Target target) {
        PDU pduCreatePDU = createPDU(target, this.pduType);
        applyContextInfoToScopedPDU(pduCreatePDU);
        return pduCreatePDU;
    }

    public OctetString getContextEngineID() {
        return this.contextEngineID;
    }

    public OctetString getContextName() {
        return this.contextName;
    }

    public int getMaxRepetitions() {
        return this.maxRepetitions;
    }

    public int getNonRepeaters() {
        return this.nonRepeaters;
    }

    public int getPduType() {
        return this.pduType;
    }

    public void setContextEngineID(OctetString octetString) {
        this.contextEngineID = octetString;
    }

    public void setContextName(OctetString octetString) {
        this.contextName = octetString;
    }

    public void setMaxRepetitions(int i10) {
        this.maxRepetitions = i10;
    }

    public void setNonRepeaters(int i10) {
        this.nonRepeaters = i10;
    }

    public void setPduType(int i10) {
        this.pduType = i10;
    }

    public static PDU createPDU(Target target, int i10) {
        return createPDU(target, i10, 5, 0);
    }

    public static PDU createPDU(Target target, int i10, int i11, int i12) {
        PDU pduCreatePDU = createPDU(target.getVersion());
        pduCreatePDU.setType(i10);
        if (i10 == -91) {
            pduCreatePDU.setMaxRepetitions(i11);
            pduCreatePDU.setNonRepeaters(i12);
        }
        return pduCreatePDU;
    }

    public DefaultPDUFactory(int i10) {
        this.pduType = -96;
        this.maxRepetitions = 5;
        this.nonRepeaters = 0;
        setPduType(i10);
        this.contextEngineID = new OctetString();
        this.contextName = new OctetString();
    }

    public static PDU createPDU(int i10) {
        if (i10 == 0) {
            return new PDUv1();
        }
        if (i10 != 3) {
            return new PDU();
        }
        return new ScopedPDU();
    }

    @Override // org.snmp4j.util.PDUFactory
    public PDU createPDU(MessageProcessingModel messageProcessingModel) {
        PDU pduCreatePduByMP = createPduByMP(messageProcessingModel);
        applyContextInfoToScopedPDU(pduCreatePduByMP);
        return pduCreatePduByMP;
    }

    public DefaultPDUFactory(int i10, OctetString octetString, OctetString octetString2) {
        this(i10);
        this.contextEngineID = octetString;
        this.contextName = octetString2;
    }

    public static PDU createPDU(MessageProcessingModel messageProcessingModel, int i10) {
        PDU pduCreatePduByMP = createPduByMP(messageProcessingModel);
        pduCreatePduByMP.setType(i10);
        return pduCreatePduByMP;
    }
}
