package com.bykv.vk.openvk.preload.falconx.statistic;

import android.os.SystemClock;
import com.bykv.vk.openvk.preload.falconx.a.a;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class InterceptorModel {

    /* renamed from: ac, reason: collision with root package name */
    public String f6622ac;
    public String accessKey;
    public String channel;
    public String errCode;
    public String errMsg;
    public String logId;
    public String mimeType;
    public Long offlineDuration;
    public String offlineRule;
    public Integer offlineStatus;
    public Long onlineDuration;
    public String pageUrl;
    public Long pkgVersion;
    public String resRootDir;
    public Long startTime = Long.valueOf(SystemClock.uptimeMillis());
    public String url;

    public InterceptorModel fromJson(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("resource_url")) {
                this.url = (String) a.a(jSONObject, "resource_url", String.class);
            }
            if (jSONObject.has("access_key")) {
                this.accessKey = (String) a.a(jSONObject, "access_key", String.class);
            }
            if (jSONObject.has("channel")) {
                this.channel = (String) a.a(jSONObject, "channel", String.class);
            }
            if (jSONObject.has("mime_type")) {
                this.mimeType = (String) a.a(jSONObject, "mime_type", String.class);
            }
            if (jSONObject.has("offline_status")) {
                this.offlineStatus = (Integer) a.a(jSONObject, "offline_status", Integer.class);
            }
            if (jSONObject.has("offline_duration")) {
                this.offlineDuration = (Long) a.a(jSONObject, "offline_duration", Long.class);
            }
            if (jSONObject.has("ac")) {
                this.f6622ac = (String) a.a(jSONObject, "ac", String.class);
            }
            if (jSONObject.has("offline_rule")) {
                this.offlineRule = (String) a.a(jSONObject, "offline_rule", String.class);
            }
            if (jSONObject.has("err_code")) {
                this.errCode = (String) a.a(jSONObject, "err_code", String.class);
            }
            if (jSONObject.has("err_msg")) {
                this.errMsg = (String) a.a(jSONObject, "err_msg", String.class);
            }
            if (jSONObject.has("pkg_version")) {
                this.pkgVersion = (Long) a.a(jSONObject, "pkg_version", Long.class);
            }
            if (jSONObject.has("online_duration")) {
                this.onlineDuration = (Long) a.a(jSONObject, "online_duration", Long.class);
            }
            if (jSONObject.has("res_root_dir")) {
                this.resRootDir = (String) a.a(jSONObject, "res_root_dir", String.class);
            }
            if (jSONObject.has("log_id")) {
                this.logId = (String) a.a(jSONObject, "log_id", String.class);
            }
            if (jSONObject.has("startTime")) {
                this.startTime = (Long) a.a(jSONObject, "startTime", Long.class);
            }
            if (jSONObject.has("page_url")) {
                this.pageUrl = (String) a.a(jSONObject, "page_url", String.class);
            }
        } catch (Throwable unused) {
        }
        return this;
    }

    public void loadFinish(boolean z3) {
        if (!z3) {
            this.offlineStatus = 0;
        } else {
            this.offlineDuration = Long.valueOf(SystemClock.uptimeMillis() - this.startTime.longValue());
            this.offlineStatus = 1;
        }
    }

    public void setErrorCode(String str) {
        this.errCode = str;
    }

    public void setErrorMsg(String str) {
        this.errMsg = str;
    }

    public String toJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resource_url", this.url);
            jSONObject.put("access_key", this.accessKey);
            jSONObject.put("channel", this.channel);
            jSONObject.put("mime_type", this.mimeType);
            jSONObject.put("offline_status", this.offlineStatus);
            jSONObject.put("offline_duration", this.offlineDuration);
            jSONObject.put("ac", this.f6622ac);
            jSONObject.put("offline_rule", this.offlineRule);
            jSONObject.put("err_code", this.errCode);
            jSONObject.put("err_msg", this.errMsg);
            jSONObject.put("pkg_version", this.pkgVersion);
            jSONObject.put("online_duration", this.onlineDuration);
            jSONObject.put("res_root_dir", this.resRootDir);
            jSONObject.put("log_id", this.logId);
            jSONObject.put("startTime", this.startTime);
            jSONObject.put("page_url", this.pageUrl);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
