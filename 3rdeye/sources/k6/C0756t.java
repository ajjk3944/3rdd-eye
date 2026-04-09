package K6;

import android.view.View;
import b9.C1992A;
import p9.InterfaceC5480a;

/* compiled from: DivActionBinder.kt */
/* renamed from: K6.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0756t extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f3633g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ View f3634h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0756t(View.OnClickListener onClickListener, View view) {
        super(0);
        this.f3633g = onClickListener;
        this.f3634h = view;
    }

    @Override // p9.InterfaceC5480a
    public final C1992A invoke() {
        this.f3633g.onClick(this.f3634h);
        return C1992A.f18074a;
    }
}
