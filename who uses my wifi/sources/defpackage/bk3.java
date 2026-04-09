package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bk3 implements yj3 {
    public final ArrayList a = new ArrayList();

    @Override // defpackage.yj3
    public final synchronized void b(HashMap map, Context context, View view) {
        ArrayList arrayList = this.a;
        map.put("vst", new ArrayList(arrayList));
        arrayList.clear();
    }

    @Override // defpackage.yj3
    public final void c(HashMap map) {
    }

    @Override // defpackage.yj3
    public final void d(HashMap map) {
    }
}
