package z0;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h extends zj.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37819a;

    /* renamed from: b, reason: collision with root package name */
    public final b f37820b;

    public /* synthetic */ h(b bVar, int i4) {
        this.f37819a = i4;
        this.f37820b = bVar;
    }

    @Override // zj.a, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f37819a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    b bVar = this.f37820b;
                    Object obj2 = bVar.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && bVar.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f37820b.containsKey(obj);
        }
    }

    @Override // zj.a
    public final int getSize() {
        switch (this.f37819a) {
            case 0:
                b bVar = this.f37820b;
                bVar.getClass();
                return bVar.f37804b;
            default:
                b bVar2 = this.f37820b;
                bVar2.getClass();
                return bVar2.f37804b;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f37819a) {
            case 0:
                j jVar = this.f37820b.f37803a;
                k[] kVarArr = new k[8];
                for (int i4 = 0; i4 < 8; i4++) {
                    kVarArr[i4] = new l(0);
                }
                return new i(jVar, kVarArr);
            default:
                j jVar2 = this.f37820b.f37803a;
                k[] kVarArr2 = new k[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    kVarArr2[i10] = new l(1);
                }
                return new i(jVar2, kVarArr2);
        }
    }
}
