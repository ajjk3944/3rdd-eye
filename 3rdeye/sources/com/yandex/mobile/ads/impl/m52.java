package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.em;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class m52 implements em {

    /* renamed from: e, reason: collision with root package name */
    public static final m52 f30219e = new m52(new l52[0]);

    /* renamed from: f, reason: collision with root package name */
    public static final em.a<m52> f30220f = new J0(5);

    /* renamed from: b, reason: collision with root package name */
    public final int f30221b;

    /* renamed from: c, reason: collision with root package name */
    private final xj0<l52> f30222c;

    /* renamed from: d, reason: collision with root package name */
    private int f30223d;

    public m52(l52... l52VarArr) {
        this.f30222c = xj0.b(l52VarArr);
        this.f30221b = l52VarArr.length;
        a();
    }

    public final l52 a(int i) {
        return this.f30222c.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m52.class == obj.getClass()) {
            m52 m52Var = (m52) obj;
            if (this.f30221b == m52Var.f30221b && this.f30222c.equals(m52Var.f30222c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f30223d == 0) {
            this.f30223d = this.f30222c.hashCode();
        }
        return this.f30223d;
    }

    public final int a(l52 l52Var) {
        int iIndexOf = this.f30222c.indexOf(l52Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static m52 a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            return new m52(new l52[0]);
        }
        return new m52((l52[]) fm.a(l52.f29889g, parcelableArrayList).toArray(new l52[0]));
    }

    private void a() {
        int i = 0;
        while (i < this.f30222c.size()) {
            int i10 = i + 1;
            for (int i11 = i10; i11 < this.f30222c.size(); i11++) {
                if (this.f30222c.get(i).equals(this.f30222c.get(i11))) {
                    rs0.a("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i10;
        }
    }
}
