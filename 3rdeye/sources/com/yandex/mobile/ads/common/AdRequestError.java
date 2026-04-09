package com.yandex.mobile.ads.common;

import B4.f;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class AdRequestError {

    /* renamed from: a, reason: collision with root package name */
    private final int f23986a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23987b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23988c;

    public static final class Code {
        public static final int INTERNAL_ERROR = 1;
        public static final int INVALID_REQUEST = 2;
        public static final int NETWORK_ERROR = 3;
        public static final int NO_FILL = 4;
        public static final int SYSTEM_ERROR = 5;
        public static final int UNKNOWN_ERROR = 0;

        static {
            new Code();
        }

        private Code() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdRequestError(int i, String description) {
        this(i, description, null, 4, null);
        l.f(description, "description");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AdRequestError.class.equals(obj.getClass())) {
            return false;
        }
        AdRequestError adRequestError = (AdRequestError) obj;
        if (this.f23986a == adRequestError.f23986a && l.b(this.f23988c, adRequestError.f23988c)) {
            return l.b(this.f23987b, adRequestError.f23987b);
        }
        return false;
    }

    public final String getAdUnitId() {
        return this.f23988c;
    }

    public final int getCode() {
        return this.f23986a;
    }

    public final String getDescription() {
        return this.f23987b;
    }

    public int hashCode() {
        int iHashCode = ((this.f23987b.hashCode() * 31) + this.f23986a) * 31;
        String str = this.f23988c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        int i = this.f23986a;
        String str = this.f23987b;
        String str2 = this.f23988c;
        if (str2 == null) {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder("AdRequestError (code: ");
        sb.append(i);
        sb.append(", description: ");
        sb.append(str);
        sb.append(", adUnitId: ");
        return f.c(sb, str2, ")");
    }

    public AdRequestError(int i, String description, String str) {
        l.f(description, "description");
        this.f23986a = i;
        this.f23987b = description;
        this.f23988c = str;
    }

    public /* synthetic */ AdRequestError(int i, String str, String str2, int i10, g gVar) {
        this(i, str, (i10 & 4) != 0 ? null : str2);
    }
}
