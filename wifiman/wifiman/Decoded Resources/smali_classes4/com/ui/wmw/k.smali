.class public final Lcom/ui/wmw/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wmw/g;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/ui/wmw/api/v1/a;

.field private final c:LKf/e;

.field private final d:LMf/n;

.field private final e:LMf/s;

.field private final f:LOf/a$a;

.field private final g:Lgg/i;

.field private final h:Lcom/ui/wmw/wifi/b;

.field private final i:Lgg/b;

.field private final j:Lgg/b;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lcom/ui/wmw/api/v1/a;LKf/e;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "api"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/ui/wmw/k;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/ui/wmw/k;->b:Lcom/ui/wmw/api/v1/a;

    .line 5
    iput-object p3, p0, Lcom/ui/wmw/k;->c:LKf/e;

    .line 6
    new-instance p1, LMf/n;

    invoke-direct {p1, p2, p3}, LMf/n;-><init>(Lcom/ui/wmw/api/v1/a;LKf/e;)V

    iput-object p1, p0, Lcom/ui/wmw/k;->d:LMf/n;

    .line 7
    invoke-virtual {p0}, Lcom/ui/wmw/k;->g()LMf/n;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wmw/k;->e:LMf/s;

    .line 8
    new-instance v0, LOf/e;

    invoke-direct {v0, p2, p3}, LOf/e;-><init>(Lcom/ui/wmw/api/v1/a;LKf/e;)V

    iput-object v0, p0, Lcom/ui/wmw/k;->f:LOf/a$a;

    .line 9
    new-instance v0, LPf/d;

    invoke-direct {v0, p2, p3, p1}, LPf/d;-><init>(Lcom/ui/wmw/api/v1/a;LKf/e;LMf/s;)V

    .line 10
    invoke-virtual {v0}, LPf/d;->f()Lgg/i;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/wmw/k;->g:Lgg/i;

    .line 11
    new-instance v0, Lcom/ui/wmw/wifi/b;

    invoke-direct {v0, p2, p3, p1}, Lcom/ui/wmw/wifi/b;-><init>(Lcom/ui/wmw/api/v1/a;LKf/e;LMf/s;)V

    iput-object v0, p0, Lcom/ui/wmw/k;->h:Lcom/ui/wmw/wifi/b;

    .line 12
    invoke-interface {p2}, Lcom/ui/wmw/api/v1/a;->b()Lgg/s;

    move-result-object p1

    .line 13
    new-instance p2, Lcom/ui/wmw/k$a;

    invoke-direct {p2, p0}, Lcom/ui/wmw/k$a;-><init>(Lcom/ui/wmw/k;)V

    invoke-virtual {p1, p2}, Lgg/s;->U(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string p2, "flatMapCompletable(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wmw/k;->i:Lgg/b;

    .line 14
    invoke-virtual {p0}, Lcom/ui/wmw/k;->a()Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->E0()Lgg/b;

    move-result-object p2

    const/4 p3, 0x2

    new-array p3, p3, [Lgg/f;

    const/4 v0, 0x0

    aput-object p1, p3, v0

    const/4 p1, 0x1

    aput-object p2, p3, p1

    .line 15
    invoke-static {p3}, Lgg/b;->I([Lgg/f;)Lgg/b;

    move-result-object p1

    const-string p2, "mergeArray(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wmw/k;->j:Lgg/b;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/ui/wmw/api/v1/a;LKf/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/ui/wmw/k;-><init>(Ljava/lang/String;Lcom/ui/wmw/api/v1/a;LKf/e;)V

    return-void
.end method

.method public static final synthetic f(Lcom/ui/wmw/k;)Lcom/ui/wmw/api/v1/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wmw/k;->b:Lcom/ui/wmw/api/v1/a;

    return-object p0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/k;->g:Lgg/i;

    return-object v0
.end method

.method public bridge synthetic b()LMf/a$a;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wmw/k;->g()LMf/n;

    move-result-object v0

    return-object v0
.end method

.method public c()LOf/a$a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/k;->f:LOf/a$a;

    return-object v0
.end method

.method public bridge synthetic d()Lcom/ui/wmw/wifi/a$a;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wmw/k;->j()Lcom/ui/wmw/wifi/b;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/k;->a:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/ui/wmw/k;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/ui/wmw/k;

    invoke-virtual {p1}, Lcom/ui/wmw/k;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ui/wmw/k;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ui/wmw/g$a;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lcom/ui/wmw/k;->c:LKf/e;

    iget-object v0, p0, Lcom/ui/wmw/k;->c:LKf/e;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public g()LMf/n;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/k;->d:LMf/n;

    return-object v0
.end method

.method public final h()LKf/e;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/k;->c:LKf/e;

    return-object v0
.end method

.method public final i()Lgg/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/k;->j:Lgg/b;

    return-object v0
.end method

.method public j()Lcom/ui/wmw/wifi/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/k;->h:Lcom/ui/wmw/wifi/b;

    return-object v0
.end method
