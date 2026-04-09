package com.bumptech.glide.load;

import O2.g;
import U2.w;
import com.bumptech.glide.load.ImageHeaderParser;
import h3.C4412a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ImageHeaderParserUtils.java */
/* loaded from: classes.dex */
public final class a {
    public static int a(ArrayList arrayList, InputStream inputStream, g gVar) throws IOException {
        if (inputStream != null) {
            if (!inputStream.markSupported()) {
                inputStream = new w(inputStream, gVar);
            }
            inputStream.mark(5242880);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                try {
                    int iC = ((ImageHeaderParser) arrayList.get(i)).c(inputStream, gVar);
                    if (iC != -1) {
                        return iC;
                    }
                } finally {
                    inputStream.reset();
                }
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType b(ArrayList arrayList, InputStream inputStream, g gVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, gVar);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser.ImageType imageTypeB = ((ImageHeaderParser) arrayList.get(i)).b(inputStream);
                inputStream.reset();
                if (imageTypeB != ImageHeaderParser.ImageType.UNKNOWN) {
                    return imageTypeB;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static ImageHeaderParser.ImageType c(ArrayList arrayList, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser.ImageType imageTypeA = ((ImageHeaderParser) arrayList.get(i)).a(byteBuffer);
                AtomicReference<byte[]> atomicReference = C4412a.f38190a;
                if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                    return imageTypeA;
                }
            } catch (Throwable th) {
                AtomicReference<byte[]> atomicReference2 = C4412a.f38190a;
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
