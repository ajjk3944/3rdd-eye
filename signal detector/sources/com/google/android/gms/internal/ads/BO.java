package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class BO {

    /* renamed from: a, reason: collision with root package name */
    public final long f7343a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1353j8 f7344b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7345c;

    /* renamed from: d, reason: collision with root package name */
    public final C1749qQ f7346d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7347e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC1353j8 f7348f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7349g;

    /* renamed from: h, reason: collision with root package name */
    public final C1749qQ f7350h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f7351j;

    public BO(long j6, AbstractC1353j8 abstractC1353j8, int i, C1749qQ c1749qQ, long j7, AbstractC1353j8 abstractC1353j82, int i3, C1749qQ c1749qQ2, long j8, long j9) {
        this.f7343a = j6;
        this.f7344b = abstractC1353j8;
        this.f7345c = i;
        this.f7346d = c1749qQ;
        this.f7347e = j7;
        this.f7348f = abstractC1353j82;
        this.f7349g = i3;
        this.f7350h = c1749qQ2;
        this.i = j8;
        this.f7351j = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BO.class == obj.getClass()) {
            BO bo = (BO) obj;
            if (this.f7343a == bo.f7343a && this.f7345c == bo.f7345c && this.f7347e == bo.f7347e && this.f7349g == bo.f7349g && this.i == bo.i && this.f7351j == bo.f7351j && Objects.equals(this.f7344b, bo.f7344b) && Objects.equals(this.f7346d, bo.f7346d) && Objects.equals(this.f7348f, bo.f7348f) && Objects.equals(this.f7350h, bo.f7350h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f7343a), this.f7344b, Integer.valueOf(this.f7345c), this.f7346d, Long.valueOf(this.f7347e), this.f7348f, Integer.valueOf(this.f7349g), this.f7350h, Long.valueOf(this.i), Long.valueOf(this.f7351j));
    }
}
