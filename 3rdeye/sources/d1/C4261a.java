package d1;

import android.widget.EditText;

/* compiled from: EmojiEditTextHelper.java */
/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4261a {

    /* renamed from: a, reason: collision with root package name */
    public final C0436a f37321a;

    /* compiled from: EmojiEditTextHelper.java */
    /* renamed from: d1.a$a, reason: collision with other inner class name */
    public static class C0436a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final EditText f37322a;

        /* renamed from: b, reason: collision with root package name */
        public final g f37323b;

        public C0436a(EditText editText) {
            this.f37322a = editText;
            g gVar = new g(editText);
            this.f37323b = gVar;
            editText.addTextChangedListener(gVar);
            if (C4262b.f37325b == null) {
                synchronized (C4262b.f37324a) {
                    try {
                        if (C4262b.f37325b == null) {
                            C4262b c4262b = new C4262b();
                            try {
                                C4262b.f37326c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C4262b.class.getClassLoader());
                            } catch (Throwable unused) {
                            }
                            C4262b.f37325b = c4262b;
                        }
                    } finally {
                    }
                }
            }
            editText.setEditableFactory(C4262b.f37325b);
        }
    }

    /* compiled from: EmojiEditTextHelper.java */
    /* renamed from: d1.a$b */
    public static class b {
    }

    public C4261a(EditText editText) {
        this.f37321a = new C0436a(editText);
    }
}
