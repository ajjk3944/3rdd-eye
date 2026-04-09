package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicInteger;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.ak, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0895ak {

    /* renamed from: a, reason: collision with root package name */
    public Context f13213a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13214b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13215c;

    /* renamed from: d, reason: collision with root package name */
    public Object f13216d;

    /* renamed from: e, reason: collision with root package name */
    public Object f13217e;

    /* renamed from: f, reason: collision with root package name */
    public Object f13218f;

    /* renamed from: g, reason: collision with root package name */
    public int f13219g;

    public C0895ak() {
        this.f13219g = 0;
    }

    public C2021vc a() {
        Su suY = AbstractC1135f5.y(this.f13213a, 6);
        suY.a();
        C2021vc c2021vc = new C2021vc();
        AbstractC2907C.m("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        AbstractC0640Nf.f10010f.execute(new CD(this, 7, c2021vc));
        AbstractC2907C.m("loadNewJavascriptEngine: Promise created");
        c2021vc.A(new C1859sc(this, c2021vc, suY), new C1859sc(this, c2021vc, suY));
        return c2021vc;
    }

    public C0895ak b() {
        C0895ak c0895ak = new C0895ak();
        c0895ak.f13213a = this.f13213a;
        c0895ak.f13214b = (C0960bu) this.f13214b;
        c0895ak.f13215c = (Bundle) this.f13215c;
        c0895ak.f13217e = (C1338iu) this.f13217e;
        c0895ak.f13218f = (C1228gq) this.f13218f;
        return c0895ak;
    }

    public C1967uc c() {
        AbstractC2907C.m("getEngine: Trying to acquire lock");
        Object obj = this.f13214b;
        synchronized (obj) {
            try {
                AbstractC2907C.m("getEngine: Lock acquired");
                AbstractC2907C.m("refreshIfDestroyed: Trying to acquire lock");
                synchronized (obj) {
                    try {
                        AbstractC2907C.m("refreshIfDestroyed: Lock acquired");
                        C2021vc c2021vc = (C2021vc) this.f13218f;
                        if (c2021vc != null && this.f13219g == 0) {
                            c2021vc.A(new L6(7, this), W9.f12179b);
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC2907C.m("refreshIfDestroyed: Lock released");
        C2021vc c2021vc2 = (C2021vc) this.f13218f;
        if (c2021vc2 != null && ((AtomicInteger) c2021vc2.f663b).get() != -1) {
            int i = this.f13219g;
            if (i == 0) {
                AbstractC2907C.m("getEngine (NO_UPDATE): Lock released");
                return ((C2021vc) this.f13218f).D();
            }
            if (i != 1) {
                AbstractC2907C.m("getEngine (UPDATING): Lock released");
                return ((C2021vc) this.f13218f).D();
            }
            this.f13219g = 2;
            a();
            AbstractC2907C.m("getEngine (PENDING_UPDATE): Lock released");
            return ((C2021vc) this.f13218f).D();
        }
        this.f13219g = 2;
        this.f13218f = a();
        AbstractC2907C.m("getEngine (NULL or REJECTED): Lock released");
        return ((C2021vc) this.f13218f).D();
    }

    public /* synthetic */ C0895ak(C0895ak c0895ak) {
        this.f13213a = c0895ak.f13213a;
        this.f13214b = (C0960bu) c0895ak.f13214b;
        this.f13215c = (Bundle) c0895ak.f13215c;
        this.f13216d = (Yt) c0895ak.f13216d;
        this.f13217e = (C1338iu) c0895ak.f13217e;
        this.f13218f = (C1228gq) c0895ak.f13218f;
        this.f13219g = c0895ak.f13219g;
    }
}
