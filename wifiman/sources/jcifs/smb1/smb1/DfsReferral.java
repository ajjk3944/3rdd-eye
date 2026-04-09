package jcifs.smb1.smb1;

import java.util.Map;

/* loaded from: classes4.dex */
public class DfsReferral extends SmbException {

    /* renamed from: c, reason: collision with root package name */
    public int f50309c;

    /* renamed from: d, reason: collision with root package name */
    public long f50310d;

    /* renamed from: e, reason: collision with root package name */
    public String f50311e;

    /* renamed from: f, reason: collision with root package name */
    public String f50312f;

    /* renamed from: g, reason: collision with root package name */
    public String f50313g;

    /* renamed from: h, reason: collision with root package name */
    public String f50314h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f50315i;

    /* renamed from: j, reason: collision with root package name */
    public long f50316j;

    /* renamed from: l, reason: collision with root package name */
    Map f50318l;

    /* renamed from: m, reason: collision with root package name */
    String f50319m = null;

    /* renamed from: k, reason: collision with root package name */
    DfsReferral f50317k = this;

    void j(DfsReferral dfsReferral) {
        dfsReferral.f50317k = this.f50317k;
        this.f50317k = dfsReferral;
    }

    @Override // jcifs.smb1.smb1.SmbException, java.lang.Throwable
    public String toString() {
        return "DfsReferral[pathConsumed=" + this.f50309c + ",server=" + this.f50311e + ",share=" + this.f50312f + ",link=" + this.f50313g + ",path=" + this.f50314h + ",ttl=" + this.f50310d + ",expiration=" + this.f50316j + ",resolveHashes=" + this.f50315i + "]";
    }
}
