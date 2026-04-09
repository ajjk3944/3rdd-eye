package com.applovin.shadow.okhttp3;

import cm.g;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Source;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import nk.f;
import nk.k;
import yj.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class RequestBody {
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, String str, MediaType mediaType, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        @a
        public final RequestBody create(MediaType mediaType, byte[] bArr) {
            k.e(bArr, AppLovinEventTypes.USER_VIEWED_CONTENT);
            return create$default(this, mediaType, bArr, 0, 0, 12, (Object) null);
        }

        private Companion() {
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, ByteString byteString, MediaType mediaType, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(byteString, mediaType);
        }

        @a
        public final RequestBody create(MediaType mediaType, byte[] bArr, int i4) {
            k.e(bArr, AppLovinEventTypes.USER_VIEWED_CONTENT);
            return create$default(this, mediaType, bArr, i4, 0, 8, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i4, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                mediaType = null;
            }
            if ((i11 & 2) != 0) {
                i4 = 0;
            }
            if ((i11 & 4) != 0) {
                i10 = bArr.length;
            }
            return companion.create(bArr, mediaType, i4, i10);
        }

        public final RequestBody create(byte[] bArr) {
            k.e(bArr, "<this>");
            return create$default(this, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType) {
            k.e(bArr, "<this>");
            return create$default(this, bArr, mediaType, 0, 0, 6, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType, int i4) {
            k.e(bArr, "<this>");
            return create$default(this, bArr, mediaType, i4, 0, 4, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i4, int i10, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                i4 = 0;
            }
            if ((i11 & 8) != 0) {
                i10 = bArr.length;
            }
            return companion.create(mediaType, bArr, i4, i10);
        }

        public final RequestBody create(String str, MediaType mediaType) {
            k.e(str, "<this>");
            Charset charset = vk.a.f36267a;
            if (mediaType != null) {
                Charset charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charsetCharset$default == null) {
                    mediaType = MediaType.Companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetCharset$default;
                }
            }
            byte[] bytes = str.getBytes(charset);
            k.d(bytes, "this as java.lang.String).getBytes(charset)");
            return create(bytes, mediaType, 0, bytes.length);
        }

        public final RequestBody create(final ByteString byteString, final MediaType mediaType) {
            k.e(byteString, "<this>");
            return new RequestBody() { // from class: com.applovin.shadow.okhttp3.RequestBody$Companion$toRequestBody$1
                @Override // com.applovin.shadow.okhttp3.RequestBody
                public long contentLength() {
                    return byteString.size();
                }

                @Override // com.applovin.shadow.okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // com.applovin.shadow.okhttp3.RequestBody
                public void writeTo(BufferedSink bufferedSink) throws IOException {
                    k.e(bufferedSink, "sink");
                    bufferedSink.write(byteString);
                }
            };
        }

        public final RequestBody create(final byte[] bArr, final MediaType mediaType, final int i4, final int i10) {
            k.e(bArr, "<this>");
            Util.checkOffsetAndCount(bArr.length, i4, i10);
            return new RequestBody() { // from class: com.applovin.shadow.okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // com.applovin.shadow.okhttp3.RequestBody
                public long contentLength() {
                    return i10;
                }

                @Override // com.applovin.shadow.okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // com.applovin.shadow.okhttp3.RequestBody
                public void writeTo(BufferedSink bufferedSink) throws IOException {
                    k.e(bufferedSink, "sink");
                    bufferedSink.write(bArr, i4, i10);
                }
            };
        }

        public final RequestBody create(final File file, final MediaType mediaType) {
            k.e(file, "<this>");
            return new RequestBody() { // from class: com.applovin.shadow.okhttp3.RequestBody$Companion$asRequestBody$1
                @Override // com.applovin.shadow.okhttp3.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // com.applovin.shadow.okhttp3.RequestBody
                public MediaType contentType() {
                    return mediaType;
                }

                @Override // com.applovin.shadow.okhttp3.RequestBody
                public void writeTo(BufferedSink bufferedSink) throws FileNotFoundException {
                    k.e(bufferedSink, "sink");
                    Source source = Okio.source(file);
                    try {
                        bufferedSink.writeAll(source);
                        g.e(source, null);
                    } finally {
                    }
                }
            };
        }

        @a
        public final RequestBody create(MediaType mediaType, String str) {
            k.e(str, AppLovinEventTypes.USER_VIEWED_CONTENT);
            return create(str, mediaType);
        }

        @a
        public final RequestBody create(MediaType mediaType, ByteString byteString) {
            k.e(byteString, AppLovinEventTypes.USER_VIEWED_CONTENT);
            return create(byteString, mediaType);
        }

        @a
        public final RequestBody create(MediaType mediaType, byte[] bArr, int i4, int i10) {
            k.e(bArr, AppLovinEventTypes.USER_VIEWED_CONTENT);
            return create(bArr, mediaType, i4, i10);
        }

        @a
        public final RequestBody create(MediaType mediaType, File file) {
            k.e(file, "file");
            return create(file, mediaType);
        }
    }

    @a
    public static final RequestBody create(MediaType mediaType, ByteString byteString) {
        return Companion.create(mediaType, byteString);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(BufferedSink bufferedSink) throws IOException;

    @a
    public static final RequestBody create(MediaType mediaType, File file) {
        return Companion.create(mediaType, file);
    }

    @a
    public static final RequestBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    @a
    public static final RequestBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    @a
    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i4) {
        return Companion.create(mediaType, bArr, i4);
    }

    @a
    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i4, int i10) {
        return Companion.create(mediaType, bArr, i4, i10);
    }

    public static final RequestBody create(ByteString byteString, MediaType mediaType) {
        return Companion.create(byteString, mediaType);
    }

    public static final RequestBody create(File file, MediaType mediaType) {
        return Companion.create(file, mediaType);
    }

    public static final RequestBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final RequestBody create(byte[] bArr) {
        return Companion.create(bArr);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i4) {
        return Companion.create(bArr, mediaType, i4);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i4, int i10) {
        return Companion.create(bArr, mediaType, i4, i10);
    }
}
