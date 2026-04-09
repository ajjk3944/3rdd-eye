package org.xbill.DNS;

import java.io.IOException;

/* loaded from: classes4.dex */
public class MINFORecord extends Record {
    private static final long serialVersionUID = -3962147172340353796L;
    private Name errorAddress;
    private Name responsibleAddress;

    public MINFORecord() {
    }

    public Name getErrorAddress() {
        return this.errorAddress;
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new MINFORecord();
    }

    public Name getResponsibleAddress() {
        return this.responsibleAddress;
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        this.responsibleAddress = tokenizer.getName(name);
        this.errorAddress = tokenizer.getName(name);
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.responsibleAddress = new Name(dNSInput);
        this.errorAddress = new Name(dNSInput);
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.responsibleAddress);
        stringBuffer.append(" ");
        stringBuffer.append(this.errorAddress);
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z10) {
        this.responsibleAddress.toWire(dNSOutput, null, z10);
        this.errorAddress.toWire(dNSOutput, null, z10);
    }

    public MINFORecord(Name name, int i10, long j10, Name name2, Name name3) {
        super(name, 14, i10, j10);
        this.responsibleAddress = Record.checkName("responsibleAddress", name2);
        this.errorAddress = Record.checkName("errorAddress", name3);
    }
}
