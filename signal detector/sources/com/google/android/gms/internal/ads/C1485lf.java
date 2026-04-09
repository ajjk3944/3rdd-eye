package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.lf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1485lf implements M7 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15416a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15417b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15418c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15419d;

    public C1485lf(Context context, String str) {
        this.f15416a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f15418c = str;
        this.f15419d = false;
        this.f15417b = new Object();
    }

    @Override // com.google.android.gms.internal.ads.M7
    public final void K(L7 l7) {
        a(l7.f9629j);
    }

    public final void a(boolean z6) {
        p2.j jVar = p2.j.f22785C;
        C1593nf c1593nf = jVar.f22811y;
        Context context = this.f15416a;
        if (c1593nf.a(context)) {
            synchronized (this.f15417b) {
                try {
                    if (this.f15419d == z6) {
                        return;
                    }
                    this.f15419d = z6;
                    String str = this.f15418c;
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (this.f15419d) {
                        C1593nf c1593nf2 = jVar.f22811y;
                        if (c1593nf2.a(context)) {
                            c1593nf2.j(context, str, "beginAdUnitExposure");
                        }
                    } else {
                        C1593nf c1593nf3 = jVar.f22811y;
                        if (c1593nf3.a(context)) {
                            c1593nf3.j(context, str, "endAdUnitExposure");
                        }
                    }
                } finally {
                }
            }
        }
    }
}
