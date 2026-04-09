package G;

import G.h;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ExifData.java */
/* loaded from: classes.dex */
public final class i implements Enumeration<Map<String, g>> {

    /* renamed from: a, reason: collision with root package name */
    public final Enumeration<Map<String, g>> f1828a;

    public i(h.b bVar) {
        this.f1828a = Collections.enumeration(bVar.f1824a);
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f1828a.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final Map<String, g> nextElement() {
        return new HashMap(this.f1828a.nextElement());
    }
}
