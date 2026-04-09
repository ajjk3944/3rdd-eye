package T2;

import W2.l;
import android.graphics.drawable.Drawable;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public abstract class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final int f21369a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21370b;

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.request.c f21371c;

    public a() {
        this(PduHandle.NONE, PduHandle.NONE);
    }

    @Override // Q2.l
    public void a() {
    }

    @Override // Q2.l
    public void b() {
    }

    @Override // T2.d
    public final void d(c cVar) {
    }

    @Override // T2.d
    public final void e(com.bumptech.glide.request.c cVar) {
        this.f21371c = cVar;
    }

    @Override // Q2.l
    public void f() {
    }

    @Override // T2.d
    public void h(Drawable drawable) {
    }

    @Override // T2.d
    public void i(Drawable drawable) {
    }

    @Override // T2.d
    public final com.bumptech.glide.request.c j() {
        return this.f21371c;
    }

    @Override // T2.d
    public final void l(c cVar) {
        cVar.f(this.f21369a, this.f21370b);
    }

    public a(int i10, int i11) {
        if (l.t(i10, i11)) {
            this.f21369a = i10;
            this.f21370b = i11;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i10 + " and height: " + i11);
    }
}
