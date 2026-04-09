package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
public final class D2 {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference f35834b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReference f35835c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicReference f35836d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    private final G2 f35837a;

    public D2(G2 g22) {
        this.f35837a = g22;
    }

    private static String d(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        AbstractC7901p.l(strArr);
        AbstractC7901p.l(strArr2);
        AbstractC7901p.l(atomicReference);
        AbstractC7901p.a(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Objects.equals(str, strArr[i10])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i10] == null) {
                            strArr3[i10] = strArr2[i10] + "(" + strArr[i10] + ")";
                        }
                        str2 = strArr3[i10];
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    private final String e(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : objArr) {
            String strA = obj instanceof Bundle ? a((Bundle) obj) : String.valueOf(obj);
            if (strA != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(strA);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    protected final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f35837a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(f(str));
            sb2.append("=");
            Object obj = bundle.get(str);
            sb2.append(obj instanceof Bundle ? e(new Object[]{obj}) : obj instanceof Object[] ? e((Object[]) obj) : obj instanceof ArrayList ? e(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb2.append("}]");
        return sb2.toString();
    }

    protected final String b(L l10) {
        if (l10 == null) {
            return null;
        }
        if (!this.f35837a.zza()) {
            return l10.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(l10.f35976c);
        sb2.append(",name=");
        sb2.append(c(l10.f35974a));
        sb2.append(",params=");
        K k10 = l10.f35975b;
        sb2.append(k10 != null ? !this.f35837a.zza() ? k10.toString() : a(k10.g()) : null);
        return sb2.toString();
    }

    protected final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f35837a.zza() ? str : d(str, AbstractC4898l4.f36583c, AbstractC4898l4.f36581a, f35834b);
    }

    protected final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f35837a.zza() ? str : d(str, AbstractC4882j4.f36557b, AbstractC4882j4.f36556a, f35835c);
    }

    protected final String g(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f35837a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return d(str, AbstractC4914n4.f36604b, AbstractC4914n4.f36603a, f35836d);
        }
        return "experiment_id(" + str + ")";
    }
}
