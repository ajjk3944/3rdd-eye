package y1;

import H1.p;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class d implements E1.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f24223a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24224b;

    /* renamed from: c, reason: collision with root package name */
    public D1.c f24225c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f24226d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24227e;

    /* renamed from: f, reason: collision with root package name */
    public final long f24228f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f24229g;

    public d(Handler handler, int i, long j6) {
        if (!p.i(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f24223a = LinearLayoutManager.INVALID_OFFSET;
        this.f24224b = LinearLayoutManager.INVALID_OFFSET;
        this.f24226d = handler;
        this.f24227e = i;
        this.f24228f = j6;
    }

    @Override // E1.c
    public final void a(D1.f fVar) throws Throwable {
        fVar.m(this.f24223a, this.f24224b);
    }

    @Override // E1.c
    public final void b(Object obj) {
        this.f24229g = (Bitmap) obj;
        Handler handler = this.f24226d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f24228f);
    }

    @Override // E1.c
    public final void f(D1.c cVar) {
        this.f24225c = cVar;
    }

    @Override // E1.c
    public final D1.c h() {
        return this.f24225c;
    }

    @Override // E1.c
    public final void i(Drawable drawable) {
        this.f24229g = null;
    }

    @Override // A1.j
    public final void e() {
    }

    @Override // A1.j
    public final void j() {
    }

    @Override // A1.j
    public final void onDestroy() {
    }

    @Override // E1.c
    public final void c(D1.f fVar) {
    }

    @Override // E1.c
    public final void d(Drawable drawable) {
    }

    @Override // E1.c
    public final void g(Drawable drawable) {
    }
}
