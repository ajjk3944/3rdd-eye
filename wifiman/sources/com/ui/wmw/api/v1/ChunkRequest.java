package com.ui.wmw.api.v1;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, d2 = {"com/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest", "", "", "stateId", "", "chunkOffset", "chunkSize", "<init>", "(Ljava/lang/String;II)V", "Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;", "copy", "(Ljava/lang/String;II)Lcom/ui/wmw/api/v1/ApiV1FirmwareUpload$ChunkRequest;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "d", SnmpConfigurator.O_BIND_ADDRESS, "I", SnmpConfigurator.O_COMMUNITY, "Lcom/ui/wmw/api/v1/c;", "()Lcom/ui/wmw/api/v1/c;", "state", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Y6.i(generateAdapter = true)
/* renamed from: com.ui.wmw.api.v1.ApiV1FirmwareUpload$ChunkRequest, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class ChunkRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String stateId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int chunkOffset;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int chunkSize;

    public ChunkRequest(@Y6.g(name = "status") String stateId, @Y6.g(name = "offset") int i10, @Y6.g(name = "size") int i11) {
        AbstractC6492s.i(stateId, "stateId");
        this.stateId = stateId;
        this.chunkOffset = i10;
        this.chunkSize = i11;
    }

    /* renamed from: a, reason: from getter */
    public final int getChunkOffset() {
        return this.chunkOffset;
    }

    /* renamed from: b, reason: from getter */
    public final int getChunkSize() {
        return this.chunkSize;
    }

    public final c c() {
        return (c) c.Companion.a().get(this.stateId);
    }

    public final ChunkRequest copy(@Y6.g(name = "status") String stateId, @Y6.g(name = "offset") int chunkOffset, @Y6.g(name = "size") int chunkSize) {
        AbstractC6492s.i(stateId, "stateId");
        return new ChunkRequest(stateId, chunkOffset, chunkSize);
    }

    /* renamed from: d, reason: from getter */
    public final String getStateId() {
        return this.stateId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChunkRequest)) {
            return false;
        }
        ChunkRequest chunkRequest = (ChunkRequest) other;
        return AbstractC6492s.d(this.stateId, chunkRequest.stateId) && this.chunkOffset == chunkRequest.chunkOffset && this.chunkSize == chunkRequest.chunkSize;
    }

    public int hashCode() {
        return (((this.stateId.hashCode() * 31) + Integer.hashCode(this.chunkOffset)) * 31) + Integer.hashCode(this.chunkSize);
    }

    public String toString() {
        return "ChunkRequest(stateId=" + this.stateId + ", chunkOffset=" + this.chunkOffset + ", chunkSize=" + this.chunkSize + ")";
    }
}
