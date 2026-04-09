package com.ui.unifi.core.base.net.models.config;

import Vi.b;
import Vi.m;
import Vi.n;
import Xi.f;
import Yi.c;
import Yi.d;
import Yi.e;
import Zi.C0;
import Zi.C3709h0;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W;
import Zi.W0;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.util.SnmpConfigurator;

@n
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0019R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b/\u0010*\u001a\u0004\b.\u0010\u001cR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b2\u0010*\u001a\u0004\b1\u0010\u001e¨\u00066"}, d2 = {"Lcom/ui/unifi/core/base/net/models/config/BackupConfig;", "", "", "fileKey", "filename", "", "size", "", "time", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJ)V", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IJLZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "write$Self$unificore_release", "(Lcom/ui/unifi/core/base/net/models/config/BackupConfig;LYi/d;LXi/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;IJ)Lcom/ui/unifi/core/base/net/models/config/BackupConfig;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFileKey", "getFileKey$annotations", "()V", "getFilename", "getFilename$annotations", "I", "getSize", "getSize$annotations", "J", "getTime", "getTime$annotations", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_BIND_ADDRESS, "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BackupConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String fileKey;
    private final String filename;
    private final int size;
    private final long time;

    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f42349a;
        private static final f descriptor;

        static {
            a aVar = new a();
            f42349a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.config.BackupConfig", aVar, 4);
            h02.p("fileKey", false);
            h02.p("filename", false);
            h02.p("size", false);
            h02.p("time", false);
            descriptor = h02;
        }

        private a() {
        }

        @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
        public final f a() {
            return descriptor;
        }

        @Override // Zi.M
        public final b[] d() {
            W0 w02 = W0.f25599a;
            return new b[]{w02, w02, W.f25597a, C3709h0.f25636a};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final BackupConfig c(e decoder) {
            String str;
            int i10;
            int i11;
            String str2;
            long jQ;
            AbstractC6492s.i(decoder, "decoder");
            f fVar = descriptor;
            c cVarC = decoder.c(fVar);
            if (cVarC.B()) {
                String strW = cVarC.w(fVar, 0);
                String strW2 = cVarC.w(fVar, 1);
                str = strW;
                i10 = 15;
                i11 = cVarC.i(fVar, 2);
                str2 = strW2;
                jQ = cVarC.q(fVar, 3);
            } else {
                String strW3 = null;
                String strW4 = null;
                boolean z10 = true;
                long jQ2 = 0;
                int i12 = 0;
                int i13 = 0;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        strW3 = cVarC.w(fVar, 0);
                        i12 |= 1;
                    } else if (iK == 1) {
                        strW4 = cVarC.w(fVar, 1);
                        i12 |= 2;
                    } else if (iK == 2) {
                        i13 = cVarC.i(fVar, 2);
                        i12 |= 4;
                    } else {
                        if (iK != 3) {
                            throw new UnknownFieldException(iK);
                        }
                        jQ2 = cVarC.q(fVar, 3);
                        i12 |= 8;
                    }
                }
                str = strW3;
                i10 = i12;
                i11 = i13;
                str2 = strW4;
                jQ = jQ2;
            }
            cVarC.b(fVar);
            return new BackupConfig(i10, str, str2, i11, jQ, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, BackupConfig value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            f fVar = descriptor;
            d dVarC = encoder.c(fVar);
            BackupConfig.write$Self$unificore_release(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: com.ui.unifi.core.base.net.models.config.BackupConfig$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final b serializer() {
            return a.f42349a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BackupConfig(int i10, String str, String str2, int i11, long j10, R0 r02) {
        if (15 != (i10 & 15)) {
            C0.a(i10, 15, a.f42349a.a());
        }
        this.fileKey = str;
        this.filename = str2;
        this.size = i11;
        this.time = j10;
    }

    public static /* synthetic */ BackupConfig copy$default(BackupConfig backupConfig, String str, String str2, int i10, long j10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = backupConfig.fileKey;
        }
        if ((i11 & 2) != 0) {
            str2 = backupConfig.filename;
        }
        String str3 = str2;
        if ((i11 & 4) != 0) {
            i10 = backupConfig.size;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            j10 = backupConfig.time;
        }
        return backupConfig.copy(str, str3, i12, j10);
    }

    @m("fileKey")
    public static /* synthetic */ void getFileKey$annotations() {
    }

    @m("filename")
    public static /* synthetic */ void getFilename$annotations() {
    }

    @m("size")
    public static /* synthetic */ void getSize$annotations() {
    }

    @m("time")
    public static /* synthetic */ void getTime$annotations() {
    }

    public static final /* synthetic */ void write$Self$unificore_release(BackupConfig self, d output, f serialDesc) {
        output.y(serialDesc, 0, self.fileKey);
        output.y(serialDesc, 1, self.filename);
        output.C(serialDesc, 2, self.size);
        output.p(serialDesc, 3, self.time);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFileKey() {
        return this.fileKey;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    public final BackupConfig copy(String fileKey, String filename, int size, long time) {
        AbstractC6492s.i(fileKey, "fileKey");
        AbstractC6492s.i(filename, "filename");
        return new BackupConfig(fileKey, filename, size, time);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackupConfig)) {
            return false;
        }
        BackupConfig backupConfig = (BackupConfig) other;
        return AbstractC6492s.d(this.fileKey, backupConfig.fileKey) && AbstractC6492s.d(this.filename, backupConfig.filename) && this.size == backupConfig.size && this.time == backupConfig.time;
    }

    public final String getFileKey() {
        return this.fileKey;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final int getSize() {
        return this.size;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((((this.fileKey.hashCode() * 31) + this.filename.hashCode()) * 31) + Integer.hashCode(this.size)) * 31) + Long.hashCode(this.time);
    }

    public String toString() {
        return "BackupConfig(fileKey=" + this.fileKey + ", filename=" + this.filename + ", size=" + this.size + ", time=" + this.time + ")";
    }

    public BackupConfig(String fileKey, String filename, int i10, long j10) {
        AbstractC6492s.i(fileKey, "fileKey");
        AbstractC6492s.i(filename, "filename");
        this.fileKey = fileKey;
        this.filename = filename;
        this.size = i10;
        this.time = j10;
    }
}
