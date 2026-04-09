package a6;

import N7.C1154e9;

/* compiled from: AdAsset.kt */
/* renamed from: a6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1652a {
    private final String adIdentifier;
    private long fileSize;
    private final EnumC0211a fileType;
    private final boolean isRequired;
    private final String localPath;
    private final String serverPath;
    private b status;

    /* compiled from: AdAsset.kt */
    /* renamed from: a6.a$a, reason: collision with other inner class name */
    public enum EnumC0211a {
        ZIP,
        ASSET
    }

    /* compiled from: AdAsset.kt */
    /* renamed from: a6.a$b */
    public enum b {
        NEW,
        DOWNLOAD_RUNNING,
        DOWNLOAD_FAILED,
        DOWNLOAD_SUCCESS,
        PROCESSED
    }

    public C1652a(String adIdentifier, String serverPath, String localPath, EnumC0211a fileType, boolean z10) {
        kotlin.jvm.internal.l.f(adIdentifier, "adIdentifier");
        kotlin.jvm.internal.l.f(serverPath, "serverPath");
        kotlin.jvm.internal.l.f(localPath, "localPath");
        kotlin.jvm.internal.l.f(fileType, "fileType");
        this.adIdentifier = adIdentifier;
        this.serverPath = serverPath;
        this.localPath = localPath;
        this.fileType = fileType;
        this.isRequired = z10;
        this.status = b.NEW;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C1652a.class.equals(obj.getClass())) {
            return false;
        }
        C1652a c1652a = (C1652a) obj;
        if (this.status == c1652a.status && this.fileType == c1652a.fileType && this.fileSize == c1652a.fileSize && this.isRequired == c1652a.isRequired && kotlin.jvm.internal.l.b(this.adIdentifier, c1652a.adIdentifier) && kotlin.jvm.internal.l.b(this.serverPath, c1652a.serverPath)) {
            return kotlin.jvm.internal.l.b(this.localPath, c1652a.localPath);
        }
        return false;
    }

    public final String getAdIdentifier() {
        return this.adIdentifier;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final EnumC0211a getFileType() {
        return this.fileType;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final String getServerPath() {
        return this.serverPath;
    }

    public final b getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = (this.fileType.hashCode() + ((this.status.hashCode() + B4.g.n(B4.g.n(this.adIdentifier.hashCode() * 31, 31, this.serverPath), 31, this.localPath)) * 31)) * 31;
        long j4 = this.fileSize;
        return ((iHashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.isRequired ? 1231 : 1237);
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    public final void setFileSize(long j4) {
        this.fileSize = j4;
    }

    public final void setStatus(b bVar) {
        kotlin.jvm.internal.l.f(bVar, "<set-?>");
        this.status = bVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdAsset{, adIdentifier='");
        sb.append(this.adIdentifier);
        sb.append("', serverPath='");
        sb.append(this.serverPath);
        sb.append("', localPath='");
        sb.append(this.localPath);
        sb.append("', status=");
        sb.append(this.status);
        sb.append(", fileType=");
        sb.append(this.fileType);
        sb.append(", fileSize=");
        sb.append(this.fileSize);
        sb.append(", isRequired=");
        return C1154e9.k(sb, this.isRequired, '}');
    }
}
