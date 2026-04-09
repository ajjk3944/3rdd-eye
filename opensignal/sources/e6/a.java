package e6;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.icy.IcyInfo;
import com.google.android.gms.internal.measurement.b4;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ne.g;
import xu.l;

/* loaded from: classes.dex */
public final class a extends b4 {

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f7960e = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: c, reason: collision with root package name */
    public final CharsetDecoder f7961c = g.f17524c.newDecoder();

    /* renamed from: d, reason: collision with root package name */
    public final CharsetDecoder f7962d = g.f17523b.newDecoder();

    @Override // com.google.android.gms.internal.measurement.b4
    public final Metadata x(a6.a aVar, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f7962d;
        CharsetDecoder charsetDecoder2 = this.f7961c;
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
        Matcher matcher = f7960e.matcher(string);
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
