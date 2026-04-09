package br;

/* loaded from: classes.dex */
public class y {
    public ir.d b(Class cls) {
        return new f(cls);
    }

    public ir.f c(Class cls, String str) {
        return new p(cls, str);
    }

    public String h(i iVar) {
        String string = iVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String i(n nVar) {
        return h(nVar);
    }

    public ir.g a(j jVar) {
        return jVar;
    }

    public ir.j d(o oVar) {
        return oVar;
    }

    public ir.q e(bu.i iVar) {
        return iVar;
    }

    public ir.s f(q qVar) {
        return qVar;
    }

    public ir.u g(r rVar) {
        return rVar;
    }
}
