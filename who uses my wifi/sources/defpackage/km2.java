package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class km2 {
    public final u93 a;
    public final e51 b;
    public final ApplicationInfo c;
    public final String d;
    public final ArrayList e;
    public final PackageInfo f;
    public final z94 g;
    public final String h;
    public final s53 i;
    public final ra4 j;
    public final l83 k;
    public final int l;
    public final bp2 m;

    public km2(u93 u93Var, e51 e51Var, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, z94 z94Var, ra4 ra4Var, String str2, s53 s53Var, l83 l83Var, bp2 bp2Var, int i) {
        this.a = u93Var;
        this.b = e51Var;
        this.c = applicationInfo;
        this.d = str;
        this.e = arrayList;
        this.f = packageInfo;
        this.g = z94Var;
        this.h = str2;
        this.i = s53Var;
        this.j = ra4Var;
        this.k = l83Var;
        this.m = bp2Var;
        this.l = i;
    }

    public final q93 a(Bundle bundle) {
        this.m.a();
        u93 u93Var = this.a;
        Objects.requireNonNull(u93Var);
        return new bu1(u93Var, s93.g, null, u93.d, Collections.EMPTY_LIST, this.i.a(new jm2(new Bundle(), new Bundle()), bundle, this.l == 2)).A();
    }

    public final q93 b() {
        Bundle bundle = new Bundle();
        if (((Boolean) tw1.e.c.a(mz1.m2)).booleanValue()) {
            Bundle bundle2 = this.k.t;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        q93 q93VarA = a(bundle);
        n70[] n70VarArr = {q93VarA, (n70) this.g.d()};
        u93 u93Var = this.a;
        u93Var.getClass();
        List listAsList = Arrays.asList(n70VarArr);
        yi1 yi1Var = new yi1(this, q93VarA, bundle, 3);
        vm3 vm3Var = xm3.g;
        listAsList.getClass();
        xm3 xm3VarM = xm3.m(listAsList);
        gz1 gz1Var = gz1.f;
        ld2 ld2Var = md2.g;
        cq3 cq3Var = new cq3(xm3VarM, true, false);
        cq3Var.u = new bq3(cq3Var, gz1Var, ld2Var);
        cq3Var.v();
        pq3 pq3Var = u93Var.a;
        cq3 cq3Var2 = new cq3(xm3VarM, true, false);
        cq3Var2.u = new bq3(cq3Var2, yi1Var, pq3Var);
        cq3Var2.v();
        return new bu1(u93Var, s93.h, null, cq3Var, listAsList, cq3Var2).A();
    }
}
