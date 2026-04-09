package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.tf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1916tf {

    /* renamed from: a, reason: collision with root package name */
    public final ZA f16951a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f16952b;

    /* renamed from: c, reason: collision with root package name */
    public ZN f16953c;

    /* renamed from: d, reason: collision with root package name */
    public C0729Sj f16954d;

    /* renamed from: f, reason: collision with root package name */
    public int f16956f;

    /* renamed from: h, reason: collision with root package name */
    public C1809rg f16958h;

    /* renamed from: g, reason: collision with root package name */
    public float f16957g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int f16955e = 0;

    public C1916tf(Context context, Looper looper, ZN zn) {
        this.f16951a = AbstractC1984ut.d(new C1288hw(context, 2));
        this.f16953c = zn;
        this.f16952b = new Handler(looper);
    }

    public final void a(C0729Sj c0729Sj) {
        if (Objects.equals(this.f16954d, c0729Sj)) {
            return;
        }
        this.f16954d = c0729Sj;
        this.f16956f = c0729Sj == null ? 0 : 1;
    }

    public final int b(int i, boolean z6) {
        int iRequestAudioFocus;
        if (i == 1 || this.f16956f != 1) {
            d();
            e(0);
            return 1;
        }
        if (!z6) {
            int i3 = this.f16955e;
            if (i3 == 1) {
                return -1;
            }
            if (i3 == 3) {
                return 0;
            }
        } else if (this.f16955e != 2) {
            if (this.f16958h == null) {
                C0729Sj c0729Sj = C0729Sj.f11224b;
                C0729Sj c0729Sj2 = this.f16954d;
                c0729Sj2.getClass();
                C2077we c2077we = new C2077we(this);
                Handler handler = this.f16952b;
                handler.getClass();
                this.f16958h = new C1809rg(c2077we, handler, c0729Sj2);
            }
            AudioManager audioManager = (AudioManager) this.f16951a.a();
            C1809rg c1809rg = this.f16958h;
            if (Build.VERSION.SDK_INT >= 26) {
                Object obj = c1809rg.f16595d;
                obj.getClass();
                iRequestAudioFocus = audioManager.requestAudioFocus(AbstractC0776Vf.o(obj));
            } else {
                iRequestAudioFocus = audioManager.requestAudioFocus(c1809rg.f16592a, 3, 1);
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
        this.f16953c = null;
        d();
        e(0);
    }

    public final void d() {
        int i = this.f16955e;
        if (i == 1 || i == 0 || this.f16958h == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.f16951a.a();
        C1809rg c1809rg = this.f16958h;
        if (Build.VERSION.SDK_INT < 26) {
            audioManager.abandonAudioFocus(c1809rg.f16592a);
            return;
        }
        Object obj = c1809rg.f16595d;
        obj.getClass();
        audioManager.abandonAudioFocusRequest(AbstractC0776Vf.o(obj));
    }

    public final void e(int i) {
        if (this.f16955e == i) {
            return;
        }
        this.f16955e = i;
        float f2 = i == 4 ? 0.2f : 1.0f;
        if (this.f16957g != f2) {
            this.f16957g = f2;
            ZN zn = this.f16953c;
            if (zn != null) {
                zn.f12866h.c(34);
            }
        }
    }

    public final void f(int i) {
        ZN zn = this.f16953c;
        if (zn != null) {
            Handler handler = zn.f12866h.f14397a;
            C0959bt c0959btG = C1231gt.g();
            c0959btG.f13478a = handler.obtainMessage(33, i, 0);
            c0959btG.a();
        }
    }
}
