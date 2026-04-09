package N7;

import N7.B5;
import N7.H8;
import N7.N2;
import N7.T6;
import org.json.JSONObject;

/* compiled from: DivBackgroundJsonParser.kt */
/* loaded from: classes.dex */
public final class O2 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5948a;

    public O2(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5948a = component;
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
        Uc uc = this.f5948a;
        switch (iHashCode) {
            case -30518633:
                if (strI.equals("nine_patch_image")) {
                    return new N2.c(((C1152e7) uc.f6664Y4.getValue()).a(fVar, jSONObject));
                }
                break;
            case 89650992:
                if (strI.equals("gradient")) {
                    return new N2.b(((T6.a) uc.f6537M4.getValue()).a(fVar, jSONObject));
                }
                break;
            case 100313435:
                if (strI.equals("image")) {
                    return new N2.a(((B5.d) uc.f6588R3.getValue()).a(fVar, jSONObject));
                }
                break;
            case 109618859:
                if (strI.equals("solid")) {
                    ((T9) uc.f6772h7.getValue()).getClass();
                    return new N2.e(T9.d(fVar, jSONObject));
                }
                break;
            case 1881846096:
                if (strI.equals("radial_gradient")) {
                    return new N2.d(((H8.a) uc.f6814l6.getValue()).a(fVar, jSONObject));
                }
                break;
        }
        Z6.b bVarF = fVar.c().f(strI, jSONObject);
        R2 r22 = bVarF instanceof R2 ? (R2) bVarF : null;
        if (r22 != null) {
            return ((Q2) uc.f6451E1.getValue()).a(fVar, r22, jSONObject);
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, N2 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof N2.b;
        Uc uc = this.f5948a;
        if (z10) {
            return ((T6.a) uc.f6537M4.getValue()).b(context, ((N2.b) value).f5888b);
        }
        if (value instanceof N2.d) {
            return ((H8.a) uc.f6814l6.getValue()).b(context, ((N2.d) value).f5890b);
        }
        if (value instanceof N2.a) {
            return ((B5.d) uc.f6588R3.getValue()).b(context, ((N2.a) value).f5887b);
        }
        if (value instanceof N2.e) {
            ((T9) uc.f6772h7.getValue()).getClass();
            return T9.e(context, ((N2.e) value).f5891b);
        }
        if (value instanceof N2.c) {
            return ((C1152e7) uc.f6664Y4.getValue()).b(context, ((N2.c) value).f5889b);
        }
        throw new b9.j();
    }
}
