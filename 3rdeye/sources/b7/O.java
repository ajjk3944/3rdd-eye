package b7;

import d7.C4278a;
import kotlin.KotlinVersion;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes.dex */
public final class O extends Q {

    /* renamed from: e, reason: collision with root package name */
    public static final O f17442e = new O(a.f17444g);

    /* renamed from: f, reason: collision with root package name */
    public static final String f17443f = "setColorBlue";

    /* compiled from: ColorFunctions.kt */
    public final class a extends kotlin.jvm.internal.m implements p9.p<C4278a, Double, C4278a> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f17444g = new a(2);

        @Override // p9.p
        public final C4278a invoke(C4278a c4278a, Double d10) {
            int i = c4278a.f37526a;
            double dDoubleValue = d10.doubleValue();
            int i10 = i >>> 24;
            int i11 = (i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
            return new C4278a((((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) << 8) | (i10 << 24) | (i11 << 16) | T.a(dDoubleValue));
        }
    }

    @Override // a7.g
    public final String c() {
        return f17443f;
    }
}
