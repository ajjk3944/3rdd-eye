package t5;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public final Context f34259b;

    /* renamed from: c, reason: collision with root package name */
    public final String f34260c;

    /* renamed from: f, reason: collision with root package name */
    public Executor f34263f;
    public Executor g;

    /* renamed from: h, reason: collision with root package name */
    public f7.d f34264h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f34265i;

    /* renamed from: q, reason: collision with root package name */
    public boolean f34272q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f34273r;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f34261d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f34262e = new ArrayList();
    public final r j = r.f34275a;

    /* renamed from: k, reason: collision with root package name */
    public final long f34266k = -1;

    /* renamed from: l, reason: collision with root package name */
    public final km.y f34267l = new km.y(19);

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashSet f34268m = new LinkedHashSet();

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashSet f34269n = new LinkedHashSet();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f34270o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public boolean f34271p = true;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f34274s = true;

    /* renamed from: a, reason: collision with root package name */
    public final nk.e f34258a = nk.v.a(WorkDatabase.class);

    public q(Context context, String str) {
        this.f34259b = context;
        this.f34260c = str;
    }

    public final void a(x5.b... bVarArr) {
        for (x5.b bVar : bVarArr) {
            Integer numValueOf = Integer.valueOf(bVar.f36975a);
            LinkedHashSet linkedHashSet = this.f34269n;
            linkedHashSet.add(numValueOf);
            linkedHashSet.add(Integer.valueOf(bVar.f36976b));
        }
        x5.b[] bVarArr2 = (x5.b[]) Arrays.copyOf(bVarArr, bVarArr.length);
        km.y yVar = this.f34267l;
        yVar.getClass();
        nk.k.e(bVarArr2, "migrations");
        for (x5.b bVar2 : bVarArr2) {
            yVar.w(bVar2);
        }
    }
}
