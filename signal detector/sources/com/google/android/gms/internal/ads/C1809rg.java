package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.rg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1809rg {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f16592a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f16593b;

    /* renamed from: c, reason: collision with root package name */
    public final C0729Sj f16594c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16595d;

    public C1809rg(C2077we c2077we, Handler handler, C0729Sj c0729Sj) {
        this.f16593b = handler;
        this.f16594c = c0729Sj;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            this.f16592a = new C1109eg(c2077we, handler);
        } else {
            this.f16592a = c2077we;
        }
        this.f16595d = i >= 26 ? AbstractC0776Vf.j().setAudioAttributes(c0729Sj.a()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(c2077we, handler).build() : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1809rg)) {
            return false;
        }
        C1809rg c1809rg = (C1809rg) obj;
        c1809rg.getClass();
        return Objects.equals(this.f16592a, c1809rg.f16592a) && Objects.equals(this.f16593b, c1809rg.f16593b) && Objects.equals(this.f16594c, c1809rg.f16594c);
    }

    public final int hashCode() {
        return Objects.hash(1, this.f16592a, this.f16593b, this.f16594c, Boolean.FALSE);
    }
}
