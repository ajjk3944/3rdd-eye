package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class jw {

    /* renamed from: a, reason: collision with root package name */
    public final l31 f12849a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f12850b;

    /* renamed from: c, reason: collision with root package name */
    public nt1 f12851c;

    /* renamed from: d, reason: collision with root package name */
    public p50 f12852d;

    /* renamed from: f, reason: collision with root package name */
    public int f12854f;

    /* renamed from: h, reason: collision with root package name */
    public jy f12855h;
    public float g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int f12853e = 0;

    public jw(Context context, Looper looper, nt1 nt1Var) {
        this.f12849a = yo0.d(new nk(context, 1));
        this.f12851c = nt1Var;
        this.f12850b = new Handler(looper);
    }

    public final void a(p50 p50Var) {
        if (Objects.equals(this.f12852d, p50Var)) {
            return;
        }
        this.f12852d = p50Var;
        this.f12854f = p50Var == null ? 0 : 1;
    }

    public final int b(int i4, boolean z3) {
        int iRequestAudioFocus;
        if (i4 == 1 || this.f12854f != 1) {
            d();
            e(0);
            return 1;
        }
        if (!z3) {
            int i10 = this.f12853e;
            if (i10 == 1) {
                return -1;
            }
            if (i10 == 3) {
                return 0;
            }
        } else if (this.f12853e != 2) {
            if (this.f12855h == null) {
                p50 p50Var = p50.f14899b;
                p50 p50Var2 = this.f12852d;
                p50Var2.getClass();
                nu nuVar = new nu(this);
                Handler handler = this.f12850b;
                handler.getClass();
                this.f12855h = new jy(nuVar, handler, p50Var2);
            }
            AudioManager audioManager = (AudioManager) this.f12849a.b();
            jy jyVar = this.f12855h;
            if (Build.VERSION.SDK_INT >= 26) {
                Object obj = jyVar.f12874d;
                obj.getClass();
                iRequestAudioFocus = audioManager.requestAudioFocus(com.applovin.shadow.okio.a.d(obj));
            } else {
                iRequestAudioFocus = audioManager.requestAudioFocus(jyVar.f12871a, 3, 1);
            }
            if (iRequestAudioFocus == 1) {
                e(2);
                return 1;
            }
            e(1);
            return -1;
        }
        return 1;
    }

    public final void c() {
        this.f12851c = null;
        d();
        e(0);
    }

    public final void d() {
        int i4 = this.f12853e;
        if (i4 == 1 || i4 == 0 || this.f12855h == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.f12849a.b();
        jy jyVar = this.f12855h;
        if (Build.VERSION.SDK_INT < 26) {
            audioManager.abandonAudioFocus(jyVar.f12871a);
            return;
        }
        Object obj = jyVar.f12874d;
        obj.getClass();
        audioManager.abandonAudioFocusRequest(com.applovin.shadow.okio.a.d(obj));
    }

    public final void e(int i4) {
        if (this.f12853e == i4) {
            return;
        }
        this.f12853e = i4;
        float f10 = i4 == 4 ? 0.2f : 1.0f;
        if (this.g != f10) {
            this.g = f10;
            nt1 nt1Var = this.f12851c;
            if (nt1Var != null) {
                nt1Var.f14419h.c(34);
            }
        }
    }

    public final void f(int i4) {
        nt1 nt1Var = this.f12851c;
        if (nt1Var != null) {
            Handler handler = nt1Var.f14419h.f14385a;
            io0 io0VarG = no0.g();
            io0VarG.f12403a = handler.obtainMessage(33, i4, 0);
            io0VarG.a();
        }
    }
}
