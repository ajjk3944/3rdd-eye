package org.snmp4j.util;

import java.text.ParseException;

/* loaded from: classes2.dex */
public interface OIDTextFormat {
    String format(int[] iArr);

    String formatForRoundTrip(int[] iArr);

    int[] parse(String str) throws ParseException;
}
