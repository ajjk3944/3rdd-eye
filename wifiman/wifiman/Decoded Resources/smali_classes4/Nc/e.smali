.class public final LNc/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LNc/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Ljava/lang/Throwable;)LNc/a$a;
    .locals 0

    invoke-static {p0}, LNc/e;->f(Ljava/lang/Throwable;)LNc/a$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LNc/e;LSg/g;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, LNc/e;->d(LSg/g;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final d(LSg/g;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1}, LSg/g;->e()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-direct {p0, v1}, LNc/e;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p1}, LSg/g;->r()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-direct {p0, p1}, LNc/e;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    const-string v1, "Netbios name resolution failed"

    const/4 v2, 0x4

    invoke-static {v1, p1, v0, v2, v0}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_2
    :goto_2
    return-object v0
.end method

.method private final e(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    invoke-static {p1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    const/4 v2, 0x2

    const-string v3, "*SMBSERVER"

    invoke-static {p1, v3, v0, v2, v1}, Lkotlin/text/t;->P(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    return-object v1
.end method

.method private static final f(Ljava/lang/Throwable;)LNc/a$a;
    .locals 2

    const-string v0, "error"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ljava/net/UnknownHostException;

    if-nez v0, :cond_0

    instance-of v0, p0, Ljava/util/concurrent/TimeoutException;

    if-nez v0, :cond_0

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, v1}, LZ7/b;->f(Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_0
    new-instance v0, LNc/a$a$a;

    invoke-direct {v0, p0}, LNc/a$a$a;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method


# virtual methods
.method public a(Linet/ipaddr/g;J)Lgg/z;
    .locals 1

    const-string v0, "ipAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LNc/e$a;

    invoke-direct {v0, p1, p0}, LNc/e$a;-><init>(Linet/ipaddr/g;LNc/e;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, p2, p3, v0}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object p1

    new-instance p2, LNc/d;

    invoke-direct {p2}, LNc/d;-><init>()V

    invoke-virtual {p1, p2}, Lgg/z;->G(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string p2, "onErrorReturn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
