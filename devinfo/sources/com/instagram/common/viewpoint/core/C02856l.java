package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.6l, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C02856l implements Comparable<C02856l> {
    public int A00;
    public long A01;
    public Object A02;
    public final C03037d A03;

    public C02856l(C03037d c03037d) {
        this.A03 = c03037d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C02856l c02856l) {
        if ((this.A02 == null) != (c02856l.A02 == null)) {
            return this.A02 != null ? -1 : 1;
        }
        if (this.A02 == null) {
            return 0;
        }
        int i4 = this.A00 - c02856l.A00;
        if (i4 != 0) {
            return i4;
        }
        int comparePeriodIndex = C5C.A08(this.A01, c02856l.A01);
        return comparePeriodIndex;
    }

    public final void A01(int i4, long j, Object obj) {
        this.A00 = i4;
        this.A01 = j;
        this.A02 = obj;
    }
}
