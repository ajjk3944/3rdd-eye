package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes3.dex */
public interface M {

    public static abstract class a {
        static a a(String str, K k10) {
            return new C5101c(str, k10.b(), k10.a());
        }

        public static a b(String str) {
            return new C5101c(str, null, null);
        }

        public abstract String c();

        public abstract String d();

        public abstract String e();
    }

    a a();
}
