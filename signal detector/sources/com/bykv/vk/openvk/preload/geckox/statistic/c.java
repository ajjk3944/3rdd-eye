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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

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
                jSONObject.put("x_tt_logid", aVar.f6701e);
                jSONObject.put("http_status", aVar.f6703g);
                jSONObject.put("err_msg", aVar.f6700d);
                if (TextUtils.isEmpty(aVar.f6701e)) {
                    jSONObject.put("deployments_info", aVar.f6698b);
                    jSONObject.put("local_info", aVar.f6697a);
                    jSONObject.put("custom_info", aVar.f6699c);
                } else {
                    jSONObject.put("deployments_info", "");
                    jSONObject.put("local_info", "");
                    jSONObject.put("custom_info", "");
                }
                StringBuilder sb = new StringBuilder();
                sb.append(Build.VERSION.SDK_INT);
                jSONObject.put("os_version", sb.toString());
                jSONObject.put("device_platform", "android");
                jSONObject.put("device_model", Build.MODEL);
                jSONObject.put("ac", aVar.f6702f);
                iStatisticMonitorQ.upload("geckosdk_query_pkgs", jSONObject);
            } catch (Throwable th) {
                GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th);
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
        if (aVar.f6814z && aVar.f6786A) {
            StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel);
            packageStatisticModel.statsType = 0;
            packageStatisticModel.accessKey = aVar.f6790a;
            packageStatisticModel.groupName = aVar.f6791b;
            packageStatisticModel.channel = aVar.f6792c;
            packageStatisticModel.ac = aVar.f6802n;
            packageStatisticModel.id = aVar.f6804p;
            packageStatisticModel.downloadRetryTimes = a(aVar.f6809u);
            packageStatisticModel.downloadUrl = aVar.f6808t;
            packageStatisticModel.downloadFailRecords = b(aVar.f6809u);
            packageStatisticModel.downloadDuration = Long.valueOf(aVar.f6811w - aVar.f6810v);
            if (aVar.f6787B) {
                StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
                list.add(packageStatisticModel2);
                packageStatisticModel2.accessKey = aVar.f6790a;
                packageStatisticModel2.groupName = aVar.f6791b;
                packageStatisticModel2.statsType = 2;
                packageStatisticModel2.id = aVar.f6804p;
                packageStatisticModel2.channel = aVar.f6792c;
                packageStatisticModel2.activeCheckDuration = Long.valueOf(aVar.f6812x - aVar.f6811w);
                packageStatisticModel2.applyDuration = Long.valueOf(aVar.f6813y - aVar.f6812x);
                return;
            }
            StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel3);
            packageStatisticModel3.statsType = 3;
            packageStatisticModel3.accessKey = aVar.f6790a;
            packageStatisticModel3.groupName = aVar.f6791b;
            packageStatisticModel3.errCode = "500";
            packageStatisticModel3.id = aVar.f6804p;
            packageStatisticModel3.channel = aVar.f6792c;
            packageStatisticModel3.errMsg = aVar.f6789D;
            return;
        }
        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
        list.add(packageStatisticModel4);
        packageStatisticModel4.statsType = 1;
        packageStatisticModel4.accessKey = aVar.f6790a;
        packageStatisticModel4.groupName = aVar.f6791b;
        packageStatisticModel4.channel = aVar.f6792c;
        packageStatisticModel4.ac = aVar.f6802n;
        packageStatisticModel4.id = aVar.f6804p;
        packageStatisticModel4.downloadRetryTimes = a(aVar.f6809u);
        packageStatisticModel4.downloadUrl = aVar.f6808t;
        packageStatisticModel4.downloadFailRecords = b(aVar.f6809u);
        if (!aVar.f6814z) {
            packageStatisticModel4.errCode = "300";
            List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list2 = aVar.f6809u;
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            packageStatisticModel4.errMsg = aVar.f6809u.get(0).reason;
            return;
        }
        if (aVar.f6786A) {
            return;
        }
        packageStatisticModel4.errCode = "450";
        packageStatisticModel4.errMsg = aVar.f6788C;
    }

    public static void a(final com.bykv.vk.openvk.preload.geckox.b bVar, a aVar) {
        StatisticModel statisticModel;
        ArrayList arrayList = new ArrayList();
        for (com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar2 : aVar.a()) {
            if (aVar2.f6793d != null || aVar2.f6795f != 0) {
                if (aVar2.f6797h && aVar2.i) {
                    StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel);
                    packageStatisticModel.statsType = 100;
                    packageStatisticModel.groupName = aVar2.f6791b;
                    packageStatisticModel.accessKey = aVar2.f6790a;
                    packageStatisticModel.channel = aVar2.f6792c;
                    packageStatisticModel.ac = aVar2.f6802n;
                    packageStatisticModel.id = aVar2.f6804p;
                    packageStatisticModel.patchId = aVar2.f6803o;
                    packageStatisticModel.downloadRetryTimes = a(aVar2.f6794e);
                    packageStatisticModel.downloadUrl = aVar2.f6793d;
                    packageStatisticModel.downloadFailRecords = b(aVar2.f6794e);
                    packageStatisticModel.downloadDuration = Long.valueOf(aVar2.f6796g - aVar2.f6795f);
                    if (!aVar2.f6798j) {
                        StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel2);
                        packageStatisticModel2.statsType = 100;
                        packageStatisticModel2.channel = aVar2.f6792c;
                        packageStatisticModel2.errCode = "403";
                        packageStatisticModel2.errMsg = aVar2.f6806r;
                        packageStatisticModel2.ac = aVar2.f6802n;
                        packageStatisticModel2.patchId = aVar2.f6803o;
                        packageStatisticModel2.id = aVar2.f6804p;
                        packageStatisticModel2.downloadRetryTimes = a(aVar2.f6794e);
                        packageStatisticModel2.downloadUrl = aVar2.f6793d;
                        packageStatisticModel2.downloadFailRecords = b(aVar2.f6794e);
                    } else if (aVar2.f6799k) {
                        StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel3);
                        packageStatisticModel3.accessKey = aVar2.f6790a;
                        packageStatisticModel3.groupName = aVar2.f6791b;
                        packageStatisticModel3.statsType = 102;
                        packageStatisticModel3.patchId = aVar2.f6803o;
                        packageStatisticModel3.id = aVar2.f6804p;
                        packageStatisticModel3.channel = aVar2.f6792c;
                        packageStatisticModel3.activeCheckDuration = Long.valueOf(aVar2.f6800l - aVar2.f6796g);
                        packageStatisticModel3.applyDuration = Long.valueOf(aVar2.f6801m - aVar2.f6800l);
                    } else {
                        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel4);
                        packageStatisticModel4.accessKey = aVar2.f6790a;
                        packageStatisticModel4.groupName = aVar2.f6791b;
                        packageStatisticModel4.statsType = 103;
                        packageStatisticModel4.errCode = "501";
                        packageStatisticModel4.channel = aVar2.f6792c;
                        packageStatisticModel4.patchId = aVar2.f6803o;
                        packageStatisticModel4.id = aVar2.f6804p;
                        packageStatisticModel4.errMsg = aVar2.f6807s;
                        a(aVar2, arrayList);
                    }
                } else {
                    StatisticModel.PackageStatisticModel packageStatisticModel5 = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel5);
                    packageStatisticModel5.statsType = 101;
                    packageStatisticModel5.accessKey = aVar2.f6790a;
                    packageStatisticModel5.groupName = aVar2.f6791b;
                    packageStatisticModel5.channel = aVar2.f6792c;
                    packageStatisticModel5.ac = aVar2.f6802n;
                    packageStatisticModel5.patchId = aVar2.f6803o;
                    packageStatisticModel5.id = aVar2.f6804p;
                    packageStatisticModel5.downloadRetryTimes = a(aVar2.f6794e);
                    packageStatisticModel5.downloadUrl = aVar2.f6793d;
                    packageStatisticModel5.downloadFailRecords = b(aVar2.f6794e);
                    if (!aVar2.f6797h) {
                        packageStatisticModel5.errCode = "301";
                        List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list = aVar2.f6794e;
                        if (list != null && !list.isEmpty()) {
                            packageStatisticModel5.errMsg = aVar2.f6794e.get(0).reason;
                        }
                    } else if (!aVar2.i) {
                        packageStatisticModel5.errCode = "402";
                        packageStatisticModel5.errMsg = aVar2.f6805q;
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
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
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
                    Long l2 = packageStatisticModel6.patchId;
                    jSONObject.put("patch_id", l2 == null ? 0L : l2.longValue());
                    jSONObject.put("group_name", packageStatisticModel6.groupName);
                    jSONObject.put("os", common2.os);
                    jSONObject.put("app_version", common2.appVersion);
                    jSONObject.put("device_model", common2.deviceModel);
                    jSONObject.put("channel", packageStatisticModel6.channel);
                    Long l6 = packageStatisticModel6.id;
                    jSONObject.put("id", l6 == null ? 0L : l6.longValue());
                    jSONObject.put("ac", common2.ac);
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
                    Long l7 = packageStatisticModel6.activeCheckDuration;
                    jSONObject.put("active_check_duration", l7 == null ? 0L : l7.longValue());
                    Long l8 = packageStatisticModel6.applyDuration;
                    jSONObject.put("apply_duration", l8 == null ? 0L : l8.longValue());
                    iStatisticMonitorQ.upload("geckosdk_update_stats", jSONObject);
                }
            } catch (Throwable th) {
                GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th);
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
                        for (int i3 = 0; i3 < 3; i3++) {
                            try {
                                responseDoPost = bVar.i().doPost(str2, json);
                            } catch (Exception e6) {
                                GeckoLogger.w("gecko-debug-tag", "upload statistic:", e6);
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
