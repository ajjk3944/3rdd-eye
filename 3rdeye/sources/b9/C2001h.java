package b9;

import p9.InterfaceC5480a;

/* compiled from: LazyJVM.kt */
/* renamed from: b9.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2001h {

    /* compiled from: LazyJVM.kt */
    /* renamed from: b9.h$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18082a;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f18082a = iArr;
        }
    }

    public static <T> InterfaceC2000g<T> a(i mode, InterfaceC5480a<? extends T> initializer) {
        kotlin.jvm.internal.l.f(mode, "mode");
        kotlin.jvm.internal.l.f(initializer, "initializer");
        int i = a.f18082a[mode.ordinal()];
        if (i == 1) {
            return new p(initializer);
        }
        x xVar = x.f18108a;
        if (i == 2) {
            o oVar = new o();
            oVar.f18088b = initializer;
            oVar.f18089c = xVar;
            return oVar;
        }
        if (i != 3) {
            throw new j();
        }
        C1993B c1993b = new C1993B();
        c1993b.f18075b = initializer;
        c1993b.f18076c = xVar;
        return c1993b;
    }

    public static p b(InterfaceC5480a initializer) {
        kotlin.jvm.internal.l.f(initializer, "initializer");
        return new p(initializer);
    }
}
