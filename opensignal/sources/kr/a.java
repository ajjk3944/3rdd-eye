package kr;

import ar.n;
import br.j;
import br.l;
import br.x;
import dt.t;
import ir.f;
import ls.y;

/* loaded from: classes.dex */
public final /* synthetic */ class a extends j implements n {
    public static final a E = new a(2);

    @Override // br.d
    public final String B() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    @Override // br.d, ir.c
    public final String getName() {
        return "loadFunction";
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        t tVar = (t) obj;
        y yVar = (y) obj2;
        l.e(tVar, "p0");
        l.e(yVar, "p1");
        return tVar.e(yVar);
    }

    @Override // br.d
    public final f z() {
        return x.f2918a.b(t.class);
    }
}
