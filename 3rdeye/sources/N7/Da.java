package N7;

import N7.Ia;
import com.github.appintro.AppIntroBaseFragmentKt;
import org.json.JSONObject;

/* compiled from: DivTabsJsonParser.kt */
/* loaded from: classes.dex */
public final class Da implements D7.h, D7.i {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5119a;

    public Da(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5119a = component;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.i
    public final Z6.b c(D7.f fVar, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        Uc uc = this.f5119a;
        return new Ia.a(l7.c.b(fVarW, jSONObject, "div", zP, null, uc.f6946x9), l7.c.d(fVarW, jSONObject, AppIntroBaseFragmentKt.ARG_TITLE, l7.k.f43898c, zP, null), l7.c.h(fVarW, jSONObject, "title_click_action", zP, null, uc.f6777i1));
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, Ia.a value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        Uc uc = this.f5119a;
        l7.c.u(context, jSONObject, "div", value.f5531a, uc.f6946x9);
        l7.c.q(context, jSONObject, AppIntroBaseFragmentKt.ARG_TITLE, value.f5532b);
        l7.c.u(context, jSONObject, "title_click_action", value.f5533c, uc.f6777i1);
        return jSONObject;
    }
}
