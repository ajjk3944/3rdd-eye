package xm;

import android.content.Context;
import br.l;
import com.staircase3.opensignal.utils.q;
import el.b;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25449a;

    /* renamed from: b, reason: collision with root package name */
    public final b f25450b;

    public a(Context context, b bVar) {
        l.e(context, "context");
        l.e(bVar, "firebaseManager");
        this.f25449a = context;
        this.f25450b = bVar;
    }

    public final boolean a() {
        return this.f25450b.H || q.c(this.f25449a).getBoolean("prefs_connectivity_assistant_enabled", false);
    }
}
