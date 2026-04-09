package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.snmp4j.smi.Counter32;

/* renamed from: com.google.android.gms.internal.measurement.g2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4354g2 {
    public static double a(double d10) {
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || d10 == -0.0d) {
            return d10;
        }
        return (d10 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d10));
    }

    public static int b(Z2 z22) {
        int i10 = i(z22.c("runtime.counter").zze().doubleValue() + 1.0d);
        if (i10 > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        z22.h("runtime.counter", new C4386k(Double.valueOf(i10)));
        return i10;
    }

    public static Z c(String str) {
        Z zZza = (str == null || str.isEmpty()) ? null : Z.zza(Integer.parseInt(str));
        if (zZza != null) {
            return zZza;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object d(InterfaceC4449s interfaceC4449s) {
        if (InterfaceC4449s.f35451f0.equals(interfaceC4449s)) {
            return null;
        }
        if (InterfaceC4449s.f35450e0.equals(interfaceC4449s)) {
            return "";
        }
        if (interfaceC4449s instanceof r) {
            return e((r) interfaceC4449s);
        }
        if (!(interfaceC4449s instanceof C4351g)) {
            return !interfaceC4449s.zze().isNaN() ? interfaceC4449s.zze() : interfaceC4449s.zzf();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C4351g) interfaceC4449s).iterator();
        while (it.hasNext()) {
            Object objD = d((InterfaceC4449s) it.next());
            if (objD != null) {
                arrayList.add(objD);
            }
        }
        return arrayList;
    }

    public static Map e(r rVar) {
        HashMap map = new HashMap();
        for (String str : rVar.a()) {
            Object objD = d(rVar.zza(str));
            if (objD != null) {
                map.put(str, objD);
            }
        }
        return map;
    }

    public static void f(Z z10, int i10, List list) {
        g(z10.name(), i10, list);
    }

    public static void g(String str, int i10, List list) {
        if (list.size() != i10) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static boolean h(InterfaceC4449s interfaceC4449s, InterfaceC4449s interfaceC4449s2) {
        if (!interfaceC4449s.getClass().equals(interfaceC4449s2.getClass())) {
            return false;
        }
        if ((interfaceC4449s instanceof C4505z) || (interfaceC4449s instanceof C4434q)) {
            return true;
        }
        if (!(interfaceC4449s instanceof C4386k)) {
            return interfaceC4449s instanceof C4465u ? interfaceC4449s.zzf().equals(interfaceC4449s2.zzf()) : interfaceC4449s instanceof C4360h ? interfaceC4449s.zzd().equals(interfaceC4449s2.zzd()) : interfaceC4449s == interfaceC4449s2;
        }
        if (Double.isNaN(interfaceC4449s.zze().doubleValue()) || Double.isNaN(interfaceC4449s2.zze().doubleValue())) {
            return false;
        }
        return interfaceC4449s.zze().equals(interfaceC4449s2.zze());
    }

    public static int i(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) (((d10 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d10))) % 4.294967296E9d);
    }

    public static void j(Z z10, int i10, List list) {
        k(z10.name(), i10, list);
    }

    public static void k(String str, int i10, List list) {
        if (list.size() < i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static boolean l(InterfaceC4449s interfaceC4449s) {
        if (interfaceC4449s == null) {
            return false;
        }
        Double dZze = interfaceC4449s.zze();
        return !dZze.isNaN() && dZze.doubleValue() >= 0.0d && dZze.equals(Double.valueOf(Math.floor(dZze.doubleValue())));
    }

    public static long m(double d10) {
        return i(d10) & Counter32.MAX_COUNTER32_VALUE;
    }

    public static void n(String str, int i10, List list) {
        if (list.size() > i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }
}
