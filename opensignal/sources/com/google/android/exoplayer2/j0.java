package com.google.android.exoplayer2;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public String f4184a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f4185b;

    /* renamed from: c, reason: collision with root package name */
    public String f4186c;

    /* renamed from: d, reason: collision with root package name */
    public long f4187d;

    /* renamed from: e, reason: collision with root package name */
    public List f4188e;

    /* renamed from: f, reason: collision with root package name */
    public List f4189f;

    /* renamed from: g, reason: collision with root package name */
    public Object f4190g;

    /* renamed from: h, reason: collision with root package name */
    public p0 f4191h;

    /* renamed from: i, reason: collision with root package name */
    public long f4192i;
    public long j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public float f4193l;

    /* renamed from: m, reason: collision with root package name */
    public float f4194m;

    public final n0 a() {
        Uri uri = this.f4185b;
        m0 m0Var = uri != null ? new m0(uri, this.f4186c, null, null, this.f4188e, this.f4189f, this.f4190g) : null;
        String str = this.f4184a;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        k0 k0Var = new k0(this.f4187d);
        l0 l0Var = new l0(this.f4192i, this.j, this.k, this.f4193l, this.f4194m);
        p0 p0Var = this.f4191h;
        if (p0Var == null) {
            p0Var = p0.f4365s;
        }
        return new n0(str2, k0Var, m0Var, l0Var, p0Var);
    }

    public final void b(List list) {
        this.f4188e = (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list));
    }
}
