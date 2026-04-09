package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
abstract class dh {

    /* renamed from: a, reason: collision with root package name */
    public final int f26169a;

    public static final class a extends dh {

        /* renamed from: b, reason: collision with root package name */
        public final long f26170b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f26171c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f26172d;

        public a(int i, long j4) {
            super(i);
            this.f26170b = j4;
            this.f26171c = new ArrayList();
            this.f26172d = new ArrayList();
        }

        public final a b(int i) {
            int size = this.f26172d.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar = (a) this.f26172d.get(i10);
                if (aVar.f26169a == i) {
                    return aVar;
                }
            }
            return null;
        }

        public final b c(int i) {
            int size = this.f26171c.size();
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = (b) this.f26171c.get(i10);
                if (bVar.f26169a == i) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // com.yandex.mobile.ads.impl.dh
        public final String toString() {
            return dh.a(this.f26169a) + " leaves: " + Arrays.toString(this.f26171c.toArray()) + " containers: " + Arrays.toString(this.f26172d.toArray());
        }
    }

    public static final class b extends dh {

        /* renamed from: b, reason: collision with root package name */
        public final uf1 f26173b;

        public b(int i, uf1 uf1Var) {
            super(i);
            this.f26173b = uf1Var;
        }
    }

    public dh(int i) {
        this.f26169a = i;
    }

    public static String a(int i) {
        return "" + ((char) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) (i & KotlinVersion.MAX_COMPONENT_VALUE));
    }

    public String toString() {
        return a(this.f26169a);
    }
}
