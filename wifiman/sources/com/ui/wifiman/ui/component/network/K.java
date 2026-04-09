package com.ui.wifiman.ui.component.network;

import b8.AbstractC4074a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class K {

    public static final class a extends K {

        /* renamed from: a, reason: collision with root package name */
        private final Integer f44340a;

        /* renamed from: b, reason: collision with root package name */
        private final s9.d f44341b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f44342c;

        public a(Integer num, s9.d dVar, boolean z10) {
            super(null);
            this.f44340a = num;
            this.f44341b = dVar;
            this.f44342c = z10;
        }

        public final Integer a() {
            return this.f44340a;
        }

        public final boolean b() {
            return this.f44342c;
        }

        public final s9.d c() {
            return this.f44341b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f44340a, aVar.f44340a) && AbstractC6492s.d(this.f44341b, aVar.f44341b) && this.f44342c == aVar.f44342c;
        }

        public int hashCode() {
            Integer num = this.f44340a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            s9.d dVar = this.f44341b;
            return ((iHashCode + (dVar != null ? dVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.f44342c);
        }

        public String toString() {
            return "ConnectivityInfo(clientCount=" + this.f44340a + ", wifiExperience=" + this.f44341b + ", hasSpeedtestServer=" + this.f44342c + ")";
        }
    }

    public static final class b extends K {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC4074a f44343a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC4074a availability) {
            super(null);
            AbstractC6492s.i(availability, "availability");
            this.f44343a = availability;
        }

        public final AbstractC4074a a() {
            return this.f44343a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC6492s.d(this.f44343a, ((b) obj).f44343a);
        }

        public int hashCode() {
            return this.f44343a.hashCode();
        }

        public String toString() {
            return "InternetState(availability=" + this.f44343a + ")";
        }
    }

    public /* synthetic */ K(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private K() {
    }
}
