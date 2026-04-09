package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import f4.InterfaceFutureC2326a;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class Sy implements My {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f11293a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1692pN f11294b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1692pN f11295c;

    /* renamed from: d, reason: collision with root package name */
    public final C1355jA f11296d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1692pN f11297e;

    /* renamed from: f, reason: collision with root package name */
    public final Yx f11298f;

    /* renamed from: g, reason: collision with root package name */
    public final Xx f11299g;

    public Sy(ExecutorService executorService, InterfaceC1692pN interfaceC1692pN, InterfaceC1692pN interfaceC1692pN2, C1355jA c1355jA, InterfaceC1692pN interfaceC1692pN3, Yx yx, Xx xx) {
        this.f11293a = executorService;
        this.f11294b = interfaceC1692pN;
        this.f11295c = interfaceC1692pN2;
        this.f11296d = c1355jA;
        this.f11297e = interfaceC1692pN3;
        this.f11298f = yx;
        this.f11299g = xx;
    }

    @Override // com.google.android.gms.internal.ads.My
    public final String a() {
        return "1.825731049";
    }

    @Override // com.google.android.gms.internal.ads.My
    public final InterfaceFutureC2326a b(Context context, View view, Activity activity) {
        C1072dy c1072dy = (C1072dy) this.f11298f.c();
        context.getClass();
        c1072dy.f13830c = context;
        c1072dy.f13831d = view;
        c1072dy.f13832e = activity;
        c1072dy.f13833f = true != this.f11299g.J() ? "" : null;
        c1072dy.f13834g = this.f11296d.b(context, view);
        S5 s5C0 = C1136f6.C0();
        s5C0.getClass();
        c1072dy.f13835h = s5C0;
        c1072dy.i = EnumC1450ky.f15316b;
        return ((Xy) ((C1799rN) c1072dy.a().f13695b).c()).a();
    }

    @Override // com.google.android.gms.internal.ads.My
    public final InterfaceFutureC2326a c() {
        return AbstractC1984ut.z(new Zs(5, this), this.f11293a);
    }

    @Override // com.google.android.gms.internal.ads.My
    public final void d(InputEvent inputEvent) {
        if (inputEvent instanceof MotionEvent) {
            Vy vy = (Vy) this.f11297e.c();
            MotionEvent motionEvent = (MotionEvent) inputEvent;
            synchronized (vy) {
                try {
                    if (motionEvent.getAction() == 1) {
                        vy.f12122b = MotionEvent.obtain(motionEvent);
                    }
                    vy.f12123c.a(motionEvent);
                    ArrayDeque arrayDeque = vy.f12121a;
                    if (arrayDeque.size() >= 6) {
                        arrayDeque.remove();
                    }
                    arrayDeque.add(new Uy(motionEvent));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.My
    public final int e() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.My
    public final InterfaceFutureC2326a f(Context context) {
        C1072dy c1072dy = (C1072dy) this.f11298f.c();
        c1072dy.f13830c = context;
        c1072dy.f13834g = this.f11296d.a();
        S5 s5C0 = C1136f6.C0();
        s5C0.getClass();
        c1072dy.f13835h = s5C0;
        c1072dy.i = EnumC1450ky.f15315a;
        return ((Xy) ((C1799rN) c1072dy.a().f13695b).c()).a();
    }

    @Override // com.google.android.gms.internal.ads.My
    public final InterfaceFutureC2326a g(Context context, View view, String str) {
        InterfaceC1692pN interfaceC1692pN = this.f11297e;
        HashMap mapC = this.f11296d.c();
        Vy vy = (Vy) interfaceC1692pN.c();
        synchronized (vy) {
            try {
                MotionEvent motionEvent = vy.f12122b;
                if (motionEvent != null) {
                    mapC.put("nv", motionEvent);
                }
                mapC.put("oe", vy.f12123c);
                ArrayDeque arrayDeque = vy.f12121a;
                mapC.put("ro", arrayDeque.toArray(new Uy[arrayDeque.size()]));
                vy.f12123c = new Ty();
                arrayDeque.clear();
                MotionEvent motionEvent2 = vy.f12122b;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                    vy.f12122b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1072dy c1072dy = (C1072dy) this.f11298f.c();
        context.getClass();
        c1072dy.f13830c = context;
        c1072dy.f13831d = view;
        c1072dy.f13832e = null;
        c1072dy.f13833f = str;
        c1072dy.f13834g = mapC;
        c1072dy.i = EnumC1450ky.f15317c;
        S5 s5C0 = C1136f6.C0();
        s5C0.getClass();
        c1072dy.f13835h = s5C0;
        return ((Xy) ((C1799rN) c1072dy.a().f13695b).c()).a();
    }
}
