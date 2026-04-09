package com.bumptech.glide;

import A1.w;
import A2.C0117e;
import G3.C0152f;
import android.content.Context;
import android.content.ContextWrapper;
import b4.C0344i;
import com.google.android.gms.internal.ads.C0752Tp;
import java.util.List;
import u.C2936e;

/* loaded from: classes.dex */
public final class f extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    public static final a f6497k;

    /* renamed from: a, reason: collision with root package name */
    public final C0752Tp f6498a;

    /* renamed from: b, reason: collision with root package name */
    public final H1.h f6499b;

    /* renamed from: c, reason: collision with root package name */
    public final C0152f f6500c;

    /* renamed from: d, reason: collision with root package name */
    public final C0344i f6501d;

    /* renamed from: e, reason: collision with root package name */
    public final List f6502e;

    /* renamed from: f, reason: collision with root package name */
    public final C2936e f6503f;

    /* renamed from: g, reason: collision with root package name */
    public final n1.l f6504g;

    /* renamed from: h, reason: collision with root package name */
    public final C0117e f6505h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public D1.e f6506j;

    static {
        a aVar = new a();
        aVar.f6482a = F1.b.f1441a;
        f6497k = aVar;
    }

    public f(Context context, C0752Tp c0752Tp, w wVar, C0152f c0152f, C0344i c0344i, C2936e c2936e, List list, n1.l lVar, C0117e c0117e) {
        super(context.getApplicationContext());
        this.f6498a = c0752Tp;
        this.f6500c = c0152f;
        this.f6501d = c0344i;
        this.f6502e = list;
        this.f6503f = c2936e;
        this.f6504g = lVar;
        this.f6505h = c0117e;
        this.i = 4;
        this.f6499b = new H1.h(wVar);
    }

    public final synchronized D1.e a() {
        try {
            if (this.f6506j == null) {
                this.f6501d.getClass();
                D1.e eVar = new D1.e();
                eVar.f1216m = true;
                this.f6506j = eVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f6506j;
    }

    public final j b() {
        return (j) this.f6499b.get();
    }
}
