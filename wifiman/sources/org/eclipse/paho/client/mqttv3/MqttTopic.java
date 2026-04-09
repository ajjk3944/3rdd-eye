package org.eclipse.paho.client.mqttv3;

import java.io.UnsupportedEncodingException;
import kj.C6473a;
import nj.o;
import qj.AbstractC7513b;

/* loaded from: classes3.dex */
public class MqttTopic {
    private static final int MAX_TOPIC_LEN = 65535;
    private static final int MIN_TOPIC_LEN = 1;
    public static final String MULTI_LEVEL_WILDCARD = "#";
    public static final String MULTI_LEVEL_WILDCARD_PATTERN = "/#";
    private static final char NUL = 0;
    public static final String SINGLE_LEVEL_WILDCARD = "+";
    public static final String TOPIC_LEVEL_SEPARATOR = "/";
    public static final String TOPIC_WILDCARDS = "#+";
    private C6473a comms;
    private String name;

    public MqttTopic(String str, C6473a c6473a) {
        this.comms = c6473a;
        this.name = str;
    }

    private o createPublish(MqttMessage mqttMessage) {
        return new o(getName(), mqttMessage);
    }

    public static boolean isMatched(String str, String str2) throws IllegalArgumentException {
        int length = str2.length();
        int length2 = str.length();
        validate(str, true);
        validate(str2, false);
        if (str.equals(str2)) {
            return true;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 < length2 && i11 < length) {
                if (str.charAt(i10) != '#') {
                    if ((str2.charAt(i11) == '/' && str.charAt(i10) != '/') || (str.charAt(i10) != '+' && str.charAt(i10) != '#' && str.charAt(i10) != str2.charAt(i11))) {
                        break;
                    }
                    if (str.charAt(i10) == '+') {
                        int i12 = i11 + 1;
                        while (i12 < length && str2.charAt(i12) != '/') {
                            i12 = i11 + 2;
                            i11++;
                        }
                    }
                    i10++;
                    i11++;
                } else {
                    i11 = length;
                    i10 = length2;
                    break;
                }
            } else {
                break;
            }
        }
        if (i11 == length && i10 == length2) {
            return true;
        }
        if (str.length() - i10 > 0 && i11 == length) {
            if (str2.charAt(i11 - 1) == '/' && str.charAt(i10) == '#') {
                return true;
            }
            if (str.length() - i10 > 1 && str.substring(i10, i10 + 2).equals(MULTI_LEVEL_WILDCARD_PATTERN)) {
                return true;
            }
        }
        return false;
    }

    public static void validate(String str, boolean z10) throws IllegalArgumentException {
        try {
            int length = str.getBytes("UTF-8").length;
            if (length < 1 || length > MAX_TOPIC_LEN) {
                throw new IllegalArgumentException(String.format("Invalid topic length, should be in range[%d, %d]!", 1, Integer.valueOf(MAX_TOPIC_LEN)));
            }
            if (!z10) {
                if (AbstractC7513b.a(str, TOPIC_WILDCARDS)) {
                    throw new IllegalArgumentException("The topic name MUST NOT contain any wildcard characters (#+)");
                }
            } else {
                if (AbstractC7513b.d(str, new String[]{MULTI_LEVEL_WILDCARD, SINGLE_LEVEL_WILDCARD})) {
                    return;
                }
                if (AbstractC7513b.c(str, MULTI_LEVEL_WILDCARD) <= 1 && (!str.contains(MULTI_LEVEL_WILDCARD) || str.endsWith(MULTI_LEVEL_WILDCARD_PATTERN))) {
                    validateSingleLevelWildcard(str);
                } else {
                    throw new IllegalArgumentException("Invalid usage of multi-level wildcard in topic string: " + str);
                }
            }
        } catch (UnsupportedEncodingException e10) {
            throw new IllegalStateException(e10.getMessage());
        }
    }

    private static void validateSingleLevelWildcard(String str) {
        char cCharAt = SINGLE_LEVEL_WILDCARD.charAt(0);
        char cCharAt2 = TOPIC_LEVEL_SEPARATOR.charAt(0);
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 - 1;
            char c10 = i11 >= 0 ? charArray[i11] : (char) 0;
            int i12 = i10 + 1;
            char c11 = i12 < length ? charArray[i12] : (char) 0;
            if (charArray[i10] == cCharAt && ((c10 != cCharAt2 && c10 != 0) || (c11 != cCharAt2 && c11 != 0))) {
                throw new IllegalArgumentException(String.format("Invalid usage of single-level wildcard in topic string '%s'!", str));
            }
            i10 = i12;
        }
    }

    public String getName() {
        return this.name;
    }

    public MqttDeliveryToken publish(byte[] bArr, int i10, boolean z10) throws IllegalStateException, MqttException {
        MqttMessage mqttMessage = new MqttMessage(bArr);
        mqttMessage.setQos(i10);
        mqttMessage.setRetained(z10);
        return publish(mqttMessage);
    }

    public String toString() {
        return getName();
    }

    public MqttDeliveryToken publish(MqttMessage mqttMessage) throws MqttException {
        MqttDeliveryToken mqttDeliveryToken = new MqttDeliveryToken(this.comms.B().getClientId());
        mqttDeliveryToken.setMessage(mqttMessage);
        this.comms.S(createPublish(mqttMessage), mqttDeliveryToken);
        mqttDeliveryToken.internalTok.E();
        return mqttDeliveryToken;
    }
}
