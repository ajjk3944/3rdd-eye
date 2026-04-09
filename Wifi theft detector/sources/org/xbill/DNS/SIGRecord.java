package org.xbill.DNS;

import java.util.Date;

/* loaded from: classes4.dex */
public class SIGRecord extends SIGBase {
    private static final long serialVersionUID = 4963556060953589058L;

    public SIGRecord() {
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new SIGRecord();
    }

    public SIGRecord(Name name, int i10, long j10, int i11, int i12, long j11, Date date, Date date2, int i13, Name name2, byte[] bArr) {
        super(name, 24, i10, j10, i11, i12, j11, date, date2, i13, name2, bArr);
    }
}
