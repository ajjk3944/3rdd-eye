package com.applovin.shadow.okhttp3.internal.ws;

import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import je.u;
import nk.k;
import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class WebSocketProtocol {
    public static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int B0_FLAG_FIN = 128;
    public static final int B0_FLAG_RSV1 = 64;
    public static final int B0_FLAG_RSV2 = 32;
    public static final int B0_FLAG_RSV3 = 16;
    public static final int B0_MASK_OPCODE = 15;
    public static final int B1_FLAG_MASK = 128;
    public static final int B1_MASK_LENGTH = 127;
    public static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    public static final long CLOSE_MESSAGE_MAX = 123;
    public static final int CLOSE_NO_STATUS_CODE = 1005;
    public static final WebSocketProtocol INSTANCE = new WebSocketProtocol();
    public static final int OPCODE_BINARY = 2;
    public static final int OPCODE_CONTINUATION = 0;
    public static final int OPCODE_CONTROL_CLOSE = 8;
    public static final int OPCODE_CONTROL_PING = 9;
    public static final int OPCODE_CONTROL_PONG = 10;
    public static final int OPCODE_FLAG_CONTROL = 8;
    public static final int OPCODE_TEXT = 1;
    public static final long PAYLOAD_BYTE_MAX = 125;
    public static final int PAYLOAD_LONG = 127;
    public static final int PAYLOAD_SHORT = 126;
    public static final long PAYLOAD_SHORT_MAX = 65535;

    private WebSocketProtocol() {
    }

    public final String acceptHeader(String str) {
        k.e(str, "key");
        return ByteString.Companion.encodeUtf8(str.concat(ACCEPT_MAGIC)).sha1().base64();
    }

    public final String closeCodeExceptionMessage(int i4) {
        if (i4 < 1000 || i4 >= 5000) {
            return u.r(i4, "Code must be in range [1000,5000): ");
        }
        if ((1004 > i4 || i4 >= 1007) && (1015 > i4 || i4 >= 3000)) {
            return null;
        }
        return c.h(i4, "Code ", " is reserved and may not be used.");
    }

    public final void toggleMask(Buffer.UnsafeCursor unsafeCursor, byte[] bArr) {
        k.e(unsafeCursor, "cursor");
        k.e(bArr, "key");
        int length = bArr.length;
        int i4 = 0;
        do {
            byte[] bArr2 = unsafeCursor.data;
            int i10 = unsafeCursor.start;
            int i11 = unsafeCursor.end;
            if (bArr2 != null) {
                while (i10 < i11) {
                    int i12 = i4 % length;
                    bArr2[i10] = (byte) (bArr2[i10] ^ bArr[i12]);
                    i10++;
                    i4 = i12 + 1;
                }
            }
        } while (unsafeCursor.next() != -1);
    }

    public final void validateCloseCode(int i4) {
        String strCloseCodeExceptionMessage = closeCodeExceptionMessage(i4);
        if (strCloseCodeExceptionMessage == null) {
            return;
        }
        k.b(strCloseCodeExceptionMessage);
        throw new IllegalArgumentException(strCloseCodeExceptionMessage.toString());
    }
}
