package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.qh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4901qh extends BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a, reason: collision with root package name */
    public final String f41477a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f41478b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f41479c;

    /* renamed from: d, reason: collision with root package name */
    public final int f41480d;

    /* renamed from: e, reason: collision with root package name */
    public final int f41481e;

    /* renamed from: f, reason: collision with root package name */
    public final int f41482f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f41483g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f41484h;
    public final Map<String, String> i;

    /* renamed from: j, reason: collision with root package name */
    public final int f41485j;

    public C4901qh(J4 j4) {
        this(j4.f39669a, j4.f39670b, j4.f39672d, j4.f39673e, j4.f39674f, j4.f39675g, j4.f39676h, j4.i, j4.f39677j, j4.f39678k);
    }

    public static C4901qh a() {
        return new C4901qh(null, null, null, null, null, null, null, null, null, null);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4901qh mergeFrom(J4 j4) {
        return new C4901qh((String) WrapUtils.getOrDefaultNullable(j4.f39669a, this.f41477a), (Boolean) WrapUtils.getOrDefaultNullable(j4.f39670b, Boolean.valueOf(this.f41478b)), (Boolean) WrapUtils.getOrDefaultNullable(j4.f39672d, Boolean.valueOf(this.f41479c)), (Integer) WrapUtils.getOrDefaultNullable(j4.f39673e, Integer.valueOf(this.f41480d)), (Integer) WrapUtils.getOrDefaultNullable(j4.f39674f, Integer.valueOf(this.f41481e)), (Integer) WrapUtils.getOrDefaultNullable(j4.f39675g, Integer.valueOf(this.f41482f)), (Boolean) WrapUtils.getOrDefaultNullable(j4.f39676h, Boolean.valueOf(this.f41483g)), (Boolean) WrapUtils.getOrDefaultNullable(j4.i, Boolean.valueOf(this.f41484h)), (Map) WrapUtils.getOrDefaultNullable(j4.f39677j, this.i), (Integer) WrapUtils.getOrDefaultNullable(j4.f39678k, Integer.valueOf(this.f41485j)));
    }

    public C4901qh(String str, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4) {
        this.f41477a = str;
        Boolean bool5 = Boolean.FALSE;
        this.f41478b = ((Boolean) WrapUtils.getOrDefault(bool, bool5)).booleanValue();
        this.f41479c = ((Boolean) WrapUtils.getOrDefault(bool2, bool5)).booleanValue();
        this.f41480d = Math.max(10, ((Integer) WrapUtils.getOrDefault(num, 10)).intValue());
        this.f41481e = ((Integer) WrapUtils.getOrDefault(num2, 7)).intValue();
        this.f41482f = ((Integer) WrapUtils.getOrDefault(num3, 90)).intValue();
        this.f41483g = ((Boolean) WrapUtils.getOrDefault(bool3, bool5)).booleanValue();
        this.f41484h = ((Boolean) WrapUtils.getOrDefault(bool4, Boolean.TRUE)).booleanValue();
        this.i = map;
        this.f41485j = ((Integer) WrapUtils.getOrDefault(num4, 1000)).intValue();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean compareWithOtherArguments(J4 j4) {
        Map<String, String> map;
        String str;
        Boolean bool = j4.f39670b;
        if (bool != null && this.f41478b != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = j4.f39672d;
        if (bool2 != null && this.f41479c != bool2.booleanValue()) {
            return false;
        }
        Integer num = j4.f39673e;
        if (num != null && this.f41480d != num.intValue()) {
            return false;
        }
        Integer num2 = j4.f39674f;
        if (num2 != null && this.f41481e != num2.intValue()) {
            return false;
        }
        Integer num3 = j4.f39675g;
        if (num3 != null && this.f41482f != num3.intValue()) {
            return false;
        }
        Boolean bool3 = j4.f39676h;
        if (bool3 != null && this.f41483g != bool3.booleanValue()) {
            return false;
        }
        Boolean bool4 = j4.i;
        if (bool4 != null && this.f41484h != bool4.booleanValue()) {
            return false;
        }
        String str2 = j4.f39669a;
        if (str2 != null && ((str = this.f41477a) == null || !str.equals(str2))) {
            return false;
        }
        Map<String, String> map2 = j4.f39677j;
        if (map2 != null && ((map = this.i) == null || !map.equals(map2))) {
            return false;
        }
        Integer num4 = j4.f39678k;
        return num4 == null || this.f41485j == num4.intValue();
    }
}
