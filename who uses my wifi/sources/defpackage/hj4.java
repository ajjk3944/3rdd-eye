package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class hj4 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ hj4(int i, Object obj, Object obj2, String str) {
        this.f = i;
        this.h = obj;
        this.g = str;
        this.i = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                zb1 zb1Var = (zb1) this.h;
                HashMap map = (HashMap) this.i;
                ag2 ag2Var = (ag2) zb1Var.i;
                if (ag2Var != null) {
                    ag2Var.a(this.g, map);
                    break;
                }
                break;
            default:
                Pair[] pairArr = (Pair[]) this.i;
                pv2 pv2Var = (pv2) this.h;
                pv2Var.getClass();
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(pv2Var.a);
                if (!TextUtils.isEmpty("action")) {
                    String str = this.g;
                    if (!TextUtils.isEmpty(str)) {
                        concurrentHashMap.put("action", str);
                    }
                }
                for (Pair pair : pairArr) {
                    String str2 = (String) pair.first;
                    String str3 = (String) pair.second;
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                        concurrentHashMap.put(str2, str3);
                    }
                }
                pv2Var.a(concurrentHashMap, false);
                break;
        }
    }
}
