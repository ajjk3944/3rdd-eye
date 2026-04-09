package L0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SoftwareKeyboardControllerCompat.java */
/* renamed from: L0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0792x {

    /* renamed from: a, reason: collision with root package name */
    public final a f3936a;

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    /* renamed from: L0.x$a */
    public static class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final View f3937a;

        public a(View view) {
            this.f3937a = view;
        }

        public void a() {
            View view = this.f3937a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    /* renamed from: L0.x$b */
    public static class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public View f3938b;

        /* JADX WARN: Type inference failed for: r4v0, types: [L0.z] */
        @Override // L0.C0792x.a
        public final void a() {
            View view = this.f3938b;
            WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r42 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: L0.z
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                    atomicBoolean.set((i & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(r42);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(r42);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }
    }

    /* compiled from: SoftwareKeyboardControllerCompat.java */
    /* renamed from: L0.x$c */
    public static class c {
    }

    public C0792x(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            this.f3936a = new a(view);
            return;
        }
        b bVar = new b(view);
        bVar.f3938b = view;
        this.f3936a = bVar;
    }
}
