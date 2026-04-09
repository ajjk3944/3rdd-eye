package io.sentry;

import java.io.IOException;

/* loaded from: classes.dex */
public enum a5 implements c2 {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ProfileChunk("profile_chunk"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Feedback("feedback"),
    Log("log"),
    Unknown("__unknown__");

    private final String itemType;

    a5(String str) {
        this.itemType = str;
    }

    public static a5 resolve(Object obj) {
        return obj instanceof t4 ? ((io.sentry.protocol.g) ((t4) obj).f12269d.u(io.sentry.protocol.g.class, "feedback")) == null ? Event : Feedback : obj instanceof io.sentry.protocol.a0 ? Transaction : obj instanceof i6 ? Session : obj instanceof io.sentry.clientreport.b ? ClientReport : Attachment;
    }

    public static a5 valueOfLabel(String str) {
        for (a5 a5Var : values()) {
            if (a5Var.itemType.equals(str)) {
                return a5Var;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.c2
    public void serialize(y2 y2Var, u0 u0Var) throws IOException {
        ((i4.b) y2Var).V(this.itemType);
    }
}
