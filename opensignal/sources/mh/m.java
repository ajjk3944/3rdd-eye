package mh;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public String f16769a;

    /* renamed from: b, reason: collision with root package name */
    public int f16770b;

    /* renamed from: c, reason: collision with root package name */
    public int f16771c;

    /* renamed from: d, reason: collision with root package name */
    public int f16772d;

    /* renamed from: e, reason: collision with root package name */
    public float f16773e;

    /* renamed from: f, reason: collision with root package name */
    public String f16774f;

    /* renamed from: g, reason: collision with root package name */
    public String f16775g;

    /* renamed from: h, reason: collision with root package name */
    public long[] f16776h;

    /* renamed from: i, reason: collision with root package name */
    public long[] f16777i;
    public List j;
    public List k;

    public static String a(long[] jArr) {
        if (jArr == null || jArr.length <= 100) {
            return Arrays.toString(jArr);
        }
        return Arrays.toString(Arrays.copyOfRange(jArr, 0, 100)) + "...";
    }

    public final String toString() {
        return "UdpTestResult{\nmTestName='" + this.f16769a + "',\n mPacketsSent=" + this.f16770b + ",\n mPayloadSize=" + this.f16771c + ",\n mTargetSendKbps=" + this.f16772d + ",\n mEchoFactor=" + this.f16773e + ",\n mProviderName='null',\n mIp='" + this.f16774f + "',\n mHost='" + this.f16775g + "',\n mSentTimes='" + a(this.f16776h) + "',\n mReceivedTimes='" + a(this.f16777i) + "',\n mTraffic='null',\n mPublicIp='null',\n mPacketPayloadsSent=" + this.j + "',\n mPacketPayloadsReceived=" + this.k + "'}";
    }
}
