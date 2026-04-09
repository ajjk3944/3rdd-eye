package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qi3 extends ti3 {
    public static volatile Long g;
    public static final Object h = new Object();
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi3(String str, String str2, fr1 fr1Var, gi3 gi3Var, fk3 fk3Var, int i) {
        super(str, str2, fr1Var, gi3Var, fk3Var);
        this.f = i;
    }

    @Override // defpackage.ti3
    public final void a(Method method, fr1 fr1Var) {
        switch (this.f) {
            case 0:
                if (g == null) {
                    synchronized (h) {
                        try {
                            if (g == null) {
                                Long l = (Long) method.invoke("", null);
                                if (l == null) {
                                    throw null;
                                }
                                g = l;
                            }
                        } finally {
                        }
                    }
                }
                synchronized (fr1Var) {
                    try {
                        if (g != null) {
                            long jLongValue = g.longValue();
                            fr1Var.b();
                            ((qr1) fr1Var.g).Q0(jLongValue);
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (fr1Var) {
                    fr1Var.b();
                    ((qr1) fr1Var.g).E0("E");
                    fr1Var.b();
                    ((qr1) fr1Var.g).M(0L);
                    fr1Var.b();
                    ((qr1) fr1Var.g).g0("D");
                }
                Object[] objArr = (Object[]) method.invoke("", null);
                objArr.getClass();
                synchronized (fr1Var) {
                    String str = (String) objArr[0];
                    fr1Var.b();
                    ((qr1) fr1Var.g).E0(str);
                    long jLongValue2 = ((Long) objArr[1]).longValue();
                    fr1Var.b();
                    ((qr1) fr1Var.g).M(jLongValue2);
                    String str2 = (String) objArr[2];
                    fr1Var.b();
                    ((qr1) fr1Var.g).g0(str2);
                }
                return;
        }
    }
}
