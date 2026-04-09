package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class I3 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39611a;

    /* renamed from: b, reason: collision with root package name */
    public final Cif f39612b;

    /* renamed from: c, reason: collision with root package name */
    public final String f39613c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f39614d;

    public I3(Context context, Cif cif, String str, SafePackageManager safePackageManager) {
        this.f39611a = context;
        this.f39612b = cif;
        this.f39613c = str;
        this.f39614d = safePackageManager;
    }

    public final List a() {
        Signature[] apkContentsSigners;
        String sha1;
        List<String> listF = this.f39612b.f();
        boolean zIsEmpty = listF.isEmpty();
        List<String> list = listF;
        if (zIsEmpty) {
            ArrayList arrayList = new ArrayList();
            try {
                if (AndroidUtils.isApiAchieved(28)) {
                    SigningInfo signingInfo = this.f39614d.getPackageInfo(this.f39611a, this.f39613c, 134217728).signingInfo;
                    apkContentsSigners = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                } else {
                    apkContentsSigners = this.f39614d.getPackageInfo(this.f39611a, this.f39613c, 64).signatures;
                }
                if (apkContentsSigners != null) {
                    for (Signature signature : apkContentsSigners) {
                        try {
                            sha1 = StringUtils.formatSha1(MessageDigest.getInstance("SHA1").digest(signature.toByteArray()));
                        } catch (Throwable unused) {
                            sha1 = null;
                        }
                        if (sha1 != null) {
                            arrayList.add(sha1);
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            Collections.sort(arrayList);
            boolean zIsEmpty2 = arrayList.isEmpty();
            list = arrayList;
            if (!zIsEmpty2) {
                this.f39612b.a(arrayList).b();
                list = arrayList;
            }
        }
        return list;
    }
}
