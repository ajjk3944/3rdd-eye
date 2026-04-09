package zc;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f26924b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference f26925c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReference f26926d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final z7.j f26927a;

    public f0(z7.j jVar) {
        this.f26927a = jVar;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        cc.s.h(atomicReference);
        cc.s.b(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Objects.equals(str, strArr[i10])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i10];
                        if (str2 == null) {
                            str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                            strArr3[i10] = str2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f26927a.e() ? str : g(str, p1.f27077c, p1.f27075a, f26924b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f26927a.e() ? str : g(str, p1.f27080f, p1.f27079e, f26925c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f26927a.e() ? str : str.startsWith("_exp_") ? h0.b.o("experiment_id(", str, ")") : g(str, p1.j, p1.f27083i, f26926d);
    }

    public final String d(zzbg zzbgVar) {
        z7.j jVar = this.f26927a;
        if (!jVar.e()) {
            return zzbgVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(zzbgVar.f5407g);
        sb2.append(",name=");
        sb2.append(a(zzbgVar.f5405a));
        sb2.append(",params=");
        zzbe zzbeVar = zzbgVar.f5406d;
        sb2.append(zzbeVar == null ? null : !jVar.e() ? zzbeVar.f5404a.toString() : e(zzbeVar.j()));
        return sb2.toString();
    }

    public final String e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f26927a.e()) {
            return bundle.toString();
        }
        StringBuilder sbT = c7.a.t("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbT.length() != 8) {
                sbT.append(", ");
            }
            sbT.append(b(str));
            sbT.append("=");
            Object obj = bundle.get(str);
            sbT.append(obj instanceof Bundle ? f(new Object[]{obj}) : obj instanceof Object[] ? f((Object[]) obj) : obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sbT.append("}]");
        return sbT.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbT = c7.a.t("[");
        for (Object obj : objArr) {
            String strE = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (strE != null) {
                if (sbT.length() != 1) {
                    sbT.append(", ");
                }
                sbT.append(strE);
            }
        }
        sbT.append("]");
        return sbT.toString();
    }
}
