package rj;

import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import b5.u0;
import b5.z;
import com.google.android.gms.internal.ads.d00;
import i.f0;
import java.util.List;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f32995b;

    public /* synthetic */ e(f fVar, int i4) {
        this.f32994a = i4;
        this.f32995b = fVar;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        List<c> list;
        switch (this.f32994a) {
            case 0:
                this.f32995b.i();
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                jj.f fVar = this.f32995b.f32999e;
                List list2 = fVar.f27699k;
                u uVar = u.f37649a;
                if (list2 != null && !list2.isEmpty() && (list = fVar.f27699k) != null && !list.isEmpty()) {
                    int size = 0;
                    for (c cVar : list) {
                        if (cVar instanceof b) {
                            b bVar = (b) cVar;
                            bVar.c(zBooleanValue);
                            size += bVar.f32990b.size();
                        }
                    }
                    int i4 = zBooleanValue ? size : 0;
                    fVar.f27700l = i4;
                    fVar.f27701m.h(Integer.valueOf(i4));
                    fVar.f27703o.h(uVar);
                }
                return uVar;
            case 2:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                jj.f fVar2 = this.f32995b.f32999e;
                f0 f0Var = new f0();
                f0Var.f25289a = zBooleanValue2;
                f0Var.f25290b = zBooleanValue2 ? Long.MIN_VALUE : Long.MAX_VALUE;
                fVar2.b(f0Var);
                break;
            case 3:
                this.f32995b.f32999e.b(new d00(((Boolean) obj).booleanValue()));
                break;
            case 4:
                this.f32995b.g.notifyDataSetChanged();
                break;
            case 5:
                this.f32995b.i();
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                f fVar3 = this.f32995b;
                i iVar = fVar3.g;
                nk.k.b(bool);
                iVar.f33009l = bool.booleanValue();
                iVar.notifyDataSetChanged();
                fVar3.g();
                break;
            case 7:
                yj.i iVar2 = (yj.i) obj;
                u0 u0VarO = this.f32995b.f32996b.o();
                nk.k.d(u0VarO, "getChildFragmentManager(...)");
                if (iVar2 == null) {
                    z zVarD = u0VarO.D("RepeatDeleteProgressDialog");
                    if (zVarD != null) {
                        b5.a aVar = new b5.a(u0VarO);
                        aVar.j(zVarD);
                        aVar.e();
                    }
                } else {
                    hj.a aVar2 = (hj.a) u0VarO.D("RepeatDeleteProgressDialog");
                    if (aVar2 == null) {
                        aVar2 = new hj.a();
                        aVar2.f0(false);
                        aVar2.h0(u0VarO, "RepeatDeleteProgressDialog");
                    }
                    if (aVar2.f25154p0 != null) {
                        aVar2.j0(iVar2);
                    } else {
                        aVar2.f25155q0 = iVar2;
                    }
                }
                return u.f37649a;
            case 8:
                List list3 = (List) obj;
                nk.k.b(list3);
                f fVar4 = this.f32995b;
                i iVar3 = fVar4.g;
                iVar3.getClass();
                iVar3.j = list3;
                iVar3.notifyDataSetChanged();
                fVar4.i();
                gj.a aVar3 = fVar4.f32998d;
                ConstraintLayout constraintLayout = aVar3.f24747f;
                nk.k.d(constraintLayout, "listDataArea");
                constraintLayout.setVisibility(0);
                ProgressBar progressBar = aVar3.g;
                nk.k.d(progressBar, "progress");
                progressBar.setVisibility(8);
                fVar4.g();
                break;
            default:
                nk.k.b((Integer) obj);
                this.f32995b.g();
                break;
        }
        return u.f37649a;
    }
}
