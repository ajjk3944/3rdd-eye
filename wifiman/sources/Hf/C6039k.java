package hf;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: hf.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6039k {

    /* renamed from: a, reason: collision with root package name */
    private final s9.d f48678a;

    /* renamed from: b, reason: collision with root package name */
    private final s9.d f48679b;

    /* renamed from: c, reason: collision with root package name */
    private final String f48680c;

    public C6039k(s9.d key, s9.d value, String str) {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(value, "value");
        this.f48678a = key;
        this.f48679b = value;
        this.f48680c = str;
    }

    public final String a() {
        return this.f48680c;
    }

    public final s9.d b() {
        return this.f48678a;
    }

    public final s9.d c() {
        return this.f48679b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6039k)) {
            return false;
        }
        C6039k c6039k = (C6039k) obj;
        return AbstractC6492s.d(this.f48678a, c6039k.f48678a) && AbstractC6492s.d(this.f48679b, c6039k.f48679b) && AbstractC6492s.d(this.f48680c, c6039k.f48680c);
    }

    public int hashCode() {
        int iHashCode = ((this.f48678a.hashCode() * 31) + this.f48679b.hashCode()) * 31;
        String str = this.f48680c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Model(key=" + this.f48678a + ", value=" + this.f48679b + ", clickableId=" + this.f48680c + ")";
    }

    public /* synthetic */ C6039k(s9.d dVar, s9.d dVar2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, dVar2, (i10 & 4) != 0 ? null : str);
    }
}
