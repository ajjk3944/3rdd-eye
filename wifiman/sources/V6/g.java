package V6;

import S6.j;
import V6.f;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public abstract class g {
    public static final f a(S6.j jVar, p glideRequestType) {
        AbstractC6492s.i(jVar, "<this>");
        AbstractC6492s.i(glideRequestType, "glideRequestType");
        if (jVar instanceof j.c) {
            return f.c.f22993a;
        }
        if (jVar instanceof j.b) {
            return f.b.f22992a;
        }
        if (jVar instanceof j.d) {
            j.d dVar = (j.d) jVar;
            return new f.d(dVar.a(), dVar.b(), glideRequestType);
        }
        if (!(jVar instanceof j.a)) {
            throw new NoWhenBranchMatchedException();
        }
        j.a aVar = (j.a) jVar;
        Object objA = aVar.a();
        return new f.a(objA instanceof Drawable ? (Drawable) objA : null, aVar.b());
    }
}
