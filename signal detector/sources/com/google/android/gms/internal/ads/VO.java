package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import g0.C2328a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class VO {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11987a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11988b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11989c;

    /* renamed from: d, reason: collision with root package name */
    public int f11990d;

    /* renamed from: e, reason: collision with root package name */
    public int f11991e;

    /* renamed from: f, reason: collision with root package name */
    public int f11992f;

    public /* synthetic */ VO(VO vo) {
        this.f11987a = (TP) vo.f11987a;
        this.f11988b = (C0729Sj) vo.f11988b;
        this.f11989c = (AudioDeviceInfo) vo.f11989c;
        this.f11990d = vo.f11990d;
        this.f11991e = vo.f11991e;
        this.f11992f = vo.f11992f;
    }

    public void a() {
        this.f11990d = 1;
        this.f11988b = (f0.s) this.f11987a;
        this.f11992f = 0;
    }

    public boolean b() {
        C2328a c2328aB = ((f0.s) this.f11988b).f20017b.b();
        int iA = c2328aB.a(6);
        return !(iA == 0 || ((ByteBuffer) c2328aB.f3262d).get(iA + c2328aB.f3259a) == 0) || this.f11991e == 65039;
    }

    public VO(TP tp) {
        this.f11987a = tp;
        this.f11988b = C0729Sj.f11224b;
        this.f11990d = 0;
        this.f11991e = -1;
        this.f11992f = -1;
    }

    public VO(f0.s sVar) {
        this.f11990d = 1;
        this.f11987a = sVar;
        this.f11988b = sVar;
    }
}
