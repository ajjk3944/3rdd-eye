package lr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class s extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15680d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w f15681g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(w wVar, int i10) {
        super(0);
        this.f15680d = i10;
        this.f15681g = wVar;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f15680d) {
            case 0:
                w wVar = this.f15681g;
                r1 r1Var = wVar.f15710l;
                ir.v[] vVarArr = w.f15702n;
                ir.v vVar = vVarArr[14];
                Object objC = r1Var.c();
                br.l.d(objC, "<get-allNonStaticMembers>(...)");
                r1 r1Var2 = wVar.f15711m;
                ir.v vVar2 = vVarArr[15];
                Object objC2 = r1Var2.c();
                br.l.d(objC2, "<get-allStaticMembers>(...)");
                return mq.o.E0((Collection) objC, (Collection) objC2);
            case 1:
                w wVar2 = this.f15681g;
                r1 r1Var3 = wVar2.f15708h;
                ir.v[] vVarArr2 = w.f15702n;
                ir.v vVar3 = vVarArr2[10];
                Object objC3 = r1Var3.c();
                br.l.d(objC3, "<get-declaredNonStaticMembers>(...)");
                r1 r1Var4 = wVar2.j;
                ir.v vVar4 = vVarArr2[12];
                Object objC4 = r1Var4.c();
                br.l.d(objC4, "<get-inheritedNonStaticMembers>(...)");
                return mq.o.E0((Collection) objC3, (Collection) objC4);
            case 2:
                w wVar3 = this.f15681g;
                r1 r1Var5 = wVar3.f15709i;
                ir.v[] vVarArr3 = w.f15702n;
                ir.v vVar5 = vVarArr3[11];
                Object objC5 = r1Var5.c();
                br.l.d(objC5, "<get-declaredStaticMembers>(...)");
                r1 r1Var6 = wVar3.k;
                ir.v vVar6 = vVarArr3[13];
                Object objC6 = r1Var6.c();
                br.l.d(objC6, "<get-inheritedStaticMembers>(...)");
                return mq.o.E0((Collection) objC5, (Collection) objC6);
            case 3:
                return z1.d(this.f15681g.a());
            case 4:
                w wVar4 = this.f15681g;
                r1 r1Var7 = wVar4.f15708h;
                ir.v[] vVarArr4 = w.f15702n;
                ir.v vVar7 = vVarArr4[10];
                Object objC7 = r1Var7.c();
                br.l.d(objC7, "<get-declaredNonStaticMembers>(...)");
                r1 r1Var8 = wVar4.f15709i;
                ir.v vVar8 = vVarArr4[11];
                Object objC8 = r1Var8.c();
                br.l.d(objC8, "<get-declaredStaticMembers>(...)");
                return mq.o.E0((Collection) objC7, (Collection) objC8);
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                at.n nVarZ0 = this.f15681g.a().z0();
                br.l.d(nVarZ0, "descriptor.unsubstitutedInnerClassesScope");
                Collection collectionQ = i3.g.q(nVarZ0, null, 3);
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionQ) {
                    if (!ts.d.m((rr.l) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    rr.l lVar = (rr.l) it.next();
                    rr.f fVar = lVar instanceof rr.f ? (rr.f) lVar : null;
                    Class clsJ = fVar != null ? z1.j(fVar) : null;
                    z zVar = clsJ != null ? new z(clsJ) : null;
                    if (zVar != null) {
                        arrayList2.add(zVar);
                    }
                }
                return arrayList2;
            default:
                Collection<rr.f> collectionI = this.f15681g.a().I();
                br.l.d(collectionI, "descriptor.sealedSubclasses");
                ArrayList arrayList3 = new ArrayList();
                for (rr.f fVar2 : collectionI) {
                    br.l.c(fVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class clsJ2 = z1.j(fVar2);
                    z zVar2 = clsJ2 != null ? new z(clsJ2) : null;
                    if (zVar2 != null) {
                        arrayList3.add(zVar2);
                    }
                }
                return arrayList3;
        }
    }
}
