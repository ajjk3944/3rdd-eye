package kotlinx.coroutines;

/* loaded from: classes4.dex */
public abstract class z1 {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.c0 f22719a = new kotlinx.coroutines.internal.c0("COMPLETING_ALREADY");

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.c0 f22720b = new kotlinx.coroutines.internal.c0("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.c0 f22721c = new kotlinx.coroutines.internal.c0("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.c0 f22722d = new kotlinx.coroutines.internal.c0("TOO_LATE_TO_CANCEL");

    /* renamed from: e, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.c0 f22723e = new kotlinx.coroutines.internal.c0("SEALED");

    /* renamed from: f, reason: collision with root package name */
    public static final b1 f22724f = new b1(false);

    /* renamed from: g, reason: collision with root package name */
    public static final b1 f22725g = new b1(true);

    public static final Object g(Object obj) {
        return obj instanceof m1 ? new n1((m1) obj) : obj;
    }

    public static final Object h(Object obj) {
        m1 m1Var;
        n1 n1Var = obj instanceof n1 ? (n1) obj : null;
        return (n1Var == null || (m1Var = n1Var.f22580a) == null) ? obj : m1Var;
    }
}
