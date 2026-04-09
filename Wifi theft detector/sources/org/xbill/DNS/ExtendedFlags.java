package org.xbill.DNS;

import com.mbridge.msdk.foundation.entity.b;

/* loaded from: classes4.dex */
public final class ExtendedFlags {
    public static final int DO = 32768;
    private static Mnemonic extflags;

    static {
        Mnemonic mnemonic = new Mnemonic("EDNS Flag", 3);
        extflags = mnemonic;
        mnemonic.setMaximum(65535);
        extflags.setPrefix("FLAG");
        extflags.setNumericAllowed(true);
        extflags.add(32768, b.JSON_KEY_DO);
    }

    private ExtendedFlags() {
    }

    public static String string(int i10) {
        return extflags.getText(i10);
    }

    public static int value(String str) {
        return extflags.getValue(str);
    }
}
