.class public final Lcom/ui/wifiman/model/speedtest/internet/b$m;
.super Ltd/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/b;->r(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$a;)Ltd/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final c:Ljava/lang/String;

.field private final d:Lcom/ui/wifiman/model/speedtest/internet/f;

.field final synthetic e:Lcom/ui/wifiman/model/speedtest/internet/b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$a;Lcom/ui/wifiman/model/speedtest/internet/b;)V
    .locals 2

    iput-object p2, p0, Lcom/ui/wifiman/model/speedtest/internet/b$m;->e:Lcom/ui/wifiman/model/speedtest/internet/b;

    invoke-direct {p0}, Ltd/c;-><init>()V

    const-string p2, "Internet speedtest"

    iput-object p2, p0, Lcom/ui/wifiman/model/speedtest/internet/b$m;->c:Ljava/lang/String;

    sget-object p2, Lcom/ui/wifiman/model/speedtest/internet/f;->n:Lcom/ui/wifiman/model/speedtest/internet/f$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$a;->a()Z

    move-result v0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$a;->b()Z

    move-result v1

    invoke-virtual {p2, p1, v0, v1}, Lcom/ui/wifiman/model/speedtest/internet/f$a;->a(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$a;ZZ)Lcom/ui/wifiman/model/speedtest/internet/f;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/b$m;->d:Lcom/ui/wifiman/model/speedtest/internet/f;

    return-void
.end method

.method public static synthetic k(Lcom/ui/wifiman/model/speedtest/internet/b;Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/b;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$m;->o(Lcom/ui/wifiman/model/speedtest/internet/b;Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Lcom/ui/wifiman/model/speedtest/internet/b;Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/b;
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/f;->b()Lcom/ui/wifiman/model/speedtest/Speedtest$Error;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/ui/wifiman/model/speedtest/internet/b;->e(Lcom/ui/wifiman/model/speedtest/internet/b;)Lvd/a;

    move-result-object p0

    new-instance v6, Lvd/a$a;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const-wide/16 v2, 0x0

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lvd/a$a;-><init>(Lcom/ui/wifiman/model/speedtest/Speedtest$d;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v6}, Lvd/a;->a(Lvd/a$a;)Lgg/b;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p0
.end method


# virtual methods
.method public bridge synthetic c()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/model/speedtest/internet/b$m;->l()Lcom/ui/wifiman/model/speedtest/internet/f;

    move-result-object v0

    return-object v0
.end method

.method protected d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/b$m;->c:Ljava/lang/String;

    return-object v0
.end method

.method protected e()Lgg/z;
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/b$m$a;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/speedtest/internet/b$m$a;-><init>(Lcom/ui/wifiman/model/speedtest/internet/b$m;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic g(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$m;->m(Lcom/ui/wifiman/model/speedtest/internet/f;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;)Lgg/i;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$m;->n(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method protected l()Lcom/ui/wifiman/model/speedtest/internet/f;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/b$m;->d:Lcom/ui/wifiman/model/speedtest/internet/f;

    return-object v0
.end method

.method protected m(Lcom/ui/wifiman/model/speedtest/internet/f;)Z
    .locals 4

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/f;->b()Lcom/ui/wifiman/model/speedtest/Speedtest$Error;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/f;->b()Lcom/ui/wifiman/model/speedtest/Speedtest$Error;

    move-result-object v0

    const/4 v1, 0x4

    const-string v2, "Error occurred while running Internet speedtest"

    const/4 v3, 0x0

    invoke-static {v2, v0, v3, v1, v3}, LZ7/b;->j(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_0
    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/f;->c()Z

    move-result p1

    return p1
.end method

.method protected n(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/i;
    .locals 2

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/b$m;->e:Lcom/ui/wifiman/model/speedtest/internet/b;

    invoke-static {v0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b;->k(Lcom/ui/wifiman/model/speedtest/internet/b;Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/i;

    move-result-object p1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/b$m;->e:Lcom/ui/wifiman/model/speedtest/internet/b;

    new-instance v1, LBd/f;

    invoke-direct {v1, v0}, LBd/f;-><init>(Lcom/ui/wifiman/model/speedtest/internet/b;)V

    invoke-static {p1, v1}, Ln9/c;->c(Lgg/i;Lmh/l;)Lgg/i;

    move-result-object p1

    return-object p1
.end method
