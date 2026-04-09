package H6;

import H6.x;
import K6.J1;
import N7.EnumC1245kc;
import N7.Z;
import android.view.View;
import android.widget.ImageView;
import b9.C1992A;
import java.util.ArrayList;
import java.util.List;
import x6.AbstractC5774f;

/* compiled from: DivPlaceholderLoader.kt */
/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2268g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2269h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i, Object obj, Object obj2) {
        super(1);
        this.f2268g = i;
        this.f2269h = obj;
        this.i = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19, types: [E6.a, T] */
    @Override // p9.l
    public final Object invoke(Object obj) {
        ImageView.ScaleType scaleType;
        switch (this.f2268g) {
            case 0:
                ((x.a) this.f2269h).invoke((C6.i) obj);
                ((O6.F) this.i).k();
                return C1992A.f18074a;
            case 1:
                List executeStatements = (List) obj;
                kotlin.jvm.internal.l.f(executeStatements, "$this$executeStatements");
                ((I) this.f2269h).getClass();
                List rawJsons = (List) this.i;
                kotlin.jvm.internal.l.f(rawJsons, "rawJsons");
                H7.o onFailedTransactions = H7.o.f2300g;
                kotlin.jvm.internal.l.f(onFailedTransactions, "onFailedTransactions");
                executeStatements.add(new H7.q(rawJsons, onFailedTransactions));
                return C1992A.f18074a;
            case 2:
                String id = (String) obj;
                kotlin.jvm.internal.l.f(id, "id");
                ((View) this.f2269h).setNextFocusRightId(((I) this.i).f(id));
                return C1992A.f18074a;
            case 3:
                kotlin.jvm.internal.l.f((Z) obj, "it");
                for (C6.l lVar : (ArrayList) this.f2269h) {
                    int i = lVar.f951b;
                    if (i > 0) {
                        lVar.f951b = i - 1;
                        lVar.f952c--;
                    } else {
                        lVar.f952c++;
                    }
                }
                C6.l lVar2 = (C6.l) ((kotlin.jvm.internal.w) this.i).f43660b;
                if (lVar2 != null) {
                    int i10 = lVar2.f951b;
                    if (i10 > 0) {
                        lVar2.f951b = i10 - 1;
                        lVar2.f952c--;
                    } else {
                        lVar2.f952c++;
                    }
                }
                return C1992A.f18074a;
            case 4:
                ?? r42 = (E6.a) obj;
                ((kotlin.jvm.internal.w) this.f2269h).f43660b = r42;
                if (r42 != 0) {
                    String strJ = r42.j();
                    O6.p pVar = (O6.p) this.i;
                    pVar.setText(strJ);
                    pVar.setSelection(r42.f1449d);
                }
                return C1992A.f18074a;
            case 5:
                EnumC1245kc it = (EnumC1245kc) obj;
                kotlin.jvm.internal.l.f(it, "it");
                ((AbstractC5774f) this.f2269h).setScale(it);
                J1 j12 = (J1) this.i;
                j12.getClass();
                int i11 = J1.a.f3253a[it.ordinal()];
                if (i11 == 1) {
                    scaleType = J1.f3252g;
                } else if (i11 == 2) {
                    scaleType = J1.f3250e;
                } else {
                    if (i11 != 3) {
                        throw new b9.j();
                    }
                    scaleType = J1.f3251f;
                }
                j12.setScaleType(scaleType);
                return C1992A.f18074a;
            default:
                List mutate = (List) obj;
                kotlin.jvm.internal.l.f(mutate, "$this$mutate");
                mutate.add(((Integer) this.f2269h).intValue(), this.i);
                return C1992A.f18074a;
        }
    }
}
