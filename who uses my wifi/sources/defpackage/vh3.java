package defpackage;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vh3 {
    public final pq3 a;
    public final wh3 b;
    public final Set c;
    public final String d;
    public final fr1 e;
    public final gi3 f;
    public final gk3 g;

    public vh3(pq3 pq3Var, wh3 wh3Var, gi3 gi3Var, eg3 eg3Var, String str, fr1 fr1Var, ha4 ha4Var, ha4 ha4Var2, ha4 ha4Var3, gk3 gk3Var) {
        this.a = pq3Var;
        this.b = wh3Var;
        this.d = str;
        this.f = gi3Var;
        this.e = fr1Var;
        this.g = gk3Var;
        int iOrdinal = eg3Var.ordinal();
        if (iOrdinal == 0) {
            this.c = ha4Var.d();
        } else if (iOrdinal == 1) {
            this.c = ha4Var2.d();
        } else {
            if (iOrdinal != 2) {
                throw new IllegalStateException();
            }
            this.c = ha4Var3.d();
        }
    }

    public final n70 a() {
        boolean z;
        boolean z2;
        wh3 wh3Var = this.b;
        synchronized (wh3Var) {
            z = wh3Var.d;
        }
        if (!z) {
            return pu1.r(Integer.toString(7));
        }
        gi3 gi3Var = this.f;
        synchronized (gi3Var) {
            z2 = gi3Var.j;
        }
        if (!z2) {
            final int i = 1;
            return pu1.D(new Callable(this) { // from class: uh3
                public final /* synthetic */ vh3 b;

                {
                    this.b = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String strEncodeToString;
                    switch (i) {
                        case 0:
                            vh3 vh3Var = this.b;
                            try {
                                vh3Var.g.a(101).a();
                                qr1 qr1Var = (qr1) vh3Var.e.d();
                                String str = vh3Var.d;
                                wh3 wh3Var2 = vh3Var.b;
                                try {
                                    strEncodeToString = Base64.encodeToString(((cs1) wh3Var2.d(str, qr1Var.b()).d()).b(), 11);
                                } catch (IllegalArgumentException unused) {
                                    wh3Var2.getClass();
                                    fr1 fr1VarC0 = qr1.C0();
                                    fr1VarC0.h(4096);
                                    strEncodeToString = Base64.encodeToString(wh3Var2.b(((qr1) fr1VarC0.d()).b(), str, true), 11);
                                }
                                return strEncodeToString;
                            } finally {
                            }
                        default:
                            vh3 vh3Var2 = this.b;
                            String str2 = vh3Var2.d;
                            wh3 wh3Var3 = vh3Var2.b;
                            wh3Var3.getClass();
                            fr1 fr1VarC02 = qr1.C0();
                            fr1VarC02.h(16384);
                            return Base64.encodeToString(wh3Var3.b(((qr1) fr1VarC02.d()).b(), str2, true), 11);
                    }
                }
            }, this.a);
        }
        Set set = this.c;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((ld2) this.a).c((si3) it.next()));
        }
        xm3 xm3VarM = xm3.m(arrayList);
        final int i2 = 0;
        Callable callable = new Callable(this) { // from class: uh3
            public final /* synthetic */ vh3 b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strEncodeToString;
                switch (i2) {
                    case 0:
                        vh3 vh3Var = this.b;
                        try {
                            vh3Var.g.a(101).a();
                            qr1 qr1Var = (qr1) vh3Var.e.d();
                            String str = vh3Var.d;
                            wh3 wh3Var2 = vh3Var.b;
                            try {
                                strEncodeToString = Base64.encodeToString(((cs1) wh3Var2.d(str, qr1Var.b()).d()).b(), 11);
                            } catch (IllegalArgumentException unused) {
                                wh3Var2.getClass();
                                fr1 fr1VarC0 = qr1.C0();
                                fr1VarC0.h(4096);
                                strEncodeToString = Base64.encodeToString(wh3Var2.b(((qr1) fr1VarC0.d()).b(), str, true), 11);
                            }
                            return strEncodeToString;
                        } finally {
                        }
                    default:
                        vh3 vh3Var2 = this.b;
                        String str2 = vh3Var2.d;
                        wh3 wh3Var3 = vh3Var2.b;
                        wh3Var3.getClass();
                        fr1 fr1VarC02 = qr1.C0();
                        fr1VarC02.h(16384);
                        return Base64.encodeToString(wh3Var3.b(((qr1) fr1VarC02.d()).b(), str2, true), 11);
                }
            }
        };
        dq3 dq3Var = dq3.f;
        cq3 cq3Var = new cq3(xm3VarM, false, false);
        cq3Var.u = new bq3(cq3Var, callable, dq3Var);
        cq3Var.v();
        return cq3Var;
    }
}
