package sa;

import java.io.IOException;
import java.lang.reflect.Array;

/* compiled from: ParameterHandler.java */
/* loaded from: classes3.dex */
public final class p extends q<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f46241a;

    public p(q qVar) {
        this.f46241a = qVar;
    }

    @Override // sa.q
    public final void a(s sVar, Object obj) throws IOException {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f46241a.a(sVar, Array.get(obj, i));
        }
    }
}
