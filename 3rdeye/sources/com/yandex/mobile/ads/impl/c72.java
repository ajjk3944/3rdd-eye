package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public interface c72 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f25556a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f25557b;

        public a(String str, byte[] bArr) {
            this.f25556a = str;
            this.f25557b = bArr;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f25558a;

        /* renamed from: b, reason: collision with root package name */
        public final List<a> f25559b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f25560c;

        public b(int i, String str, ArrayList arrayList, byte[] bArr) {
            this.f25558a = str;
            this.f25559b = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
            this.f25560c = bArr;
        }
    }

    public interface c {
        SparseArray<c72> a();

        c72 a(int i, b bVar);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f25561a;

        /* renamed from: b, reason: collision with root package name */
        private final int f25562b;

        /* renamed from: c, reason: collision with root package name */
        private final int f25563c;

        /* renamed from: d, reason: collision with root package name */
        private int f25564d;

        /* renamed from: e, reason: collision with root package name */
        private String f25565e;

        public d(int i, int i10, int i11) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.f25561a = str;
            this.f25562b = i10;
            this.f25563c = i11;
            this.f25564d = RecyclerView.UNDEFINED_DURATION;
            this.f25565e = "";
        }

        public final void a() {
            int i = this.f25564d;
            this.f25564d = i == Integer.MIN_VALUE ? this.f25562b : i + this.f25563c;
            this.f25565e = this.f25561a + this.f25564d;
        }

        public final String b() {
            if (this.f25564d != Integer.MIN_VALUE) {
                return this.f25565e;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        public final int c() {
            int i = this.f25564d;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    void a();

    void a(int i, uf1 uf1Var) throws yf1;

    void a(c52 c52Var, w70 w70Var, d dVar);
}
