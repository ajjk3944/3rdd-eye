package K6;

import H6.C0675l;
import N7.R3;
import android.view.View;
import b9.C1992A;
import z6.C5865d;

/* compiled from: DivCustomBinder.kt */
/* renamed from: K6.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0729h0 extends kotlin.jvm.internal.m implements p9.l<View, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0732i0 f3470g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ R3 f3471h;
    public final /* synthetic */ C0675l i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ A7.d f3472j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C5865d f3473k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0729h0(C0732i0 c0732i0, R3 r32, C0675l c0675l, A7.d dVar, C5865d c5865d) {
        super(1);
        this.f3470g = c0732i0;
        this.f3471h = r32;
        this.i = c0675l;
        this.f3472j = dVar;
        this.f3473k = c5865d;
    }

    @Override // p9.l
    public final C1992A invoke(View view) {
        View it = view;
        kotlin.jvm.internal.l.f(it, "it");
        C0732i0 c0732i0 = this.f3470g;
        c0732i0.f3482d.bindView(it, this.f3471h, this.i, this.f3472j, this.f3473k);
        return C1992A.f18074a;
    }
}
