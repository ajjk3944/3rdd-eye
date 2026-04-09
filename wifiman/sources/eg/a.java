package Eg;

import Dj.b;
import gg.AbstractC5912b;
import gg.B;
import gg.InterfaceC5914d;
import gg.i;
import gg.p;
import gg.s;
import gg.x;
import gg.y;
import gg.z;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import jg.AbstractC6327a;
import kg.InterfaceC6465b;
import kg.InterfaceC6467d;
import kg.InterfaceC6469f;
import kg.n;
import kg.q;
import wg.d;
import wg.o;
import zg.AbstractC8755h;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    static volatile InterfaceC6469f f4734a;

    /* renamed from: b, reason: collision with root package name */
    static volatile n f4735b;

    /* renamed from: c, reason: collision with root package name */
    static volatile n f4736c;

    /* renamed from: d, reason: collision with root package name */
    static volatile n f4737d;

    /* renamed from: e, reason: collision with root package name */
    static volatile n f4738e;

    /* renamed from: f, reason: collision with root package name */
    static volatile n f4739f;

    /* renamed from: g, reason: collision with root package name */
    static volatile n f4740g;

    /* renamed from: h, reason: collision with root package name */
    static volatile n f4741h;

    /* renamed from: i, reason: collision with root package name */
    static volatile n f4742i;

    /* renamed from: j, reason: collision with root package name */
    static volatile n f4743j;

    /* renamed from: k, reason: collision with root package name */
    static volatile n f4744k;

    /* renamed from: l, reason: collision with root package name */
    static volatile n f4745l;

    /* renamed from: m, reason: collision with root package name */
    static volatile n f4746m;

    /* renamed from: n, reason: collision with root package name */
    static volatile n f4747n;

    /* renamed from: o, reason: collision with root package name */
    static volatile n f4748o;

    /* renamed from: p, reason: collision with root package name */
    static volatile n f4749p;

    /* renamed from: q, reason: collision with root package name */
    static volatile InterfaceC6465b f4750q;

    /* renamed from: r, reason: collision with root package name */
    static volatile InterfaceC6465b f4751r;

    /* renamed from: s, reason: collision with root package name */
    static volatile InterfaceC6465b f4752s;

    /* renamed from: t, reason: collision with root package name */
    static volatile InterfaceC6465b f4753t;

    /* renamed from: u, reason: collision with root package name */
    static volatile InterfaceC6465b f4754u;

    /* renamed from: v, reason: collision with root package name */
    static volatile InterfaceC6467d f4755v;

    /* renamed from: w, reason: collision with root package name */
    static volatile boolean f4756w;

    /* renamed from: x, reason: collision with root package name */
    static volatile boolean f4757x;

    public static InterfaceC5914d A(AbstractC5912b abstractC5912b, InterfaceC5914d interfaceC5914d) {
        InterfaceC6465b interfaceC6465b = f4754u;
        return interfaceC6465b != null ? (InterfaceC5914d) a(interfaceC6465b, abstractC5912b, interfaceC5914d) : interfaceC5914d;
    }

    public static p B(gg.n nVar, p pVar) {
        InterfaceC6465b interfaceC6465b = f4751r;
        return interfaceC6465b != null ? (p) a(interfaceC6465b, nVar, pVar) : pVar;
    }

    public static x C(s sVar, x xVar) {
        InterfaceC6465b interfaceC6465b = f4752s;
        return interfaceC6465b != null ? (x) a(interfaceC6465b, sVar, xVar) : xVar;
    }

    public static B D(z zVar, B b10) {
        InterfaceC6465b interfaceC6465b = f4753t;
        return interfaceC6465b != null ? (B) a(interfaceC6465b, zVar, b10) : b10;
    }

    public static void E(InterfaceC6469f interfaceC6469f) {
        if (f4756w) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f4734a = interfaceC6469f;
    }

    static void F(Throwable th2) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
    }

    static Object a(InterfaceC6465b interfaceC6465b, Object obj, Object obj2) {
        try {
            return interfaceC6465b.apply(obj, obj2);
        } catch (Throwable th2) {
            throw AbstractC8755h.h(th2);
        }
    }

    static Object b(n nVar, Object obj) {
        try {
            return nVar.apply(obj);
        } catch (Throwable th2) {
            throw AbstractC8755h.h(th2);
        }
    }

    static y c(n nVar, q qVar) {
        Object objB = b(nVar, qVar);
        Objects.requireNonNull(objB, "Scheduler Supplier result can't be null");
        return (y) objB;
    }

    static y d(q qVar) {
        try {
            Object obj = qVar.get();
            Objects.requireNonNull(obj, "Scheduler Supplier result can't be null");
            return (y) obj;
        } catch (Throwable th2) {
            throw AbstractC8755h.h(th2);
        }
    }

    public static y e(Executor executor, boolean z10, boolean z11) {
        return new d(executor, z10, z11);
    }

    public static y f(ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory is null");
        return new o(threadFactory);
    }

    public static y g(q qVar) {
        Objects.requireNonNull(qVar, "Scheduler Supplier can't be null");
        n nVar = f4736c;
        return nVar == null ? d(qVar) : c(nVar, qVar);
    }

    public static y h(q qVar) {
        Objects.requireNonNull(qVar, "Scheduler Supplier can't be null");
        n nVar = f4738e;
        return nVar == null ? d(qVar) : c(nVar, qVar);
    }

    public static y i(q qVar) {
        Objects.requireNonNull(qVar, "Scheduler Supplier can't be null");
        n nVar = f4739f;
        return nVar == null ? d(qVar) : c(nVar, qVar);
    }

    public static y j(q qVar) {
        Objects.requireNonNull(qVar, "Scheduler Supplier can't be null");
        n nVar = f4737d;
        return nVar == null ? d(qVar) : c(nVar, qVar);
    }

    static boolean k(Throwable th2) {
        return (th2 instanceof OnErrorNotImplementedException) || (th2 instanceof MissingBackpressureException) || (th2 instanceof QueueOverflowException) || (th2 instanceof IllegalStateException) || (th2 instanceof NullPointerException) || (th2 instanceof IllegalArgumentException) || (th2 instanceof CompositeException);
    }

    public static boolean l() {
        return f4757x;
    }

    public static Bg.a m(Bg.a aVar) {
        n nVar = f4746m;
        return nVar != null ? (Bg.a) b(nVar, aVar) : aVar;
    }

    public static AbstractC5912b n(AbstractC5912b abstractC5912b) {
        n nVar = f4749p;
        return nVar != null ? (AbstractC5912b) b(nVar, abstractC5912b) : abstractC5912b;
    }

    public static i o(i iVar) {
        n nVar = f4743j;
        return nVar != null ? (i) b(nVar, iVar) : iVar;
    }

    public static gg.n p(gg.n nVar) {
        n nVar2 = f4747n;
        return nVar2 != null ? (gg.n) b(nVar2, nVar) : nVar;
    }

    public static s q(s sVar) {
        n nVar = f4745l;
        return nVar != null ? (s) b(nVar, sVar) : sVar;
    }

    public static z r(z zVar) {
        n nVar = f4748o;
        return nVar != null ? (z) b(nVar, zVar) : zVar;
    }

    public static AbstractC6327a s(AbstractC6327a abstractC6327a) {
        n nVar = f4744k;
        return nVar != null ? (AbstractC6327a) b(nVar, abstractC6327a) : abstractC6327a;
    }

    public static boolean t() {
        InterfaceC6467d interfaceC6467d = f4755v;
        if (interfaceC6467d == null) {
            return false;
        }
        try {
            return interfaceC6467d.a();
        } catch (Throwable th2) {
            throw AbstractC8755h.h(th2);
        }
    }

    public static y u(y yVar) {
        n nVar = f4740g;
        return nVar == null ? yVar : (y) b(nVar, yVar);
    }

    public static void v(Throwable th2) {
        InterfaceC6469f interfaceC6469f = f4734a;
        if (th2 == null) {
            th2 = AbstractC8755h.b("onError called with a null Throwable.");
        } else if (!k(th2)) {
            th2 = new UndeliverableException(th2);
        }
        if (interfaceC6469f != null) {
            try {
                interfaceC6469f.accept(th2);
                return;
            } catch (Throwable th3) {
                th3.printStackTrace();
                F(th3);
            }
        }
        th2.printStackTrace();
        F(th2);
    }

    public static y w(y yVar) {
        n nVar = f4742i;
        return nVar == null ? yVar : (y) b(nVar, yVar);
    }

    public static Runnable x(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        n nVar = f4735b;
        return nVar == null ? runnable : (Runnable) b(nVar, runnable);
    }

    public static y y(y yVar) {
        n nVar = f4741h;
        return nVar == null ? yVar : (y) b(nVar, yVar);
    }

    public static b z(i iVar, b bVar) {
        InterfaceC6465b interfaceC6465b = f4750q;
        return interfaceC6465b != null ? (b) a(interfaceC6465b, iVar, bVar) : bVar;
    }
}
