package e3;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import d3.InterfaceC4272d;
import h3.l;

/* compiled from: CustomTarget.java */
/* renamed from: e3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4309c<T> implements InterfaceC4313g<T> {

    /* renamed from: b, reason: collision with root package name */
    public final int f37705b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37706c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC4272d f37707d;

    public AbstractC4309c() {
        if (!l.i(RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f37705b = RecyclerView.UNDEFINED_DURATION;
        this.f37706c = RecyclerView.UNDEFINED_DURATION;
    }

    @Override // e3.InterfaceC4313g
    public final void b(InterfaceC4272d interfaceC4272d) {
        this.f37707d = interfaceC4272d;
    }

    @Override // e3.InterfaceC4313g
    public final void d(d3.h hVar) throws Throwable {
        hVar.b(this.f37705b, this.f37706c);
    }

    @Override // e3.InterfaceC4313g
    public final InterfaceC4272d g() {
        return this.f37707d;
    }

    @Override // a3.i
    public final void onDestroy() {
    }

    @Override // a3.i
    public final void onStart() {
    }

    @Override // a3.i
    public final void onStop() {
    }

    @Override // e3.InterfaceC4313g
    public final void a(d3.h hVar) {
    }

    @Override // e3.InterfaceC4313g
    public final void e(Drawable drawable) {
    }

    @Override // e3.InterfaceC4313g
    public final void f(Drawable drawable) {
    }
}
