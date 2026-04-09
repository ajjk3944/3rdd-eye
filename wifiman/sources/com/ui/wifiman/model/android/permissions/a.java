package com.ui.wifiman.model.android.permissions;

import Zg.AbstractC3689v;
import android.annotation.SuppressLint;
import android.os.Build;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    @SuppressLint({"InlinedApi"})
    public static final a BLUETOOTH;
    public static final a CAMERA;
    public static final a LOCATION;
    public static final a LOCATION_FINE;

    @SuppressLint({"InlinedApi"})
    public static final a NOTIFICATION;
    public static final a PHONE_STATE;
    private final boolean allRequired;
    private final boolean alwaysGranted;
    private final List<String> apiID;

    private static final /* synthetic */ a[] $values() {
        return new a[]{LOCATION, LOCATION_FINE, BLUETOOTH, PHONE_STATE, CAMERA, NOTIFICATION};
    }

    static {
        boolean z10 = false;
        LOCATION = new a("LOCATION", 0, AbstractC3689v.o("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"), false, z10, 4, null);
        boolean z11 = false;
        LOCATION_FINE = new a("LOCATION_FINE", 1, AbstractC3689v.e("android.permission.ACCESS_FINE_LOCATION"), z11, false, 6, null);
        int i10 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z12 = false;
        BLUETOOTH = new a("BLUETOOTH", 2, AbstractC3689v.o("android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN"), z10, z12, i10, defaultConstructorMarker);
        PHONE_STATE = new a("PHONE_STATE", 3, AbstractC3689v.e("android.permission.READ_PHONE_STATE"), false, z11, 6, null);
        CAMERA = new a("CAMERA", 4, AbstractC3689v.e("android.permission.CAMERA"), z10, z12, i10, defaultConstructorMarker);
        NOTIFICATION = new a("NOTIFICATION", 5, AbstractC3689v.e("android.permission.POST_NOTIFICATIONS"), false, Build.VERSION.SDK_INT < 33, 2, null);
        a[] aVarArr$values = $values();
        $VALUES = aVarArr$values;
        $ENTRIES = AbstractC5827b.a(aVarArr$values);
    }

    private a(String str, int i10, List list, boolean z10, boolean z11) {
        this.apiID = list;
        this.allRequired = z10;
        this.alwaysGranted = z11;
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final boolean getAllRequired() {
        return this.allRequired;
    }

    public final boolean getAlwaysGranted() {
        return this.alwaysGranted;
    }

    public final List<String> getApiID() {
        return this.apiID;
    }

    /* synthetic */ a(String str, int i10, List list, boolean z10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, list, (i11 & 2) != 0 ? true : z10, (i11 & 4) != 0 ? false : z11);
    }
}
