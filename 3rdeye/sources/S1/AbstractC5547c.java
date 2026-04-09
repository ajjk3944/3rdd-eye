package s1;

import A9.C0583j;
import G0.g;
import K6.C0707a;
import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import b9.C1992A;
import f9.InterfaceC4347e;
import kotlin.jvm.internal.l;

/* compiled from: MeasurementManager.kt */
/* renamed from: s1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5547c {

    /* compiled from: MeasurementManager.kt */
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    /* renamed from: s1.c$a */
    public static final class a extends AbstractC5547c {

        /* renamed from: a, reason: collision with root package name */
        public final MeasurementManager f45956a;

        public a(Context context) {
            l.f(context, "context");
            Object systemService = context.getSystemService((Class<Object>) O8.b.c());
            l.e(systemService, "context.getSystemService…:class.java\n            )");
            this.f45956a = O8.c.b(systemService);
        }

        public Object a(C5545a c5545a, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            new C0583j(1, com.google.gson.internal.c.r(interfaceC4347e)).s();
            C0707a.g();
            throw null;
        }

        public Object b(InterfaceC4347e<? super Integer> interfaceC4347e) {
            C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(interfaceC4347e));
            c0583j.s();
            this.f45956a.getMeasurementApiStatus(new ExecutorC5546b(), new g(c0583j));
            Object objR = c0583j.r();
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            return objR;
        }

        public Object c(Uri uri, InputEvent inputEvent, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(interfaceC4347e));
            c0583j.s();
            this.f45956a.registerSource(uri, inputEvent, new ExecutorC5546b(), new g(c0583j));
            Object objR = c0583j.r();
            return objR == g9.a.COROUTINE_SUSPENDED ? objR : C1992A.f18074a;
        }

        public Object d(Uri uri, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(interfaceC4347e));
            c0583j.s();
            this.f45956a.registerTrigger(uri, new ExecutorC5546b(), new g(c0583j));
            Object objR = c0583j.r();
            return objR == g9.a.COROUTINE_SUSPENDED ? objR : C1992A.f18074a;
        }

        public Object e(C5548d c5548d, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            new C0583j(1, com.google.gson.internal.c.r(interfaceC4347e)).s();
            O8.b.e();
            throw null;
        }

        public Object f(C5549e c5549e, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            new C0583j(1, com.google.gson.internal.c.r(interfaceC4347e)).s();
            O8.c.h();
            throw null;
        }
    }
}
