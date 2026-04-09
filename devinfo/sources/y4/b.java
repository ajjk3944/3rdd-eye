package y4;

import android.text.Editable;
import w4.r;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f37325a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile b f37326b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f37327c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f37327c;
        return cls != null ? new r(cls, charSequence) : super.newEditable(charSequence);
    }
}
