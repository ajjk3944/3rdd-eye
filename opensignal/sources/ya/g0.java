package ya;

import com.google.android.exoplayer2.w1;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class g0 extends g {
    public static final com.google.android.exoplayer2.n0 k;

    /* renamed from: d, reason: collision with root package name */
    public final x[] f26066d;

    /* renamed from: e, reason: collision with root package name */
    public final w1[] f26067e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f26068f;

    /* renamed from: g, reason: collision with root package name */
    public final sm.m f26069g;

    /* renamed from: h, reason: collision with root package name */
    public int f26070h;

    /* renamed from: i, reason: collision with root package name */
    public long[][] f26071i;
    public androidx.datastore.preferences.protobuf.m j;

    static {
        List list = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        k = new com.google.android.exoplayer2.n0("MergingMediaSource", new com.google.android.exoplayer2.k0(Long.MIN_VALUE), null, new com.google.android.exoplayer2.l0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), com.google.android.exoplayer2.p0.f4365s);
    }

    public g0(x... xVarArr) {
        sm.m mVar = new sm.m();
        this.f26066d = xVarArr;
        this.f26069g = mVar;
        this.f26068f = new ArrayList(Arrays.asList(xVarArr));
        this.f26070h = -1;
        this.f26067e = new w1[xVarArr.length];
        this.f26071i = new long[0][];
        new HashMap();
        oe.s.c(8, "expectedKeys");
        oe.s.c(2, "expectedValuesPerKey");
        oe.w wVarB = oe.w.b();
        new oe.p0();
        if (!wVarB.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    @Override // ya.g
    public final v a(Object obj, v vVar) {
        if (((Integer) obj).intValue() == 0) {
            return vVar;
        }
        return null;
    }

    @Override // ya.g
    public final void b(Object obj, a aVar, w1 w1Var) {
        Integer num = (Integer) obj;
        if (this.j != null) {
            return;
        }
        if (this.f26070h == -1) {
            this.f26070h = w1Var.h();
        } else if (w1Var.h() != this.f26070h) {
            this.j = new androidx.datastore.preferences.protobuf.m();
            return;
        }
        int length = this.f26071i.length;
        w1[] w1VarArr = this.f26067e;
        if (length == 0) {
            this.f26071i = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f26070h, w1VarArr.length);
        }
        ArrayList arrayList = this.f26068f;
        arrayList.remove(aVar);
        w1VarArr[num.intValue()] = w1Var;
        if (arrayList.isEmpty()) {
            refreshSourceInfo(w1VarArr[0]);
        }
    }

    @Override // ya.x
    public final t createPeriod(v vVar, pb.b bVar, long j) {
        x[] xVarArr = this.f26066d;
        int length = xVarArr.length;
        t[] tVarArr = new t[length];
        w1[] w1VarArr = this.f26067e;
        int iB = w1VarArr[0].b(vVar.f26177a);
        for (int i10 = 0; i10 < length; i10++) {
            tVarArr[i10] = xVarArr[i10].createPeriod(vVar.b(w1VarArr[i10].l(iB)), bVar, j - this.f26071i[iB][i10]);
        }
        return new f0(this.f26069g, this.f26071i[iB], tVarArr);
    }

    @Override // ya.x
    public final com.google.android.exoplayer2.n0 getMediaItem() {
        x[] xVarArr = this.f26066d;
        return xVarArr.length > 0 ? xVarArr[0].getMediaItem() : k;
    }

    @Override // ya.x
    public final void maybeThrowSourceInfoRefreshError() throws androidx.datastore.preferences.protobuf.m {
        androidx.datastore.preferences.protobuf.m mVar = this.j;
        if (mVar != null) {
            throw mVar;
        }
        Iterator it = this.f26063a.values().iterator();
        while (it.hasNext()) {
            ((f) it.next()).f26054a.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // ya.a
    public final void prepareSourceInternal(pb.u0 u0Var) {
        this.f26065c = u0Var;
        this.f26064b = qb.v.l(null);
        int i10 = 0;
        while (true) {
            x[] xVarArr = this.f26066d;
            if (i10 >= xVarArr.length) {
                return;
            }
            c(Integer.valueOf(i10), xVarArr[i10]);
            i10++;
        }
    }

    @Override // ya.x
    public final void releasePeriod(t tVar) {
        f0 f0Var = (f0) tVar;
        int i10 = 0;
        while (true) {
            x[] xVarArr = this.f26066d;
            if (i10 >= xVarArr.length) {
                return;
            }
            x xVar = xVarArr[i10];
            t tVar2 = f0Var.f26057a[i10];
            if (tVar2 instanceof d0) {
                tVar2 = ((d0) tVar2).f26047a;
            }
            xVar.releasePeriod(tVar2);
            i10++;
        }
    }

    @Override // ya.g, ya.a
    public final void releaseSourceInternal() {
        super.releaseSourceInternal();
        Arrays.fill(this.f26067e, (Object) null);
        this.f26070h = -1;
        this.j = null;
        ArrayList arrayList = this.f26068f;
        arrayList.clear();
        Collections.addAll(arrayList, this.f26066d);
    }
}
