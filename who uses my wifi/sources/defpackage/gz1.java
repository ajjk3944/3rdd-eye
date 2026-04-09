package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class gz1 implements Callable {
    public static final /* synthetic */ gz1 b = new gz1(0);
    public static final /* synthetic */ gz1 c = new gz1(2);
    public static final /* synthetic */ gz1 d = new gz1(3);
    public static final /* synthetic */ gz1 e = new gz1(6);
    public static final /* synthetic */ gz1 f = new gz1(7);
    public final /* synthetic */ int a;

    public /* synthetic */ gz1(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        switch (this.a) {
            case 0:
                return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
            case 1:
                hg4 hg4Var = hg4.C;
                hg4Var.k.getClass();
                return new h43(System.currentTimeMillis() - hg4Var.h.g().m().f);
            case 2:
                hg4 hg4Var2 = hg4.C;
                us1 us1Var = hg4Var2.o;
                synchronized (us1Var.a) {
                    str = us1Var.c;
                }
                return new o43(str, hg4Var2.o.h());
            case 3:
                Bundle bundle = new Bundle();
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free", runtime.freeMemory());
                bundle.putLong("runtime_max", runtime.maxMemory());
                bundle.putLong("runtime_total", runtime.totalMemory());
                bundle.putInt("web_view_count", hg4.C.h.k.get());
                return new m33(1, bundle);
            case 4:
                iz1 iz1Var = mz1.G5;
                tw1 tw1Var = tw1.e;
                if (!((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                    return new j33(null, 3);
                }
                if (!((Boolean) tw1Var.c.a(mz1.P5)).booleanValue()) {
                    hg4.C.x.getClass();
                    return new j33(su2.h(), 3);
                }
                if (g43.c == null) {
                    hg4.C.x.getClass();
                    g43.c = su2.h();
                }
                return new j33(g43.c, 3);
            case 5:
                return new q33(2, new JSONObject());
            case 6:
                HashMap map = new HashMap();
                iz1 iz1Var2 = mz1.V;
                tw1 tw1Var2 = tw1.e;
                String str2 = (String) tw1Var2.c.a(iz1Var2);
                if (str2 != null && !str2.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) tw1Var2.c.a(mz1.W)).intValue()) {
                        for (String str3 : str2.split(",", -1)) {
                            map.put(str3, cg2.a(str3));
                        }
                    }
                }
                return new w43(map, 1);
            default:
                return null;
        }
    }
}
