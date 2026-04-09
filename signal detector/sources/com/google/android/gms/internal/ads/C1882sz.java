package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.internal.ads.sz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1882sz extends AbstractC2098wz {

    /* renamed from: g, reason: collision with root package name */
    public static volatile Long f16827g;

    /* renamed from: h, reason: collision with root package name */
    public static final Object f16828h = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16829f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1882sz(String str, String str2, S5 s5, C1291hz c1291hz, C1894tA c1894tA, int i) {
        super(str, str2, s5, c1291hz, c1894tA);
        this.f16829f = i;
    }

    private final void b(Method method, S5 s5) {
        if (f16827g == null) {
            synchronized (f16828h) {
                try {
                    if (f16827g == null) {
                        Long l2 = (Long) method.invoke("", null);
                        if (l2 == null) {
                            throw null;
                        }
                        f16827g = l2;
                    }
                } finally {
                }
            }
        }
        synchronized (s5) {
            try {
                if (f16827g != null) {
                    long jLongValue = f16827g.longValue();
                    s5.b();
                    ((C1136f6) s5.f13551b).Q0(jLongValue);
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2098wz
    public final void a(Method method, S5 s5) {
        switch (this.f16829f) {
            case 0:
                b(method, s5);
                return;
            default:
                synchronized (s5) {
                    s5.b();
                    ((C1136f6) s5.f13551b).E0("E");
                    s5.b();
                    ((C1136f6) s5.f13551b).M(0L);
                    s5.b();
                    ((C1136f6) s5.f13551b).g0("D");
                }
                Object[] objArr = (Object[]) method.invoke("", null);
                objArr.getClass();
                synchronized (s5) {
                    String str = (String) objArr[0];
                    s5.b();
                    ((C1136f6) s5.f13551b).E0(str);
                    long jLongValue = ((Long) objArr[1]).longValue();
                    s5.b();
                    ((C1136f6) s5.f13551b).M(jLongValue);
                    String str2 = (String) objArr[2];
                    s5.b();
                    ((C1136f6) s5.f13551b).g0(str2);
                }
                return;
        }
    }
}
