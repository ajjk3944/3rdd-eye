package b7;

import d7.C4278a;
import kotlin.KotlinVersion;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes.dex */
public final class X extends Q {

    /* renamed from: e, reason: collision with root package name */
    public static final X f17604e = new X(a.f17606g);

    /* renamed from: f, reason: collision with root package name */
    public static final String f17605f = "setColorRed";

    /* compiled from: ColorFunctions.kt */
    public final class a extends kotlin.jvm.internal.m implements p9.p<C4278a, Double, C4278a> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f17606g = new a(2);

        @Override // p9.p
        public final C4278a invoke(C4278a c4278a, Double d10) throws IllegalArgumentException {
            int i = c4278a.f37526a;
            double dDoubleValue = d10.doubleValue();
            return new C4278a((i & KotlinVersion.MAX_COMPONENT_VALUE) | ((i >>> 24) << 24) | (T.a(dDoubleValue) << 16) | (((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) << 8));
        }
    }

    @Override // a7.g
    public final String c() {
        return f17605f;
    }
}
