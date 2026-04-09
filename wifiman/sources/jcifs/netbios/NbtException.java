package jcifs.netbios;

import jcifs.CIFSException;

/* loaded from: classes4.dex */
public class NbtException extends CIFSException {

    /* renamed from: a, reason: collision with root package name */
    public int f50238a;

    /* renamed from: b, reason: collision with root package name */
    public int f50239b;

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
        return new String("errorClass=" + this.f50238a + ",errorCode=" + this.f50239b + ",errorString=" + a(this.f50238a, this.f50239b));
    }
}
