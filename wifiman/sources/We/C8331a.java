package we;

import android.util.Base64;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: we.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8331a implements InterfaceC8332b {
    @Override // we.InterfaceC8332b
    public String a(byte[] bytes) {
        AbstractC6492s.i(bytes, "bytes");
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        AbstractC6492s.h(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    @Override // we.InterfaceC8332b
    public byte[] b(String formattedString) {
        AbstractC6492s.i(formattedString, "formattedString");
        byte[] bArrDecode = Base64.decode(formattedString, 2);
        AbstractC6492s.h(bArrDecode, "decode(...)");
        return bArrDecode;
    }
}
