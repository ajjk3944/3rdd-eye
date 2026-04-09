.class public final LNd/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LNd/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LNd/f$a;,
        LNd/f$b;
    }
.end annotation


# instance fields
.field private final a:Lcom/ui/sso/api/UiAccountApi$b;

.field private final b:Lgg/i;

.field private final c:Lgg/i;


# direct methods
.method public constructor <init>(Lcom/ui/sso/api/UiAccountApi$b;)V
    .locals 4

    const-string v0, "uiAccountApiService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNd/f;->a:Lcom/ui/sso/api/UiAccountApi$b;

    new-instance p1, LNd/e;

    invoke-direct {p1}, LNd/e;-><init>()V

    sget-object v0, Lgg/a;->LATEST:Lgg/a;

    invoke-static {p1, v0}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string v1, "refCount(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LNd/f;->b:Lgg/i;

    new-instance v2, LNd/f$c;

    invoke-direct {v2, p0}, LNd/f$c;-><init>(LNd/f;)V

    invoke-virtual {p1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v2, LNd/f$d;->a:LNd/f$d;

    invoke-virtual {p1, v2}, Lgg/i;->p0(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v2, LNd/f$e;

    invoke-direct {v2, p0}, LNd/f$e;-><init>(LNd/f;)V

    invoke-virtual {p1, v2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3, v0}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v2

    invoke-virtual {p1, v2}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LNd/f;->c:Lgg/i;

    return-void
.end method

.method public static synthetic a(LIi/N;)V
    .locals 0

    invoke-static {p0}, LNd/f;->h(LIi/N;)V

    return-void
.end method

.method public static synthetic b(Lgg/j;)V
    .locals 0

    invoke-static {p0}, LNd/f;->g(Lgg/j;)V

    return-void
.end method

.method public static final synthetic d(LNd/f;)Lcom/ui/sso/api/UiAccountApi$b;
    .locals 0

    iget-object p0, p0, LNd/f;->a:Lcom/ui/sso/api/UiAccountApi$b;

    return-object p0
.end method

.method public static final synthetic e(LNd/f;Lcom/ui/sso/api/UiAccountApi$c;)V
    .locals 0

    invoke-direct {p0, p1}, LNd/f;->f(Lcom/ui/sso/api/UiAccountApi$c;)V

    return-void
.end method

.method private final f(Lcom/ui/sso/api/UiAccountApi$c;)V
    .locals 3

    invoke-virtual {p1}, Lcom/ui/sso/api/UiAccountApi$c;->e()LNa/c;

    move-result-object v0

    sget-object v1, LNd/f$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 p1, 0x2

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    new-instance v0, LNd/f$a;

    invoke-virtual {p1}, Lcom/ui/sso/api/UiAccountApi$c;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/sso/api/UiAccountApi$c;->c()I

    move-result p1

    invoke-direct {v0, v1, p1}, LNd/f$a;-><init>(Ljava/lang/String;I)V

    const/4 p1, 0x4

    const-string v1, "Account API backed by LOCAL Storage Type"

    const/4 v2, 0x0

    invoke-static {v1, v0, v2, p1, v2}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private static final g(Lgg/j;)V
    .locals 3

    const-string v0, "emitter"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, LIi/S0;->b(LIi/y0;ILjava/lang/Object;)LIi/A;

    move-result-object v0

    invoke-static {}, LIi/c0;->a()LIi/J;

    move-result-object v1

    invoke-interface {v0, v1}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object v0

    new-instance v1, LIi/M;

    const-string v2, "UiAccountApiServiceRx"

    invoke-direct {v1, v2}, LIi/M;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object v0

    invoke-static {v0}, LIi/O;->a(Ldh/i;)LIi/N;

    move-result-object v0

    invoke-interface {p0, v0}, Lgg/h;->h(Ljava/lang/Object;)V

    new-instance v1, LNd/d;

    invoke-direct {v1, v0}, LNd/d;-><init>(LIi/N;)V

    invoke-interface {p0, v1}, Lgg/j;->d(Lkg/e;)V

    return-void
.end method

.method private static final h(LIi/N;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, LIi/O;->f(LIi/N;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public c()Lgg/i;
    .locals 1

    iget-object v0, p0, LNd/f;->c:Lgg/i;

    return-object v0
.end method
