package com.applovin.shadow.okhttp3.internal.ws;

import d.h;
import nk.f;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class WebSocketExtensions {
    public static final Companion Companion = new Companion(null);
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";
    public final Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;
    public final Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00aa A[PHI: r7 r9
  0x00aa: PHI (r7v6 java.lang.Integer) = (r7v4 java.lang.Integer), (r7v4 java.lang.Integer), (r7v8 java.lang.Integer) binds: [B:53:0x00dc, B:50:0x00d3, B:33:0x00a8] A[DONT_GENERATE, DONT_INLINE]
  0x00aa: PHI (r9v9 java.lang.Integer) = (r9v4 java.lang.Integer), (r9v6 java.lang.Integer), (r9v4 java.lang.Integer) binds: [B:53:0x00dc, B:50:0x00d3, B:33:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.applovin.shadow.okhttp3.internal.ws.WebSocketExtensions parse(com.applovin.shadow.okhttp3.Headers r19) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 247
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.internal.ws.WebSocketExtensions.Companion.parse(com.applovin.shadow.okhttp3.Headers):com.applovin.shadow.okhttp3.internal.ws.WebSocketExtensions");
        }

        private Companion() {
        }
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z3, Integer num, boolean z10, Integer num2, boolean z11, boolean z12, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = webSocketExtensions.perMessageDeflate;
        }
        if ((i4 & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        if ((i4 & 4) != 0) {
            z10 = webSocketExtensions.clientNoContextTakeover;
        }
        if ((i4 & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        if ((i4 & 16) != 0) {
            z11 = webSocketExtensions.serverNoContextTakeover;
        }
        if ((i4 & 32) != 0) {
            z12 = webSocketExtensions.unknownValues;
        }
        boolean z13 = z11;
        boolean z14 = z12;
        return webSocketExtensions.copy(z3, num, z10, num2, z13, z14);
    }

    public final boolean component1() {
        return this.perMessageDeflate;
    }

    public final Integer component2() {
        return this.clientMaxWindowBits;
    }

    public final boolean component3() {
        return this.clientNoContextTakeover;
    }

    public final Integer component4() {
        return this.serverMaxWindowBits;
    }

    public final boolean component5() {
        return this.serverNoContextTakeover;
    }

    public final boolean component6() {
        return this.unknownValues;
    }

    public final WebSocketExtensions copy(boolean z3, Integer num, boolean z10, Integer num2, boolean z11, boolean z12) {
        return new WebSocketExtensions(z3, num, z10, num2, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && k.a(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && k.a(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        boolean z3 = this.perMessageDeflate;
        ?? r02 = z3;
        if (z3) {
            r02 = 1;
        }
        int i4 = r02 * 31;
        Integer num = this.clientMaxWindowBits;
        int iHashCode = (i4 + (num == null ? 0 : num.hashCode())) * 31;
        ?? r22 = this.clientNoContextTakeover;
        int i10 = r22;
        if (r22 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        Integer num2 = this.serverMaxWindowBits;
        int iHashCode2 = (i11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ?? r23 = this.serverNoContextTakeover;
        int i12 = r23;
        if (r23 != 0) {
            i12 = 1;
        }
        int i13 = (iHashCode2 + i12) * 31;
        boolean z10 = this.unknownValues;
        return i13 + (z10 ? 1 : z10 ? 1 : 0);
    }

    public final boolean noContextTakeover(boolean z3) {
        return z3 ? this.clientNoContextTakeover : this.serverNoContextTakeover;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb2.append(this.perMessageDeflate);
        sb2.append(", clientMaxWindowBits=");
        sb2.append(this.clientMaxWindowBits);
        sb2.append(", clientNoContextTakeover=");
        sb2.append(this.clientNoContextTakeover);
        sb2.append(", serverMaxWindowBits=");
        sb2.append(this.serverMaxWindowBits);
        sb2.append(", serverNoContextTakeover=");
        sb2.append(this.serverNoContextTakeover);
        sb2.append(", unknownValues=");
        return h.x(sb2, this.unknownValues, ')');
    }

    public WebSocketExtensions(boolean z3, Integer num, boolean z10, Integer num2, boolean z11, boolean z12) {
        this.perMessageDeflate = z3;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z10;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z11;
        this.unknownValues = z12;
    }

    public /* synthetic */ WebSocketExtensions(boolean z3, Integer num, boolean z10, Integer num2, boolean z11, boolean z12, int i4, f fVar) {
        this((i4 & 1) != 0 ? false : z3, (i4 & 2) != 0 ? null : num, (i4 & 4) != 0 ? false : z10, (i4 & 8) != 0 ? null : num2, (i4 & 16) != 0 ? false : z11, (i4 & 32) != 0 ? false : z12);
    }
}
