package d1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: EmojiKeyListener.java */
/* renamed from: d1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4265e implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f37333a;

    /* renamed from: b, reason: collision with root package name */
    public final a f37334b;

    /* compiled from: EmojiKeyListener.java */
    /* renamed from: d1.e$a */
    public static class a {
    }

    public C4265e(KeyListener keyListener) {
        a aVar = new a();
        this.f37333a = keyListener;
        this.f37334b = aVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f37333a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f37333a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z10;
        this.f37334b.getClass();
        if (i != 67 ? i != 112 ? false : b1.f.a(editable, keyEvent, true) : b1.f.a(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10 || this.f37333a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f37333a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f37333a.onKeyUp(view, editable, i, keyEvent);
    }
}
