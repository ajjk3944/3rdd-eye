package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final u0 f1071c = new u0();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f1073b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final g0 f1072a = new g0();

    public final x0 a(Class cls) {
        x0 x0VarW;
        Class cls2;
        y.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f1073b;
        x0 x0Var = (x0) concurrentHashMap.get(cls);
        if (x0Var != null) {
            return x0Var;
        }
        g0 g0Var = this.f1072a;
        g0Var.getClass();
        Class cls3 = y0.f1083a;
        if (!w.class.isAssignableFrom(cls) && (cls2 = y0.f1083a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        w0 w0VarA = ((f0) g0Var.f977a).a(cls);
        int i4 = w0VarA.f1080d;
        a aVar = w0VarA.f1077a;
        if ((i4 & 2) == 2) {
            if (w.class.isAssignableFrom(cls)) {
                x0VarW = new p0(y0.f1085c, q.f1040a, aVar);
            } else {
                f1 f1Var = y0.f1084b;
                p pVar = q.f1041b;
                if (pVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                x0VarW = new p0(f1Var, pVar, aVar);
            }
        } else if (w.class.isAssignableFrom(cls)) {
            p pVar2 = null;
            q0 q0Var = r0.f1046b;
            d0 d0Var = e0.f962b;
            f1 f1Var2 = y0.f1085c;
            if (i3.e.c(w0VarA.a()) != 1) {
                pVar2 = q.f1040a;
            }
            p pVar3 = pVar2;
            k0 k0Var = l0.f1011b;
            if (!(w0VarA instanceof w0)) {
                int[] iArr = o0.f1024n;
                w0VarA.getClass();
                throw new ClassCastException();
            }
            x0VarW = o0.w(w0VarA, q0Var, d0Var, f1Var2, pVar3, k0Var);
        } else {
            p pVar4 = null;
            q0 q0Var2 = r0.f1045a;
            d0 d0Var2 = e0.f961a;
            f1 f1Var3 = y0.f1084b;
            if (i3.e.c(w0VarA.a()) != 1 && (pVar4 = q.f1041b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            p pVar5 = pVar4;
            k0 k0Var2 = l0.f1010a;
            if (!(w0VarA instanceof w0)) {
                int[] iArr2 = o0.f1024n;
                w0VarA.getClass();
                throw new ClassCastException();
            }
            x0VarW = o0.w(w0VarA, q0Var2, d0Var2, f1Var3, pVar5, k0Var2);
        }
        x0 x0Var2 = (x0) concurrentHashMap.putIfAbsent(cls, x0VarW);
        return x0Var2 != null ? x0Var2 : x0VarW;
    }
}
