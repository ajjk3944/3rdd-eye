package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.em;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class l52 implements em {

    /* renamed from: g, reason: collision with root package name */
    public static final em.a<l52> f29889g = new L2(2);

    /* renamed from: b, reason: collision with root package name */
    public final int f29890b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29891c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29892d;

    /* renamed from: e, reason: collision with root package name */
    private final dc0[] f29893e;

    /* renamed from: f, reason: collision with root package name */
    private int f29894f;

    public l52(String str, dc0... dc0VarArr) {
        zf.a(dc0VarArr.length > 0);
        this.f29891c = str;
        this.f29893e = dc0VarArr;
        this.f29890b = dc0VarArr.length;
        int iC = k01.c(dc0VarArr[0].f26083m);
        this.f29892d = iC == -1 ? k01.c(dc0VarArr[0].f26082l) : iC;
        a();
    }

    public final dc0 a(int i) {
        return this.f29893e[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l52.class == obj.getClass()) {
            l52 l52Var = (l52) obj;
            if (this.f29891c.equals(l52Var.f29891c) && Arrays.equals(this.f29893e, l52Var.f29893e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f29894f == 0) {
            this.f29894f = C4121h3.a(this.f29891c, 527, 31) + Arrays.hashCode(this.f29893e);
        }
        return this.f29894f;
    }

    public final int a(dc0 dc0Var) {
        int i = 0;
        while (true) {
            dc0[] dc0VarArr = this.f29893e;
            if (i >= dc0VarArr.length) {
                return -1;
            }
            if (dc0Var == dc0VarArr[i]) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static l52 a(Bundle bundle) {
        xj0 xj0VarA;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            xj0VarA = xj0.h();
        } else {
            xj0VarA = fm.a(dc0.f26065I, parcelableArrayList);
        }
        return new l52(bundle.getString(Integer.toString(1, 36), ""), (dc0[]) xj0VarA.toArray(new dc0[0]));
    }

    private void a() {
        String str = this.f29893e[0].f26075d;
        if (str == null || str.equals("und")) {
            str = "";
        }
        int i = this.f29893e[0].f26077f | 16384;
        int i10 = 1;
        while (true) {
            dc0[] dc0VarArr = this.f29893e;
            if (i10 >= dc0VarArr.length) {
                return;
            }
            String str2 = dc0VarArr[i10].f26075d;
            if (str2 == null || str2.equals("und")) {
                str2 = "";
            }
            if (!str.equals(str2)) {
                dc0[] dc0VarArr2 = this.f29893e;
                rs0.a("TrackGroup", "", new IllegalStateException(B4.i.j(j6.l.d("Different languages combined in one TrackGroup: '", dc0VarArr2[0].f26075d, "' (track 0) and '", dc0VarArr2[i10].f26075d, "' (track "), i10, ")")));
                return;
            } else {
                dc0[] dc0VarArr3 = this.f29893e;
                if (i != (dc0VarArr3[i10].f26077f | 16384)) {
                    rs0.a("TrackGroup", "", new IllegalStateException(B4.i.j(j6.l.d("Different role flags combined in one TrackGroup: '", Integer.toBinaryString(dc0VarArr3[0].f26077f), "' (track 0) and '", Integer.toBinaryString(this.f29893e[i10].f26077f), "' (track "), i10, ")")));
                    return;
                }
                i10++;
            }
        }
    }
}
