package com.amazonaws.mobileconnectors.iot;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSSessionCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.BasicSessionCredentials;
import com.amazonaws.auth.SigningAlgorithm;
import com.amazonaws.regions.Region;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* loaded from: classes.dex */
class AWSIotWebSocketUrlSigner {

    /* renamed from: a, reason: collision with root package name */
    private String f34139a;

    public AWSIotWebSocketUrlSigner(String str) {
        this.f34139a = str;
    }

    private String a(long j10) {
        return DateUtils.b("yyyyMMdd'T'HHmmss'Z'", new Date(j10));
    }

    private String b(long j10) {
        return DateUtils.b("yyyyMMdd", new Date(j10));
    }

    private byte[] d(String str, String str2, String str3, AWSCredentials aWSCredentials) {
        byte[] bytes = ("AWS4" + aWSCredentials.c()).getBytes();
        SigningAlgorithm signingAlgorithm = SigningAlgorithm.HmacSHA256;
        return g("aws4_request", g(str3, g(str2, g(str, bytes, signingAlgorithm), signingAlgorithm), signingAlgorithm), signingAlgorithm);
    }

    public String c(String str, AWSCredentials aWSCredentials, long j10, Region region) throws UnsupportedEncodingException {
        String strD = region.d();
        AWSCredentials aWSCredentialsF = f(aWSCredentials);
        String strA = a(j10);
        String strB = b(j10);
        String str2 = strB + MqttTopic.TOPIC_LEVEL_SEPARATOR + strD + MqttTopic.TOPIC_LEVEL_SEPARATOR + this.f34139a + "/aws4_request";
        StringBuilder sb2 = new StringBuilder();
        sb2.append("X-Amz-Algorithm=");
        sb2.append("AWS4-HMAC-SHA256");
        sb2.append("&X-Amz-Credential=");
        try {
            String str3 = aWSCredentialsF.b() + MqttTopic.TOPIC_LEVEL_SEPARATOR + str2;
            Charset charset = StringUtils.f34152a;
            sb2.append(URLEncoder.encode(str3, charset.name()));
            sb2.append("&X-Amz-Date=");
            sb2.append(strA);
            sb2.append("&X-Amz-SignedHeaders=host");
            String strA2 = BinaryUtils.a(h(("AWS4-HMAC-SHA256\n" + strA + "\n" + str2 + "\n" + BinaryUtils.a(e("GET\n/mqtt\n" + sb2.toString() + "\n" + ("host:" + str + "\n") + "\nhost\n" + BinaryUtils.a(e(""))))).getBytes(), d(strB, strD, this.f34139a, aWSCredentialsF), SigningAlgorithm.HmacSHA256));
            sb2.append("&X-Amz-Signature=");
            sb2.append(strA2);
            String str4 = "wss://" + str + "/mqtt?" + sb2.toString();
            if (!(aWSCredentials instanceof AWSSessionCredentials)) {
                return str4;
            }
            try {
                return str4 + "&X-Amz-Security-Token=" + URLEncoder.encode(((AWSSessionCredentials) aWSCredentials).a(), charset.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AmazonClientException("Error encoding URL when appending session token to URL", e10);
            }
        } catch (UnsupportedEncodingException e11) {
            throw new AmazonClientException("Error encoding URL when building WebSocket URL", e11);
        }
    }

    byte[] e(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(StringUtils.f34152a));
            return messageDigest.digest();
        } catch (Exception e10) {
            throw new AmazonClientException("Unable to compute hash while signing request: " + e10.getMessage(), e10);
        }
    }

    AWSCredentials f(AWSCredentials aWSCredentials) {
        String strB = aWSCredentials.b();
        String strC = aWSCredentials.c();
        boolean z10 = aWSCredentials instanceof AWSSessionCredentials;
        String strA = z10 ? ((AWSSessionCredentials) aWSCredentials).a() : null;
        if (strC != null) {
            strC = strC.trim();
        }
        if (strB != null) {
            strB = strB.trim();
        }
        if (strA != null) {
            strA = strA.trim();
        }
        return z10 ? new BasicSessionCredentials(strB, strC, strA) : new BasicAWSCredentials(strB, strC);
    }

    byte[] g(String str, byte[] bArr, SigningAlgorithm signingAlgorithm) {
        try {
            return h(str.getBytes(StringUtils.f34152a), bArr, signingAlgorithm);
        } catch (Exception e10) {
            throw new AmazonClientException("Unable to calculate a request signature: " + e10.getMessage(), e10);
        }
    }

    byte[] h(byte[] bArr, byte[] bArr2, SigningAlgorithm signingAlgorithm) throws NoSuchAlgorithmException, InvalidKeyException {
        try {
            Mac mac = Mac.getInstance(signingAlgorithm.toString());
            mac.init(new SecretKeySpec(bArr2, signingAlgorithm.toString()));
            return mac.doFinal(bArr);
        } catch (Exception e10) {
            throw new AmazonClientException("Unable to calculate a request signature: " + e10.getMessage(), e10);
        }
    }
}
