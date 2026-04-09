package K6;

import H6.C0675l;
import N7.R3;
import android.view.View;
import p9.InterfaceC5480a;
import z6.C5865d;

/* compiled from: DivCustomBinder.kt */
/* renamed from: K6.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0726g0 extends kotlin.jvm.internal.m implements InterfaceC5480a<View> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0732i0 f3456g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ R3 f3457h;
    public final /* synthetic */ C0675l i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ A7.d f3458j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C5865d f3459k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0726g0(C0732i0 c0732i0, R3 r32, C0675l c0675l, A7.d dVar, C5865d c5865d) {
        super(0);
        this.f3456g = c0732i0;
        this.f3457h = r32;
        this.i = c0675l;
        this.f3458j = dVar;
        this.f3459k = c5865d;
    }

    @Override // p9.InterfaceC5480a
    public final View invoke() {
        return this.f3456g.f3482d.createView(this.f3457h, this.i, this.f3458j, this.f3459k);
    }
}
