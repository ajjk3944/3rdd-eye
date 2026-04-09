package b7;

import d7.C4278a;
import kotlin.KotlinVersion;

/* compiled from: ColorFunctions.kt */
/* loaded from: classes.dex */
public final class N extends P {

    /* renamed from: e, reason: collision with root package name */
    public static final N f17423e = new N(a.f17425g);

    /* renamed from: f, reason: collision with root package name */
    public static final String f17424f = "getColorBlue";

    /* compiled from: ColorFunctions.kt */
    public final class a extends kotlin.jvm.internal.m implements p9.l<C4278a, Integer> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f17425g = new a(1);

        @Override // p9.l
        public final Integer invoke(C4278a c4278a) {
            return Integer.valueOf(c4278a.f37526a & KotlinVersion.MAX_COMPONENT_VALUE);
        }
    }

    @Override // a7.g
    public final String c() {
        return f17424f;
    }
}
