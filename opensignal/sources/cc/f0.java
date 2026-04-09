package cc;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3647a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3648b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3649c;

    public /* synthetic */ f0(String str, boolean z10, int i10) {
        this.f3647a = i10;
        this.f3649c = str;
        this.f3648b = z10;
    }

    public String toString() {
        switch (this.f3647a) {
            case 3:
                String str = this.f3649c;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
                sb2.append("{");
                sb2.append(str);
                sb2.append("}");
                sb2.append(this.f3648b);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ f0(boolean z10, String str, int i10) {
        this.f3647a = i10;
        this.f3648b = z10;
        this.f3649c = str;
    }
}
