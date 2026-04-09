package k5;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class j extends d {

    /* renamed from: c, reason: collision with root package name */
    public final OnBackInvokedDispatcher f27956c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27957d;

    /* renamed from: e, reason: collision with root package name */
    public final OnBackInvokedCallback f27958e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27959f;

    public j(OnBackInvokedDispatcher onBackInvokedDispatcher, int i4) {
        this.f27956c = onBackInvokedDispatcher;
        this.f27957d = i4;
        this.f27958e = Build.VERSION.SDK_INT == 33 ? new ad.c(2, this) : new i(this);
    }

    @Override // k5.d
    public final void b(boolean z3) {
        if (z3 && !this.f27959f) {
            this.f27956c.registerOnBackInvokedCallback(this.f27957d, this.f27958e);
            this.f27959f = true;
        } else {
            if (z3 || !this.f27959f) {
                return;
            }
            this.f27956c.unregisterOnBackInvokedCallback(this.f27958e);
            this.f27959f = false;
        }
    }
}
