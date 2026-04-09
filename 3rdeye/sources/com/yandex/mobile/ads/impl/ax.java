package com.yandex.mobile.ads.impl;

import N7.C1154e9;
import com.yandex.mobile.ads.impl.dy;

/* loaded from: classes3.dex */
public abstract class ax {

    /* renamed from: a, reason: collision with root package name */
    private final String f25007a;

    public static final class a extends ax {

        /* renamed from: b, reason: collision with root package name */
        private final String f25008b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String unitId) {
            super("Ad Units", 0);
            kotlin.jvm.internal.l.f(unitId, "unitId");
            this.f25008b = unitId;
        }

        public final String b() {
            return this.f25008b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.l.b(this.f25008b, ((a) obj).f25008b);
        }

        public final int hashCode() {
            return this.f25008b.hashCode();
        }

        public final String toString() {
            return C1154e9.i("AdUnit(unitId=", this.f25008b, ")");
        }
    }

    public static final class b extends ax {

        /* renamed from: b, reason: collision with root package name */
        private final dy.g f25009b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(dy.g adapter) {
            super(adapter.f(), 0);
            kotlin.jvm.internal.l.f(adapter, "adapter");
            this.f25009b = adapter;
        }

        public final dy.g b() {
            return this.f25009b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.l.b(this.f25009b, ((b) obj).f25009b);
        }

        public final int hashCode() {
            return this.f25009b.hashCode();
        }

        public final String toString() {
            return "AdUnitMediationAdapter(adapter=" + this.f25009b + ")";
        }
    }

    public static final class c extends ax {

        /* renamed from: b, reason: collision with root package name */
        public static final c f25010b = new c();

        private c() {
            super("Ad Units", 0);
        }
    }

    public static final class d extends ax {

        /* renamed from: b, reason: collision with root package name */
        public static final d f25011b = new d();

        private d() {
            super("Debug Panel", 0);
        }
    }

    public static final class e extends ax {

        /* renamed from: b, reason: collision with root package name */
        private final String f25012b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String network) {
            super(network, 0);
            kotlin.jvm.internal.l.f(network, "network");
            this.f25012b = network;
        }

        public final String b() {
            return this.f25012b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && kotlin.jvm.internal.l.b(this.f25012b, ((e) obj).f25012b);
        }

        public final int hashCode() {
            return this.f25012b.hashCode();
        }

        public final String toString() {
            return C1154e9.i("MediationNetwork(network=", this.f25012b, ")");
        }
    }

    private ax(String str) {
        this.f25007a = str;
    }

    public final String a() {
        return this.f25007a;
    }

    public /* synthetic */ ax(String str, int i) {
        this(str);
    }
}
