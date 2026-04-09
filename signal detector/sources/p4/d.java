package P4;

import c5.C0409f;
import c5.C0412i;
import h5.InterfaceC2370d;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import p5.p;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class d extends j5.g implements p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f3150e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f3150e = str;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((d) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new d(this.f3150e, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        R2.a.H(obj);
        try {
            Process processExec = Runtime.getRuntime().exec(this.f3150e);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    processExec.waitFor();
                    bufferedReader.close();
                    return sb.toString();
                }
                sb.append(line);
                sb.append("\n");
            }
        } catch (Throwable th) {
            C0409f.a(R2.a.d(th));
            return "";
        }
    }
}
