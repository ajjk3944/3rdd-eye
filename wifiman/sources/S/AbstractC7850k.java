package s;

import E0.AbstractC2634l;
import E0.InterfaceC2632j;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import w0.AbstractC8249c;
import w0.AbstractC8250d;
import w0.AbstractC8252f;

/* renamed from: s.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7850k {

    /* renamed from: a, reason: collision with root package name */
    private static final long f60771a = ViewConfiguration.getTapTimeout();

    public static final long a() {
        return f60771a;
    }

    public static final boolean b(KeyEvent keyEvent) {
        return AbstractC8249c.e(AbstractC8250d.b(keyEvent), AbstractC8249c.f64330a.b()) && d(keyEvent);
    }

    public static final boolean c(InterfaceC2632j interfaceC2632j) {
        return e(AbstractC2634l.a(interfaceC2632j));
    }

    private static final boolean d(KeyEvent keyEvent) {
        int iB = AbstractC8252f.b(AbstractC8250d.a(keyEvent));
        return iB == 23 || iB == 66 || iB == 160;
    }

    private static final boolean e(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public static final boolean f(KeyEvent keyEvent) {
        return AbstractC8249c.e(AbstractC8250d.b(keyEvent), AbstractC8249c.f64330a.a()) && d(keyEvent);
    }
}
