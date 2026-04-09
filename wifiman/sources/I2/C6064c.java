package i2;

import android.content.Context;
import android.util.Log;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* renamed from: i2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6064c {

    /* renamed from: a, reason: collision with root package name */
    public static final C6064c f48799a = new C6064c();

    private C6064c() {
    }

    public final Object a(Context context, String tag, InterfaceC6835l manager) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(tag, "tag");
        AbstractC6492s.i(manager, "manager");
        try {
            return manager.invoke(context);
        } catch (NoClassDefFoundError unused) {
            Log.d(tag, "Unable to find adservices code, check manifest for uses-library tag, versionS=" + C6063b.f48796a.b());
            return null;
        }
    }
}
