package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.internal.ads.pz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1721pz extends AbstractC2098wz {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16262f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f16263g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1721pz(S5 s5, C1291hz c1291hz, Context context, C1948uA c1948uA, int i) {
        super("PH59Z8k3dpWxORUT8HU0o+g5WN12ilbJvwpqiSzw0bSm8ti3u+Yy1pYDsitXR/IS", "EBTPDqTGNNE4oafrCuyvamIcg1nistjqiNmDYn1J+fs=", s5, c1291hz, c1948uA.a(115));
        this.f16262f = i;
        switch (i) {
            case 1:
                super("10eHn0oEJc+Kv4xHAilDadQXUH+Qd7+H1wb3g/5791dKT43oKLnvfFcwz9lBLCYb", "DO5TusvTbmxbLfPhMKcHxON+YLmz+u+OpsMl13dRFcs=", s5, c1291hz, c1948uA.a(119));
                this.f16263g = context;
                break;
            default:
                this.f16263g = context;
                break;
        }
    }

    private final void b(Method method, S5 s5) {
        int i = 1;
        Object[] objArr = (Object[]) method.invoke("", this.f16263g);
        objArr.getClass();
        synchronized (s5) {
            try {
                long jIntValue = ((Integer) objArr[0]).intValue();
                s5.b();
                ((C1136f6) s5.f13551b).Y(jIntValue);
                long jIntValue2 = ((Integer) objArr[1]).intValue();
                s5.b();
                ((C1136f6) s5.f13551b).H0(jIntValue2);
                long jIntValue3 = ((Integer) objArr[2]).intValue();
                s5.b();
                ((C1136f6) s5.f13551b).I0(jIntValue3);
                long jIntValue4 = ((Integer) objArr[3]).intValue();
                s5.b();
                ((C1136f6) s5.f13551b).m0(jIntValue4);
                Boolean bool = (Boolean) objArr[4];
                if (bool == null) {
                    s5.b();
                    ((C1136f6) s5.f13551b).q0(3);
                } else {
                    int i3 = true != bool.booleanValue() ? 1 : 2;
                    s5.b();
                    ((C1136f6) s5.f13551b).q0(i3);
                }
                Boolean bool2 = (Boolean) objArr[5];
                if (bool2 == null) {
                    s5.g(3);
                } else {
                    if (true == bool2.booleanValue()) {
                        i = 2;
                    }
                    s5.g(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2098wz
    public final void a(Method method, S5 s5) {
        switch (this.f16262f) {
            case 0:
                b(method, s5);
                return;
            default:
                Object[] objArr = (Object[]) method.invoke("", this.f16263g);
                objArr.getClass();
                synchronized (s5) {
                    long jLongValue = ((Long) objArr[0]).longValue();
                    s5.b();
                    ((C1136f6) s5.f13551b).G0(jLongValue);
                    long jLongValue2 = ((Long) objArr[1]).longValue();
                    s5.b();
                    ((C1136f6) s5.f13551b).Z(jLongValue2);
                }
                return;
        }
    }
}
