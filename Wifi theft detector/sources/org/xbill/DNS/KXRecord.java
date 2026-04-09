package org.xbill.DNS;

/* loaded from: classes4.dex */
public class KXRecord extends U16NameBase {
    private static final long serialVersionUID = 7448568832769757809L;

    public KXRecord() {
    }

    @Override // org.xbill.DNS.Record
    public Name getAdditionalName() {
        return getNameField();
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new KXRecord();
    }

    public int getPreference() {
        return getU16Field();
    }

    public Name getTarget() {
        return getNameField();
    }

    public KXRecord(Name name, int i10, long j10, int i11, Name name2) {
        super(name, 36, i10, j10, i11, "preference", name2, "target");
    }
}
