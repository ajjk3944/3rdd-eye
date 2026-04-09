package T1;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f21340a;

    /* renamed from: b, reason: collision with root package name */
    private int f21341b = MPv3.MAX_MESSAGE_ID;

    /* renamed from: c, reason: collision with root package name */
    private int f21342c = 0;

    /* renamed from: T1.a$a, reason: collision with other inner class name */
    private static class C0774a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final EditText f21343a;

        /* renamed from: b, reason: collision with root package name */
        private final g f21344b;

        C0774a(EditText editText, boolean z10) {
            this.f21343a = editText;
            g gVar = new g(editText, z10);
            this.f21344b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(T1.b.getInstance());
        }

        @Override // T1.a.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // T1.a.b
        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f21343a, inputConnection, editorInfo);
        }

        @Override // T1.a.b
        void c(boolean z10) {
            this.f21344b.c(z10);
        }
    }

    static class b {
        b() {
        }

        abstract KeyListener a(KeyListener keyListener);

        abstract InputConnection b(InputConnection inputConnection, EditorInfo editorInfo);

        abstract void c(boolean z10);
    }

    public a(EditText editText, boolean z10) {
        E1.h.h(editText, "editText cannot be null");
        this.f21340a = new C0774a(editText, z10);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f21340a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f21340a.b(inputConnection, editorInfo);
    }

    public void c(boolean z10) {
        this.f21340a.c(z10);
    }
}
