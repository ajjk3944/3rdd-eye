package defpackage;

import android.os.Bundle;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class g53 implements xp3, ob4 {
    public boolean f;
    public boolean g;
    public final Object h;
    public final Object i;
    public Object j;
    public Object k;

    public /* synthetic */ g53(i53 i53Var, String str, List list, Bundle bundle, boolean z, boolean z2) {
        this.h = i53Var;
        this.i = str;
        this.j = list;
        this.k = bundle;
        this.f = z;
        this.g = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.xp3
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.n70 mo9a() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g53.mo9a():n70");
    }

    @Override // defpackage.ob4
    public void b(sr1 sr1Var) {
        ob4 ob4Var = (ob4) this.k;
        if (ob4Var != null) {
            ob4Var.b(sr1Var);
            sr1Var = ((ob4) this.k).g();
        }
        ((nc4) this.h).b(sr1Var);
    }

    public void c(kg4 kg4Var) {
        ob4 ob4Var;
        ob4 ob4VarM0 = kg4Var.m0();
        if (ob4VarM0 == null || ob4VarM0 == (ob4Var = (ob4) this.k)) {
            return;
        }
        if (ob4Var != null) {
            throw new b84(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.k = ob4VarM0;
        this.j = kg4Var;
        ((ef4) ob4VarM0).b(((nc4) this.h).i);
    }

    @Override // defpackage.ob4
    public long e() {
        if (this.f) {
            return ((nc4) this.h).e();
        }
        ob4 ob4Var = (ob4) this.k;
        ob4Var.getClass();
        return ob4Var.e();
    }

    @Override // defpackage.ob4
    public boolean f() {
        if (this.f) {
            return false;
        }
        ob4 ob4Var = (ob4) this.k;
        ob4Var.getClass();
        return ob4Var.f();
    }

    @Override // defpackage.ob4
    public sr1 g() {
        ob4 ob4Var = (ob4) this.k;
        return ob4Var != null ? ob4Var.g() : ((nc4) this.h).i;
    }

    public g53(jb4 jb4Var) {
        this.i = jb4Var;
        nc4 nc4Var = new nc4();
        nc4Var.i = sr1.d;
        this.h = nc4Var;
        this.f = true;
    }
}
