package m0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6532h;
import l0.C6531g;
import l0.C6537m;

/* renamed from: m0.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6713l0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f52928b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f52929a;

    /* renamed from: m0.l0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AbstractC6713l0 b(a aVar, List list, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = m1.f52935a.a();
            }
            return aVar.a(list, f10, f11, i10);
        }

        public static /* synthetic */ AbstractC6713l0 f(a aVar, List list, long j10, float f10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = C6531g.f52335b.b();
            }
            long j11 = j10;
            if ((i11 & 4) != 0) {
                f10 = Float.POSITIVE_INFINITY;
            }
            float f11 = f10;
            if ((i11 & 8) != 0) {
                i10 = m1.f52935a.a();
            }
            return aVar.e(list, j11, f11, i10);
        }

        public static /* synthetic */ AbstractC6713l0 i(a aVar, List list, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = m1.f52935a.a();
            }
            return aVar.g(list, f10, f11, i10);
        }

        public static /* synthetic */ AbstractC6713l0 j(a aVar, Yg.s[] sVarArr, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = m1.f52935a.a();
            }
            return aVar.h(sVarArr, f10, f11, i10);
        }

        public final AbstractC6713l0 a(List list, float f10, float f11, int i10) {
            return c(list, AbstractC6532h.a(f10, 0.0f), AbstractC6532h.a(f11, 0.0f), i10);
        }

        public final AbstractC6713l0 c(List list, long j10, long j11, int i10) {
            return new N0(list, null, j10, j11, i10, null);
        }

        public final AbstractC6713l0 d(Yg.s[] sVarArr, long j10, long j11, int i10) {
            ArrayList arrayList = new ArrayList(sVarArr.length);
            for (Yg.s sVar : sVarArr) {
                arrayList.add(C6733v0.g(((C6733v0) sVar.j()).u()));
            }
            ArrayList arrayList2 = new ArrayList(sVarArr.length);
            for (Yg.s sVar2 : sVarArr) {
                arrayList2.add(Float.valueOf(((Number) sVar2.h()).floatValue()));
            }
            return new N0(arrayList, arrayList2, j10, j11, i10, null);
        }

        public final AbstractC6713l0 e(List list, long j10, float f10, int i10) {
            return new a1(list, null, j10, f10, i10, null);
        }

        public final AbstractC6713l0 g(List list, float f10, float f11, int i10) {
            return c(list, AbstractC6532h.a(0.0f, f10), AbstractC6532h.a(0.0f, f11), i10);
        }

        public final AbstractC6713l0 h(Yg.s[] sVarArr, float f10, float f11, int i10) {
            return d((Yg.s[]) Arrays.copyOf(sVarArr, sVarArr.length), AbstractC6532h.a(0.0f, f10), AbstractC6532h.a(0.0f, f11), i10);
        }

        private a() {
        }
    }

    public /* synthetic */ AbstractC6713l0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void a(long j10, S0 s02, float f10);

    private AbstractC6713l0() {
        this.f52929a = C6537m.f52356b.a();
    }
}
