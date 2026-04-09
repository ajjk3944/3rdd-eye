package v5;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements d6.a, gl.a {

    /* renamed from: a, reason: collision with root package name */
    public final d6.a f35874a;

    /* renamed from: b, reason: collision with root package name */
    public final gl.a f35875b;

    /* renamed from: c, reason: collision with root package name */
    public ck.h f35876c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f35877d;

    public f(d6.a aVar) {
        gl.c cVarA = gl.d.a();
        nk.k.e(aVar, "delegate");
        this.f35874a = aVar;
        this.f35875b = cVarA;
    }

    @Override // d6.a
    public final d6.c S(String str) {
        nk.k.e(str, "sql");
        return this.f35874a.S(str);
    }

    @Override // gl.a
    public final Object c(ek.c cVar) {
        return this.f35875b.c(cVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        this.f35874a.close();
    }

    @Override // gl.a
    public final void e(Object obj) {
        this.f35875b.e(null);
    }

    public final void g(StringBuilder sb2) {
        List listS;
        if (this.f35876c == null && this.f35877d == null) {
            sb2.append("\t\tStatus: Free connection");
            sb2.append('\n');
            return;
        }
        sb2.append("\t\tStatus: Acquired connection");
        sb2.append('\n');
        ck.h hVar = this.f35876c;
        if (hVar != null) {
            sb2.append("\t\tCoroutine: " + hVar);
            sb2.append('\n');
        }
        Throwable th2 = this.f35877d;
        if (th2 != null) {
            sb2.append("\t\tAcquired:");
            sb2.append('\n');
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th2.printStackTrace(printWriter);
            printWriter.flush();
            String string = stringWriter.toString();
            nk.k.d(string, "toString(...)");
            vk.b bVar = new vk.b(string);
            if (bVar.hasNext()) {
                Object next = bVar.next();
                if (bVar.hasNext()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(next);
                    while (bVar.hasNext()) {
                        arrayList.add(bVar.next());
                    }
                    listS = arrayList;
                } else {
                    listS = cm.g.s(next);
                }
            } else {
                listS = zj.s.f38317a;
            }
            Iterator it = zj.n.a0(listS).iterator();
            while (it.hasNext()) {
                sb2.append("\t\t" + ((String) it.next()));
                sb2.append('\n');
            }
        }
    }

    public final String toString() {
        return this.f35874a.toString();
    }
}
