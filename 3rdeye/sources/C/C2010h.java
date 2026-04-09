package c;

import b9.C1992A;
import p9.InterfaceC5480a;

/* compiled from: ComponentActivity.kt */
/* renamed from: c.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2010h extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ActivityC2008f f18288g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2010h(ActivityC2008f activityC2008f) {
        super(0);
        this.f18288g = activityC2008f;
    }

    @Override // p9.InterfaceC5480a
    public final C1992A invoke() {
        this.f18288g.reportFullyDrawn();
        return C1992A.f18074a;
    }
}
