package N7;

import N7.AbstractC1142dc;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONObject;

/* compiled from: DivVariableJsonParser.kt */
/* renamed from: N7.ec, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1157ec implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8175a;

    public C1157ec(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8175a = component;
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
        Uc uc = this.f8175a;
        switch (iHashCode) {
            case -1034364087:
                if (strI.equals("number")) {
                    ((C1113bd) uc.f6562O9.getValue()).getClass();
                    return new AbstractC1142dc.f(C1113bd.d(fVar, jSONObject));
                }
                break;
            case -891985903:
                if (strI.equals("string")) {
                    ((ud) uc.f6692aa.getValue()).getClass();
                    return new AbstractC1142dc.g(ud.d(fVar, jSONObject));
                }
                break;
            case 116079:
                if (strI.equals(ImagesContract.URL)) {
                    ((Ed) uc.f6763ga.getValue()).getClass();
                    return new AbstractC1142dc.h(Ed.d(fVar, jSONObject));
                }
                break;
            case 3083190:
                if (strI.equals("dict")) {
                    ((V) uc.f6416B.getValue()).getClass();
                    return new AbstractC1142dc.d(V.d(fVar, jSONObject));
                }
                break;
            case 64711720:
                if (strI.equals("boolean")) {
                    ((C1316q) uc.f6787j.getValue()).getClass();
                    return new AbstractC1142dc.b(C1316q.d(fVar, jSONObject));
                }
                break;
            case 93090393:
                if (strI.equals("array")) {
                    ((C1174g) uc.f6717d.getValue()).getClass();
                    return new AbstractC1142dc.a(C1174g.d(fVar, jSONObject));
                }
                break;
            case 94842723:
                if (strI.equals("color")) {
                    ((A) uc.f6850p.getValue()).getClass();
                    return new AbstractC1142dc.c(A.d(fVar, jSONObject));
                }
                break;
            case 1958052158:
                if (strI.equals("integer")) {
                    ((Qc) uc.f6500I9.getValue()).getClass();
                    return new AbstractC1142dc.e(Qc.d(fVar, jSONObject));
                }
                break;
        }
        Z6.b bVarF = fVar.c().f(strI, jSONObject);
        AbstractC1202hc abstractC1202hc = bVarF instanceof AbstractC1202hc ? (AbstractC1202hc) bVarF : null;
        if (abstractC1202hc != null) {
            return ((C1187gc) uc.f6727d9.getValue()).a(fVar, abstractC1202hc, jSONObject);
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, AbstractC1142dc value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof AbstractC1142dc.g;
        Uc uc = this.f8175a;
        if (z10) {
            ((ud) uc.f6692aa.getValue()).getClass();
            return ud.e(context, ((AbstractC1142dc.g) value).f8141b);
        }
        if (value instanceof AbstractC1142dc.f) {
            ((C1113bd) uc.f6562O9.getValue()).getClass();
            return C1113bd.e(context, ((AbstractC1142dc.f) value).f8140b);
        }
        if (value instanceof AbstractC1142dc.e) {
            ((Qc) uc.f6500I9.getValue()).getClass();
            return Qc.e(context, ((AbstractC1142dc.e) value).f8139b);
        }
        if (value instanceof AbstractC1142dc.b) {
            ((C1316q) uc.f6787j.getValue()).getClass();
            return C1316q.e(context, ((AbstractC1142dc.b) value).f8136b);
        }
        if (value instanceof AbstractC1142dc.c) {
            ((A) uc.f6850p.getValue()).getClass();
            return A.e(context, ((AbstractC1142dc.c) value).f8137b);
        }
        if (value instanceof AbstractC1142dc.h) {
            ((Ed) uc.f6763ga.getValue()).getClass();
            return Ed.e(context, ((AbstractC1142dc.h) value).f8142b);
        }
        if (value instanceof AbstractC1142dc.d) {
            ((V) uc.f6416B.getValue()).getClass();
            return V.e(context, ((AbstractC1142dc.d) value).f8138b);
        }
        if (!(value instanceof AbstractC1142dc.a)) {
            throw new b9.j();
        }
        ((C1174g) uc.f6717d.getValue()).getClass();
        return C1174g.e(context, ((AbstractC1142dc.a) value).f8135b);
    }
}
