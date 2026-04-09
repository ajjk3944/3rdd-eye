package Af;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class H {

    public static final class a extends H {

        /* renamed from: a, reason: collision with root package name */
        private final Float f657a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f658b;

        public a(Float f10, boolean z10) {
            super(null);
            this.f657a = f10;
            this.f658b = z10;
        }

        public final Float a() {
            return this.f657a;
        }

        public final boolean b() {
            return this.f658b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f657a, aVar.f657a) && this.f658b == aVar.f658b;
        }

        public int hashCode() {
            Float f10 = this.f657a;
            return ((f10 == null ? 0 : f10.hashCode()) * 31) + Boolean.hashCode(this.f658b);
        }

        public String toString() {
            return "Connected(batteryState=" + this.f657a + ", charging=" + this.f658b + ")";
        }
    }

    public static final class b extends H {

        /* renamed from: a, reason: collision with root package name */
        public static final b f659a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 1976842887;
        }

        public String toString() {
            return "Connecting";
        }
    }

    public static final class c extends H {

        /* renamed from: a, reason: collision with root package name */
        public static final c f660a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -1933987254;
        }

        public String toString() {
            return "Disconnected";
        }
    }

    public /* synthetic */ H(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private H() {
    }
}
