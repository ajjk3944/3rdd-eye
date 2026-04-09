package ht;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class b0 extends c1 implements lt.e, lt.f {
    public String toString() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", ss.j.f22245e.x((sr.b) it.next(), null), "] "};
            for (int i10 = 0; i10 < 3; i10++) {
                sb2.append(strArr[i10]);
            }
        }
        sb2.append(Z());
        if (!L().isEmpty()) {
            mq.o.w0(L(), sb2, ", ", "<", ">", null, 112);
        }
        if (c0()) {
            sb2.append("?");
        }
        String string = sb2.toString();
        br.l.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // ht.c1
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public abstract b0 p0(boolean z10);

    @Override // ht.c1
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public abstract b0 r0(i0 i0Var);
}
