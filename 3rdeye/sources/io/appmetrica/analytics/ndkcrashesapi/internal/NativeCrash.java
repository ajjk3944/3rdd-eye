package io.appmetrica.analytics.ndkcrashesapi.internal;

import kotlin.jvm.internal.g;

/* loaded from: classes3.dex */
public final class NativeCrash {

    /* renamed from: a, reason: collision with root package name */
    private final NativeCrashSource f42330a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42331b;

    /* renamed from: c, reason: collision with root package name */
    private final String f42332c;

    /* renamed from: d, reason: collision with root package name */
    private final String f42333d;

    /* renamed from: e, reason: collision with root package name */
    private final long f42334e;

    /* renamed from: f, reason: collision with root package name */
    private final String f42335f;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final NativeCrashSource f42336a;

        /* renamed from: b, reason: collision with root package name */
        private final String f42337b;

        /* renamed from: c, reason: collision with root package name */
        private final String f42338c;

        /* renamed from: d, reason: collision with root package name */
        private final String f42339d;

        /* renamed from: e, reason: collision with root package name */
        private final long f42340e;

        /* renamed from: f, reason: collision with root package name */
        private final String f42341f;

        public Builder(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j4, String str4) {
            this.f42336a = nativeCrashSource;
            this.f42337b = str;
            this.f42338c = str2;
            this.f42339d = str3;
            this.f42340e = j4;
            this.f42341f = str4;
        }

        public final NativeCrash build() {
            return new NativeCrash(this.f42336a, this.f42337b, this.f42338c, this.f42339d, this.f42340e, this.f42341f, null);
        }
    }

    public /* synthetic */ NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j4, String str4, g gVar) {
        this(nativeCrashSource, str, str2, str3, j4, str4);
    }

    public final long getCreationTime() {
        return this.f42334e;
    }

    public final String getDumpFile() {
        return this.f42333d;
    }

    public final String getHandlerVersion() {
        return this.f42331b;
    }

    public final String getMetadata() {
        return this.f42335f;
    }

    public final NativeCrashSource getSource() {
        return this.f42330a;
    }

    public final String getUuid() {
        return this.f42332c;
    }

    private NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j4, String str4) {
        this.f42330a = nativeCrashSource;
        this.f42331b = str;
        this.f42332c = str2;
        this.f42333d = str3;
        this.f42334e = j4;
        this.f42335f = str4;
    }
}
