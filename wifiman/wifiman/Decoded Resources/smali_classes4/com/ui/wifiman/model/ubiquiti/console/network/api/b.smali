.class public final Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUd/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;
    }
.end annotation


# instance fields
.field private final a:Leb/g$c;

.field private final b:LY6/r;

.field private final c:Ljava/util/Map;

.field private final d:Lgg/i;


# direct methods
.method public constructor <init>(Leb/g$c;)V
    .locals 10

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->a:Leb/g$c;

    new-instance p1, LY6/r$a;

    invoke-direct {p1}, LY6/r$a;-><init>()V

    invoke-virtual {p1}, LY6/r$a;->c()LY6/r;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->b:LY6/r;

    invoke-static {}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;->getEntries()Lfh/a;

    move-result-object p1

    const/16 v0, 0xa

    invoke-static {p1, v0}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, LZg/U;->d(I)I

    move-result v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lsh/m;->d(II)I

    move-result v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;->getTypeId()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->b:LY6/r;

    const-string v4, "moshi"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$a;->getJsonAdapter(LY6/r;)LY6/h;

    move-result-object v0

    invoke-static {v2, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    invoke-virtual {v0}, LYg/s;->h()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, LYg/s;->j()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iput-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->c:Ljava/util/Map;

    iget-object v3, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->a:Leb/g$c;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v4, "wss/s/default/events?clients=v2"

    const/4 v5, 0x1

    const-wide/16 v6, 0x0

    invoke-static/range {v3 .. v9}, Leb/g$c$b;->c(Leb/g$c;Ljava/lang/String;ZJILjava/lang/Object;)Lgg/z;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$b;->a:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$b;

    invoke-virtual {p1, v0}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$c;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$c;-><init>(Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;)V

    invoke-virtual {p1, v0}, Lgg/i;->v0(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$d;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$d;-><init>(Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;)V

    invoke-virtual {p1, v0}, Lgg/i;->v0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->h1()Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->d:Lgg/i;

    return-void
.end method

.method public static final synthetic f(Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;[BLY6/h;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->k([BLY6/h;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;[BLjava/lang/Class;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->l([BLjava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;)Leb/g$c;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->a:Leb/g$c;

    return-object p0
.end method

.method public static final synthetic i(Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->c:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic j(Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;)LY6/r;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->b:LY6/r;

    return-object p0
.end method

.method private final k([BLY6/h;)Ljava/lang/Object;
    .locals 3

    const-string v0, "Failed to parse content body"

    :try_start_0
    new-instance v1, Ljava/lang/String;

    sget-object v2, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-direct {v1, p1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {p2, v1}, LY6/h;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$RequestFailed;

    const-string p2, "Null content body when body expected"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, p2, v2, v1, v2}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$RequestFailed;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
    :try_end_0
    .catch Lcom/squareup/moshi/JsonDataException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/squareup/moshi/JsonEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    new-instance p2, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$RequestFailed;

    invoke-direct {p2, v0, p1}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$RequestFailed;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :goto_1
    new-instance p2, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$RequestFailed;

    invoke-direct {p2, v0, p1}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$RequestFailed;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method private final l([BLjava/lang/Class;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->b:LY6/r;

    invoke-virtual {v0, p2}, LY6/r;->c(Ljava/lang/Class;)LY6/h;

    move-result-object p2

    invoke-virtual {p2}, LY6/h;->e()LY6/h;

    move-result-object p2

    const-string v0, "lenient(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->k([BLY6/h;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "deserializePayload(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final m(Lkb/o;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lgg/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->a:Leb/g$c;

    invoke-interface {v0, p2, p1, p3, p4}, Leb/g$c;->d(Ljava/lang/String;Lkb/o;Ljava/lang/String;Ljava/util/Map;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string p2, "observeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method static synthetic n(Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;Lkb/o;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lgg/b;
    .locals 1

    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move-object p4, v0

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->m(Lkb/o;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lgg/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Lgg/z;
    .locals 5

    sget-object v0, Lkb/o;->GET:Lkb/o;

    invoke-static {p0}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->j(Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;)LY6/r;

    move-result-object v1

    const-string v2, "access$getMoshi$p(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleDevices;

    invoke-static {v2}, Lkotlin/jvm/internal/O;->l(Ljava/lang/Class;)Lth/p;

    move-result-object v2

    invoke-static {v1, v2}, LY6/w;->a(LY6/r;Lth/p;)LY6/h;

    move-result-object v1

    invoke-virtual {v1}, LY6/h;->e()LY6/h;

    move-result-object v1

    invoke-static {p0}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->h(Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;)Leb/g$c;

    move-result-object v2

    const-string v3, "v2/api/site/default/device"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v0, v4, v4}, Leb/g$c;->b(Ljava/lang/String;Lkb/o;Ljava/lang/String;Ljava/util/Map;)Lgg/z;

    move-result-object v0

    new-instance v2, LUd/b;

    invoke-direct {v2, p0, v1}, LUd/b;-><init>(Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;LY6/h;)V

    invoke-virtual {v0, v2}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object v0

    const-string v1, "observeOn(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$e;->a:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$e;

    invoke-virtual {v0, v1}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object v0

    const-string v1, "onErrorResumeNext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->d:Lgg/i;

    return-object v0
.end method

.method public c()Lgg/b;
    .locals 7

    sget-object v1, Lkb/o;->POST:Lkb/o;

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest;->a:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest;->a()Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleRequestCmd;

    move-result-object v0

    invoke-static {p0}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->j(Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;)LY6/r;

    move-result-object v2

    const-string v3, "access$getMoshi$p(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleRequestCmd;

    invoke-static {v3}, Lkotlin/jvm/internal/O;->l(Ljava/lang/Class;)Lth/p;

    move-result-object v3

    invoke-static {v2, v3}, LY6/w;->a(LY6/r;Lth/p;)LY6/h;

    move-result-object v2

    invoke-virtual {v2, v0}, LY6/h;->i(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v0, "toJson(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v5, 0x8

    const/4 v6, 0x0

    const-string v2, "api/s/default/cmd/devmgr/speedtest"

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->n(Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;Lkb/o;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lgg/b;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$h;->a:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$h;

    invoke-virtual {v0, v1}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object v0

    const-string v1, "onErrorResumeNext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public d(Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleTeleportAccess$Request;)Lgg/z;
    .locals 5

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkb/o;->POST:Lkb/o;

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleTeleportAccess$Request;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleTeleportAccess$Request;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleTeleportAccess$Request;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleTeleportAccess$Request;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->j(Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;)LY6/r;

    move-result-object p1

    const-string v2, "access$getMoshi$p(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleTeleportAccess$Request;

    invoke-static {v3}, Lkotlin/jvm/internal/O;->l(Ljava/lang/Class;)Lth/p;

    move-result-object v3

    invoke-static {p1, v3}, LY6/w;->a(LY6/r;Lth/p;)LY6/h;

    move-result-object p1

    invoke-virtual {p1, v1}, LY6/h;->i(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "toJson(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->j(Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;)LY6/r;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleTeleportAccess$Response;

    invoke-static {v2}, Lkotlin/jvm/internal/O;->l(Ljava/lang/Class;)Lth/p;

    move-result-object v2

    invoke-static {v1, v2}, LY6/w;->a(LY6/r;Lth/p;)LY6/h;

    move-result-object v1

    invoke-virtual {v1}, LY6/h;->e()LY6/h;

    move-result-object v1

    invoke-static {p0}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->h(Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;)Leb/g$c;

    move-result-object v2

    const-string v3, "v2/api/site/default/teleport/access-request"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v0, p1, v4}, Leb/g$c;->b(Ljava/lang/String;Lkb/o;Ljava/lang/String;Ljava/util/Map;)Lgg/z;

    move-result-object p1

    new-instance v0, LUd/b;

    invoke-direct {v0, p0, v1}, LUd/b;-><init>(Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;LY6/h;)V

    invoke-virtual {p1, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object p1

    const-string v0, "observeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$g;->a:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$g;

    invoke-virtual {p1, v0}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string v0, "onErrorResumeNext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public e()Lgg/z;
    .locals 5

    sget-object v0, Lkb/o;->GET:Lkb/o;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->b:LY6/r;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/reflect/Type;

    const-class v3, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSiteFeature;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-class v3, Ljava/util/List;

    invoke-static {v3, v2}, LY6/v;->j(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Ljava/lang/reflect/ParameterizedType;

    move-result-object v2

    invoke-virtual {v1, v2}, LY6/r;->d(Ljava/lang/reflect/Type;)LY6/h;

    move-result-object v1

    const-string v2, "adapter(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-static {p0}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;->h(Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;)Leb/g$c;

    move-result-object v3

    const-string v4, "v2/api/site/default/described-features"

    invoke-interface {v3, v4, v0, v2, v2}, Leb/g$c;->b(Ljava/lang/String;Lkb/o;Ljava/lang/String;Ljava/util/Map;)Lgg/z;

    move-result-object v0

    new-instance v2, LUd/b;

    invoke-direct {v2, p0, v1}, LUd/b;-><init>(Lcom/ui/wifiman/model/ubiquiti/console/network/api/b;LY6/h;)V

    invoke-virtual {v0, v2}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object v0

    const-string v1, "observeOn(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$f;->a:Lcom/ui/wifiman/model/ubiquiti/console/network/api/b$f;

    invoke-virtual {v0, v1}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object v0

    const-string v1, "onErrorResumeNext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
