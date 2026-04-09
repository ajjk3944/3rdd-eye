package h4;

import android.graphics.RectF;
import android.view.View;
import androidx.datastore.preferences.protobuf.j;
import e4.c2;
import e4.l1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import yb.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f extends j {

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f24872c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f24873d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        super(0);
        this.f24873d = gVar;
        this.f24872c = new HashMap();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void d(l1 l1Var) {
        ArrayList arrayList = this.f24873d.f24875b;
        if ((l1Var.f22371a.d() & 519) != 0) {
            this.f24872c.remove(l1Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) arrayList.get(size);
                int i4 = cVar.f24864e;
                boolean z3 = i4 > 0;
                int i10 = i4 - 1;
                cVar.f24864e = i10;
                if (z3 && i10 == 0) {
                    cVar.c();
                }
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void e(l1 l1Var) {
        ArrayList arrayList = this.f24873d.f24875b;
        if ((l1Var.f22371a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((c) arrayList.get(size)).f24864e++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final c2 f(c2 c2Var, List list) {
        ArrayList arrayList = this.f24873d.f24875b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i4 = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            l1 l1Var = (l1) list.get(size);
            Integer num = (Integer) this.f24872c.get(l1Var);
            if (num != null) {
                int iIntValue = num.intValue();
                float fA = l1Var.f22371a.a();
                if ((iIntValue & 1) != 0) {
                    rectF.left = fA;
                }
                if ((iIntValue & 2) != 0) {
                    rectF.top = fA;
                }
                if ((iIntValue & 4) != 0) {
                    rectF.right = fA;
                }
                if ((iIntValue & 8) != 0) {
                    rectF.bottom = fA;
                }
                i4 |= iIntValue;
            }
        }
        v3.b bVarB = v3.b.b(c2Var.f22315a.g(519), c2Var.f22315a.g(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            c cVar = (c) arrayList.get(size2);
            v3.b bVar = cVar.f24863d;
            ArrayList arrayList2 = cVar.f24860a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                a aVar = (a) arrayList2.get(size3);
                int i10 = aVar.f24845a;
                if ((i10 & i4) != 0) {
                    b bVar2 = aVar.f24846b;
                    if (!bVar2.f24855d) {
                        bVar2.f24855d = true;
                        y4.a aVar2 = bVar2.f24859i;
                        if (aVar2 != null) {
                            ((View) aVar2.f37324b).setVisibility(0);
                        }
                    }
                    if (i10 == 1) {
                        int i11 = bVar.f35793a;
                        if (i11 > 0) {
                            aVar.b(bVarB.f35793a / i11);
                        }
                        aVar.a(rectF.left);
                    } else if (i10 == 2) {
                        int i12 = bVar.f35794b;
                        if (i12 > 0) {
                            aVar.b(bVarB.f35794b / i12);
                        }
                        aVar.a(rectF.top);
                    } else if (i10 == 4) {
                        int i13 = bVar.f35795c;
                        if (i13 > 0) {
                            aVar.b(bVarB.f35795c / i13);
                        }
                        aVar.a(rectF.right);
                    } else if (i10 == 8) {
                        int i14 = bVar.f35796d;
                        if (i14 > 0) {
                            aVar.b(bVarB.f35796d / i14);
                        }
                        aVar.a(rectF.bottom);
                    }
                }
            }
        }
        return c2Var;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final i g(l1 l1Var, i iVar) {
        if ((l1Var.f22371a.d() & 519) != 0) {
            v3.b bVar = (v3.b) iVar.f37517c;
            v3.b bVar2 = (v3.b) iVar.f37516b;
            int i4 = bVar.f35793a != bVar2.f35793a ? 1 : 0;
            if (bVar.f35794b != bVar2.f35794b) {
                i4 |= 2;
            }
            if (bVar.f35795c != bVar2.f35795c) {
                i4 |= 4;
            }
            if (bVar.f35796d != bVar2.f35796d) {
                i4 |= 8;
            }
            this.f24872c.put(l1Var, Integer.valueOf(i4));
        }
        return iVar;
    }
}
