package h0;

import android.text.Editable;
import f0.u;

/* renamed from: h0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2353c extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f20445a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile C2353c f20446b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f20447c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f20447c;
        return cls != null ? new u(cls, charSequence) : super.newEditable(charSequence);
    }
}
