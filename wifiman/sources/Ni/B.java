package Ni;

import Yg.u;
import a.C3745a;

/* loaded from: classes4.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f16571a = new C3745a().a();

    /* renamed from: b, reason: collision with root package name */
    private static final String f16572b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f16573c;

    static {
        Object objC;
        Object objC2;
        try {
            u.a aVar = Yg.u.f25017b;
            objC = Yg.u.c(kotlin.coroutines.jvm.internal.a.class.getCanonicalName());
        } catch (Throwable th2) {
            u.a aVar2 = Yg.u.f25017b;
            objC = Yg.u.c(Yg.v.a(th2));
        }
        if (Yg.u.h(objC) != null) {
            objC = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f16572b = (String) objC;
        try {
            objC2 = Yg.u.c(B.class.getCanonicalName());
        } catch (Throwable th3) {
            u.a aVar3 = Yg.u.f25017b;
            objC2 = Yg.u.c(Yg.v.a(th3));
        }
        if (Yg.u.h(objC2) != null) {
            objC2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f16573c = (String) objC2;
    }

    public static final Throwable a(Throwable th2) {
        return th2;
    }
}
