package m9;

import b9.C1992A;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.l;
import y9.C5819a;

/* renamed from: m9.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5338c extends com.google.gson.internal.c {
    public static void K(File file, File file2, int i) {
        boolean z10 = (i & 2) == 0;
        if (!file.exists()) {
            throw new C5336a(file, null, "The source file doesn't exist.");
        }
        if (file2.exists()) {
            if (!z10) {
                throw new C5336a(file, file2, "The destination file already exists.");
            }
            if (!file2.delete()) {
                throw new C5336a(file, file2, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new C5337b(file, file2, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                com.google.gson.internal.c.j(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    public static String L(File file) throws IOException {
        Charset charset = C5819a.f48359b;
        l.f(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            for (int i = inputStreamReader.read(cArr); i >= 0; i = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, i);
            }
            String string = stringWriter.toString();
            l.e(string, "toString(...)");
            inputStreamReader.close();
            return string;
        } finally {
        }
    }

    public static void M(File file, String text, Charset charset) throws IOException {
        l.f(text, "text");
        l.f(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            N(fileOutputStream, text, charset);
            C1992A c1992a = C1992A.f18074a;
            fileOutputStream.close();
        } finally {
        }
    }

    public static final void N(FileOutputStream fileOutputStream, String text, Charset charset) throws IOException {
        l.f(text, "text");
        l.f(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            l.e(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        l.c(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        l.e(byteBufferAllocate, "allocate(...)");
        int i = 0;
        int i10 = 0;
        while (i < text.length()) {
            int iMin = Math.min(8192 - i10, text.length() - i);
            int i11 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            l.e(cArrArray, "array(...)");
            text.getChars(i, i11, cArrArray, i10);
            charBufferAllocate.limit(iMin + i10);
            i10 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i11 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i10 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i11;
        }
    }
}
