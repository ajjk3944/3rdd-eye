package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wd0 {

    /* renamed from: e, reason: collision with root package name */
    public final String f17987e;

    /* renamed from: f, reason: collision with root package name */
    public final ud0 f17988f;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f17984b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f17985c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17986d = false;

    /* renamed from: a, reason: collision with root package name */
    public final ya.c0 f17983a = ua.j.C.f35265h.i();

    public wd0(ud0 ud0Var, String str) {
        this.f17987e = str;
        this.f17988f = ud0Var;
    }

    public final synchronized void a(String str) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16379w2)).booleanValue()) {
            HashMap mapE = e();
            mapE.put("action", "adapter_init_started");
            mapE.put("ancn", str);
            this.f17984b.add(mapE);
        }
    }

    public final synchronized void b(String str) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16379w2)).booleanValue()) {
            HashMap mapE = e();
            mapE.put("action", "adapter_init_finished");
            mapE.put("ancn", str);
            this.f17984b.add(mapE);
        }
    }

    public final synchronized void c(String str, String str2) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16379w2)).booleanValue()) {
            HashMap mapE = e();
            mapE.put("action", "adapter_init_finished");
            mapE.put("ancn", str);
            mapE.put("rqe", str2);
            this.f17984b.add(mapE);
        }
    }

    public final synchronized void d() {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16379w2)).booleanValue() && !this.f17985c) {
            HashMap mapE = e();
            mapE.put("action", "init_started");
            this.f17984b.add(mapE);
            this.f17985c = true;
        }
    }

    public final HashMap e() {
        ud0 ud0Var = this.f17988f;
        ud0Var.getClass();
        HashMap map = new HashMap(ud0Var.f17174a);
        ua.j.C.f35267k.getClass();
        map.put("tms", Long.toString(SystemClock.elapsedRealtime(), 10));
        map.put("tid", this.f17983a.E() ? "" : this.f17987e);
        return map;
    }
}
