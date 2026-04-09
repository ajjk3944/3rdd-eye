package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.6l, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C06636l implements Comparable<C06636l> {
    public int A00;
    public long A01;
    public Object A02;
    public final C06817d A03;

    public C06636l(C06817d c06817d) {
        this.A03 = c06817d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C06636l c06636l) {
        if ((this.A02 == null) != (c06636l.A02 == null)) {
            return this.A02 != null ? -1 : 1;
        }
        if (this.A02 == null) {
            return 0;
        }
        int i10 = this.A00 - c06636l.A00;
        if (i10 != 0) {
            return i10;
        }
        int comparePeriodIndex = C5C.A08(this.A01, c06636l.A01);
        return comparePeriodIndex;
    }

    public final void A01(int i10, long j10, Object obj) {
        this.A00 = i10;
        this.A01 = j10;
        this.A02 = obj;
    }
}
