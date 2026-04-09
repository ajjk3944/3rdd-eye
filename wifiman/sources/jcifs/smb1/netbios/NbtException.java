package jcifs.smb1.netbios;

import java.io.IOException;

/* loaded from: classes4.dex */
public class NbtException extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public int f50245a;

    /* renamed from: b, reason: collision with root package name */
    public int f50246b;

    public NbtException(int i10, int i11) {
        super(a(i10, i11));
        this.f50245a = i10;
        this.f50246b = i11;
    }

    public static String a(int i10, int i11) {
        if (i10 == 0) {
            return "SUCCESS";
        }
        if (i10 == 1) {
            String str = "ERR_NAM_SRVC/";
            if (i11 == 1) {
                str = str + "FMT_ERR: Format Error";
            }
            return str + "Unknown error code: " + i11;
        }
        if (i10 != 2) {
            return "unknown error class: " + i10;
        }
        String str2 = "ERR_SSN_SRVC/";
        if (i11 == -1) {
            return str2 + "Connection refused";
        }
        if (i11 == 143) {
            return str2 + "Unspecified error";
        }
        switch (i11) {
            case 128:
                return str2 + "Not listening on called name";
            case 129:
                return str2 + "Not listening for calling name";
            case 130:
                return str2 + "Called name not present";
            case 131:
                return str2 + "Called name present, but insufficient resources";
            default:
                return str2 + "Unknown error code: " + i11;
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        return new String("errorClass=" + this.f50245a + ",errorCode=" + this.f50246b + ",errorString=" + a(this.f50245a, this.f50246b));
    }
}
