package b7;

import java.io.IOException;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* loaded from: classes3.dex */
abstract class g {
    static String a(int i10, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 == 3) {
                sb2.append('/');
                String str = strArr[i11];
                if (str != null) {
                    sb2.append(str);
                }
            } else if (i12 != 4) {
                if (i12 == 5) {
                    sb2.append('/');
                    String str2 = strArr[i11];
                    if (str2 != null) {
                        sb2.append(str2);
                        if (i11 == i10 - 1) {
                            sb2.append("/text()");
                        }
                    }
                }
            } else if (strArr[i11] != null) {
                sb2.append("[@");
                sb2.append(strArr[i11]);
                sb2.append(']');
            }
        }
        return sb2.length() == 0 ? MqttTopic.TOPIC_LEVEL_SEPARATOR : sb2.toString();
    }

    static String b(int i10, int[] iArr) throws IOException {
        int i11 = i10 - 1;
        int i12 = iArr[i11];
        if (i12 == 0) {
            return "EMPTY_DOCUMENT";
        }
        if (i12 == 1) {
            return "NONEMPTY_DOCUMENT";
        }
        if (i12 == 3) {
            return "ELEMENT_OPENING";
        }
        if (i12 == 4) {
            return "ELEMENT_ATTRIBUTE";
        }
        if (i12 == 5) {
            return "ELEMENT_CONTENT";
        }
        if (i12 == 6) {
            return "CLOSED";
        }
        throw new IOException("Unexpected token on top of the stack. Was " + iArr[i11]);
    }
}
