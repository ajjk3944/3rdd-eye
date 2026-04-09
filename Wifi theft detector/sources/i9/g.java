package i9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;
import l9.l;
import y8.s;

/* loaded from: classes4.dex */
public abstract class g extends e {
    public static final ByteBuffer d(int i10, CharsetEncoder encoder) {
        p.e(encoder, "encoder");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10 * ((int) Math.ceil(encoder.maxBytesPerChar())));
        p.d(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    public static final void e(File file, Charset charset, l action) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        p.e(file, "<this>");
        p.e(charset, "charset");
        p.e(action, "action");
        k.c(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
    }

    public static final CharsetEncoder f(Charset charset) {
        p.e(charset, "<this>");
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public static final List g(File file, Charset charset) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        p.e(file, "<this>");
        p.e(charset, "charset");
        final ArrayList arrayList = new ArrayList();
        e(file, charset, new l() { // from class: i9.f
            @Override // l9.l
            public final Object invoke(Object obj) {
                return g.i(arrayList, (String) obj);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ List h(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = s9.c.f24341b;
        }
        return g(file, charset);
    }

    public static final s i(ArrayList arrayList, String it) {
        p.e(it, "it");
        arrayList.add(it);
        return s.f25199a;
    }

    public static final String j(File file, Charset charset) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        p.e(file, "<this>");
        p.e(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strE = k.e(inputStreamReader);
            b.a(inputStreamReader, null);
            return strE;
        } finally {
        }
    }

    public static /* synthetic */ String k(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = s9.c.f24341b;
        }
        return j(file, charset);
    }

    public static void l(File file, byte[] array) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        p.e(file, "<this>");
        p.e(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            s sVar = s.f25199a;
            b.a(fileOutputStream, null);
        } finally {
        }
    }

    public static void m(File file, String text, Charset charset) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        p.e(file, "<this>");
        p.e(text, "text");
        p.e(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            o(fileOutputStream, text, charset);
            s sVar = s.f25199a;
            b.a(fileOutputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void n(File file, String str, Charset charset, int i10, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if ((i10 & 2) != 0) {
            charset = s9.c.f24341b;
        }
        m(file, str, charset);
    }

    public static final void o(OutputStream outputStream, String text, Charset charset) throws IOException {
        p.e(outputStream, "<this>");
        p.e(text, "text");
        p.e(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            p.d(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderF = f(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        p.b(charsetEncoderF);
        ByteBuffer byteBufferD = d(8192, charsetEncoderF);
        int i10 = 0;
        int i11 = 0;
        while (i10 < text.length()) {
            int iMin = Math.min(8192 - i11, text.length() - i10);
            int i12 = i10 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            p.d(cArrArray, "array(...)");
            text.getChars(i10, i12, cArrArray, i11);
            charBufferAllocate.limit(iMin + i11);
            i11 = 1;
            if (!charsetEncoderF.encode(charBufferAllocate, byteBufferD, i12 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(byteBufferD.array(), 0, byteBufferD.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i11 = 0;
            }
            charBufferAllocate.clear();
            byteBufferD.clear();
            i10 = i12;
        }
    }
}
