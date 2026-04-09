package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import d3.InterfaceC4274f;
import java.util.List;
import m0.C5308a;

/* compiled from: GlideContext.java */
/* loaded from: classes.dex */
public final class e extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    public static final a f22244k = new a();

    /* renamed from: a, reason: collision with root package name */
    public final O2.g f22245a;

    /* renamed from: b, reason: collision with root package name */
    public final h3.f f22246b;

    /* renamed from: c, reason: collision with root package name */
    public final B7.d f22247c;

    /* renamed from: d, reason: collision with root package name */
    public final B7.d f22248d;

    /* renamed from: e, reason: collision with root package name */
    public final List<InterfaceC4274f<Object>> f22249e;

    /* renamed from: f, reason: collision with root package name */
    public final C5308a f22250f;

    /* renamed from: g, reason: collision with root package name */
    public final N2.m f22251g;

    /* renamed from: h, reason: collision with root package name */
    public final f f22252h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public d3.g f22253j;

    public e(Context context, O2.g gVar, W6.d dVar, B7.d dVar2, B7.d dVar3, C5308a c5308a, List list, N2.m mVar, f fVar, int i) {
        super(context.getApplicationContext());
        this.f22245a = gVar;
        this.f22247c = dVar2;
        this.f22248d = dVar3;
        this.f22249e = list;
        this.f22250f = c5308a;
        this.f22251g = mVar;
        this.f22252h = fVar;
        this.i = i;
        this.f22246b = new h3.f(dVar);
    }

    public final synchronized d3.g a() {
        try {
            if (this.f22253j == null) {
                this.f22248d.getClass();
                d3.g gVar = new d3.g();
                gVar.f37383n = true;
                this.f22253j = gVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f22253j;
    }

    public final i b() {
        return (i) this.f22246b.get();
    }
}
