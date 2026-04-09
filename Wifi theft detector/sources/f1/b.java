package f1;

import android.text.Editable;
import androidx.emoji2.text.n;

/* loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f21027a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile Editable.Factory f21028b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f21029c;

    public b() {
        try {
            f21029c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f21028b == null) {
            synchronized (f21027a) {
                try {
                    if (f21028b == null) {
                        f21028b = new b();
                    }
                } finally {
                }
            }
        }
        return f21028b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f21029c;
        return cls != null ? n.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
