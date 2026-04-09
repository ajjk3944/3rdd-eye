.class public final LSd/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LSd/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSd/c$a;
    }
.end annotation


# static fields
.field public static final c:LSd/c$a;


# instance fields
.field private final a:LNb/a;

.field private final b:Lfe/u;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LSd/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LSd/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LSd/c;->c:LSd/c$a;

    return-void
.end method

.method public constructor <init>(LNb/a;Lfe/u;)V
    .locals 1

    const-string v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "schedulers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSd/c;->a:LNb/a;

    iput-object p2, p0, LSd/c;->b:Lfe/u;

    return-void
.end method

.method public static synthetic c(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, LSd/c;->g(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic d(LSd/c;)LNb/a;
    .locals 0

    iget-object p0, p0, LSd/c;->a:LNb/a;

    return-object p0
.end method

.method private static final g(Ljava/lang/String;)V
    .locals 2

    invoke-static {p0}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Trusted certs for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " set"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "LocalConsoleCertMgr"

    invoke-static {p0, v0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/util/Set;)Lgg/b;
    .locals 1

    const-string v0, "consoleId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "certs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LSd/c$c;

    invoke-direct {v0, p0, p1, p2}, LSd/c$c;-><init>(LSd/c;Ljava/lang/String;Ljava/util/Set;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p2

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LSd/b;

    invoke-direct {v0, p1}, LSd/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object p1

    iget-object p2, p0, LSd/c;->b:Lfe/u;

    invoke-interface {p2}, Lfe/u;->b()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    iget-object p2, p0, LSd/c;->b:Lfe/u;

    invoke-interface {p2}, Lfe/u;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string p2, "observeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b(Ljava/lang/String;)Lgg/i;
    .locals 1

    const-string v0, "consoleId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LSd/c;->a:LNb/a;

    invoke-virtual {v0, p1}, LNb/a;->c(Ljava/lang/String;)Lgg/i;

    move-result-object p1

    iget-object v0, p0, LSd/c;->b:Lfe/u;

    invoke-interface {v0}, Lfe/u;->b()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    iget-object v0, p0, LSd/c;->b:Lfe/u;

    invoke-interface {v0}, Lfe/u;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    new-instance v0, LSd/c$b;

    invoke-direct {v0, p0}, LSd/c$b;-><init>(LSd/c;)V

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string v0, "distinctUntilChanged(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final e(Ljava/lang/String;)Ljava/security/cert/X509Certificate;
    .locals 10

    const-string v0, "LocalConsoleCertMgr"

    const-string v1, "Failed to decode cert"

    const-string v2, "certStr"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    :try_start_0
    sget-object v3, Lee/d;->a:Lee/d;

    sget-object v4, Lkh/a;->d:Lkh/a$a;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v5, p1

    invoke-static/range {v4 .. v9}, Lkh/a;->g(Lkh/a;Ljava/lang/CharSequence;IIILjava/lang/Object;)[B

    move-result-object p1

    invoke-virtual {v3, p1}, Lee/d;->a([B)Ljava/security/cert/X509Certificate;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_2

    :goto_0
    invoke-static {v1, p1, v0}, LZ7/b;->c(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_3

    :goto_1
    invoke-static {v1, p1, v0}, LZ7/b;->c(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_3

    :goto_2
    invoke-static {v1, p1, v0}, LZ7/b;->c(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_3
    return-object v2
.end method

.method public final f(Ljava/security/cert/X509Certificate;)Ljava/lang/String;
    .locals 9

    const-string v0, "LocalConsoleCertMgr"

    const-string v1, "Failed to encode cert"

    const-string v2, "cert"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    :try_start_0
    sget-object v3, Lkh/a;->d:Lkh/a$a;

    sget-object v4, Lee/d;->a:Lee/d;

    invoke-virtual {v4, p1}, Lee/d;->b(Ljava/security/cert/X509Certificate;)[B

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lkh/a;->l(Lkh/a;[BIIILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    invoke-static {v1, p1, v0}, LZ7/b;->c(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    invoke-static {v1, p1, v0}, LZ7/b;->c(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_2
    return-object v2
.end method
