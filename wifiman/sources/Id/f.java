package Id;

import Id.c;
import com.ubnt.teleport.unifi.UnifiTeleportTunnel;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ui.wifiman.model.teleport.TeleportConnection;
import com.ui.wifiman.model.ubiquiti.console.UnifiConsoleConnectionError;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface f {

    public static final class a {
        public static c a(f fVar, UnifiTeleportTunnel.Error receiver) {
            c cVarT;
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof UnifiTeleportTunnel.Error.ReconnectionFailed) {
                receiver = ((UnifiTeleportTunnel.Error.ReconnectionFailed) receiver).getCause();
            }
            if (receiver instanceof UnifiTeleportTunnel.Error.Cloud) {
                Exception cause = ((UnifiTeleportTunnel.Error.Cloud) receiver).getCause();
                TeleportCloud.Error error = cause instanceof TeleportCloud.Error ? (TeleportCloud.Error) cause : null;
                return (error == null || (cVarT = fVar.t(error)) == null) ? c.h.f9061a : cVarT;
            }
            if ((receiver instanceof UnifiTeleportTunnel.Error.Stun) || (receiver instanceof UnifiTeleportTunnel.Error.Wireguard.Config) || (receiver instanceof UnifiTeleportTunnel.Error.Wireguard.Connection)) {
                return c.g.f9060a;
            }
            if (receiver instanceof UnifiTeleportTunnel.Error.Wireguard.VPNUnauthorized) {
                return c.h.f9061a;
            }
            if ((receiver instanceof UnifiTeleportTunnel.Error.ReconnectionFailed) || (receiver instanceof UnifiTeleportTunnel.Error.InterruptedByUser)) {
                return c.C0373c.f9056a;
            }
            throw new NoWhenBranchMatchedException();
        }

        public static c b(f fVar, TeleportCloud.Error receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof TeleportCloud.Error.InvalidResponse) {
                return c.b.f9055a;
            }
            if ((receiver instanceof TeleportCloud.Error.ApiError) || (receiver instanceof TeleportCloud.Error.CommunicationError.ResponseTimeout) || (receiver instanceof TeleportCloud.Error.CommunicationError.NetworkError)) {
                return c.a.f9054a;
            }
            if (receiver instanceof TeleportCloud.Error.CloudError.TeleportDisabled) {
                return c.f.f9059a;
            }
            if (receiver instanceof TeleportCloud.Error.CloudError.SiteGatewayNotFound) {
                return c.d.f9057a;
            }
            if (receiver instanceof TeleportCloud.Error.CloudError.Unauthenticated) {
                return c.e.f9058a;
            }
            if (receiver instanceof TeleportCloud.Error.CloudError.ClientInvalid) {
                return c.b.f9055a;
            }
            throw new NoWhenBranchMatchedException();
        }

        public static c c(f fVar, TeleportConnection.Error receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if ((receiver instanceof TeleportConnection.Error.NoVpnProfile) || (receiver instanceof TeleportConnection.Error.NoMainConsole) || (receiver instanceof TeleportConnection.Error.NoSSOAccount)) {
                return c.h.f9061a;
            }
            if (receiver instanceof TeleportConnection.Error.Tunnel) {
                return fVar.B(((TeleportConnection.Error.Tunnel) receiver).getCause());
            }
            if (receiver instanceof TeleportConnection.Error.Cloud) {
                return fVar.t(((TeleportConnection.Error.Cloud) receiver).getCause());
            }
            if (receiver instanceof TeleportConnection.Error.ConsoleConnection) {
                return fVar.S(((TeleportConnection.Error.ConsoleConnection) receiver).getCause());
            }
            if (receiver instanceof TeleportConnection.Error.CancelledByUser) {
                return c.C0373c.f9056a;
            }
            throw new NoWhenBranchMatchedException();
        }

        public static c d(f fVar, UnifiConsoleConnectionError receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            if (receiver instanceof UnifiConsoleConnectionError.IO) {
                return c.a.f9054a;
            }
            if ((receiver instanceof UnifiConsoleConnectionError.RequestFailed) || (receiver instanceof UnifiConsoleConnectionError.Unauthorized) || (receiver instanceof UnifiConsoleConnectionError.UntrustedCertificate)) {
                return c.b.f9055a;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    c B(UnifiTeleportTunnel.Error error);

    c S(UnifiConsoleConnectionError unifiConsoleConnectionError);

    c t(TeleportCloud.Error error);
}
