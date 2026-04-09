package jh;

import Yg.J;
import Zg.AbstractC3682n;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.C6510d;
import mh.InterfaceC6835l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jh.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6334g extends AbstractC6332e {
    public static final void b(File file, String text, Charset charset) {
        AbstractC6492s.i(file, "<this>");
        AbstractC6492s.i(text, "text");
        AbstractC6492s.i(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            n(fileOutputStream, text, charset);
            J j10 = J.f24997a;
            AbstractC6329b.a(fileOutputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void c(File file, String str, Charset charset, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = C6510d.f52215b;
        }
        b(file, str, charset);
    }

    public static final ByteBuffer d(int i10, CharsetEncoder encoder) {
        AbstractC6492s.i(encoder, "encoder");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10 * ((int) Math.ceil(encoder.maxBytesPerChar())));
        AbstractC6492s.h(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    public static final void e(File file, Charset charset, InterfaceC6835l action) {
        AbstractC6492s.i(file, "<this>");
        AbstractC6492s.i(charset, "charset");
        AbstractC6492s.i(action, "action");
        AbstractC6339l.d(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
    }

    public static final CharsetEncoder f(Charset charset) {
        AbstractC6492s.i(charset, "<this>");
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public static byte[] g(File file) {
        AbstractC6492s.i(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i10 = (int) length;
            byte[] bArrH = new byte[i10];
            int i11 = i10;
            int i12 = 0;
            while (i11 > 0) {
                int i13 = fileInputStream.read(bArrH, i12, i11);
                if (i13 < 0) {
                    break;
                }
                i11 -= i13;
                i12 += i13;
            }
            if (i11 > 0) {
                bArrH = Arrays.copyOf(bArrH, i12);
                AbstractC6492s.h(bArrH, "copyOf(...)");
            } else {
                int i14 = fileInputStream.read();
                if (i14 != -1) {
                    C6330c c6330c = new C6330c(8193);
                    c6330c.write(i14);
                    AbstractC6328a.b(fileInputStream, c6330c, 0, 2, null);
                    int size = c6330c.size() + i10;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrA = c6330c.a();
                    byte[] bArrCopyOf = Arrays.copyOf(bArrH, size);
                    AbstractC6492s.h(bArrCopyOf, "copyOf(...)");
                    bArrH = AbstractC3682n.h(bArrA, bArrCopyOf, i10, 0, c6330c.size());
                }
            }
            AbstractC6329b.a(fileInputStream, null);
            return bArrH;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC6329b.a(fileInputStream, th2);
                throw th3;
            }
        }
    }

    public static final List h(File file, Charset charset) {
        AbstractC6492s.i(file, "<this>");
        AbstractC6492s.i(charset, "charset");
        final ArrayList arrayList = new ArrayList();
        e(file, charset, new InterfaceC6835l() { // from class: jh.f
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC6334g.j(arrayList, (String) obj);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ List i(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C6510d.f52215b;
        }
        return h(file, charset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J j(ArrayList arrayList, String it) {
        AbstractC6492s.i(it, "it");
        arrayList.add(it);
        return J.f24997a;
    }

    public static final String k(File file, Charset charset) {
        AbstractC6492s.i(file, "<this>");
        AbstractC6492s.i(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strH = AbstractC6339l.h(inputStreamReader);
            AbstractC6329b.a(inputStreamReader, null);
            return strH;
        } finally {
        }
    }

    public static /* synthetic */ String l(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C6510d.f52215b;
        }
        return k(file, charset);
    }

    public static void m(File file, byte[] array) {
        AbstractC6492s.i(file, "<this>");
        AbstractC6492s.i(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            J j10 = J.f24997a;
            AbstractC6329b.a(fileOutputStream, null);
        } finally {
        }
    }

    public static final void n(OutputStream outputStream, String text, Charset charset) throws IOException {
        AbstractC6492s.i(outputStream, "<this>");
        AbstractC6492s.i(text, "text");
        AbstractC6492s.i(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            AbstractC6492s.h(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderF = f(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        AbstractC6492s.f(charsetEncoderF);
        ByteBuffer byteBufferD = d(8192, charsetEncoderF);
        int i10 = 0;
        int i11 = 0;
        while (i10 < text.length()) {
            int iMin = Math.min(8192 - i11, text.length() - i10);
            int i12 = i10 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            AbstractC6492s.h(cArrArray, "array(...)");
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
