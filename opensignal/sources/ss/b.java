package ss;

import com.google.android.gms.internal.measurement.b4;
import java.util.ArrayList;
import mq.d0;
import rr.f0;
import rr.r0;
import ur.c0;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final b f22227b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f22228c = new b(1);

    /* renamed from: d, reason: collision with root package name */
    public static final b f22229d = new b(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22230a;

    public /* synthetic */ b(int i10) {
        this.f22230a = i10;
    }

    public static String b(rr.i iVar) {
        String strB0;
        qs.g name = iVar.getName();
        br.l.d(name, "descriptor.name");
        String strA0 = b4.a0(name);
        if (!(iVar instanceof r0)) {
            rr.l lVarO = iVar.o();
            br.l.d(lVarO, "descriptor.containingDeclaration");
            if (lVarO instanceof rr.f) {
                strB0 = b((rr.i) lVarO);
            } else if (lVarO instanceof f0) {
                qs.e eVarI = ((c0) ((f0) lVarO)).f23629y.i();
                br.l.d(eVarI, "descriptor.fqName.toUnsafe()");
                strB0 = b4.b0(eVarI.e());
            } else {
                strB0 = null;
            }
            if (strB0 != null && !strB0.equals("")) {
                return strB0 + '.' + strA0;
            }
        }
        return strA0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [rr.i, rr.l] */
    /* JADX WARN: Type inference failed for: r2v8, types: [rr.l] */
    /* JADX WARN: Type inference failed for: r2v9, types: [rr.l] */
    @Override // ss.c
    public final String a(rr.i iVar, j jVar) {
        switch (this.f22230a) {
            case 0:
                if (iVar instanceof r0) {
                    qs.g name = ((r0) iVar).getName();
                    br.l.d(name, "classifier.name");
                    return jVar.O(name, false);
                }
                qs.e eVarG = ts.d.g(iVar);
                br.l.d(eVarG, "getFqName(classifier)");
                return jVar.o(b4.b0(eVarG.e()));
            case 1:
                if (iVar instanceof r0) {
                    qs.g name2 = ((r0) iVar).getName();
                    br.l.d(name2, "classifier.name");
                    return jVar.O(name2, false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(iVar.getName());
                    iVar = iVar.o();
                } while (iVar instanceof rr.f);
                return b4.b0(new d0(arrayList));
            default:
                return b(iVar);
        }
    }
}
