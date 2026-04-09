package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;

/* compiled from: AutoValue_OutputSurface.java */
/* renamed from: androidx.camera.core.impl.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1693i extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final Surface f15054a;

    /* renamed from: b, reason: collision with root package name */
    public final Size f15055b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15056c;

    public C1693i(Surface surface, Size size, int i) {
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f15054a = surface;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f15055b = size;
        this.f15056c = i;
    }

    @Override // androidx.camera.core.impl.v0
    public final int a() {
        return this.f15056c;
    }

    @Override // androidx.camera.core.impl.v0
    public final Size b() {
        return this.f15055b;
    }

    @Override // androidx.camera.core.impl.v0
    public final Surface c() {
        return this.f15054a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f15054a.equals(v0Var.c()) && this.f15055b.equals(v0Var.b()) && this.f15056c == v0Var.a();
    }

    public final int hashCode() {
        return ((((this.f15054a.hashCode() ^ 1000003) * 1000003) ^ this.f15055b.hashCode()) * 1000003) ^ this.f15056c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{surface=");
        sb.append(this.f15054a);
        sb.append(", size=");
        sb.append(this.f15055b);
        sb.append(", imageFormat=");
        return B4.i.j(sb, this.f15056c, "}");
    }
}
