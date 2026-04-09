package com.yandex.mobile.ads.impl;

import java.util.Comparator;

/* loaded from: classes3.dex */
public abstract class sq {

    /* renamed from: a, reason: collision with root package name */
    private static final sq f33179a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final sq f33180b = new b(-1);

    /* renamed from: c, reason: collision with root package name */
    private static final sq f33181c = new b(1);

    public class a extends sq {
        public a() {
            super(0);
        }

        @Override // com.yandex.mobile.ads.impl.sq
        public final int a() {
            return 0;
        }

        @Override // com.yandex.mobile.ads.impl.sq
        public final sq b(boolean z10, boolean z11) {
            char c10 = z11 == z10 ? (char) 0 : z11 ? (char) 1 : (char) 65535;
            return c10 < 0 ? sq.f33180b : c10 > 0 ? sq.f33181c : sq.f33179a;
        }

        @Override // com.yandex.mobile.ads.impl.sq
        public final sq a(int i, int i10) {
            char c10 = i < i10 ? (char) 65535 : i > i10 ? (char) 1 : (char) 0;
            return c10 < 0 ? sq.f33180b : c10 > 0 ? sq.f33181c : sq.f33179a;
        }

        @Override // com.yandex.mobile.ads.impl.sq
        public final sq a(long j4, long j10) {
            char c10 = j4 < j10 ? (char) 65535 : j4 > j10 ? (char) 1 : (char) 0;
            if (c10 < 0) {
                return sq.f33180b;
            }
            return c10 > 0 ? sq.f33181c : sq.f33179a;
        }

        @Override // com.yandex.mobile.ads.impl.sq
        public final <T> sq a(T t10, T t11, Comparator<T> comparator) {
            int iCompare = comparator.compare(t10, t11);
            if (iCompare < 0) {
                return sq.f33180b;
            }
            return iCompare > 0 ? sq.f33181c : sq.f33179a;
        }

        @Override // com.yandex.mobile.ads.impl.sq
        public final sq a(boolean z10, boolean z11) {
            char c10 = z10 == z11 ? (char) 0 : z10 ? (char) 1 : (char) 65535;
            if (c10 < 0) {
                return sq.f33180b;
            }
            return c10 > 0 ? sq.f33181c : sq.f33179a;
        }
    }

    public static final class b extends sq {

        /* renamed from: d, reason: collision with root package name */
        final int f33182d;

        public b(int i) {
            super(0);
            this.f33182d = i;
        }

        @Override // com.yandex.mobile.ads.impl.sq
        public final sq a(int i, int i10) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.sq
        public final sq a(long j4, long j10) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.sq
        public final <T> sq a(T t10, T t11, Comparator<T> comparator) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.sq
        public final sq a(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.sq
        public final int a() {
            return this.f33182d;
        }

        @Override // com.yandex.mobile.ads.impl.sq
        public final sq b(boolean z10, boolean z11) {
            return this;
        }
    }

    public /* synthetic */ sq(int i) {
        this();
    }

    public static sq b() {
        return f33179a;
    }

    public abstract int a();

    public abstract sq a(int i, int i10);

    public abstract sq a(long j4, long j10);

    public abstract <T> sq a(T t10, T t11, Comparator<T> comparator);

    public abstract sq a(boolean z10, boolean z11);

    public abstract sq b(boolean z10, boolean z11);

    private sq() {
    }
}
