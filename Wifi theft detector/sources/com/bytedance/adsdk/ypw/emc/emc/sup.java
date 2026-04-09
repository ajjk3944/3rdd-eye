package com.bytedance.adsdk.ypw.emc.emc;

import android.annotation.TargetApi;
import android.graphics.Path;
import com.bytedance.adsdk.ypw.xq.ypw.zz;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@TargetApi(19)
/* loaded from: classes.dex */
public class sup implements ru, sz {
    private final String dg;
    private final com.bytedance.adsdk.ypw.xq.ypw.zz ycc;
    private final Path emc = new Path();
    private final Path ypw = new Path();
    private final Path xq = new Path();
    private final List<sz> bw = new ArrayList();

    /* renamed from: com.bytedance.adsdk.ypw.emc.emc.sup$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] emc;

        static {
            int[] iArr = new int[zz.emc.values().length];
            emc = iArr;
            try {
                iArr[zz.emc.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                emc[zz.emc.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                emc[zz.emc.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                emc[zz.emc.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                emc[zz.emc.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public sup(com.bytedance.adsdk.ypw.xq.ypw.zz zzVar) {
        this.dg = zzVar.emc();
        this.ycc = zzVar;
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.sz
    public Path dg() {
        this.xq.reset();
        if (this.ycc.xq()) {
            return this.xq;
        }
        int i10 = AnonymousClass1.emc[this.ycc.ypw().ordinal()];
        if (i10 == 1) {
            emc();
        } else if (i10 == 2) {
            emc(Path.Op.UNION);
        } else if (i10 == 3) {
            emc(Path.Op.REVERSE_DIFFERENCE);
        } else if (i10 == 4) {
            emc(Path.Op.INTERSECT);
        } else if (i10 == 5) {
            emc(Path.Op.XOR);
        }
        return this.xq;
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.ru
    public void emc(ListIterator<xq> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            xq xqVarPrevious = listIterator.previous();
            if (xqVarPrevious instanceof sz) {
                this.bw.add((sz) xqVarPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.xq
    public void emc(List<xq> list, List<xq> list2) {
        for (int i10 = 0; i10 < this.bw.size(); i10++) {
            this.bw.get(i10).emc(list, list2);
        }
    }

    private void emc() {
        for (int i10 = 0; i10 < this.bw.size(); i10++) {
            this.xq.addPath(this.bw.get(i10).dg());
        }
    }

    @TargetApi(19)
    private void emc(Path.Op op) {
        this.ypw.reset();
        this.emc.reset();
        for (int size = this.bw.size() - 1; size > 0; size--) {
            sz szVar = this.bw.get(size);
            if (szVar instanceof dg) {
                dg dgVar = (dg) szVar;
                List<sz> listYpw = dgVar.ypw();
                for (int size2 = listYpw.size() - 1; size2 >= 0; size2--) {
                    Path pathDg = listYpw.get(size2).dg();
                    pathDg.transform(dgVar.xq());
                    this.ypw.addPath(pathDg);
                }
            } else {
                this.ypw.addPath(szVar.dg());
            }
        }
        sz szVar2 = this.bw.get(0);
        if (szVar2 instanceof dg) {
            dg dgVar2 = (dg) szVar2;
            List<sz> listYpw2 = dgVar2.ypw();
            for (int i10 = 0; i10 < listYpw2.size(); i10++) {
                Path pathDg2 = listYpw2.get(i10).dg();
                pathDg2.transform(dgVar2.xq());
                this.emc.addPath(pathDg2);
            }
        } else {
            this.emc.set(szVar2.dg());
        }
        this.xq.op(this.emc, this.ypw, op);
    }
}
