package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* compiled from: UninitializedMessageException.java */
/* loaded from: classes2.dex */
public class t0 extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    private final List<String> missingFields;

    public t0(U u8) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.missingFields = null;
    }

    private static String buildDescription(List<String> list) {
        StringBuilder sb = new StringBuilder("Message missing required fields: ");
        boolean z10 = true;
        for (String str : list) {
            if (z10) {
                z10 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public C asInvalidProtocolBufferException() {
        return new C(getMessage());
    }

    public List<String> getMissingFields() {
        return Collections.unmodifiableList(this.missingFields);
    }

    public t0(List<String> list) {
        super(buildDescription(list));
        this.missingFields = list;
    }
}
