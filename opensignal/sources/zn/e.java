package zn;

import android.content.Context;
import br.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kg.r;

/* loaded from: classes.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    public final List f27470a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27471b;

    /* renamed from: c, reason: collision with root package name */
    public final iq.b f27472c;

    public e(List list, boolean z10, iq.b bVar) {
        l.e(list, "values");
        this.f27470a = list;
        this.f27471b = z10;
        this.f27472c = bVar;
    }

    @Override // yn.a
    public final boolean a() {
        vn.b bVar = ((Context) ((r) this.f27472c).f14395a).getResources().getConfiguration().orientation == 2 ? vn.b.LANDSCAPE : vn.b.PORTRAIT;
        ArrayList arrayList = new ArrayList();
        for (String str : this.f27470a) {
            vn.b.Companion.getClass();
            l.e(str, "value");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            l.d(lowerCase, "toLowerCase(...)");
            vn.b bVar2 = lowerCase.equals("portrait") ? vn.b.PORTRAIT : lowerCase.equals("landscape") ? vn.b.LANDSCAPE : null;
            if (bVar2 != null) {
                arrayList.add(bVar2);
            }
        }
        boolean zContains = arrayList.contains(bVar);
        return this.f27471b ? !zContains : zContains;
    }
}
