package kotlin.text;

import kotlin.jvm.internal.AbstractC6492s;
import sh.C7974i;

/* renamed from: kotlin.text.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6516j {

    /* renamed from: a, reason: collision with root package name */
    private final String f52269a;

    /* renamed from: b, reason: collision with root package name */
    private final C7974i f52270b;

    public C6516j(String value, C7974i range) {
        AbstractC6492s.i(value, "value");
        AbstractC6492s.i(range, "range");
        this.f52269a = value;
        this.f52270b = range;
    }

    public final String a() {
        return this.f52269a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6516j)) {
            return false;
        }
        C6516j c6516j = (C6516j) obj;
        return AbstractC6492s.d(this.f52269a, c6516j.f52269a) && AbstractC6492s.d(this.f52270b, c6516j.f52270b);
    }

    public int hashCode() {
        return (this.f52269a.hashCode() * 31) + this.f52270b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f52269a + ", range=" + this.f52270b + ')';
    }
}
