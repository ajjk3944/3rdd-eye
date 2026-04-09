package n0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f17127a;

    public a(int i10) {
        this.f17127a = i10;
    }

    public final boolean a() {
        return this.f17127a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{ location = ");
        return h0.b.i(this.f17127a, " }", sb2);
    }
}
