package com.ui.wifiman.ui.settings.preferences;

import F9.C;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import s9.InterfaceC7929a;
import s9.d;

/* loaded from: classes4.dex */
abstract class t implements C {

    public static final class a extends t {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f44709a;

        /* renamed from: b, reason: collision with root package name */
        private final T7.c f44710b;

        /* renamed from: c, reason: collision with root package name */
        private final d.b f44711c;

        /* renamed from: d, reason: collision with root package name */
        private final Void f44712d;

        /* renamed from: e, reason: collision with root package name */
        private final Void f44713e;

        /* renamed from: f, reason: collision with root package name */
        private final InterfaceC6824a f44714f;

        public a(boolean z10) {
            super(null);
            this.f44709a = z10;
            this.f44710b = T7.c.IMPERIAL;
            this.f44711c = new d.b(AbstractC6780c.f53580t);
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ String a() {
            return (String) g();
        }

        @Override // F9.C
        public InterfaceC6824a b() {
            return this.f44714f;
        }

        @Override // F9.C
        public boolean c() {
            return this.f44709a;
        }

        @Override // F9.C
        public boolean d() {
            return true;
        }

        @Override // com.ui.wifiman.ui.settings.preferences.t
        public T7.c e() {
            return this.f44710b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f44709a == ((a) obj).f44709a;
        }

        public Void f() {
            return this.f44712d;
        }

        public Void g() {
            return this.f44713e;
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ InterfaceC7929a getIcon() {
            return (InterfaceC7929a) f();
        }

        @Override // F9.C
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public d.b getTitle() {
            return this.f44711c;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f44709a);
        }

        public String toString() {
            return "Imperial(selected=" + this.f44709a + ")";
        }
    }

    public static final class b extends t {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f44715a;

        /* renamed from: b, reason: collision with root package name */
        private final T7.c f44716b;

        /* renamed from: c, reason: collision with root package name */
        private final d.b f44717c;

        /* renamed from: d, reason: collision with root package name */
        private final Void f44718d;

        /* renamed from: e, reason: collision with root package name */
        private final Void f44719e;

        /* renamed from: f, reason: collision with root package name */
        private final InterfaceC6824a f44720f;

        public b(boolean z10) {
            super(null);
            this.f44715a = z10;
            this.f44716b = T7.c.METRIC;
            this.f44717c = new d.b(AbstractC6780c.f53587u);
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ String a() {
            return (String) g();
        }

        @Override // F9.C
        public InterfaceC6824a b() {
            return this.f44720f;
        }

        @Override // F9.C
        public boolean c() {
            return this.f44715a;
        }

        @Override // F9.C
        public boolean d() {
            return true;
        }

        @Override // com.ui.wifiman.ui.settings.preferences.t
        public T7.c e() {
            return this.f44716b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f44715a == ((b) obj).f44715a;
        }

        public Void f() {
            return this.f44718d;
        }

        public Void g() {
            return this.f44719e;
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ InterfaceC7929a getIcon() {
            return (InterfaceC7929a) f();
        }

        @Override // F9.C
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public d.b getTitle() {
            return this.f44717c;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f44715a);
        }

        public String toString() {
            return "Metric(selected=" + this.f44715a + ")";
        }
    }

    public /* synthetic */ t(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract T7.c e();

    private t() {
    }
}
