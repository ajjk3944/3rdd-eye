package B;

import java.util.concurrent.CancellationException;
import r.C7536k;

/* renamed from: B.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2442f extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    private final int f939a;

    /* renamed from: b, reason: collision with root package name */
    private final C7536k f940b;

    public C2442f(int i10, C7536k c7536k) {
        this.f939a = i10;
        this.f940b = c7536k;
    }

    public final int a() {
        return this.f939a;
    }

    public final C7536k c() {
        return this.f940b;
    }
}
