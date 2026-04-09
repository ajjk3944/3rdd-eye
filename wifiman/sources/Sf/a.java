package Sf;

import java.util.HashMap;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected HashMap f20568a;

    public void a(String str, Object obj) {
        if (this.f20568a == null) {
            this.f20568a = new HashMap();
        }
        this.f20568a.put(str, obj);
    }

    public Object b(String str) {
        HashMap map = this.f20568a;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public HashMap c() {
        return this.f20568a;
    }

    public int d() {
        HashMap map = this.f20568a;
        if (map != null) {
            return map.size();
        }
        return 0;
    }
}
