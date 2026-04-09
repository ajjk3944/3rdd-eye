package Vh;

import Uh.m;
import Yg.s;
import Yg.z;
import java.io.InputStream;
import jh.AbstractC6329b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.protobuf.f;

/* loaded from: classes4.dex */
public abstract class c {
    public static final s a(InputStream inputStream) {
        m mVarG1;
        AbstractC6492s.i(inputStream, "<this>");
        try {
            a aVarA = a.f23434g.a(inputStream);
            if (aVarA.h()) {
                f fVarD = f.d();
                b.a(fVarD);
                mVarG1 = m.g1(inputStream, fVarD);
            } else {
                mVarG1 = null;
            }
            s sVarA = z.a(mVarG1, aVarA);
            AbstractC6329b.a(inputStream, null);
            return sVarA;
        } finally {
        }
    }
}
