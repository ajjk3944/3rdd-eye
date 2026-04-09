package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class ZK {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f12820c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final LL f12821a = new LL();

    /* renamed from: b, reason: collision with root package name */
    public boolean f12822b;

    static {
        new ZK(0);
    }

    public ZK() {
    }

    public static void b(VK vk, ZL zl, int i, Object obj) {
        if (zl == ZL.f12824d) {
            vk.M(i, 3);
            ((AbstractC1096eL) ((FK) obj)).v(vk);
            vk.M(i, 4);
            return;
        }
        vk.M(i, zl.f12828b);
        EnumC0879aM enumC0879aM = EnumC0879aM.f13105a;
        switch (zl.ordinal()) {
            case 0:
                vk.e0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                vk.c0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                vk.d0(((Long) obj).longValue());
                break;
            case 3:
                vk.d0(((Long) obj).longValue());
                break;
            case 4:
                vk.a0(((Integer) obj).intValue());
                break;
            case 5:
                vk.e0(((Long) obj).longValue());
                break;
            case 6:
                vk.c0(((Integer) obj).intValue());
                break;
            case 7:
                vk.Z(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof QK)) {
                    vk.f0((String) obj);
                    break;
                } else {
                    vk.W((QK) obj);
                    break;
                }
            case 9:
                ((AbstractC1096eL) ((FK) obj)).v(vk);
                break;
            case 10:
                vk.Y((FK) obj);
                break;
            case 11:
                if (!(obj instanceof QK)) {
                    byte[] bArr = (byte[]) obj;
                    vk.X(bArr.length, bArr);
                    break;
                } else {
                    vk.W((QK) obj);
                    break;
                }
            case 12:
                vk.b0(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof InterfaceC1206gL)) {
                    vk.a0(((Integer) obj).intValue());
                    break;
                } else {
                    vk.a0(((InterfaceC1206gL) obj).a());
                    break;
                }
            case 14:
                vk.c0(((Integer) obj).intValue());
                break;
            case 15:
                vk.e0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                vk.b0((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                vk.d0((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final void a() {
        if (this.f12822b) {
            return;
        }
        LL ll = this.f12821a;
        int i = ll.f9656b;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = ll.a(i3).f9870b;
            if (obj instanceof AbstractC1096eL) {
                ((AbstractC1096eL) obj).q();
            }
        }
        Iterator it = ll.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof AbstractC1096eL) {
                ((AbstractC1096eL) value).q();
            }
        }
        if (!ll.f9658d) {
            if (ll.f9656b > 0) {
                ll.a(0).f9869a.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = ll.b().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!ll.f9658d) {
            ll.f9657c = ll.f9657c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ll.f9657c);
            ll.f9660f = ll.f9660f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ll.f9660f);
            ll.f9658d = true;
        }
        this.f12822b = true;
    }

    public final Object clone() {
        ZK zk = new ZK();
        LL ll = this.f12821a;
        if (ll.f9656b > 0) {
            ML mlA = ll.a(0);
            if (mlA.f9869a != null) {
                throw new ClassCastException();
            }
            Object obj = mlA.f9870b;
            throw null;
        }
        Iterator it = ll.b().iterator();
        if (!it.hasNext()) {
            return zk;
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
        if (obj instanceof ZK) {
            return this.f12821a.equals(((ZK) obj).f12821a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12821a.hashCode();
    }

    public ZK(int i) {
        a();
        a();
    }
}
