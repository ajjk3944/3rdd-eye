package com.google.android.gms.measurement.internal;

import o.C7030v;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.m3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4905m3 extends C7030v {

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ C4873i3 f36591j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4905m3(C4873i3 c4873i3, int i10) {
        super(20);
        this.f36591j = c4873i3;
    }

    @Override // o.C7030v
    protected final /* synthetic */ Object a(Object obj) {
        String str = (String) obj;
        AbstractC7901p.f(str);
        return this.f36591j.a().p(N.f36105o1) ? C4873i3.F(this.f36591j, str) : C4873i3.w(this.f36591j, str);
    }
}
