package c7;

import N7.B8;
import N7.C1154e9;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.l;

/* compiled from: Token.kt */
/* loaded from: classes.dex */
public interface e {

    /* compiled from: Token.kt */
    public static final class a implements e {

        /* renamed from: a, reason: collision with root package name */
        public final String f18514a;

        /* compiled from: Token.kt */
        /* renamed from: c7.e$a$a, reason: collision with other inner class name */
        public static final class C0281a implements e {

            /* renamed from: a, reason: collision with root package name */
            public static final C0281a f18515a = new C0281a();

            public final String toString() {
                return StringUtils.COMMA;
            }
        }

        public a(String str) {
            this.f18514a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && l.b(this.f18514a, ((a) obj).f18514a);
        }

        public final int hashCode() {
            return this.f18514a.hashCode();
        }

        public final String toString() {
            return B8.j(new StringBuilder("Function(name="), this.f18514a, ')');
        }
    }

    /* compiled from: Token.kt */
    public interface b extends e {

        /* compiled from: Token.kt */
        public interface a extends b {

            /* compiled from: Token.kt */
            /* renamed from: c7.e$b$a$a, reason: collision with other inner class name */
            public static final class C0282a implements a {

                /* renamed from: a, reason: collision with root package name */
                public final boolean f18516a;

                public final boolean equals(Object obj) {
                    if (obj instanceof C0282a) {
                        return this.f18516a == ((C0282a) obj).f18516a;
                    }
                    return false;
                }

                public final int hashCode() {
                    boolean z10 = this.f18516a;
                    if (z10) {
                        return 1;
                    }
                    return z10 ? 1 : 0;
                }

                public final String toString() {
                    return C1154e9.k(new StringBuilder("Bool(value="), this.f18516a, ')');
                }
            }

            /* compiled from: Token.kt */
            /* renamed from: c7.e$b$a$b, reason: collision with other inner class name */
            public static final class C0283b implements a {

                /* renamed from: a, reason: collision with root package name */
                public final Number f18517a;

                public final boolean equals(Object obj) {
                    if (obj instanceof C0283b) {
                        return l.b(this.f18517a, ((C0283b) obj).f18517a);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f18517a.hashCode();
                }

                public final String toString() {
                    return "Num(value=" + this.f18517a + ')';
                }
            }

            /* compiled from: Token.kt */
            public static final class c implements a {

                /* renamed from: a, reason: collision with root package name */
                public final String f18518a;

                public final boolean equals(Object obj) {
                    if (obj instanceof c) {
                        return l.b(this.f18518a, ((c) obj).f18518a);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f18518a.hashCode();
                }

                public final String toString() {
                    return B8.j(new StringBuilder("Str(value="), this.f18518a, ')');
                }
            }
        }

        /* compiled from: Token.kt */
        /* renamed from: c7.e$b$b, reason: collision with other inner class name */
        public static final class C0284b implements b {

            /* renamed from: a, reason: collision with root package name */
            public final String f18519a;

            public final boolean equals(Object obj) {
                if (obj instanceof C0284b) {
                    return l.b(this.f18519a, ((C0284b) obj).f18519a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f18519a.hashCode();
            }

            public final String toString() {
                return B8.j(new StringBuilder("Variable(name="), this.f18519a, ')');
            }
        }
    }

    /* compiled from: Token.kt */
    public interface c extends e {

        /* compiled from: Token.kt */
        public interface a extends c {

            /* compiled from: Token.kt */
            /* renamed from: c7.e$c$a$a, reason: collision with other inner class name */
            public interface InterfaceC0285a extends a {

                /* compiled from: Token.kt */
                /* renamed from: c7.e$c$a$a$a, reason: collision with other inner class name */
                public static final class C0286a implements InterfaceC0285a {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C0286a f18520a = new C0286a();

                    public final String toString() {
                        return ">";
                    }
                }

                /* compiled from: Token.kt */
                /* renamed from: c7.e$c$a$a$b */
                public static final class b implements InterfaceC0285a {

                    /* renamed from: a, reason: collision with root package name */
                    public static final b f18521a = new b();

                    public final String toString() {
                        return ">=";
                    }
                }

                /* compiled from: Token.kt */
                /* renamed from: c7.e$c$a$a$c, reason: collision with other inner class name */
                public static final class C0287c implements InterfaceC0285a {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C0287c f18522a = new C0287c();

                    public final String toString() {
                        return "<";
                    }
                }

                /* compiled from: Token.kt */
                /* renamed from: c7.e$c$a$a$d */
                public static final class d implements InterfaceC0285a {

                    /* renamed from: a, reason: collision with root package name */
                    public static final d f18523a = new d();

                    public final String toString() {
                        return "<=";
                    }
                }
            }

            /* compiled from: Token.kt */
            public interface b extends a {

                /* compiled from: Token.kt */
                /* renamed from: c7.e$c$a$b$a, reason: collision with other inner class name */
                public static final class C0288a implements b {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C0288a f18524a = new C0288a();

