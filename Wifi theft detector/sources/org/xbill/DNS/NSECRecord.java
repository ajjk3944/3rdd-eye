package org.xbill.DNS;

import java.io.IOException;

/* loaded from: classes4.dex */
public class NSECRecord extends Record {
    private static final long serialVersionUID = -5165065768816265385L;
    private Name next;
    private TypeBitmap types;

    public NSECRecord() {
    }

    public Name getNext() {
        return this.next;
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new NSECRecord();
    }

    public int[] getTypes() {
        return this.types.toArray();
    }

    public boolean hasType(int i10) {
        return this.types.contains(i10);
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        this.next = tokenizer.getName(name);
        this.types = new TypeBitmap(tokenizer);
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.next = new Name(dNSInput);
        this.types = new TypeBitmap(dNSInput);
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.next);
        if (!this.types.empty()) {
            stringBuffer.append(' ');
            stringBuffer.append(this.types.toString());
        }
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z10) {
        this.next.toWire(dNSOutput, null, false);
        this.types.toWire(dNSOutput);
    }

    public NSECRecord(Name name, int i10, long j10, Name name2, int[] iArr) {
        super(name, 47, i10, j10);
        this.next = Record.checkName("next", name2);
        for (int i11 : iArr) {
            Type.check(i11);
        }
        this.types = new TypeBitmap(iArr);
    }
}
