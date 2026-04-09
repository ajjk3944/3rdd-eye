package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class b33 implements q53 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ b33(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.q53
    public final n70 a() {
        int i = this.a;
        boolean z = true;
        int i2 = 2;
        Object obj = this.b;
        switch (i) {
            case 0:
                return pu1.r(new c33(0, ob1.c((Context) obj, "com.google.android.gms.permission.AD_ID") == 0));
            case 1:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Set) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                return pu1.r(new a53(arrayList, 2));
            case 2:
                return pu1.r(new c33(1, ((l83) obj).q));
            case 3:
                b73 b73Var = (b73) obj;
                String str = null;
                if (b73Var == null) {
                    return pu1.r(new j33(str, i2));
                }
                String str2 = b73Var.a;
                int i3 = ly0.a;
                return (str2 == null || str2.trim().isEmpty()) ? pu1.r(new j33(str, i2)) : pu1.r(new j33(str2, i2));
            case 4:
                return pu1.r(new q33(z ? 1 : 0, (z73) obj));
            case 5:
                return pu1.r(new a53((Bundle) obj, 0));
            default:
                return pu1.P(pu1.N(pu1.r(new Bundle()), ((Long) tw1.e.c.a(mz1.D4)).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) obj), gj1.q, md2.a);
        }
    }

    @Override // defpackage.q53
    public final int d() {
        switch (this.a) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 58;
            case 3:
                return 15;
            case 4:
                return 25;
            case 5:
                return 30;
            default:
                return 49;
        }
    }
}
