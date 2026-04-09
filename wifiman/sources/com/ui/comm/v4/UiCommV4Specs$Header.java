package com.ui.comm.v4;

import Y6.g;
import Y6.i;
import g9.EnumC5883c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes3.dex */
public abstract class UiCommV4Specs$Header {

    /* renamed from: a, reason: collision with root package name */
    public static final a f41203a = new a(null);

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u001a8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/ui/comm/v4/UiCommV4Specs$Header$Cmd;", "Lcom/ui/comm/v4/UiCommV4Specs$Header;", "", "guid", "", "timestamp", "<init>", "(Ljava/lang/String;J)V", "copy", "(Ljava/lang/String;J)Lcom/ui/comm/v4/UiCommV4Specs$Header$Cmd;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_COMMUNITY, "J", "()J", "Lg9/c;", "d", "Lg9/c;", "()Lg9/c;", "type", "ui-communication-v4_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class Cmd extends UiCommV4Specs$Header {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String guid;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long timestamp;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final EnumC5883c type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Cmd(@g(name = "id") String guid, @g(name = "timestamp") long j10) {
            super(null);
            AbstractC6492s.i(guid, "guid");
            this.guid = guid;
            this.timestamp = j10;
            this.type = EnumC5883c.CMD;
        }

        @Override // com.ui.comm.v4.UiCommV4Specs$Header
        /* renamed from: a, reason: from getter */
        public String getGuid() {
            return this.guid;
        }

        @Override // com.ui.comm.v4.UiCommV4Specs$Header
        /* renamed from: b, reason: from getter */
        public EnumC5883c getType() {
            return this.type;
        }

        /* renamed from: c, reason: from getter */
        public long getTimestamp() {
            return this.timestamp;
        }

        public final Cmd copy(@g(name = "id") String guid, @g(name = "timestamp") long timestamp) {
            AbstractC6492s.i(guid, "guid");
            return new Cmd(guid, timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Cmd)) {
                return false;
            }
            Cmd cmd = (Cmd) other;
            return AbstractC6492s.d(this.guid, cmd.guid) && this.timestamp == cmd.timestamp;
        }

        public int hashCode() {
            return (this.guid.hashCode() * 31) + Long.hashCode(this.timestamp);
        }

        public String toString() {
            return "Cmd(guid=" + this.guid + ", timestamp=" + this.timestamp + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u000fR\u001a\u0010!\u001a\u00020\u001d8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0015\u0010 ¨\u0006\""}, d2 = {"Lcom/ui/comm/v4/UiCommV4Specs$Header$CmdResponse;", "Lcom/ui/comm/v4/UiCommV4Specs$Header;", "", "guid", "", "timestamp", "", "exitCode", "<init>", "(Ljava/lang/String;JI)V", "copy", "(Ljava/lang/String;JI)Lcom/ui/comm/v4/UiCommV4Specs$Header$CmdResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_COMMUNITY, "J", "d", "()J", "I", "Lg9/c;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Lg9/c;", "()Lg9/c;", "type", "ui-communication-v4_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class CmdResponse extends UiCommV4Specs$Header {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String guid;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long timestamp;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int exitCode;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final EnumC5883c type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CmdResponse(@g(name = "id") String guid, @g(name = "timestamp") long j10, @g(name = "exitCode") int i10) {
            super(null);
            AbstractC6492s.i(guid, "guid");
            this.guid = guid;
            this.timestamp = j10;
            this.exitCode = i10;
            this.type = EnumC5883c.CMD_RESPONSE;
        }

        @Override // com.ui.comm.v4.UiCommV4Specs$Header
        /* renamed from: a, reason: from getter */
        public String getGuid() {
            return this.guid;
        }

        @Override // com.ui.comm.v4.UiCommV4Specs$Header
        /* renamed from: b, reason: from getter */
        public EnumC5883c getType() {
            return this.type;
        }

        /* renamed from: c, reason: from getter */
        public final int getExitCode() {
            return this.exitCode;
        }

        public final CmdResponse copy(@g(name = "id") String guid, @g(name = "timestamp") long timestamp, @g(name = "exitCode") int exitCode) {
            AbstractC6492s.i(guid, "guid");
            return new CmdResponse(guid, timestamp, exitCode);
        }

        /* renamed from: d, reason: from getter */
        public long getTimestamp() {
            return this.timestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CmdResponse)) {
                return false;
            }
            CmdResponse cmdResponse = (CmdResponse) other;
            return AbstractC6492s.d(this.guid, cmdResponse.guid) && this.timestamp == cmdResponse.timestamp && this.exitCode == cmdResponse.exitCode;
        }

        public int hashCode() {
            return (((this.guid.hashCode() * 31) + Long.hashCode(this.timestamp)) * 31) + Integer.hashCode(this.exitCode);
        }

        public String toString() {
            return "CmdResponse(guid=" + this.guid + ", timestamp=" + this.timestamp + ", exitCode=" + this.exitCode + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B1\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001d\u0010\u0010R\u001a\u0010#\u001a\u00020\u001f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0016\u0010\"¨\u0006$"}, d2 = {"Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;", "Lcom/ui/comm/v4/UiCommV4Specs$Header;", "", "guid", "", "timestamp", "error", "", "errorCode", "<init>", "(Ljava/lang/String;JLjava/lang/String;I)V", "copy", "(Ljava/lang/String;JLjava/lang/String;I)Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_COMMUNITY, "J", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "()J", "d", "I", "Lg9/c;", "f", "Lg9/c;", "()Lg9/c;", "type", "ui-communication-v4_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class Error extends UiCommV4Specs$Header {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String guid;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long timestamp;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String error;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int errorCode;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final EnumC5883c type;

        public enum a {
            UNKNOWN_TYPE(1001),
            UNSUPPORTED(1002),
            NO_REQUEST(1003),
            MISMATCHED_TYPE(1004);

            private final int code;

            a(int i10) {
                this.code = i10;
            }

            public final int getCode() {
                return this.code;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@g(name = "id") String guid, @g(name = "timestamp") long j10, @g(name = "error") String str, @g(name = "errorCode") int i10) {
            super(null);
            AbstractC6492s.i(guid, "guid");
            this.guid = guid;
            this.timestamp = j10;
            this.error = str;
            this.errorCode = i10;
            this.type = EnumC5883c.ERROR;
        }

        @Override // com.ui.comm.v4.UiCommV4Specs$Header
        /* renamed from: a, reason: from getter */
        public String getGuid() {
            return this.guid;
        }

        @Override // com.ui.comm.v4.UiCommV4Specs$Header
        /* renamed from: b, reason: from getter */
        public EnumC5883c getType() {
            return this.type;
        }

        /* renamed from: c, reason: from getter */
        public final String getError() {
            return this.error;
        }

        public final Error copy(@g(name = "id") String guid, @g(name = "timestamp") long timestamp, @g(name = "error") String error, @g(name = "errorCode") int errorCode) {
            AbstractC6492s.i(guid, "guid");
            return new Error(guid, timestamp, error, errorCode);
        }

        /* renamed from: d, reason: from getter */
        public final int getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: e, reason: from getter */
        public long getTimestamp() {
            return this.timestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return AbstractC6492s.d(this.guid, error.guid) && this.timestamp == error.timestamp && AbstractC6492s.d(this.error, error.error) && this.errorCode == error.errorCode;
        }

        public int hashCode() {
            int iHashCode = ((this.guid.hashCode() * 31) + Long.hashCode(this.timestamp)) * 31;
            String str = this.error;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.errorCode);
        }

        public String toString() {
            return "Error(guid=" + this.guid + ", timestamp=" + this.timestamp + ", error=" + this.error + ", errorCode=" + this.errorCode + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\fR\u001a\u0010 \u001a\u00020\u001c8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006!"}, d2 = {"Lcom/ui/comm/v4/UiCommV4Specs$Header$Event;", "Lcom/ui/comm/v4/UiCommV4Specs$Header;", "", "guid", "", "timestamp", "name", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "copy", "(Ljava/lang/String;JLjava/lang/String;)Lcom/ui/comm/v4/UiCommV4Specs$Header$Event;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_COMMUNITY, "J", "d", "()J", "Lg9/c;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Lg9/c;", "()Lg9/c;", "type", "ui-communication-v4_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class Event extends UiCommV4Specs$Header {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String guid;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long timestamp;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final EnumC5883c type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Event(@g(name = "id") String guid, @g(name = "timestamp") long j10, @g(name = "name") String name) {
            super(null);
            AbstractC6492s.i(guid, "guid");
            AbstractC6492s.i(name, "name");
            this.guid = guid;
            this.timestamp = j10;
            this.name = name;
            this.type = EnumC5883c.EVENT;
        }

        @Override // com.ui.comm.v4.UiCommV4Specs$Header
        /* renamed from: a, reason: from getter */
        public String getGuid() {
            return this.guid;
        }

        @Override // com.ui.comm.v4.UiCommV4Specs$Header
        /* renamed from: b, reason: from getter */
        public EnumC5883c getType() {
            return this.type;
        }

        /* renamed from: c, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final Event copy(@g(name = "id") String guid, @g(name = "timestamp") long timestamp, @g(name = "name") String name) {
            AbstractC6492s.i(guid, "guid");
            AbstractC6492s.i(name, "name");
            return new Event(guid, timestamp, name);
        }

        /* renamed from: d, reason: from getter */
        public long getTimestamp() {
            return this.timestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Event)) {
                return false;
            }
            Event event = (Event) other;
            return AbstractC6492s.d(this.guid, event.guid) && this.timestamp == event.timestamp && AbstractC6492s.d(this.name, event.name);
        }

        public int hashCode() {
            return (((this.guid.hashCode() * 31) + Long.hashCode(this.timestamp)) * 31) + this.name.hashCode();
        }

        public String toString() {
            return "Event(guid=" + this.guid + ", timestamp=" + this.timestamp + ", name=" + this.name + ")";
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\u0016\b\u0001\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJP\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\u0016\b\u0003\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b \u0010\u000fR%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\u001b\u0010\"R\u001a\u0010'\u001a\u00020#8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0018\u0010&¨\u0006("}, d2 = {"Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpRequest;", "Lcom/ui/comm/v4/UiCommV4Specs$Header;", "", "guid", "", "timestamp", "method", "path", "", "headers", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "copy", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_COMMUNITY, "J", "f", "()J", "d", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Ljava/util/Map;", "()Ljava/util/Map;", "Lg9/c;", "g", "Lg9/c;", "()Lg9/c;", "type", "ui-communication-v4_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class HttpRequest extends UiCommV4Specs$Header {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String guid;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long timestamp;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String method;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String path;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map headers;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final EnumC5883c type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HttpRequest(@g(name = "id") String guid, @g(name = "timestamp") long j10, @g(name = "method") String method, @g(name = "path") String path, @g(name = "headers") Map<String, String> map) {
            super(null);
            AbstractC6492s.i(guid, "guid");
            AbstractC6492s.i(method, "method");
            AbstractC6492s.i(path, "path");
            this.guid = guid;
            this.timestamp = j10;
            this.method = method;
            this.path = path;
            this.headers = map;
            this.type = EnumC5883c.HTTP_REQUEST;
        }

        @Override // com.ui.comm.v4.UiCommV4Specs$Header
        /* renamed from: a, reason: from getter */
        public String getGuid() {
            return this.guid;
        }

        @Override // com.ui.comm.v4.UiCommV4Specs$Header
        /* renamed from: b, reason: from getter */
        public EnumC5883c getType() {
            return this.type;
        }

        /* renamed from: c, reason: from getter */
        public final Map getHeaders() {
            return this.headers;
        }

        public final HttpRequest copy(@g(name = "id") String guid, @g(name = "timestamp") long timestamp, @g(name = "method") String method, @g(name = "path") String path, @g(name = "headers") Map<String, String> headers) {
            AbstractC6492s.i(guid, "guid");
            AbstractC6492s.i(method, "method");
            AbstractC6492s.i(path, "path");
            return new HttpRequest(guid, timestamp, method, path, headers);
        }

        /* renamed from: d, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        /* renamed from: e, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HttpRequest)) {
                return false;
            }
            HttpRequest httpRequest = (HttpRequest) other;
            return AbstractC6492s.d(this.guid, httpRequest.guid) && this.timestamp == httpRequest.timestamp && AbstractC6492s.d(this.method, httpRequest.method) && AbstractC6492s.d(this.path, httpRequest.path) && AbstractC6492s.d(this.headers, httpRequest.headers);
        }

        /* renamed from: f, reason: from getter */
        public long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            int iHashCode = ((((((this.guid.hashCode() * 31) + Long.hashCode(this.timestamp)) * 31) + this.method.hashCode()) * 31) + this.path.hashCode()) * 31;
            Map map = this.headers;
            return iHashCode + (map == null ? 0 : map.hashCode());
        }

        public String toString() {
            return "HttpRequest(guid=" + this.guid + ", timestamp=" + this.timestamp + ", method=" + this.method + ", path=" + this.path + ", headers=" + this.headers + ")";
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0001\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJF\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\u0016\b\u0003\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0011R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b\u001a\u0010!R\u001a\u0010&\u001a\u00020\"8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0017\u0010%¨\u0006'"}, d2 = {"Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;", "Lcom/ui/comm/v4/UiCommV4Specs$Header;", "", "guid", "", "timestamp", "", "statusCode", "", "headers", "<init>", "(Ljava/lang/String;JILjava/util/Map;)V", "copy", "(Ljava/lang/String;JILjava/util/Map;)Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_COMMUNITY, "J", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "()J", "d", "I", "Ljava/util/Map;", "()Ljava/util/Map;", "Lg9/c;", "f", "Lg9/c;", "()Lg9/c;", "type", "ui-communication-v4_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class HttpResponse extends UiCommV4Specs$Header {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String guid;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long timestamp;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int statusCode;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map headers;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final EnumC5883c type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HttpResponse(@g(name = "id") String guid, @g(name = "timestamp") long j10, @g(name = "statusCode") int i10, @g(name = "headers") Map<String, String> map) {
            super(null);
            AbstractC6492s.i(guid, "guid");
            this.guid = guid;
            this.timestamp = j10;
            this.statusCode = i10;
            this.headers = map;
            this.type = EnumC5883c.HTTP_RESPONSE;
        }

        @Override // com.ui.comm.v4.UiCommV4Specs$Header
        /* renamed from: a, reason: from getter */
        public String getGuid() {
            return this.guid;
        }

        @Override // com.ui.comm.v4.UiCommV4Specs$Header
        /* renamed from: b, reason: from getter */
        public EnumC5883c getType() {
            return this.type;
        }

        /* renamed from: c, reason: from getter */
        public final Map getHeaders() {
            return this.headers;
        }

        public final HttpResponse copy(@g(name = "id") String guid, @g(name = "timestamp") long timestamp, @g(name = "statusCode") int statusCode, @g(name = "headers") Map<String, String> headers) {
            AbstractC6492s.i(guid, "guid");
            return new HttpResponse(guid, timestamp, statusCode, headers);
        }

        /* renamed from: d, reason: from getter */
        public final int getStatusCode() {
            return this.statusCode;
        }

        /* renamed from: e, reason: from getter */
        public long getTimestamp() {
            return this.timestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HttpResponse)) {
                return false;
            }
            HttpResponse httpResponse = (HttpResponse) other;
            return AbstractC6492s.d(this.guid, httpResponse.guid) && this.timestamp == httpResponse.timestamp && this.statusCode == httpResponse.statusCode && AbstractC6492s.d(this.headers, httpResponse.headers);
        }

        public int hashCode() {
            int iHashCode = ((((this.guid.hashCode() * 31) + Long.hashCode(this.timestamp)) * 31) + Integer.hashCode(this.statusCode)) * 31;
            Map map = this.headers;
            return iHashCode + (map == null ? 0 : map.hashCode());
        }

        public String toString() {
            return "HttpResponse(guid=" + this.guid + ", timestamp=" + this.timestamp + ", statusCode=" + this.statusCode + ", headers=" + this.headers + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\fR\u001a\u0010 \u001a\u00020\u001c8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006!"}, d2 = {"Lcom/ui/comm/v4/UiCommV4Specs$Header$Log;", "Lcom/ui/comm/v4/UiCommV4Specs$Header;", "", "guid", "", "timestamp", "level", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "copy", "(Ljava/lang/String;JLjava/lang/String;)Lcom/ui/comm/v4/UiCommV4Specs$Header$Log;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_COMMUNITY, "J", "d", "()J", "Lg9/c;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Lg9/c;", "()Lg9/c;", "type", "ui-communication-v4_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class Log extends UiCommV4Specs$Header {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String guid;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long timestamp;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String level;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final EnumC5883c type;

        public enum a {
            SILLY("silly"),
            DEBUG("debug"),
            VERBOSE("verbose"),
            INFO("info"),
            WARN("warn"),
            ERROR("error"),
            CRITICAL("critical");


            /* renamed from: id, reason: collision with root package name */
            private final String f41235id;

            a(String str) {
                this.f41235id = str;
            }

            public final String getId() {
                return this.f41235id;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Log(@g(name = "id") String guid, @g(name = "timestamp") long j10, @g(name = "level") String level) {
            super(null);
            AbstractC6492s.i(guid, "guid");
            AbstractC6492s.i(level, "level");
            this.guid = guid;
            this.timestamp = j10;
            this.level = level;
            this.type = EnumC5883c.LOG;
        }

        @Override // com.ui.comm.v4.UiCommV4Specs$Header
        /* renamed from: a, reason: from getter */
        public String getGuid() {
            return this.guid;
        }

        @Override // com.ui.comm.v4.UiCommV4Specs$Header
        /* renamed from: b, reason: from getter */
        public EnumC5883c getType() {
            return this.type;
        }

        /* renamed from: c, reason: from getter */
        public final String getLevel() {
            return this.level;
        }

        public final Log copy(@g(name = "id") String guid, @g(name = "timestamp") long timestamp, @g(name = "level") String level) {
            AbstractC6492s.i(guid, "guid");
            AbstractC6492s.i(level, "level");
            return new Log(guid, timestamp, level);
        }

        /* renamed from: d, reason: from getter */
        public long getTimestamp() {
            return this.timestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Log)) {
                return false;
            }
            Log log = (Log) other;
            return AbstractC6492s.d(this.guid, log.guid) && this.timestamp == log.timestamp && AbstractC6492s.d(this.level, log.level);
        }

        public int hashCode() {
            return (((this.guid.hashCode() * 31) + Long.hashCode(this.timestamp)) * 31) + this.level.hashCode();
        }

        public String toString() {
            return "Log(guid=" + this.guid + ", timestamp=" + this.timestamp + ", level=" + this.level + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\fR\u001a\u0010 \u001a\u00020\u001c8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006!"}, d2 = {"Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;", "Lcom/ui/comm/v4/UiCommV4Specs$Header;", "", "guid", "", "timestamp", "action", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "copy", "(Ljava/lang/String;JLjava/lang/String;)Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_COMMUNITY, "J", "d", "()J", "Lg9/c;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Lg9/c;", "()Lg9/c;", "type", "ui-communication-v4_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class Request extends UiCommV4Specs$Header {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String guid;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long timestamp;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String action;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final EnumC5883c type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Request(@g(name = "id") String guid, @g(name = "timestamp") long j10, @g(name = "action") String action) {
            super(null);
            AbstractC6492s.i(guid, "guid");
            AbstractC6492s.i(action, "action");
            this.guid = guid;
            this.timestamp = j10;
            this.action = action;
            this.type = EnumC5883c.REQUEST;
        }

        @Override // com.ui.comm.v4.UiCommV4Specs$Header
        /* renamed from: a, reason: from getter */
        public String getGuid() {
            return this.guid;
        }

        @Override // com.ui.comm.v4.UiCommV4Specs$Header
        /* renamed from: b, reason: from getter */
        public EnumC5883c getType() {
            return this.type;
        }

        /* renamed from: c, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        public final Request copy(@g(name = "id") String guid, @g(name = "timestamp") long timestamp, @g(name = "action") String action) {
            AbstractC6492s.i(guid, "guid");
            AbstractC6492s.i(action, "action");
            return new Request(guid, timestamp, action);
        }

        /* renamed from: d, reason: from getter */
        public long getTimestamp() {
            return this.timestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return AbstractC6492s.d(this.guid, request.guid) && this.timestamp == request.timestamp && AbstractC6492s.d(this.action, request.action);
        }

        public int hashCode() {
            return (((this.guid.hashCode() * 31) + Long.hashCode(this.timestamp)) * 31) + this.action.hashCode();
        }

        public String toString() {
            return "Request(guid=" + this.guid + ", timestamp=" + this.timestamp + ", action=" + this.action + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001\u0018B1\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001d\u0010\u0010R\u001a\u0010#\u001a\u00020\u001f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0016\u0010\"¨\u0006%"}, d2 = {"Lcom/ui/comm/v4/UiCommV4Specs$Header$Response;", "Lcom/ui/comm/v4/UiCommV4Specs$Header;", "", "guid", "", "timestamp", "error", "", "errorCode", "<init>", "(Ljava/lang/String;JLjava/lang/String;I)V", "copy", "(Ljava/lang/String;JLjava/lang/String;I)Lcom/ui/comm/v4/UiCommV4Specs$Header$Response;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_COMMUNITY, "J", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "()J", "d", "I", "Lg9/c;", "f", "Lg9/c;", "()Lg9/c;", "type", "g", "ui-communication-v4_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class Response extends UiCommV4Specs$Header {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String guid;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long timestamp;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String error;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int errorCode;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final EnumC5883c type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Response(@g(name = "id") String guid, @g(name = "timestamp") long j10, @g(name = "error") String str, @g(name = "errorCode") int i10) {
            super(null);
            AbstractC6492s.i(guid, "guid");
            this.guid = guid;
            this.timestamp = j10;
            this.error = str;
            this.errorCode = i10;
            this.type = EnumC5883c.RESPONSE;
        }

        @Override // com.ui.comm.v4.UiCommV4Specs$Header
        /* renamed from: a, reason: from getter */
        public String getGuid() {
            return this.guid;
        }

        @Override // com.ui.comm.v4.UiCommV4Specs$Header
        /* renamed from: b, reason: from getter */
        public EnumC5883c getType() {
            return this.type;
        }

        /* renamed from: c, reason: from getter */
        public final String getError() {
            return this.error;
        }

        public final Response copy(@g(name = "id") String guid, @g(name = "timestamp") long timestamp, @g(name = "error") String error, @g(name = "errorCode") int errorCode) {
            AbstractC6492s.i(guid, "guid");
            return new Response(guid, timestamp, error, errorCode);
        }

        /* renamed from: d, reason: from getter */
        public final int getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: e, reason: from getter */
        public long getTimestamp() {
            return this.timestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return AbstractC6492s.d(this.guid, response.guid) && this.timestamp == response.timestamp && AbstractC6492s.d(this.error, response.error) && this.errorCode == response.errorCode;
        }

        public int hashCode() {
            int iHashCode = ((this.guid.hashCode() * 31) + Long.hashCode(this.timestamp)) * 31;
            String str = this.error;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.errorCode);
        }

        public String toString() {
            return "Response(guid=" + this.guid + ", timestamp=" + this.timestamp + ", error=" + this.error + ", errorCode=" + this.errorCode + ")";
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ UiCommV4Specs$Header(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract String getGuid();

    /* renamed from: b */
    public abstract EnumC5883c getType();

    private UiCommV4Specs$Header() {
    }
}
