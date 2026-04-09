package u;

import androidx.datastore.preferences.protobuf.i1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class e extends i0 implements Map {

    /* renamed from: r, reason: collision with root package name */
    public i1 f23060r;

    /* renamed from: x, reason: collision with root package name */
    public b f23061x;

    /* renamed from: y, reason: collision with root package name */
    public d f23062y;

    public e() {
        super(0);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        i1 i1Var = this.f23060r;
        if (i1Var != null) {
            return i1Var;
        }
        i1 i1Var2 = new i1(this, 3);
        this.f23060r = i1Var2;
        return i1Var2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i10 = this.f23077g;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i10 != this.f23077g;
    }

    @Override // java.util.Map
    public final Set keySet() {
        b bVar = this.f23061x;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f23061x = bVar2;
        return bVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f23077g);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        d dVar = this.f23062y;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.f23062y = dVar2;
        return dVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i0 i0Var) {
        super(0);
        int i10 = i0Var.f23077g;
        b(this.f23077g + i10);
        if (this.f23077g != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(i0Var.f(i11), i0Var.i(i11));
            }
        } else if (i10 > 0) {
            mq.l.b0(0, 0, i10, i0Var.f23075a, this.f23075a);
            mq.l.c0(0, 0, i10 << 1, i0Var.f23076d, this.f23076d);
            this.f23077g = i10;
        }
    }
}
