package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Yn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0835Yn implements Nu {

    /* renamed from: b, reason: collision with root package name */
    public final C0750Tn f12704b;

    /* renamed from: c, reason: collision with root package name */
    public final Q2.a f12705c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f12703a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f12706d = new HashMap();

    public C0835Yn(C0750Tn c0750Tn, Set set, Q2.a aVar) {
        this.f12704b = c0750Tn;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C0818Xn c0818Xn = (C0818Xn) it.next();
            HashMap map = this.f12706d;
            c0818Xn.getClass();
            map.put(Ku.RENDERER, c0818Xn);
        }
        this.f12705c = aVar;
    }

    public final void b(Ku ku, boolean z6) {
        C0818Xn c0818Xn = (C0818Xn) this.f12706d.get(ku);
        if (c0818Xn == null) {
            return;
        }
        String str = true != z6 ? "f." : "s.";
        Ku ku2 = c0818Xn.f12491b;
        HashMap map = this.f12703a;
        if (map.containsKey(ku2)) {
            this.f12705c.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(ku2)).longValue();
            String str2 = c0818Xn.f12490a;
            ConcurrentHashMap concurrentHashMap = this.f12704b.f11457a;
            StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 2);
            sb.append(str);
            sb.append(jElapsedRealtime);
            concurrentHashMap.put("label.".concat(str2), sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.Nu
    public final void p(Ku ku, String str, Throwable th) {
        HashMap map = this.f12703a;
        if (map.containsKey(ku)) {
            this.f12705c.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(ku)).longValue();
            this.f12704b.f11457a.put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.f12706d.containsKey(ku)) {
            b(ku, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.Nu
    public final void x(Ku ku, String str) {
        this.f12705c.getClass();
        this.f12703a.put(ku, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.Nu
    public final void y(Ku ku, String str) {
        HashMap map = this.f12703a;
        if (map.containsKey(ku)) {
            this.f12705c.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(ku)).longValue();
            this.f12704b.f11457a.put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.f12706d.containsKey(ku)) {
            b(ku, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.Nu
    public final void a(String str) {
    }
}
