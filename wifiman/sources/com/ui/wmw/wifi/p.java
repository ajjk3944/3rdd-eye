package com.ui.wmw.wifi;

import S8.j;
import Zg.AbstractC3689v;
import Zg.Q;
import Zg.d0;
import com.google.ar.core.ImageFormat;
import com.ui.wmw.wifi.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.AbstractC6507a;
import kotlin.text.t;
import mh.InterfaceC6824a;
import sh.AbstractC7978m;
import sh.C7974i;

/* loaded from: classes4.dex */
public interface p {

    public static final class a {
        public static byte[] c(p pVar, final String receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (!t.P(receiver, "0x", false, 2, null)) {
                Nf.a.c(new InterfaceC6824a() { // from class: Qf.d
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return p.a.d(receiver);
                    }
                }, null, 2, null);
                return null;
            }
            try {
                String strG0 = t.G0(receiver, "0x");
                if (strG0.length() % 2 == 1) {
                    strG0 = "0" + strG0;
                }
                List listS1 = t.s1(strG0, 2);
                ArrayList arrayList = new ArrayList(AbstractC3689v.w(listS1, 10));
                Iterator it = listS1.iterator();
                while (it.hasNext()) {
                    arrayList.add(Byte.valueOf((byte) Integer.parseInt((String) it.next(), AbstractC6507a.a(16))));
                }
                return AbstractC3689v.d1(arrayList);
            } catch (NumberFormatException unused) {
                Nf.a.c(new InterfaceC6824a() { // from class: Qf.e
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return p.a.e(receiver);
                    }
                }, null, 2, null);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String d(String str) {
            return "Can't decode HEX '" + str + "'- Must start with 0x";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String e(String str) {
            return "Can't decode HEX '" + str + "'- Not in hex format";
        }

        public static S8.d f(p pVar, int i10) {
            if (i10 == 0) {
                return S8.d.MHZ_20;
            }
            if (i10 == 1) {
                return S8.d.MHZ_40;
            }
            if (i10 == 2) {
                return S8.d.MHZ_80;
            }
            if (i10 == 3) {
                return S8.d.MHZ_160;
            }
            if (i10 != 4) {
                return null;
            }
            return S8.d.MHZ_80_80;
        }

        public static S8.a g(p pVar, int i10) {
            if (pVar.b(i10, 5)) {
                return S8.a.BE;
            }
            if (pVar.b(i10, 4)) {
                return S8.a.AX;
            }
            if (pVar.b(i10, 3)) {
                return S8.a.AC;
            }
            if (pVar.b(i10, 2)) {
                return S8.a.f20357N;
            }
            if (pVar.b(i10, 1)) {
                return S8.a.f20354A;
            }
            if (pVar.b(i10, 0)) {
                return S8.a.f20356G;
            }
            return null;
        }

        public static Set h(p pVar, int i10) {
            Set setB = d0.b();
            if (i10 == 0) {
                setB.add(j.b.C0730b.f20389a);
            } else {
                Iterator it = AbstractC7978m.s(0, 32).iterator();
                while (it.hasNext()) {
                    int iD = ((Q) it).d();
                    if (pVar.b(i10, iD)) {
                        switch (iD) {
                            case 0:
                                setB.add(j.b.g.a.f20395a);
                                break;
                            case 1:
                                setB.add(j.b.g.C0732b.f20396a);
                                break;
                            case 2:
                                setB.add(j.b.e.f20392a);
                                break;
                            case 3:
                                setB.add(j.b.e.f20392a);
                                break;
                            case 4:
                                setB.add(j.b.g.C0732b.f20396a);
                                break;
                            case 5:
                                setB.add(j.b.g.a.f20395a);
                                break;
                            case 6:
                                setB.add(j.b.g.C0732b.f20396a);
                                break;
                            case 7:
                                setB.add(j.b.h.C0733b.f20398a);
                                break;
                            case 8:
                                setB.add(j.b.g.C0732b.f20396a);
                                break;
                            case 9:
                                setB.add(j.b.i.f20401a);
                                break;
                            case 10:
                                setB.add(j.b.h.d.f20400a);
                                break;
                            case 11:
                                setB.add(j.b.h.d.f20400a);
                                break;
                            case 12:
                                setB.add(j.b.d.f20391a);
                                break;
                            case 13:
                                setB.add(j.b.d.f20391a);
                                break;
                            case 15:
                                setB.add(j.b.c.f20390a);
                                break;
                            case 16:
                                setB.add(j.b.h.C0733b.f20398a);
                                break;
                            case 17:
                                setB.add(j.b.h.C0733b.f20398a);
                                break;
                            case 18:
                                setB.add(j.b.a.f20388a);
                                break;
                            case 19:
                                setB.add(j.b.a.f20388a);
                                break;
                            case 20:
                                setB.add(j.b.a.f20388a);
                                break;
                            case 21:
                                setB.add(j.b.a.f20388a);
                                break;
                            case ImageFormat.RGBA_FP16 /* 22 */:
                                setB.add(j.b.h.c.f20399a);
                                break;
                            case 23:
                                setB.add(j.b.h.a.f20397a);
                                break;
                            case 24:
                                setB.add(j.b.h.C0733b.f20398a);
                                break;
                            case 25:
                                setB.add(j.b.f.a.f20393a);
                                break;
                            case 26:
                                setB.add(j.b.f.C0731b.f20394a);
                                break;
                        }
                    }
                }
            }
            return d0.a(setB);
        }

        public static Set i(p pVar, int i10) {
            C7974i c7974i = new C7974i(0, i10);
            ArrayList arrayList = new ArrayList();
            Iterator it = c7974i.iterator();
            while (it.hasNext()) {
                S8.d dVarA = pVar.a(((Q) it).d());
                if (dVarA != null) {
                    arrayList.add(dVarA);
                }
            }
            return AbstractC3689v.n1(arrayList);
        }

        public static Set j(p pVar, int i10) {
            W7.a aVarD;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = new C7974i(0, 13).iterator();
            while (it.hasNext()) {
                int iD = ((Q) it).d();
                if (pVar.b(i10, iD)) {
                    switch (iD) {
                        case 0:
                            aVarD = W7.a.f23676b.d(1);
                            break;
                        case 1:
                            aVarD = W7.a.f23676b.d(2);
                            break;
                        case 2:
                            aVarD = W7.a.f23676b.c(5.5f);
                            break;
                        case 3:
                            aVarD = W7.a.f23676b.d(11);
                            break;
                        case 4:
                            aVarD = W7.a.f23676b.d(22);
                            break;
                        case 5:
                            aVarD = W7.a.f23676b.d(33);
                            break;
                        case 6:
                            aVarD = W7.a.f23676b.d(6);
                            break;
                        case 7:
                            aVarD = W7.a.f23676b.d(9);
                            break;
                        case 8:
                            aVarD = W7.a.f23676b.d(12);
                            break;
                        case 9:
                            aVarD = W7.a.f23676b.d(18);
                            break;
                        case 10:
                            aVarD = W7.a.f23676b.d(24);
                            break;
                        case 11:
                            aVarD = W7.a.f23676b.d(36);
                            break;
                        case 12:
                            aVarD = W7.a.f23676b.d(48);
                            break;
                        case 13:
                            aVarD = W7.a.f23676b.d(54);
                            break;
                        default:
                            aVarD = null;
                            break;
                    }
                    if (aVarD != null) {
                        linkedHashSet.add(aVarD);
                    }
                }
            }
            return linkedHashSet;
        }

        public static boolean k(p pVar, int i10, int i11) {
            return ((i10 >> i11) & 1) == 1;
        }
    }

    S8.d a(int i10);

    boolean b(int i10, int i11);
}
