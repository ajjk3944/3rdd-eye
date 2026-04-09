package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i20 implements h20 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12127a;

    /* renamed from: b, reason: collision with root package name */
    public final ya.c0 f12128b;

    public /* synthetic */ i20(ya.c0 c0Var, int i4) {
        this.f12127a = i4;
        this.f12128b = c0Var;
    }

    private final void b(HashMap map) {
        boolean z3 = Boolean.parseBoolean((String) map.get("content_url_opted_out"));
        ya.c0 c0Var = this.f12128b;
        c0Var.m();
        synchronized (c0Var.f37402a) {
            try {
                if (c0Var.f37420u == z3) {
                    return;
                }
                c0Var.f37420u = z3;
                SharedPreferences.Editor editor = c0Var.g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z3);
                    c0Var.g.apply();
                }
                c0Var.n();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.h20
    public final void a(HashMap map) {
        switch (this.f12127a) {
            case 0:
                b(map);
                return;
            default:
                boolean z3 = Boolean.parseBoolean((String) map.get("content_vertical_opted_out"));
                ya.c0 c0Var = this.f12128b;
                c0Var.m();
                synchronized (c0Var.f37402a) {
                    try {
                        if (c0Var.f37421v == z3) {
                            return;
                        }
                        c0Var.f37421v = z3;
                        SharedPreferences.Editor editor = c0Var.g;
                        if (editor != null) {
                            editor.putBoolean("content_vertical_opted_out", z3);
                            c0Var.g.apply();
                        }
                        c0Var.n();
                        return;
                    } finally {
                    }
                }
        }
    }
}
