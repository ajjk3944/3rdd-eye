package j5;

import h5.InterfaceC2370d;
import q5.i;
import q5.p;

/* loaded from: classes3.dex */
public abstract class g extends b implements q5.g {

    /* renamed from: d, reason: collision with root package name */
    public final int f21470d;

    public g(int i, InterfaceC2370d interfaceC2370d) {
        super(interfaceC2370d);
        this.f21470d = i;
    }

    @Override // q5.g
    public final int c() {
        return this.f21470d;
    }

    @Override // j5.b
    public final String toString() {
        if (this.f21462a != null) {
            return super.toString();
        }
        p.f23300a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        i.d(string, "renderLambdaToString(...)");
        return string;
    }
}
