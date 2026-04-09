package w0;

import android.view.KeyEvent;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8248b {

    /* renamed from: a, reason: collision with root package name */
    private final KeyEvent f64329a;

    private /* synthetic */ C8248b(KeyEvent keyEvent) {
        this.f64329a = keyEvent;
    }

    public static final /* synthetic */ C8248b a(KeyEvent keyEvent) {
        return new C8248b(keyEvent);
    }

    public static KeyEvent b(KeyEvent keyEvent) {
        return keyEvent;
    }

    public static boolean c(KeyEvent keyEvent, Object obj) {
        return (obj instanceof C8248b) && AbstractC6492s.d(keyEvent, ((C8248b) obj).f());
    }

    public static int d(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    public static String e(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f64329a, obj);
    }

    public final /* synthetic */ KeyEvent f() {
        return this.f64329a;
    }

    public int hashCode() {
        return d(this.f64329a);
    }

    public String toString() {
        return e(this.f64329a);
    }
}
