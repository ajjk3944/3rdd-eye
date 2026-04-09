package wq;

import br.l;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;

/* loaded from: classes.dex */
public abstract class a extends io.sentry.config.a {
    public static File o0(File file) {
        int length;
        int iA0;
        File file2 = new File("image_cache");
        String path = file2.getPath();
        l.d(path, "getPath(...)");
        char c4 = File.separatorChar;
        int iA02 = tt.l.A0(path, c4, 0, 4);
        if (iA02 != 0) {
            length = (iA02 <= 0 || path.charAt(iA02 + (-1)) != ':') ? (iA02 == -1 && tt.l.w0(path, ':')) ? path.length() : 0 : iA02 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c4 || (iA0 = tt.l.A0(path, c4, 2, 4)) < 0) {
            length = 1;
        } else {
            int iA03 = tt.l.A0(path, c4, iA0 + 1, 4);
            length = iA03 >= 0 ? iA03 + 1 : path.length();
        }
        if (length > 0) {
            return file2;
        }
        String string = file.toString();
        l.d(string, "toString(...)");
        if ((string.length() == 0) || tt.l.w0(string, c4)) {
            return new File(string + file2);
        }
        return new File(string + c4 + file2);
    }

    public static final void p0(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        l.e(fileOutputStream, "<this>");
        l.e(str, "text");
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            l.d(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        l.b(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        l.d(byteBufferAllocate, "allocate(...)");
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            int iMin = Math.min(8192 - i11, str.length() - i10);
            int i12 = i10 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            l.d(cArrArray, "array(...)");
            str.getChars(i10, i12, cArrArray, i11);
            charBufferAllocate.limit(iMin + i11);
            i11 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i12 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i11 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i10 = i12;
        }
    }
}
