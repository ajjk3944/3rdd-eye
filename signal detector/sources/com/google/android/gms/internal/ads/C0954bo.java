package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import q2.C2841s;
import t2.C2909E;

/* renamed from: com.google.android.gms.internal.ads.bo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0954bo {

    /* renamed from: e, reason: collision with root package name */
    public final String f13470e;

    /* renamed from: f, reason: collision with root package name */
    public final C0852Zn f13471f;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13467b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f13468c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13469d = false;

    /* renamed from: a, reason: collision with root package name */
    public final C2909E f13466a = p2.j.f22785C.f22795h.i();

    public C0954bo(C0852Zn c0852Zn, String str) {
        this.f13470e = str;
        this.f13471f = c0852Zn;
    }

    public final synchronized void a(String str) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8850w2)).booleanValue()) {
            HashMap mapE = e();
            mapE.put("action", "adapter_init_started");
            mapE.put("ancn", str);
            this.f13467b.add(mapE);
        }
    }

    public final synchronized void b(String str) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8850w2)).booleanValue()) {
            HashMap mapE = e();
            mapE.put("action", "adapter_init_finished");
            mapE.put("ancn", str);
            this.f13467b.add(mapE);
        }
    }

    public final synchronized void c(String str, String str2) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8850w2)).booleanValue()) {
            HashMap mapE = e();
            mapE.put("action", "adapter_init_finished");
            mapE.put("ancn", str);
            mapE.put("rqe", str2);
            this.f13467b.add(mapE);
        }
    }

    public final synchronized void d() {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8850w2)).booleanValue() && !this.f13468c) {
            HashMap mapE = e();
            mapE.put("action", "init_started");
            this.f13467b.add(mapE);
            this.f13468c = true;
        }
    }

    public final HashMap e() {
        C0852Zn c0852Zn = this.f13471f;
        c0852Zn.getClass();
        HashMap map = new HashMap(c0852Zn.f12958a);
        p2.j.f22785C.f22797k.getClass();
        map.put("tms", Long.toString(SystemClock.elapsedRealtime(), 10));
        map.put("tid", this.f13466a.E() ? "" : this.f13470e);
        return map;
    }
}
