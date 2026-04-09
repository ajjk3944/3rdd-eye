package com.applovin.shadow.okio.internal;

import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import com.applovin.shadow.okio.Timeout;
import com.applovin.shadow.okio.buffer;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a$\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001c\u0010\u0006\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0080\b¢\u0006\u0004\b\u0006\u0010\u000b\u001a,\u0010\u0006\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u0006\u0010\u000e\u001a\u001c\u0010\u0011\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a,\u0010\u0011\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u0011\u0010\u0015\u001a\u001c\u0010\u0017\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001c\u0010\u0006\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0019H\u0080\b¢\u0006\u0004\b\u0006\u0010\u001a\u001a,\u0010\u0006\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u0006\u0010\u001b\u001a\u001c\u0010\u001d\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001cH\u0080\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a$\u0010\u0006\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0006\u0010\u001f\u001a\u001c\u0010!\u001a\u00020\n*\u00020\u00002\u0006\u0010 \u001a\u00020\fH\u0080\b¢\u0006\u0004\b!\u0010\u0018\u001a\u001c\u0010#\u001a\u00020\n*\u00020\u00002\u0006\u0010\"\u001a\u00020\fH\u0080\b¢\u0006\u0004\b#\u0010\u0018\u001a\u001c\u0010$\u001a\u00020\n*\u00020\u00002\u0006\u0010\"\u001a\u00020\fH\u0080\b¢\u0006\u0004\b$\u0010\u0018\u001a\u001c\u0010&\u001a\u00020\n*\u00020\u00002\u0006\u0010%\u001a\u00020\fH\u0080\b¢\u0006\u0004\b&\u0010\u0018\u001a\u001c\u0010'\u001a\u00020\n*\u00020\u00002\u0006\u0010%\u001a\u00020\fH\u0080\b¢\u0006\u0004\b'\u0010\u0018\u001a\u001c\u0010)\u001a\u00020\n*\u00020\u00002\u0006\u0010(\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b)\u0010*\u001a\u001c\u0010+\u001a\u00020\n*\u00020\u00002\u0006\u0010(\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b+\u0010*\u001a\u001c\u0010,\u001a\u00020\n*\u00020\u00002\u0006\u0010(\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b,\u0010*\u001a\u001c\u0010-\u001a\u00020\n*\u00020\u00002\u0006\u0010(\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b-\u0010*\u001a\u0014\u0010.\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\b.\u0010/\u001a\u0014\u00100\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\b0\u0010/\u001a\u0014\u00101\u001a\u00020\u0005*\u00020\u0000H\u0080\b¢\u0006\u0004\b1\u00102\u001a\u0014\u00103\u001a\u00020\u0005*\u00020\u0000H\u0080\b¢\u0006\u0004\b3\u00102\u001a\u0014\u00105\u001a\u000204*\u00020\u0000H\u0080\b¢\u0006\u0004\b5\u00106\u001a\u0014\u00107\u001a\u00020\u000f*\u00020\u0000H\u0080\b¢\u0006\u0004\b7\u00108¨\u00069"}, d2 = {"Lcom/applovin/shadow/okio/RealBufferedSink;", "Lcom/applovin/shadow/okio/Buffer;", "source", "", "byteCount", "Ly8/s;", "commonWrite", "(Lcom/applovin/shadow/okio/RealBufferedSink;Lcom/applovin/shadow/okio/Buffer;J)V", "Lcom/applovin/shadow/okio/ByteString;", "byteString", "Lcom/applovin/shadow/okio/BufferedSink;", "(Lcom/applovin/shadow/okio/RealBufferedSink;Lcom/applovin/shadow/okio/ByteString;)Lcom/applovin/shadow/okio/BufferedSink;", "", "offset", "(Lcom/applovin/shadow/okio/RealBufferedSink;Lcom/applovin/shadow/okio/ByteString;II)Lcom/applovin/shadow/okio/BufferedSink;", "", "string", "commonWriteUtf8", "(Lcom/applovin/shadow/okio/RealBufferedSink;Ljava/lang/String;)Lcom/applovin/shadow/okio/BufferedSink;", "beginIndex", "endIndex", "(Lcom/applovin/shadow/okio/RealBufferedSink;Ljava/lang/String;II)Lcom/applovin/shadow/okio/BufferedSink;", "codePoint", "commonWriteUtf8CodePoint", "(Lcom/applovin/shadow/okio/RealBufferedSink;I)Lcom/applovin/shadow/okio/BufferedSink;", "", "(Lcom/applovin/shadow/okio/RealBufferedSink;[B)Lcom/applovin/shadow/okio/BufferedSink;", "(Lcom/applovin/shadow/okio/RealBufferedSink;[BII)Lcom/applovin/shadow/okio/BufferedSink;", "Lcom/applovin/shadow/okio/Source;", "commonWriteAll", "(Lcom/applovin/shadow/okio/RealBufferedSink;Lcom/applovin/shadow/okio/Source;)J", "(Lcom/applovin/shadow/okio/RealBufferedSink;Lcom/applovin/shadow/okio/Source;J)Lcom/applovin/shadow/okio/BufferedSink;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "commonWriteByte", "s", "commonWriteShort", "commonWriteShortLe", "i", "commonWriteInt", "commonWriteIntLe", "v", "commonWriteLong", "(Lcom/applovin/shadow/okio/RealBufferedSink;J)Lcom/applovin/shadow/okio/BufferedSink;", "commonWriteLongLe", "commonWriteDecimalLong", "commonWriteHexadecimalUnsignedLong", "commonEmitCompleteSegments", "(Lcom/applovin/shadow/okio/RealBufferedSink;)Lcom/applovin/shadow/okio/BufferedSink;", "commonEmit", "commonFlush", "(Lcom/applovin/shadow/okio/RealBufferedSink;)V", "commonClose", "Lcom/applovin/shadow/okio/Timeout;", "commonTimeout", "(Lcom/applovin/shadow/okio/RealBufferedSink;)Lcom/applovin/shadow/okio/Timeout;", "commonToString", "(Lcom/applovin/shadow/okio/RealBufferedSink;)Ljava/lang/String;", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName(name = "-RealBufferedSink")
@SourceDebugExtension({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n1#1,219:1\n1#2:220\n51#3:221\n51#3:222\n51#3:223\n51#3:224\n51#3:225\n51#3:226\n51#3:227\n51#3:228\n51#3:229\n51#3:230\n51#3:231\n51#3:232\n51#3:233\n51#3:234\n51#3:235\n51#3:236\n51#3:237\n51#3:238\n51#3:239\n51#3:240\n51#3:241\n51#3:242\n51#3:243\n51#3:244\n51#3:245\n51#3:246\n51#3:247\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n*L\n35#1:221\n41#1:222\n51#1:223\n57#1:224\n67#1:225\n73#1:226\n79#1:227\n89#1:228\n96#1:229\n107#1:230\n117#1:231\n123#1:232\n129#1:233\n135#1:234\n141#1:235\n147#1:236\n153#1:237\n159#1:238\n165#1:239\n171#1:240\n172#1:241\n178#1:242\n179#1:243\n185#1:244\n186#1:245\n198#1:246\n199#1:247\n*E\n"})
/* renamed from: com.applovin.shadow.okio.internal.-RealBufferedSink, reason: invalid class name */
/* loaded from: classes.dex */
public final class RealBufferedSink {
    public static final void commonClose(@NotNull buffer bufferVar) throws Throwable {
        p.e(bufferVar, "<this>");
        if (bufferVar.closed) {
            return;
        }
        try {
            if (bufferVar.bufferField.size() > 0) {
                Sink sink = bufferVar.sink;
                Buffer buffer = bufferVar.bufferField;
                sink.write(buffer, buffer.size());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferVar.sink.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        bufferVar.closed = true;
        if (th != null) {
            throw th;
        }
    }

    @NotNull
    public static final BufferedSink commonEmit(@NotNull buffer bufferVar) throws IOException {
        p.e(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        long size = bufferVar.bufferField.size();
        if (size > 0) {
            bufferVar.sink.write(bufferVar.bufferField, size);
        }
        return bufferVar;
    }

    @NotNull
    public static final BufferedSink commonEmitCompleteSegments(@NotNull buffer bufferVar) throws IOException {
        p.e(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        long jCompleteSegmentByteCount = bufferVar.bufferField.completeSegmentByteCount();
        if (jCompleteSegmentByteCount > 0) {
            bufferVar.sink.write(bufferVar.bufferField, jCompleteSegmentByteCount);
        }
        return bufferVar;
    }

    public static final void commonFlush(@NotNull buffer bufferVar) throws IOException {
        p.e(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        if (bufferVar.bufferField.size() > 0) {
            Sink sink = bufferVar.sink;
            Buffer buffer = bufferVar.bufferField;
            sink.write(buffer, buffer.size());
        }
        bufferVar.sink.flush();
    }

    @NotNull
    public static final Timeout commonTimeout(@NotNull buffer bufferVar) {
        p.e(bufferVar, "<this>");
        return bufferVar.sink.getTimeout();
    }

    @NotNull
    public static final String commonToString(@NotNull buffer bufferVar) {
        p.e(bufferVar, "<this>");
        return "buffer(" + bufferVar.sink + ')';
    }

    public static final void commonWrite(@NotNull buffer bufferVar, @NotNull Buffer source, long j10) throws IOException {
        p.e(bufferVar, "<this>");
        p.e(source, "source");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.write(source, j10);
        bufferVar.emitCompleteSegments();
    }

    public static final long commonWriteAll(@NotNull buffer bufferVar, @NotNull Source source) throws IOException {
        p.e(bufferVar, "<this>");
        p.e(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(bufferVar.bufferField, 8192L);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
            bufferVar.emitCompleteSegments();
        }
    }

    @NotNull
    public static final BufferedSink commonWriteByte(@NotNull buffer bufferVar, int i10) {
        p.e(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeByte(i10);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteDecimalLong(@NotNull buffer bufferVar, long j10) {
        p.e(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeDecimalLong(j10);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteHexadecimalUnsignedLong(@NotNull buffer bufferVar, long j10) {
        p.e(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeHexadecimalUnsignedLong(j10);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteInt(@NotNull buffer bufferVar, int i10) {
        p.e(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeInt(i10);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteIntLe(@NotNull buffer bufferVar, int i10) {
        p.e(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeIntLe(i10);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteLong(@NotNull buffer bufferVar, long j10) {
        p.e(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeLong(j10);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteLongLe(@NotNull buffer bufferVar, long j10) {
        p.e(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeLongLe(j10);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteShort(@NotNull buffer bufferVar, int i10) {
        p.e(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeShort(i10);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteShortLe(@NotNull buffer bufferVar, int i10) {
        p.e(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeShortLe(i10);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteUtf8(@NotNull buffer bufferVar, @NotNull String string) {
        p.e(bufferVar, "<this>");
        p.e(string, "string");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeUtf8(string);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteUtf8CodePoint(@NotNull buffer bufferVar, int i10) {
        p.e(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        bufferVar.bufferField.writeUtf8CodePoint(i10);
        return bufferVar.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull buffer bufferVar, @NotNull ByteString byteString) {
        p.e(bufferVar, "<this>");
        p.e(byteString, "byteString");
        if (!bufferVar.closed) {
            bufferVar.bufferField.write(byteString);
            return bufferVar.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final BufferedSink commonWriteUtf8(@NotNull buffer bufferVar, @NotNull String string, int i10, int i11) {
        p.e(bufferVar, "<this>");
        p.e(string, "string");
        if (!bufferVar.closed) {
            bufferVar.bufferField.writeUtf8(string, i10, i11);
            return bufferVar.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull buffer bufferVar, @NotNull ByteString byteString, int i10, int i11) {
        p.e(bufferVar, "<this>");
        p.e(byteString, "byteString");
        if (!bufferVar.closed) {
            bufferVar.bufferField.write(byteString, i10, i11);
            return bufferVar.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull buffer bufferVar, @NotNull byte[] source) {
        p.e(bufferVar, "<this>");
        p.e(source, "source");
        if (!bufferVar.closed) {
            bufferVar.bufferField.write(source);
            return bufferVar.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull buffer bufferVar, @NotNull byte[] source, int i10, int i11) {
        p.e(bufferVar, "<this>");
        p.e(source, "source");
        if (!bufferVar.closed) {
            bufferVar.bufferField.write(source, i10, i11);
            return bufferVar.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull buffer bufferVar, @NotNull Source source, long j10) throws IOException {
        p.e(bufferVar, "<this>");
        p.e(source, "source");
        while (j10 > 0) {
            long j11 = source.read(bufferVar.bufferField, j10);
            if (j11 != -1) {
                j10 -= j11;
                bufferVar.emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return bufferVar;
    }
}
