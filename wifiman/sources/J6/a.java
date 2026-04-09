package J6;

import java.util.Map;

/* loaded from: classes3.dex */
class a implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    private final String f9786a;

    /* renamed from: b, reason: collision with root package name */
    private final d f9787b;

    a(String str, d dVar) {
        this.f9786a = str;
        this.f9787b = dVar;
    }

    @Override // java.util.Map.Entry
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String getKey() {
        return this.f9786a;
    }

    @Override // java.util.Map.Entry
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public I6.a getValue() {
        return (I6.a) this.f9787b.get();
    }

    @Override // java.util.Map.Entry
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public I6.a setValue(I6.a aVar) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f9786a.equals(aVar.getKey()) && this.f9787b.equals(aVar.f9787b);
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return (this.f9786a.hashCode() * 31) + this.f9787b.hashCode();
    }
}
