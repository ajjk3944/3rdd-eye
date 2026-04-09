package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y50 {

    /* renamed from: a, reason: collision with root package name */
    public Context f18642a;

    /* renamed from: b, reason: collision with root package name */
    public Object f18643b;

    /* renamed from: c, reason: collision with root package name */
    public Object f18644c;

    /* renamed from: d, reason: collision with root package name */
    public Object f18645d;

    /* renamed from: e, reason: collision with root package name */
    public Object f18646e;

    /* renamed from: f, reason: collision with root package name */
    public Object f18647f;
    public int g;

    public y50() {
        this.g = 0;
    }

    public iq a() {
        yr0 yr0VarC = d7.C(6, this.f18642a);
        yr0VarC.b();
        iq iqVar = new iq();
        ya.a0.m("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        fx.f11279f.execute(new q81(7, this, iqVar));
        ya.a0.m("loadNewJavascriptEngine: Promise created");
        iqVar.v(new fq(this, iqVar, yr0VarC), new fq(this, iqVar, yr0VarC));
        return iqVar;
    }

    public y50 b() {
        y50 y50Var = new y50();
        y50Var.f18642a = this.f18642a;
        y50Var.f18643b = (hq0) this.f18643b;
        y50Var.f18644c = (Bundle) this.f18644c;
        y50Var.f18646e = (pq0) this.f18646e;
        y50Var.f18647f = (ei0) this.f18647f;
        return y50Var;
    }

    public hq c() {
        ya.a0.m("getEngine: Trying to acquire lock");
        Object obj = this.f18643b;
        synchronized (obj) {
            try {
                ya.a0.m("getEngine: Lock acquired");
                ya.a0.m("refreshIfDestroyed: Trying to acquire lock");
                synchronized (obj) {
                    try {
                        ya.a0.m("refreshIfDestroyed: Lock acquired");
                        iq iqVar = (iq) this.f18647f;
                        if (iqVar != null && this.g == 0) {
                            iqVar.v(new mx0(11, this), hl.f11904b);
                        }
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ya.a0.m("refreshIfDestroyed: Lock released");
        iq iqVar2 = (iq) this.f18647f;
        if (iqVar2 != null && ((AtomicInteger) iqVar2.f1326b).get() != -1) {
            int i4 = this.g;
            if (i4 == 0) {
                ya.a0.m("getEngine (NO_UPDATE): Lock released");
                return ((iq) this.f18647f).y();
            }
            if (i4 != 1) {
                ya.a0.m("getEngine (UPDATING): Lock released");
                return ((iq) this.f18647f).y();
            }
            this.g = 2;
            a();
            ya.a0.m("getEngine (PENDING_UPDATE): Lock released");
            return ((iq) this.f18647f).y();
        }
        this.g = 2;
        this.f18647f = a();
        ya.a0.m("getEngine (NULL or REJECTED): Lock released");
        return ((iq) this.f18647f).y();
    }

    public /* synthetic */ y50(y50 y50Var) {
        this.f18642a = y50Var.f18642a;
        this.f18643b = (hq0) y50Var.f18643b;
        this.f18644c = (Bundle) y50Var.f18644c;
        this.f18645d = (eq0) y50Var.f18645d;
        this.f18646e = (pq0) y50Var.f18646e;
        this.f18647f = (ei0) y50Var.f18647f;
        this.g = y50Var.g;
    }
}
