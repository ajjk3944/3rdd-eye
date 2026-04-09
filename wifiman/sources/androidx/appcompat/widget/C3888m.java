package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import h.AbstractC5936j;

/* renamed from: androidx.appcompat.widget.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3888m {

    /* renamed from: a, reason: collision with root package name */
    private final EditText f27436a;

    /* renamed from: b, reason: collision with root package name */
    private final T1.a f27437b;

    C3888m(EditText editText) {
        this.f27436a = editText;
        this.f27437b = new T1.a(editText, false);
    }

    KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f27437b.a(keyListener) : keyListener;
    }

    boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    void c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f27436a.getContext().obtainStyledAttributes(attributeSet, AbstractC5936j.f48220g0, i10, 0);
        try {
            int i11 = AbstractC5936j.f48282u0;
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(i11) ? typedArrayObtainStyledAttributes.getBoolean(i11, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f27437b.b(inputConnection, editorInfo);
    }

    void e(boolean z10) {
        this.f27437b.c(z10);
    }
}
