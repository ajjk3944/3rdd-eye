package m5;

import F4.q;
import android.content.Context;

/* loaded from: classes3.dex */
public abstract class h {

    public interface a {
        String a(Object obj);
    }

    public static F4.c b(String str, String str2) {
        return F4.c.l(f.a(str, str2), f.class);
    }

    public static F4.c c(final String str, final a aVar) {
        return F4.c.m(f.class).b(q.j(Context.class)).e(new F4.g() { // from class: m5.g
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return h.d(str, aVar, dVar);
            }
        }).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f d(String str, a aVar, F4.d dVar) {
        return f.a(str, aVar.a((Context) dVar.a(Context.class)));
    }
}
