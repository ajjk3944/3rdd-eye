package com.facebook.shimmer;

import android.content.res.TypedArray;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends a8.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8942c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i4) {
        super(2);
        this.f8942c = i4;
        switch (i4) {
            case 1:
                super(2);
                break;
            default:
                ((c) this.f218b).f8956p = true;
                break;
        }
    }

    @Override // a8.a
    public a8.a q(TypedArray typedArray) {
        switch (this.f8942c) {
            case 1:
                c cVar = (c) this.f218b;
                super.q(typedArray);
                if (typedArray.hasValue(2)) {
                    cVar.f8947e = (typedArray.getColor(2, cVar.f8947e) & 16777215) | (cVar.f8947e & (-16777216));
                }
                if (typedArray.hasValue(12)) {
                    cVar.f8946d = typedArray.getColor(12, cVar.f8946d);
                }
                return this;
            default:
                return super.q(typedArray);
        }
    }

    @Override // a8.a
    public final a8.a s() {
        int i4 = this.f8942c;
        return this;
    }
}
