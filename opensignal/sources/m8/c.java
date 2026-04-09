package m8;

import android.content.Context;
import android.util.DisplayMetrics;
import br.l;

/* loaded from: classes.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16322a;

    public c(Context context) {
        this.f16322a = context;
    }

    @Override // m8.i
    public final Object a(a8.i iVar) {
        DisplayMetrics displayMetrics = this.f16322a.getResources().getDisplayMetrics();
        a aVar = new a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new h(aVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return l.a(this.f16322a, ((c) obj).f16322a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16322a.hashCode();
    }
}
