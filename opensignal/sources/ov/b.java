package ov;

import br.l;
import io.sentry.t;
import java.util.ArrayList;
import mq.o;
import p.l2;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final jv.a f20010a;

    /* renamed from: b, reason: collision with root package name */
    public final mv.b f20011b;

    public b(jv.a aVar, mv.b bVar) {
        l.e(bVar, "beanDefinition");
        this.f20010a = aVar;
        this.f20011b = bVar;
    }

    public Object a(t tVar) throws ba.l {
        uv.b bVar = (uv.b) tVar.f12736a;
        l2 l2Var = this.f20010a.f13864b;
        boolean zF = l2Var.F(pv.a.DEBUG);
        mv.b bVar2 = this.f20011b;
        if (zF) {
            l2Var.z(l.k(bVar2, "| create instance for "));
        }
        try {
            rv.a aVar = (rv.a) tVar.f12737d;
            l.e(aVar, "parameters");
            bVar.f23724e = aVar;
            Object objW = bVar2.f17062d.w(bVar, aVar);
            bVar.f23724e = null;
            return objW;
        } catch (Exception e4) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e4);
            sb2.append("\n\t");
            StackTraceElement[] stackTrace = e4.getStackTrace();
            l.d(stackTrace, "e.stackTrace");
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                l.d(className, "it.className");
                if (tt.l.q0(className, "sun.reflect", false)) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb2.append(o.x0(arrayList, "\n\t", null, null, null, 62));
            String str = "Instance creation error : could not create instance for " + bVar2 + ": " + sb2.toString();
            l2Var.getClass();
            l.e(str, "msg");
            l2Var.B(pv.a.ERROR, str);
            String strK = l.k(bVar2, "Could not create instance for ");
            l.e(strK, "msg");
            throw new ba.l(strK, e4);
        }
    }

    public abstract Object b(t tVar);
}
