package Gb;

import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import th.l;

/* loaded from: classes3.dex */
public final class c implements ph.d {

    /* renamed from: a, reason: collision with root package name */
    private final d f7268a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7269b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6835l f7270c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6835l f7271d;

    /* renamed from: e, reason: collision with root package name */
    private Object f7272e;

    public c(d storage, String key, InterfaceC6835l serialize, InterfaceC6835l deserialize) {
        AbstractC6492s.i(storage, "storage");
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(serialize, "serialize");
        AbstractC6492s.i(deserialize, "deserialize");
        this.f7268a = storage;
        this.f7269b = key;
        this.f7270c = serialize;
        this.f7271d = deserialize;
    }

    @Override // ph.d, ph.c
    public Object a(Object obj, l property) {
        AbstractC6492s.i(property, "property");
        Object obj2 = this.f7272e;
        if (obj2 != null) {
            return obj2;
        }
        String strB = this.f7268a.b(this.f7269b);
        if (strB != null) {
            try {
                return this.f7271d.invoke(strB);
            } catch (Exception e10) {
                Sj.a.f20830a.p(e10, "Storage value " + this.f7269b + " deserialization failed", new Object[0]);
            }
        }
        return null;
    }

    @Override // ph.d
    public void b(Object obj, l property, Object obj2) {
        AbstractC6492s.i(property, "property");
        this.f7272e = obj2;
        this.f7268a.a(this.f7269b, obj2 != null ? (String) this.f7270c.invoke(obj2) : null);
    }
}
