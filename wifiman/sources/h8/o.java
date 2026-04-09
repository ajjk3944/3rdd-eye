package H8;

import Id.a;
import com.ubnt.usurvey.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import s9.d;

/* loaded from: classes3.dex */
public abstract class o {
    public static final s9.d a(a.c cVar) {
        AbstractC6492s.i(cVar, "<this>");
        if (cVar instanceof a.c.e) {
            return new d.b(R.string.teleport_console_error_teleport_disabled_subtitle);
        }
        if (cVar instanceof a.c.f) {
            return new d.b(R.string.teleport_console_error_teleport_unsupported_subtitle);
        }
        if (cVar instanceof a.c.b) {
            return new d.b(R.string.teleport_console_error_offline_subtitle);
        }
        if (cVar instanceof a.c.d) {
            return new d.b(R.string.teleport_console_error_no_network_connection_subtitle);
        }
        if (cVar instanceof a.c.C0371a) {
            return new d.b(R.string.teleport_unavailable_cloud_subtitle);
        }
        if (cVar instanceof a.c.C0372c) {
            return new d.b(R.string.teleport_console_error_insufficient_permission_token_generation_subtitle);
        }
        if (cVar instanceof a.c.g) {
            return new d.b(R.string.teleport_tunnel_error_teleport_token_invalid_message);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final s9.d b(a.c cVar) {
        AbstractC6492s.i(cVar, "<this>");
        return new d.b(Id.g.a(cVar));
    }
}
