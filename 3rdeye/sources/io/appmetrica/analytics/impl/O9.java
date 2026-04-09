package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class O9 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f39923a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumSet f39924b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumSet f39925c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumSet f39926d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumSet f39927e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumSet f39928f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumSet f39929g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumSet f39930h;
    public static final List i;

    /* renamed from: j, reason: collision with root package name */
    public static final List f39931j;

    static {
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC4997ub enumC4997ub2 = EnumC4997ub.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        f39923a = CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        EnumC4997ub enumC4997ub3 = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        EnumC4997ub enumC4997ub4 = EnumC4997ub.EVENT_TYPE_PURGE_BUFFER;
        EnumC4997ub enumC4997ub5 = EnumC4997ub.EVENT_TYPE_SEND_REFERRER;
        EnumC4997ub enumC4997ub6 = EnumC4997ub.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC4997ub enumC4997ub7 = EnumC4997ub.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC4997ub enumC4997ub8 = EnumC4997ub.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC4997ub enumC4997ub9 = EnumC4997ub.EVENT_TYPE_SET_SESSION_EXTRA;
        f39924b = EnumSet.of(enumC4997ub3, enumC4997ub4, enumC4997ub5, enumC4997ub6, enumC4997ub7, EnumC4997ub.EVENT_TYPE_ACTIVATION, enumC4997ub8, enumC4997ub2, enumC4997ub9);
        EnumC4997ub enumC4997ub10 = EnumC4997ub.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        EnumC4997ub enumC4997ub11 = EnumC4997ub.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        f39925c = EnumSet.of(enumC4997ub10, enumC4997ub, enumC4997ub2, enumC4997ub8, enumC4997ub11);
        EnumC4997ub enumC4997ub12 = EnumC4997ub.EVENT_TYPE_REGULAR;
        f39926d = EnumSet.of(enumC4997ub, enumC4997ub2, EnumC4997ub.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, EnumC4997ub.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, EnumC4997ub.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, enumC4997ub11, enumC4997ub8, enumC4997ub12, EnumC4997ub.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, EnumC4997ub.EVENT_TYPE_SEND_ECOMMERCE_EVENT, EnumC4997ub.EVENT_TYPE_SEND_REVENUE_EVENT, EnumC4997ub.EVENT_TYPE_SEND_AD_REVENUE_EVENT, enumC4997ub4, EnumC4997ub.EVENT_TYPE_INIT, EnumC4997ub.EVENT_TYPE_SEND_USER_PROFILE, EnumC4997ub.EVENT_TYPE_SET_USER_PROFILE_ID, enumC4997ub5, enumC4997ub6, enumC4997ub7, EnumC4997ub.EVENT_TYPE_FIRST_ACTIVATION, EnumC4997ub.EVENT_TYPE_START, EnumC4997ub.EVENT_TYPE_APP_OPEN, EnumC4997ub.EVENT_TYPE_APP_UPDATE, EnumC4997ub.EVENT_TYPE_ANR);
        f39927e = EnumSet.of(enumC4997ub12);
        f39928f = EnumSet.of(enumC4997ub12);
        f39929g = EnumSet.of(enumC4997ub8);
        f39930h = EnumSet.of(EnumC4997ub.EVENT_TYPE_ALIVE, enumC4997ub4, enumC4997ub9, enumC4997ub2, enumC4997ub8);
        i = Arrays.asList(0, 6145, 4097, 8224);
        f39931j = Arrays.asList(12290);
    }
}
