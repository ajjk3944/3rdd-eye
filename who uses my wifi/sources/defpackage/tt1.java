package defpackage;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tt1 extends hu1 {
    public static volatile Long i;
    public static volatile String k;
    public static volatile Long m;
    public static volatile String o;
    public static volatile Long q;
    public final /* synthetic */ int h;
    public static final Object j = new Object();
    public static final Object l = new Object();
    public static final Object n = new Object();
    public static final Object p = new Object();
    public static final Object r = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tt1(jt1 jt1Var, String str, String str2, fr1 fr1Var, int i2, int i3, int i4) {
        super(jt1Var, str, str2, fr1Var, i2, i3);
        this.h = i4;
    }

    private final void b() {
        fr1 fr1Var = this.d;
        fr1Var.b();
        ((qr1) fr1Var.g).H0(-1L);
        fr1Var.b();
        ((qr1) fr1Var.g).I0(-1L);
        int[] iArr = (int[]) this.e.invoke(null, this.a.a);
        synchronized (fr1Var) {
            long j2 = iArr[0];
            fr1Var.b();
            ((qr1) fr1Var.g).H0(j2);
            long j3 = iArr[1];
            fr1Var.b();
            ((qr1) fr1Var.g).I0(j3);
            int i2 = iArr[2];
            if (i2 != Integer.MIN_VALUE) {
                fr1Var.b();
                ((qr1) fr1Var.g).Y(i2);
            }
        }
    }

    private final void c() {
        if (k == null) {
            synchronized (l) {
                try {
                    if (k == null) {
                        k = (String) this.e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        fr1 fr1Var = this.d;
        synchronized (fr1Var) {
            String str = k;
            fr1Var.b();
            ((qr1) fr1Var.g).g0(str);
        }
    }

    private final void d() {
        if (m == null) {
            synchronized (n) {
                try {
                    if (m == null) {
                        m = (Long) this.e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        fr1 fr1Var = this.d;
        synchronized (fr1Var) {
            long jLongValue = m.longValue();
            fr1Var.b();
            ((qr1) fr1Var.g).Q0(jLongValue);
        }
    }

    private final void e() {
        fr1 fr1Var = this.d;
        fr1Var.b();
        ((qr1) fr1Var.g).E0("E");
        if (o == null) {
            synchronized (p) {
                try {
                    if (o == null) {
                        o = (String) this.e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        fr1 fr1Var2 = this.d;
        synchronized (fr1Var2) {
            String str = o;
            fr1Var2.b();
            ((qr1) fr1Var2.g).E0(str);
        }
    }

    private final void f() {
        Boolean bool = (Boolean) tw1.e.c.a(mz1.i3);
        bool.getClass();
        String str = (String) this.e.invoke(null, this.a.a, bool);
        bt1 bt1Var = new bt1(18);
        bt1Var.t = -1L;
        bt1Var.u = -1L;
        HashMap mapT = a30.t(str);
        if (mapT != null) {
            bt1Var.t = ((Long) mapT.get(0)).longValue();
            bt1Var.u = ((Long) mapT.get(1)).longValue();
        }
        fr1 fr1Var = this.d;
        synchronized (fr1Var) {
            long j2 = bt1Var.t;
            fr1Var.b();
            ((qr1) fr1Var.g).G0(j2);
            long j3 = bt1Var.u;
            fr1Var.b();
            ((qr1) fr1Var.g).Z(j3);
        }
    }

    private final void g() {
        fr1 fr1Var = this.d;
        synchronized (fr1Var) {
            String str = (String) this.e.invoke(null, null);
            gt1 gt1Var = new gt1(18);
            HashMap mapT = a30.t(str);
            if (mapT != null) {
                gt1Var.t = (Long) mapT.get(0);
                gt1Var.u = (Long) mapT.get(1);
            }
            long jLongValue = gt1Var.t.longValue();
            fr1Var.b();
            ((qr1) fr1Var.g).Q(jLongValue);
            long jLongValue2 = gt1Var.u.longValue();
            fr1Var.b();
            ((qr1) fr1Var.g).R(jLongValue2);
        }
    }

    private final void h() {
        if (q == null) {
            synchronized (r) {
                try {
                    if (q == null) {
                        q = (Long) this.e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        fr1 fr1Var = this.d;
        synchronized (fr1Var) {
            long jLongValue = q.longValue();
            fr1Var.b();
            ((qr1) fr1Var.g).D(jLongValue);
        }
    }

    @Override // defpackage.hu1
    public final void a() throws InvocationTargetException {
        switch (this.h) {
            case 0:
                if (i == null) {
                    synchronized (j) {
                        try {
                            if (i == null) {
                                i = (Long) this.e.invoke(null, null);
                            }
                        } finally {
                        }
                    }
                }
                fr1 fr1Var = this.d;
                synchronized (fr1Var) {
                    long jLongValue = i.longValue();
                    fr1Var.b();
                    ((qr1) fr1Var.g).M(jLongValue);
                }
                return;
            case 1:
                c();
                return;
            case 2:
                d();
                return;
            case 3:
                e();
                return;
            case 4:
                h();
                return;
            case 5:
                String str = (String) this.e.invoke(null, null);
                fr1 fr1Var2 = this.d;
                synchronized (fr1Var2) {
                    fr1Var2.b();
                    ((qr1) fr1Var2.g).l0(str);
                }
                return;
            case 6:
                fr1 fr1Var3 = this.d;
                fr1Var3.b();
                ((qr1) fr1Var3.g).q0(3);
                try {
                    int i2 = 1;
                    if (true == ((Boolean) this.e.invoke(null, this.a.a)).booleanValue()) {
                        i2 = 2;
                    }
                    fr1Var3.b();
                    ((qr1) fr1Var3.g).q0(i2);
                    return;
                } catch (InvocationTargetException e) {
                    if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                        throw e;
                    }
                    return;
                }
            case 7:
                b();
                return;
            case 8:
                int i3 = true == ((Boolean) this.e.invoke(null, this.a.a)).booleanValue() ? 2 : 1;
                fr1 fr1Var4 = this.d;
                fr1Var4.b();
                ((qr1) fr1Var4.g).t0(i3);
                return;
            case 9:
                fr1 fr1Var5 = this.d;
                fr1Var5.b();
                ((qr1) fr1Var5.g).K0(-1L);
                long jLongValue2 = ((Long) this.e.invoke(null, this.a.a)).longValue();
                fr1Var5.b();
                ((qr1) fr1Var5.g).K0(jLongValue2);
                return;
            case 10:
                f();
                return;
            case 11:
                fr1 fr1Var6 = this.d;
                try {
                    int i4 = 1;
                    if (true == ((Boolean) this.e.invoke(null, this.a.a)).booleanValue()) {
                        i4 = 2;
                    }
                    fr1Var6.b();
                    ((qr1) fr1Var6.g).s0(i4);
                    return;
                } catch (InvocationTargetException unused) {
                    fr1Var6.b();
                    ((qr1) fr1Var6.g).s0(3);
                    return;
                }
            case 12:
                g();
                return;
            default:
                fr1 fr1Var7 = this.d;
                fr1Var7.g(3);
                boolean zBooleanValue = ((Boolean) this.e.invoke(null, this.a.a)).booleanValue();
                synchronized (fr1Var7) {
                    try {
                        if (zBooleanValue) {
                            fr1Var7.g(2);
                        } else {
                            fr1Var7.g(1);
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt1(jt1 jt1Var, fr1 fr1Var, int i2, int i3) {
        super(jt1Var, "N+SNt584k90MWn4aBLIhSutg85cYgcNyu+q+5WGRUo/oWkmPivq/1xlEIBG+GcFK", "VOVDFi9LxFQe2QWzKEnmStNUha/UwjqmQV12jeIMYds=", fr1Var, i2, 44);
        this.h = i3;
        switch (i3) {
            case 2:
                super(jt1Var, "b8WdxwEW5LYMXGC6g6q07uNIFUV3fs77AEo1YVb/4q/M8KyV69so1cxJ+MsKyWwh", "kazSW9iygMpHEkKh5zVqXBXYRU+noi3Tzu4hpFfxZG4=", fr1Var, i2, 22);
                break;
            case 3:
                super(jt1Var, "MMDDWI2IGLmF5pG/RRqJJZVb/JAirVaBalbjWCkub0DwWmFp7b+bfaTjmPK9uiWU", "m1dpreCDNlkoMOYdr+vmzaz+jSmUZiIrETih78jZTqg=", fr1Var, i2, 1);
                break;
            case 4:
                super(jt1Var, "VYNLVwJcUVwKHNYqtTAMU2Cbdf8xQvz3Fr3MGMTI+Feinwv11ysZpnAq/2AMk2I1", "XCAdtiyR5t8AMQ7u4CMXLD5NJ9dD+Tw+KRPDn9OS+vQ=", fr1Var, i2, 33);
                break;
            case 5:
                super(jt1Var, "zPJzhz1QtGvdwoq8b/etTeYWv9LDeLRPadnOSNl7lohby1/0Z3YfZB4nvs0ev2QM", "fVJK5Q/FtQnQT4sQUZztmOn3k4N5bqyd4pz/QTy2bEo=", fr1Var, i2, 89);
                break;
            case 6:
                super(jt1Var, "Ps5Xy95qN5Bq7sgqC6/M4zZXLDS2M1Isx7H/g2/CV37zoy2ILxNb7iAARKvnhAcR", "UDDHIUrqun7cz3t6d4j2iVVfWcHKtBQnSOoDChOFM5Y=", fr1Var, i2, 49);
                break;
            case 7:
                super(jt1Var, "0k0HoJtCvAtrnTz0UbiSqrs0BGKzSTMoo+ZxCfyJrLcMn8tbsvf/NG2/ui2bKbWP", "z6GzXqyR8kvBYJKVLhMc9mqmsbq6ZkNeWqgTkONnpqg=", fr1Var, i2, 5);
                break;
            case 8:
            default:
                break;
            case 9:
                super(jt1Var, "01PVhP+doaGKdC1W6GrY+2IWUVFKtg3RWpQDin/wN/cS8wkuezVXqSDwZNREySxt", "hY1jxg+6DUCngCe0vbxb4cMsyHNENce67SGKWd6hzv8=", fr1Var, i2, 12);
                break;
            case 10:
                super(jt1Var, "8W5EiIZWvw8ca0gdEf2baMelwD0v1LgWFEv6AqIRDGIzRlZJKgzzVYcusXATxgKN", "ZXwHOojdfPkjtU4/T1kRX8Zucxdzz/LL+/XimOcPDrc=", fr1Var, i2, 3);
                break;
            case 11:
                super(jt1Var, "ExKA4wjDRRYdztAsabUEoV5NOADo4vSkAwQNa4IGw0yLC0NQlDOhDdBTfDT5YHOb", "1Gz3ZRhjJNvXJ0g284S9b/dpVAajMMfg8CE3pBcFNFA=", fr1Var, i2, 73);
                break;
            case 12:
                super(jt1Var, "cOth2BAAthu6X8KDmzC58653OwqftcurhEiV9l+3uxMh7KBnOgbdhGM0zSnSPufi", "2EDSTVCwfkpT+1duJ+umEyNIZ3jEP0NWyK78oeLPLhI=", fr1Var, i2, 51);
                break;
            case 13:
                super(jt1Var, "f5uC0Q5BJBhs1YfPGy7Wx7MnBjWVUX5JNaW+Lz6dfUOfz0sIXH0KubqvIhiUByWt", "klWlopX/vpRWeyQx7GUjF52wT93EUJwbeMp05ev02yc=", fr1Var, i2, 48);
                break;
        }
    }
}
