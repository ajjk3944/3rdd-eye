package com.yandex.mobile.ads.impl;

import N7.C1154e9;
import com.yandex.mobile.ads.impl.dy;

/* loaded from: classes3.dex */
public interface xx {

    public static final class a implements xx {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35526a = new a();

        private a() {
        }
    }

    public static final class b implements xx {

        /* renamed from: a, reason: collision with root package name */
        private final String f35527a;

        public b(String id) {
            kotlin.jvm.internal.l.f(id, "id");
            this.f35527a = id;
        }

        public final String a() {
            return this.f35527a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.l.b(this.f35527a, ((b) obj).f35527a);
        }

        public final int hashCode() {
            return this.f35527a.hashCode();
        }

        public final String toString() {
            return C1154e9.i("OnAdUnitClick(id=", this.f35527a, ")");
        }
    }

    public static final class c implements xx {

        /* renamed from: a, reason: collision with root package name */
        public static final c f35528a = new c();

        private c() {
        }
    }

    public static final class d implements xx {

        /* renamed from: a, reason: collision with root package name */
        public static final d f35529a = new d();

        private d() {
        }
    }

    public static final class e implements xx {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f35530a;

        public e(boolean z10) {
            this.f35530a = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f35530a == ((e) obj).f35530a;
        }

        public final int hashCode() {
            return this.f35530a ? 1231 : 1237;
        }

        public final String toString() {
            return "OnDebugErrorIndicatorSwitch(isChecked=" + this.f35530a + ")";
        }
    }

    public static final class f implements xx {

        /* renamed from: a, reason: collision with root package name */
        private final dy.g f35531a;

        public f(dy.g uiUnit) {
            kotlin.jvm.internal.l.f(uiUnit, "uiUnit");
            this.f35531a = uiUnit;
        }

        public final dy.g a() {
            return this.f35531a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && kotlin.jvm.internal.l.b(this.f35531a, ((f) obj).f35531a);
        }

        public final int hashCode() {
            return this.f35531a.hashCode();
        }

        public final String toString() {
            return "OnMediationNetworkClick(uiUnit=" + this.f35531a + ")";
        }
    }

    public static final class g implements xx {

        /* renamed from: a, reason: collision with root package name */
        public static final g f35532a = new g();

        private g() {
        }
    }

    public static final class h implements xx {

        /* renamed from: a, reason: collision with root package name */
        private final String f35533a;

        public h(String waring) {
            kotlin.jvm.internal.l.f(waring, "waring");
            this.f35533a = waring;
        }

        public final String a() {
            return this.f35533a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && kotlin.jvm.internal.l.b(this.f35533a, ((h) obj).f35533a);
        }

        public final int hashCode() {
            return this.f35533a.hashCode();
        }

        public final String toString() {
            return C1154e9.i("OnWarningButtonClick(waring=", this.f35533a, ")");
        }
    }
}
