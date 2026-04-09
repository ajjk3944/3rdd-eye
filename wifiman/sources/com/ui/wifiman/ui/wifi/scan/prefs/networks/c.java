package com.ui.wifiman.ui.wifi.scan.prefs.networks;

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
        private final boolean f45202a;

        /* renamed from: b, reason: collision with root package name */
        private final d.b f45203b;

        /* renamed from: c, reason: collision with root package name */
        private final Void f45204c;

        /* renamed from: d, reason: collision with root package name */
        private final Void f45205d;

        /* renamed from: e, reason: collision with root package name */
        private final InterfaceC6824a f45206e;

        public a(boolean z10) {
            super(null);
            this.f45202a = z10;
            this.f45203b = new d.b(AbstractC6780c.f53317G5);
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ String a() {
            return (String) f();
        }

        @Override // F9.C
        public InterfaceC6824a b() {
            return this.f45206e;
        }

        @Override // F9.C
        public boolean c() {
            return this.f45202a;
        }

        @Override // F9.C
        public boolean d() {
            return true;
        }

        public Void e() {
            return this.f45204c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f45202a == ((a) obj).f45202a;
        }

        public Void f() {
            return this.f45205d;
        }

        @Override // F9.C
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public d.b getTitle() {
            return this.f45203b;
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ InterfaceC7929a getIcon() {
            return (InterfaceC7929a) e();
        }

        public int hashCode() {
            return Boolean.hashCode(this.f45202a);
        }

        public String toString() {
            return "SSID(selected=" + this.f45202a + ")";
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f45207a;

        /* renamed from: b, reason: collision with root package name */
        private final d.b f45208b;

        /* renamed from: c, reason: collision with root package name */
        private final Void f45209c;

        /* renamed from: d, reason: collision with root package name */
        private final Void f45210d;

        /* renamed from: e, reason: collision with root package name */
        private final InterfaceC6824a f45211e;

        public b(boolean z10) {
            super(null);
            this.f45207a = z10;
            this.f45208b = new d.b(AbstractC6780c.f53314G2);
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ String a() {
            return (String) f();
        }

        @Override // F9.C
        public InterfaceC6824a b() {
            return this.f45211e;
        }

        @Override // F9.C
        public boolean c() {
            return this.f45207a;
        }

        @Override // F9.C
        public boolean d() {
            return true;
        }

        public Void e() {
            return this.f45209c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f45207a == ((b) obj).f45207a;
        }

        public Void f() {
            return this.f45210d;
        }

        @Override // F9.C
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public d.b getTitle() {
            return this.f45208b;
        }

        @Override // F9.C
        public /* bridge */ /* synthetic */ InterfaceC7929a getIcon() {
            return (InterfaceC7929a) e();
        }

        public int hashCode() {
            return Boolean.hashCode(this.f45207a);
        }

        public String toString() {
            return "Signal(selected=" + this.f45207a + ")";
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }
}
