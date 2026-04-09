package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1746y;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* compiled from: SchemaUtil.java */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f15599a;

    /* renamed from: b, reason: collision with root package name */
    public static final k0<?, ?> f15600b;

    /* renamed from: c, reason: collision with root package name */
    public static final k0<?, ?> f15601c;

    /* renamed from: d, reason: collision with root package name */
    public static final m0 f15602d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f15599a = cls;
        f15600b = x(false);
        f15601c = x(true);
        f15602d = new m0();
    }

    public static <UT, UB> UB A(int i, int i10, UB ub, k0<UT, UB> k0Var) {
        if (ub == null) {
            ub = (UB) k0Var.m();
        }
        k0Var.e(ub, i, i10);
        return ub;
    }

    public static void B(int i, List<Boolean> list, t0 t0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1733k abstractC1733k = ((C1734l) t0Var).f15660a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                abstractC1733k.p(i, list.get(i10).booleanValue());
                i10++;
            }
            return;
        }
        abstractC1733k.F(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            list.get(i12).getClass();
            Logger logger = AbstractC1733k.f15650b;
            i11++;
        }
        abstractC1733k.H(i11);
        while (i10 < list.size()) {
            abstractC1733k.o(list.get(i10).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public static void C(int i, List<AbstractC1730h> list, t0 t0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1734l c1734l = (C1734l) t0Var;
        c1734l.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            c1734l.f15660a.r(i, list.get(i10));
        }
    }

    public static void D(int i, List<Double> list, t0 t0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1733k abstractC1733k = ((C1734l) t0Var).f15660a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                double dDoubleValue = list.get(i10).doubleValue();
                abstractC1733k.getClass();
                abstractC1733k.v(i, Double.doubleToRawLongBits(dDoubleValue));
                i10++;
            }
            return;
        }
        abstractC1733k.F(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            list.get(i12).getClass();
            Logger logger = AbstractC1733k.f15650b;
            i11 += 8;
        }
        abstractC1733k.H(i11);
        while (i10 < list.size()) {
            abstractC1733k.w(Double.doubleToRawLongBits(list.get(i10).doubleValue()));
            i10++;
        }
    }

    public static void E(int i, List<Integer> list, t0 t0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1733k abstractC1733k = ((C1734l) t0Var).f15660a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                abstractC1733k.x(i, list.get(i10).intValue());
                i10++;
            }
            return;
        }
        abstractC1733k.F(i, 2);
        int iG = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iG += AbstractC1733k.g(list.get(i11).intValue());
        }
        abstractC1733k.H(iG);
        while (i10 < list.size()) {
            abstractC1733k.y(list.get(i10).intValue());
            i10++;
        }
    }

    public static void F(int i, List<Integer> list, t0 t0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1733k abstractC1733k = ((C1734l) t0Var).f15660a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                abstractC1733k.t(i, list.get(i10).intValue());
                i10++;
            }
            return;
        }
        abstractC1733k.F(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            list.get(i12).getClass();
            Logger logger = AbstractC1733k.f15650b;
            i11 += 4;
        }
        abstractC1733k.H(i11);
        while (i10 < list.size()) {
            abstractC1733k.u(list.get(i10).intValue());
            i10++;
        }
    }

    public static void G(int i, List<Long> list, t0 t0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1733k abstractC1733k = ((C1734l) t0Var).f15660a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                abstractC1733k.v(i, list.get(i10).longValue());
                i10++;
            }
            return;
        }
        abstractC1733k.F(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            list.get(i12).getClass();
            Logger logger = AbstractC1733k.f15650b;
            i11 += 8;
        }
        abstractC1733k.H(i11);
        while (i10 < list.size()) {
            abstractC1733k.w(list.get(i10).longValue());
            i10++;
        }
    }

    public static void H(int i, List<Float> list, t0 t0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1733k abstractC1733k = ((C1734l) t0Var).f15660a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                float fFloatValue = list.get(i10).floatValue();
                abstractC1733k.getClass();
                abstractC1733k.t(i, Float.floatToRawIntBits(fFloatValue));
                i10++;
            }
            return;
        }
        abstractC1733k.F(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            list.get(i12).getClass();
            Logger logger = AbstractC1733k.f15650b;
            i11 += 4;
        }
        abstractC1733k.H(i11);
        while (i10 < list.size()) {
            abstractC1733k.u(Float.floatToRawIntBits(list.get(i10).floatValue()));
            i10++;
        }
    }

    public static void I(int i, List<?> list, t0 t0Var, f0 f0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1734l c1734l = (C1734l) t0Var;
        c1734l.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            c1734l.h(i, list.get(i10), f0Var);
        }
    }

    public static void J(int i, List<Integer> list, t0 t0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1733k abstractC1733k = ((C1734l) t0Var).f15660a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                abstractC1733k.x(i, list.get(i10).intValue());
                i10++;
            }
            return;
        }
        abstractC1733k.F(i, 2);
        int iG = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iG += AbstractC1733k.g(list.get(i11).intValue());
        }
        abstractC1733k.H(iG);
        while (i10 < list.size()) {
            abstractC1733k.y(list.get(i10).intValue());
            i10++;
        }
    }

    public static void K(int i, List<Long> list, t0 t0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1733k abstractC1733k = ((C1734l) t0Var).f15660a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                abstractC1733k.I(i, list.get(i10).longValue());
                i10++;
            }
            return;
        }
        abstractC1733k.F(i, 2);
        int iM = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iM += AbstractC1733k.m(list.get(i11).longValue());
        }
        abstractC1733k.H(iM);
        while (i10 < list.size()) {
            abstractC1733k.J(list.get(i10).longValue());
            i10++;
        }
    }

    public static void L(int i, List<?> list, t0 t0Var, f0 f0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1734l c1734l = (C1734l) t0Var;
        c1734l.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            c1734l.k(i, list.get(i10), f0Var);
        }
    }

    public static void M(int i, List<Integer> list, t0 t0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1733k abstractC1733k = ((C1734l) t0Var).f15660a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                abstractC1733k.t(i, list.get(i10).intValue());
                i10++;
            }
            return;
        }
        abstractC1733k.F(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            list.get(i12).getClass();
            Logger logger = AbstractC1733k.f15650b;
            i11 += 4;
        }
        abstractC1733k.H(i11);
        while (i10 < list.size()) {
            abstractC1733k.u(list.get(i10).intValue());
            i10++;
        }
    }

    public static void N(int i, List<Long> list, t0 t0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1733k abstractC1733k = ((C1734l) t0Var).f15660a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                abstractC1733k.v(i, list.get(i10).longValue());
                i10++;
            }
            return;
        }
        abstractC1733k.F(i, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            list.get(i12).getClass();
            Logger logger = AbstractC1733k.f15650b;
            i11 += 8;
        }
        abstractC1733k.H(i11);
        while (i10 < list.size()) {
            abstractC1733k.w(list.get(i10).longValue());
            i10++;
        }
    }

    public static void O(int i, List<Integer> list, t0 t0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1733k abstractC1733k = ((C1734l) t0Var).f15660a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                int iIntValue = list.get(i10).intValue();
                abstractC1733k.G(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i10++;
            }
            return;
        }
        abstractC1733k.F(i, 2);
        int iL = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int iIntValue2 = list.get(i11).intValue();
            iL += AbstractC1733k.l((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        abstractC1733k.H(iL);
        while (i10 < list.size()) {
            int iIntValue3 = list.get(i10).intValue();
            abstractC1733k.H((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i10++;
        }
    }

    public static void P(int i, List<Long> list, t0 t0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1733k abstractC1733k = ((C1734l) t0Var).f15660a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                long jLongValue = list.get(i10).longValue();
                abstractC1733k.I(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i10++;
            }
            return;
        }
        abstractC1733k.F(i, 2);
        int iM = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            long jLongValue2 = list.get(i11).longValue();
            iM += AbstractC1733k.m((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        abstractC1733k.H(iM);
        while (i10 < list.size()) {
            long jLongValue3 = list.get(i10).longValue();
            abstractC1733k.J((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i10++;
        }
    }

    public static void Q(int i, List<String> list, t0 t0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1734l c1734l = (C1734l) t0Var;
        c1734l.getClass();
        boolean z10 = list instanceof E;
        AbstractC1733k abstractC1733k = c1734l.f15660a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                abstractC1733k.D(i, list.get(i10));
                i10++;
            }
            return;
        }
        E e4 = (E) list;
        while (i10 < list.size()) {
            Object raw = e4.getRaw(i10);
            if (raw instanceof String) {
                abstractC1733k.D(i, (String) raw);
            } else {
                abstractC1733k.r(i, (AbstractC1730h) raw);
            }
            i10++;
        }
    }

    public static void R(int i, List<Integer> list, t0 t0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1733k abstractC1733k = ((C1734l) t0Var).f15660a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                abstractC1733k.G(i, list.get(i10).intValue());
                i10++;
            }
            return;
        }
        abstractC1733k.F(i, 2);
        int iL = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iL += AbstractC1733k.l(list.get(i11).intValue());
        }
        abstractC1733k.H(iL);
        while (i10 < list.size()) {
            abstractC1733k.H(list.get(i10).intValue());
            i10++;
        }
    }

    public static void S(int i, List<Long> list, t0 t0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1733k abstractC1733k = ((C1734l) t0Var).f15660a;
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                abstractC1733k.I(i, list.get(i10).longValue());
                i10++;
            }
            return;
        }
        abstractC1733k.F(i, 2);
        int iM = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iM += AbstractC1733k.m(list.get(i11).longValue());
        }
        abstractC1733k.H(iM);
        while (i10 < list.size()) {
            abstractC1733k.J(list.get(i10).longValue());
            i10++;
        }
    }

    public static int a(int i, List<AbstractC1730h> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = AbstractC1733k.j(i) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iJ += AbstractC1733k.c(list.get(i10));
        }
        return iJ;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC1733k.j(i) * size) + c(list);
    }

    public static int c(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1745x)) {
            int iG = 0;
            while (i < size) {
                iG += AbstractC1733k.g(list.get(i).intValue());
                i++;
            }
            return iG;
        }
        C1745x c1745x = (C1745x) list;
        int iG2 = 0;
        while (i < size) {
            c1745x.c(i);
            iG2 += AbstractC1733k.g(c1745x.f15705c[i]);
            i++;
        }
        return iG2;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC1733k.d(i) * size;
    }

    public static int e(List<?> list) {
        return list.size() * 4;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC1733k.e(i) * size;
    }

    public static int g(List<?> list) {
        return list.size() * 8;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC1733k.j(i) * size) + i(list);
    }

    public static int i(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1745x)) {
            int iG = 0;
            while (i < size) {
                iG += AbstractC1733k.g(list.get(i).intValue());
                i++;
            }
            return iG;
        }
        C1745x c1745x = (C1745x) list;
        int iG2 = 0;
        while (i < size) {
            c1745x.c(i);
            iG2 += AbstractC1733k.g(c1745x.f15705c[i]);
            i++;
        }
        return iG2;
    }

    public static int j(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (AbstractC1733k.j(i) * list.size()) + k(list);
    }

    public static int k(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof G)) {
            int iM = 0;
            while (i < size) {
                iM += AbstractC1733k.m(list.get(i).longValue());
                i++;
            }
            return iM;
        }
        G g10 = (G) list;
        int iM2 = 0;
        while (i < size) {
            g10.c(i);
            iM2 += AbstractC1733k.m(g10.f15545c[i]);
            i++;
        }
        return iM2;
    }

    public static int l(int i, Object obj, f0 f0Var) {
        if (obj instanceof C) {
            return AbstractC1733k.h((C) obj) + AbstractC1733k.j(i);
        }
        int iJ = AbstractC1733k.j(i);
        int iD = ((AbstractC1723a) ((P) obj)).d(f0Var);
        return AbstractC1733k.l(iD) + iD + iJ;
    }

    public static int m(int i, List<?> list, f0 f0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = AbstractC1733k.j(i) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof C) {
                iJ = AbstractC1733k.h((C) obj) + iJ;
            } else {
                int iD = ((AbstractC1723a) ((P) obj)).d(f0Var);
                iJ = AbstractC1733k.l(iD) + iD + iJ;
            }
        }
        return iJ;
    }

    public static int n(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC1733k.j(i) * size) + o(list);
    }

    public static int o(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1745x)) {
            int iL = 0;
            while (i < size) {
                int iIntValue = list.get(i).intValue();
                iL += AbstractC1733k.l((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
            return iL;
        }
        C1745x c1745x = (C1745x) list;
        int iL2 = 0;
        while (i < size) {
            c1745x.c(i);
            int i10 = c1745x.f15705c[i];
            iL2 += AbstractC1733k.l((i10 >> 31) ^ (i10 << 1));
            i++;
        }
        return iL2;
    }

    public static int p(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC1733k.j(i) * size) + q(list);
    }

    public static int q(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof G)) {
            int iM = 0;
            while (i < size) {
                long jLongValue = list.get(i).longValue();
                iM += AbstractC1733k.m((jLongValue >> 63) ^ (jLongValue << 1));
                i++;
            }
            return iM;
        }
        G g10 = (G) list;
        int iM2 = 0;
        while (i < size) {
            g10.c(i);
            long j4 = g10.f15545c[i];
            iM2 += AbstractC1733k.m((j4 >> 63) ^ (j4 << 1));
            i++;
        }
        return iM2;
    }

    public static int r(int i, List<?> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int iJ = AbstractC1733k.j(i) * size;
        if (!(list instanceof E)) {
            while (i10 < size) {
                Object obj = list.get(i10);
                iJ = (obj instanceof AbstractC1730h ? AbstractC1733k.c((AbstractC1730h) obj) : AbstractC1733k.i((String) obj)) + iJ;
                i10++;
            }
            return iJ;
        }
        E e4 = (E) list;
        while (i10 < size) {
            Object raw = e4.getRaw(i10);
            iJ = (raw instanceof AbstractC1730h ? AbstractC1733k.c((AbstractC1730h) raw) : AbstractC1733k.i((String) raw)) + iJ;
            i10++;
        }
        return iJ;
    }

    public static int s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC1733k.j(i) * size) + t(list);
    }

    public static int t(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1745x)) {
            int iL = 0;
            while (i < size) {
                iL += AbstractC1733k.l(list.get(i).intValue());
                i++;
            }
            return iL;
        }
        C1745x c1745x = (C1745x) list;
        int iL2 = 0;
        while (i < size) {
            c1745x.c(i);
            iL2 += AbstractC1733k.l(c1745x.f15705c[i]);
            i++;
        }
        return iL2;
    }

    public static int u(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC1733k.j(i) * size) + v(list);
    }

    public static int v(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof G)) {
            int iM = 0;
            while (i < size) {
                iM += AbstractC1733k.m(list.get(i).longValue());
                i++;
            }
            return iM;
        }
        G g10 = (G) list;
        int iM2 = 0;
        while (i < size) {
            g10.c(i);
            iM2 += AbstractC1733k.m(g10.f15545c[i]);
            i++;
        }
        return iM2;
    }

    public static <UT, UB> UB w(int i, List<Integer> list, C1746y.b bVar, UB ub, k0<UT, UB> k0Var) {
        if (bVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!bVar.a()) {
                    ub = (UB) A(i, iIntValue, ub, k0Var);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Integer num = list.get(i11);
            int iIntValue2 = num.intValue();
            if (bVar.a()) {
                if (i11 != i10) {
                    list.set(i10, num);
                }
                i10++;
            } else {
                ub = (UB) A(i, iIntValue2, ub, k0Var);
            }
        }
        if (i10 != size) {
            list.subList(i10, size).clear();
        }
        return ub;
    }

    public static k0<?, ?> x(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (k0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void y(AbstractC1738p abstractC1738p, AbstractC1744w abstractC1744w, AbstractC1744w abstractC1744w2) {
        C1740s c1740sC = abstractC1738p.c(abstractC1744w2);
        if (c1740sC.f15692a.isEmpty()) {
            return;
        }
        C1740s c1740sD = abstractC1738p.d(abstractC1744w);
        c1740sD.getClass();
        h0 h0Var = c1740sC.f15692a;
        if (h0Var.f15625c.size() > 0) {
            c1740sD.h(h0Var.d(0));
            throw null;
        }
        Iterator<Map.Entry<Object, Object>> it = h0Var.e().iterator();
        if (it.hasNext()) {
            c1740sD.h(it.next());
            throw null;
        }
    }

    public static boolean z(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
