package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ag, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4486ag {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f40520a;

    /* renamed from: b, reason: collision with root package name */
    public static final SparseArray f40521b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f40522c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f40523d;

    static {
        HashMap map = new HashMap();
        Tk tk = Tk.FOREGROUND;
        map.put(tk, 0);
        Tk tk2 = Tk.BACKGROUND;
        map.put(tk2, 1);
        f40520a = Collections.unmodifiableMap(map);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, tk);
        sparseArray.put(1, tk2);
        f40521b = sparseArray;
        HashMap map2 = new HashMap();
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_INIT;
        map2.put(enumC4997ub, 1);
        EnumC4997ub enumC4997ub2 = EnumC4997ub.EVENT_TYPE_REGULAR;
        map2.put(enumC4997ub2, 4);
        EnumC4997ub enumC4997ub3 = EnumC4997ub.EVENT_TYPE_SEND_REFERRER;
        map2.put(enumC4997ub3, 5);
        EnumC4997ub enumC4997ub4 = EnumC4997ub.EVENT_TYPE_ALIVE;
        map2.put(enumC4997ub4, 7);
        EnumC4997ub enumC4997ub5 = EnumC4997ub.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        map2.put(enumC4997ub5, 26);
        EnumC4997ub enumC4997ub6 = EnumC4997ub.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        map2.put(enumC4997ub6, 26);
        EnumC4997ub enumC4997ub7 = EnumC4997ub.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        map2.put(enumC4997ub7, 26);
        EnumC4997ub enumC4997ub8 = EnumC4997ub.EVENT_TYPE_ANR;
        map2.put(enumC4997ub8, 25);
        EnumC4997ub enumC4997ub9 = EnumC4997ub.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC4997ub9, 26);
        EnumC4997ub enumC4997ub10 = EnumC4997ub.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC4997ub10, 26);
        EnumC4997ub enumC4997ub11 = EnumC4997ub.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        map2.put(enumC4997ub11, 27);
        EnumC4997ub enumC4997ub12 = EnumC4997ub.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        map2.put(enumC4997ub12, 27);
        EnumC4997ub enumC4997ub13 = EnumC4997ub.EVENT_TYPE_FIRST_ACTIVATION;
        map2.put(enumC4997ub13, 13);
        EnumC4997ub enumC4997ub14 = EnumC4997ub.EVENT_TYPE_START;
        map2.put(enumC4997ub14, 2);
        EnumC4997ub enumC4997ub15 = EnumC4997ub.EVENT_TYPE_APP_OPEN;
        map2.put(enumC4997ub15, 16);
        EnumC4997ub enumC4997ub16 = EnumC4997ub.EVENT_TYPE_APP_UPDATE;
        map2.put(enumC4997ub16, 17);
        EnumC4997ub enumC4997ub17 = EnumC4997ub.EVENT_TYPE_PERMISSIONS;
        map2.put(enumC4997ub17, 18);
        EnumC4997ub enumC4997ub18 = EnumC4997ub.EVENT_TYPE_APP_FEATURES;
        map2.put(enumC4997ub18, 19);
        EnumC4997ub enumC4997ub19 = EnumC4997ub.EVENT_TYPE_SEND_USER_PROFILE;
        map2.put(enumC4997ub19, 20);
        EnumC4997ub enumC4997ub20 = EnumC4997ub.EVENT_TYPE_SEND_REVENUE_EVENT;
        map2.put(enumC4997ub20, 21);
        EnumC4997ub enumC4997ub21 = EnumC4997ub.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        map2.put(enumC4997ub21, 40);
        EnumC4997ub enumC4997ub22 = EnumC4997ub.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        map2.put(enumC4997ub22, 35);
        map2.put(EnumC4997ub.EVENT_TYPE_CLEANUP, 29);
        EnumC4997ub enumC4997ub23 = EnumC4997ub.EVENT_TYPE_WEBVIEW_SYNC;
        map2.put(enumC4997ub23, 38);
        EnumC4997ub enumC4997ub24 = EnumC4997ub.EVENT_CLIENT_EXTERNAL_ATTRIBUTION;
        map2.put(enumC4997ub24, 42);
        f40522c = Collections.unmodifiableMap(map2);
        HashMap map3 = new HashMap();
        M8 m82 = new M8();
        S8 s82 = new S8(new X8());
        N8 n82 = new N8();
        C5089y3 c5089y3 = new C5089y3(new X8());
        Jn jn = new Jn(new X8());
        Wf wf = new Wf();
        C4763l9 c4763l9A = C4789m9.a();
        c4763l9A.f41177b = wf;
        c4763l9A.f41178c = wf;
        C4789m9 c4789m9 = new C4789m9(c4763l9A);
        C4763l9 c4763l9A2 = C4789m9.a();
        c4763l9A2.f41177b = s82;
        C4789m9 c4789m92 = new C4789m9(c4763l9A2);
        C4763l9 c4763l9A3 = C4789m9.a();
        c4763l9A3.f41177b = c5089y3;
        C4789m9 c4789m93 = new C4789m9(c4763l9A3);
        C4763l9 c4763l9A4 = C4789m9.a();
        c4763l9A4.f41177b = jn;
        C4789m9 c4789m94 = new C4789m9(c4763l9A4);
        C4763l9 c4763l9A5 = C4789m9.a();
        c4763l9A5.f41176a = m82;
        C4789m9 c4789m95 = new C4789m9(c4763l9A5);
        C4763l9 c4763l9A6 = C4789m9.a();
        c4763l9A6.f41177b = new C4856oo(new S8());
        C4789m9 c4789m96 = new C4789m9(c4763l9A6);
        map3.put(enumC4997ub2, c4789m92);
        C4763l9 c4763l9A7 = C4789m9.a();
        c4763l9A7.f41177b = new Yf();
        map3.put(enumC4997ub3, new C4789m9(c4763l9A7));
        C4763l9 c4763l9A8 = C4789m9.a();
        c4763l9A8.f41176a = m82;
        c4763l9A8.f41177b = n82;
        c4763l9A8.f41180e = new C4814n8();
        c4763l9A8.f41181f = new C4840o8();
        map3.put(enumC4997ub4, new C4789m9(c4763l9A8));
        map3.put(enumC4997ub9, c4789m9);
        map3.put(enumC4997ub10, c4789m9);
        map3.put(enumC4997ub11, c4789m93);
        map3.put(enumC4997ub12, c4789m93);
        map3.put(enumC4997ub5, c4789m93);
        map3.put(enumC4997ub6, c4789m93);
        map3.put(enumC4997ub7, c4789m93);
        map3.put(enumC4997ub8, c4789m93);
        C4763l9 c4763l9A9 = C4789m9.a();
        c4763l9A9.f41176a = new M8();
        c4763l9A9.f41177b = c5089y3;
        map3.put(enumC4997ub14, new C4789m9(c4763l9A9));
        EnumC4997ub enumC4997ub25 = EnumC4997ub.EVENT_TYPE_CUSTOM_EVENT;
        C4763l9 c4763l9A10 = C4789m9.a();
        c4763l9A10.f41179d = new Zf();
        map3.put(enumC4997ub25, new C4789m9(c4763l9A10));
        map3.put(enumC4997ub15, c4789m92);
        map3.put(enumC4997ub17, c4789m95);
        map3.put(enumC4997ub18, c4789m95);
        map3.put(enumC4997ub19, c4789m93);
        map3.put(enumC4997ub20, c4789m93);
        map3.put(enumC4997ub21, c4789m93);
        map3.put(enumC4997ub22, c4789m94);
        map3.put(enumC4997ub, c4789m96);
        map3.put(enumC4997ub16, c4789m96);
        map3.put(enumC4997ub13, c4789m92);
        map3.put(enumC4997ub23, c4789m92);
        map3.put(enumC4997ub24, c4789m93);
        f40523d = Collections.unmodifiableMap(map3);
    }

    public static A9 a(Long l5, Long l10, Boolean bool) {
        A9 a92 = new A9();
        if (l5 != null) {
            a92.f39091a = l5.longValue();
            a92.f39092b = ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(l5.longValue() * 1000) / 1000;
        }
        if (l10 != null) {
            a92.f39093c = l10.longValue();
        }
        if (bool != null) {
            a92.f39094d = bool.booleanValue();
        }
        return a92;
    }

    public static void a(C5095y9 c5095y9) {
        C5045w9[] c5045w9Arr = c5095y9.f42132c;
        if (c5045w9Arr != null) {
            for (C5045w9 c5045w9 : c5045w9Arr) {
            }
        }
    }
}
