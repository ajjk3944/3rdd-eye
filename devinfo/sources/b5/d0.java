package b5;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.j1;
import androidx.lifecycle.k1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d0 extends com.bumptech.glide.e implements k1, androidx.lifecycle.a0, a6.f, x0 {

    /* renamed from: a, reason: collision with root package name */
    public final i.g f1765a;

    /* renamed from: b, reason: collision with root package name */
    public final i.g f1766b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f1767c;

    /* renamed from: d, reason: collision with root package name */
    public final u0 f1768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i.g f1769e;

    public d0(i.g gVar) {
        this.f1769e = gVar;
        Handler handler = new Handler();
        this.f1765a = gVar;
        this.f1766b = gVar;
        this.f1767c = handler;
        this.f1768d = new u0();
    }

    @Override // com.bumptech.glide.e
    public final View I(int i4) {
        return this.f1769e.findViewById(i4);
    }

    @Override // com.bumptech.glide.e
    public final boolean J() {
        Window window = this.f1769e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.lifecycle.k1
    public final j1 e() {
        return this.f1769e.e();
    }

    @Override // a6.f
    public final yb.i g() {
        return (yb.i) this.f1769e.f21606d.f37324b;
    }

    @Override // androidx.lifecycle.a0
    public final androidx.lifecycle.c0 j() {
        return this.f1769e.f25292v;
    }

    @Override // b5.x0
    public final void b() {
    }
}
