package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class GL {

    /* renamed from: a, reason: collision with root package name */
    public final FK f8359a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8360b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f8361c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8362d;

    public GL(FK fk, String str, Object[] objArr) {
        this.f8359a = fk;
        this.f8360b = str;
        this.f8361c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f8362d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i3 = 1;
        int i6 = 13;
        while (true) {
            int i7 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f8362d = i | (cCharAt2 << i6);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i6;
                i6 += 13;
                i3 = i7;
            }
        }
    }

    public final int a() {
        int i = this.f8362d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
