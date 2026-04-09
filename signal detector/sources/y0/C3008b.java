package y0;

import N.f;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import c5.C0412i;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import p.ExecutorC2766a;
import q5.i;
import u1.v;
import z5.C3030f;

/* renamed from: y0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3008b {

    /* renamed from: a, reason: collision with root package name */
    public final MeasurementManager f24205a;

    public C3008b(Context context) {
        Object systemService = context.getSystemService((Class<Object>) v.k());
        i.d(systemService, "context.getSystemService…:class.java\n            )");
        this.f24205a = v.c(systemService);
    }

    public Object a(AbstractC3007a abstractC3007a, InterfaceC2370d interfaceC2370d) {
        new C3030f(1, com.bumptech.glide.c.B(interfaceC2370d)).t();
        v.m();
        throw null;
    }

    public Object b(InterfaceC2370d interfaceC2370d) {
        C3030f c3030f = new C3030f(1, com.bumptech.glide.c.B(interfaceC2370d));
        c3030f.t();
        this.f24205a.getMeasurementApiStatus(new ExecutorC2766a(1), new f(c3030f));
        return c3030f.s();
    }

    public Object c(Uri uri, InputEvent inputEvent, InterfaceC2370d interfaceC2370d) {
        C3030f c3030f = new C3030f(1, com.bumptech.glide.c.B(interfaceC2370d));
        c3030f.t();
        this.f24205a.registerSource(uri, inputEvent, new ExecutorC2766a(1), new f(c3030f));
        Object objS = c3030f.s();
        return objS == EnumC2380a.f20635a ? objS : C0412i.f5929a;
    }

    public Object d(Uri uri, InterfaceC2370d interfaceC2370d) {
        C3030f c3030f = new C3030f(1, com.bumptech.glide.c.B(interfaceC2370d));
        c3030f.t();
        this.f24205a.registerTrigger(uri, new ExecutorC2766a(1), new f(c3030f));
        Object objS = c3030f.s();
        return objS == EnumC2380a.f20635a ? objS : C0412i.f5929a;
    }

    public Object e(AbstractC3009c abstractC3009c, InterfaceC2370d interfaceC2370d) {
        new C3030f(1, com.bumptech.glide.c.B(interfaceC2370d)).t();
        v.u();
        throw null;
    }

    public Object f(AbstractC3010d abstractC3010d, InterfaceC2370d interfaceC2370d) {
        new C3030f(1, com.bumptech.glide.c.B(interfaceC2370d)).t();
        v.v();
        throw null;
    }
}
