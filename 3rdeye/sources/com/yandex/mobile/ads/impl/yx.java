package com.yandex.mobile.ads.impl;

import N7.C1154e9;
import android.net.Uri;
import io.appmetrica.analytics.impl.Oo;

/* loaded from: classes3.dex */
public interface yx {

    public static final class a implements yx {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36088a = new a();

        private a() {
        }
    }

    public static final class b implements yx {

        /* renamed from: a, reason: collision with root package name */
        public static final b f36089a = new b();

        private b() {
        }
    }

    public static final class c implements yx {

        /* renamed from: a, reason: collision with root package name */
        private final String f36090a;

        public c(String text) {
            kotlin.jvm.internal.l.f(text, "text");
            this.f36090a = text;
        }

        public final String a() {
            return this.f36090a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.l.b(this.f36090a, ((c) obj).f36090a);
        }

        public final int hashCode() {
            return this.f36090a.hashCode();
        }

        public final String toString() {
            return C1154e9.i("Message(text=", this.f36090a, ")");
        }
    }

    public static final class d implements yx {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f36091a;

        public d(Uri reportUri) {
            kotlin.jvm.internal.l.f(reportUri, "reportUri");
            this.f36091a = reportUri;
        }

        public final Uri a() {
            return this.f36091a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.l.b(this.f36091a, ((d) obj).f36091a);
        }

        public final int hashCode() {
            return this.f36091a.hashCode();
        }

        public final String toString() {
            return "ShareReport(reportUri=" + this.f36091a + ")";
        }
    }

    public static final class e implements yx {

        /* renamed from: a, reason: collision with root package name */
        private final String f36092a;

        /* renamed from: b, reason: collision with root package name */
        private final String f36093b;

        public e(String message) {
            kotlin.jvm.internal.l.f(message, "message");
            this.f36092a = "Warning";
            this.f36093b = message;
        }

        public final String a() {
            return this.f36093b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.l.b(this.f36092a, eVar.f36092a) && kotlin.jvm.internal.l.b(this.f36093b, eVar.f36093b);
        }

        public final int hashCode() {
            return this.f36093b.hashCode() + (this.f36092a.hashCode() * 31);
        }

        public final String toString() {
            return Oo.h("Warning(title=", this.f36092a, ", message=", this.f36093b, ")");
        }
    }
}
