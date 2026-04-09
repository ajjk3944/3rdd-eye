package o5;

import c5.InterfaceC2067c;

/* compiled from: MessagingClientEvent.java */
/* renamed from: o5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5422a {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f44832m = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f44833a;

    /* renamed from: b, reason: collision with root package name */
    public final String f44834b;

    /* renamed from: c, reason: collision with root package name */
    public final String f44835c;

    /* renamed from: d, reason: collision with root package name */
    public final b f44836d;

    /* renamed from: e, reason: collision with root package name */
    public final c f44837e;

    /* renamed from: f, reason: collision with root package name */
    public final String f44838f;

    /* renamed from: g, reason: collision with root package name */
    public final String f44839g;

    /* renamed from: h, reason: collision with root package name */
    public final int f44840h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final EnumC0509a f44841j;

    /* renamed from: k, reason: collision with root package name */
    public final String f44842k;

    /* renamed from: l, reason: collision with root package name */
    public final String f44843l;

    /* compiled from: MessagingClientEvent.java */
    /* renamed from: o5.a$a, reason: collision with other inner class name */
    public enum EnumC0509a implements InterfaceC2067c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);

        private final int number_;

        EnumC0509a(int i) {
            this.number_ = i;
        }

        @Override // c5.InterfaceC2067c
        public int getNumber() {
            return this.number_;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    /* renamed from: o5.a$b */
    public enum b implements InterfaceC2067c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int number_;

        b(int i) {
            this.number_ = i;
        }

        @Override // c5.InterfaceC2067c
        public int getNumber() {
            return this.number_;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    /* renamed from: o5.a$c */
    public enum c implements InterfaceC2067c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);

        private final int number_;

        c(int i) {
            this.number_ = i;
        }

        @Override // c5.InterfaceC2067c
        public int getNumber() {
            return this.number_;
        }
    }

    static {
        b bVar = b.UNKNOWN;
        c cVar = c.UNKNOWN_OS;
        EnumC0509a enumC0509a = EnumC0509a.UNKNOWN_EVENT;
    }

    public C5422a(long j4, String str, String str2, b bVar, c cVar, String str3, String str4, int i, String str5, EnumC0509a enumC0509a, String str6, String str7) {
        this.f44833a = j4;
        this.f44834b = str;
        this.f44835c = str2;
        this.f44836d = bVar;
        this.f44837e = cVar;
        this.f44838f = str3;
        this.f44839g = str4;
        this.f44840h = i;
        this.i = str5;
        this.f44841j = enumC0509a;
        this.f44842k = str6;
        this.f44843l = str7;
    }
}
