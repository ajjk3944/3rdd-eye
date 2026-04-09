package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class k33 implements q53 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ k33(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    @Override // defpackage.q53
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.n70 a() throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k33.a():n70");
    }

    @Override // defpackage.q53
    public final int d() {
        switch (this.a) {
            case 0:
                return 6;
            case 1:
                return 9;
            case 2:
                return 29;
            case 3:
                return 34;
            case 4:
                return 38;
            default:
                return 43;
        }
    }

    public k33(gd2 gd2Var, ScheduledExecutorService scheduledExecutorService, pq3 pq3Var) {
        this.a = 5;
        this.b = gd2Var;
        this.d = scheduledExecutorService;
        this.c = pq3Var;
    }
}
