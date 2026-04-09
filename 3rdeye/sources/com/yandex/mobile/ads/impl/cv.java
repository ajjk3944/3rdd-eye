package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class cv implements em {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f25773b = 0;

    static {
        new cv(xj0.h());
    }

    public cv(List<av> list) {
        xj0.a((Collection) list);
    }

    private static final cv a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        return new cv(parcelableArrayList == null ? xj0.h() : fm.a(av.f24819t, parcelableArrayList));
    }
}
