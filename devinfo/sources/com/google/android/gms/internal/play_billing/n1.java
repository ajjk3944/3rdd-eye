package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n1 implements d2 {

    /* renamed from: b, reason: collision with root package name */
    public static final n1 f20189b = new n1(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20190a;

    public /* synthetic */ n1(int i4) {
        this.f20190a = i4;
    }

    public static final b2 a(Object obj, Object obj2) {
        b2 b2Var = (b2) obj;
        b2 b2Var2 = (b2) obj2;
        if (!b2Var2.isEmpty()) {
            if (!b2Var.f20090a) {
                if (b2Var.isEmpty()) {
                    b2Var = new b2();
                } else {
                    b2 b2Var3 = new b2(b2Var);
                    b2Var3.f20090a = true;
                    b2Var = b2Var3;
                }
            }
            b2Var.b();
            if (!b2Var2.isEmpty()) {
                b2Var.putAll(b2Var2);
            }
        }
        return b2Var;
    }

    @Override // com.google.android.gms.internal.play_billing.d2
    public k2 d(Class cls) {
        switch (this.f20190a) {
            case 0:
                if (!p1.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (k2) p1.h(cls.asSubclass(p1.class)).d(3);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.play_billing.d2
    public boolean e(Class cls) {
        switch (this.f20190a) {
            case 0:
                return p1.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
