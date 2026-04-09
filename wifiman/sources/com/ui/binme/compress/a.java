package com.ui.binme.compress;

import com.ui.binme.compress.Compressor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class a implements Compressor {

    /* renamed from: a, reason: collision with root package name */
    public static final C1279a f41083a = new C1279a(null);

    /* renamed from: com.ui.binme.compress.a$a, reason: collision with other inner class name */
    public static final class C1279a {
        public /* synthetic */ C1279a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1279a() {
        }
    }

    @Override // com.ui.binme.compress.Compressor
    public byte[] a(byte[] data) throws IOException {
        AbstractC6492s.i(data, "data");
        try {
            if (data.length == 0) {
                return data;
            }
            Inflater inflater = new Inflater();
            inflater.setInput(data);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(data.length);
            byte[] bArr = new byte[1024];
            while (!inflater.finished()) {
                byteArrayOutputStream.write(bArr, 0, inflater.inflate(bArr));
            }
            byteArrayOutputStream.close();
            inflater.end();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            AbstractC6492s.h(byteArray, "decompressionStream.toByteArray()");
            return byteArray;
        } catch (DataFormatException e10) {
            throw new Compressor.CompressionError("Decompression failed", e10);
        }
    }

    @Override // com.ui.binme.compress.Compressor
    public byte[] b(byte[] data) throws IOException {
        AbstractC6492s.i(data, "data");
        try {
            Deflater deflater = new Deflater();
            deflater.setInput(data);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(data.length);
            deflater.finish();
            byte[] bArr = new byte[1024];
            while (!deflater.finished()) {
                byteArrayOutputStream.write(bArr, 0, deflater.deflate(bArr));
            }
            byteArrayOutputStream.close();
            deflater.end();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            AbstractC6492s.h(byteArray, "compressionStream.toByteArray()");
            return byteArray;
        } catch (DataFormatException e10) {
            throw new Compressor.CompressionError("Compression failed", e10);
        }
    }
}
