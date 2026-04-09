package com.yandex.mobile.ads.impl;

import N7.C1418x4;
import android.net.Uri;
import b9.m;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class t20 {

    /* renamed from: a, reason: collision with root package name */
    private final d20 f33378a;

    public /* synthetic */ t20(int i) {
        this(new d20());
    }

    public final s20 a(N7.S2 divBase) {
        Object objA;
        kotlin.jvm.internal.l.f(divBase, "divBase");
        this.f33378a.getClass();
        C1418x4 c1418x4A = d20.a(divBase, "click");
        if (c1418x4A == null) {
            return null;
        }
        try {
            JSONObject jSONObject = c1418x4A.f9756b;
            objA = Uri.parse(jSONObject != null ? jSONObject.getString(ImagesContract.URL) : null);
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        if (objA instanceof m.a) {
            objA = null;
        }
        Uri uri = (Uri) objA;
        if (uri != null) {
            return new s20(uri);
        }
        return null;
    }

    public t20(d20 divExtensionProvider) {
        kotlin.jvm.internal.l.f(divExtensionProvider, "divExtensionProvider");
        this.f33378a = divExtensionProvider;
    }
}
