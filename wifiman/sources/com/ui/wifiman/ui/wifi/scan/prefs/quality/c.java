package com.ui.wifiman.ui.wifi.scan.prefs.quality;

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
        private final boolean f45229a;

        /* renamed from: b, reason: collision with root package name */
        private final d.b f45230b;

        /* renamed from: c, reason: collision with root package name */
        private final Void f45231c;

        /* renamed from: d, reason: collision with root package name */
        private final Void f45232d;

        /* renamed from: e, reason: collision with root package name */
        private final Void f45233e;

        public a(boolean z10) {
            super(null);
            this.f45229a = z10;
            this.f45230b = new d.b(AbstractC6780c.f53502h5);
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ String a() {
            return (String) g();
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ InterfaceC6824a b() {
            return (InterfaceC6824a) f();
        }

        @Override // F9.C
        public boolean c() {
            return this.f45229a;
        }

        @Override // F9.C
        public boolean d() {
            return true;
        }

        public Void e() {
            return this.f45231c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f45229a == ((a) obj).f45229a;
        }

        public Void f() {
            return this.f45233e;
        }

        public Void g() {
            return this.f45232d;
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ InterfaceC7929a getIcon() {
            return (InterfaceC7929a) e();
        }

        @Override // F9.C
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public d.b getTitle() {
            return this.f45230b;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f45229a);
        }

        public String toString() {
            return "ChannelNumber(selected=" + this.f45229a + ")";
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f45234a;

        /* renamed from: b, reason: collision with root package name */
        private final d.b f45235b;

        /* renamed from: c, reason: collision with root package name */
        private final Void f45236c;

        /* renamed from: d, reason: collision with root package name */
        private final Void f45237d;

        /* renamed from: e, reason: collision with root package name */
        private final Void f45238e;

        public b(boolean z10) {
            super(null);
            this.f45234a = z10;
            this.f45235b = new d.b(AbstractC6780c.f53495g5);
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ String a() {
            return (String) g();
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ InterfaceC6824a b() {
            return (InterfaceC6824a) f();
        }

        @Override // F9.C
        public boolean c() {
            return this.f45234a;
        }

        @Override // F9.C
        public boolean d() {
            return true;
        }

        public Void e() {
            return this.f45236c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f45234a == ((b) obj).f45234a;
        }

        public Void f() {
            return this.f45238e;
        }

        public Void g() {
            return this.f45237d;
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ InterfaceC7929a getIcon() {
            return (InterfaceC7929a) e();
        }

        @Override // F9.C
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public d.b getTitle() {
            return this.f45235b;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f45234a);
        }

        public String toString() {
            return "ChannelQuality(selected=" + this.f45234a + ")";
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }
}
