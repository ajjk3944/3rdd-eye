package u;

import com.google.android.gms.internal.ads.PL;
import j$.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: u.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2936e extends C2940i implements Map, j$.util.Map {

    /* renamed from: d, reason: collision with root package name */
    public PL f23691d;

    /* renamed from: e, reason: collision with root package name */
    public C2933b f23692e;

    /* renamed from: f, reason: collision with root package name */
    public C2935d f23693f;

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        PL pl = this.f23691d;
        if (pl != null) {
            return pl;
        }
        PL pl2 = new PL(1, this);
        this.f23691d = pl2;
        return pl2;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2933b c2933b = this.f23692e;
        if (c2933b != null) {
            return c2933b;
        }
        C2933b c2933b2 = new C2933b(this);
        this.f23692e = c2933b2;
        return c2933b2;
    }

    public final boolean l(Collection collection) {
        int i = this.f23705c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f23705c;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        b(map.size() + this.f23705c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Collection values() {
        C2935d c2935d = this.f23693f;
        if (c2935d != null) {
            return c2935d;
        }
        C2935d c2935d2 = new C2935d(this);
        this.f23693f = c2935d2;
        return c2935d2;
    }
}
