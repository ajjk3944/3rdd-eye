package h0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import b4.C0344i;

/* renamed from: h0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2357g implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f20454a;

    /* renamed from: b, reason: collision with root package name */
    public final C0344i f20455b;

    public C2357g(KeyListener keyListener) {
        C0344i c0344i = new C0344i(16);
        this.f20454a = keyListener;
        this.f20455b = c0344i;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f20454a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f20454a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z6;
        this.f20455b.getClass();
        if (i != 67 ? i != 112 ? false : V2.e.n(editable, keyEvent, true) : V2.e.n(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z6 = true;
        } else {
            z6 = false;
        }
        return z6 || this.f20454a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f20454a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f20454a.onKeyUp(view, editable, i, keyEvent);
    }
}
