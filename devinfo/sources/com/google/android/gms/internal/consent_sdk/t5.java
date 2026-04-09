package com.google.android.gms.internal.consent_sdk;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t5 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f19520c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final s6 f19521a = new s6();

    /* renamed from: b, reason: collision with root package name */
    public boolean f19522b;

    static {
        new t5(0);
    }

    public t5() {
    }

    public static void b(q5 q5Var, e7 e7Var, int i4, Object obj) throws IOException {
        if (e7Var == e7.f19338e) {
            q5Var.y(i4, 3);
            ((l5) obj).a(q5Var);
            q5Var.y(i4, 4);
            return;
        }
        q5Var.y(i4, e7Var.f19341b);
        f7 f7Var = f7.f19347a;
        switch (e7Var.ordinal()) {
            case 0:
                q5Var.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                q5Var.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                q5Var.C(((Long) obj).longValue());
                break;
            case 3:
                q5Var.C(((Long) obj).longValue());
                break;
            case 4:
                q5Var.w(((Integer) obj).intValue());
                break;
            case 5:
                q5Var.u(((Long) obj).longValue());
                break;
            case 6:
                q5Var.s(((Integer) obj).intValue());
                break;
            case 7:
                byte bBooleanValue = ((Boolean) obj).booleanValue();
                if (q5Var.f19498e == q5Var.f19497d) {
                    q5Var.k();
                }
                byte[] bArr = q5Var.f19496c;
                int i10 = q5Var.f19498e;
                bArr[i10] = bBooleanValue;
                q5Var.f19498e = i10 + 1;
                break;
            case 8:
                if (!(obj instanceof p5)) {
                    q5Var.x((String) obj);
                    break;
                } else {
                    q5Var.q((p5) obj);
                    break;
                }
            case 9:
                ((l5) obj).a(q5Var);
                break;
            case 10:
                l5 l5Var = (l5) obj;
                q5Var.A(l5Var.c());
                l5Var.a(q5Var);
                break;
            case 11:
                if (!(obj instanceof p5)) {
                    byte[] bArr2 = (byte[]) obj;
                    int length = bArr2.length;
                    q5Var.A(length);
                    q5Var.D(length, bArr2);
                    break;
                } else {
                    q5Var.q((p5) obj);
                    break;
                }
            case 12:
                q5Var.A(((Integer) obj).intValue());
                break;
            case 13:
                q5Var.w(((Integer) obj).intValue());
                break;
            case 14:
                q5Var.s(((Integer) obj).intValue());
                break;
            case 15:
                q5Var.u(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                q5Var.A((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                q5Var.C((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final void a() {
        if (this.f19522b) {
            return;
        }
        s6 s6Var = this.f19521a;
        int i4 = s6Var.f19511b;
        for (int i10 = 0; i10 < i4; i10++) {
            Object obj = s6Var.c(i10).f19524b;
            if (obj instanceof w5) {
                ((w5) obj).j();
            }
        }
        Iterator it = s6Var.a().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof w5) {
                ((w5) value).j();
            }
        }
        if (!s6Var.f19513d) {
            if (s6Var.f19511b > 0) {
                s6Var.c(0).f19523a.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = s6Var.a().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!s6Var.f19513d) {
            s6Var.f19512c = s6Var.f19512c.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(s6Var.f19512c);
            s6Var.f19515f = s6Var.f19515f.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(s6Var.f19515f);
            s6Var.f19513d = true;
        }
        this.f19522b = true;
    }

    public final Object clone() {
        t5 t5Var = new t5();
        s6 s6Var = this.f19521a;
        if (s6Var.f19511b > 0) {
            s6Var.c(0).f19523a.getClass();
            throw new ClassCastException();
        }
        Iterator it = s6Var.a().iterator();
        if (!it.hasNext()) {
            return t5Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t5) {
            return this.f19521a.equals(((t5) obj).f19521a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19521a.hashCode();
    }

    public t5(int i4) {
        a();
        a();
    }
}
