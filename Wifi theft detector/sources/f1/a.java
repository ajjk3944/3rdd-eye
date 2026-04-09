package f1;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import r0.i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f21022a;

    /* renamed from: b, reason: collision with root package name */
    public int f21023b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f21024c = 0;

    /* renamed from: f1.a$a, reason: collision with other inner class name */
    public static class C0392a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final EditText f21025a;

        /* renamed from: b, reason: collision with root package name */
        public final g f21026b;

        public C0392a(EditText editText, boolean z10) {
            this.f21025a = editText;
            g gVar = new g(editText, z10);
            this.f21026b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(f1.b.getInstance());
        }

        @Override // f1.a.b
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // f1.a.b
        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f21025a, inputConnection, editorInfo);
        }

        @Override // f1.a.b
        public void c(boolean z10) {
            this.f21026b.c(z10);
        }
    }

    public static class b {
        public abstract KeyListener a(KeyListener keyListener);

        public abstract InputConnection b(InputConnection inputConnection, EditorInfo editorInfo);

        public abstract void c(boolean z10);
    }

    public a(EditText editText, boolean z10) {
        i.h(editText, "editText cannot be null");
        this.f21022a = new C0392a(editText, z10);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f21022a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f21022a.b(inputConnection, editorInfo);
    }

    public void c(boolean z10) {
        this.f21022a.c(z10);
    }
}
