package org.xbill.DNS;

import java.io.IOException;

/* loaded from: classes4.dex */
abstract class U16NameBase extends Record {
    private static final long serialVersionUID = -8315884183112502995L;
    protected Name nameField;
    protected int u16Field;

    public U16NameBase() {
    }

    public Name getNameField() {
        return this.nameField;
    }

    public int getU16Field() {
        return this.u16Field;
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        this.u16Field = tokenizer.getUInt16();
        this.nameField = tokenizer.getName(name);
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.u16Field = dNSInput.readU16();
        this.nameField = new Name(dNSInput);
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.u16Field);
        stringBuffer.append(" ");
        stringBuffer.append(this.nameField);
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z10) {
        dNSOutput.writeU16(this.u16Field);
        this.nameField.toWire(dNSOutput, null, z10);
    }

    public U16NameBase(Name name, int i10, int i11, long j10) {
        super(name, i10, i11, j10);
    }

    public U16NameBase(Name name, int i10, int i11, long j10, int i12, String str, Name name2, String str2) {
        super(name, i10, i11, j10);
        this.u16Field = Record.checkU16(str, i12);
        this.nameField = Record.checkName(str2, name2);
    }
}
