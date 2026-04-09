package bj;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: bj.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4126i extends C4125h {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f33448c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4126i(o writer, boolean z10) {
        super(writer);
        AbstractC6492s.i(writer, "writer");
        this.f33448c = z10;
    }

    @Override // bj.C4125h
    public void n(String value) {
        AbstractC6492s.i(value, "value");
        if (this.f33448c) {
            super.n(value);
        } else {
            super.k(value);
        }
    }
}
