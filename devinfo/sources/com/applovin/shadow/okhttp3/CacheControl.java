package com.applovin.shadow.okhttp3;

import java.util.concurrent.TimeUnit;
import je.u;
import nk.f;
import nk.k;
import vk.i;
import yj.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class CacheControl {
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;
    public static final Companion Companion = new Companion(null);
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j) {
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }

        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        public final Builder maxAge(int i4, TimeUnit timeUnit) {
            k.e(timeUnit, "timeUnit");
            if (i4 < 0) {
                throw new IllegalArgumentException(u.r(i4, "maxAge < 0: ").toString());
            }
            this.maxAgeSeconds = clampToInt(timeUnit.toSeconds(i4));
            return this;
        }

        public final Builder maxStale(int i4, TimeUnit timeUnit) {
            k.e(timeUnit, "timeUnit");
            if (i4 < 0) {
                throw new IllegalArgumentException(u.r(i4, "maxStale < 0: ").toString());
            }
            this.maxStaleSeconds = clampToInt(timeUnit.toSeconds(i4));
            return this;
        }

        public final Builder minFresh(int i4, TimeUnit timeUnit) {
            k.e(timeUnit, "timeUnit");
            if (i4 < 0) {
                throw new IllegalArgumentException(u.r(i4, "minFresh < 0: ").toString());
            }
            this.minFreshSeconds = clampToInt(timeUnit.toSeconds(i4));
            return this;
        }

        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private final int indexOfElement(String str, String str2, int i4) {
            int length = str.length();
            while (i4 < length) {
                if (i.z0(str2, str.charAt(i4))) {
                    return i4;
                }
                i4++;
            }
            return str.length();
        }

        public static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i4, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                i4 = 0;
            }
            return companion.indexOfElement(str, str2, i4);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.applovin.shadow.okhttp3.CacheControl parse(com.applovin.shadow.okhttp3.Headers r26) {
            /*
                Method dump skipped, instructions count: 395
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.CacheControl.Companion.parse(com.applovin.shadow.okhttp3.Headers):com.applovin.shadow.okhttp3.CacheControl");
        }

        private Companion() {
        }
    }

    public /* synthetic */ CacheControl(boolean z3, boolean z10, int i4, int i10, boolean z11, boolean z12, boolean z13, int i11, int i12, boolean z14, boolean z15, boolean z16, String str, f fVar) {
        this(z3, z10, i4, i10, z11, z12, z13, i11, i12, z14, z15, z16, str);
    }

    public static final CacheControl parse(Headers headers) {
        return Companion.parse(headers);
    }

    @a
    /* renamed from: -deprecated_immutable, reason: not valid java name */
    public final boolean m12deprecated_immutable() {
        return this.immutable;
    }

    @a
    /* renamed from: -deprecated_maxAgeSeconds, reason: not valid java name */
    public final int m13deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @a
    /* renamed from: -deprecated_maxStaleSeconds, reason: not valid java name */
    public final int m14deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @a
    /* renamed from: -deprecated_minFreshSeconds, reason: not valid java name */
    public final int m15deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    @a
    /* renamed from: -deprecated_mustRevalidate, reason: not valid java name */
    public final boolean m16deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    @a
    /* renamed from: -deprecated_noCache, reason: not valid java name */
    public final boolean m17deprecated_noCache() {
        return this.noCache;
    }

    @a
    /* renamed from: -deprecated_noStore, reason: not valid java name */
    public final boolean m18deprecated_noStore() {
        return this.noStore;
    }

    @a
    /* renamed from: -deprecated_noTransform, reason: not valid java name */
    public final boolean m19deprecated_noTransform() {
        return this.noTransform;
    }

    @a
    /* renamed from: -deprecated_onlyIfCached, reason: not valid java name */
    public final boolean m20deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    @a
    /* renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name */
    public final int m21deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public final boolean immutable() {
        return this.immutable;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public final boolean noCache() {
        return this.noCache;
    }

    public final boolean noStore() {
        return this.noStore;
    }

    public final boolean noTransform() {
        return this.noTransform;
    }

    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.noCache) {
            sb2.append("no-cache, ");
        }
        if (this.noStore) {
            sb2.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            sb2.append("max-age=");
            sb2.append(this.maxAgeSeconds);
            sb2.append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.sMaxAgeSeconds);
            sb2.append(", ");
        }
        if (this.isPrivate) {
            sb2.append("private, ");
        }
        if (this.isPublic) {
            sb2.append("public, ");
        }
        if (this.mustRevalidate) {
            sb2.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            sb2.append("max-stale=");
            sb2.append(this.maxStaleSeconds);
            sb2.append(", ");
        }
        if (this.minFreshSeconds != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.minFreshSeconds);
            sb2.append(", ");
        }
        if (this.onlyIfCached) {
            sb2.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb2.append("no-transform, ");
        }
        if (this.immutable) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        k.d(string, "StringBuilder().apply(builderAction).toString()");
        this.headerValue = string;
        return string;
    }

    private CacheControl(boolean z3, boolean z10, int i4, int i10, boolean z11, boolean z12, boolean z13, int i11, int i12, boolean z14, boolean z15, boolean z16, String str) {
        this.noCache = z3;
        this.noStore = z10;
        this.maxAgeSeconds = i4;
        this.sMaxAgeSeconds = i10;
        this.isPrivate = z11;
        this.isPublic = z12;
        this.mustRevalidate = z13;
        this.maxStaleSeconds = i11;
        this.minFreshSeconds = i12;
        this.onlyIfCached = z14;
        this.noTransform = z15;
        this.immutable = z16;
        this.headerValue = str;
    }
}
