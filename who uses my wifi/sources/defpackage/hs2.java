package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hs2 implements View.OnClickListener {
    public final au2 f;
    public final ym g;
    public a32 h;
    public v32 i;
    public String j;
    public Long k;
    public WeakReference l;

    public hs2(au2 au2Var, ym ymVar) {
        this.f = au2Var;
        this.g = ymVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        WeakReference weakReference = this.l;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.j != null && this.k != null) {
            HashMap map = new HashMap();
            map.put("id", this.j);
            this.g.getClass();
            map.put("time_interval", String.valueOf(System.currentTimeMillis() - this.k.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.f.d(map);
        }
        this.j = null;
        this.k = null;
        WeakReference weakReference2 = this.l;
        if (weakReference2 == null || (view2 = (View) weakReference2.get()) == null) {
            return;
        }
        view2.setClickable(false);
        view2.setOnClickListener(null);
        this.l = null;
    }
}
