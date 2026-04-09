package b7;

import d7.C4278a;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes.dex */
public final class K extends P {

    /* renamed from: e, reason: collision with root package name */
    public static final K f17368e = new K(a.f17370g);

    /* renamed from: f, reason: collision with root package name */
    public static final String f17369f = "getColorAlpha";

    /* compiled from: ColorFunctions.kt */
    public final class a extends kotlin.jvm.internal.m implements p9.l<C4278a, Integer> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f17370g = new a(1);

        @Override // p9.l
        public final Integer invoke(C4278a c4278a) {
            return Integer.valueOf(c4278a.f37526a >>> 24);
        }
    }

    @Override // a7.g
    public final String c() {
        return f17369f;
    }
}
