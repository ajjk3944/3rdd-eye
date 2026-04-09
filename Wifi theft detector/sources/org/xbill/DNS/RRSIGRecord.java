package org.xbill.DNS;

import java.util.Date;

/* loaded from: classes4.dex */
public class RRSIGRecord extends SIGBase {
    private static final long serialVersionUID = -2609150673537226317L;

    public RRSIGRecord() {
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new RRSIGRecord();
    }

    public RRSIGRecord(Name name, int i10, long j10, int i11, int i12, long j11, Date date, Date date2, int i13, Name name2, byte[] bArr) {
        super(name, 46, i10, j10, i11, i12, j11, date, date2, i13, name2, bArr);
    }
}
