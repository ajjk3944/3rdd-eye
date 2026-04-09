package Ji;

import Ii.C3048c0;
import Ii.C3073p;
import Ii.InterfaceC3069n;
import Yg.u;
import Yg.v;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final g f10231a;
    private static volatile Choreographer choreographer;

    static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3069n f10232a;

        a(InterfaceC3069n interfaceC3069n) {
            this.f10232a = interfaceC3069n;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.j(this.f10232a);
        }
    }

    static {
        Object objC;
        byte b10 = 0;
        byte b11 = 0;
        try {
            u.a aVar = u.f25017b;
            objC = u.c(new f(d(Looper.getMainLooper(), true), b11 == true ? 1 : 0, 2, b10 == true ? 1 : 0));
        } catch (Throwable th2) {
            u.a aVar2 = u.f25017b;
            objC = u.c(v.a(th2));
        }
        f10231a = (g) (u.l(objC) ? null : objC);
    }

    public static final Handler d(Looper looper, boolean z10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!z10) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            AbstractC6492s.g(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    public static final Object e(InterfaceC5380e interfaceC5380e) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            return f(interfaceC5380e);
        }
        C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
        c3073p.A();
        h(choreographer2, c3073p);
        Object objU = c3073p.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU;
    }

    private static final Object f(InterfaceC5380e interfaceC5380e) {
        C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
        c3073p.A();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            j(c3073p);
        } else {
            C3048c0.c().Y(c3073p.getContext(), new a(c3073p));
        }
        Object objU = c3073p.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU;
    }

    public static final g g(Handler handler, String str) {
        return new f(handler, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Choreographer choreographer2, final InterfaceC3069n interfaceC3069n) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: Ji.h
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                i.i(interfaceC3069n, j10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(InterfaceC3069n interfaceC3069n, long j10) {
        interfaceC3069n.J(C3048c0.c(), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(InterfaceC3069n interfaceC3069n) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            AbstractC6492s.f(choreographer2);
            choreographer = choreographer2;
        }
        h(choreographer2, interfaceC3069n);
    }
}
