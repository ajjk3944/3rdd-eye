package org.xbill.DNS;

/* loaded from: classes4.dex */
public class AFSDBRecord extends U16NameBase {
    private static final long serialVersionUID = 3034379930729102437L;

    public AFSDBRecord() {
    }

    public Name getHost() {
        return getNameField();
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new AFSDBRecord();
    }

    public int getSubtype() {
        return getU16Field();
    }

    public AFSDBRecord(Name name, int i10, long j10, int i11, Name name2) {
        super(name, 18, i10, j10, i11, "subtype", name2, "host");
    }
}
