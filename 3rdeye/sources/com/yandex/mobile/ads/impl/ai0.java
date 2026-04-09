package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class ai0 extends hy1 {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f24679c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a, reason: collision with root package name */
    private final CharsetDecoder f24680a = fo.f27410c.newDecoder();

    /* renamed from: b, reason: collision with root package name */
    private final CharsetDecoder f24681b = fo.f27409b.newDecoder();

    @Override // com.yandex.mobile.ads.impl.hy1
    public final yz0 a(b01 b01Var, ByteBuffer byteBuffer) {
        String string;
        String str = null;
        try {
            string = this.f24680a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                string = this.f24681b.decode(byteBuffer).toString();
                this.f24681b.reset();
                byteBuffer.rewind();
            } catch (CharacterCodingException unused2) {
                this.f24681b.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                this.f24681b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.f24680a.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new yz0(new ci0(bArr, null, null));
        }
        Matcher matcher = f24679c.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strB = xf.b(strGroup);
                strB.getClass();
                if (strB.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strB.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new yz0(new ci0(bArr, str, str2));
    }
}
