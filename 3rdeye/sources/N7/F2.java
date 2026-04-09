package N7;

import java.util.Iterator;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivAppearanceTransition.kt */
/* loaded from: classes.dex */
public abstract class F2 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public Integer f5161a;

    /* compiled from: DivAppearanceTransition.kt */
    public static final class a extends F2 {

        /* renamed from: b, reason: collision with root package name */
        public final C4 f5162b;

        public a(C4 c42) {
            this.f5162b = c42;
        }
    }

    /* compiled from: DivAppearanceTransition.kt */
    public static final class b extends F2 {

        /* renamed from: b, reason: collision with root package name */
        public final Z8 f5163b;

        public b(Z8 z82) {
            this.f5163b = z82;
        }
    }

    /* compiled from: DivAppearanceTransition.kt */
    public static final class c extends F2 {

        /* renamed from: b, reason: collision with root package name */
        public final C2 f5164b;

        public c(C2 c22) {
            this.f5164b = c22;
        }
    }

    /* compiled from: DivAppearanceTransition.kt */
    public static final class d extends F2 {

        /* renamed from: b, reason: collision with root package name */
        public final I9 f5165b;

        public d(I9 i92) {
            this.f5165b = i92;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01b8 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(N7.F2 r9, A7.d r10, A7.d r11) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N7.F2.a(N7.F2, A7.d, A7.d):boolean");
    }

    public final int b() {
        int iIntValue;
        int iHashCode;
        int iHashCode2;
        Integer num = this.f5161a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode3 = kotlin.jvm.internal.x.a(getClass()).hashCode();
        if (this instanceof c) {
            C2 c22 = ((c) this).f5164b;
            Integer num2 = c22.f5012c;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                Integer num3 = c22.f5011b;
                if (num3 != null) {
                    iHashCode2 = num3.intValue();
                } else {
                    iHashCode2 = kotlin.jvm.internal.x.a(C2.class).hashCode();
                    c22.f5011b = Integer.valueOf(iHashCode2);
                }
                Iterator<T> it = c22.f5010a.iterator();
                while (it.hasNext()) {
                    iB += ((F2) it.next()).b();
                }
                iHashCode = iB + iHashCode2;
                c22.f5012c = Integer.valueOf(iHashCode);
                iIntValue = iHashCode;
            }
        } else if (this instanceof a) {
            iIntValue = ((a) this).f5162b.b();
        } else if (this instanceof b) {
            Z8 z82 = ((b) this).f5163b;
            Integer num4 = z82.f7870g;
            if (num4 != null) {
                iIntValue = num4.intValue();
            } else {
                iHashCode = z82.f7869f.hashCode() + z82.f7868e.hashCode() + z82.f7867d.hashCode() + z82.f7866c.hashCode() + z82.f7865b.hashCode() + z82.f7864a.hashCode() + kotlin.jvm.internal.x.a(Z8.class).hashCode();
                z82.f7870g = Integer.valueOf(iHashCode);
                iIntValue = iHashCode;
            }
        } else {
            if (!(this instanceof d)) {
                throw new b9.j();
            }
            I9 i92 = ((d) this).f5165b;
            Integer num5 = i92.f5486f;
            if (num5 != null) {
                iIntValue = num5.intValue();
            } else {
                int iHashCode4 = kotlin.jvm.internal.x.a(I9.class).hashCode();
                C1134d4 c1134d4 = i92.f5481a;
                int iHashCode5 = i92.f5485e.hashCode() + i92.f5484d.hashCode() + i92.f5483c.hashCode() + i92.f5482b.hashCode() + iHashCode4 + (c1134d4 != null ? c1134d4.b() : 0);
                i92.f5486f = Integer.valueOf(iHashCode5);
                iIntValue = iHashCode5;
            }
        }
        int i = iHashCode3 + iIntValue;
        this.f5161a = Integer.valueOf(i);
        return i;
    }

    public final Object c() {
        if (this instanceof c) {
            return ((c) this).f5164b;
        }
        if (this instanceof a) {
            return ((a) this).f5162b;
        }
        if (this instanceof b) {
            return ((b) this).f5163b;
        }
        if (this instanceof d) {
            return ((d) this).f5165b;
        }
        throw new b9.j();
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((G2) D7.a.f1071b.f6927w1.getValue()).b(D7.a.f1070a, this);
    }
}
