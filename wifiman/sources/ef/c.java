package Ef;

import F9.C;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import s9.InterfaceC7929a;
import s9.d;

/* loaded from: classes4.dex */
public abstract class c implements C {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f4716a;

        /* renamed from: b, reason: collision with root package name */
        private final d.b f4717b;

        /* renamed from: c, reason: collision with root package name */
        private final Void f4718c;

        /* renamed from: d, reason: collision with root package name */
        private final Void f4719d;

        /* renamed from: e, reason: collision with root package name */
        private final InterfaceC6824a f4720e;

        public a(boolean z10) {
            super(null);
            this.f4716a = z10;
            this.f4717b = new d.b(AbstractC6780c.f53582t1);
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ String a() {
            return (String) f();
        }

        @Override // F9.C
        public InterfaceC6824a b() {
            return this.f4720e;
        }

        @Override // F9.C
        public boolean c() {
            return this.f4716a;
        }

        @Override // F9.C
        public boolean d() {
            return true;
        }

        public Void e() {
            return this.f4718c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f4716a == ((a) obj).f4716a;
        }

        public Void f() {
            return this.f4719d;
        }

        @Override // F9.C
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public d.b getTitle() {
            return this.f4717b;
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ InterfaceC7929a getIcon() {
            return (InterfaceC7929a) e();
        }

        public int hashCode() {
            return Boolean.hashCode(this.f4716a);
        }

        public String toString() {
            return "DeviceName(selected=" + this.f4716a + ")";
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f4721a;

        /* renamed from: b, reason: collision with root package name */
        private final d.b f4722b;

        /* renamed from: c, reason: collision with root package name */
        private final Void f4723c;

        /* renamed from: d, reason: collision with root package name */
        private final Void f4724d;

        /* renamed from: e, reason: collision with root package name */
        private final InterfaceC6824a f4725e;

        public b(boolean z10) {
            super(null);
            this.f4721a = z10;
            this.f4722b = new d.b(AbstractC6780c.f53314G2);
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ String a() {
            return (String) f();
        }

        @Override // F9.C
        public InterfaceC6824a b() {
            return this.f4725e;
        }

        @Override // F9.C
        public boolean c() {
            return this.f4721a;
        }

        @Override // F9.C
        public boolean d() {
            return true;
        }

        public Void e() {
            return this.f4723c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f4721a == ((b) obj).f4721a;
        }

        public Void f() {
            return this.f4724d;
        }

        @Override // F9.C
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public d.b getTitle() {
            return this.f4722b;
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ InterfaceC7929a getIcon() {
            return (InterfaceC7929a) e();
        }

        public int hashCode() {
            return Boolean.hashCode(this.f4721a);
        }

        public String toString() {
            return "Signal(selected=" + this.f4721a + ")";
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }
}
