package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import b5.i0;
import com.google.android.gms.internal.ads.hp;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    public static final a f6489k;

    /* renamed from: a, reason: collision with root package name */
    public final a8.g f6490a;

    /* renamed from: b, reason: collision with root package name */
    public final hp f6491b;

    /* renamed from: c, reason: collision with root package name */
    public final i7.b f6492c;

    /* renamed from: d, reason: collision with root package name */
    public final b7.h f6493d;

    /* renamed from: e, reason: collision with root package name */
    public final List f6494e;

    /* renamed from: f, reason: collision with root package name */
    public final x.e f6495f;
    public final z7.k g;

    /* renamed from: h, reason: collision with root package name */
    public final o7.c f6496h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6497i;
    public p8.f j;

    static {
        a aVar = new a();
        aVar.f6467a = r8.b.f32898a;
        f6489k = aVar;
    }

    public h(Context context, a8.g gVar, i0 i0Var, i7.b bVar, b7.h hVar, x.e eVar, List list, z7.k kVar, o7.c cVar, int i4) {
        super(context.getApplicationContext());
        this.f6490a = gVar;
        this.f6492c = bVar;
        this.f6493d = hVar;
        this.f6494e = list;
        this.f6495f = eVar;
        this.g = kVar;
        this.f6496h = cVar;
        this.f6497i = i4;
        this.f6491b = new hp(i0Var);
    }

    public final synchronized p8.f a() {
        try {
            if (this.j == null) {
                this.f6493d.getClass();
                p8.f fVar = new p8.f();
                fVar.f31464n = true;
                this.j = fVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.j;
    }

    public final k b() {
        return (k) this.f6491b.get();
    }
}
