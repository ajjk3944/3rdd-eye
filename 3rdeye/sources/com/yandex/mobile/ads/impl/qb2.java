package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2092m;
import c9.C2097r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class qb2<T> {

    /* renamed from: a, reason: collision with root package name */
    private final id2 f32131a;

    /* renamed from: b, reason: collision with root package name */
    private final fa2 f32132b;

    /* renamed from: c, reason: collision with root package name */
    private final ob2<T> f32133c;

    public /* synthetic */ qb2(Context context, fc2 fc2Var) {
        this(context, fc2Var, new id2(), new fa2(context), new ob2(fc2Var));
    }

    public final ArrayList a(List videoAds) {
        List listC0;
        kotlin.jvm.internal.l.f(videoAds, "videoAds");
        this.f32131a.getClass();
        if ((videoAds instanceof Collection) && videoAds.isEmpty()) {
            listC0 = C2097r.G0(videoAds);
        } else {
            Iterator<T> it = videoAds.iterator();
            while (it.hasNext()) {
                if (((za2) it.next()).i() != null) {
                    ArrayList arrayList = new ArrayList();
                    for (T t10 : videoAds) {
                        if (((za2) t10).i() != null) {
                            arrayList.add(t10);
                        }
                    }
                    listC0 = C2097r.C0(new hd2(), arrayList);
                }
            }
            listC0 = C2097r.G0(videoAds);
        }
        ArrayList arrayListA = this.f32132b.a(listC0);
        int size = arrayListA.size();
        ArrayList arrayList2 = new ArrayList(C2092m.T(arrayListA, 10));
        Iterator it2 = arrayListA.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i10 = i + 1;
            if (i < 0) {
                C2092m.a0();
                throw null;
            }
            arrayList2.add(this.f32133c.a((ea2) next, size, i));
            i = i10;
        }
        return arrayList2;
    }

    public qb2(Context context, fc2<T> playbackInfoCreator, id2 videoAdsOrderFilter, fa2 vastVideoAdsDataProvider, ob2<T> videoAdInfoCreator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(playbackInfoCreator, "playbackInfoCreator");
        kotlin.jvm.internal.l.f(videoAdsOrderFilter, "videoAdsOrderFilter");
        kotlin.jvm.internal.l.f(vastVideoAdsDataProvider, "vastVideoAdsDataProvider");
        kotlin.jvm.internal.l.f(videoAdInfoCreator, "videoAdInfoCreator");
        this.f32131a = videoAdsOrderFilter;
        this.f32132b = vastVideoAdsDataProvider;
        this.f32133c = videoAdInfoCreator;
    }
}
