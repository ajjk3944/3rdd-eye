package Qb;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: Qb.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0678a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19276a;

        static {
            int[] iArr = new int[S8.a.values().length];
            try {
                iArr[S8.a.f20354A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[S8.a.f20355B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[S8.a.f20356G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[S8.a.f20357N.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[S8.a.AC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[S8.a.AD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[S8.a.AX.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[S8.a.BE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f19276a = iArr;
        }
    }

    public static final String a(S8.a aVar) {
        AbstractC6492s.i(aVar, "<this>");
        switch (C0678a.f19276a[aVar.ordinal()]) {
            case 1:
                return SnmpConfigurator.O_AUTH_PROTOCOL;
            case 2:
                return SnmpConfigurator.O_BIND_ADDRESS;
            case 3:
                return "g";
            case 4:
                return SnmpConfigurator.O_CONTEXT_NAME;
            case 5:
                return "ac";
            case 6:
                return "ad";
            case 7:
                return "ax";
            case 8:
                return "be";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final S8.a b(String id2) {
        AbstractC6492s.i(id2, "id");
        int iHashCode = id2.hashCode();
        if (iHashCode != 97) {
            if (iHashCode != 98) {
                if (iHashCode != 103) {
                    if (iHashCode != 110) {
                        if (iHashCode != 3127) {
                            if (iHashCode != 3139) {
                                if (iHashCode != 3106) {
                                    if (iHashCode == 3107 && id2.equals("ad")) {
                                        return S8.a.AD;
                                    }
                                } else if (id2.equals("ac")) {
                                    return S8.a.AC;
                                }
                            } else if (id2.equals("be")) {
                                return S8.a.BE;
                            }
                        } else if (id2.equals("ax")) {
                            return S8.a.AX;
                        }
                    } else if (id2.equals(SnmpConfigurator.O_CONTEXT_NAME)) {
                        return S8.a.f20357N;
                    }
                } else if (id2.equals("g")) {
                    return S8.a.f20356G;
                }
            } else if (id2.equals(SnmpConfigurator.O_BIND_ADDRESS)) {
                return S8.a.f20355B;
            }
        } else if (id2.equals(SnmpConfigurator.O_AUTH_PROTOCOL)) {
            return S8.a.f20354A;
        }
        throw new IllegalStateException("unknown ieee mode `" + id2 + "`");
    }
}
