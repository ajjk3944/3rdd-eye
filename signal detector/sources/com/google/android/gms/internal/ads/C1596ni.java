package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.HashMap;
import t2.C2909E;

/* renamed from: com.google.android.gms.internal.ads.ni, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1596ni implements InterfaceC1542mi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15797a;

    /* renamed from: b, reason: collision with root package name */
    public final C2909E f15798b;

    public /* synthetic */ C1596ni(C2909E c2909e, int i) {
        this.f15797a = i;
        this.f15798b = c2909e;
    }

    private final void b(HashMap map) {
        boolean z6 = Boolean.parseBoolean((String) map.get("content_url_opted_out"));
        C2909E c2909e = this.f15798b;
        c2909e.m();
        synchronized (c2909e.f23548a) {
            try {
                if (c2909e.f23567u == z6) {
                    return;
                }
                c2909e.f23567u = z6;
                SharedPreferences.Editor editor = c2909e.f23554g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z6);
                    c2909e.f23554g.apply();
                }
                c2909e.n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1542mi
    public final void a(HashMap map) {
        switch (this.f15797a) {
            case 0:
                b(map);
                return;
            default:
                boolean z6 = Boolean.parseBoolean((String) map.get("content_vertical_opted_out"));
                C2909E c2909e = this.f15798b;
                c2909e.m();
                synchronized (c2909e.f23548a) {
                    try {
                        if (c2909e.f23568v == z6) {
                            return;
                        }
                        c2909e.f23568v = z6;
                        SharedPreferences.Editor editor = c2909e.f23554g;
                        if (editor != null) {
                            editor.putBoolean("content_vertical_opted_out", z6);
                            c2909e.f23554g.apply();
                        }
                        c2909e.n();
                        return;
                    } finally {
                    }
                }
        }
    }
}
