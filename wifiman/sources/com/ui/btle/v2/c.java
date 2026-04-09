package com.ui.btle.v2;

import com.ui.btle.v2.BTLEv2$Error;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public enum c {
    AUTHENTICATION((byte) 0),
    MANAGEMENT((byte) 1),
    ALL_JOIN((byte) 2),
    BINARY_MESSAGE((byte) 3);

    public static final a Companion = new a(null);
    private static final HashMap<Byte, c> protocols;

    /* renamed from: id, reason: collision with root package name */
    private final byte f41126id;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(byte b10) {
            c cVar = (c) c.protocols.get(Byte.valueOf(b10));
            if (cVar != null) {
                return cVar;
            }
            throw new BTLEv2$Error.Protocol.InvalidPacketContent("Unknown message protocol '" + ((int) b10) + "'");
        }

        private a() {
        }
    }

    static {
        HashMap<Byte, c> map = new HashMap<>();
        for (c cVar : values()) {
            map.put(Byte.valueOf(cVar.f41126id), cVar);
        }
        protocols = map;
    }

    c(byte b10) {
        this.f41126id = b10;
    }

    public final byte getId() {
        return this.f41126id;
    }
}
