package bu;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final List f2961a;

    static {
        try {
            Iterator it = Arrays.asList(new xt.b()).iterator();
            br.l.e(it, "<this>");
            f2961a = st.l.d0(new st.a(new mq.n(3, it)));
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
