package com.bytedance.adsdk.emc.ypw.bw;

import com.bytedance.adsdk.emc.ypw.dg.dg;
import com.bytedance.adsdk.emc.ypw.dg.xq;
import com.bytedance.adsdk.emc.ypw.ypw.emc.aa;
import com.bytedance.adsdk.emc.ypw.ypw.emc.bw;
import com.bytedance.adsdk.emc.ypw.ypw.emc.gbl;
import com.bytedance.adsdk.emc.ypw.ypw.emc.msw;
import com.bytedance.adsdk.emc.ypw.ypw.emc.qh;
import com.bytedance.adsdk.emc.ypw.ypw.emc.sba;
import com.bytedance.adsdk.emc.ypw.ypw.emc.sup;
import com.bytedance.adsdk.emc.ypw.ypw.emc.sz;
import com.bytedance.adsdk.emc.ypw.ypw.emc.ycc;
import com.bytedance.adsdk.emc.ypw.ypw.emc.yzg;
import com.bytedance.adsdk.emc.ypw.ypw.emc.zz;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class ypw {

    /* renamed from: com.bytedance.adsdk.emc.ypw.bw.ypw$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] emc;

        static {
            int[] iArr = new int[xq.values().length];
            emc = iArr;
            try {
                iArr[xq.MINUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                emc[xq.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                emc[xq.DIVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                emc[xq.MULTI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                emc[xq.MOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                emc[xq.EQ.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                emc[xq.NOT_EQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                emc[xq.GT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                emc[xq.LT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                emc[xq.GT_EQ.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                emc[xq.LT_EQ.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                emc[xq.DOUBLE_AMP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                emc[xq.DOUBLE_BAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public static com.bytedance.adsdk.emc.ypw.ypw.emc emc(List<com.bytedance.adsdk.emc.ypw.ypw.emc> list, String str, int i) {
        xq(list, str, i);
        Deque<com.bytedance.adsdk.emc.ypw.ypw.emc> dequeEmc = emc(ypw(list, str, i));
        if (dequeEmc.size() == 1) {
            return dequeEmc.getFirst();
        }
        throw new IllegalStateException();
    }

    private static void xq(List<com.bytedance.adsdk.emc.ypw.ypw.emc> list, String str, int i) {
        Iterator<com.bytedance.adsdk.emc.ypw.ypw.emc> it = list.iterator();
        while (it.hasNext()) {
            if (dg.emc(it.next().emc())) {
                throw new IllegalArgumentException(str.substring(0, i));
            }
        }
    }

    private static Deque<com.bytedance.adsdk.emc.ypw.ypw.emc> ypw(List<com.bytedance.adsdk.emc.ypw.ypw.emc> list, String str, int i) {
        LinkedList<com.bytedance.adsdk.emc.ypw.ypw.emc> linkedList = new LinkedList(list);
        int i3 = 5;
        while (i3 > 0) {
            LinkedList linkedList2 = new LinkedList();
            for (com.bytedance.adsdk.emc.ypw.ypw.emc emcVar : linkedList) {
                if (!linkedList2.isEmpty() && xq.emc(((com.bytedance.adsdk.emc.ypw.ypw.emc) linkedList2.peekLast()).emc()) && ((xq) ((com.bytedance.adsdk.emc.ypw.ypw.emc) linkedList2.peekLast()).emc()).ypw() == i3) {
                    com.bytedance.adsdk.emc.ypw.ypw.emc emcVar2 = (com.bytedance.adsdk.emc.ypw.ypw.emc) linkedList2.pollLast();
                    com.bytedance.adsdk.emc.ypw.ypw.emc emcVar3 = (com.bytedance.adsdk.emc.ypw.ypw.emc) linkedList2.pollLast();
                    if (xq.emc(emcVar3.emc()) || xq.emc(emcVar.emc())) {
                        throw new IllegalArgumentException(str.substring(0, i));
                    }
                    linkedList2.addLast(emc(emcVar3, emcVar2, emcVar));
                } else {
                    linkedList2.addLast(emcVar);
                }
            }
            i3--;
            linkedList = linkedList2;
        }
        return linkedList;
    }

    private static Deque<com.bytedance.adsdk.emc.ypw.ypw.emc> emc(Deque<com.bytedance.adsdk.emc.ypw.ypw.emc> deque) {
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.adsdk.emc.ypw.ypw.emc emcVar : deque) {
            if (!linkedList.isEmpty() && ((com.bytedance.adsdk.emc.ypw.ypw.emc) linkedList.peekLast()).emc() == xq.COLON) {
                linkedList.pollLast();
                com.bytedance.adsdk.emc.ypw.ypw.emc emcVar2 = (com.bytedance.adsdk.emc.ypw.ypw.emc) linkedList.pollLast();
                if (((com.bytedance.adsdk.emc.ypw.ypw.emc) linkedList.pollLast()).emc() == xq.QUESTION) {
                    com.bytedance.adsdk.emc.ypw.ypw.emc emcVar3 = (com.bytedance.adsdk.emc.ypw.ypw.emc) linkedList.pollLast();
                    yzg yzgVar = new yzg();
                    yzgVar.emc(emcVar3);
                    yzgVar.ypw(emcVar2);
                    yzgVar.xq(emcVar);
                    linkedList.addLast(yzgVar);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                linkedList.addLast(emcVar);
            }
        }
        return linkedList;
    }

    private static com.bytedance.adsdk.emc.ypw.ypw.emc emc(com.bytedance.adsdk.emc.ypw.ypw.emc emcVar, com.bytedance.adsdk.emc.ypw.ypw.emc emcVar2, com.bytedance.adsdk.emc.ypw.ypw.emc emcVar3) {
        aa gblVar;
        switch (AnonymousClass1.emc[((xq) emcVar2.emc()).ordinal()]) {
            case 1:
                gblVar = new gbl();
                break;
            case 2:
                gblVar = new sba();
                break;
            case 3:
                gblVar = new com.bytedance.adsdk.emc.ypw.ypw.emc.emc();
                break;
            case 4:
                gblVar = new sz();
                break;
            case 5:
                gblVar = new sup();
                break;
            case 6:
                gblVar = new com.bytedance.adsdk.emc.ypw.ypw.emc.dg();
                break;
            case 7:
                gblVar = new qh();
                break;
            case 8:
                gblVar = new ycc();
                break;
            case 9:
                gblVar = new zz();
                break;
            case 10:
                gblVar = new bw();
                break;
            case 11:
                gblVar = new msw();
                break;
            case 12:
                gblVar = new com.bytedance.adsdk.emc.ypw.ypw.emc.ypw();
                break;
            case 13:
                gblVar = new com.bytedance.adsdk.emc.ypw.ypw.emc.xq();
                break;
            default:
                throw new UnsupportedOperationException(emcVar2.emc().toString());
        }
        gblVar.emc(emcVar);
        gblVar.ypw(emcVar3);
        return gblVar;
    }

    public static boolean emc(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
            return !(obj instanceof Number) || ((Number) obj).floatValue() >= 0.0f;
        }
        return false;
    }
}
