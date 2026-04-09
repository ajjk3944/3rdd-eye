package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class f00 extends tn0 {
    public byte[] k;
    public int l;
    public byte[] m;
    public final ArrayList n = new ArrayList();

    @Override // defpackage.tn0
    public final void k(cm cmVar) throws t91 {
        int i = cmVar.i();
        this.l = cmVar.i();
        int iF = cmVar.f();
        this.k = cmVar.c(i);
        this.m = cmVar.c(iF);
        while (((ByteBuffer) cmVar.j).remaining() > 0) {
            this.n.add(new gg0(cmVar));
        }
    }

    @Override // defpackage.tn0
    public final String l() {
        StringBuilder sb = new StringBuilder();
        if (tj0.a()) {
            sb.append("( ");
        }
        String str = tj0.a() ? "\n\t" : " ";
        sb.append(this.l);
        sb.append(" ");
        sb.append(yb.s(this.k));
        sb.append(str);
        sb.append(um.y(this.m));
        ArrayList arrayList = this.n;
        if (!arrayList.isEmpty()) {
            sb.append(str);
        }
        sb.append((String) arrayList.stream().map(new mp(4)).collect(Collectors.joining(str)));
        if (tj0.a()) {
            sb.append(" )");
        }
        return sb.toString();
    }

    @Override // defpackage.tn0
    public final void m(final t3 t3Var, jh jhVar, final boolean z) {
        t3Var.q(this.k.length);
        t3Var.q(this.l);
        t3Var.m(this.m.length);
        t3Var.j(this.k);
        t3Var.j(this.m);
        this.n.forEach(new Consumer() { // from class: e00
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((gg0) obj).r(t3Var, null, z);
            }
        });
    }
}
