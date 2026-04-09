package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Kf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0589Kf {

    /* renamed from: a, reason: collision with root package name */
    public ID f9490a;

    /* renamed from: b, reason: collision with root package name */
    public C0784Vn f9491b;

    /* renamed from: c, reason: collision with root package name */
    public Context f9492c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f9493d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f9494e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public long f9495f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f9496g = -1;

    public final void a(ID id, C0784Vn c0784Vn, Context context) {
        if (this.f9493d.getAndSet(true)) {
            return;
        }
        this.f9490a = id;
        this.f9491b = c0784Vn;
        E9 e9 = H9.Ze;
        C2841s c2841s = C2841s.f23267e;
        this.f9495f = ((Long) c2841s.f23270c.a(e9)).longValue();
        this.f9496g = ((Long) c2841s.f23270c.a(H9.af)).longValue();
        this.f9492c = context;
    }
}
