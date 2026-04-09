package r;

/* renamed from: r.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7529g {

    /* renamed from: a, reason: collision with root package name */
    private final C7536k f59702a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC7525e f59703b;

    public C7529g(C7536k c7536k, EnumC7525e enumC7525e) {
        this.f59702a = c7536k;
        this.f59703b = enumC7525e;
    }

    public final EnumC7525e a() {
        return this.f59703b;
    }

    public final C7536k b() {
        return this.f59702a;
    }

    public String toString() {
        return "AnimationResult(endReason=" + this.f59703b + ", endState=" + this.f59702a + ')';
    }
}
