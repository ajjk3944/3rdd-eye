package v4;

import br.l;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class c extends b {
    public c(b bVar) {
        l.e(bVar, "initialExtras");
        LinkedHashMap linkedHashMap = bVar.f23843a;
        l.e(linkedHashMap, "initialExtras");
        this.f23843a.putAll(linkedHashMap);
    }

    public c() {
        this(a.f23842b);
    }
}
