package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final t f976b = new t(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f977a;

    public g0(m mVar) {
        y.a(mVar, "output");
        this.f977a = mVar;
        mVar.j = this;
    }

    public void a(int i4, Object obj, x0 x0Var) {
        m mVar = (m) this.f977a;
        mVar.e0(i4, 3);
        x0Var.b((a) obj, mVar.j);
        mVar.e0(i4, 4);
    }

    public g0() {
        m0 m0Var;
        u0 u0Var = u0.f1071c;
        try {
            m0Var = (m0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            m0Var = f976b;
        }
        m0[] m0VarArr = {t.f1058b, m0Var};
        f0 f0Var = new f0();
        f0Var.f971a = m0VarArr;
        Charset charset = y.f1081a;
        this.f977a = f0Var;
    }
}
