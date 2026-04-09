package org.xbill.DNS;

import java.util.List;

/* loaded from: classes4.dex */
public class SPFRecord extends TXTBase {
    private static final long serialVersionUID = -2100754352801658722L;

    public SPFRecord() {
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new SPFRecord();
    }

    public SPFRecord(Name name, int i10, long j10, List list) {
        super(name, 99, i10, j10, list);
    }

    public SPFRecord(Name name, int i10, long j10, String str) {
        super(name, 99, i10, j10, str);
    }
}
