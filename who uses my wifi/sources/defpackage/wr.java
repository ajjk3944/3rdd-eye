package defpackage;

import android.text.Editable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wr extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile wr b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new ix0(cls, charSequence) : super.newEditable(charSequence);
    }
}
