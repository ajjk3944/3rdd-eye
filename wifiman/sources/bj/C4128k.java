package bj;

import aj.AbstractC3868b;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: bj.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4128k extends C4125h {

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3868b f33450c;

    /* renamed from: d, reason: collision with root package name */
    private int f33451d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4128k(o writer, AbstractC3868b json) {
        super(writer);
        AbstractC6492s.i(writer, "writer");
        AbstractC6492s.i(json, "json");
        this.f33450c = json;
    }

    @Override // bj.C4125h
    public void b() {
        o(true);
        this.f33451d++;
    }

    @Override // bj.C4125h
    public void c() {
        o(false);
        k("\n");
        int i10 = this.f33451d;
        for (int i11 = 0; i11 < i10; i11++) {
            k(this.f33450c.e().n());
        }
    }

    @Override // bj.C4125h
    public void d() {
        if (a()) {
            o(false);
        } else {
            c();
        }
    }

    @Override // bj.C4125h
    public void p() {
        f(' ');
    }

    @Override // bj.C4125h
    public void q() {
        this.f33451d--;
    }
}
