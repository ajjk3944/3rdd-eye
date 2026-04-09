package org.xbill.DNS;

import java.util.List;

/* loaded from: classes4.dex */
public class TXTRecord extends TXTBase {
    private static final long serialVersionUID = -5780785764284221342L;

    public TXTRecord() {
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new TXTRecord();
    }

    public TXTRecord(Name name, int i10, long j10, List list) {
        super(name, 16, i10, j10, list);
    }

    public TXTRecord(Name name, int i10, long j10, String str) {
        super(name, 16, i10, j10, str);
    }
}
