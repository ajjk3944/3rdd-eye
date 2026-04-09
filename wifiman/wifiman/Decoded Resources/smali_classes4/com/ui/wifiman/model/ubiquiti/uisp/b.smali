.class public final Lcom/ui/wifiman/model/ubiquiti/uisp/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/ubiquiti/uisp/UispController;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/ubiquiti/uisp/b$a;,
        Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;,
        Lcom/ui/wifiman/model/ubiquiti/uisp/b$c;
    }
.end annotation


# static fields
.field public static final i:Lcom/ui/wifiman/model/ubiquiti/uisp/b$c;


# instance fields
.field private final a:Lcom/ui/wifiman/model/ubiquiti/uisp/a;

.field private final b:LP7/a;

.field private final c:Lfd/b;

.field private final d:Lgg/i;

.field private final e:Lgg/i;

.field private final f:Lgg/i;

.field private final g:Lgg/i;

.field private final h:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/ubiquiti/uisp/b$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->i:Lcom/ui/wifiman/model/ubiquiti/uisp/b$c;

    return-void
.end method

.method public constructor <init>(Lcom/ui/wifiman/model/ubiquiti/uisp/a;LP7/a;Lfd/b;)V
    .locals 7

    const-string v0, "discovery"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sharedOkHttpClientHolder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/a;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->b:LP7/a;

    iput-object p3, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->c:Lfd/b;

    invoke-interface {p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/a;->a()Lgg/i;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/ubiquiti/uisp/b$d;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/ubiquiti/uisp/b$d;-><init>(Lcom/ui/wifiman/model/ubiquiti/uisp/b;)V

    invoke-virtual {p1, p2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string p2, "switchMap(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, LXd/f;

    invoke-direct {p2, p0}, LXd/f;-><init>(Lcom/ui/wifiman/model/ubiquiti/uisp/b;)V

    invoke-static {p1, p2}, Ln9/c;->c(Lgg/i;Lmh/l;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    const-string p1, "refCount(...)"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->d:Lgg/i;

    sget-object p3, Lcom/ui/wifiman/model/ubiquiti/uisp/b$e;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/b$e;

    invoke-virtual {v0, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p3

    invoke-virtual {p3}, Lgg/i;->W()Lgg/i;

    move-result-object p3

    invoke-virtual {p3, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p3

    invoke-virtual {p3}, Ljg/a;->i2()Lgg/i;

    move-result-object p3

    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->e:Lgg/i;

    new-instance v4, LXd/g;

    invoke-direct {v4}, LXd/g;-><init>()V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-wide/16 v1, 0x1388

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lfe/h;->l(Lgg/i;JZLmh/l;ILjava/lang/Object;)Lgg/i;

    move-result-object p3

    invoke-virtual {p3}, Lgg/i;->W()Lgg/i;

    move-result-object p3

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$f;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/b$f;

    invoke-virtual {p3, v0}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p3

    invoke-virtual {p3, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p3

    invoke-virtual {p3}, Ljg/a;->i2()Lgg/i;

    move-result-object p3

    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->f:Lgg/i;

    new-instance v0, LXd/h;

    invoke-direct {v0, p0}, LXd/h;-><init>(Lcom/ui/wifiman/model/ubiquiti/uisp/b;)V

    invoke-static {p3, v0}, Lfe/h;->j(Lgg/i;Lmh/l;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->g:Lgg/i;

    new-instance v0, LXd/i;

    invoke-direct {v0, p0}, LXd/i;-><init>(Lcom/ui/wifiman/model/ubiquiti/uisp/b;)V

    invoke-static {p3, v0}, Lfe/h;->j(Lgg/i;Lmh/l;)Lgg/i;

    move-result-object p3

    invoke-virtual {p3}, Lgg/i;->W()Lgg/i;

    move-result-object p3

    invoke-virtual {p3, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->h:Lgg/i;

    return-void
.end method

.method public static synthetic e(Lcom/ui/wifiman/model/ubiquiti/uisp/b;Ll9/a;)Lgg/b;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->j(Lcom/ui/wifiman/model/ubiquiti/uisp/b;Ll9/a;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/ui/wifiman/model/ubiquiti/uisp/b;LYd/d;)Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$c;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->m(Lcom/ui/wifiman/model/ubiquiti/uisp/b;LYd/d;)Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/ui/wifiman/model/ubiquiti/uisp/b;LYd/d;)Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->k(Lcom/ui/wifiman/model/ubiquiti/uisp/b;LYd/d;)Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(LXd/a;)Lgg/z;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->l(LXd/a;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Lcom/ui/wifiman/model/ubiquiti/uisp/b;Ljava/lang/String;Ljava/lang/String;)LXd/a;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->o(Ljava/lang/String;Ljava/lang/String;)LXd/a;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lcom/ui/wifiman/model/ubiquiti/uisp/b;Ll9/a;)Lgg/b;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXd/a;

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->n()Lgg/b;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p0
.end method

.method private static final k(Lcom/ui/wifiman/model/ubiquiti/uisp/b;LYd/d;)Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;

    invoke-virtual {p1}, LYd/d;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LYd/d;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, LYd/d;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, LYd/d;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, LYd/d;->f()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/4 v6, 0x1

    invoke-static {p0, p1, v1, v6, v1}, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->q(Lcom/ui/wifiman/model/ubiquiti/uisp/b;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    move-object v6, p0

    goto :goto_0

    :cond_0
    move-object v6, v1

    :goto_0
    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final l(LXd/a;)Lgg/z;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LXd/a;->a()Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Lcom/ui/wifiman/model/ubiquiti/uisp/b;LYd/d;)Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$c;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYd/d;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LYd/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LYd/d;->e()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v2, "http"

    invoke-direct {p0, p1, v2}, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    new-instance p1, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$c;

    invoke-direct {p1, v1, v0, p0}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "server is not specified"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final n()Lgg/b;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->b:LP7/a;

    new-instance v1, LP7/f;

    invoke-direct {v1}, LP7/f;-><init>()V

    invoke-interface {v0, v1}, LP7/a;->d(LP7/c;)Lgg/b;

    move-result-object v0

    return-object v0
.end method

.method private final o(Ljava/lang/String;Ljava/lang/String;)LXd/a;
    .locals 9

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->c:Lfd/b;

    invoke-interface {v0}, Lfd/b;->a()Lokhttp3/OkHttpClient;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->E()Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    sget-object v1, Lid/b;->a:Lid/b;

    invoke-virtual {v1, v0}, Lid/b;->a(Lokhttp3/OkHttpClient$Builder;)V

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;

    sget-object v2, Lokhttp3/HttpUrl;->k:Lokhttp3/HttpUrl$Companion;

    invoke-virtual {v2, p1}, Lokhttp3/HttpUrl$Companion;->f(Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;-><init>(Lokhttp3/HttpUrl;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient$Builder;->a(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    if-eqz p2, :cond_0

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/uisp/b$a;

    invoke-direct {v1, p2}, Lcom/ui/wifiman/model/ubiquiti/uisp/b$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient$Builder;->a(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    :cond_0
    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->c()Lokhttp3/OkHttpClient;

    move-result-object p2

    new-instance v0, LMj/x$b;

    invoke-direct {v0}, LMj/x$b;-><init>()V

    invoke-virtual {v0, p1}, LMj/x$b;->c(Ljava/lang/String;)LMj/x$b;

    move-result-object p1

    invoke-virtual {p1, p2}, LMj/x$b;->g(Lokhttp3/OkHttpClient;)LMj/x$b;

    move-result-object p1

    invoke-static {}, LNj/g;->e()LNj/g;

    move-result-object p2

    invoke-virtual {p1, p2}, LMj/x$b;->a(LMj/e$a;)LMj/x$b;

    move-result-object p1

    invoke-static {}, LOj/a;->f()LOj/a;

    move-result-object p2

    invoke-virtual {p1, p2}, LMj/x$b;->b(LMj/h$a;)LMj/x$b;

    move-result-object p1

    invoke-virtual {p1}, LMj/x$b;->e()LMj/x;

    move-result-object p1

    const-class p2, LXd/a;

    invoke-virtual {p1, p2}, LMj/x;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "create(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LXd/a;

    return-object p1
.end method

.method private final p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    sget-object v0, Lokhttp3/HttpUrl;->k:Lokhttp3/HttpUrl$Companion;

    invoke-virtual {v0, p1}, Lokhttp3/HttpUrl$Companion;->f(Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "://"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lokhttp3/HttpUrl$Companion;->f(Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v1

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method static synthetic q(Lcom/ui/wifiman/model/ubiquiti/uisp/b;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const-string p2, "https"

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->g:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->e:Lgg/i;

    return-object v0
.end method

.method public c(Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;)Lgg/b;
    .locals 3

    const-string v0, "report"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LAg/c;->a:LAg/c;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->d:Lgg/i;

    iget-object v2, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->a:Lcom/ui/wifiman/model/ubiquiti/uisp/a;

    invoke-interface {v2}, Lcom/ui/wifiman/model/ubiquiti/uisp/a;->a()Lgg/i;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/uisp/b$g;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/ubiquiti/uisp/b$g;-><init>(Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$b;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string v0, "flatMapCompletable(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public d()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b;->h:Lgg/i;

    return-object v0
.end method
