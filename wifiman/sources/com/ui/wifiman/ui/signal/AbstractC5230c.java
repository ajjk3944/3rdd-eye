package com.ui.wifiman.ui.signal;

import Te.C3597p;
import com.ui.wifiman.ui.signal.AbstractC5239l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.ui.wifiman.ui.signal.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC5230c {

    /* renamed from: com.ui.wifiman.ui.signal.c$a */
    public static final class a extends AbstractC5230c {

        /* renamed from: a, reason: collision with root package name */
        private final String f44801a;

        /* renamed from: b, reason: collision with root package name */
        private final String f44802b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String id2) {
            super(null);
            AbstractC6492s.i(id2, "id");
            this.f44801a = id2;
            this.f44802b = "recordLoading";
        }

        @Override // com.ui.wifiman.ui.signal.AbstractC5230c
        public String a() {
            return this.f44801a;
        }

        @Override // com.ui.wifiman.ui.signal.AbstractC5230c
        public String b() {
            return this.f44802b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC6492s.d(this.f44801a, ((a) obj).f44801a);
        }

        public int hashCode() {
            return this.f44801a.hashCode();
        }

        public String toString() {
            return "LoadingRecord(id=" + this.f44801a + ")";
        }
    }

    /* renamed from: com.ui.wifiman.ui.signal.c$b */
    public static final class b extends AbstractC5230c {

        /* renamed from: a, reason: collision with root package name */
        private final C3597p f44803a;

        /* renamed from: b, reason: collision with root package name */
        private final String f44804b;

        /* renamed from: c, reason: collision with root package name */
        private final String f44805c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3597p record) {
            super(null);
            AbstractC6492s.i(record, "record");
            this.f44803a = record;
            this.f44804b = String.valueOf(record.a());
            this.f44805c = "record";
        }

        @Override // com.ui.wifiman.ui.signal.AbstractC5230c
        public String a() {
            return this.f44804b;
        }

        @Override // com.ui.wifiman.ui.signal.AbstractC5230c
        public String b() {
            return this.f44805c;
        }

        public final C3597p c() {
            return this.f44803a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC6492s.d(this.f44803a, ((b) obj).f44803a);
        }

        public int hashCode() {
            return this.f44803a.hashCode();
        }

        public String toString() {
            return "Record(record=" + this.f44803a + ")";
        }
    }

    /* renamed from: com.ui.wifiman.ui.signal.c$c, reason: collision with other inner class name */
    public static final class C1607c extends AbstractC5230c {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC5239l.b.AbstractC1612b.d f44806a;

        /* renamed from: b, reason: collision with root package name */
        private final String f44807b;

        /* renamed from: c, reason: collision with root package name */
        private final String f44808c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1607c(AbstractC5239l.b.AbstractC1612b.d requirement) {
            super(null);
            AbstractC6492s.i(requirement, "requirement");
            this.f44806a = requirement;
            this.f44807b = requirement.getClass().getName();
            this.f44808c = "requirement";
        }

        @Override // com.ui.wifiman.ui.signal.AbstractC5230c
        public String a() {
            return this.f44807b;
        }

        @Override // com.ui.wifiman.ui.signal.AbstractC5230c
        public String b() {
            return this.f44808c;
        }

        public final AbstractC5239l.b.AbstractC1612b.d c() {
            return this.f44806a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1607c) && AbstractC6492s.d(this.f44806a, ((C1607c) obj).f44806a);
        }

        public int hashCode() {
            return this.f44806a.hashCode();
        }

        public String toString() {
            return "ScanStartRequirement(requirement=" + this.f44806a + ")";
        }
    }

    /* renamed from: com.ui.wifiman.ui.signal.c$d */
    public static final class d extends AbstractC5230c {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f44809a;

        /* renamed from: b, reason: collision with root package name */
        private final String f44810b;

        /* renamed from: c, reason: collision with root package name */
        private final String f44811c;

        public d(boolean z10) {
            super(null);
            this.f44809a = z10;
            this.f44810b = "btnStart";
            this.f44811c = b();
        }

        @Override // com.ui.wifiman.ui.signal.AbstractC5230c
        public String a() {
            return this.f44811c;
        }

        @Override // com.ui.wifiman.ui.signal.AbstractC5230c
        public String b() {
            return this.f44810b;
        }

        public final boolean c() {
            return this.f44809a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f44809a == ((d) obj).f44809a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f44809a);
        }

        public String toString() {
            return "StartBtn(enabled=" + this.f44809a + ")";
        }
    }

    public /* synthetic */ AbstractC5230c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    public abstract String b();

    private AbstractC5230c() {
    }
}
