package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes3.dex */
public final class vx {

    /* renamed from: a, reason: collision with root package name */
    private final a f34729a;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f34730b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f34731b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f34732c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f34733d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f34734e;

        static {
            a aVar = new a(0, "SUCCESS");
            f34731b = aVar;
            a aVar2 = new a(1, "WARNING");
            f34732c = aVar2;
            a aVar3 = new a(2, "ERROR");
            f34733d = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            f34734e = aVarArr;
            com.google.gson.internal.c.l(aVarArr);
        }

        private a(int i, String str) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f34734e.clone();
        }
    }

    public vx(a status, List<String> list) {
        kotlin.jvm.internal.l.f(status, "status");
        this.f34729a = status;
        this.f34730b = list;
    }

    public final List<String> a() {
        return this.f34730b;
    }

    public final a b() {
        return this.f34729a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx)) {
            return false;
        }
        vx vxVar = (vx) obj;
        return this.f34729a == vxVar.f34729a && kotlin.jvm.internal.l.b(this.f34730b, vxVar.f34730b);
    }

    public final int hashCode() {
        int iHashCode = this.f34729a.hashCode() * 31;
        List<String> list = this.f34730b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "DebugPanelSdkIntegrationStatusData(status=" + this.f34729a + ", messages=" + this.f34730b + ")";
    }
}
