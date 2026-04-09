.class public final Lhb/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/g$c;


# instance fields
.field private final b:Ltb/u;

.field private final c:Lmb/x;

.field private final d:Leb/l;


# direct methods
.method public constructor <init>(Ltb/u;Lmb/x;)V
    .locals 1

    const-string/jumbo v0, "webRtcClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb/e;->b:Ltb/u;

    iput-object p2, p0, Lhb/e;->c:Lmb/x;

    invoke-virtual {p1}, Ltb/u;->h()Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Leb/n;

    invoke-direct {p2, p1}, Leb/n;-><init>(Ltb/u;)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-object p2, p0, Lhb/e;->d:Leb/l;

    return-void
.end method

.method private final e(Ljava/lang/String;Lkb/o;Ljava/lang/String;Ljava/util/Map;)Lgg/z;
    .locals 1

    invoke-direct {p0, p1}, Lhb/e;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lhb/e;->b:Ltb/u;

    invoke-virtual {v0, p1, p2, p3, p4}, Ltb/u;->k(Ljava/lang/String;Lkb/o;Ljava/lang/String;Ljava/util/Map;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method private final g(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lhb/e;->f()Lmb/x;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, "/"

    const/4 v3, 0x0

    invoke-static {p1, v2, v3, v0, v1}, Lkotlin/text/t;->P(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1}, Lsb/g;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lhb/e;->f()Lmb/x;

    move-result-object v0

    invoke-virtual {v0}, Lmb/x;->e()Lmb/k;

    move-result-object v0

    invoke-virtual {v0}, Lmb/k;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_1
    :goto_0
    return-object p1
.end method


# virtual methods
.method public a(Ljava/lang/String;ZJ)Lgg/z;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Leb/g$c$b;->b(Leb/g$c;Ljava/lang/String;ZJ)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;Lkb/o;Ljava/lang/String;Ljava/util/Map;)Lgg/z;
    .locals 1

    const-string/jumbo v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "method"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3, p4}, Lhb/e;->e(Ljava/lang/String;Lkb/o;Ljava/lang/String;Ljava/util/Map;)Lgg/z;

    move-result-object p1

    sget-object p2, Lhb/e$a;->a:Lhb/e$a;

    invoke-virtual {p1, p2}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string/jumbo p2, "map(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c(Ljava/lang/String;Leb/k;ZJ)Lgg/z;
    .locals 0

    const-string/jumbo p4, "path"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p4, "listener"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lhb/e;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object p4, p0, Lhb/e;->b:Ltb/u;

    invoke-virtual {p4, p1}, Ltb/u;->g(Ljava/lang/String;)Lgg/z;

    move-result-object p1

    new-instance p4, Lhb/e$b;

    invoke-direct {p4, p2, p3}, Lhb/e$b;-><init>(Leb/k;Z)V

    invoke-virtual {p1, p4}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    new-instance p3, Lhb/e$c;

    invoke-direct {p3, p2}, Lhb/e$c;-><init>(Leb/k;)V

    invoke-virtual {p1, p3}, Lgg/z;->m(Lkg/f;)Lgg/z;

    move-result-object p1

    const-string/jumbo p2, "doOnError(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public d(Ljava/lang/String;Lkb/o;Ljava/lang/String;Ljava/util/Map;)Lgg/b;
    .locals 1

    const-string/jumbo v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "method"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3, p4}, Lhb/e;->e(Ljava/lang/String;Lkb/o;Ljava/lang/String;Ljava/util/Map;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->y()Lgg/b;

    move-result-object p1

    const-string/jumbo p2, "ignoreElement(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public f()Lmb/x;
    .locals 1

    iget-object v0, p0, Lhb/e;->c:Lmb/x;

    return-object v0
.end method
