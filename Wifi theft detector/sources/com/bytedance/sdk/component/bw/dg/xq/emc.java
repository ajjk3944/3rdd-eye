package com.bytedance.sdk.component.bw.dg.xq;

import com.bytedance.sdk.component.bw.gbl;
import com.bytedance.sdk.component.bw.vk;
import com.bytedance.sdk.component.bw.yzg;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class emc<T> {
    private xq emc;
    private yzg ypw;

    public emc(xq xqVar, yzg yzgVar) {
        this.emc = xqVar;
        this.ypw = yzgVar;
    }

    public void emc(gbl<T> gblVar) {
        try {
            yzg yzgVar = this.ypw;
            if (yzgVar != null) {
                yzgVar.emc("success", this.emc);
            }
            String strUl = this.emc.ul();
            Map<String, List<xq>> mapZz = this.emc.aa().zz();
            List<xq> list = mapZz.get(strUl);
            if (list == null) {
                vk vkVarMsw = this.emc.msw();
                if (vkVarMsw != null) {
                    vkVarMsw.toString();
                    this.emc.ru();
                    vkVarMsw.emc(gblVar);
                }
            } else {
                synchronized (list) {
                    try {
                        list.size();
                        for (xq xqVar : list) {
                            vk vkVarMsw2 = xqVar.msw();
                            if (vkVarMsw2 != null) {
                                vkVarMsw2.toString();
                                xqVar.ru();
                                vkVarMsw2.emc(gblVar);
                            }
                        }
                        list.clear();
                        mapZz.remove(strUl);
                    } finally {
                    }
                }
            }
            yzg yzgVar2 = this.ypw;
            if (yzgVar2 != null) {
                yzgVar2.ypw("success", this.emc);
            }
        } catch (Throwable unused) {
        }
    }

    public void emc(int i10, String str, Throwable th) {
        try {
            yzg yzgVar = this.ypw;
            if (yzgVar != null) {
                yzgVar.emc("failed", this.emc);
            }
            String strUl = this.emc.ul();
            Map<String, List<xq>> mapZz = this.emc.aa().zz();
            List<xq> list = mapZz.get(strUl);
            if (list == null) {
                vk vkVarMsw = this.emc.msw();
                if (vkVarMsw != null) {
                    vkVarMsw.emc(i10, str, th);
                }
            } else {
                synchronized (list) {
                    try {
                        Iterator<xq> it = list.iterator();
                        while (it.hasNext()) {
                            vk vkVarMsw2 = it.next().msw();
                            if (vkVarMsw2 != null) {
                                vkVarMsw2.toString();
                                vkVarMsw2.emc(i10, str, th);
                            }
                        }
                        list.clear();
                        mapZz.remove(strUl);
                    } finally {
                    }
                }
            }
            yzg yzgVar2 = this.ypw;
            if (yzgVar2 != null) {
                yzgVar2.ypw("failed", this.emc);
            }
        } catch (Throwable unused) {
        }
    }
}
