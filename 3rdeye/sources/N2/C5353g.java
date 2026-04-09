package n2;

import i2.C4448h;
import m0.C5315h;

/* compiled from: LottieCompositionCache.java */
/* renamed from: n2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5353g {

    /* renamed from: b, reason: collision with root package name */
    public static final C5353g f44272b = new C5353g();

    /* renamed from: a, reason: collision with root package name */
    public final C5315h<String, C4448h> f44273a = new C5315h<>(20);

    public final C4448h a(String str) {
        if (str == null) {
            return null;
        }
        return this.f44273a.get(str);
    }
}
