package ej;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.C6510d;

/* loaded from: classes4.dex */
public abstract class G {
    public static final byte[] a(String str) {
        AbstractC6492s.i(str, "<this>");
        byte[] bytes = str.getBytes(C6510d.f52215b);
        AbstractC6492s.h(bytes, "getBytes(...)");
        return bytes;
    }

    public static final String b(byte[] bArr) {
        AbstractC6492s.i(bArr, "<this>");
        return new String(bArr, C6510d.f52215b);
    }
}
