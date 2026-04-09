package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.at;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class cm0 {

    /* renamed from: a, reason: collision with root package name */
    private final te2 f25701a;

    public static final class a implements Comparator<yi1> {
        @Override // java.util.Comparator
        public final int compare(yi1 yi1Var, yi1 yi1Var2) {
            yi1 first = yi1Var;
            yi1 second = yi1Var2;
            kotlin.jvm.internal.l.f(first, "first");
            kotlin.jvm.internal.l.f(second, "second");
            if (first.equals(second)) {
                return 0;
            }
            String strE = first.a().e();
            String strE2 = second.a().e();
            if (kotlin.jvm.internal.l.b(strE, InstreamAdBreakType.PREROLL)) {
                return -1;
            }
            if (kotlin.jvm.internal.l.b(strE2, InstreamAdBreakType.PREROLL) || kotlin.jvm.internal.l.b(strE, InstreamAdBreakType.POSTROLL)) {
                return 1;
            }
            return (!kotlin.jvm.internal.l.b(strE2, InstreamAdBreakType.POSTROLL) && first.b() >= second.b()) ? 1 : -1;
        }
    }

    public cm0(te2 videoPlayerController) {
        kotlin.jvm.internal.l.f(videoPlayerController, "videoPlayerController");
        this.f25701a = videoPlayerController;
    }

    public final bm0 a(List<zs> adBreaks) {
        Object obj;
        Object next;
        kotlin.jvm.internal.l.f(adBreaks, "adBreaks");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : adBreaks) {
            if (kotlin.jvm.internal.l.b(((zs) obj2).e(), InstreamAdBreakType.MIDROLL)) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zs zsVar = (zs) it.next();
            at atVarB = zsVar.b();
            long jB = atVarB.b();
            if (at.a.f24806b == atVarB.a()) {
                jB = (long) ((jB / 100) * this.f25701a.b());
            }
            arrayList.add(new yi1(zsVar, jB));
        }
        Collections.sort(arrayList, new a());
        Iterator<T> it2 = adBreaks.iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (kotlin.jvm.internal.l.b(((zs) next).e(), InstreamAdBreakType.PREROLL)) {
                break;
            }
        }
        zs zsVar2 = (zs) next;
        Iterator<T> it3 = adBreaks.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            if (kotlin.jvm.internal.l.b(((zs) next2).e(), InstreamAdBreakType.POSTROLL)) {
                obj = next2;
                break;
            }
        }
        return new bm0(arrayList, zsVar2, (zs) obj);
    }
}
