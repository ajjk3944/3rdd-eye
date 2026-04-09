package s0;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class h extends mq.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21836a;

    /* renamed from: d, reason: collision with root package name */
    public final c f21837d;

    public /* synthetic */ h(c cVar, int i10) {
        this.f21836a = i10;
        this.f21837d = cVar;
    }

    @Override // mq.a
    public final int a() {
        switch (this.f21836a) {
            case 0:
                c cVar = this.f21837d;
                cVar.getClass();
                return cVar.f21827d;
            default:
                c cVar2 = this.f21837d;
                cVar2.getClass();
                return cVar2.f21827d;
        }
    }

    @Override // mq.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f21836a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                c cVar = this.f21837d;
                Object obj2 = cVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && cVar.containsKey(entry.getKey());
            default:
                return this.f21837d.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f21836a) {
            case 0:
                k kVar = this.f21837d.f21826a;
                l[] lVarArr = new l[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    lVarArr[i10] = new m(0);
                }
                return new i(kVar, lVarArr);
            default:
                k kVar2 = this.f21837d.f21826a;
                l[] lVarArr2 = new l[8];
                for (int i11 = 0; i11 < 8; i11++) {
                    lVarArr2[i11] = new m(1);
                }
                return new i(kVar2, lVarArr2);
        }
    }
}
