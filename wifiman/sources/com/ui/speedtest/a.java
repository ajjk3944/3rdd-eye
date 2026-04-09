package com.ui.speedtest;

import com.ui.speedtest.UiSpeedtestLib;
import kotlin.jvm.internal.AbstractC6492s;
import speedtest.SpeedtestError;

/* loaded from: classes3.dex */
public abstract class a {
    public static final UiSpeedtestLib.Error a(SpeedtestError speedtestError) {
        AbstractC6492s.i(speedtestError, "<this>");
        long id2 = speedtestError.getID();
        if (id2 == 1) {
            String message = speedtestError.getMessage();
            AbstractC6492s.h(message, "message");
            return new UiSpeedtestLib.Error.Unknown(message);
        }
        if (id2 == 5) {
            String message2 = speedtestError.getMessage();
            AbstractC6492s.h(message2, "message");
            return new UiSpeedtestLib.Error.IO(message2);
        }
        if (id2 == 3) {
            String message3 = speedtestError.getMessage();
            AbstractC6492s.h(message3, "message");
            return new UiSpeedtestLib.Error.Http(message3);
        }
        if (id2 == 4) {
            String message4 = speedtestError.getMessage();
            AbstractC6492s.h(message4, "message");
            return new UiSpeedtestLib.Error.HttpResponseInvalid(message4);
        }
        if (id2 == 6) {
            String message5 = speedtestError.getMessage();
            AbstractC6492s.h(message5, "message");
            return new UiSpeedtestLib.Error.NoSpeedtestServersAvailable(message5);
        }
        if (id2 == 7) {
            String message6 = speedtestError.getMessage();
            AbstractC6492s.h(message6, "message");
            return new UiSpeedtestLib.Error.Internal(message6);
        }
        String message7 = speedtestError.getMessage();
        AbstractC6492s.h(message7, "message");
        return new UiSpeedtestLib.Error.Unknown(message7);
    }
}
