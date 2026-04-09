package com.bykv.vk.openvk.preload.geckox.statistic.model;

import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class StatisticModel {
    public Common common;
    public List<PackageStatisticModel> packages = new ArrayList();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class PackageStatisticModel {

        /* renamed from: ac, reason: collision with root package name */
        public String f6776ac;
        public String accessKey;
        public Long activeCheckDuration;
        public Long applyDuration;
        public String channel;
        public Long cleanDuration;
        public Integer cleanStrategy;
        public Integer cleanType;
        public Long downloadDuration;
        public List<DownloadFailRecords> downloadFailRecords;
        public Integer downloadRetryTimes;
        public String downloadUrl;
        public String errCode;
        public String errMsg;
        public String groupName;

        /* renamed from: id, reason: collision with root package name */
        public Long f6777id;
        public String logId;
        public Long patchId;
        public Integer statsType;

        /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
        public static class DownloadFailRecords {
            public String domain;
            public String reason;

            public DownloadFailRecords(String str, String str2) {
                this.domain = str;
                this.reason = str2;
            }

            public JSONObject toJson() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("domain", this.domain);
                    jSONObject.put("reason", this.reason);
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }

        public JSONObject toJson() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(FacebookMediationAdapter.KEY_ID, this.f6777id);
                jSONObject.put("stats_type", this.statsType);
                jSONObject.put("patch_id", this.patchId);
                jSONObject.put("err_code", this.errCode);
                jSONObject.put("err_msg", this.errMsg);
                jSONObject.put("channel", this.channel);
                jSONObject.put("access_key", this.accessKey);
                jSONObject.put("group_name", this.groupName);
                jSONObject.put("ac", this.f6776ac);
                jSONObject.put("download_retry_times", this.downloadRetryTimes);
                jSONObject.put("download_url", this.downloadUrl);
                List<DownloadFailRecords> list = this.downloadFailRecords;
                if (list != null && !list.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<DownloadFailRecords> it = this.downloadFailRecords.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next().toJson());
                    }
                    jSONObject.put("download_fail_records", jSONArray);
                }
                jSONObject.put("log_id", this.logId);
                jSONObject.put("download_duration", this.downloadDuration);
                jSONObject.put("active_check_duration", this.activeCheckDuration);
                jSONObject.put("apply_duration", this.applyDuration);
                jSONObject.put("clean_type", this.cleanType);
                jSONObject.put("clean_strategy", this.cleanStrategy);
                jSONObject.put("clean_duration", this.cleanDuration);
                return jSONObject;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public String toJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            Common common = this.common;
            if (common != null) {
                jSONObject.put("common", common.toJson());
            }
            if (this.packages != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator<PackageStatisticModel> it = this.packages.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().toJson());
                }
                jSONObject.put("packages", jSONArray);
            }
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
