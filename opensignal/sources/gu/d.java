package gu;

import br.l;
import c8.x;
import ir.f0;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lq.j;
import mq.b0;
import mq.w;
import mu.y;

/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final ir.d f9664a;

    /* renamed from: b, reason: collision with root package name */
    public final List f9665b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9666c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f9667d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f9668e;

    public d(String str, ir.d dVar, ir.d[] dVarArr, a[] aVarArr, Annotation[] annotationArr) {
        l.e(dVar, "baseClass");
        this.f9664a = dVar;
        this.f9665b = w.f16945a;
        this.f9666c = kc.f.E(j.PUBLICATION, new x(str, 1, this));
        if (dVarArr.length != aVarArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + dVar.p() + " should be marked @Serializable");
        }
        Map mapV = b0.V(mq.l.C0(dVarArr, aVarArr));
        this.f9667d = mapV;
        Set<Map.Entry> setEntrySet = mapV.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            String strH = ((a) entry.getValue()).getDescriptor().h();
            Object obj = linkedHashMap.get(strH);
            if (obj == null) {
                linkedHashMap.containsKey(strH);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + this.f9664a + "' have the same serial name '" + strH + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(strH, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(b0.P(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (a) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f9668e = linkedHashMap2;
        this.f9665b = mq.l.X(annotationArr);
    }

    @Override // gu.a
    public final Object deserialize(ju.c cVar) {
        iu.e descriptor = getDescriptor();
        ju.a aVarB = cVar.b(descriptor);
        Object objM = null;
        String strQ = null;
        while (true) {
            int iT = aVarB.t(getDescriptor());
            if (iT == -1) {
                if (objM == null) {
                    throw new IllegalArgumentException(c7.a.p("Polymorphic value has not been read for class ", strQ).toString());
                }
                aVarB.c(descriptor);
                return objM;
            }
            if (iT == 0) {
                strQ = aVarB.q(getDescriptor(), iT);
            } else {
                if (iT != 1) {
                    StringBuilder sb2 = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    if (strQ == null) {
                        strQ = "unknown class";
                    }
                    sb2.append(strQ);
                    sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb2.append(iT);
                    throw new e(sb2.toString());
                }
                if (strQ == null) {
                    throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                }
                objM = aVarB.m(getDescriptor(), iT, f0.v(this, aVarB, strQ), null);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // gu.a
    public final iu.e getDescriptor() {
        return (iu.e) this.f9666c.getValue();
    }

    @Override // gu.a
    public final void serialize(ju.d dVar, Object obj) {
        l.e(obj, "value");
        a aVarW = f0.w(this, (y) dVar, obj);
        iu.e descriptor = getDescriptor();
        y yVar = (y) dVar.b(descriptor);
        yVar.x(getDescriptor(), 0, aVarW.getDescriptor().h());
        yVar.w(getDescriptor(), 1, aVarW, obj);
        yVar.c(descriptor);
    }
}
