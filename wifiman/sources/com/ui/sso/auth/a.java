package com.ui.sso.auth;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.ui.sso.auth.a$a, reason: collision with other inner class name */
    public static final class EnumC1372a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ EnumC1372a[] $VALUES;

        /* renamed from: id, reason: collision with root package name */
        private final String f42160id;
        public static final EnumC1372a UBIC = new EnumC1372a("UBIC", 0, "ubic");
        public static final EnumC1372a UBIC_PKCE = new EnumC1372a("UBIC_PKCE", 1, "ubic_pkce");
        public static final EnumC1372a SSO_PASSWORD = new EnumC1372a("SSO_PASSWORD", 2, "sso_password");

        private static final /* synthetic */ EnumC1372a[] $values() {
            return new EnumC1372a[]{UBIC, UBIC_PKCE, SSO_PASSWORD};
        }

        static {
            EnumC1372a[] enumC1372aArr$values = $values();
            $VALUES = enumC1372aArr$values;
            $ENTRIES = AbstractC5827b.a(enumC1372aArr$values);
        }

        private EnumC1372a(String str, int i10, String str2) {
            this.f42160id = str2;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static EnumC1372a valueOf(String str) {
            return (EnumC1372a) Enum.valueOf(EnumC1372a.class, str);
        }

        public static EnumC1372a[] values() {
            return (EnumC1372a[]) $VALUES.clone();
        }

        public final String getId() {
            return this.f42160id;
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    public abstract EnumC1372a b();

    private a() {
    }
}
