package com.bytedance.sdk.component.le.ouw.ouw;

import android.text.TextUtils;
import com.bytedance.sdk.component.le.ouw.pno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends ouw {

    /* renamed from: lh, reason: collision with root package name */
    private final Queue<String> f7550lh;
    private final yu ouw;
    private final lh vt;

    public vt() {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.f7550lh = concurrentLinkedQueue;
        this.ouw = new le(concurrentLinkedQueue);
        this.vt = new lh();
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.yu
    public final synchronized void ouw(com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar, int i4) {
        yu yuVar;
        if (i4 != 5) {
            try {
                if (pno.vt().bly.ouw(pno.vt().ouw) && (yuVar = this.ouw) != null && ouwVar != null) {
                    yuVar.ouw(ouwVar, i4);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        lh lhVar = this.vt;
        if (lhVar != null && ouwVar != null) {
            lhVar.ouw(ouwVar, i4);
        }
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.yu
    public final synchronized void ouw(int i4, List<com.bytedance.sdk.component.le.ouw.yu.ouw> list) {
        try {
            Iterator<com.bytedance.sdk.component.le.ouw.yu.ouw> it = list.iterator();
            while (it.hasNext()) {
                this.f7550lh.remove(it.next().lh());
            }
            yu yuVar = this.ouw;
            if (yuVar != null) {
                yuVar.ouw(i4, list);
            }
            lh lhVar = this.vt;
            if (lhVar != null) {
                lhVar.ouw(i4, list);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.le.ouw.ouw.yu
    public final synchronized List<com.bytedance.sdk.component.le.ouw.yu.ouw> ouw(int i4, int i10, List<String> list) {
        int i11;
        try {
            List<com.bytedance.sdk.component.le.ouw.yu.ouw> listOuw = this.ouw.ouw(i4, i10, list);
            int i12 = 0;
            if (listOuw != 0 && listOuw.size() != 0) {
                listOuw.size();
                com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                if (i4 == 1 || i4 == 2) {
                    lh lhVar = this.vt;
                    com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar = (com.bytedance.sdk.component.le.ouw.yu.ouw) listOuw.get(0);
                    int size = listOuw.size();
                    List<com.bytedance.sdk.component.le.ouw.yu.ouw> listOuw2 = null;
                    if (ouwVar.yu() == 0 && ouwVar.fkw() == 1 && com.bytedance.sdk.component.le.ouw.vt.ouw.ouw()) {
                        int i13 = lhVar.ra.vt;
                        if (i13 > size) {
                            listOuw2 = lhVar.ouw.ouw(i13 - size, "_id");
                            if (listOuw2.size() != 0) {
                                com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
                                com.bytedance.sdk.component.le.ouw.fkw fkwVar = pno.vt().bly;
                            }
                        }
                    } else if (ouwVar.yu() == 3 && ouwVar.fkw() == 2 && com.bytedance.sdk.component.le.ouw.vt.ouw.fkw()) {
                        int i14 = lhVar.bly.vt;
                        if (i14 > size) {
                            listOuw2 = lhVar.f7542lh.ouw(i14 - size, "_id");
                        }
                    } else if (ouwVar.yu() == 0 && ouwVar.fkw() == 2 && com.bytedance.sdk.component.le.ouw.vt.ouw.vt()) {
                        int i15 = lhVar.pno.vt;
                        if (i15 > size) {
                            listOuw2 = lhVar.vt.ouw(i15 - size, "_id");
                            if (listOuw2.size() != 0) {
                                com.bytedance.sdk.component.le.ouw.vt.yu yuVar2 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
                                com.bytedance.sdk.component.le.ouw.fkw fkwVar2 = pno.vt().bly;
                            }
                        }
                    } else if (ouwVar.yu() == 1 && ouwVar.fkw() == 2 && com.bytedance.sdk.component.le.ouw.vt.ouw.lh()) {
                        int i16 = lhVar.tlj.vt;
                        if (i16 > size) {
                            listOuw2 = lhVar.yu.ouw(i16 - size, "_id");
                            if (listOuw2.size() != 0) {
                                com.bytedance.sdk.component.le.ouw.vt.yu yuVar3 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
                                com.bytedance.sdk.component.le.ouw.fkw fkwVar3 = pno.vt().bly;
                            }
                        }
                    } else if (ouwVar.yu() == 1 && ouwVar.fkw() == 3 && com.bytedance.sdk.component.le.ouw.vt.ouw.yu()) {
                        int i17 = lhVar.f7540cf.vt;
                        if (i17 > size) {
                            listOuw2 = lhVar.fkw.ouw(i17 - size, "_id");
                            if (listOuw2.size() != 0) {
                                com.bytedance.sdk.component.le.ouw.vt.yu yuVar4 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
                                com.bytedance.sdk.component.le.ouw.fkw fkwVar4 = pno.vt().bly;
                            }
                        }
                    } else if (ouwVar.yu() == 2 && ouwVar.fkw() == 3 && com.bytedance.sdk.component.le.ouw.vt.ouw.le() && (i11 = lhVar.ryl.vt) > size) {
                        listOuw2 = lhVar.f7541le.ouw(i11 - size, "_id");
                    }
                    if (listOuw2 != null && listOuw2.size() != 0) {
                        listOuw2.size();
                        com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                        HashMap map = new HashMap();
                        for (com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar2 : listOuw2) {
                            map.put(ouwVar2.lh(), ouwVar2);
                        }
                        ArrayList arrayList = new ArrayList(this.f7550lh);
                        for (com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar3 : listOuw2) {
                            int size2 = arrayList.size();
                            int i18 = 0;
                            while (true) {
                                if (i18 < size2) {
                                    Object obj = arrayList.get(i18);
                                    i18++;
                                    if (TextUtils.equals(ouwVar3.lh(), (String) obj)) {
                                        com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                                        map.remove(ouwVar3.lh());
                                        break;
                                    }
                                }
                            }
                        }
                        for (com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar4 : listOuw) {
                            map.put(ouwVar4.lh(), ouwVar4);
                        }
                        listOuw.clear();
                        Iterator it = map.keySet().iterator();
                        while (it.hasNext()) {
                            listOuw.add(map.get((String) it.next()));
                        }
                        listOuw2.clear();
                    }
                }
            } else {
                ArrayList arrayList2 = new ArrayList(this.f7550lh);
                if (list != null && !list.isEmpty()) {
                    arrayList2.addAll(list);
                }
                List<com.bytedance.sdk.component.le.ouw.yu.ouw> listOuw3 = this.vt.ouw(i4, i10, arrayList2);
                if (listOuw3 != 0 && listOuw3.size() != 0) {
                    HashMap map2 = new HashMap();
                    for (com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar5 : listOuw3) {
                        map2.put(ouwVar5.lh(), ouwVar5);
                    }
                    arrayList2.size();
                    com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                    if (arrayList2.size() != 0) {
                        int size3 = arrayList2.size();
                        while (i12 < size3) {
                            Object obj2 = arrayList2.get(i12);
                            i12++;
                            String str = (String) obj2;
                            if (map2.get(str) != null) {
                                com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                                map2.remove(str);
                            }
                        }
                    }
                    listOuw3.clear();
                    Iterator it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        listOuw3.add(map2.get((String) it2.next()));
                    }
                }
                listOuw = listOuw3;
            }
            if (listOuw != 0 && !listOuw.isEmpty()) {
                Iterator it3 = listOuw.iterator();
                while (it3.hasNext()) {
                    this.f7550lh.offer(((com.bytedance.sdk.component.le.ouw.yu.ouw) it3.next()).lh());
                }
                return listOuw;
            }
            return new ArrayList();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.yu
    public final synchronized boolean ouw(int i4, boolean z3) {
        if (this.ouw.ouw(i4, z3)) {
            com.bytedance.sdk.component.le.ouw.lh.vt.vt();
            com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
            com.bytedance.sdk.component.le.ouw.fkw fkwVar = pno.vt().bly;
            return true;
        }
        if ((i4 != 1 && i4 != 2) || !this.vt.ouw(i4, z3)) {
            return false;
        }
        com.bytedance.sdk.component.le.ouw.lh.vt.vt();
        com.bytedance.sdk.component.le.ouw.vt.yu yuVar2 = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
        com.bytedance.sdk.component.le.ouw.fkw fkwVar2 = pno.vt().bly;
        return true;
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.yu
    public final void ouw(int i4, long j) {
        this.vt.ouw(i4, j);
        this.ouw.ouw(i4, j);
    }
}
