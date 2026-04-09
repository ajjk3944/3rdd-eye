package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2091l;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class x01 {

    public interface a {

        /* renamed from: com.yandex.mobile.ads.impl.x01$a$a, reason: collision with other inner class name */
        public static final class C0425a implements a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0425a f35142a = new C0425a();

            private C0425a() {
            }
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            private final List<oo0> f35143a;

            public b(List<oo0> causes) {
                kotlin.jvm.internal.l.f(causes, "causes");
                this.f35143a = causes;
            }

            public final List<oo0> a() {
                return this.f35143a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && kotlin.jvm.internal.l.b(this.f35143a, ((b) obj).f35143a);
            }

            public final int hashCode() {
                return this.f35143a.hashCode();
            }

            public final String toString() {
                return "IncorrectIntegration(causes=" + this.f35143a + ")";
            }
        }
    }

    public static a a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        o01 o01Var = new o01(new va2());
        C4098e1 c4098e1 = new C4098e1();
        ze zeVar = new ze();
        oo0 e4 = null;
        try {
            o01Var.a(v01.f34268b);
            e = null;
        } catch (oo0 e10) {
            e = e10;
        }
        try {
            c4098e1.a(context);
            e = null;
        } catch (oo0 e11) {
            e = e11;
        }
        try {
            og1.a(context);
            e = null;
        } catch (oo0 e12) {
            e = e12;
        }
        try {
            zeVar.a();
        } catch (oo0 e13) {
            e4 = e13;
        }
        ArrayList arrayListL = C2091l.l(new oo0[]{e, e, e, e4});
        return !arrayListL.isEmpty() ? new a.b(arrayListL) : a.C0425a.f35142a;
    }
}
