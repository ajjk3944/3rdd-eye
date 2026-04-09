package d1;

import android.text.Editable;
import b1.j;

/* compiled from: EmojiEditableFactory.java */
/* renamed from: d1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4262b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f37324a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile C4262b f37325b;

    /* renamed from: c, reason: collision with root package name */
    public static Class<?> f37326c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f37326c;
        return cls != null ? new j(cls, charSequence) : super.newEditable(charSequence);
    }
}
