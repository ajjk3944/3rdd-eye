package org.xbill.DNS;

/* loaded from: classes4.dex */
public class NSRecord extends SingleCompressedNameBase {
    private static final long serialVersionUID = 487170758138268838L;

    public NSRecord() {
    }

    @Override // org.xbill.DNS.Record
    public Name getAdditionalName() {
        return getSingleName();
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new NSRecord();
    }

    public Name getTarget() {
        return getSingleName();
    }

    public NSRecord(Name name, int i10, long j10, Name name2) {
        super(name, 2, i10, j10, name2, "target");
    }
}
