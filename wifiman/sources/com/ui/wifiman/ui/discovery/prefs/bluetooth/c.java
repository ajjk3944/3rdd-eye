package com.ui.wifiman.ui.discovery.prefs.bluetooth;

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
        private final boolean f44567a;

        /* renamed from: b, reason: collision with root package name */
        private final d.b f44568b;

        /* renamed from: c, reason: collision with root package name */
        private final Void f44569c;

        /* renamed from: d, reason: collision with root package name */
        private final Void f44570d;

        /* renamed from: e, reason: collision with root package name */
        private final InterfaceC6824a f44571e;

        public a(boolean z10) {
            super(null);
            this.f44567a = z10;
            this.f44568b = new d.b(AbstractC6780c.f53568r1);
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ String a() {
            return (String) f();
        }

        @Override // F9.C
        public InterfaceC6824a b() {
            return this.f44571e;
        }

        @Override // F9.C
        public boolean c() {
            return this.f44567a;
        }

        @Override // F9.C
        public boolean d() {
            return true;
        }

        public Void e() {
            return this.f44569c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f44567a == ((a) obj).f44567a;
        }

        public Void f() {
            return this.f44570d;
        }

        @Override // F9.C
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public d.b getTitle() {
            return this.f44568b;
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ InterfaceC7929a getIcon() {
            return (InterfaceC7929a) e();
        }

        public int hashCode() {
            return Boolean.hashCode(this.f44567a);
        }

        public String toString() {
            return "Mac(selected=" + this.f44567a + ")";
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f44572a;

        /* renamed from: b, reason: collision with root package name */
        private final d.b f44573b;

        /* renamed from: c, reason: collision with root package name */
        private final Void f44574c;

        /* renamed from: d, reason: collision with root package name */
        private final Void f44575d;

        /* renamed from: e, reason: collision with root package name */
        private final InterfaceC6824a f44576e;

        public b(boolean z10) {
            super(null);
            this.f44572a = z10;
            this.f44573b = new d.b(AbstractC6780c.f53582t1);
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ String a() {
            return (String) f();
        }

        @Override // F9.C
        public InterfaceC6824a b() {
            return this.f44576e;
        }

        @Override // F9.C
        public boolean c() {
            return this.f44572a;
        }

        @Override // F9.C
        public boolean d() {
            return true;
        }

        public Void e() {
            return this.f44574c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f44572a == ((b) obj).f44572a;
        }

        public Void f() {
            return this.f44575d;
        }

        @Override // F9.C
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public d.b getTitle() {
            return this.f44573b;
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ InterfaceC7929a getIcon() {
            return (InterfaceC7929a) e();
        }

        public int hashCode() {
            return Boolean.hashCode(this.f44572a);
        }

        public String toString() {
            return "Name(selected=" + this.f44572a + ")";
        }
    }

    /* renamed from: com.ui.wifiman.ui.discovery.prefs.bluetooth.c$c, reason: collision with other inner class name */
    public static final class C1561c extends c {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f44577a;

        /* renamed from: b, reason: collision with root package name */
        private final d.b f44578b;

        /* renamed from: c, reason: collision with root package name */
        private final Void f44579c;

        /* renamed from: d, reason: collision with root package name */
        private final Void f44580d;

        /* renamed from: e, reason: collision with root package name */
        private final InterfaceC6824a f44581e;

        public C1561c(boolean z10) {
            super(null);
            this.f44577a = z10;
            this.f44578b = new d.b(AbstractC6780c.f53314G2);
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ String a() {
            return (String) f();
        }

        @Override // F9.C
        public InterfaceC6824a b() {
            return this.f44581e;
        }

        @Override // F9.C
        public boolean c() {
            return this.f44577a;
        }

        @Override // F9.C
        public boolean d() {
            return true;
        }

        public Void e() {
            return this.f44579c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1561c) && this.f44577a == ((C1561c) obj).f44577a;
        }

        public Void f() {
            return this.f44580d;
        }

        @Override // F9.C
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public d.b getTitle() {
            return this.f44578b;
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ InterfaceC7929a getIcon() {
            return (InterfaceC7929a) e();
        }

        public int hashCode() {
            return Boolean.hashCode(this.f44577a);
        }

        public String toString() {
            return "Signal(selected=" + this.f44577a + ")";
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }
}
