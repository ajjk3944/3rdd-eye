package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1730h;

/* compiled from: ByteString.java */
/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1729g extends AbstractC1730h.a {

    /* renamed from: b, reason: collision with root package name */
    public int f15596b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f15597c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC1730h f15598d;

    public C1729g(AbstractC1730h abstractC1730h) {
        this.f15598d = abstractC1730h;
        this.f15597c = abstractC1730h.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15596b < this.f15597c;
    }
}
