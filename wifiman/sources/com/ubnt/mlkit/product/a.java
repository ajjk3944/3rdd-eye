package com.ubnt.mlkit.product;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1244a f39289a = C1244a.f39290a;

    /* renamed from: com.ubnt.mlkit.product.a$a, reason: collision with other inner class name */
    public static final class C1244a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C1244a f39290a = new C1244a();

        /* renamed from: b, reason: collision with root package name */
        private static final a f39291b = new com.ubnt.mlkit.product.b();

        private C1244a() {
        }

        public final a a() {
            return f39291b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b AMPLIFI_ALIEN;
        public static final b UDM;
        private final float minRequiredConfidence;
        public static final b UNIFI_AP = new b("UNIFI_AP", 0, 0.0f, 1, null);
        public static final b UNIFI_AP_INWALL = new b("UNIFI_AP_INWALL", 1, 0.9f);
        public static final b UNIFI_AP_FLEX = new b("UNIFI_AP_FLEX", 2, 0.9f);
        public static final b AMPLIFI = new b("AMPLIFI", 3, 0.0f, 1, null);
        public static final b AMPLIFI_INSTANT = new b("AMPLIFI_INSTANT", 4, 0.0f, 1, null);
        public static final b AMPLIFI_MESHPOINT = new b("AMPLIFI_MESHPOINT", 6, 0.0f, 1, null);

        private static final /* synthetic */ b[] $values() {
            return new b[]{UNIFI_AP, UNIFI_AP_INWALL, UNIFI_AP_FLEX, AMPLIFI, AMPLIFI_INSTANT, AMPLIFI_ALIEN, AMPLIFI_MESHPOINT, UDM};
        }

        static {
            int i10 = 1;
            DefaultConstructorMarker defaultConstructorMarker = null;
            float f10 = 0.0f;
            AMPLIFI_ALIEN = new b("AMPLIFI_ALIEN", 5, f10, i10, defaultConstructorMarker);
            UDM = new b("UDM", 7, f10, i10, defaultConstructorMarker);
            b[] bVarArr$values = $values();
            $VALUES = bVarArr$values;
            $ENTRIES = AbstractC5827b.a(bVarArr$values);
        }

        private b(String str, int i10, float f10) {
            this.minRequiredConfidence = f10;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final float getMinRequiredConfidence$ar_object_detection_release() {
            return this.minRequiredConfidence;
        }

        /* synthetic */ b(String str, int i10, float f10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, (i11 & 1) != 0 ? 0.8f : f10);
        }
    }

    b a(String str, float f10);
}
