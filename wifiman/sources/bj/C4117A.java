package bj;

import aj.AbstractC3868b;
import aj.C3869c;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: bj.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4117A extends AbstractC4120c {

    /* renamed from: h, reason: collision with root package name */
    private final C3869c f33385h;

    /* renamed from: i, reason: collision with root package name */
    private final int f33386i;

    /* renamed from: j, reason: collision with root package name */
    private int f33387j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4117A(AbstractC3868b json, C3869c value) {
        super(json, value, null, 4, null);
        AbstractC6492s.i(json, "json");
        AbstractC6492s.i(value, "value");
        this.f33385h = value;
        this.f33386i = A0().size();
        this.f33387j = -1;
    }

    @Override // bj.AbstractC4120c
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public C3869c A0() {
        return this.f33385h;
    }

    @Override // Zi.AbstractC3723o0
    protected String g0(Xi.f descriptor, int i10) {
        AbstractC6492s.i(descriptor, "descriptor");
        return String.valueOf(i10);
    }

    @Override // Yi.c
    public int k(Xi.f descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        int i10 = this.f33387j;
        if (i10 >= this.f33386i - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f33387j = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bj.AbstractC4120c
    public aj.j m0(String tag) {
        AbstractC6492s.i(tag, "tag");
        return A0().get(Integer.parseInt(tag));
    }
}
