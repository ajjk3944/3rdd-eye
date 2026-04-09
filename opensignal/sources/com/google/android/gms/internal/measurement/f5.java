package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class f5 implements a6 {

    /* renamed from: b, reason: collision with root package name */
    public static final f5 f4985b = new f5(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4986a;

    public /* synthetic */ f5(int i10) {
        this.f4986a = i10;
    }

    public static final y5 c(Object obj, Object obj2) {
        y5 y5VarA = (y5) obj;
        y5 y5Var = (y5) obj2;
        if (!y5Var.isEmpty()) {
            if (!y5VarA.f5272a) {
                y5VarA = y5VarA.a();
            }
            y5VarA.c();
            if (!y5Var.isEmpty()) {
                y5VarA.putAll(y5Var);
            }
        }
        return y5VarA;
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public boolean a(Class cls) {
        switch (this.f4986a) {
            case 0:
                return h5.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.measurement.a6
    public i6 b(Class cls) {
        switch (this.f4986a) {
            case 0:
                if (!h5.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (i6) h5.l(cls.asSubclass(h5.class)).o(3);
                } catch (Exception e4) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
