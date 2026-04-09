package com.bykv.vk.openvk.preload.geckox.a;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.SystemClock;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.model.ComponentModel;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import com.bykv.vk.openvk.preload.geckox.utils.g;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private List<String> f6641a;

    /* renamed from: b, reason: collision with root package name */
    private int f6642b = 1;

    /* renamed from: com.bykv.vk.openvk.preload.geckox.a.a$a, reason: collision with other inner class name */
    public static class C0004a {

        /* renamed from: a, reason: collision with root package name */
        String f6645a;

        /* renamed from: b, reason: collision with root package name */
        String f6646b;

        /* renamed from: c, reason: collision with root package name */
        int f6647c;

        /* renamed from: d, reason: collision with root package name */
        long f6648d;

        /* renamed from: e, reason: collision with root package name */
        File f6649e;

        public C0004a(String str, String str2, int i, long j6, File file) {
            this.f6645a = str;
            this.f6646b = str2;
            this.f6647c = i;
            this.f6648d = j6;
            this.f6649e = file;
        }
    }

    public a(List<String> list) {
        this.f6641a = list;
    }

    public static void a(final Context context, Map<String, ComponentModel.b> map, File file, com.bykv.vk.openvk.preload.geckox.d.a aVar) {
        final ArrayList arrayList;
        ComponentModel.b value;
        List<ComponentModel.a> list;
        List<Long> listB;
        List<Long> listB2;
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ComponentModel.b> entry : map.entrySet()) {
                String key = entry.getKey();
                File file2 = new File(file, key);
                if (file2.isDirectory() && (value = entry.getValue()) != null && (list = value.f6776a) != null && !list.isEmpty()) {
                    List<ComponentModel.a> list2 = value.f6776a;
                    HashSet hashSet = new HashSet();
                    for (ComponentModel.a aVar2 : list2) {
                        String str = aVar2.f6773a;
                        if (!hashSet.contains(str)) {
                            hashSet.add(str);
                            int i = aVar2.f6774b;
                            List<Long> list3 = aVar2.f6775c;
                            File file3 = new File(file2, str);
                            if (i != 1) {
                                if (i != 2) {
                                    if (i == 3) {
                                        File file4 = new File(file2, str);
                                        File file5 = new File(file2, str + "--pending-delete");
                                        file4.renameTo(file5);
                                        arrayList.add(new C0004a(key, str, i, 0L, file5));
                                    }
                                } else if (list3 != null && (listB = g.b(file3)) != null && !listB.isEmpty()) {
                                    for (Long l2 : listB) {
                                        if (list3.get(0).longValue() > l2.longValue()) {
                                            File file6 = new File(file3, l2 + "--pending-delete");
                                            new File(file3, String.valueOf(l2)).renameTo(file6);
                                            arrayList.add(new C0004a(key, str, i, l2.longValue(), file6));
                                        }
                                    }
                                }
                            } else if (list3 != null && (listB2 = g.b(file3)) != null && !listB2.isEmpty()) {
                                for (Long l6 : listB2) {
                                    if (list3.contains(l6)) {
                                        File file7 = new File(file3, l6 + "--pending-delete");
                                        new File(file3, String.valueOf(l6)).renameTo(file7);
                                        arrayList.add(new C0004a(key, str, i, l6.longValue(), file7));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e6) {
            e6.printStackTrace();
            arrayList = null;
        }
        if (arrayList == null) {
            return;
        }
        com.bykv.vk.openvk.preload.geckox.utils.c.a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Context context2 = context;
                    List<C0004a> list4 = arrayList;
                    if (list4 != null && !list4.isEmpty()) {
                        for (C0004a c0004a : list4) {
                            File file8 = c0004a.f6649e;
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            boolean zA = com.bykv.vk.openvk.preload.geckox.utils.b.a(file8);
                            long jUptimeMillis2 = SystemClock.uptimeMillis();
                            if (zA) {
                                b.a(context2).a(c0004a.f6645a, c0004a.f6646b, c0004a.f6647c, TTAdConstant.MATE_VALID, c0004a.f6648d, 0, null, jUptimeMillis2 - jUptimeMillis);
                            } else {
                                b.a(context2).a(c0004a.f6645a, c0004a.f6646b, c0004a.f6647c, 201, c0004a.f6648d, 601, "delete failed", jUptimeMillis2 - jUptimeMillis);
                            }
                        }
                    }
                } catch (Exception e7) {
                    GeckoLogger.w("clean-channel", "", e7);
                }
            }
        });
    }

    public static List<StatisticModel.PackageStatisticModel> a(Context context) {
        return b.a(context).a();
    }

    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar) {
        if (bVar.c()) {
            Common common = new Common(bVar.k(), bVar.o(), bVar.r(), com.bykv.vk.openvk.preload.geckox.utils.a.b(bVar.a()), e.a(bVar.a()), bVar.l(), bVar.m());
            StatisticModel statisticModel = new StatisticModel();
            statisticModel.common = common;
            statisticModel.packages.addAll(b.a(bVar.a()).a());
            if (statisticModel.packages.isEmpty()) {
                return;
            }
            String str = "https://" + bVar.j() + "/gecko/server/packages/stats";
            try {
                Response responseDoPost = bVar.i().doPost(str, statisticModel.toJson());
                if (responseDoPost.code == 200) {
                    if (new JSONObject(responseDoPost.body).getInt("status") != 0) {
                        throw new RuntimeException("upload failed");
                    }
                } else {
                    throw new NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f6641a != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < this.f6641a.size(); i++) {
                    jSONArray.put(this.f6641a.get(i));
                }
                jSONObject.put("gecko_accesskey", jSONArray);
            }
            jSONObject.put("os", 0);
            jSONObject.put("msg_type", this.f6642b);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
