package i6;

/* compiled from: DivDataTag.java */
/* renamed from: i6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4458a {

    /* renamed from: b, reason: collision with root package name */
    public static final C4458a f38454b = new C4458a("");

    /* renamed from: a, reason: collision with root package name */
    public final String f38455a;

    public C4458a(String str) {
        this.f38455a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4458a.class != obj.getClass()) {
            return false;
        }
        return this.f38455a.equals(((C4458a) obj).f38455a);
    }

    public final int hashCode() {
        return this.f38455a.hashCode();
    }
}
