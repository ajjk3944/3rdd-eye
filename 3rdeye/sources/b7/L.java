package b7;

import d7.C4278a;
import kotlin.KotlinVersion;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes.dex */
public final class L extends Q {

    /* renamed from: e, reason: collision with root package name */
    public static final L f17387e = new L(a.f17389g);

    /* renamed from: f, reason: collision with root package name */
    public static final String f17388f = "setColorAlpha";

    /* compiled from: ColorFunctions.kt */
    public final class a extends kotlin.jvm.internal.m implements p9.p<C4278a, Double, C4278a> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f17389g = new a(2);

        @Override // p9.p
        public final C4278a invoke(C4278a c4278a, Double d10) throws IllegalArgumentException {
            int i = c4278a.f37526a;
            return new C4278a((i & KotlinVersion.MAX_COMPONENT_VALUE) | (T.a(d10.doubleValue()) << 24) | (((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) << 16) | (((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) << 8));
        }
    }

    @Override // a7.g
    public final String c() {
        return f17388f;
    }
}
