package com.google.android.material.textfield;

import G1.c;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes3.dex */
abstract class s {

    /* renamed from: a, reason: collision with root package name */
    final TextInputLayout f37838a;

    /* renamed from: b, reason: collision with root package name */
    final r f37839b;

    /* renamed from: c, reason: collision with root package name */
    final Context f37840c;

    /* renamed from: d, reason: collision with root package name */
    final CheckableImageButton f37841d;

    s(r rVar) {
        this.f37838a = rVar.f37808a;
        this.f37839b = rVar;
        this.f37840c = rVar.getContext();
        this.f37841d = rVar.r();
    }

    void a(Editable editable) {
    }

    void b(CharSequence charSequence, int i10, int i11, int i12) {
    }

    int c() {
        return 0;
    }

    int d() {
        return 0;
    }

    View.OnFocusChangeListener e() {
        return null;
    }

    View.OnClickListener f() {
        return null;
    }

    View.OnFocusChangeListener g() {
        return null;
    }

    c.a h() {
        return null;
    }

    boolean i(int i10) {
        return true;
    }

    boolean j() {
        return false;
    }

    boolean k() {
        return false;
    }

    boolean l() {
        return false;
    }

    boolean m() {
        return false;
    }

    void n(EditText editText) {
    }

    void o(View view, G1.t tVar) {
    }

    void p(View view, AccessibilityEvent accessibilityEvent) {
    }

    void q(boolean z10) {
    }

    final void r() {
        this.f37839b.L(false);
    }

    void s() {
    }

    boolean t() {
        return false;
    }

    void u() {
    }
}
