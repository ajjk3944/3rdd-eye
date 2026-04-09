package com.bykv.vk.openvk.preload.geckox.statistic;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {
    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar, com.bykv.vk.openvk.preload.geckox.buffer.a.a aVar) {
        IStatisticMonitor iStatisticMonitorQ = bVar.q();
        if (iStatisticMonitorQ != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("params_for_special", "gecko");
                jSONObject.put("device_id", bVar.r());
                jSONObject.put("os", 0);
                jSONObject.put("app_version", bVar.o());
                jSONObject.put("api_version", "v3");
                jSONObject.put("aid", bVar.k());
                jSONObject.put("x_tt_logid", aVar.f6691e);
                jSONObject.put("http_status", aVar.g);
                jSONObject.put("err_msg", aVar.f6690d);
                if (TextUtils.isEmpty(aVar.f6691e)) {
                    jSONObject.put("deployments_info", aVar.f6688b);
                    jSONObject.put("local_info", aVar.f6687a);
                    jSONObject.put("custom_info", aVar.f6689c);
                } else {
                    jSONObject.put("deployments_info", "");
                    jSONObject.put("local_info", "");
                    jSONObject.put("custom_info", "");
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Build.VERSION.SDK_INT);
                jSONObject.put("os_version", sb2.toString());
                jSONObject.put("device_platform", "android");
                jSONObject.put("device_model", Build.MODEL);
                jSONObject.put("ac", aVar.f6692f);
                iStatisticMonitorQ.upload("geckosdk_query_pkgs", jSONObject);
            } catch (Throwable th2) {
                GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th2);
            }
        }
    }

    private static List<StatisticModel.PackageStatisticModel.DownloadFailRecords> b(List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list;
    }

    private static Integer a(List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return Integer.valueOf(list.size());
    }

    private static void a(com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar, List<StatisticModel.PackageStatisticModel> list) {
        if (aVar.f6801z && aVar.A) {
            StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel);
            packageStatisticModel.statsType = 0;
            packageStatisticModel.accessKey = aVar.f6778a;
            packageStatisticModel.groupName = aVar.f6779b;
            packageStatisticModel.channel = aVar.f6780c;
            packageStatisticModel.f6776ac = aVar.f6789n;
            packageStatisticModel.f6777id = aVar.f6791p;
            packageStatisticModel.downloadRetryTimes = a(aVar.f6796u);
            packageStatisticModel.downloadUrl = aVar.f6795t;
            packageStatisticModel.downloadFailRecords = b(aVar.f6796u);
            packageStatisticModel.downloadDuration = Long.valueOf(aVar.f6798w - aVar.f6797v);
            if (aVar.B) {
                StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
                list.add(packageStatisticModel2);
                packageStatisticModel2.accessKey = aVar.f6778a;
                packageStatisticModel2.groupName = aVar.f6779b;
                packageStatisticModel2.statsType = 2;
                packageStatisticModel2.f6777id = aVar.f6791p;
                packageStatisticModel2.channel = aVar.f6780c;
                packageStatisticModel2.activeCheckDuration = Long.valueOf(aVar.f6799x - aVar.f6798w);
                packageStatisticModel2.applyDuration = Long.valueOf(aVar.f6800y - aVar.f6799x);
                return;
            }
            StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel3);
            packageStatisticModel3.statsType = 3;
            packageStatisticModel3.accessKey = aVar.f6778a;
            packageStatisticModel3.groupName = aVar.f6779b;
            packageStatisticModel3.errCode = "500";
            packageStatisticModel3.f6777id = aVar.f6791p;
            packageStatisticModel3.channel = aVar.f6780c;
            packageStatisticModel3.errMsg = aVar.D;
            return;
        }
        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
        list.add(packageStatisticModel4);
        packageStatisticModel4.statsType = 1;
        packageStatisticModel4.accessKey = aVar.f6778a;
        packageStatisticModel4.groupName = aVar.f6779b;
        packageStatisticModel4.channel = aVar.f6780c;
        packageStatisticModel4.f6776ac = aVar.f6789n;
        packageStatisticModel4.f6777id = aVar.f6791p;
        packageStatisticModel4.downloadRetryTimes = a(aVar.f6796u);
        packageStatisticModel4.downloadUrl = aVar.f6795t;
        packageStatisticModel4.downloadFailRecords = b(aVar.f6796u);
        if (!aVar.f6801z) {
            packageStatisticModel4.errCode = "300";
            List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list2 = aVar.f6796u;
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            packageStatisticModel4.errMsg = aVar.f6796u.get(0).reason;
            return;
        }
        if (aVar.A) {
            return;
        }
        packageStatisticModel4.errCode = "450";
        packageStatisticModel4.errMsg = aVar.C;
    }

    public static void a(final com.bykv.vk.openvk.preload.geckox.b bVar, a aVar) {
        StatisticModel statisticModel;
        ArrayList arrayList = new ArrayList();
        for (com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar2 : aVar.a()) {
            if (aVar2.f6781d != null || aVar2.f6783f != 0) {
                if (aVar2.f6784h && aVar2.f6785i) {
                    StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel);
                    packageStatisticModel.statsType = 100;
                    packageStatisticModel.groupName = aVar2.f6779b;
                    packageStatisticModel.accessKey = aVar2.f6778a;
                    packageStatisticModel.channel = aVar2.f6780c;
                    packageStatisticModel.f6776ac = aVar2.f6789n;
                    packageStatisticModel.f6777id = aVar2.f6791p;
                    packageStatisticModel.patchId = aVar2.f6790o;
                    packageStatisticModel.downloadRetryTimes = a(aVar2.f6782e);
                    packageStatisticModel.downloadUrl = aVar2.f6781d;
                    packageStatisticModel.downloadFailRecords = b(aVar2.f6782e);
                    packageStatisticModel.downloadDuration = Long.valueOf(aVar2.g - aVar2.f6783f);
                    if (!aVar2.j) {
                        StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel2);
                        packageStatisticModel2.statsType = 100;
                        packageStatisticModel2.channel = aVar2.f6780c;
                        packageStatisticModel2.errCode = "403";
                        packageStatisticModel2.errMsg = aVar2.f6793r;
                        packageStatisticModel2.f6776ac = aVar2.f6789n;
                        packageStatisticModel2.patchId = aVar2.f6790o;
                        packageStatisticModel2.f6777id = aVar2.f6791p;
                        packageStatisticModel2.downloadRetryTimes = a(aVar2.f6782e);
                        packageStatisticModel2.downloadUrl = aVar2.f6781d;
                        packageStatisticModel2.downloadFailRecords = b(aVar2.f6782e);
                    } else if (aVar2.f6786k) {
                        StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel3);
                        packageStatisticModel3.accessKey = aVar2.f6778a;
                        packageStatisticModel3.groupName = aVar2.f6779b;
                        packageStatisticModel3.statsType = Integer.valueOf(FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH);
                        packageStatisticModel3.patchId = aVar2.f6790o;
                        packageStatisticModel3.f6777id = aVar2.f6791p;
                        packageStatisticModel3.channel = aVar2.f6780c;
                        packageStatisticModel3.activeCheckDuration = Long.valueOf(aVar2.f6787l - aVar2.g);
                        packageStatisticModel3.applyDuration = Long.valueOf(aVar2.f6788m - aVar2.f6787l);
                    } else {
                        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel4);
                        packageStatisticModel4.accessKey = aVar2.f6778a;
                        packageStatisticModel4.groupName = aVar2.f6779b;
                        packageStatisticModel4.statsType = Integer.valueOf(FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT);
                        packageStatisticModel4.errCode = "501";
                        packageStatisticModel4.channel = aVar2.f6780c;
                        packageStatisticModel4.patchId = aVar2.f6790o;
                        packageStatisticModel4.f6777id = aVar2.f6791p;
                        packageStatisticModel4.errMsg = aVar2.f6794s;
                        a(aVar2, arrayList);
                    }
                } else {
                    StatisticModel.PackageStatisticModel packageStatisticModel5 = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel5);
                    packageStatisticModel5.statsType = 101;
                    packageStatisticModel5.accessKey = aVar2.f6778a;
                    packageStatisticModel5.groupName = aVar2.f6779b;
                    packageStatisticModel5.channel = aVar2.f6780c;
                    packageStatisticModel5.f6776ac = aVar2.f6789n;
                    packageStatisticModel5.patchId = aVar2.f6790o;
                    packageStatisticModel5.f6777id = aVar2.f6791p;
                    packageStatisticModel5.downloadRetryTimes = a(aVar2.f6782e);
                    packageStatisticModel5.downloadUrl = aVar2.f6781d;
                    packageStatisticModel5.downloadFailRecords = b(aVar2.f6782e);
                    if (!aVar2.f6784h) {
                        packageStatisticModel5.errCode = "301";
                        List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list = aVar2.f6782e;
                        if (list != null && !list.isEmpty()) {
                            packageStatisticModel5.errMsg = aVar2.f6782e.get(0).reason;
                        }
                    } else if (!aVar2.f6785i) {
                        packageStatisticModel5.errCode = "402";
                        packageStatisticModel5.errMsg = aVar2.f6792q;
                    }
                    a(aVar2, arrayList);
                }
            }
            a(aVar2, arrayList);
        }
        Context contextA = bVar.a();
        arrayList.addAll(com.bykv.vk.openvk.preload.geckox.a.a.a(contextA));
        if (arrayList.isEmpty()) {
            statisticModel = null;
        } else {
            Common common = new Common(bVar.k(), bVar.o(), bVar.r(), com.bykv.vk.openvk.preload.geckox.utils.a.b(contextA), e.a(contextA), bVar.l(), bVar.m());
            statisticModel = new StatisticModel();
            statisticModel.common = common;
            statisticModel.packages = arrayList;
            String string = UUID.randomUUID().toString();
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((StatisticModel.PackageStatisticModel) obj).logId = string;
            }
        }
        StatisticModel statisticModel2 = statisticModel;
        if (statisticModel2 == null || statisticModel2.packages == null) {
            return;
        }
        IStatisticMonitor iStatisticMonitorQ = bVar.q();
        if (iStatisticMonitorQ != null) {
            try {
                for (StatisticModel.PackageStatisticModel packageStatisticModel6 : statisticModel2.packages) {
                    Common common2 = statisticModel2.common;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("params_for_special", "gecko");
                    jSONObject.put("region", common2.region);
                    jSONObject.put("err_code", packageStatisticModel6.errCode);
                    jSONObject.put("err_msg", packageStatisticModel6.errMsg);
                    jSONObject.put("sdk_version", common2.sdkVersion);
                    jSONObject.put("access_key", packageStatisticModel6.accessKey);
                    jSONObject.put("stats_type", packageStatisticModel6.statsType);
                    jSONObject.put("device_id", common2.deviceId);
                    Long l10 = packageStatisticModel6.patchId;
                    jSONObject.put("patch_id", l10 == null ? 0L : l10.longValue());
                    jSONObject.put("group_name", packageStatisticModel6.groupName);
                    jSONObject.put("os", common2.os);
                    jSONObject.put("app_version", common2.appVersion);
                    jSONObject.put("device_model", common2.deviceModel);
                    jSONObject.put("channel", packageStatisticModel6.channel);
                    Long l11 = packageStatisticModel6.f6777id;
                    jSONObject.put(FacebookMediationAdapter.KEY_ID, l11 == null ? 0L : l11.longValue());
                    jSONObject.put("ac", common2.f6761ac);
                    Integer num = packageStatisticModel6.downloadRetryTimes;
                    jSONObject.put("download_retry_times", num == null ? 0 : num.intValue());
                    String str = packageStatisticModel6.downloadUrl;
                    Object obj2 = "";
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("download_url", str);
                    jSONObject.put("download_duration", packageStatisticModel6.downloadDuration);
                    List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list2 = packageStatisticModel6.downloadFailRecords;
                    if (list2 != null) {
                        obj2 = list2;
                    }
                    jSONObject.put("download_fail_records", obj2);
                    jSONObject.put("log_id", packageStatisticModel6.logId);
                    Long l12 = packageStatisticModel6.activeCheckDuration;
                    jSONObject.put("active_check_duration", l12 == null ? 0L : l12.longValue());
                    Long l13 = packageStatisticModel6.applyDuration;
                    jSONObject.put("apply_duration", l13 == null ? 0L : l13.longValue());
                    iStatisticMonitorQ.upload("geckosdk_update_stats", jSONObject);
                }
            } catch (Throwable th2) {
                GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th2);
            }
        }
        if (bVar.c()) {
            try {
                final String json = statisticModel2.toJson();
                if (TextUtils.isEmpty(json)) {
                    return;
                }
                final String str2 = "https://" + bVar.j() + "/gecko/server/packages/stats";
                com.bykv.vk.openvk.preload.geckox.b.g().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.c.1
                    @Override // java.lang.Runnable
                    public final void run() throws NetworkErrorException {
                        Response responseDoPost;
                        for (int i10 = 0; i10 < 3; i10++) {
                            try {
                                responseDoPost = bVar.i().doPost(str2, json);
                            } catch (Exception e2) {
                                GeckoLogger.w("gecko-debug-tag", "upload statistic:", e2);
                            }
                            if (responseDoPost.code != 200) {
                                throw new NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str2);
                            }
                            if (new JSONObject(responseDoPost.body).getInt("status") == 0) {
                                return;
                            }
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }
}
