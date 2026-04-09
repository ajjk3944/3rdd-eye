package com.wireguard.config;

/* loaded from: classes4.dex */
public class BadConfigException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final a f45602a;

    /* renamed from: b, reason: collision with root package name */
    private final b f45603b;

    /* renamed from: c, reason: collision with root package name */
    private final c f45604c;

    /* renamed from: d, reason: collision with root package name */
    private final CharSequence f45605d;

    public enum a {
        TOP_LEVEL(""),
        ADDRESS("Address"),
        ALLOWED_IPS("AllowedIPs"),
        DNS("DNS"),
        ENDPOINT("Endpoint"),
        EXCLUDED_APPLICATIONS("ExcludedApplications"),
        INCLUDED_APPLICATIONS("IncludedApplications"),
        LISTEN_ADDRESS("ListenAddress"),
        LISTEN_PORT("ListenPort"),
        MTU("MTU"),
        PERSISTENT_KEEPALIVE("PersistentKeepalive"),
        PRE_SHARED_KEY("PresharedKey"),
        PRIVATE_KEY("PrivateKey"),
        PUBLIC_KEY("PublicKey");

        private final String name;

        a(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum b {
        INVALID_KEY,
        INVALID_NUMBER,
        INVALID_VALUE,
        MISSING_ATTRIBUTE,
        MISSING_SECTION,
        SYNTAX_ERROR,
        UNKNOWN_ATTRIBUTE,
        UNKNOWN_SECTION
    }

    public enum c {
        CONFIG("Config"),
        INTERFACE("Interface"),
        PEER("Peer");

        private final String name;

        c(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    private BadConfigException(c cVar, a aVar, b bVar, CharSequence charSequence, Throwable th2) {
        super(th2);
        this.f45604c = cVar;
        this.f45602a = aVar;
        this.f45603b = bVar;
        this.f45605d = charSequence;
    }

    public BadConfigException(c cVar, a aVar, b bVar, CharSequence charSequence) {
        this(cVar, aVar, bVar, charSequence, null);
    }
}
