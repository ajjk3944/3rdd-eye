package androidx.recyclerview.widget;

import android.annotation.SuppressLint;

/* compiled from: BatchingListUpdateCallback.java */
/* renamed from: androidx.recyclerview.widget.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1803e implements w {

    /* renamed from: a, reason: collision with root package name */
    public final w f16623a;

    /* renamed from: b, reason: collision with root package name */
    public int f16624b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f16625c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f16626d = -1;

    /* renamed from: e, reason: collision with root package name */
    public Object f16627e = null;

    public C1803e(w wVar) {
        this.f16623a = wVar;
    }

    @Override // androidx.recyclerview.widget.w
    public final void a(int i, int i10) {
        e();
        this.f16623a.a(i, i10);
    }

    @Override // androidx.recyclerview.widget.w
    public final void b(int i, int i10) {
        int i11;
        if (this.f16624b == 1 && i >= (i11 = this.f16625c)) {
            int i12 = this.f16626d;
            if (i <= i11 + i12) {
                this.f16626d = i12 + i10;
                this.f16625c = Math.min(i, i11);
                return;
            }
        }
        e();
        this.f16625c = i;
        this.f16626d = i10;
        this.f16624b = 1;
    }

    @Override // androidx.recyclerview.widget.w
    public final void c(int i, int i10) {
        int i11;
        if (this.f16624b == 2 && (i11 = this.f16625c) >= i && i11 <= i + i10) {
            this.f16626d += i10;
            this.f16625c = i;
        } else {
            e();
            this.f16625c = i;
            this.f16626d = i10;
            this.f16624b = 2;
        }
    }

    @Override // androidx.recyclerview.widget.w
    @SuppressLint({"UnknownNullness"})
    public final void d(int i, int i10, Object obj) {
        int i11;
        int i12;
        int i13;
        if (this.f16624b == 3 && i <= (i12 = this.f16626d + (i11 = this.f16625c)) && (i13 = i + i10) >= i11 && this.f16627e == obj) {
            this.f16625c = Math.min(i, i11);
            this.f16626d = Math.max(i12, i13) - this.f16625c;
            return;
        }
        e();
        this.f16625c = i;
        this.f16626d = i10;
        this.f16627e = obj;
        this.f16624b = 3;
    }

    public final void e() {
        int i = this.f16624b;
        if (i == 0) {
            return;
        }
        w wVar = this.f16623a;
        if (i == 1) {
            wVar.b(this.f16625c, this.f16626d);
        } else if (i == 2) {
            wVar.c(this.f16625c, this.f16626d);
        } else if (i == 3) {
            wVar.d(this.f16625c, this.f16626d, this.f16627e);
        }
        this.f16627e = null;
        this.f16624b = 0;
    }
}
