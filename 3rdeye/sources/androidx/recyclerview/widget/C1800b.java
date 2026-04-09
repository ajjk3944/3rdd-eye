package androidx.recyclerview.widget;

import android.annotation.SuppressLint;

/* compiled from: AdapterListUpdateCallback.java */
/* renamed from: androidx.recyclerview.widget.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1800b implements w {

    /* renamed from: a, reason: collision with root package name */
    public final v f16601a;

    public C1800b(v vVar) {
        this.f16601a = vVar;
    }

    @Override // androidx.recyclerview.widget.w
    public final void a(int i, int i10) {
        this.f16601a.notifyItemMoved(i, i10);
    }

    @Override // androidx.recyclerview.widget.w
    public final void b(int i, int i10) {
        this.f16601a.notifyItemRangeInserted(i, i10);
    }

    @Override // androidx.recyclerview.widget.w
    public final void c(int i, int i10) {
        this.f16601a.notifyItemRangeRemoved(i, i10);
    }

    @Override // androidx.recyclerview.widget.w
    @SuppressLint({"UnknownNullness"})
    public final void d(int i, int i10, Object obj) {
        this.f16601a.notifyItemRangeChanged(i, i10, obj);
    }
}
