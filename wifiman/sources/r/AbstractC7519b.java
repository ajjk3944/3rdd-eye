package r;

import kotlin.jvm.internal.C6486l;

/* renamed from: r.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7519b {

    /* renamed from: a, reason: collision with root package name */
    private static final C7538m f59588a = r.a(Float.POSITIVE_INFINITY);

    /* renamed from: b, reason: collision with root package name */
    private static final C7539n f59589b = r.b(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c, reason: collision with root package name */
    private static final C7540o f59590c = r.c(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    private static final C7541p f59591d = r.d(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e, reason: collision with root package name */
    private static final C7538m f59592e = r.a(Float.NEGATIVE_INFINITY);

    /* renamed from: f, reason: collision with root package name */
    private static final C7539n f59593f = r.b(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: g, reason: collision with root package name */
    private static final C7540o f59594g = r.c(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h, reason: collision with root package name */
    private static final C7541p f59595h = r.d(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final C7517a a(float f10, float f11) {
        return new C7517a(Float.valueOf(f10), u0.f(C6486l.f51726a), Float.valueOf(f11), null, 8, null);
    }

    public static /* synthetic */ C7517a b(float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.01f;
        }
        return a(f10, f11);
    }
}
