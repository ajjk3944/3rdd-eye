package defpackage;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class xs1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xs1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final Object a() {
        HashMap map;
        xv2 xv2Var = (xv2) ((g33) this.b).c;
        synchronized (xv2Var) {
            map = new HashMap();
            if (((Boolean) tw1.e.c.a(mz1.l8)).booleanValue()) {
                xv2Var.b();
                for (Map.Entry entry : xv2Var.a.entrySet()) {
                    map.put((wv2) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
                }
            }
        }
        return new w43(map, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065 A[Catch: IOException -> 0x003a, TryCatch #0 {IOException -> 0x003a, blocks: (B:3:0x0005, B:5:0x0022, B:7:0x0034, B:12:0x003f, B:17:0x0065, B:18:0x008a, B:26:0x0097, B:28:0x00a9, B:30:0x00bf, B:32:0x00c8, B:37:0x00ea, B:39:0x0108, B:40:0x012b, B:48:0x0140, B:49:0x0145, B:57:0x015e, B:55:0x015a, B:46:0x013e, B:35:0x00da, B:25:0x0096, B:15:0x0053, B:20:0x008d, B:21:0x0091, B:50:0x0146, B:51:0x0154, B:41:0x012c, B:42:0x013a), top: B:61:0x0005, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea A[Catch: IOException -> 0x003a, TryCatch #0 {IOException -> 0x003a, blocks: (B:3:0x0005, B:5:0x0022, B:7:0x0034, B:12:0x003f, B:17:0x0065, B:18:0x008a, B:26:0x0097, B:28:0x00a9, B:30:0x00bf, B:32:0x00c8, B:37:0x00ea, B:39:0x0108, B:40:0x012b, B:48:0x0140, B:49:0x0145, B:57:0x015e, B:55:0x015a, B:46:0x013e, B:35:0x00da, B:25:0x0096, B:15:0x0053, B:20:0x008d, B:21:0x0091, B:50:0x0146, B:51:0x0154, B:41:0x012c, B:42:0x013a), top: B:61:0x0005, inners: #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xs1.b():java.lang.Object");
    }

    private final Object c() {
        k33 k33Var = (k33) this.b;
        oc2 oc2Var = (oc2) k33Var.b;
        Context context = (Context) k33Var.d;
        if (!oc2Var.a(context)) {
            return new j53(null, null, null, null, null);
        }
        String strB = oc2Var.b(context);
        String str = strB == null ? "" : strB;
        String strC = oc2Var.c(context);
        String str2 = strC == null ? "" : strC;
        String strD = oc2Var.d(context);
        String str3 = strD == null ? "" : strD;
        String str4 = true != oc2Var.a(context) ? null : "fa";
        return new j53(str, str2, str3, str4 == null ? "" : str4, "TIME_OUT".equals(str2) ? (Long) tw1.e.c.a(mz1.t0) : null);
    }

    private final Object d() {
        Context context = ((o33) this.b).c;
        return new t53(i41.S(context, "init_without_write"), i41.S(context, "crash_without_write"));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x01e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0213  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:284:0x069b -> B:286:0x06a7). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call() throws java.security.GeneralSecurityException, defpackage.n83, java.io.IOException {
        /*
            Method dump skipped, instructions count: 2600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xs1.call():java.lang.Object");
    }
}
