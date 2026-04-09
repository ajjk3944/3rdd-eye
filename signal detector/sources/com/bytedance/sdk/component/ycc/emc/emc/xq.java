package com.bytedance.sdk.component.ycc.emc.emc;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.ycc.emc.emc.emc.emc.uym;
import com.bytedance.sdk.component.ycc.emc.msw;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class xq implements dg {
    private com.bytedance.sdk.component.ycc.emc.emc.emc.emc.ycc bw;
    private uym dg;
    private com.bytedance.sdk.component.ycc.emc.emc.emc.emc.dg emc;
    private com.bytedance.sdk.component.ycc.emc.dg.ypw.emc gbl;
    private com.bytedance.sdk.component.ycc.emc.dg.ypw.emc msw;
    private com.bytedance.sdk.component.ycc.emc.dg.ypw.emc ru;
    private com.bytedance.sdk.component.ycc.emc.dg.ypw.emc sup;
    private com.bytedance.sdk.component.ycc.emc.dg.ypw.emc uym;
    private com.bytedance.sdk.component.ycc.emc.emc.emc.emc.ypw xq;
    private com.bytedance.sdk.component.ycc.emc.emc.emc.emc.bw ycc;
    private com.bytedance.sdk.component.ycc.emc.emc.emc.emc.emc ypw;
    private com.bytedance.sdk.component.ycc.emc.dg.ypw.emc zz;

    public xq() {
        Context contextYcc = msw.uym().ycc();
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.emc()) {
            this.uym = msw.uym().sup();
            this.emc = new com.bytedance.sdk.component.ycc.emc.emc.emc.emc.dg(contextYcc, this.uym);
        }
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.bw()) {
            if (msw.uym().ru() != null) {
                this.zz = msw.uym().ru();
            } else {
                this.zz = msw.uym().sz();
            }
            this.xq = new com.bytedance.sdk.component.ycc.emc.emc.emc.emc.ypw(contextYcc, this.zz);
        }
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.ypw()) {
            this.msw = msw.uym().sz();
            this.ypw = new com.bytedance.sdk.component.ycc.emc.emc.emc.emc.emc(contextYcc, this.msw);
        }
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.xq()) {
            this.ru = msw.uym().sz();
            this.dg = new uym(contextYcc, this.ru);
        }
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.dg()) {
            this.gbl = msw.uym().qh();
            this.bw = new com.bytedance.sdk.component.ycc.emc.emc.emc.emc.ycc(contextYcc, this.gbl);
        }
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.ycc()) {
            this.sup = msw.uym().cf();
            this.ycc = new com.bytedance.sdk.component.ycc.emc.emc.emc.emc.bw(contextYcc, this.sup);
        }
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.dg
    public void emc(com.bytedance.sdk.component.ycc.emc.dg.emc emcVar, int i) {
        if (emcVar == null) {
            return;
        }
        try {
            emcVar.ypw(System.currentTimeMillis());
            if (emcVar.dg() == 0 && emcVar.bw() == 1) {
                if (com.bytedance.sdk.component.ycc.emc.ypw.emc.emc()) {
                    this.emc.emc(emcVar);
                    return;
                }
                return;
            }
            if (emcVar.dg() == 3 && emcVar.bw() == 2) {
                if (com.bytedance.sdk.component.ycc.emc.ypw.emc.bw()) {
                    this.xq.emc(emcVar);
                    return;
                }
                return;
            }
            if (emcVar.dg() == 0 && emcVar.bw() == 2) {
                if (com.bytedance.sdk.component.ycc.emc.ypw.emc.ypw()) {
                    this.ypw.emc(emcVar);
                    return;
                }
                return;
            }
            if (emcVar.dg() == 1 && emcVar.bw() == 2) {
                if (com.bytedance.sdk.component.ycc.emc.ypw.emc.xq()) {
                    this.dg.emc(emcVar);
                }
            } else if (emcVar.dg() == 1 && emcVar.bw() == 3) {
                if (com.bytedance.sdk.component.ycc.emc.ypw.emc.dg()) {
                    this.bw.emc(emcVar);
                }
            } else if (emcVar.dg() == 2 && emcVar.bw() == 3 && com.bytedance.sdk.component.ycc.emc.ypw.emc.ycc()) {
                this.ycc.emc(emcVar);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.rtt(), 1);
        }
    }

    public List<com.bytedance.sdk.component.ycc.emc.dg.emc> ypw(com.bytedance.sdk.component.ycc.emc.dg.emc emcVar, int i) {
        if (emcVar.dg() == 0 && emcVar.bw() == 1 && com.bytedance.sdk.component.ycc.emc.ypw.emc.emc()) {
            if (this.uym.ypw() <= i) {
                return null;
            }
            List<com.bytedance.sdk.component.ycc.emc.dg.emc> listEmc = this.emc.emc(this.uym.ypw() - i, "_id");
            if (listEmc != null && listEmc.size() != 0) {
                com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.sb(), 1);
            }
            return listEmc;
        }
        if (emcVar.dg() == 3 && emcVar.bw() == 2 && com.bytedance.sdk.component.ycc.emc.ypw.emc.bw()) {
            if (this.zz.ypw() > i) {
                return this.xq.emc(this.zz.ypw() - i, "_id");
            }
        } else if (emcVar.dg() == 0 && emcVar.bw() == 2 && com.bytedance.sdk.component.ycc.emc.ypw.emc.ypw()) {
            if (this.msw.ypw() > i) {
                List<com.bytedance.sdk.component.ycc.emc.dg.emc> listEmc2 = this.ypw.emc(this.msw.ypw() - i, "_id");
                if (listEmc2 != null && listEmc2.size() != 0) {
                    com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.sf(), 1);
                }
                return listEmc2;
            }
        } else if (emcVar.dg() == 1 && emcVar.bw() == 2 && com.bytedance.sdk.component.ycc.emc.ypw.emc.xq()) {
            if (this.ru.ypw() > i) {
                List<com.bytedance.sdk.component.ycc.emc.dg.emc> listEmc3 = this.dg.emc(this.ru.ypw() - i, "_id");
                if (listEmc3 != null && listEmc3.size() != 0) {
                    com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.dr(), 1);
                }
                return listEmc3;
            }
        } else if (emcVar.dg() == 1 && emcVar.bw() == 3 && com.bytedance.sdk.component.ycc.emc.ypw.emc.dg()) {
            if (this.gbl.ypw() > i) {
                List<com.bytedance.sdk.component.ycc.emc.dg.emc> listEmc4 = this.bw.emc(this.gbl.ypw() - i, "_id");
                if (listEmc4 != null && listEmc4.size() != 0) {
                    com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.xmt(), 1);
                }
                return listEmc4;
            }
        } else if (emcVar.dg() == 2 && emcVar.bw() == 3 && com.bytedance.sdk.component.ycc.emc.ypw.emc.ycc() && this.sup.ypw() > i) {
            return this.ycc.emc(this.sup.ypw() - i, "_id");
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.dg
    public void emc(int i, List<com.bytedance.sdk.component.ycc.emc.dg.emc> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.ycc.emc.dg.emc emcVar = list.get(0);
        if (i == 200 || i == -1) {
            com.bytedance.sdk.component.ycc.emc.ypw.emc.emc emcVar2 = com.bytedance.sdk.component.ycc.emc.ypw.dg.dg;
            com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(emcVar2.ffd(), list.size());
            if (i != 200) {
                com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(emcVar2.hj(), list.size());
            }
            if (emcVar.dg() == 0 && emcVar.bw() == 1) {
                if (com.bytedance.sdk.component.ycc.emc.ypw.emc.emc()) {
                    this.emc.ypw(list);
                    return;
                }
                return;
            }
            if (emcVar.dg() == 3 && emcVar.bw() == 2) {
                if (com.bytedance.sdk.component.ycc.emc.ypw.emc.bw()) {
                    this.xq.ypw(list);
                    return;
                }
                return;
            }
            if (emcVar.dg() == 0 && emcVar.bw() == 2) {
                if (com.bytedance.sdk.component.ycc.emc.ypw.emc.ypw()) {
                    this.ypw.ypw(list);
                    return;
                }
                return;
            }
            if (emcVar.dg() == 1 && emcVar.bw() == 2) {
                if (com.bytedance.sdk.component.ycc.emc.ypw.emc.xq()) {
                    this.dg.ypw(list);
                }
            } else if (emcVar.dg() == 1 && emcVar.bw() == 3) {
                if (com.bytedance.sdk.component.ycc.emc.ypw.emc.dg()) {
                    this.bw.ypw(list);
                }
            } else if (emcVar.dg() == 2 && emcVar.bw() == 3 && com.bytedance.sdk.component.ycc.emc.ypw.emc.ycc()) {
                this.ycc.ypw(list);
            }
        }
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.dg
    public List<com.bytedance.sdk.component.ycc.emc.dg.emc> emc(int i, int i3, List<String> list) {
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.emc()) {
            List<com.bytedance.sdk.component.ycc.emc.dg.emc> listEmc = this.emc.emc("_id");
            if (emc(listEmc, list)) {
                listEmc.size();
                com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.rie(), 1);
                return listEmc;
            }
        }
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.bw()) {
            List<com.bytedance.sdk.component.ycc.emc.dg.emc> listEmc2 = this.xq.emc("_id");
            if (emc(listEmc2, list)) {
                listEmc2.size();
                return listEmc2;
            }
        }
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.ypw()) {
            List<com.bytedance.sdk.component.ycc.emc.dg.emc> listEmc3 = this.ypw.emc("_id");
            if (emc(listEmc3, list)) {
                listEmc3.size();
                com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.hxp(), 1);
                return listEmc3;
            }
        }
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.xq()) {
            List<com.bytedance.sdk.component.ycc.emc.dg.emc> listYpw = this.dg.ypw("_id");
            if (emc(listYpw, list)) {
                listYpw.size();
                com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.ee(), 1);
                return listYpw;
            }
        }
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.dg()) {
            List<com.bytedance.sdk.component.ycc.emc.dg.emc> listYpw2 = this.bw.ypw("_id");
            if (emc(listYpw2, list)) {
                listYpw2.size();
                com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.db(), 1);
                return listYpw2;
            }
        }
        if (!com.bytedance.sdk.component.ycc.emc.ypw.emc.ycc()) {
            return null;
        }
        List<com.bytedance.sdk.component.ycc.emc.dg.emc> listYpw3 = this.ycc.ypw("_id");
        if (!emc(listYpw3, list)) {
            return null;
        }
        listYpw3.size();
        return listYpw3;
    }

    private boolean emc(List<com.bytedance.sdk.component.ycc.emc.dg.emc> list, List<String> list2) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            try {
                Iterator<com.bytedance.sdk.component.ycc.emc.dg.emc> it = list.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.ycc.emc.dg.emc next = it.next();
                    if (next != null) {
                        String strXq = next.xq();
                        if (!TextUtils.isEmpty(strXq) && list2.contains(strXq)) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.dg
    public boolean emc(int i, boolean z6) {
        com.bytedance.sdk.component.ycc.emc.emc.emc.emc.bw bwVar;
        com.bytedance.sdk.component.ycc.emc.emc.emc.emc.ycc yccVar;
        uym uymVar;
        com.bytedance.sdk.component.ycc.emc.emc.emc.emc.emc emcVar;
        com.bytedance.sdk.component.ycc.emc.emc.emc.emc.ypw ypwVar;
        com.bytedance.sdk.component.ycc.emc.emc.emc.emc.dg dgVar;
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.emc() && (dgVar = this.emc) != null && dgVar.emc(i)) {
            com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.qh(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.bw() && (ypwVar = this.xq) != null && ypwVar.emc(i)) {
            return true;
        }
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.ypw() && (emcVar = this.ypw) != null && emcVar.emc(i)) {
            com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.cf(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.ycc.emc.ypw.emc.xq() && (uymVar = this.dg) != null && uymVar.emc(i)) {
            com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.vk(), 1);
            return true;
        }
        if (!com.bytedance.sdk.component.ycc.emc.ypw.emc.dg() || (yccVar = this.bw) == null || !yccVar.emc(i)) {
            return com.bytedance.sdk.component.ycc.emc.ypw.emc.ycc() && (bwVar = this.ycc) != null && bwVar.emc(i);
        }
        com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.aa(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.dg
    public void emc(int i, long j6) {
        com.bytedance.sdk.component.ycc.emc.emc.emc.emc.dg dgVar = this.emc;
        if (dgVar != null) {
            dgVar.emc(i, j6);
        }
        com.bytedance.sdk.component.ycc.emc.emc.emc.emc.ypw ypwVar = this.xq;
        if (ypwVar != null) {
            ypwVar.emc(i, j6);
        }
        com.bytedance.sdk.component.ycc.emc.emc.emc.emc.emc emcVar = this.ypw;
        if (emcVar != null) {
            emcVar.emc(i, j6);
        }
        uym uymVar = this.dg;
        if (uymVar != null) {
            uymVar.emc(i, j6);
        }
        com.bytedance.sdk.component.ycc.emc.emc.emc.emc.ycc yccVar = this.bw;
        if (yccVar != null) {
            yccVar.emc(i, j6);
        }
        com.bytedance.sdk.component.ycc.emc.emc.emc.emc.bw bwVar = this.ycc;
        if (bwVar != null) {
            bwVar.emc(i, j6);
        }
    }
}
