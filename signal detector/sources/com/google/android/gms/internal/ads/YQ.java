package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class YQ implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12641a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12642b;

    public YQ(TP tp, int i) {
        this.f12641a = 1 == (tp.f11390e & 1);
        this.f12642b = AbstractC1135f5.x(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        YQ yq = (YQ) obj;
        return EB.f7923a.d(this.f12642b, yq.f12642b).d(this.f12641a, yq.f12641a).e();
    }
}
