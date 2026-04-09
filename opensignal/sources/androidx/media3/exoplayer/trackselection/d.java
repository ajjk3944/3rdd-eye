package androidx.media3.exoplayer.trackselection;

import com.google.android.exoplayer2.Format;
import io.sentry.i1;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import lf.f0;
import lf.q1;
import n0.m0;
import oe.t0;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1882a;

    public /* synthetic */ d(int i10) {
        this.f1882a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        switch (this.f1882a) {
            case 0:
                i10 = ((androidx.media3.common.r) obj2).D;
                i11 = ((androidx.media3.common.r) obj).D;
                break;
            case 1:
                return DefaultTrackSelector.lambda$static$0((Integer) obj, (Integer) obj2);
            case 2:
                return DefaultTrackSelector.lambda$static$1((Integer) obj, (Integer) obj2);
            case 3:
                return ((i) Collections.max((List) obj)).compareTo((i) Collections.max((List) obj2));
            case 4:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i12 = 7;
                return oe.y.f(t.c((t) Collections.max(list, new d(6)), (t) Collections.max(list2, new d(6)))).a(list.size(), list2.size()).b((t) Collections.max(list, new d(i12)), (t) Collections.max(list2, new d(i12)), new d(i12)).e();
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return ((q) ((List) obj).get(0)).compareTo((q) ((List) obj2).get(0));
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return t.c((t) obj, (t) obj2);
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                t tVar = (t) obj;
                t tVar2 = (t) obj2;
                boolean z10 = tVar.f1924x;
                int i13 = tVar.E;
                t0 t0VarB = (z10 && tVar.D) ? DefaultTrackSelector.FORMAT_VALUE_ORDERING : DefaultTrackSelector.FORMAT_VALUE_ORDERING.b();
                return oe.a0.f19295a.b(Integer.valueOf(i13), Integer.valueOf(tVar2.E), tVar.f1925y.S ? DefaultTrackSelector.FORMAT_VALUE_ORDERING.b() : DefaultTrackSelector.NO_ORDER).b(Integer.valueOf(tVar.F), Integer.valueOf(tVar2.F), t0VarB).b(Integer.valueOf(i13), Integer.valueOf(tVar2.E), t0VarB).e();
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                cb.b bVar = (cb.b) obj;
                cb.b bVar2 = (cb.b) obj2;
                int iCompare = Integer.compare(bVar.f3532c, bVar2.f3532c);
                return iCompare != 0 ? iCompare : bVar.f3531b.compareTo(bVar2.f3531b);
            case 9:
                com.google.android.exoplayer2.ui.u uVar = (com.google.android.exoplayer2.ui.u) obj;
                com.google.android.exoplayer2.ui.u uVar2 = (com.google.android.exoplayer2.ui.u) obj2;
                int iCompare2 = Integer.compare(uVar2.f4701b, uVar.f4701b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo = uVar.f4702c.compareTo(uVar2.f4702c);
                return iCompareTo != 0 ? iCompareTo : uVar.f4703d.compareTo(uVar2.f4703d);
            case 10:
                com.google.android.exoplayer2.ui.u uVar3 = (com.google.android.exoplayer2.ui.u) obj;
                com.google.android.exoplayer2.ui.u uVar4 = (com.google.android.exoplayer2.ui.u) obj2;
                int iCompare3 = Integer.compare(uVar4.f4700a, uVar3.f4700a);
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                int iCompareTo2 = uVar4.f4702c.compareTo(uVar3.f4702c);
                return iCompareTo2 != 0 ? iCompareTo2 : uVar4.f4703d.compareTo(uVar3.f4703d);
            case 11:
                return Integer.compare(((fb.d) obj2).f8775b, ((fb.d) obj).f8775b);
            case 12:
                h5.b bVar3 = (h5.b) obj;
                h5.b bVar4 = (h5.b) obj2;
                int iCompare4 = Integer.compare(bVar3.f9906c, bVar4.f9906c);
                return iCompare4 != 0 ? iCompare4 : bVar3.f9905b.compareTo(bVar4.f9905b);
            case 13:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 14:
                return ((f0) ((q1) obj)).f15239a.compareTo(((f0) ((q1) obj2)).f15239a);
            case 15:
                lq.l lVar = (lq.l) obj;
                lq.l lVar2 = (lq.l) obj2;
                return (((Number) lVar.f15572d).intValue() - ((Number) lVar.f15571a).intValue()) - (((Number) lVar2.f15572d).intValue() - ((Number) lVar2.f15571a).intValue());
            case 16:
                i1 i1Var = (i1) obj;
                i1 i1Var2 = (i1) obj2;
                if (i1Var == i1Var2) {
                    return 0;
                }
                int iCompareTo3 = i1Var.A().compareTo(i1Var2.A());
                return iCompareTo3 != 0 ? iCompareTo3 : i1Var.t().f12413d.toString().compareTo(i1Var2.t().f12413d.toString());
            case 17:
                return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
            case 18:
                return ((sm.d) obj).f22121d.compareTo(((sm.d) obj2).f22121d);
            case 19:
                return br.l.g(((m0) obj).f17216b, ((m0) obj2).f17216b);
            case 20:
                return Integer.compare(((nb.d) obj).f17465a.f17468b, ((nb.d) obj2).f17465a.f17468b);
            case 21:
                return Long.compare(((nb.c) obj).f17462b, ((nb.c) obj2).f17462b);
            case 22:
                return ((nh.e) obj).f17552a - ((nh.e) obj2).f17552a;
            case 23:
                return Float.compare(((nh.e) obj).f17554c, ((nh.e) obj2).f17554c);
            case 24:
                return Integer.compare(((o6.d) obj2).f19132b, ((o6.d) obj).f19132b);
            case 25:
                i10 = ((Format) obj2).D;
                i11 = ((Format) obj).D;
                break;
            case 26:
                return com.google.android.exoplayer2.trackselection.DefaultTrackSelector.lambda$static$0((Integer) obj, (Integer) obj2);
            case 27:
                return com.google.android.exoplayer2.trackselection.DefaultTrackSelector.lambda$static$1((Integer) obj, (Integer) obj2);
            case 28:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            default:
                String name = ((File) obj).getName();
                int i14 = of.a.f19413f;
                return name.substring(0, i14).compareTo(((File) obj2).getName().substring(0, i14));
        }
        return i10 - i11;
    }
}
