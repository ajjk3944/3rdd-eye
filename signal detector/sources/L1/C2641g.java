package l1;

import android.text.TextUtils;
import b4.C0344i;

/* renamed from: l1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2641g {

    /* renamed from: e, reason: collision with root package name */
    public static final C0344i f21818e = new C0344i(20);

    /* renamed from: a, reason: collision with root package name */
    public final Object f21819a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2640f f21820b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21821c;

    /* renamed from: d, reason: collision with root package name */
    public volatile byte[] f21822d;

    public C2641g(String str, Object obj, InterfaceC2640f interfaceC2640f) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f21821c = str;
        this.f21819a = obj;
        this.f21820b = interfaceC2640f;
    }

    public static C2641g a(Object obj, String str) {
        return new C2641g(str, obj, f21818e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2641g) {
            return this.f21821c.equals(((C2641g) obj).f21821c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21821c.hashCode();
    }

    public final String toString() {
        return A.f.p(new StringBuilder("Option{key='"), this.f21821c, "'}");
    }
}
