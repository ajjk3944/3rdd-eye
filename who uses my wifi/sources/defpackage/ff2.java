package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ff2 {
    public final Context f;
    public final String g;
    public final WeakReference h;

    public ff2(ag2 ag2Var) {
        Context context = ag2Var.getContext();
        this.f = context;
        this.g = hg4.C.c.D(context, ag2Var.u().f);
        this.h = new WeakReference(ag2Var);
    }

    public abstract boolean b(String str);

    public boolean d(String str, String[] strArr) {
        return b(str);
    }

    public boolean g(String str, String[] strArr, we2 we2Var) {
        return b(str);
    }

    public abstract void l();

    public final void m(String str, String str2, String str3, String str4) {
        j63.b.post(new ea1(this, str, str2, str3, str4, 1));
    }

    public final /* synthetic */ void n(HashMap map) {
        ag2 ag2Var = (ag2) this.h.get();
        if (ag2Var != null) {
            ag2Var.a("onPrecacheEvent", map);
        }
    }

    public void a() {
    }

    public void h(int i) {
    }

    public void i(int i) {
    }

    public void j(int i) {
    }

    public void k(int i) {
    }
}
