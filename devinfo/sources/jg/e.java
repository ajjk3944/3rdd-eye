package jg;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.Serializable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends f {

    /* renamed from: b, reason: collision with root package name */
    public final kg.d f27657b;

    /* renamed from: c, reason: collision with root package name */
    public d f27658c;

    /* renamed from: d, reason: collision with root package name */
    public int f27659d;

    public e(kg.d dVar) {
        nk.k.e(dVar, "data");
        this.f27657b = dVar;
        this.f27659d = -1;
    }

    @Override // kg.d
    public final CharSequence a() {
        return this.f27657b.a();
    }

    @Override // kg.d
    public final Drawable b(Context context) {
        nk.k.e(context, "context");
        return this.f27657b.b(context);
    }

    @Override // jg.f, kg.d
    public final boolean c() {
        return this.f27657b.c();
    }

    @Override // kg.d
    public final CharSequence d() {
        return this.f27657b.d();
    }

    @Override // jg.f
    public final Serializable e() {
        kg.d dVar = this.f27657b;
        return dVar instanceof kg.e ? Integer.valueOf(((kg.e) dVar).f28292e) : dVar.getClass();
    }

    @Override // kg.d
    public final CharSequence name() {
        return this.f27657b.name();
    }

    @Override // jg.f, kg.d
    public final String path() {
        return this.f27657b.path();
    }

    @Override // kg.d
    public final long size() {
        return Math.max(0L, this.f27657b.size());
    }
}
