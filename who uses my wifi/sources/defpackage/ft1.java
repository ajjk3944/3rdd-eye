package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ft1 implements ge3 {
    public final id3 a;
    public final p21 b;
    public final nt1 c;
    public final et1 d;
    public final zs1 e;
    public final pt1 f;
    public final xe1 g;
    public final dm1 h;

    public ft1(id3 id3Var, p21 p21Var, nt1 nt1Var, et1 et1Var, zs1 zs1Var, pt1 pt1Var, xe1 xe1Var, dm1 dm1Var) {
        this.a = id3Var;
        this.b = p21Var;
        this.c = nt1Var;
        this.d = et1Var;
        this.e = zs1Var;
        this.f = pt1Var;
        this.g = xe1Var;
        this.h = dm1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x011d A[Catch: all -> 0x00fd, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {all -> 0x00fd, blocks: (B:12:0x00ec, B:14:0x00f2, B:16:0x00f9, B:20:0x00ff, B:22:0x010a, B:24:0x010e, B:26:0x0119, B:28:0x011d), top: B:41:0x00ec }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.HashMap a() {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ft1.a():java.util.HashMap");
    }

    @Override // defpackage.ge3
    public final HashMap b() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }

    @Override // defpackage.ge3
    public final HashMap d() {
        return a();
    }

    @Override // defpackage.ge3
    public final HashMap h() {
        HashMap mapA = a();
        dm1 dm1Var = this.h;
        if (dm1Var != null) {
            List list = dm1Var.a;
            dm1Var.a = Collections.EMPTY_LIST;
            mapA.put("vst", list);
        }
        return mapA;
    }

    @Override // defpackage.ge3
    public final HashMap l() {
        HashMap mapA = a();
        nt1 nt1Var = this.c;
        if (nt1Var.q <= -2) {
            WeakReference weakReference = nt1Var.m;
            if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                nt1Var.q = -3L;
            }
        }
        mapA.put("lts", Long.valueOf(nt1Var.q));
        return mapA;
    }
}
