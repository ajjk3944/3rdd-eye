package a4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4710a;

    public n(int i) {
        switch (i) {
            case 1:
                this.f4710a = new HashMap();
                new HashMap();
                break;
            default:
                this.f4710a = new HashMap();
                break;
        }
    }

    public void a(String str, String str2, String str3) {
        HashMap map = this.f4710a;
        if (!map.containsKey(str2)) {
            map.put(str2, new HashMap());
        }
        ((Map) map.get(str2)).put(str, str3);
    }

    public U0.j b() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f4710a.entrySet()) {
            map.put((String) entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
        }
        return new U0.j(24, Collections.unmodifiableMap(map));
    }
}
