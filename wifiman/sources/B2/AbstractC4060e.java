package b2;

import androidx.lifecycle.N;
import androidx.lifecycle.P;
import kotlin.jvm.internal.AbstractC6492s;
import lh.AbstractC6596a;

/* renamed from: b2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4060e {
    public static final N a(P.c factory, th.d modelClass, AbstractC4056a extras) {
        AbstractC6492s.i(factory, "factory");
        AbstractC6492s.i(modelClass, "modelClass");
        AbstractC6492s.i(extras, "extras");
        try {
            try {
                return factory.c(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return factory.b(AbstractC6596a.b(modelClass), extras);
            }
        } catch (AbstractMethodError unused2) {
            return factory.a(AbstractC6596a.b(modelClass));
        }
    }
}
