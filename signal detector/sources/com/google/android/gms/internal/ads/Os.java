package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Os extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public final int f10262a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10263b;

    public Os(int i, int i3) {
        super(i != 0 ? i != 1 ? i != 2 ? i != 3 ? A.f.n(new StringBuilder(String.valueOf(i3).length() + 31), "Player stuck suppressed for ", i3, " ms") : A.f.n(new StringBuilder(String.valueOf(i3).length() + 43), "Player stuck playing without ending for ", i3, " ms") : A.f.n(new StringBuilder(String.valueOf(i3).length() + 45), "Player stuck playing with no progress for ", i3, " ms") : A.f.n(new StringBuilder(String.valueOf(i3).length() + 47), "Player stuck buffering with no progress for ", i3, " ms") : A.f.n(new StringBuilder(String.valueOf(i3).length() + 46), "Player stuck buffering and not loading for ", i3, " ms"));
        this.f10262a = i;
        this.f10263b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Os.class != obj.getClass()) {
            return false;
        }
        Os os = (Os) obj;
        return this.f10262a == os.f10262a && this.f10263b == os.f10263b;
    }

    public final int hashCode() {
        return ((this.f10262a + 527) * 31) + this.f10263b;
    }
}
