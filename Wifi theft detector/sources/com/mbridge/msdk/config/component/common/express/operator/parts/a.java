package com.mbridge.msdk.config.component.common.express.operator.parts;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f13191a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f13192b;

    private a(boolean z10, Object obj) {
        this.f13191a = z10;
        this.f13192b = obj;
    }

    public static a a(Object obj) {
        return new a(true, obj);
    }

    public static a c() {
        return new a(false, null);
    }

    public boolean b() {
        return this.f13191a;
    }

    public Object a() {
        Object obj = this.f13192b;
        return obj instanceof Boolean ? Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0) : obj instanceof Integer ? String.valueOf(obj) : obj;
    }
}
