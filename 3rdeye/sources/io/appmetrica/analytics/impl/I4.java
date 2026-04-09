package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class I4 extends C5039w3 {

    /* renamed from: b, reason: collision with root package name */
    public final int f39615b;

    public I4(int i, int i10) {
        super(i10);
        this.f39615b = i;
    }

    @Override // io.appmetrica.analytics.impl.C5039w3
    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionTrimInfo{itemsDropped=");
        sb.append(this.f39615b);
        sb.append(", bytesTruncated=");
        return N7.H7.p(sb, this.f41889a, '}');
    }
}
