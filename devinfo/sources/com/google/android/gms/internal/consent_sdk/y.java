package com.google.android.gms.internal.consent_sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final y f19568a;

    /* renamed from: b, reason: collision with root package name */
    public static final y f19569b;

    /* renamed from: c, reason: collision with root package name */
    public static final y f19570c;

    /* renamed from: d, reason: collision with root package name */
    public static final y f19571d;

    /* renamed from: e, reason: collision with root package name */
    public static final y f19572e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ y[] f19573f;

    /* JADX INFO: Fake field, exist only in values array */
    y EF0;

    static {
        y yVar = new y("DEBUG_PARAM_UNKNOWN", 0);
        y yVar2 = new y("ALWAYS_SHOW", 1);
        y yVar3 = new y("GEO_OVERRIDE_EEA", 2);
        f19568a = yVar3;
        y yVar4 = new y("GEO_OVERRIDE_REGULATED_US_STATE", 3);
        f19569b = yVar4;
        y yVar5 = new y("GEO_OVERRIDE_OTHER", 4);
        f19570c = yVar5;
        y yVar6 = new y("GEO_OVERRIDE_NON_EEA", 5);
        f19571d = yVar6;
        y yVar7 = new y("PREVIEWING_DEBUG_MESSAGES", 6);
        f19572e = yVar7;
        f19573f = new y[]{yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7, new y("GEO_OVERRIDE_USFL", 7)};
    }

    public static y[] values() {
        return (y[]) f19573f.clone();
    }
}
