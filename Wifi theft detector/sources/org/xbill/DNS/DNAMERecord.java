package org.xbill.DNS;

/* loaded from: classes4.dex */
public class DNAMERecord extends SingleNameBase {
    private static final long serialVersionUID = 2670767677200844154L;

    public DNAMERecord() {
    }

    public Name getAlias() {
        return getSingleName();
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new DNAMERecord();
    }

    public Name getTarget() {
        return getSingleName();
    }

    public DNAMERecord(Name name, int i10, long j10, Name name2) {
        super(name, 39, i10, j10, name2, "alias");
    }
}
