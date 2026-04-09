package jcifs.smb1.smb1;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: jcifs.smb1.smb1.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6270d {

    /* renamed from: c, reason: collision with root package name */
    static Ug.e f50547c = Ug.e.a();

    /* renamed from: d, reason: collision with root package name */
    static final boolean f50548d = Rg.a.a("jcifs.smb1.smb.client.dfs.strictView", false);

    /* renamed from: e, reason: collision with root package name */
    static final long f50549e = Rg.a.f("jcifs.smb1.smb.client.dfs.ttl", 300);

    /* renamed from: f, reason: collision with root package name */
    static final boolean f50550f = Rg.a.a("jcifs.smb1.smb.client.dfs.disabled", false);

    /* renamed from: g, reason: collision with root package name */
    protected static a f50551g = new a(0);

    /* renamed from: a, reason: collision with root package name */
    protected a f50552a = null;

    /* renamed from: b, reason: collision with root package name */
    protected a f50553b = null;

    /* renamed from: jcifs.smb1.smb1.d$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        long f50554a;

        /* renamed from: b, reason: collision with root package name */
        HashMap f50555b;

        a(long j10) {
            this.f50554a = System.currentTimeMillis() + ((j10 == 0 ? C6270d.f50549e : j10) * 1000);
            this.f50555b = new HashMap();
        }
    }

    public Q a(String str, C6277k c6277k) throws IOException {
        if (f50550f) {
            return null;
        }
        try {
            DfsReferral dfsReferralQ = Q.s(Rg.b.e(str, true), 0).q(c6277k, "\\" + str, 1);
            if (dfsReferralQ != null) {
                DfsReferral dfsReferral = dfsReferralQ;
                do {
                    try {
                        return Q.s(Rg.b.d(dfsReferral.f50311e), 0);
                    } catch (IOException e10) {
                        dfsReferral = dfsReferral.f50317k;
                    }
                } while (dfsReferral != dfsReferralQ);
                throw e10;
            }
        } catch (IOException e11) {
            if (Ug.e.f22464b >= 3) {
                e11.printStackTrace(f50547c);
            }
            if (f50548d && (e11 instanceof SmbAuthException)) {
                throw ((SmbAuthException) e11);
            }
        }
        return null;
    }

    public DfsReferral b(Q q10, String str, String str2, String str3, C6277k c6277k) throws SmbAuthException {
        DfsReferral dfsReferralQ;
        if (f50550f) {
            return null;
        }
        try {
            String str4 = "\\" + str + "\\" + str2;
            if (str3 != null) {
                str4 = str4 + str3;
            }
            dfsReferralQ = q10.q(c6277k, str4, 0);
        } catch (IOException e10) {
            if (Ug.e.f22464b >= 4) {
                e10.printStackTrace(f50547c);
            }
            if (f50548d && (e10 instanceof SmbAuthException)) {
                throw ((SmbAuthException) e10);
            }
        }
        if (dfsReferralQ != null) {
            return dfsReferralQ;
        }
        return null;
    }

    public HashMap c(C6277k c6277k) throws SmbAuthException {
        if (!f50550f && c6277k.f50581a != "?") {
            if (this.f50552a != null && System.currentTimeMillis() > this.f50552a.f50554a) {
                this.f50552a = null;
            }
            a aVar = this.f50552a;
            if (aVar != null) {
                return aVar.f50555b;
            }
            try {
                Q qS = Q.s(Rg.b.e(c6277k.f50581a, true), 0);
                a aVar2 = new a(f50549e * 10);
                DfsReferral dfsReferralQ = qS.q(c6277k, "", 0);
                if (dfsReferralQ != null) {
                    DfsReferral dfsReferral = dfsReferralQ;
                    do {
                        aVar2.f50555b.put(dfsReferral.f50311e.toLowerCase(), new HashMap());
                        dfsReferral = dfsReferral.f50317k;
                    } while (dfsReferral != dfsReferralQ);
                    this.f50552a = aVar2;
                    return aVar2.f50555b;
                }
            } catch (IOException e10) {
                if (Ug.e.f22464b >= 3) {
                    e10.printStackTrace(f50547c);
                }
                if (f50548d && (e10 instanceof SmbAuthException)) {
                    throw ((SmbAuthException) e10);
                }
            }
        }
        return null;
    }

    synchronized void d(String str, DfsReferral dfsReferral) {
        try {
            if (f50550f) {
                return;
            }
            int iIndexOf = str.indexOf(92, 1);
            int i10 = iIndexOf + 1;
            int iIndexOf2 = str.indexOf(92, i10);
            String strSubstring = str.substring(1, iIndexOf);
            String strSubstring2 = str.substring(i10, iIndexOf2);
            String lowerCase = str.substring(0, dfsReferral.f50309c).toLowerCase();
            int length = lowerCase.length();
            while (length > 1 && lowerCase.charAt(length - 1) == '\\') {
                length--;
            }
            if (length < lowerCase.length()) {
                lowerCase = lowerCase.substring(0, length);
            }
            dfsReferral.f50309c -= (strSubstring.length() + 2) + strSubstring2.length();
            if (this.f50553b != null && System.currentTimeMillis() + 10000 > this.f50553b.f50554a) {
                this.f50553b = null;
            }
            if (this.f50553b == null) {
                this.f50553b = new a(0L);
            }
            this.f50553b.f50555b.put(lowerCase, dfsReferral);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0108 A[PHI: r1
  0x0108: PHI (r1v21 jcifs.smb1.smb1.DfsReferral) = (r1v20 jcifs.smb1.smb1.DfsReferral), (r1v26 jcifs.smb1.smb1.DfsReferral) binds: [B:46:0x00b3, B:52:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0125 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:4:0x0007, B:6:0x0010, B:9:0x001c, B:11:0x0024, B:13:0x0031, B:15:0x003d, B:17:0x0043, B:22:0x004e, B:27:0x0063, B:29:0x0069, B:31:0x007c, B:32:0x0084, B:34:0x008d, B:36:0x0091, B:37:0x0096, B:47:0x00b5, B:49:0x00c1, B:51:0x00c7, B:54:0x00d1, B:62:0x00e8, B:64:0x00ee, B:71:0x0114, B:73:0x0118, B:75:0x011e, B:76:0x0121, B:78:0x0125, B:79:0x012c, B:81:0x014d, B:82:0x015c, B:83:0x016c, B:85:0x0172, B:87:0x0182, B:97:0x01a1, B:88:0x0187, B:90:0x018e, B:92:0x0194, B:40:0x00a1, B:41:0x00a7), top: B:105:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014d A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:4:0x0007, B:6:0x0010, B:9:0x001c, B:11:0x0024, B:13:0x0031, B:15:0x003d, B:17:0x0043, B:22:0x004e, B:27:0x0063, B:29:0x0069, B:31:0x007c, B:32:0x0084, B:34:0x008d, B:36:0x0091, B:37:0x0096, B:47:0x00b5, B:49:0x00c1, B:51:0x00c7, B:54:0x00d1, B:62:0x00e8, B:64:0x00ee, B:71:0x0114, B:73:0x0118, B:75:0x011e, B:76:0x0121, B:78:0x0125, B:79:0x012c, B:81:0x014d, B:82:0x015c, B:83:0x016c, B:85:0x0172, B:87:0x0182, B:97:0x01a1, B:88:0x0187, B:90:0x018e, B:92:0x0194, B:40:0x00a1, B:41:0x00a7), top: B:105:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0172 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:4:0x0007, B:6:0x0010, B:9:0x001c, B:11:0x0024, B:13:0x0031, B:15:0x003d, B:17:0x0043, B:22:0x004e, B:27:0x0063, B:29:0x0069, B:31:0x007c, B:32:0x0084, B:34:0x008d, B:36:0x0091, B:37:0x0096, B:47:0x00b5, B:49:0x00c1, B:51:0x00c7, B:54:0x00d1, B:62:0x00e8, B:64:0x00ee, B:71:0x0114, B:73:0x0118, B:75:0x011e, B:76:0x0121, B:78:0x0125, B:79:0x012c, B:81:0x014d, B:82:0x015c, B:83:0x016c, B:85:0x0172, B:87:0x0182, B:97:0x01a1, B:88:0x0187, B:90:0x018e, B:92:0x0194, B:40:0x00a1, B:41:0x00a7), top: B:105:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized jcifs.smb1.smb1.DfsReferral e(java.lang.String r18, java.lang.String r19, java.lang.String r20, jcifs.smb1.smb1.C6277k r21) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jcifs.smb1.smb1.C6270d.e(java.lang.String, java.lang.String, java.lang.String, jcifs.smb1.smb1.k):jcifs.smb1.smb1.DfsReferral");
    }
}
