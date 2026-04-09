package com.bytedance.sdk.openadsdk.xq;

import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.dg.uym;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.utils.iyl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ru {

    /* renamed from: aa, reason: collision with root package name */
    private rie f9317aa;
    private JSONObject cf;
    private String gbl;
    private String qh;
    private int sba;
    private String sup;
    private String sz;
    private FilterWord ul;
    private String vk;
    protected IListenerManager ycc;
    private int yzg;
    public static FilterWord emc = new FilterWord("", "");
    public static int ypw = 1;
    public static int xq = 2;
    public static int dg = 3;
    public static int bw = 4;
    private final Set<xq> uym = new HashSet();
    private final Set<ypw> msw = new HashSet();
    private final Set<dg> zz = new HashSet();
    private final Set<emc> ru = new HashSet();

    public interface dg {
        void emc(String str);
    }

    public interface emc {
        void emc(List<FilterWord> list);
    }

    public interface xq {
        void emc(FilterWord filterWord);
    }

    public interface ypw {
        void emc(int i10);
    }

    private void ru() {
        Iterator<xq> it = this.uym.iterator();
        while (it.hasNext()) {
            it.next().emc(this.ul);
        }
    }

    public void bw() {
        Iterator<ypw> it = this.msw.iterator();
        while (it.hasNext()) {
            it.next().emc(xq);
        }
    }

    public void dg() {
        if (!xq() && !TextUtils.isEmpty(this.qh)) {
            this.ul = new FilterWord("0:00", this.qh);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.ul);
        if (!TextUtils.isEmpty(this.gbl)) {
            if (TextUtils.isEmpty(this.qh)) {
                com.bytedance.sdk.openadsdk.xq.ypw.emc().emc(this.gbl, arrayList, this.sup);
            } else {
                if (this.cf == null) {
                    rie rieVar = this.f9317aa;
                    if (rieVar != null) {
                        this.cf = rieVar.uie();
                    } else {
                        try {
                            this.cf = new JSONObject(this.vk);
                        } catch (Throwable th) {
                            ul.emc("TTDislikeManager", "creative info to json exception", th);
                        }
                    }
                }
                com.bytedance.sdk.openadsdk.xq.ypw.emc().emc(this.gbl, arrayList, this.cf, this.qh, this.sup);
            }
        }
        if (!TextUtils.isEmpty(this.sz)) {
            if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                dg("onItemClickClosed");
            } else {
                uym.emc emcVarBw = com.bytedance.sdk.openadsdk.core.zz.ypw().bw(this.sz);
                if (emcVarBw != null) {
                    emcVarBw.emc();
                    com.bytedance.sdk.openadsdk.core.zz.ypw().ycc(this.sz);
                }
            }
        }
        Iterator<ypw> it = this.msw.iterator();
        while (it.hasNext()) {
            it.next().emc(ypw);
        }
        emc(emc);
        xq("");
    }

    public int msw() {
        return this.sba;
    }

    public String uym() {
        return this.qh;
    }

    public boolean xq() {
        FilterWord filterWord = this.ul;
        return (filterWord == null || filterWord.equals(emc)) ? false : true;
    }

    public void ycc() {
        Iterator<ypw> it = this.msw.iterator();
        while (it.hasNext()) {
            it.next().emc(bw);
        }
    }

    public void ypw(String str) {
        this.sup = str;
    }

    public boolean zz() {
        return this.sba < this.yzg;
    }

    public void emc() {
        this.uym.clear();
        this.msw.clear();
        this.zz.clear();
        this.ru.clear();
    }

    public void xq(String str) {
        this.qh = str;
        Iterator<dg> it = this.zz.iterator();
        while (it.hasNext()) {
            it.next().emc(this.qh);
        }
    }

    public FilterWord ypw() {
        return this.ul;
    }

    public void emc(String str) {
        this.gbl = str;
    }

    public void emc(FilterWord filterWord) {
        this.ul = filterWord;
        ru();
    }

    public void emc(xq xqVar) {
        this.uym.add(xqVar);
    }

    public void emc(ypw ypwVar) {
        this.msw.add(ypwVar);
    }

    public void emc(dg dgVar) {
        this.zz.add(dgVar);
    }

    public void emc(emc emcVar) {
        this.ru.add(emcVar);
    }

    public void emc(List<FilterWord> list) {
        Iterator<emc> it = this.ru.iterator();
        while (it.hasNext()) {
            it.next().emc(list);
        }
    }

    public IListenerManager emc(int i10) {
        if (this.ycc == null) {
            this.ycc = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.emc.emc().emc(i10));
        }
        return this.ycc;
    }

    public static void emc(final int i10, final String str, final uym.emc emcVar) {
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            iyl.xq(new com.bytedance.sdk.component.msw.msw("DislikeClosed_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.xq.ru.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.emc emcVarEmc = com.bytedance.sdk.openadsdk.multipro.aidl.emc.emc();
                    if (i10 != 6 || emcVar == null) {
                        return;
                    }
                    try {
                        com.bytedance.sdk.openadsdk.multipro.aidl.ypw.ypw ypwVar = new com.bytedance.sdk.openadsdk.multipro.aidl.ypw.ypw(str, emcVar);
                        IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(emcVarEmc.emc(6));
                        if (iListenerManagerAsInterface != null) {
                            iListenerManagerAsInterface.registerDisLikeClosedListener(str, ypwVar);
                        }
                    } catch (RemoteException e10) {
                        ul.xq("TTDislikeManager", e10.getMessage());
                    }
                }
            }, 5);
        }
    }

    public static void emc(final int i10, final String str) {
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            iyl.xq(new com.bytedance.sdk.component.msw.msw("DislikeClosed_unregisterMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.xq.ru.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.emc emcVarEmc = com.bytedance.sdk.openadsdk.multipro.aidl.emc.emc();
                    if (i10 == 6) {
                        try {
                            IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(emcVarEmc.emc(6));
                            if (iListenerManagerAsInterface != null) {
                                iListenerManagerAsInterface.unregisterDisLikeClosedListener(str);
                            }
                        } catch (RemoteException unused) {
                        }
                    }
                }
            }, 5);
        }
    }

    private void dg(final String str) {
        iyl.xq(new com.bytedance.sdk.component.msw.msw("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.xq.ru.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (TextUtils.isEmpty(ru.this.sz)) {
                        return;
                    }
                    ru.this.emc(6).executeDisLikeClosedCallback(ru.this.sz, str);
                } catch (Throwable th) {
                    ul.emc("TTDislikeManager", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    public void emc(String str, rie rieVar) {
        this.vk = str;
        this.f9317aa = rieVar;
    }

    public void emc(int i10, int i11) {
        this.sba = i10;
        this.yzg = i11;
    }
}
