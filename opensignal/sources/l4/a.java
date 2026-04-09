package l4;

import android.text.Editable;
import j4.t;

/* loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f14656a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f14657b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f14658c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f14658c;
        return cls != null ? new t(cls, charSequence) : super.newEditable(charSequence);
    }
}
