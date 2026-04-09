package T1;

import android.text.Editable;
import androidx.emoji2.text.o;

/* loaded from: classes.dex */
final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f21345a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile Editable.Factory f21346b;

    /* renamed from: c, reason: collision with root package name */
    private static Class f21347c;

    private b() {
        try {
            f21347c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f21346b == null) {
            synchronized (f21345a) {
                try {
                    if (f21346b == null) {
                        f21346b = new b();
                    }
                } finally {
                }
            }
        }
        return f21346b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f21347c;
        return cls != null ? o.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
