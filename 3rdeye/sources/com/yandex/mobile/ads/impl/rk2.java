package com.yandex.mobile.ads.impl;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class rk2 {
    public static boolean a(XmlPullParser p10) throws XmlPullParserException, IOException {
        kotlin.jvm.internal.l.f(p10, "p");
        return p10.next() != 3;
    }

    public static boolean b(XmlPullParser p10) throws XmlPullParserException {
        kotlin.jvm.internal.l.f(p10, "p");
        return p10.getEventType() == 2;
    }

    public static String c(XmlPullParser p10) throws XmlPullParserException, IOException {
        String text;
        kotlin.jvm.internal.l.f(p10, "p");
        if (p10.next() == 4) {
            text = p10.getText();
            kotlin.jvm.internal.l.e(text, "getText(...)");
            p10.nextTag();
        } else {
            text = "";
        }
        int length = text.length() - 1;
        int i = 0;
        boolean z10 = false;
        while (i <= length) {
            boolean z11 = kotlin.jvm.internal.l.h(text.charAt(!z10 ? i : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i++;
            } else {
                z10 = true;
            }
        }
        return text.subSequence(i, length + 1).toString();
    }

    public static void d(XmlPullParser parser) throws XmlPullParserException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        if (parser.getEventType() != 2) {
            throw new IllegalStateException("Check failed.");
        }
        int i = 1;
        while (i != 0) {
            int next = parser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
