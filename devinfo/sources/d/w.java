package d;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class w extends u {

    /* renamed from: a, reason: collision with root package name */
    public final Field f21635a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f21636b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f21637c;

    public w(Field field, Field field2, Field field3) {
        this.f21635a = field;
        this.f21636b = field2;
        this.f21637c = field3;
    }

    @Override // d.u
    public final boolean a(InputMethodManager inputMethodManager) throws IllegalAccessException, IllegalArgumentException {
        try {
            this.f21637c.set(inputMethodManager, null);
            return true;
        } catch (IllegalAccessException unused) {
            return false;
        }
    }

    @Override // d.u
    public final Object b(InputMethodManager inputMethodManager) {
        try {
            return this.f21635a.get(inputMethodManager);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // d.u
    public final View c(InputMethodManager inputMethodManager) {
        try {
            return (View) this.f21636b.get(inputMethodManager);
        } catch (ClassCastException | IllegalAccessException unused) {
            return null;
        }
    }
}
