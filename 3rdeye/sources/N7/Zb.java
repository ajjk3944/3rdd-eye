package N7;

import N7.Yb;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONObject;

/* compiled from: DivTypedValueJsonParser.kt */
/* loaded from: classes.dex */
public final class Zb implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7873a;

    public Zb(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7873a = component;
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
        Uc uc = this.f7873a;
        switch (iHashCode) {
            case -1034364087:
                if (strI.equals("number")) {
                    ((Wc) uc.f6531L9.getValue()).getClass();
                    return new Yb.f(Wc.d(fVar, jSONObject));
                }
                break;
            case -891985903:
                if (strI.equals("string")) {
                    ((pd) uc.f6658X9.getValue()).getClass();
                    return new Yb.g(pd.d(fVar, jSONObject));
                }
                break;
            case 116079:
                if (strI.equals(ImagesContract.URL)) {
                    ((zd) uc.f6728da.getValue()).getClass();
                    return new Yb.h(zd.d(fVar, jSONObject));
                }
                break;
            case 3083190:
                if (strI.equals("dict")) {
                    ((P) uc.f6947y.getValue()).getClass();
                    return new Yb.d(P.d(fVar, jSONObject));
                }
                break;
            case 64711720:
                if (strI.equals("boolean")) {
                    ((C1246l) uc.f6752g.getValue()).getClass();
                    return new Yb.b(C1246l.d(fVar, jSONObject));
                }
                break;
            case 93090393:
                if (strI.equals("array")) {
                    ((C1099b) uc.f6681a.getValue()).getClass();
                    return new Yb.a(C1099b.d(fVar, jSONObject));
                }
                break;
            case 94842723:
                if (strI.equals("color")) {
                    ((C1385v) uc.f6818m.getValue()).getClass();
                    return new Yb.c(C1385v.d(fVar, jSONObject));
                }
                break;
            case 1958052158:
                if (strI.equals("integer")) {
                    ((Lc) uc.f6469F9.getValue()).getClass();
                    return new Yb.e(Lc.d(fVar, jSONObject));
                }
                break;
        }
        Z6.b bVarF = fVar.c().f(strI, jSONObject);
        AbstractC1127cc abstractC1127cc = bVarF instanceof AbstractC1127cc ? (AbstractC1127cc) bVarF : null;
        if (abstractC1127cc != null) {
            return ((C1112bc) uc.f6691a9.getValue()).a(fVar, abstractC1127cc, jSONObject);
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, Yb value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof Yb.g;
        Uc uc = this.f7873a;
        if (z10) {
            ((pd) uc.f6658X9.getValue()).getClass();
            return pd.e(context, ((Yb.g) value).f7809b);
        }
        if (value instanceof Yb.e) {
            ((Lc) uc.f6469F9.getValue()).getClass();
            return Lc.e(context, ((Yb.e) value).f7807b);
        }
        if (value instanceof Yb.f) {
            ((Wc) uc.f6531L9.getValue()).getClass();
            return Wc.e(context, ((Yb.f) value).f7808b);
        }
        if (value instanceof Yb.c) {
            ((C1385v) uc.f6818m.getValue()).getClass();
            return C1385v.e(context, ((Yb.c) value).f7805b);
        }
        if (value instanceof Yb.b) {
            ((C1246l) uc.f6752g.getValue()).getClass();
            return C1246l.e(context, ((Yb.b) value).f7804b);
        }
        if (value instanceof Yb.h) {
            ((zd) uc.f6728da.getValue()).getClass();
            return zd.e(context, ((Yb.h) value).f7810b);
        }
        if (value instanceof Yb.d) {
            ((P) uc.f6947y.getValue()).getClass();
            return P.e(context, ((Yb.d) value).f7806b);
        }
        if (!(value instanceof Yb.a)) {
            throw new b9.j();
        }
        ((C1099b) uc.f6681a.getValue()).getClass();
        return C1099b.e(context, ((Yb.a) value).f7803b);
    }
}
