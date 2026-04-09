package xr;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends f implements hs.a {

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f25505b;

    public h(qs.g gVar, Object[] objArr) {
        super(gVar);
        this.f25505b = objArr;
    }

    public final ArrayList a() {
        Object[] objArr = this.f25505b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            br.l.b(obj);
            Class<?> cls = obj.getClass();
            List list = d.f25493a;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new t(null, (Enum) obj) : obj instanceof Annotation ? new g(null, (Annotation) obj) : obj instanceof Object[] ? new h(null, (Object[]) obj) : obj instanceof Class ? new p(null, (Class) obj) : new v(null, obj));
        }
        return arrayList;
    }
}
