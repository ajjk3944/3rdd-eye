package R6;

import K6.C0713c;
import android.util.DisplayMetrics;

/* compiled from: OverflowItemStrategy.kt */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f11747a;

    /* compiled from: OverflowItemStrategy.kt */
    public static final class a extends g {

        /* renamed from: b, reason: collision with root package name */
        public final int f11748b;

        /* renamed from: c, reason: collision with root package name */
        public final int f11749c;

        /* renamed from: d, reason: collision with root package name */
        public final int f11750d;

        /* renamed from: e, reason: collision with root package name */
        public final int f11751e;

        /* renamed from: f, reason: collision with root package name */
        public final DisplayMetrics f11752f;

        public a(int i, int i10, int i11, int i12, DisplayMetrics displayMetrics) {
            super(i10);
            this.f11748b = i;
            this.f11749c = i10;
            this.f11750d = i11;
            this.f11751e = i12;
            this.f11752f = displayMetrics;
        }

        @Override // R6.g
        public final int a(int i) {
            if (this.f11747a <= 0) {
                return -1;
            }
            return Math.min(this.f11748b + i, this.f11749c - 1);
        }

        @Override // R6.g
        public final int b(int i) {
            return Math.min(Math.max(0, C0713c.C(Integer.valueOf(i), this.f11752f) + this.f11751e), this.f11750d);
        }

        @Override // R6.g
        public final int c(int i) {
            if (this.f11747a <= 0) {
                return -1;
            }
            return Math.max(0, this.f11748b - i);
        }
    }

    /* compiled from: OverflowItemStrategy.kt */
    public static final class b extends g {

        /* renamed from: b, reason: collision with root package name */
        public final int f11753b;

        /* renamed from: c, reason: collision with root package name */
        public final int f11754c;

        /* renamed from: d, reason: collision with root package name */
        public final int f11755d;

        /* renamed from: e, reason: collision with root package name */
        public final int f11756e;

        /* renamed from: f, reason: collision with root package name */
        public final DisplayMetrics f11757f;

        public b(int i, int i10, int i11, int i12, DisplayMetrics displayMetrics) {
            super(i10);
            this.f11753b = i;
            this.f11754c = i10;
            this.f11755d = i11;
            this.f11756e = i12;
            this.f11757f = displayMetrics;
        }

        @Override // R6.g
        public final int a(int i) {
            if (this.f11747a <= 0) {
                return -1;
            }
            return (this.f11753b + i) % this.f11754c;
        }

        @Override // R6.g
        public final int b(int i) {
            int iC = C0713c.C(Integer.valueOf(i), this.f11757f) + this.f11756e;
            int i10 = this.f11755d;
            int i11 = iC % i10;
            return i11 < 0 ? i11 + i10 : i11;
        }

        @Override // R6.g
        public final int c(int i) {
            if (this.f11747a <= 0) {
                return -1;
            }
            int i10 = this.f11753b - i;
            int i11 = this.f11754c;
            int i12 = i10 % i11;
            return i12 + (i11 & (((i12 ^ i11) & ((-i12) | i12)) >> 31));
        }
    }

    public g(int i) {
        this.f11747a = i;
    }

    public abstract int a(int i);

    public abstract int b(int i);

    public abstract int c(int i);
}
