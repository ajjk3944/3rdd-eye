package io.appmetrica.analytics.impl;

import android.content.Context;
import c9.C2092m;
import c9.C2095p;
import io.appmetrica.analytics.AppMetricaConfig;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class Db {

    /* renamed from: a, reason: collision with root package name */
    public final C4756l2 f39296a = new C4756l2();

    /* renamed from: b, reason: collision with root package name */
    public final D6 f39297b = new D6();

    /* renamed from: c, reason: collision with root package name */
    public C4984tn f39298c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f39299d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f39300e;

    public final synchronized void a(Context context, AppMetricaConfig appMetricaConfig, InterfaceC4791mb interfaceC4791mb) {
        if (this.f39300e) {
            return;
        }
        C2095p.c0(this.f39297b.f39288a, new Ya[]{this.f39296a.a(context, appMetricaConfig, interfaceC4791mb)});
        this.f39300e = true;
    }

    public final synchronized void b() {
        if (this.f39299d) {
            return;
        }
        D6 d62 = this.f39297b;
        ArrayList arrayList = C5065x4.l().i.f41029a;
        ArrayList arrayList2 = new ArrayList(C2092m.T(arrayList, 10));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        d62.f39288a.addAll(arrayList2);
        this.f39299d = true;
    }

    public final synchronized void c() {
        try {
            if (this.f39298c != null) {
                return;
            }
            U1 u12 = new U1(this.f39297b);
            this.f39298c = new C4984tn(u12);
            C4958sn c4958sn = new C4958sn();
            c4958sn.f41651a.add(u12);
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                c4958sn.f41651a.add(defaultUncaughtExceptionHandler);
            }
            Thread.setDefaultUncaughtExceptionHandler(c4958sn);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a() {
        this.f39297b.f39288a.clear();
        this.f39299d = false;
        this.f39300e = false;
    }
}
