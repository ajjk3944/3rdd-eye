package n2;

/* renamed from: n2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2686a {

    /* renamed from: a, reason: collision with root package name */
    public final String f22310a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22311b;

    public C2686a(String str, boolean z6) {
        this.f22310a = str;
        this.f22311b = z6;
    }

    public final String toString() {
        String str = this.f22310a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
        sb.append("{");
        sb.append(str);
        sb.append("}");
        sb.append(this.f22311b);
        return sb.toString();
    }
}
