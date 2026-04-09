package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class XQ extends AbstractC1102eR implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final int f12429e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12430f;

    public XQ(int i, C2108x8 c2108x8, int i3, C0884aR c0884aR, int i6) {
        int i7;
        super(i, c2108x8, i3);
        this.f12429e = AbstractC1135f5.x(i6, c0884aR.f13127B) ? 1 : 0;
        TP tp = this.f13905d;
        int i8 = tp.f11404t;
        int i9 = -1;
        if (i8 != -1 && (i7 = tp.f11405u) != -1) {
            i9 = i8 * i7;
        }
        this.f12430f = i9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1102eR
    public final int a() {
        return this.f12429e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1102eR
    public final /* bridge */ /* synthetic */ boolean b(AbstractC1102eR abstractC1102eR) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f12430f, ((XQ) obj).f12430f);
    }
}
