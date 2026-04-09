package com.bykv.vk.openvk.preload.geckox.a;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.model.ComponentModel;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import com.bykv.vk.openvk.preload.geckox.utils.g;
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
    private List<String> f9020a;

    /* renamed from: b, reason: collision with root package name */
    private int f9021b = 1;

    /* renamed from: com.bykv.vk.openvk.preload.geckox.a.a$a, reason: collision with other inner class name */
    public static class C0089a {

        /* renamed from: a, reason: collision with root package name */
        String f9024a;

        /* renamed from: b, reason: collision with root package name */
        String f9025b;

        /* renamed from: c, reason: collision with root package name */
        int f9026c;

        /* renamed from: d, reason: collision with root package name */
        long f9027d;

        /* renamed from: e, reason: collision with root package name */
        File f9028e;

        public C0089a(String str, String str2, int i10, long j10, File file) {
            this.f9024a = str;
            this.f9025b = str2;
            this.f9026c = i10;
            this.f9027d = j10;
            this.f9028e = file;
        }
    }

    public a(List<String> list) {
        this.f9020a = list;
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
                if (file2.isDirectory() && (value = entry.getValue()) != null && (list = value.f9158a) != null && !list.isEmpty()) {
                    List<ComponentModel.a> list2 = value.f9158a;
                    HashSet hashSet = new HashSet();
                    for (ComponentModel.a aVar2 : list2) {
                        String str = aVar2.f9155a;
                        if (!hashSet.contains(str)) {
                            hashSet.add(str);
                            int i10 = aVar2.f9156b;
                            List<Long> list3 = aVar2.f9157c;
                            File file3 = new File(file2, str);
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 == 3) {
                                        File file4 = new File(file2, str);
                                        File file5 = new File(file2, str + "--pending-delete");
                                        file4.renameTo(file5);
                                        arrayList.add(new C0089a(key, str, i10, 0L, file5));
                                    }
                                } else if (list3 != null && (listB = g.b(file3)) != null && !listB.isEmpty()) {
                                    for (Long l10 : listB) {
                                        if (list3.get(0).longValue() > l10.longValue()) {
                                            File file6 = new File(file3, l10 + "--pending-delete");
                                            new File(file3, String.valueOf(l10)).renameTo(file6);
                                            arrayList.add(new C0089a(key, str, i10, l10.longValue(), file6));
                                        }
                                    }
                                }
                            } else if (list3 != null && (listB2 = g.b(file3)) != null && !listB2.isEmpty()) {
                                for (Long l11 : listB2) {
                                    if (list3.contains(l11)) {
                                        File file7 = new File(file3, l11 + "--pending-delete");
                                        new File(file3, String.valueOf(l11)).renameTo(file7);
                                        arrayList.add(new C0089a(key, str, i10, l11.longValue(), file7));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
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
                    List<C0089a> list4 = arrayList;
                    if (list4 != null && !list4.isEmpty()) {
                        for (C0089a c0089a : list4) {
                            File file8 = c0089a.f9028e;
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            boolean zA = com.bykv.vk.openvk.preload.geckox.utils.b.a(file8);
                            long jUptimeMillis2 = SystemClock.uptimeMillis();
                            if (zA) {
                                b.a(context2).a(c0089a.f9024a, c0089a.f9025b, c0089a.f9026c, 200, c0089a.f9027d, 0, null, jUptimeMillis2 - jUptimeMillis);
                            } else {
                                b.a(context2).a(c0089a.f9024a, c0089a.f9025b, c0089a.f9026c, 201, c0089a.f9027d, 601, "delete failed", jUptimeMillis2 - jUptimeMillis);
                            }
                        }
                    }
                } catch (Exception e11) {
                    GeckoLogger.w("clean-channel", "", e11);
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
                    if (new JSONObject(responseDoPost.body).getInt(NotificationCompat.CATEGORY_STATUS) != 0) {
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
            if (this.f9020a != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < this.f9020a.size(); i10++) {
                    jSONArray.put(this.f9020a.get(i10));
                }
                jSONObject.put("gecko_accesskey", jSONArray);
            }
            jSONObject.put("os", 0);
            jSONObject.put("msg_type", this.f9021b);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
