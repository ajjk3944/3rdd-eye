package com.google.android.exoplayer2;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f4343a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f4344b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f4345c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f4346d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f4347e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f4348f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f4349g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f4350h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f4351i;
    public Integer j;
    public Integer k;

    /* renamed from: l, reason: collision with root package name */
    public Integer f4352l;

    /* renamed from: m, reason: collision with root package name */
    public Integer f4353m;

    /* renamed from: n, reason: collision with root package name */
    public Integer f4354n;

    /* renamed from: o, reason: collision with root package name */
    public Integer f4355o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f4356p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f4357q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f4358r;

    public final void a(int i10, byte[] bArr) {
        if (this.f4348f != null) {
            Integer numValueOf = Integer.valueOf(i10);
            int i11 = qb.v.f20828a;
            if (!numValueOf.equals(3) && qb.v.a(this.f4349g, 3)) {
                return;
            }
        }
        this.f4348f = (byte[]) bArr.clone();
        this.f4349g = Integer.valueOf(i10);
    }
}
