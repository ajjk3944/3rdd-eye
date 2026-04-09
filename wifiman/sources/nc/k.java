package nc;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    private final Context f54569a;

    public k(Context context) {
        AbstractC6492s.i(context, "context");
        this.f54569a = context;
    }

    @Override // nc.j
    public boolean a(InterfaceC6835l intent) {
        AbstractC6492s.i(intent, "intent");
        return ((Intent) intent.invoke(this.f54569a)).resolveActivity(this.f54569a.getPackageManager()) != null;
    }
}
