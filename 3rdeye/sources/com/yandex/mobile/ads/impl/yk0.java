package com.yandex.mobile.ads.impl;

import N7.C1154e9;
import android.net.Uri;

/* loaded from: classes3.dex */
public interface yk0 {

    public static final class a implements yk0 {

        /* renamed from: a, reason: collision with root package name */
        private final String f35847a;

        public a(String message) {
            kotlin.jvm.internal.l.f(message, "message");
            this.f35847a = message;
        }

        public final String a() {
            return this.f35847a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.l.b(this.f35847a, ((a) obj).f35847a);
        }

        public final int hashCode() {
            return this.f35847a.hashCode();
        }

        public final String toString() {
            return C1154e9.i("Failure(message=", this.f35847a, ")");
        }
    }

    public static final class b implements yk0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f35848a = new b();

        private b() {
        }
    }

    public static final class c implements yk0 {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f35849a;

        public c(Uri reportUri) {
            kotlin.jvm.internal.l.f(reportUri, "reportUri");
            this.f35849a = reportUri;
        }

        public final Uri a() {
            return this.f35849a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.l.b(this.f35849a, ((c) obj).f35849a);
        }

        public final int hashCode() {
            return this.f35849a.hashCode();
        }

        public final String toString() {
            return "Success(reportUri=" + this.f35849a + ")";
        }
    }
}
