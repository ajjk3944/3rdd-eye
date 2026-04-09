.class public final Ljb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljb/a;


# instance fields
.field private final a:Lcb/a;

.field private final b:LAb/a;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:LGb/f;

.field private final f:Ljb/i;

.field private final g:Lokhttp3/logging/HttpLoggingInterceptor$Level;

.field private final h:LCb/a;

.field private i:Ljb/g;

.field private final j:Lgg/z;


# direct methods
.method public constructor <init>(Lcb/a;LAb/a;Ljava/lang/String;Ljava/lang/String;LGb/f;Ljb/i;Lwb/a;Lokhttp3/logging/HttpLoggingInterceptor$Level;LCb/a;)V
    .locals 0

    const-string/jumbo p7, "environment"

    invoke-static {p1, p7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p7, "ssoClient"

    invoke-static {p2, p7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p7, "clientAppName"

    invoke-static {p3, p7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p7, "clientAppVersion"

    invoke-static {p4, p7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p7, "storage"

    invoke-static {p5, p7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p7, "cloudConfigProvider"

    invoke-static {p6, p7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p7, "httpLogLevel"

    invoke-static {p8, p7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p7, "trustedDeviceHelper"

    invoke-static {p9, p7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljb/b;->a:Lcb/a;

    iput-object p2, p0, Ljb/b;->b:LAb/a;

    iput-object p3, p0, Ljb/b;->c:Ljava/lang/String;

    iput-object p4, p0, Ljb/b;->d:Ljava/lang/String;

    iput-object p5, p0, Ljb/b;->e:LGb/f;

    iput-object p6, p0, Ljb/b;->f:Ljb/i;

    iput-object p8, p0, Ljb/b;->g:Lokhttp3/logging/HttpLoggingInterceptor$Level;

    iput-object p9, p0, Ljb/b;->h:LCb/a;

    invoke-direct {p0}, Ljb/b;->m()Lgg/z;

    move-result-object p1

    new-instance p2, Ljb/b$a;

    invoke-direct {p2, p0}, Ljb/b$a;-><init>(Ljb/b;)V

    invoke-virtual {p1, p2}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object p2, Ljb/b$b;->a:Ljb/b$b;

    invoke-virtual {p1, p2}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string/jumbo p2, "flatMap(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lvb/d;->a(Lgg/z;)Lgg/z;

    move-result-object p1

    iput-object p1, p0, Ljb/b;->j:Lgg/z;

    return-void
.end method

.method public static final synthetic c(Ljb/b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ljb/b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic d(Ljb/b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ljb/b;->d:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic e(Ljb/b;)Ljb/i;
    .locals 0

    iget-object p0, p0, Ljb/b;->f:Ljb/i;

    return-object p0
.end method

.method public static final synthetic f(Ljb/b;)Lcb/a;
    .locals 0

    iget-object p0, p0, Ljb/b;->a:Lcb/a;

    return-object p0
.end method

.method public static final synthetic g(Ljb/b;)Lokhttp3/logging/HttpLoggingInterceptor$Level;
    .locals 0

    iget-object p0, p0, Ljb/b;->g:Lokhttp3/logging/HttpLoggingInterceptor$Level;

    return-object p0
.end method

.method public static final synthetic h(Ljb/b;)Lwb/a;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method public static final synthetic i(Ljb/b;)LAb/a;
    .locals 0

    iget-object p0, p0, Ljb/b;->b:LAb/a;

    return-object p0
.end method

.method public static final synthetic j(Ljb/b;)LGb/f;
    .locals 0

    iget-object p0, p0, Ljb/b;->e:LGb/f;

    return-object p0
.end method

.method public static final synthetic k(Ljb/b;)LCb/a;
    .locals 0

    iget-object p0, p0, Ljb/b;->h:LCb/a;

    return-object p0
.end method

.method public static final synthetic l(Ljb/b;Ljb/g;)V
    .locals 0

    iput-object p1, p0, Ljb/b;->i:Ljb/g;

    return-void
.end method

.method private final m()Lgg/z;
    .locals 2

    iget-object v0, p0, Ljb/b;->b:LAb/a;

    invoke-interface {v0}, LAb/a;->g()Lgg/z;

    move-result-object v0

    new-instance v1, Ljb/b$c;

    invoke-direct {v1, p0}, Ljb/b$c;-><init>(Ljb/b;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v1, Ljb/b$d;

    invoke-direct {v1, p0}, Ljb/b$d;-><init>(Ljb/b;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v1, Ljb/b$e;

    invoke-direct {v1, p0}, Ljb/b$e;-><init>(Ljb/b;)V

    invoke-virtual {v0, v1}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "doOnSuccess(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final n()Lgg/z;
    .locals 1

    iget-object v0, p0, Ljb/b;->j:Lgg/z;

    return-object v0
.end method


# virtual methods
.method public a()Lgg/z;
    .locals 2

    invoke-direct {p0}, Ljb/b;->n()Lgg/z;

    move-result-object v0

    sget-object v1, Ljb/b$g;->a:Ljb/b$g;

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "flatMap(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Z)Lgg/z;
    .locals 2

    invoke-direct {p0}, Ljb/b;->n()Lgg/z;

    move-result-object v0

    new-instance v1, Ljb/b$f;

    invoke-direct {v1, p1}, Ljb/b$f;-><init>(Z)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "flatMap(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
