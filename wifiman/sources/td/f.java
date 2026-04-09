package td;

import com.ui.speedtest.UiSpeedtestLib;
import com.ui.wifiman.model.speedtest.Speedtest;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class f {
    public static final Speedtest.Error a(UiSpeedtestLib.Error error) {
        AbstractC6492s.i(error, "<this>");
        if (error instanceof UiSpeedtestLib.Error.Unknown) {
            return new Speedtest.Error.Unexpected(error);
        }
        if (error instanceof UiSpeedtestLib.Error.Internal) {
            return new Speedtest.Error.Internal(error);
        }
        if ((error instanceof UiSpeedtestLib.Error.NoSpeedtestServersAvailable) || (error instanceof UiSpeedtestLib.Error.Http) || (error instanceof UiSpeedtestLib.Error.IO) || (error instanceof UiSpeedtestLib.Error.HttpResponseInvalid)) {
            return new Speedtest.Error.NetworkConnection(error);
        }
        throw new NoWhenBranchMatchedException();
    }
}
