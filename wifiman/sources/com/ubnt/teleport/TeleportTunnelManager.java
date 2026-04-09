package com.ubnt.teleport;

import com.ubnt.teleport.TeleportTunnel;
import gg.AbstractC5912b;
import gg.i;
import kotlin.Metadata;

/* loaded from: classes3.dex */
public interface TeleportTunnelManager {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ubnt/teleport/TeleportTunnelManager$Error;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "teleport_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class Error extends RuntimeException {
    }

    public interface Storage {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ubnt/teleport/TeleportTunnelManager$Storage$Error;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "teleport_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static abstract class Error extends RuntimeException {
        }

        AbstractC5912b a(String str);

        i b();

        AbstractC5912b c(String str);

        i d();

        AbstractC5912b e(TeleportTunnel.a aVar);
    }

    i a();

    AbstractC5912b b(TeleportTunnel teleportTunnel);

    AbstractC5912b c(TeleportTunnel teleportTunnel);

    AbstractC5912b e(TeleportTunnel teleportTunnel);

    i getAll();
}
