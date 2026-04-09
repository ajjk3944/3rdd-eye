package ta;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ne.g;
import pa.c;
import xu.l;

/* loaded from: classes.dex */
public final class a extends ic.a {

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f22690x = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: g, reason: collision with root package name */
    public final CharsetDecoder f22691g = g.f17524c.newDecoder();

    /* renamed from: r, reason: collision with root package name */
    public final CharsetDecoder f22692r = g.f17523b.newDecoder();

    @Override // ic.a
    public final Metadata m(c cVar, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f22692r;
        CharsetDecoder charsetDecoder2 = this.f22691g;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new Metadata(new IcyInfo(null, null, bArr));
        }
        Matcher matcher = f22690x.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strA0 = l.a0(strGroup);
                strA0.getClass();
                if (strA0.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strA0.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new Metadata(new IcyInfo(str, str2, bArr));
    }
}
