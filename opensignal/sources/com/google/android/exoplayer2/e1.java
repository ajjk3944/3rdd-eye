package com.google.android.exoplayer2;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final qb.f f4107a;

    public e1(qb.f fVar) {
        this.f4107a = fVar;
    }

    public final boolean a(int i10) {
        return this.f4107a.f20777a.get(i10);
    }

    public final boolean b(int... iArr) {
        for (int i10 : iArr) {
            if (this.f4107a.f20777a.get(i10)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e1) {
            return this.f4107a.equals(((e1) obj).f4107a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4107a.hashCode();
    }
}
