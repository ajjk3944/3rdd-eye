package com.yandex.mobile.ads.impl;

import i9.InterfaceC4463a;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ns {

    /* renamed from: c, reason: collision with root package name */
    public static final a f30987c;

    /* renamed from: d, reason: collision with root package name */
    public static final ns f30988d;

    /* renamed from: e, reason: collision with root package name */
    public static final ns f30989e;

    /* renamed from: f, reason: collision with root package name */
    public static final ns f30990f;

    /* renamed from: g, reason: collision with root package name */
    public static final ns f30991g;

    /* renamed from: h, reason: collision with root package name */
    public static final ns f30992h;
    public static final ns i;

    /* renamed from: j, reason: collision with root package name */
    public static final ns f30993j;

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ ns[] f30994k;

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4463a f30995l;

    /* renamed from: b, reason: collision with root package name */
    private final String f30996b;

    public static final class a {
        private a() {
        }

        public static ns a(String value) {
            ns next;
            kotlin.jvm.internal.l.f(value, "value");
            Iterator<ns> it = ns.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.l.b(next.b(), value)) {
                    break;
                }
            }
            return next;
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    static {
        ns nsVar = new ns(0, "BANNER", "banner");
        f30988d = nsVar;
        ns nsVar2 = new ns(1, "INTERSTITIAL", com.vungle.ads.internal.g.PLACEMENT_TYPE_INTERSTITIAL);
        f30989e = nsVar2;
        ns nsVar3 = new ns(2, "REWARDED", com.vungle.ads.internal.g.PLACEMENT_TYPE_REWARDED);
        f30990f = nsVar3;
        ns nsVar4 = new ns(3, "NATIVE", "native");
        f30991g = nsVar4;
        ns nsVar5 = new ns(4, "INSTREAM", "instream");
        f30992h = nsVar5;
        ns nsVar6 = new ns(5, "APPOPENAD", "appopenad");
        i = nsVar6;
        ns nsVar7 = new ns(6, "RETAIL_MEDIA", "retail");
        ns nsVar8 = new ns(7, "FEED", "feed");
        f30993j = nsVar8;
        ns[] nsVarArr = {nsVar, nsVar2, nsVar3, nsVar4, nsVar5, nsVar6, nsVar7, nsVar8};
        f30994k = nsVarArr;
        f30995l = com.google.gson.internal.c.l(nsVarArr);
        f30987c = new a(0);
    }

    private ns(int i10, String str, String str2) {
        this.f30996b = str2;
    }

    public static InterfaceC4463a<ns> a() {
        return f30995l;
    }

    public static ns valueOf(String str) {
        return (ns) Enum.valueOf(ns.class, str);
    }

    public static ns[] values() {
        return (ns[]) f30994k.clone();
    }

    public final String b() {
        return this.f30996b;
    }
}
