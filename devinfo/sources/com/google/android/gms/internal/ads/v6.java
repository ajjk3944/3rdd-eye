package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f17532a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17533b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17534c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17535d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17536e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17537f;

    public /* synthetic */ v6(int i4, int i10, int i11, int i12, int i13, int i14) {
        this.f17532a = i4;
        this.f17533b = i10;
        this.f17534c = i11;
        this.f17535d = i12;
        this.f17536e = i13;
        this.f17537f = i14;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static v6 a(String str) {
        mq0.m(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i4 = 0;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i4 >= length) {
                if (i11 == -1 || i12 == -1 || i14 == -1) {
                    return null;
                }
                return new v6(i10, i11, i12, i13, i14, length);
            }
            String strH = mq0.h(strArrSplit[i4].trim());
            switch (strH.hashCode()) {
                case 100571:
                    if (!strH.equals("end")) {
                        break;
                    } else {
                        i12 = i4;
                        break;
                    }
                case 3556653:
                    if (!strH.equals("text")) {
                        break;
                    } else {
                        i14 = i4;
                        break;
                    }
                case 102749521:
                    if (!strH.equals("layer")) {
                        break;
                    } else {
                        i10 = i4;
                        break;
                    }
                case 109757538:
                    if (!strH.equals("start")) {
                        break;
                    } else {
                        i11 = i4;
                        break;
                    }
                case 109780401:
                    if (!strH.equals("style")) {
                        break;
                    } else {
                        i13 = i4;
                        break;
                    }
            }
            i4++;
        }
    }
}
