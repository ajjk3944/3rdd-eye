package ec;

import android.os.Bundle;
import com.applovin.shadow.okhttp3.HttpUrl;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o0 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f22945b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference f22946c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReference f22947d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final d1 f22948a;

    public o0(d1 d1Var) {
        this.f22948a = d1Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        pb.y.h(atomicReference);
        pb.y.b(strArr.length == strArr2.length);
        for (int i4 = 0; i4 < strArr.length; i4++) {
            if (Objects.equals(str, strArr[i4])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i4];
                        if (str2 == null) {
                            str2 = strArr2[i4] + "(" + strArr[i4] + ")";
                            strArr3[i4] = str2;
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
        return !this.f22948a.a() ? str : g(str, b2.f22580c, b2.f22578a, f22945b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f22948a.a() ? str : g(str, b2.f22583f, b2.f22582e, f22946c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f22948a.a() ? str : str.startsWith("_exp_") ? d.h.t("experiment_id(", str, ")") : g(str, b2.j, b2.f22585i, f22947d);
    }

    public final String d(u uVar) {
        d1 d1Var = this.f22948a;
        if (!d1Var.a()) {
            return uVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(uVar.f23087c);
        sb2.append(",name=");
        sb2.append(a(uVar.f23085a));
        sb2.append(",params=");
        t tVar = uVar.f23086b;
        sb2.append(tVar == null ? null : !d1Var.a() ? tVar.f23067a.toString() : e(tVar.f()));
        return sb2.toString();
    }

    public final String e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f22948a.a()) {
            return bundle.toString();
        }
        StringBuilder sbZ = d.h.z("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbZ.length() != 8) {
                sbZ.append(", ");
            }
            sbZ.append(b(str));
            sbZ.append("=");
            Object obj = bundle.get(str);
            sbZ.append(obj instanceof Bundle ? f(new Object[]{obj}) : obj instanceof Object[] ? f((Object[]) obj) : obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sbZ.append("}]");
        return sbZ.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sbZ = d.h.z("[");
        for (Object obj : objArr) {
            String strE = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (strE != null) {
                if (sbZ.length() != 1) {
                    sbZ.append(", ");
                }
                sbZ.append(strE);
            }
        }
        sbZ.append("]");
        return sbZ.toString();
    }
}
