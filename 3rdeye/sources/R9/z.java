package R9;

import S9.S;
import c9.C2097r;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import q9.InterfaceC5499a;

/* compiled from: JsonElement.kt */
@M9.h(with = B.class)
/* loaded from: classes3.dex */
public final class z extends i implements Map<String, i>, InterfaceC5499a {
    public static final a Companion = new a();

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, i> f11826b;

    /* compiled from: JsonElement.kt */
    public static final class a {
        public final M9.b<z> serializer() {
            return B.f11773a;
        }
    }

    /* compiled from: JsonElement.kt */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<Map.Entry<? extends String, ? extends i>, CharSequence> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f11827g = new b(1);

        @Override // p9.l
        public final CharSequence invoke(Map.Entry<? extends String, ? extends i> entry) {
            Map.Entry<? extends String, ? extends i> entry2 = entry;
            kotlin.jvm.internal.l.f(entry2, "<name for destructuring parameter 0>");
            String key = entry2.getKey();
            i value = entry2.getValue();
            StringBuilder sb = new StringBuilder();
            S.a(sb, key);
            sb.append(':');
            sb.append(value);
            String string = sb.toString();
            kotlin.jvm.internal.l.e(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(Map<String, ? extends i> content) {
        kotlin.jvm.internal.l.f(content, "content");
        this.f11826b = content;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ i compute(String str, BiFunction<? super String, ? super i, ? extends i> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ i computeIfAbsent(String str, Function<? super String, ? extends i> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ i computeIfPresent(String str, BiFunction<? super String, ? super i, ? extends i> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String key = (String) obj;
        kotlin.jvm.internal.l.f(key, "key");
        return this.f11826b.containsKey(key);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i value = (i) obj;
        kotlin.jvm.internal.l.f(value, "value");
        return this.f11826b.containsValue(value);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, i>> entrySet() {
        return this.f11826b.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return kotlin.jvm.internal.l.b(this.f11826b, obj);
    }

    @Override // java.util.Map
    public final i get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        kotlin.jvm.internal.l.f(key, "key");
        return this.f11826b.get(key);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f11826b.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f11826b.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f11826b.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ i merge(String str, i iVar, BiFunction<? super i, ? super i, ? extends i> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ i put(String str, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends i> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ i putIfAbsent(String str, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final i remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ i replace(String str, i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super i, ? extends i> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f11826b.size();
    }

    public final String toString() {
        return C2097r.u0(this.f11826b.entrySet(), StringUtils.COMMA, "{", "}", b.f11827g, 24);
    }

    @Override // java.util.Map
    public final Collection<i> values() {
        return this.f11826b.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, i iVar, i iVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
