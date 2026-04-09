package com.ui.wmw.api.v1;

import kotlin.Metadata;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"com/ui/wmw/api/v1/ApiV1FirmwareUpload$Start", "", "", "fileSize", "<init>", "(J)V", "Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$Start;", "copy", "(J)Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$Start;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "J", "()J", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Y6.i(generateAdapter = true)
/* renamed from: com.ui.wmw.api.v1.ApiV1FirmwareUpload$Start, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class Start {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long fileSize;

    public Start(@Y6.g(name = "size") long j10) {
        this.fileSize = j10;
    }

    /* renamed from: a, reason: from getter */
    public final long getFileSize() {
        return this.fileSize;
    }

    public final Start copy(@Y6.g(name = "size") long fileSize) {
        return new Start(fileSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Start) && this.fileSize == ((Start) other).fileSize;
    }

    public int hashCode() {
        return Long.hashCode(this.fileSize);
    }

    public String toString() {
        return "Start(fileSize=" + this.fileSize + ")";
    }
}
