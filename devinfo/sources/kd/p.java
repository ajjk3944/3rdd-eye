package kd;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f28195a;

    /* renamed from: b, reason: collision with root package name */
    public final o f28196b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f28197c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f28198d;

    public p(o oVar) {
        this.f28195a = oVar.f28175a;
        this.f28196b = oVar;
        this.f28197c = oVar.getContext();
        this.f28198d = oVar.g;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return null;
    }

    public boolean i(int i4) {
        return true;
    }

    public boolean j() {
        return this instanceof l;
    }

    public boolean k() {
        return false;
    }

    public final void p() {
        this.f28196b.f(false);
    }

    public void a() {
    }

    public void b() {
    }

    public void q() {
    }

    public void r() {
    }

    public void l(EditText editText) {
    }

    public void m(f4.f fVar) {
    }

    public void n(AccessibilityEvent accessibilityEvent) {
    }

    public void o(boolean z3) {
    }
}
