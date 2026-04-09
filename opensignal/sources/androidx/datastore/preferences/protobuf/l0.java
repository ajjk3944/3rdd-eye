package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: b, reason: collision with root package name */
    public static final w f1315b = new w(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f1316a;

    public l0(n nVar) {
        c0.a(nVar, "output");
        this.f1316a = nVar;
        nVar.f1322a = this;
    }

    public void a(int i10, g gVar) {
        ((n) this.f1316a).d0(i10, gVar);
    }

    public void b(int i10, Object obj, d1 d1Var) {
        n nVar = (n) this.f1316a;
        nVar.o0(i10, 3);
        d1Var.b((a) obj, nVar.f1322a);
        nVar.o0(i10, 4);
    }

    public l0() {
        r0 r0Var;
        a1 a1Var = a1.f1244c;
        try {
            r0Var = (r0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            r0Var = f1315b;
        }
        r0[] r0VarArr = {w.f1373b, r0Var};
        k0 k0Var = new k0();
        k0Var.f1304a = r0VarArr;
        Charset charset = c0.f1253a;
        this.f1316a = k0Var;
    }
}
