package k1;

import androidx.lifecycle.f0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.p;
import l9.l;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f21802a = new ArrayList();

    public final void a(r9.c clazz, l initializer) {
        p.e(clazz, "clazz");
        p.e(initializer, "initializer");
        this.f21802a.add(new f(k9.a.a(clazz), initializer));
    }

    public final f0.b b() {
        f[] fVarArr = (f[]) this.f21802a.toArray(new f[0]);
        return new b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
