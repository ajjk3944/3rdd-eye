package T;

import android.os.Looper;
import android.util.Log;
import d0.InterfaceC5275g;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* renamed from: T.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3514b {

    /* renamed from: a, reason: collision with root package name */
    private static final Yg.m f21022a = Yg.n.b(a.f21024a);

    /* renamed from: b, reason: collision with root package name */
    private static final long f21023b;

    /* renamed from: T.b$a */
    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f21024a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3530g0 invoke() {
            return Looper.getMainLooper() != null ? F.f20846a : Y0.f20993a;
        }
    }

    static {
        long id2;
        try {
            id2 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id2 = -1;
        }
        f21023b = id2;
    }

    public static final InterfaceC3543m0 a(float f10) {
        return new C3558u0(f10);
    }

    public static final InterfaceC3545n0 b(int i10) {
        return new C3560v0(i10);
    }

    public static final InterfaceC3547o0 c(long j10) {
        return new C3562w0(j10);
    }

    public static final InterfaceC5275g d(Object obj, n1 n1Var) {
        return new C3564x0(obj, n1Var);
    }

    public static final long e() {
        return f21023b;
    }

    public static final void f(String str, Throwable th2) {
        Log.e("ComposeInternal", str, th2);
    }
}
