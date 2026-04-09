package Qb;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public abstract class d {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19279a;

        static {
            int[] iArr = new int[S8.d.values().length];
            try {
                iArr[S8.d.MHZ_20.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[S8.d.MHZ_40.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[S8.d.MHZ_80.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[S8.d.MHZ_160.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[S8.d.MHZ_80_80.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[S8.d.MHZ_320.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f19279a = iArr;
        }
    }

    public static final S8.d a(String id2) {
        AbstractC6492s.i(id2, "id");
        int iHashCode = id2.hashCode();
        if (iHashCode != 1598) {
            if (iHashCode != 1660) {
                if (iHashCode != 1784) {
                    if (iHashCode != 48811) {
                        if (iHashCode != 50609) {
                            if (iHashCode == 53240223 && id2.equals("80_80")) {
                                return S8.d.MHZ_80_80;
                            }
                        } else if (id2.equals("320")) {
                            return S8.d.MHZ_320;
                        }
                    } else if (id2.equals("160")) {
                        return S8.d.MHZ_160;
                    }
                } else if (id2.equals("80")) {
                    return S8.d.MHZ_80;
                }
            } else if (id2.equals("40")) {
                return S8.d.MHZ_40;
            }
        } else if (id2.equals("20")) {
            return S8.d.MHZ_20;
        }
        throw new IllegalStateException("unexpected channel width `" + id2 + "`");
    }

    public static final String b(S8.d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        switch (a.f19279a[dVar.ordinal()]) {
            case 1:
                return "20";
            case 2:
                return "40";
            case 3:
                return "80";
            case 4:
                return "160";
            case 5:
                return "80_80";
            case 6:
                return "320";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
