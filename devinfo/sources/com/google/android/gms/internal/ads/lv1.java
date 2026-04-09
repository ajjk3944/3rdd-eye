package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lv1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13643a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13644b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13645c;

    /* renamed from: d, reason: collision with root package name */
    public int f13646d;

    /* renamed from: e, reason: collision with root package name */
    public int f13647e;

    /* renamed from: f, reason: collision with root package name */
    public int f13648f;

    public /* synthetic */ lv1(lv1 lv1Var) {
        this.f13643a = (mx1) lv1Var.f13643a;
        this.f13644b = (p50) lv1Var.f13644b;
        this.f13645c = (AudioDeviceInfo) lv1Var.f13645c;
        this.f13646d = lv1Var.f13646d;
        this.f13647e = lv1Var.f13647e;
        this.f13648f = lv1Var.f13648f;
    }

    public void a() {
        this.f13646d = 1;
        this.f13644b = (w4.p) this.f13643a;
        this.f13648f = 0;
    }

    public boolean b() {
        x4.a aVarB = ((w4.p) this.f13644b).f36454b.b();
        int iA = aVarB.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarB.f446d).get(iA + aVarB.f443a) == 0) || this.f13647e == 65039;
    }

    public lv1(mx1 mx1Var) {
        this.f13643a = mx1Var;
        this.f13644b = p50.f14899b;
        this.f13646d = 0;
        this.f13647e = -1;
        this.f13648f = -1;
    }

    public lv1(w4.p pVar) {
        this.f13646d = 1;
        this.f13643a = pVar;
        this.f13644b = pVar;
    }
}
