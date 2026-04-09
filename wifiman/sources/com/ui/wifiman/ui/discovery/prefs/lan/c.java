package com.ui.wifiman.ui.discovery.prefs.lan;

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
        private final boolean f44601a;

        /* renamed from: b, reason: collision with root package name */
        private final d.b f44602b;

        /* renamed from: c, reason: collision with root package name */
        private final Void f44603c;

        /* renamed from: d, reason: collision with root package name */
        private final Void f44604d;

        /* renamed from: e, reason: collision with root package name */
        private final InterfaceC6824a f44605e;

        public a(boolean z10) {
            super(null);
            this.f44601a = z10;
            this.f44602b = new d.b(AbstractC6780c.f53540n1);
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ String a() {
            return (String) f();
        }

        @Override // F9.C
        public InterfaceC6824a b() {
            return this.f44605e;
        }

        @Override // F9.C
        public boolean c() {
            return this.f44601a;
        }

        @Override // F9.C
        public boolean d() {
            return true;
        }

        public Void e() {
            return this.f44603c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f44601a == ((a) obj).f44601a;
        }

        public Void f() {
            return this.f44604d;
        }

        @Override // F9.C
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public d.b getTitle() {
            return this.f44602b;
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ InterfaceC7929a getIcon() {
            return (InterfaceC7929a) e();
        }

        public int hashCode() {
            return Boolean.hashCode(this.f44601a);
        }

        public String toString() {
            return "IP(selected=" + this.f44601a + ")";
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f44606a;

        /* renamed from: b, reason: collision with root package name */
        private final d.b f44607b;

        /* renamed from: c, reason: collision with root package name */
        private final Void f44608c;

        /* renamed from: d, reason: collision with root package name */
        private final Void f44609d;

        /* renamed from: e, reason: collision with root package name */
        private final InterfaceC6824a f44610e;

        public b(boolean z10) {
            super(null);
            this.f44606a = z10;
            this.f44607b = new d.b(AbstractC6780c.f53582t1);
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ String a() {
            return (String) f();
        }

        @Override // F9.C
        public InterfaceC6824a b() {
            return this.f44610e;
        }

        @Override // F9.C
        public boolean c() {
            return this.f44606a;
        }

        @Override // F9.C
        public boolean d() {
            return true;
        }

        public Void e() {
            return this.f44608c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f44606a == ((b) obj).f44606a;
        }

        public Void f() {
            return this.f44609d;
        }

        @Override // F9.C
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public d.b getTitle() {
            return this.f44607b;
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ InterfaceC7929a getIcon() {
            return (InterfaceC7929a) e();
        }

        public int hashCode() {
            return Boolean.hashCode(this.f44606a);
        }

        public String toString() {
            return "Name(selected=" + this.f44606a + ")";
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }
}
