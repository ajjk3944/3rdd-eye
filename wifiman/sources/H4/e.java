package H4;

import D4.a;
import android.os.Bundle;
import java.util.Locale;

/* loaded from: classes3.dex */
class e implements a.b {

    /* renamed from: a, reason: collision with root package name */
    private J4.b f7620a;

    /* renamed from: b, reason: collision with root package name */
    private J4.b f7621b;

    e() {
    }

    private static void b(J4.b bVar, String str, Bundle bundle) {
        if (bVar == null) {
            return;
        }
        bVar.b(str, bundle);
    }

    private void c(String str, Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.f7620a : this.f7621b, str, bundle);
    }

    @Override // D4.a.b
    public void a(int i10, Bundle bundle) {
        String string;
        I4.g.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public void d(J4.b bVar) {
        this.f7621b = bVar;
    }

    public void e(J4.b bVar) {
        this.f7620a = bVar;
    }
}
