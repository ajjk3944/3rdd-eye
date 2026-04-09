package T1;

import F1.c;
import android.content.Context;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements c.InterfaceC0026c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12220a;

    public /* synthetic */ t(Context context) {
        this.f12220a = context;
    }

    @Override // F1.c.InterfaceC0026c
    public F1.c a(c.b bVar) {
        Context context = this.f12220a;
        c.a callback = bVar.f1581c;
        kotlin.jvm.internal.l.f(callback, "callback");
        String str = bVar.f1580b;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new G1.f(context, str, callback, true, true);
    }
}
