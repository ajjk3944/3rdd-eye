package com.bytedance.sdk.openadsdk.lh;

import android.os.RemoteException;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.yu.ra;
import com.bytedance.sdk.openadsdk.utils.bs;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class tlj {
    public String bly;

    /* renamed from: cf, reason: collision with root package name */
    String f8583cf;

    /* renamed from: jg, reason: collision with root package name */
    JSONObject f8584jg;
    String ko;
    String mwh;
    private int qbp;
    vpp rn;
    protected IListenerManager ryl;
    public String tlj;
    public FilterWord vm;
    int zih;
    public static FilterWord ouw = new FilterWord("", "");
    public static int vt = 1;

    /* renamed from: lh, reason: collision with root package name */
    public static int f8582lh = 2;
    public static int yu = 3;
    public static int fkw = 4;

    /* renamed from: th, reason: collision with root package name */
    private final Set<lh> f8586th = new HashSet();

    /* renamed from: le, reason: collision with root package name */
    final Set<vt> f8585le = new HashSet();
    final Set<yu> ra = new HashSet();
    final Set<ouw> pno = new HashSet();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface lh {
        void ouw(FilterWord filterWord);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void ouw(List<FilterWord> list);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface vt {
        void ouw(int i4);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface yu {
        void ouw(String str);
    }

    private void le() {
        Iterator<lh> it = this.f8586th.iterator();
        while (it.hasNext()) {
            it.next().ouw(this.vm);
        }
    }

    public final boolean fkw() {
        return this.zih < this.qbp;
    }

    public final void lh() {
        Iterator<vt> it = this.f8585le.iterator();
        while (it.hasNext()) {
            it.next().ouw(f8582lh);
        }
    }

    public final boolean vt() {
        FilterWord filterWord = this.vm;
        return (filterWord == null || filterWord.equals(ouw)) ? false : true;
    }

    public final IListenerManager yu() {
        if (this.ryl == null) {
            this.ryl = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.ouw.ouw().ouw(6));
        }
        return this.ryl;
    }

    public final void ouw() {
        this.f8586th.clear();
        this.f8585le.clear();
        this.ra.clear();
        this.pno.clear();
    }

    public final void vt(String str) {
        this.mwh = str;
        Iterator<yu> it = this.ra.iterator();
        while (it.hasNext()) {
            it.next().ouw(this.mwh);
        }
    }

    public final void ouw(FilterWord filterWord) {
        this.vm = filterWord;
        le();
    }

    public final void ouw(lh lhVar) {
        this.f8586th.add(lhVar);
    }

    public final void ouw(vt vtVar) {
        this.f8585le.add(vtVar);
    }

    public final void ouw(List<FilterWord> list) {
        Iterator<ouw> it = this.pno.iterator();
        while (it.hasNext()) {
            it.next().ouw(list);
        }
    }

    public static void ouw(final String str, final ra.ouw ouwVar) {
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            bs.fkw(new com.bytedance.sdk.component.pno.pno("DislikeClosed_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.lh.tlj.2
                final /* synthetic */ int ouw = 6;

                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.multipro.aidl.ouw.ouw();
                    if (this.ouw != 6 || ouwVar == null) {
                        return;
                    }
                    try {
                        ko.vt("TTDislikeManager", "start registerDislikeClickCloseListener ! ");
                        com.bytedance.sdk.openadsdk.multipro.aidl.vt.vt vtVar = new com.bytedance.sdk.openadsdk.multipro.aidl.vt.vt(str, ouwVar);
                        IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(ouwVarOuw.ouw(6));
                        if (iListenerManagerAsInterface != null) {
                            iListenerManagerAsInterface.registerDisLikeClosedListener(str, vtVar);
                            ko.vt("TTDislikeManager", "end registerDislikeClickCloseListener ! ");
                        }
                    } catch (RemoteException e2) {
                        qbp.lh("TTDislikeManager", e2.getMessage());
                        ko.vt("TTDislikeManager", "multiProcess registerDislikeClickCloseListener error");
                    }
                }
            });
        }
    }

    public static void ouw(final String str) {
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            bs.fkw(new com.bytedance.sdk.component.pno.pno("DislikeClosed_unregisterMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.lh.tlj.3
                final /* synthetic */ int ouw = 6;

                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.multipro.aidl.ouw.ouw();
                    if (this.ouw == 6) {
                        try {
                            ko.vt("TTDislikeManager", "start unregisterDislikeClickCloseListener ! ");
                            IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(ouwVarOuw.ouw(6));
                            if (iListenerManagerAsInterface != null) {
                                iListenerManagerAsInterface.unregisterDisLikeClosedListener(str);
                                ko.vt("TTDislikeManager", "end unregisterDislikeClickCloseListener ! ");
                            }
                        } catch (RemoteException unused) {
                            ko.vt("TTDislikeManager", "multiProcess unregisterMultiProcessListener error");
                        }
                    }
                }
            });
        }
    }

    public final void ouw(String str, vpp vppVar) {
        this.ko = str;
        this.rn = vppVar;
    }

    public final void ouw(int i4, int i10) {
        this.zih = i4;
        this.qbp = i10;
    }
}
