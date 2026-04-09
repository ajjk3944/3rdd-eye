package com.lefan.base.dialog;

import androidx.annotation.Keep;
import q5.e;
import q5.i;

@Keep
/* loaded from: classes.dex */
public final class UpdateInfo {
    private final String ApkMd5;
    private final int ApkSize;
    private final String DownloadUrl;
    private final String ModifyContent;
    private final String ModifyContent_en;
    private final String UploadTime;
    private final int VersionCode;
    private final String VersionName;

    public UpdateInfo() {
        this(null, null, null, null, 0, null, null, 0, 255, null);
    }

    public final String getApkMd5() {
        return this.ApkMd5;
    }

    public final int getApkSize() {
        return this.ApkSize;
    }

    public final String getDownloadUrl() {
        return this.DownloadUrl;
    }

    public final String getModifyContent() {
        return this.ModifyContent;
    }

    public final String getModifyContent_en() {
        return this.ModifyContent_en;
    }

    public final String getUploadTime() {
        return this.UploadTime;
    }

    public final int getVersionCode() {
        return this.VersionCode;
    }

    public final String getVersionName() {
        return this.VersionName;
    }

    public UpdateInfo(String str, String str2, String str3, String str4, int i, String str5, String str6, int i3) {
        i.e(str, "ModifyContent");
        i.e(str2, "ModifyContent_en");
        i.e(str3, "DownloadUrl");
        i.e(str4, "ApkMd5");
        i.e(str5, "VersionName");
        i.e(str6, "UploadTime");
        this.ModifyContent = str;
        this.ModifyContent_en = str2;
        this.DownloadUrl = str3;
        this.ApkMd5 = str4;
        this.VersionCode = i;
        this.VersionName = str5;
        this.UploadTime = str6;
        this.ApkSize = i3;
    }

    public /* synthetic */ UpdateInfo(String str, String str2, String str3, String str4, int i, String str5, String str6, int i3, int i6, e eVar) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? "" : str3, (i6 & 8) != 0 ? "" : str4, (i6 & 16) != 0 ? 0 : i, (i6 & 32) != 0 ? "" : str5, (i6 & 64) != 0 ? "" : str6, (i6 & 128) != 0 ? 0 : i3);
    }
}
