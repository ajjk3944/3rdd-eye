package mh;

import java.io.Serializable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b implements Serializable {
    public final String B;
    public final int D;
    public final int E;
    public final boolean F;
    public final int G;
    public final boolean H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;

    /* renamed from: a, reason: collision with root package name */
    public final int f16703a;

    /* renamed from: d, reason: collision with root package name */
    public final String f16704d;

    /* renamed from: g, reason: collision with root package name */
    public final int f16705g;

    /* renamed from: r, reason: collision with root package name */
    public final int f16706r;

    /* renamed from: x, reason: collision with root package name */
    public final int f16707x;

    /* renamed from: y, reason: collision with root package name */
    public final int f16708y;

    public b(JSONObject jSONObject) {
        this.f16704d = jSONObject.optString("url", "");
        this.f16707x = jSONObject.optInt("remote_port", 0);
        this.f16708y = jSONObject.optInt("local_port", 0);
        this.B = jSONObject.optString("test_name", "");
        this.f16703a = jSONObject.optInt("payload_length_bytes", 0);
        this.D = jSONObject.optInt("echo_factor", 0);
        this.f16706r = jSONObject.optInt("target_send_rate_kbps", 0);
        this.f16705g = jSONObject.optInt("number_packets_to_send", 0);
        this.E = jSONObject.optInt("packet_header_size_bytes", 42);
        this.F = jSONObject.optBoolean("packet_sending_offset_enabled", true);
        this.G = jSONObject.optInt("test_completion_method", 0);
        this.H = jSONObject.optBoolean("create_packets_before_test", false);
        this.I = jSONObject.optInt("version", 1);
        this.J = jSONObject.optInt("verification_version", 2);
        this.K = jSONObject.optInt("verification_packets_to_send", 0);
        this.L = jSONObject.optInt("verification_packets_spacing", 0);
        this.M = jSONObject.optInt("verification_packet_encryption", 1);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UdpConfig{mPayloadLengthBytes=");
        sb2.append(this.f16703a);
        sb2.append(", mUrl='");
        sb2.append(this.f16704d);
        sb2.append("', mNumberPacketsToSend=");
        sb2.append(this.f16705g);
        sb2.append(", mTargetSendRateKbps=");
        sb2.append(this.f16706r);
        sb2.append(", mRemotePort=");
        sb2.append(this.f16707x);
        sb2.append(", mLocalPort=");
        sb2.append(this.f16708y);
        sb2.append(", mTestName='");
        sb2.append(this.B);
        sb2.append("', mEchoFactor=");
        sb2.append(this.D);
        sb2.append(", mPacketHeaderSizeBytes=");
        sb2.append(this.E);
        sb2.append(", mPacketSendingOffsetEnabled=");
        sb2.append(this.F);
        sb2.append(", mTestCompletionMethod=");
        sb2.append(this.G);
        sb2.append(", mCreatePacketsBeforeTest=");
        sb2.append(this.H);
        sb2.append(", mVerificationSchemaVersion=");
        sb2.append(this.J);
        sb2.append(", mVerificationPacketsToSend=");
        sb2.append(this.K);
        sb2.append(", mVerificationPacketsSpacing=");
        sb2.append(this.L);
        sb2.append(", mVerificationPacketEncryption=");
        return c7.a.q(sb2, this.M, '}');
    }
}
