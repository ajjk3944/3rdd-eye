package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e5 implements z5 {

    /* renamed from: b, reason: collision with root package name */
    public static final e5 f19675b = new e5(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19676a;

    public /* synthetic */ e5(int i4) {
        this.f19676a = i4;
    }

    public static final x5 a(Object obj, Object obj2) {
        x5 x5VarA = (x5) obj;
        x5 x5Var = (x5) obj2;
        if (!x5Var.isEmpty()) {
            if (!x5VarA.f20035a) {
                x5VarA = x5VarA.a();
            }
            x5VarA.d();
            if (!x5Var.isEmpty()) {
                x5VarA.putAll(x5Var);
            }
        }
        return x5VarA;
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public boolean d(Class cls) {
        switch (this.f19676a) {
            case 0:
                return g5.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public h6 e(Class cls) {
        switch (this.f19676a) {
            case 0:
                if (!g5.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (h6) g5.l(cls.asSubclass(g5.class)).o(3);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
