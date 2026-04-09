package Q9;

import java.lang.ref.SoftReference;
import p9.InterfaceC5480a;

/* compiled from: Caching.kt */
/* renamed from: Q9.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1523c0<T> {

    /* renamed from: a, reason: collision with root package name */
    public volatile SoftReference<T> f11477a = new SoftReference<>(null);

    public final synchronized T a(InterfaceC5480a<? extends T> interfaceC5480a) {
        T t10 = this.f11477a.get();
        if (t10 != null) {
            return t10;
        }
        T tInvoke = interfaceC5480a.invoke();
        this.f11477a = new SoftReference<>(tInvoke);
        return tInvoke;
    }
}
