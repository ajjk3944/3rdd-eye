package S9;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

/* compiled from: CharsetReader.kt */
/* renamed from: S9.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1583o {

    /* renamed from: a, reason: collision with root package name */
    public final FileInputStream f12096a;

    /* renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f12097b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f12098c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12099d;

    /* renamed from: e, reason: collision with root package name */
    public char f12100e;

    public C1583o(FileInputStream fileInputStream, Charset charset) {
        kotlin.jvm.internal.l.f(charset, "charset");
        this.f12096a = fileInputStream;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder charsetDecoderOnUnmappableCharacter = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        kotlin.jvm.internal.l.e(charsetDecoderOnUnmappableCharacter, "charset.newDecoder()\n   …odingErrorAction.REPLACE)");
        this.f12097b = charsetDecoderOnUnmappableCharacter;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(C1576h.f12086c.f(8196));
        kotlin.jvm.internal.l.e(byteBufferWrap, "wrap(ByteArrayPool8k.take())");
        this.f12098c = byteBufferWrap;
        byteBufferWrap.flip();
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e8, code lost:
    
        r2 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(char[] r11, int r12, int r13) throws java.nio.charset.CharacterCodingException {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S9.C1583o.a(char[], int, int):int");
    }
}
