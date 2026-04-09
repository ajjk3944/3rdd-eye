package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class qw {

    /* renamed from: a, reason: collision with root package name */
    private final String f32361a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32362b;

    /* renamed from: c, reason: collision with root package name */
    private final a f32363c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f32364c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f32365d;

        /* renamed from: b, reason: collision with root package name */
        private final String f32366b;

        static {
            a aVar = new a(0, "ERROR", com.vungle.ads.internal.presenter.g.ERROR);
            a aVar2 = new a(1, "MESSAGE", "message");
            f32364c = aVar2;
            a[] aVarArr = {aVar, aVar2};
            f32365d = aVarArr;
            com.google.gson.internal.c.l(aVarArr);
        }

        private a(int i, String str, String str2) {
            this.f32366b = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f32365d.clone();
        }

        public final String a() {
            return this.f32366b;
        }
    }

    public qw(String str, String str2, a type) {
        kotlin.jvm.internal.l.f(type, "type");
        this.f32361a = str;
        this.f32362b = str2;
        this.f32363c = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw)) {
            return false;
        }
        qw qwVar = (qw) obj;
        return kotlin.jvm.internal.l.b(this.f32361a, qwVar.f32361a) && kotlin.jvm.internal.l.b(this.f32362b, qwVar.f32362b) && this.f32363c == qwVar.f32363c;
    }

    public final int hashCode() {
        String str = this.f32361a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f32362b;
        return this.f32363c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f32361a;
        String str2 = this.f32362b;
        a aVar = this.f32363c;
        StringBuilder sbD = j6.l.d("DebugPanelAlertData(title=", str, ", message=", str2, ", type=");
        sbD.append(aVar);
        sbD.append(")");
        return sbD.toString();
    }
}
