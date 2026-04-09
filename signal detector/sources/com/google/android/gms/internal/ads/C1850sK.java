package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1850sK extends AbstractC2012vK {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16706f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1850sK(C2120xK c2120xK, int i) {
        super(c2120xK);
        this.f16706f = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2012vK, java.util.Iterator
    public Object next() {
        switch (this.f16706f) {
            case 1:
                return b().f17428f;
            default:
                return super.next();
        }
    }
}