                    public final String toString() {
                        return "==";
                    }
                }

                /* compiled from: Token.kt */
                /* renamed from: c7.e$c$a$b$b, reason: collision with other inner class name */
                public static final class C0289b implements b {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C0289b f18525a = new C0289b();

                    public final String toString() {
                        return "!=";
                    }
                }
            }

            /* compiled from: Token.kt */
            /* renamed from: c7.e$c$a$c, reason: collision with other inner class name */
            public interface InterfaceC0290c extends a {

                /* compiled from: Token.kt */
                /* renamed from: c7.e$c$a$c$a, reason: collision with other inner class name */
                public static final class C0291a implements InterfaceC0290c {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C0291a f18526a = new C0291a();

                    public final String toString() {
                        return "/";
                    }
                }

                /* compiled from: Token.kt */
                /* renamed from: c7.e$c$a$c$b */
                public static final class b implements InterfaceC0290c {

                    /* renamed from: a, reason: collision with root package name */
                    public static final b f18527a = new b();

                    public final String toString() {
                        return "%";
                    }
                }

                /* compiled from: Token.kt */
                /* renamed from: c7.e$c$a$c$c, reason: collision with other inner class name */
                public static final class C0292c implements InterfaceC0290c {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C0292c f18528a = new C0292c();

                    public final String toString() {
                        return "*";
                    }
                }
            }

            /* compiled from: Token.kt */
            public interface d extends a {

                /* compiled from: Token.kt */
                /* renamed from: c7.e$c$a$d$a, reason: collision with other inner class name */
                public static final class C0293a implements d {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C0293a f18529a = new C0293a();

                    public final String toString() {
                        return "&&";
                    }
                }

                /* compiled from: Token.kt */
                public static final class b implements d {

                    /* renamed from: a, reason: collision with root package name */
                    public static final b f18530a = new b();

                    public final String toString() {
                        return "||";
                    }
                }
            }

            /* compiled from: Token.kt */
            /* renamed from: c7.e$c$a$e, reason: collision with other inner class name */
            public static final class C0294e implements a {

                /* renamed from: a, reason: collision with root package name */
                public static final C0294e f18531a = new C0294e();

                public final String toString() {
                    return "^";
                }
            }

            /* compiled from: Token.kt */
            public interface f extends a {

                /* compiled from: Token.kt */
                /* renamed from: c7.e$c$a$f$a, reason: collision with other inner class name */
                public static final class C0295a implements f {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C0295a f18532a = new C0295a();

                    public final String toString() {
                        return "-";
                    }
                }

                /* compiled from: Token.kt */
                public static final class b implements f {

                    /* renamed from: a, reason: collision with root package name */
                    public static final b f18533a = new b();

                    public final String toString() {
                        return "+";
                    }
                }
            }
        }

        /* compiled from: Token.kt */
        public static final class b implements c {

            /* renamed from: a, reason: collision with root package name */
            public static final b f18534a = new b();

            public final String toString() {
                return ".";
            }
        }

        /* compiled from: Token.kt */
        /* renamed from: c7.e$c$c, reason: collision with other inner class name */
        public static final class C0296c implements c {

            /* renamed from: a, reason: collision with root package name */
            public static final C0296c f18535a = new C0296c();

            public final String toString() {
                return StringUtils.PROCESS_POSTFIX_DELIMITER;
            }
        }

        /* compiled from: Token.kt */
        public static final class d implements c {

            /* renamed from: a, reason: collision with root package name */
            public static final d f18536a = new d();

            public final String toString() {
                return "?";
            }
        }

        /* compiled from: Token.kt */
        /* renamed from: c7.e$c$e, reason: collision with other inner class name */
        public static final class C0297e implements c {

            /* renamed from: a, reason: collision with root package name */
            public static final C0297e f18537a = new C0297e();
        }

        /* compiled from: Token.kt */
        public static final class f implements c {

            /* renamed from: a, reason: collision with root package name */
            public static final f f18538a = new f();

            public final String toString() {
                return "!:";
            }
        }

        /* compiled from: Token.kt */
        public interface g extends c {

            /* compiled from: Token.kt */
            public static final class a implements g {

                /* renamed from: a, reason: collision with root package name */
                public static final a f18539a = new a();

                public final String toString() {
                    return "-";
                }
            }

            /* compiled from: Token.kt */
            public static final class b implements g {

                /* renamed from: a, reason: collision with root package name */
                public static final b f18540a = new b();

                public final String toString() {
                    return "!";
                }
            }

            /* compiled from: Token.kt */
            /* renamed from: c7.e$c$g$c, reason: collision with other inner class name */
            public static final class C0298c implements g {

                /* renamed from: a, reason: collision with root package name */
                public static final C0298c f18541a = new C0298c();

                public final String toString() {
                    return "+";
                }
            }
        }
    }
}
