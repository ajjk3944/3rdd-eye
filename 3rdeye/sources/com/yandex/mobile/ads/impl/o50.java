package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class o50 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f31185c;

    /* renamed from: d, reason: collision with root package name */
    public static final o50 f31186d;

    /* renamed from: e, reason: collision with root package name */
    public static final o50 f31187e;

    /* renamed from: f, reason: collision with root package name */
    public static final o50 f31188f;

    /* renamed from: g, reason: collision with root package name */
    public static final o50 f31189g;

    /* renamed from: h, reason: collision with root package name */
    public static final o50 f31190h;
    public static final o50 i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ o50[] f31191j;

    /* renamed from: b, reason: collision with root package name */
    private final int f31192b;

    public static final class a {
        private a() {
        }

        public static o50 a(int i) {
            for (o50 o50Var : o50.values()) {
                if (o50Var.a() == i) {
                    return o50Var;
                }
            }
            return null;
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    static {
        o50 o50Var = new o50(0, 0, "NO_ERROR");
        f31186d = o50Var;
        o50 o50Var2 = new o50(1, 1, "PROTOCOL_ERROR");
        f31187e = o50Var2;
        o50 o50Var3 = new o50(2, 2, "INTERNAL_ERROR");
        f31188f = o50Var3;
        o50 o50Var4 = new o50(3, 3, "FLOW_CONTROL_ERROR");
        f31189g = o50Var4;
        o50 o50Var5 = new o50(4, 4, "SETTINGS_TIMEOUT");
        o50 o50Var6 = new o50(5, 5, "STREAM_CLOSED");
        o50 o50Var7 = new o50(6, 6, "FRAME_SIZE_ERROR");
        o50 o50Var8 = new o50(7, 7, "REFUSED_STREAM");
        f31190h = o50Var8;
        o50 o50Var9 = new o50(8, 8, "CANCEL");
        i = o50Var9;
        o50[] o50VarArr = {o50Var, o50Var2, o50Var3, o50Var4, o50Var5, o50Var6, o50Var7, o50Var8, o50Var9, new o50(9, 9, "COMPRESSION_ERROR"), new o50(10, 10, "CONNECT_ERROR"), new o50(11, 11, "ENHANCE_YOUR_CALM"), new o50(12, 12, "INADEQUATE_SECURITY"), new o50(13, 13, "HTTP_1_1_REQUIRED")};
        f31191j = o50VarArr;
        com.google.gson.internal.c.l(o50VarArr);
        f31185c = new a(0);
    }

    private o50(int i10, int i11, String str) {
        this.f31192b = i11;
    }

    public static o50 valueOf(String str) {
        return (o50) Enum.valueOf(o50.class, str);
    }

    public static o50[] values() {
        return (o50[]) f31191j.clone();
    }

    public final int a() {
        return this.f31192b;
    }
}
