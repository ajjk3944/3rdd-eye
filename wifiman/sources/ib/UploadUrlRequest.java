package ib;

import Vi.n;
import Zi.C0;
import Zi.C3710i;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.util.SnmpConfigurator;

@n
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002*\u001dBw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\u0091\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010 R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010&\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010 R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010&\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010 R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010&\u0012\u0004\b2\u0010)\u001a\u0004\b1\u0010 R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010&\u0012\u0004\b5\u0010)\u001a\u0004\b4\u0010 R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010&\u0012\u0004\b8\u0010)\u001a\u0004\b7\u0010 R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u0010&\u0012\u0004\b;\u0010)\u001a\u0004\b:\u0010 R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u0010&\u0012\u0004\b>\u0010)\u001a\u0004\b=\u0010 R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u0010&\u0012\u0004\bA\u0010)\u001a\u0004\b@\u0010 R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010&\u0012\u0004\bD\u0010)\u001a\u0004\bC\u0010 R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bE\u0010F\u0012\u0004\bI\u0010)\u001a\u0004\bG\u0010HR \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bJ\u0010&\u0012\u0004\bL\u0010)\u001a\u0004\bK\u0010 ¨\u0006N"}, d2 = {"Lib/a;", "", "", "anonymousDeviceId", "anonymousControllerId", "appVersion", "phoneModel", "bomrev", "kernelVersion", "cpuArchitecture", "crashLogLabel", "productLine", "type", "", "upload", "systemTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lib/a;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAnonymousDeviceId", "getAnonymousDeviceId$annotations", "()V", SnmpConfigurator.O_BIND_ADDRESS, "getAnonymousControllerId", "getAnonymousControllerId$annotations", SnmpConfigurator.O_COMMUNITY, "getAppVersion", "getAppVersion$annotations", "d", "getPhoneModel", "getPhoneModel$annotations", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "getBomrev", "getBomrev$annotations", "f", "getKernelVersion", "getKernelVersion$annotations", "g", "getCpuArchitecture", "getCpuArchitecture$annotations", "h", "getCrashLogLabel", "getCrashLogLabel$annotations", "i", "getProductLine", "getProductLine$annotations", "j", "getType", "getType$annotations", "k", "Z", "getUpload", "()Z", "getUpload$annotations", "l", "getSystemTime", "getSystemTime$annotations", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ib.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes3.dex */
public final /* data */ class UploadUrlRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: m, reason: collision with root package name */
    private static final DateFormat f49107m;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String anonymousDeviceId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String anonymousControllerId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String appVersion;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneModel;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String bomrev;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String kernelVersion;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cpuArchitecture;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String crashLogLabel;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productLine;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean upload;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String systemTime;

    /* renamed from: ib.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1847a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final C1847a f49120a;
        private static final Xi.f descriptor;

        static {
            C1847a c1847a = new C1847a();
            f49120a = c1847a;
            H0 h02 = new H0("com.ui.unifi.core.base.net.client.webrtc.log.UploadUrlRequest", c1847a, 12);
            h02.p("anonymous_device_id", false);
            h02.p("anonymous_controller_id", false);
            h02.p("version", false);
            h02.p("model", false);
            h02.p("bomrev", true);
            h02.p("kernel_version", true);
            h02.p("architecture", true);
            h02.p("crash_log", true);
            h02.p("product_line", true);
            h02.p("type", true);
            h02.p("upload", true);
            h02.p("system_time", true);
            descriptor = h02;
        }

        private C1847a() {
        }

        @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
        public final Xi.f a() {
            return descriptor;
        }

        @Override // Zi.M
        public final Vi.b[] d() {
            W0 w02 = W0.f25599a;
            return new Vi.b[]{w02, w02, w02, w02, w02, w02, w02, w02, w02, w02, C3710i.f25639a, w02};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final UploadUrlRequest c(Yi.e decoder) {
            String str;
            int i10;
            String strW;
            boolean z10;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            int i11 = 0;
            if (cVarC.B()) {
                String strW2 = cVarC.w(fVar, 0);
                String strW3 = cVarC.w(fVar, 1);
                String strW4 = cVarC.w(fVar, 2);
                String strW5 = cVarC.w(fVar, 3);
                String strW6 = cVarC.w(fVar, 4);
                String strW7 = cVarC.w(fVar, 5);
                String strW8 = cVarC.w(fVar, 6);
                String strW9 = cVarC.w(fVar, 7);
                String strW10 = cVarC.w(fVar, 8);
                String strW11 = cVarC.w(fVar, 9);
                boolean zU = cVarC.u(fVar, 10);
                str = strW2;
                strW = cVarC.w(fVar, 11);
                z10 = zU;
                str2 = strW11;
                str3 = strW9;
                str4 = strW8;
                str5 = strW7;
                str6 = strW5;
                str7 = strW10;
                str8 = strW6;
                str9 = strW4;
                str10 = strW3;
                i10 = 4095;
            } else {
                String strW12 = null;
                String strW13 = null;
                String strW14 = null;
                String strW15 = null;
                String strW16 = null;
                String strW17 = null;
                String strW18 = null;
                String strW19 = null;
                String strW20 = null;
                String strW21 = null;
                String strW22 = null;
                boolean z11 = true;
                boolean zU2 = false;
                while (z11) {
                    int iK = cVarC.k(fVar);
                    switch (iK) {
                        case -1:
                            z11 = false;
                            break;
                        case 0:
                            i11 |= 1;
                            strW12 = cVarC.w(fVar, 0);
                            continue;
                        case 1:
                            strW22 = cVarC.w(fVar, 1);
                            i11 |= 2;
                            continue;
                        case 2:
                            strW21 = cVarC.w(fVar, 2);
                            i11 |= 4;
                            break;
                        case 3:
                            strW18 = cVarC.w(fVar, 3);
                            i11 |= 8;
                            break;
                        case 4:
                            strW20 = cVarC.w(fVar, 4);
                            i11 |= 16;
                            break;
                        case 5:
                            strW17 = cVarC.w(fVar, 5);
                            i11 |= 32;
                            break;
                        case 6:
                            strW16 = cVarC.w(fVar, 6);
                            i11 |= 64;
                            break;
                        case 7:
                            strW15 = cVarC.w(fVar, 7);
                            i11 |= 128;
                            break;
                        case 8:
                            strW19 = cVarC.w(fVar, 8);
                            i11 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            break;
                        case 9:
                            strW14 = cVarC.w(fVar, 9);
                            i11 |= 512;
                            break;
                        case 10:
                            zU2 = cVarC.u(fVar, 10);
                            i11 |= 1024;
                            break;
                        case 11:
                            strW13 = cVarC.w(fVar, 11);
                            i11 |= 2048;
                            break;
                        default:
                            throw new UnknownFieldException(iK);
                    }
                }
                str = strW12;
                i10 = i11;
                strW = strW13;
                z10 = zU2;
                str2 = strW14;
                str3 = strW15;
                str4 = strW16;
                str5 = strW17;
                str6 = strW18;
                str7 = strW19;
                str8 = strW20;
                str9 = strW21;
                str10 = strW22;
            }
            cVarC.b(fVar);
            return new UploadUrlRequest(i10, str, str10, str9, str6, str8, str5, str4, str3, str7, str2, z10, strW, (R0) null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, UploadUrlRequest value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            UploadUrlRequest.a(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: ib.a$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Vi.b serializer() {
            return C1847a.f49120a;
        }

        private Companion() {
        }
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        f49107m = simpleDateFormat;
    }

    public /* synthetic */ UploadUrlRequest(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z10, String str11, R0 r02) {
        if (15 != (i10 & 15)) {
            C0.a(i10, 15, C1847a.f49120a.a());
        }
        this.anonymousDeviceId = str;
        this.anonymousControllerId = str2;
        this.appVersion = str3;
        this.phoneModel = str4;
        if ((i10 & 16) == 0) {
            this.bomrev = "unset";
        } else {
            this.bomrev = str5;
        }
        if ((i10 & 32) == 0) {
            this.kernelVersion = "unset";
        } else {
            this.kernelVersion = str6;
        }
        if ((i10 & 64) == 0) {
            this.cpuArchitecture = "unset";
        } else {
            this.cpuArchitecture = str7;
        }
        if ((i10 & 128) == 0) {
            this.crashLogLabel = "WebRTC connection failed";
        } else {
            this.crashLogLabel = str8;
        }
        if ((i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.productLine = "protect";
        } else {
            this.productLine = str9;
        }
        if ((i10 & 512) == 0) {
            this.type = "log";
        } else {
            this.type = str10;
        }
        if ((i10 & 1024) == 0) {
            this.upload = true;
        } else {
            this.upload = z10;
        }
        if ((i10 & 2048) == 0) {
            this.systemTime = f49107m.format(new Date());
        } else {
            this.systemTime = str11;
        }
    }

    public static final /* synthetic */ void a(UploadUrlRequest self, Yi.d output, Xi.f serialDesc) {
        output.y(serialDesc, 0, self.anonymousDeviceId);
        output.y(serialDesc, 1, self.anonymousControllerId);
        output.y(serialDesc, 2, self.appVersion);
        output.y(serialDesc, 3, self.phoneModel);
        if (output.o(serialDesc, 4) || !AbstractC6492s.d(self.bomrev, "unset")) {
            output.y(serialDesc, 4, self.bomrev);
        }
        if (output.o(serialDesc, 5) || !AbstractC6492s.d(self.kernelVersion, "unset")) {
            output.y(serialDesc, 5, self.kernelVersion);
        }
        if (output.o(serialDesc, 6) || !AbstractC6492s.d(self.cpuArchitecture, "unset")) {
            output.y(serialDesc, 6, self.cpuArchitecture);
        }
        if (output.o(serialDesc, 7) || !AbstractC6492s.d(self.crashLogLabel, "WebRTC connection failed")) {
            output.y(serialDesc, 7, self.crashLogLabel);
        }
        if (output.o(serialDesc, 8) || !AbstractC6492s.d(self.productLine, "protect")) {
            output.y(serialDesc, 8, self.productLine);
        }
        if (output.o(serialDesc, 9) || !AbstractC6492s.d(self.type, "log")) {
            output.y(serialDesc, 9, self.type);
        }
        if (output.o(serialDesc, 10) || !self.upload) {
            output.i(serialDesc, 10, self.upload);
        }
        if (!output.o(serialDesc, 11) && AbstractC6492s.d(self.systemTime, f49107m.format(new Date()))) {
            return;
        }
        output.y(serialDesc, 11, self.systemTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadUrlRequest)) {
            return false;
        }
        UploadUrlRequest uploadUrlRequest = (UploadUrlRequest) other;
        return AbstractC6492s.d(this.anonymousDeviceId, uploadUrlRequest.anonymousDeviceId) && AbstractC6492s.d(this.anonymousControllerId, uploadUrlRequest.anonymousControllerId) && AbstractC6492s.d(this.appVersion, uploadUrlRequest.appVersion) && AbstractC6492s.d(this.phoneModel, uploadUrlRequest.phoneModel) && AbstractC6492s.d(this.bomrev, uploadUrlRequest.bomrev) && AbstractC6492s.d(this.kernelVersion, uploadUrlRequest.kernelVersion) && AbstractC6492s.d(this.cpuArchitecture, uploadUrlRequest.cpuArchitecture) && AbstractC6492s.d(this.crashLogLabel, uploadUrlRequest.crashLogLabel) && AbstractC6492s.d(this.productLine, uploadUrlRequest.productLine) && AbstractC6492s.d(this.type, uploadUrlRequest.type) && this.upload == uploadUrlRequest.upload && AbstractC6492s.d(this.systemTime, uploadUrlRequest.systemTime);
    }

    public int hashCode() {
        return (((((((((((((((((((((this.anonymousDeviceId.hashCode() * 31) + this.anonymousControllerId.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + this.phoneModel.hashCode()) * 31) + this.bomrev.hashCode()) * 31) + this.kernelVersion.hashCode()) * 31) + this.cpuArchitecture.hashCode()) * 31) + this.crashLogLabel.hashCode()) * 31) + this.productLine.hashCode()) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.upload)) * 31) + this.systemTime.hashCode();
    }

    public String toString() {
        return "UploadUrlRequest(anonymousDeviceId=" + this.anonymousDeviceId + ", anonymousControllerId=" + this.anonymousControllerId + ", appVersion=" + this.appVersion + ", phoneModel=" + this.phoneModel + ", bomrev=" + this.bomrev + ", kernelVersion=" + this.kernelVersion + ", cpuArchitecture=" + this.cpuArchitecture + ", crashLogLabel=" + this.crashLogLabel + ", productLine=" + this.productLine + ", type=" + this.type + ", upload=" + this.upload + ", systemTime=" + this.systemTime + ")";
    }

    public UploadUrlRequest(String anonymousDeviceId, String anonymousControllerId, String appVersion, String phoneModel, String bomrev, String kernelVersion, String cpuArchitecture, String crashLogLabel, String productLine, String type, boolean z10, String systemTime) {
        AbstractC6492s.i(anonymousDeviceId, "anonymousDeviceId");
        AbstractC6492s.i(anonymousControllerId, "anonymousControllerId");
        AbstractC6492s.i(appVersion, "appVersion");
        AbstractC6492s.i(phoneModel, "phoneModel");
        AbstractC6492s.i(bomrev, "bomrev");
        AbstractC6492s.i(kernelVersion, "kernelVersion");
        AbstractC6492s.i(cpuArchitecture, "cpuArchitecture");
        AbstractC6492s.i(crashLogLabel, "crashLogLabel");
        AbstractC6492s.i(productLine, "productLine");
        AbstractC6492s.i(type, "type");
        AbstractC6492s.i(systemTime, "systemTime");
        this.anonymousDeviceId = anonymousDeviceId;
        this.anonymousControllerId = anonymousControllerId;
        this.appVersion = appVersion;
        this.phoneModel = phoneModel;
        this.bomrev = bomrev;
        this.kernelVersion = kernelVersion;
        this.cpuArchitecture = cpuArchitecture;
        this.crashLogLabel = crashLogLabel;
        this.productLine = productLine;
        this.type = type;
        this.upload = z10;
        this.systemTime = systemTime;
    }

    public /* synthetic */ UploadUrlRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z10, String str11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i10 & 16) != 0 ? "unset" : str5, (i10 & 32) != 0 ? "unset" : str6, (i10 & 64) != 0 ? "unset" : str7, (i10 & 128) != 0 ? "WebRTC connection failed" : str8, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? "protect" : str9, (i10 & 512) != 0 ? "log" : str10, (i10 & 1024) != 0 ? true : z10, (i10 & 2048) != 0 ? f49107m.format(new Date()) : str11);
    }
}
