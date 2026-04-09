package com.yandex.mobile.ads.impl;

import c9.C2092m;
import c9.C2097r;
import com.yandex.mobile.ads.impl.ez0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class rz0 {

    /* renamed from: a, reason: collision with root package name */
    private final fz0 f32817a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f32818a;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC0418a f32819b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: com.yandex.mobile.ads.impl.rz0$a$a, reason: collision with other inner class name */
        public static final class EnumC0418a {

            /* renamed from: b, reason: collision with root package name */
            public static final EnumC0418a f32820b;

            /* renamed from: c, reason: collision with root package name */
            public static final EnumC0418a f32821c;

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ EnumC0418a[] f32822d;

            static {
                EnumC0418a enumC0418a = new EnumC0418a(0, "INFO");
                f32820b = enumC0418a;
                EnumC0418a enumC0418a2 = new EnumC0418a(1, "ERROR");
                f32821c = enumC0418a2;
                EnumC0418a[] enumC0418aArr = {enumC0418a, enumC0418a2};
                f32822d = enumC0418aArr;
                com.google.gson.internal.c.l(enumC0418aArr);
            }

            private EnumC0418a(int i, String str) {
            }

            public static EnumC0418a valueOf(String str) {
                return (EnumC0418a) Enum.valueOf(EnumC0418a.class, str);
            }

            public static EnumC0418a[] values() {
                return (EnumC0418a[]) f32822d.clone();
            }
        }

        public a(String message, EnumC0418a type) {
            kotlin.jvm.internal.l.f(message, "message");
            kotlin.jvm.internal.l.f(type, "type");
            this.f32818a = message;
            this.f32819b = type;
        }

        public final String a() {
            return this.f32818a;
        }

        public final EnumC0418a b() {
            return this.f32819b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.l.b(this.f32818a, aVar.f32818a) && this.f32819b == aVar.f32819b;
        }

        public final int hashCode() {
            return this.f32819b.hashCode() + (this.f32818a.hashCode() * 31);
        }

        public final String toString() {
            return "MediationNetworkMessage(message=" + this.f32818a + ", type=" + this.f32819b + ")";
        }
    }

    public rz0(fz0 mediationNetworkValidator) {
        kotlin.jvm.internal.l.f(mediationNetworkValidator, "mediationNetworkValidator");
        this.f32817a = mediationNetworkValidator;
    }

    private static void a(ArrayList arrayList, String str) {
        int iMax = Math.max(4, 44 - str.length());
        int i = iMax / 2;
        String strW = y9.n.W(i, "-");
        String strW2 = y9.n.W((iMax % 2) + i, "-");
        String strW3 = y9.n.W(1, " ");
        arrayList.add(new a(strW + strW3 + str + strW3 + strW2, a.EnumC0418a.f32820b));
    }

    private static void a(ArrayList arrayList, List list, String str, boolean z10) {
        a.EnumC0418a enumC0418a;
        String str2;
        String str3;
        if (z10) {
            enumC0418a = a.EnumC0418a.f32820b;
            str2 = "ADAPTERS";
            str3 = "INTEGRATED SUCCESSFULLY";
        } else {
            enumC0418a = a.EnumC0418a.f32821c;
            str2 = "MISSING ADAPTERS";
            str3 = "NOT INTEGRATED";
        }
        ArrayList arrayList2 = new ArrayList(C2092m.T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ez0.c) it.next()).a());
        }
        String strU0 = C2097r.u0(arrayList2, null, str2.concat(": "), null, null, 61);
        String strO = B4.g.o(str, ": ", str3);
        arrayList.add(new a(strU0, enumC0418a));
        arrayList.add(new a(strO, enumC0418a));
    }

    private static void a(ArrayList arrayList, String str, String str2) {
        if (str != null && !y9.q.i0(str)) {
            arrayList.add(new a("SDK Version: ".concat(str), a.EnumC0418a.f32820b));
        }
        if (str2 == null || y9.q.i0(str2)) {
            return;
        }
        arrayList.add(new a("ADAPTERS Version: ".concat(str2), a.EnumC0418a.f32820b));
    }

    public final ArrayList a(ArrayList networks) {
        kotlin.jvm.internal.l.f(networks, "networks");
        ArrayList arrayList = new ArrayList();
        Iterator it = networks.iterator();
        while (it.hasNext()) {
            ez0 ez0Var = (ez0) it.next();
            a(arrayList, ez0Var.d());
            String strE = ez0Var.e();
            String strB = ((ez0.c) C2097r.p0(ez0Var.b())).b();
            this.f32817a.getClass();
            boolean zA = fz0.a(ez0Var);
            if (zA) {
                a(arrayList, strE, strB);
            }
            a(arrayList, ez0Var.b(), ez0Var.d(), zA);
        }
        return arrayList;
    }
}
