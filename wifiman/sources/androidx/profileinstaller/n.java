package androidx.profileinstaller;

import java.util.Arrays;
import org.snmp4j.asn1.BER;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    static final byte[] f31779a = {BER.SEQUENCE, 49, 53, 0};

    /* renamed from: b, reason: collision with root package name */
    static final byte[] f31780b = {BER.SEQUENCE, 49, BER.SEQUENCE, 0};

    /* renamed from: c, reason: collision with root package name */
    static final byte[] f31781c = {BER.SEQUENCE, BER.SEQUENCE, 57, 0};

    /* renamed from: d, reason: collision with root package name */
    static final byte[] f31782d = {BER.SEQUENCE, BER.SEQUENCE, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    static final byte[] f31783e = {BER.SEQUENCE, BER.SEQUENCE, 49, 0};

    /* renamed from: f, reason: collision with root package name */
    static final byte[] f31784f = {BER.SEQUENCE, BER.SEQUENCE, 49, 0};

    /* renamed from: g, reason: collision with root package name */
    static final byte[] f31785g = {BER.SEQUENCE, BER.SEQUENCE, 50, 0};

    static String a(byte[] bArr) {
        return (Arrays.equals(bArr, f31783e) || Arrays.equals(bArr, f31782d)) ? ":" : "!";
    }
}
