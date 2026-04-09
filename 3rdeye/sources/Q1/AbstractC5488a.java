package q1;

import A9.C0575f;
import A9.E;
import A9.F;
import A9.U;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.InputEvent;
import b9.C1992A;
import b9.n;
import f9.InterfaceC4347e;
import h9.e;
import h9.i;
import kotlin.jvm.internal.l;
import o1.C5409a;
import p9.p;
import s1.AbstractC5547c;
import s1.C5545a;
import s1.C5548d;
import s1.C5549e;

/* compiled from: MeasurementManagerFutures.kt */
/* renamed from: q1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5488a {

    /* compiled from: MeasurementManagerFutures.kt */
    /* renamed from: q1.a$a, reason: collision with other inner class name */
    public static final class C0513a extends AbstractC5488a {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC5547c.a f45318a;

        /* compiled from: MeasurementManagerFutures.kt */
        @e(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f = "MeasurementManagerFutures.kt", l = {169}, m = "invokeSuspend")
        /* renamed from: q1.a$a$a, reason: collision with other inner class name */
        public static final class C0514a extends i implements p<E, InterfaceC4347e<? super Integer>, Object> {

            /* renamed from: l, reason: collision with root package name */
            public int f45319l;

            public C0514a(InterfaceC4347e<? super C0514a> interfaceC4347e) {
                super(2, interfaceC4347e);
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                return C0513a.this.new C0514a(interfaceC4347e);
            }

            @Override // p9.p
            public final Object invoke(E e4, InterfaceC4347e<? super Integer> interfaceC4347e) {
                return ((C0514a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) {
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                int i = this.f45319l;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n.b(obj);
                    return obj;
                }
                n.b(obj);
                C0513a c0513a = C0513a.this;
                this.f45319l = 1;
                Object objB = c0513a.f45318a.b(this);
                return objB == aVar ? aVar : objB;
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @e(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {133}, m = "invokeSuspend")
        /* renamed from: q1.a$a$b */
        public static final class b extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

            /* renamed from: l, reason: collision with root package name */
            public int f45321l;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ Uri f45323n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ InputEvent f45324o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Uri uri, InputEvent inputEvent, InterfaceC4347e<? super b> interfaceC4347e) {
                super(2, interfaceC4347e);
                this.f45323n = uri;
                this.f45324o = inputEvent;
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                return C0513a.this.new b(this.f45323n, this.f45324o, interfaceC4347e);
            }

            @Override // p9.p
            public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
                return ((b) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) {
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                int i = this.f45321l;
                if (i == 0) {
                    n.b(obj);
                    C0513a c0513a = C0513a.this;
                    this.f45321l = 1;
                    if (c0513a.f45318a.c(this.f45323n, this.f45324o, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n.b(obj);
                }
                return C1992A.f18074a;
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @e(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {141}, m = "invokeSuspend")
        /* renamed from: q1.a$a$c */
        public static final class c extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

            /* renamed from: l, reason: collision with root package name */
            public int f45325l;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ Uri f45327n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Uri uri, InterfaceC4347e<? super c> interfaceC4347e) {
                super(2, interfaceC4347e);
                this.f45327n = uri;
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                return C0513a.this.new c(this.f45327n, interfaceC4347e);
            }

            @Override // p9.p
            public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
                return ((c) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) {
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                int i = this.f45325l;
                if (i == 0) {
                    n.b(obj);
                    C0513a c0513a = C0513a.this;
                    this.f45325l = 1;
                    if (c0513a.f45318a.d(this.f45327n, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n.b(obj);
                }
                return C1992A.f18074a;
            }
        }

        public C0513a(AbstractC5547c.a aVar) {
            this.f45318a = aVar;
        }

        @Override // q1.AbstractC5488a
        public A4.a<C1992A> b(Uri attributionSource, InputEvent inputEvent) {
            l.f(attributionSource, "attributionSource");
            return p1.b.a(C0575f.b(F.a(U.f211a), null, new b(attributionSource, inputEvent, null), 3));
        }

        public A4.a<C1992A> c(C5545a deletionRequest) {
            l.f(deletionRequest, "deletionRequest");
            throw null;
        }

        public A4.a<Integer> d() {
            return p1.b.a(C0575f.b(F.a(U.f211a), null, new C0514a(null), 3));
        }

        public A4.a<C1992A> e(Uri trigger) {
            l.f(trigger, "trigger");
            return p1.b.a(C0575f.b(F.a(U.f211a), null, new c(trigger, null), 3));
        }

        public A4.a<C1992A> f(C5548d request) {
            l.f(request, "request");
            throw null;
        }

        public A4.a<C1992A> g(C5549e request) {
            l.f(request, "request");
            throw null;
        }
    }

    public static final C0513a a(Context context) {
        l.f(context, "context");
        StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
        int i = Build.VERSION.SDK_INT;
        C5409a c5409a = C5409a.f44805a;
        sb.append(i >= 30 ? c5409a.a() : 0);
        Log.d("MeasurementManager", sb.toString());
        AbstractC5547c.a aVar = (i >= 30 ? c5409a.a() : 0) >= 5 ? new AbstractC5547c.a(context) : null;
        if (aVar != null) {
            return new C0513a(aVar);
        }
        return null;
    }

    public abstract A4.a<C1992A> b(Uri uri, InputEvent inputEvent);
}
