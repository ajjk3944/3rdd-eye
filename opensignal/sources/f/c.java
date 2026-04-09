package f;

import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import c.g;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8369a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f8370d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g.b f8371g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f8372r;

    public c(g gVar, String str, a aVar, g.b bVar) {
        this.f8372r = gVar;
        this.f8369a = str;
        this.f8370d = aVar;
        this.f8371g = bVar;
    }

    @Override // androidx.lifecycle.t
    public final void b(v vVar, m mVar) {
        g gVar = this.f8372r;
        Bundle bundle = gVar.f3018g;
        HashMap map = gVar.f3016e;
        HashMap map2 = gVar.f3017f;
        boolean zEquals = m.ON_START.equals(mVar);
        String str = this.f8369a;
        if (!zEquals) {
            if (m.ON_STOP.equals(mVar)) {
                map.remove(str);
                return;
            } else {
                if (m.ON_DESTROY.equals(mVar)) {
                    gVar.e(str);
                    return;
                }
                return;
            }
        }
        a aVar = this.f8370d;
        g.b bVar = this.f8371g;
        map.put(str, new e(aVar, bVar));
        if (map2.containsKey(str)) {
            Object obj = map2.get(str);
            map2.remove(str);
            aVar.a(obj);
        }
        ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str);
        if (activityResult != null) {
            bundle.remove(str);
            aVar.a(bVar.D(activityResult.f917a, activityResult.f918d));
        }
    }
}
