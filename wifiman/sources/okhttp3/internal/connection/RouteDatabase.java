package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.Route;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/connection/RouteDatabase;", "", "<init>", "()V", "Lokhttp3/Route;", "failedRoute", "LYg/J;", SnmpConfigurator.O_BIND_ADDRESS, "(Lokhttp3/Route;)V", "route", SnmpConfigurator.O_AUTH_PROTOCOL, "", SnmpConfigurator.O_COMMUNITY, "(Lokhttp3/Route;)Z", "", "Ljava/util/Set;", "failedRoutes", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RouteDatabase {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set failedRoutes = new LinkedHashSet();

    public final synchronized void a(Route route) {
        AbstractC6492s.i(route, "route");
        this.failedRoutes.remove(route);
    }

    public final synchronized void b(Route failedRoute) {
        AbstractC6492s.i(failedRoute, "failedRoute");
        this.failedRoutes.add(failedRoute);
    }

    public final synchronized boolean c(Route route) {
        AbstractC6492s.i(route, "route");
        return this.failedRoutes.contains(route);
    }
}
