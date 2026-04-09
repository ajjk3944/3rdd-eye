package org.xbill.DNS;

import java.io.IOException;

/* loaded from: classes4.dex */
abstract class SingleNameBase extends Record {
    private static final long serialVersionUID = -18595042501413L;
    protected Name singleName;

    public SingleNameBase() {
    }

    public Name getSingleName() {
        return this.singleName;
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        this.singleName = tokenizer.getName(name);
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.singleName = new Name(dNSInput);
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        return this.singleName.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z10) {
        this.singleName.toWire(dNSOutput, null, z10);
    }

    public SingleNameBase(Name name, int i10, int i11, long j10) {
        super(name, i10, i11, j10);
    }

    public SingleNameBase(Name name, int i10, int i11, long j10, Name name2, String str) {
        super(name, i10, i11, j10);
        this.singleName = Record.checkName(str, name2);
    }
}
