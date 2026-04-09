package defpackage;

import android.content.Context;
import java.util.HashSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class w83 implements wm2 {
    public final HashSet f = new HashSet();
    public final Context g;
    public final id2 h;

    public w83(Context context, id2 id2Var) {
        this.g = context;
        this.h = id2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle a() {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w83.a():android.os.Bundle");
    }

    @Override // defpackage.wm2
    public final synchronized void d0(nx2 nx2Var) {
        if (nx2Var.f != 3) {
            id2 id2Var = this.h;
            HashSet hashSet = this.f;
            synchronized (id2Var.f) {
                id2Var.j.addAll(hashSet);
            }
        }
    }
}
