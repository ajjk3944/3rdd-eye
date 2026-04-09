package io.appmetrica.analytics.impl;

import java.util.LinkedList;

/* loaded from: classes3.dex */
public final class D9 extends Of {

    /* renamed from: a, reason: collision with root package name */
    public final C5078xh f39293a;

    /* renamed from: b, reason: collision with root package name */
    public final C5128zh f39294b;

    /* renamed from: c, reason: collision with root package name */
    public final C4771lh f39295c;

    public D9(C4940s5 c4940s5) {
        this.f39293a = new C5078xh(c4940s5);
        this.f39294b = new C5128zh(c4940s5);
        this.f39295c = new C4771lh(c4940s5);
    }

    @Override // io.appmetrica.analytics.impl.Of
    public final AbstractC4841o9 a(int i) {
        LinkedList linkedList = new LinkedList();
        int iOrdinal = EnumC4997ub.a(i).ordinal();
        if (iOrdinal == 1) {
            linkedList.add(this.f39293a);
        } else if (iOrdinal == 3) {
            linkedList.add(this.f39295c);
        } else if (iOrdinal == 27) {
            linkedList.add(this.f39294b);
            linkedList.add(this.f39293a);
        }
        return new C4815n9(linkedList);
    }
}
