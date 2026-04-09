package li;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: li.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6647y {

    /* renamed from: a, reason: collision with root package name */
    private final Object f52761a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f52762b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f52763c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f52764d;

    /* renamed from: e, reason: collision with root package name */
    private final String f52765e;

    /* renamed from: f, reason: collision with root package name */
    private final Zh.b f52766f;

    public C6647y(Object obj, Object obj2, Object obj3, Object obj4, String filePath, Zh.b classId) {
        AbstractC6492s.i(filePath, "filePath");
        AbstractC6492s.i(classId, "classId");
        this.f52761a = obj;
        this.f52762b = obj2;
        this.f52763c = obj3;
        this.f52764d = obj4;
        this.f52765e = filePath;
        this.f52766f = classId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6647y)) {
            return false;
        }
        C6647y c6647y = (C6647y) obj;
        return AbstractC6492s.d(this.f52761a, c6647y.f52761a) && AbstractC6492s.d(this.f52762b, c6647y.f52762b) && AbstractC6492s.d(this.f52763c, c6647y.f52763c) && AbstractC6492s.d(this.f52764d, c6647y.f52764d) && AbstractC6492s.d(this.f52765e, c6647y.f52765e) && AbstractC6492s.d(this.f52766f, c6647y.f52766f);
    }

    public int hashCode() {
        Object obj = this.f52761a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f52762b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f52763c;
        int iHashCode3 = (iHashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.f52764d;
        return ((((iHashCode3 + (obj4 != null ? obj4.hashCode() : 0)) * 31) + this.f52765e.hashCode()) * 31) + this.f52766f.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f52761a + ", compilerVersion=" + this.f52762b + ", languageVersion=" + this.f52763c + ", expectedVersion=" + this.f52764d + ", filePath=" + this.f52765e + ", classId=" + this.f52766f + ')';
    }
}
