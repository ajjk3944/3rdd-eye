package com.mbridge.msdk.mbnative.cache;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.Campaign;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class a extends b<String, List<Campaign>> {

    /* renamed from: a, reason: collision with root package name */
    private e f15934a = e.a(g.a(com.mbridge.msdk.foundation.controller.c.n().d()));

    /* renamed from: b, reason: collision with root package name */
    private int f15935b;

    /* renamed from: com.mbridge.msdk.mbnative.cache.a$a, reason: collision with other inner class name */
    public class RunnableC0282a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f15936a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15937b;

        public RunnableC0282a(List list, String str) {
            this.f15936a = list;
            this.f15937b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = 0; i10 < this.f15936a.size(); i10++) {
                CampaignEx campaignEx = (CampaignEx) this.f15936a.get(i10);
                campaignEx.setCacheLevel(1);
                a.this.f15934a.a(campaignEx, this.f15937b, 1);
            }
        }
    }

    public a(int i10) {
        this.f15935b = i10;
    }

    @Override // com.mbridge.msdk.mbnative.cache.b
    public List<Campaign> b(String str, int i10) {
        List<CampaignEx> listA = this.f15934a.a(str, i10, 2, this.f15935b);
        if (listA == null) {
            return null;
        }
        if (a(listA, 2)) {
            this.f15934a.a(str, 2, this.f15935b);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(listA);
        return arrayList;
    }

    public void a(List<CampaignEx> list, String str) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx = list.get(i10);
            campaignEx.setCacheLevel(2);
            this.f15934a.a(campaignEx, str, 1);
        }
    }

    public boolean a(List<CampaignEx> list, int i10) {
        long jA;
        if (list != null && list.size() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long timestamp = list.get(0).getTimestamp();
            if (i10 != 1) {
                jA = i10 != 2 ? 0L : b();
            } else {
                jA = a();
            }
            if (jCurrentTimeMillis - timestamp > jA) {
                return true;
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.mbnative.cache.b
    public void a(String str, List<Campaign> list) {
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
            return;
        }
        this.f15934a.a(str, 1, this.f15935b, false);
        this.f15934a.a(str, 2, this.f15935b, false);
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx = (CampaignEx) list.get(i10);
            campaignEx.setCacheLevel(1);
            this.f15934a.a(campaignEx, str, 1);
        }
    }

    @Override // com.mbridge.msdk.mbnative.cache.b
    public void a(String str, List<Campaign> list, String str2) {
        boolean z10 = !TextUtils.isEmpty(str2);
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
            return;
        }
        this.f15934a.a(str, 1, this.f15935b, z10);
        this.f15934a.a(str, 2, this.f15935b, z10);
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new RunnableC0282a(list, str));
    }

    @Override // com.mbridge.msdk.mbnative.cache.b
    public List<Campaign> a(String str, int i10) {
        List<CampaignEx> listA = this.f15934a.a(str, i10, 1, this.f15935b);
        if (listA == null) {
            return null;
        }
        if (a(listA, 1)) {
            a(listA, str);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(listA);
        return arrayList;
    }

    @Override // com.mbridge.msdk.mbnative.cache.b
    public void a(String str, Campaign campaign, String str2) {
        boolean z10 = !TextUtils.isEmpty(str2);
        if (campaign == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            CampaignEx campaignEx = (CampaignEx) campaign;
            if (this.f15934a.a(campaignEx.getId(), campaignEx.getTab(), str, campaignEx.getCacheLevel(), campaignEx.getType(), z10)) {
                this.f15934a.a(campaignEx.getId(), str, campaignEx.getCacheLevel(), this.f15935b, z10);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
