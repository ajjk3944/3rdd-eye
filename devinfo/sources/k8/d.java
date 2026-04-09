package k8;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.recyclerview.widget.LinearLayoutManager;
import t8.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements q8.e {

    /* renamed from: a, reason: collision with root package name */
    public final int f28084a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28085b;

    /* renamed from: c, reason: collision with root package name */
    public p8.c f28086c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f28087d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28088e;

    /* renamed from: f, reason: collision with root package name */
    public final long f28089f;
    public Bitmap g;

    public d(Handler handler, int i4, long j) {
        if (!m.i(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f28084a = LinearLayoutManager.INVALID_OFFSET;
        this.f28085b = LinearLayoutManager.INVALID_OFFSET;
        this.f28087d = handler;
        this.f28088e = i4;
        this.f28089f = j;
    }

    @Override // q8.e
    public final void a(p8.c cVar) {
        this.f28086c = cVar;
    }

    @Override // q8.e
    public final void b(Object obj) {
        this.g = (Bitmap) obj;
        Handler handler = this.f28087d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f28089f);
    }

    @Override // q8.e
    public final p8.c f() {
        return this.f28086c;
    }

    @Override // q8.e
    public final void g(Drawable drawable) {
        this.g = null;
    }

    @Override // q8.e
    public final void h(p8.g gVar) throws Throwable {
        gVar.l(this.f28084a, this.f28085b);
    }

    @Override // m8.i
    public final void onDestroy() {
    }

    @Override // m8.i
    public final void onStart() {
    }

    @Override // m8.i
    public final void onStop() {
    }

    @Override // q8.e
    public final void c(p8.g gVar) {
    }

    @Override // q8.e
    public final void d(Drawable drawable) {
    }

    @Override // q8.e
    public final void e(Drawable drawable) {
    }
}
