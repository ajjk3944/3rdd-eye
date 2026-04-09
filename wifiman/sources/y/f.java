package Y;

import Zg.AbstractC3677i;
import a0.C3749b;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6948e;

/* loaded from: classes.dex */
public abstract class f extends AbstractC3677i implements Map, InterfaceC6948e {

    /* renamed from: a, reason: collision with root package name */
    private d f24486a;

    /* renamed from: b, reason: collision with root package name */
    private a0.e f24487b = new a0.e();

    /* renamed from: c, reason: collision with root package name */
    private t f24488c;

    /* renamed from: d, reason: collision with root package name */
    private Object f24489d;

    /* renamed from: e, reason: collision with root package name */
    private int f24490e;

    /* renamed from: f, reason: collision with root package name */
    private int f24491f;

    public f(d dVar) {
        this.f24486a = dVar;
        this.f24488c = this.f24486a.s();
        this.f24491f = this.f24486a.size();
    }

    @Override // Zg.AbstractC3677i
    public Set b() {
        return new h(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        t tVarA = t.f24503e.a();
        AbstractC6492s.g(tVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f24488c = tVarA;
        q(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f24488c.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // Zg.AbstractC3677i
    public Set d() {
        return new j(this);
    }

    @Override // Zg.AbstractC3677i
    public int e() {
        return this.f24491f;
    }

    @Override // Zg.AbstractC3677i
    public Collection f() {
        return new l(this);
    }

    public abstract d g();

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f24488c.o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final int h() {
        return this.f24490e;
    }

    public final t i() {
        return this.f24488c;
    }

    public final a0.e j() {
        return this.f24487b;
    }

    public final void k(int i10) {
        this.f24490e = i10;
    }

    public final void n(Object obj) {
        this.f24489d = obj;
    }

    protected final void p(a0.e eVar) {
        this.f24487b = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.f24489d = null;
        this.f24488c = this.f24488c.D(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f24489d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        d dVarG = map instanceof d ? (d) map : null;
        if (dVarG == null) {
            f fVar = map instanceof f ? (f) map : null;
            dVarG = fVar != null ? fVar.g() : null;
        }
        if (dVarG == null) {
            super.putAll(map);
            return;
        }
        C3749b c3749b = new C3749b(0, 1, null);
        int size = size();
        t tVar = this.f24488c;
        t tVarS = dVarG.s();
        AbstractC6492s.g(tVarS, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f24488c = tVar.E(tVarS, 0, c3749b, this);
        int size2 = (dVarG.size() + size) - c3749b.a();
        if (size != size2) {
            q(size2);
        }
    }

    public void q(int i10) {
        this.f24491f = i10;
        this.f24490e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f24489d = null;
        t tVarG = this.f24488c.G(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (tVarG == null) {
            tVarG = t.f24503e.a();
            AbstractC6492s.g(tVarG, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f24488c = tVarG;
        return this.f24489d;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        t tVarH = this.f24488c.H(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (tVarH == null) {
            tVarH = t.f24503e.a();
            AbstractC6492s.g(tVarH, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f24488c = tVarH;
        return size != size();
    }
}
