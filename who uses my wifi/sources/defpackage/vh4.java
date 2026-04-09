package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vh4 extends xg4 {
    public static final fk1 r;
    public final pg4[] k;
    public final ArrayList l;
    public final oz1[] m;
    public final ArrayList n;
    public int o = -1;
    public long[][] p;
    public h40 q;

    static {
        vm3 vm3Var = xm3.g;
        sn3 sn3Var = sn3.j;
        List list = Collections.EMPTY_LIST;
        zi1 zi1Var = zi1.a;
        r = new fk1("MergingMediaSource", new se1(), null, new qg1(), rm1.B);
    }

    public vh4(hd4 hd4Var, pg4... pg4VarArr) {
        this.k = pg4VarArr;
        this.n = new ArrayList(Arrays.asList(pg4VarArr));
        this.l = new ArrayList(pg4VarArr.length);
        int i = 0;
        while (true) {
            int length = pg4VarArr.length;
            if (i >= length) {
                this.m = new oz1[length];
                this.p = new long[0][];
                new HashMap();
                zt0.D(new lm3(0).isEmpty());
                return;
            }
            this.l.add(new ArrayList());
            i++;
        }
    }

    @Override // defpackage.pg4
    public final void a(fk1 fk1Var) {
        this.k[0].a(fk1Var);
    }

    @Override // defpackage.pg4
    public final void b(jh4 jh4Var) {
        th4 th4Var = (th4) jh4Var;
        int i = 0;
        while (true) {
            pg4[] pg4VarArr = this.k;
            if (i >= pg4VarArr.length) {
                return;
            }
            List list = (List) this.l.get(i);
            jh4[] jh4VarArr = th4Var.f;
            boolean[] zArr = th4Var.g;
            jh4 jh4Var2 = zArr[i] ? ((qi4) jh4VarArr[i]).f : jh4VarArr[i];
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((uh4) list.get(i2)).b.equals(jh4Var2)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            pg4 pg4Var = pg4VarArr[i];
            jh4[] jh4VarArr2 = th4Var.f;
            pg4Var.b(zArr[i] ? ((qi4) jh4VarArr2[i]).f : jh4VarArr2[i]);
            i++;
        }
    }

    @Override // defpackage.pg4
    public final jh4 c(kh4 kh4Var, rj4 rj4Var, long j) {
        pg4[] pg4VarArr = this.k;
        int length = pg4VarArr.length;
        jh4[] jh4VarArr = new jh4[length];
        oz1[] oz1VarArr = this.m;
        int iE = oz1VarArr[0].e(kh4Var.a);
        for (int i = 0; i < length; i++) {
            kh4 kh4VarA = kh4Var.a(oz1VarArr[i].f(iE));
            jh4VarArr[i] = pg4VarArr[i].c(kh4VarA, rj4Var, j - this.p[iE][i]);
            ((List) this.l.get(i)).add(new uh4(kh4VarA, jh4VarArr[i]));
        }
        return new th4(this.p[iE], jh4VarArr);
    }

    @Override // defpackage.pg4
    public final fk1 f() {
        pg4[] pg4VarArr = this.k;
        return pg4VarArr.length > 0 ? pg4VarArr[0].f() : r;
    }

    @Override // defpackage.pg4
    public final void h(ws3 ws3Var) {
        this.j = ws3Var;
        String str = v23.a;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.i = new Handler(looperMyLooper, null);
        int i = 0;
        while (true) {
            pg4[] pg4VarArr = this.k;
            if (i >= pg4VarArr.length) {
                return;
            }
            t(Integer.valueOf(i), pg4VarArr[i]);
            i++;
        }
    }

    @Override // defpackage.xg4, defpackage.pg4
    public final void j() {
        super.j();
        Arrays.fill(this.m, (Object) null);
        this.o = -1;
        this.q = null;
        ArrayList arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // defpackage.xg4, defpackage.pg4
    public final void r() throws h40 {
        h40 h40Var = this.q;
        if (h40Var != null) {
            throw h40Var;
        }
        super.r();
    }

    @Override // defpackage.xg4
    public final void s(Object obj, pg4 pg4Var, oz1 oz1Var) {
        int iC;
        Integer num = (Integer) obj;
        if (this.q != null) {
            return;
        }
        if (this.o == -1) {
            iC = oz1Var.c();
            this.o = iC;
        } else {
            int iC2 = oz1Var.c();
            int i = this.o;
            if (iC2 != i) {
                this.q = new h40();
                return;
            }
            iC = i;
        }
        int length = this.p.length;
        oz1[] oz1VarArr = this.m;
        if (length == 0) {
            this.p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iC, oz1VarArr.length);
        }
        ArrayList arrayList = this.n;
        arrayList.remove(pg4Var);
        oz1VarArr[num.intValue()] = oz1Var;
        if (arrayList.isEmpty()) {
            k(oz1VarArr[0]);
        }
    }

    @Override // defpackage.xg4
    public final /* synthetic */ kh4 v(Object obj, kh4 kh4Var) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((uh4) list.get(i)).a.equals(kh4Var)) {
                return ((uh4) ((List) arrayList.get(0)).get(i)).a;
            }
        }
        return null;
    }
}
