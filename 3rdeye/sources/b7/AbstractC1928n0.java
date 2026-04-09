package b7;

import a7.AbstractC1664a;
import a7.EnumC1667d;
import c9.C2092m;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DictFunctions.kt */
/* renamed from: b7.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1928n0 extends a7.g {

    /* renamed from: a, reason: collision with root package name */
    public final List<a7.j> f17897a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC1667d f17898b;

    public AbstractC1928n0() {
        EnumC1667d enumC1667d = EnumC1667d.DICT;
        this.f17897a = C2092m.W(new a7.j(enumC1667d, false), new a7.j(EnumC1667d.STRING, true));
        this.f17898b = enumC1667d;
    }

    @Override // a7.g
    public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        Object objR = A9.I.r(c(), list, j());
        JSONObject jSONObject = objR instanceof JSONObject ? (JSONObject) objR : null;
        if (jSONObject != null) {
            return jSONObject;
        }
        A9.I.E(c(), list, this.f17898b, objR, j());
        throw null;
    }

    @Override // a7.g
    public final List<a7.j> b() {
        return this.f17897a;
    }

    @Override // a7.g
    public final EnumC1667d d() {
        return this.f17898b;
    }

    @Override // a7.g
    public final boolean f() {
        return false;
    }

    public boolean j() {
        return false;
    }
}
