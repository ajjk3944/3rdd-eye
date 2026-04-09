package r1;

import A9.C0575f;
import A9.E;
import A9.F;
import A9.U;
import F9.q;
import I9.c;
import K6.C0707a;
import Q9.r;
import android.content.Context;
import android.os.Build;
import b9.C1992A;
import b9.n;
import f9.InterfaceC4347e;
import h9.e;
import h9.i;
import kotlin.jvm.internal.l;
import o1.C5409a;
import p1.b;
import p9.p;
import t1.C5594a;
import t1.C5595b;
import t1.C5597d;
import t1.C5598e;
import t1.C5599f;

/* compiled from: TopicsManagerFutures.kt */
/* renamed from: r1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5515a {

    /* compiled from: TopicsManagerFutures.kt */
    /* renamed from: r1.a$a, reason: collision with other inner class name */
    public static final class C0520a extends AbstractC5515a {

        /* renamed from: a, reason: collision with root package name */
        public final C5599f f45668a;

        /* compiled from: TopicsManagerFutures.kt */
        @e(c = "androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1", f = "TopicsManagerFutures.kt", l = {56}, m = "invokeSuspend")
        /* renamed from: r1.a$a$a, reason: collision with other inner class name */
        public static final class C0521a extends i implements p<E, InterfaceC4347e<? super C5595b>, Object> {

            /* renamed from: l, reason: collision with root package name */
            public int f45669l;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ C5594a f45671n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0521a(C5594a c5594a, InterfaceC4347e<? super C0521a> interfaceC4347e) {
                super(2, interfaceC4347e);
                this.f45671n = c5594a;
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                return C0520a.this.new C0521a(this.f45671n, interfaceC4347e);
            }

            @Override // p9.p
            public final Object invoke(E e4, InterfaceC4347e<? super C5595b> interfaceC4347e) {
                return ((C0521a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) {
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                int i = this.f45669l;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n.b(obj);
                    return obj;
                }
                n.b(obj);
                C0520a c0520a = C0520a.this;
                this.f45669l = 1;
                Object objJ0 = c0520a.f45668a.j0(this.f45671n, this);
                return objJ0 == aVar ? aVar : objJ0;
            }
        }

        public C0520a(C5599f c5599f) {
            this.f45668a = c5599f;
        }

        public A4.a<C5595b> b(C5594a request) {
            l.f(request, "request");
            c cVar = U.f211a;
            return b.a(C0575f.b(F.a(q.f1782a), null, new C0521a(request, null), 3));
        }
    }

    public static final C0520a a(Context context) {
        C5599f c5597d;
        l.f(context, "context");
        int i = Build.VERSION.SDK_INT;
        C5409a c5409a = C5409a.f44805a;
        if ((i >= 30 ? c5409a.a() : 0) >= 5) {
            Object systemService = context.getSystemService((Class<Object>) r.c());
            l.e(systemService, "context.getSystemService…opicsManager::class.java)");
            c5597d = new C5598e(C0707a.d(systemService));
        } else {
            if ((i >= 30 ? c5409a.a() : 0) == 4) {
                Object systemService2 = context.getSystemService((Class<Object>) r.c());
                l.e(systemService2, "context.getSystemService…opicsManager::class.java)");
                c5597d = new C5597d(C0707a.d(systemService2));
            } else {
                c5597d = null;
            }
        }
        if (c5597d != null) {
            return new C0520a(c5597d);
        }
        return null;
    }
}
