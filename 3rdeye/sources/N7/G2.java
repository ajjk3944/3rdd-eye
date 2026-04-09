package N7;

import N7.C1109b9;
import N7.D2;
import N7.D4;
import N7.F2;
import N7.J9;
import org.json.JSONObject;

/* compiled from: DivAppearanceTransitionJsonParser.kt */
/* loaded from: classes.dex */
public final class G2 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5260a;

    public G2(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5260a = component;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) throws z7.d {
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        int iHashCode = strI.hashCode();
        Uc uc = this.f5260a;
        switch (iHashCode) {
            case 113762:
                if (strI.equals("set")) {
                    return new F2.c(((D2.a) uc.f6895t1.getValue()).a(fVar, jSONObject));
                }
                break;
            case 3135100:
                if (strI.equals("fade")) {
                    ((D4.b) uc.f6697b3.getValue()).getClass();
                    return new F2.a(D4.b.d(fVar, jSONObject));
                }
                break;
            case 109250890:
                if (strI.equals("scale")) {
                    ((C1109b9.b) uc.f6911u6.getValue()).getClass();
                    return new F2.b(C1109b9.b.d(fVar, jSONObject));
                }
                break;
            case 109526449:
                if (strI.equals("slide")) {
                    return new F2.d(((J9.c) uc.f6634V6.getValue()).a(fVar, jSONObject));
                }
                break;
        }
        Z6.b bVarF = fVar.c().f(strI, jSONObject);
        J2 j22 = bVarF instanceof J2 ? (J2) bVarF : null;
        if (j22 != null) {
            return ((I2) uc.f6949y1.getValue()).a(fVar, j22, jSONObject);
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, F2 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof F2.c;
        Uc uc = this.f5260a;
        if (z10) {
            return ((D2.a) uc.f6895t1.getValue()).b(context, ((F2.c) value).f5164b);
        }
        if (value instanceof F2.a) {
            ((D4.b) uc.f6697b3.getValue()).getClass();
            return D4.b.e(context, ((F2.a) value).f5162b);
        }
        if (value instanceof F2.b) {
            ((C1109b9.b) uc.f6911u6.getValue()).getClass();
            return C1109b9.b.e(context, ((F2.b) value).f5163b);
        }
        if (value instanceof F2.d) {
            return ((J9.c) uc.f6634V6.getValue()).b(context, ((F2.d) value).f5165b);
        }
        throw new b9.j();
    }
}
