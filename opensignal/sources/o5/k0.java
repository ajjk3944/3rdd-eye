package o5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class k0 extends j {
    public static final androidx.media3.common.e0 k;

    /* renamed from: d, reason: collision with root package name */
    public final b0[] f18976d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.media3.common.a1[] f18977e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f18978f;

    /* renamed from: g, reason: collision with root package name */
    public final et.d f18979g;

    /* renamed from: h, reason: collision with root package name */
    public int f18980h;

    /* renamed from: i, reason: collision with root package name */
    public long[][] f18981i;
    public androidx.datastore.preferences.protobuf.m j;

    static {
        androidx.media3.common.v vVar = new androidx.media3.common.v();
        oe.f0 f0Var = oe.h0.f19336d;
        oe.u0 u0Var = oe.u0.f19383x;
        List list = Collections.EMPTY_LIST;
        oe.u0 u0Var2 = oe.u0.f19383x;
        k = new androidx.media3.common.e0("MergingMediaSource", new androidx.media3.common.x(vVar), null, new androidx.media3.common.z(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), androidx.media3.common.g0.f1655e0, androidx.media3.common.c0.f1577g);
    }

    public k0(b0... b0VarArr) {
        et.d dVar = new et.d();
        this.f18976d = b0VarArr;
        this.f18979g = dVar;
        this.f18978f = new ArrayList(Arrays.asList(b0VarArr));
        this.f18980h = -1;
        this.f18977e = new androidx.media3.common.a1[b0VarArr.length];
        this.f18981i = new long[0][];
        new HashMap();
        oe.s.c(8, "expectedKeys");
        oe.s.c(2, "expectedValuesPerKey");
        oe.w wVarB = oe.w.b();
        new oe.p0();
        if (!wVarB.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    @Override // o5.j
    public final z a(Object obj, z zVar) {
        if (((Integer) obj).intValue() == 0) {
            return zVar;
        }
        return null;
    }

    @Override // o5.b0
    public final x createPeriod(z zVar, r5.b bVar, long j) {
        b0[] b0VarArr = this.f18976d;
        int length = b0VarArr.length;
        x[] xVarArr = new x[length];
        androidx.media3.common.a1[] a1VarArr = this.f18977e;
        int iB = a1VarArr[0].b(zVar.f1689a);
        for (int i10 = 0; i10 < length; i10++) {
            xVarArr[i10] = b0VarArr[i10].createPeriod(zVar.b(a1VarArr[i10].l(iB)), bVar, j - this.f18981i[iB][i10]);
        }
        return new j0(this.f18979g, this.f18981i[iB], xVarArr);
    }

    @Override // o5.j
    public final void d(Object obj, a aVar, androidx.media3.common.a1 a1Var) {
        Integer num = (Integer) obj;
        if (this.j != null) {
            return;
        }
        if (this.f18980h == -1) {
            this.f18980h = a1Var.h();
        } else if (a1Var.h() != this.f18980h) {
            this.j = new androidx.datastore.preferences.protobuf.m();
            return;
        }
        int length = this.f18981i.length;
        androidx.media3.common.a1[] a1VarArr = this.f18977e;
        if (length == 0) {
            this.f18981i = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f18980h, a1VarArr.length);
        }
        ArrayList arrayList = this.f18978f;
        arrayList.remove(aVar);
        a1VarArr[num.intValue()] = a1Var;
        if (arrayList.isEmpty()) {
            refreshSourceInfo(a1VarArr[0]);
        }
    }

    @Override // o5.b0
    public final androidx.media3.common.e0 getMediaItem() {
        b0[] b0VarArr = this.f18976d;
        return b0VarArr.length > 0 ? b0VarArr[0].getMediaItem() : k;
    }

    @Override // o5.j, o5.b0
    public final void maybeThrowSourceInfoRefreshError() throws androidx.datastore.preferences.protobuf.m {
        androidx.datastore.preferences.protobuf.m mVar = this.j;
        if (mVar != null) {
            throw mVar;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // o5.a
    public final void prepareSourceInternal(b5.b0 b0Var) {
        this.f18968c = b0Var;
        this.f18967b = a5.d0.k(null);
        int i10 = 0;
        while (true) {
            b0[] b0VarArr = this.f18976d;
            if (i10 >= b0VarArr.length) {
                return;
            }
            e(Integer.valueOf(i10), b0VarArr[i10]);
            i10++;
        }
    }

    @Override // o5.b0
    public final void releasePeriod(x xVar) {
        j0 j0Var = (j0) xVar;
        int i10 = 0;
        while (true) {
            b0[] b0VarArr = this.f18976d;
            if (i10 >= b0VarArr.length) {
                return;
            }
            b0 b0Var = b0VarArr[i10];
            x xVar2 = j0Var.f18969a[i10];
            if (xVar2 instanceof h0) {
                xVar2 = ((h0) xVar2).f18953a;
            }
            b0Var.releasePeriod(xVar2);
            i10++;
        }
    }

    @Override // o5.j, o5.a
    public final void releaseSourceInternal() {
        super.releaseSourceInternal();
        Arrays.fill(this.f18977e, (Object) null);
        this.f18980h = -1;
        this.j = null;
        ArrayList arrayList = this.f18978f;
        arrayList.clear();
        Collections.addAll(arrayList, this.f18976d);
    }
}
