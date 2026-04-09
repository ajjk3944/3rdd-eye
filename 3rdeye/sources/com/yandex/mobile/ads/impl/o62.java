package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.em;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class o62 implements em {

    /* renamed from: c, reason: collision with root package name */
    public static final o62 f31268c = new o62(xj0.h());

    /* renamed from: b, reason: collision with root package name */
    private final xj0<a> f31269b;

    public static final class a implements em {

        /* renamed from: g, reason: collision with root package name */
        public static final em.a<a> f31270g = new L2(6);

        /* renamed from: b, reason: collision with root package name */
        public final int f31271b;

        /* renamed from: c, reason: collision with root package name */
        private final l52 f31272c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f31273d;

        /* renamed from: e, reason: collision with root package name */
        private final int[] f31274e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean[] f31275f;

        public a(l52 l52Var, boolean z10, int[] iArr, boolean[] zArr) {
            int i = l52Var.f29890b;
            this.f31271b = i;
            boolean z11 = false;
            zf.a(i == iArr.length && i == zArr.length);
            this.f31272c = l52Var;
            if (z10 && i > 1) {
                z11 = true;
            }
            this.f31273d = z11;
            this.f31274e = (int[]) iArr.clone();
            this.f31275f = (boolean[]) zArr.clone();
        }

        public final dc0 a(int i) {
            return this.f31272c.a(i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f31273d == aVar.f31273d && this.f31272c.equals(aVar.f31272c) && Arrays.equals(this.f31274e, aVar.f31274e) && Arrays.equals(this.f31275f, aVar.f31275f)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f31275f) + ((Arrays.hashCode(this.f31274e) + (((this.f31272c.hashCode() * 31) + (this.f31273d ? 1 : 0)) * 31)) * 31);
        }

        public final int a() {
            return this.f31272c.f29892d;
        }

        public final boolean b() {
            for (boolean z10 : this.f31275f) {
                if (z10) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a a(Bundle bundle) {
            em.a<l52> aVar = l52.f29889g;
            Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
            bundle2.getClass();
            l52 l52Var = (l52) aVar.fromBundle(bundle2);
            int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
            int[] iArr = new int[l52Var.f29890b];
            if (intArray == null) {
                intArray = iArr;
            }
            boolean[] booleanArray = bundle.getBooleanArray(Integer.toString(3, 36));
            boolean[] zArr = new boolean[l52Var.f29890b];
            if (booleanArray == null) {
                booleanArray = zArr;
            }
            return new a(l52Var, bundle.getBoolean(Integer.toString(4, 36), false), intArray, booleanArray);
        }

        public final boolean b(int i) {
            return this.f31275f[i];
        }
    }

    public o62(xj0 xj0Var) {
        this.f31269b = xj0.a((Collection) xj0Var);
    }

    public final xj0<a> a() {
        return this.f31269b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o62.class != obj.getClass()) {
            return false;
        }
        return this.f31269b.equals(((o62) obj).f31269b);
    }

    public final int hashCode() {
        return this.f31269b.hashCode();
    }

    public final boolean a(int i) {
        for (int i10 = 0; i10 < this.f31269b.size(); i10++) {
            a aVar = this.f31269b.get(i10);
            if (aVar.b() && aVar.a() == i) {
                return true;
            }
        }
        return false;
    }

    private static o62 a(Bundle bundle) {
        xj0 xj0VarA;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            xj0VarA = xj0.h();
        } else {
            xj0VarA = fm.a(a.f31270g, parcelableArrayList);
        }
        return new o62(xj0VarA);
    }
}
