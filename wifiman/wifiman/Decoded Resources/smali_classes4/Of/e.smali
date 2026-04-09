.class public final LOf/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOf/a$a;


# instance fields
.field private final a:Lcom/ui/wmw/api/v1/a;

.field private final b:Lgg/i;


# direct methods
.method public constructor <init>(Lcom/ui/wmw/api/v1/a;LKf/e;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOf/e;->a:Lcom/ui/wmw/api/v1/a;

    invoke-virtual {p2}, LKf/e;->p()Lgg/i;

    move-result-object p1

    sget-object p2, LOf/e$b;->a:LOf/e$b;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string p2, "distinctUntilChanged(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/ui/wmw/f;->c(Lgg/i;Z)Lgg/i;

    move-result-object p1

    sget-object v0, LOf/e$c;->a:LOf/e$c;

    invoke-virtual {p1, v0}, Lgg/i;->d0(Lkg/f;)Lgg/i;

    move-result-object p1

    sget-object v0, LOf/e$d;->a:LOf/e$d;

    invoke-virtual {p1, v0}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    sget-object v0, LOf/e$e;->a:LOf/e$e;

    invoke-virtual {p1, v0}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p1

    new-instance v0, LOf/b;

    invoke-direct {v0}, LOf/b;-><init>()V

    invoke-virtual {p1, v0}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LOf/e;->b:Lgg/i;

    return-void
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    invoke-static {}, LOf/e;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()V
    .locals 0

    invoke-static {}, LOf/e;->e()V

    return-void
.end method

.method private static final e()V
    .locals 1

    new-instance v0, LOf/c;

    invoke-direct {v0}, LOf/c;-><init>()V

    invoke-static {v0}, LNf/a;->d(Lmh/a;)V

    return-void
.end method

.method private static final f()Ljava/lang/String;
    .locals 1

    const-string v0, "WMW Settings finished"

    return-object v0
.end method


# virtual methods
.method public c()Lgg/i;
    .locals 1

    iget-object v0, p0, LOf/e;->b:Lgg/i;

    return-object v0
.end method

.method public d(Ljava/lang/String;)Lgg/b;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LOf/e;->a:Lcom/ui/wmw/api/v1/a;

    invoke-interface {v0, p1}, Lcom/ui/wmw/api/v1/a;->d(Ljava/lang/String;)Lgg/b;

    move-result-object p1

    invoke-static {p1}, Lcom/ui/wmw/f;->b(Lgg/b;)Lgg/b;

    move-result-object p1

    sget-object v0, LOf/e$a;->a:LOf/e$a;

    invoke-virtual {p1, v0}, Lgg/b;->z(Lkg/f;)Lgg/b;

    move-result-object p1

    const-string v0, "doOnError(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
