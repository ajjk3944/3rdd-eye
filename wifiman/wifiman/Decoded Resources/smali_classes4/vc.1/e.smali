.class public final Lvc/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvc/b;
.implements Lvc/a;


# instance fields
.field private final a:LHg/d;

.field private final b:Lgg/b;

.field private final c:Lgg/s;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, LHg/a;->l1(Ljava/lang/Object;)LHg/a;

    move-result-object v0

    invoke-virtual {v0}, LHg/d;->i1()LHg/d;

    move-result-object v0

    const-string v1, "toSerialized(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lvc/e;->a:LHg/d;

    new-instance v1, Lvc/c;

    invoke-direct {v1}, Lvc/c;-><init>()V

    invoke-static {v1}, Lgg/s;->o(Lgg/u;)Lgg/s;

    move-result-object v1

    new-instance v2, Lvc/e$a;

    invoke-direct {v2, p0}, Lvc/e$a;-><init>(Lvc/e;)V

    invoke-virtual {v1, v2}, Lgg/s;->G(Lkg/f;)Lgg/s;

    move-result-object v1

    new-instance v2, Lvc/d;

    invoke-direct {v2, p0}, Lvc/d;-><init>(Lvc/e;)V

    invoke-virtual {v1, v2}, Lgg/s;->A(Lkg/a;)Lgg/s;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lgg/s;->x0(I)LBg/a;

    move-result-object v1

    invoke-virtual {v1}, LBg/a;->l1()Lgg/s;

    move-result-object v1

    invoke-virtual {v1}, Lgg/s;->f0()Lgg/b;

    move-result-object v1

    const-string v3, "ignoreElements(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lvc/e;->b:Lgg/b;

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/s;->o0(Lgg/y;)Lgg/s;

    move-result-object v0

    invoke-virtual {v0, v2}, Lgg/s;->x0(I)LBg/a;

    move-result-object v0

    invoke-virtual {v0}, LBg/a;->l1()Lgg/s;

    move-result-object v0

    const-string v1, "refCount(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lvc/e;->c:Lgg/s;

    return-void
.end method

.method public static synthetic c(Lgg/t;)V
    .locals 0

    invoke-static {p0}, Lvc/e;->f(Lgg/t;)V

    return-void
.end method

.method public static synthetic d(Lvc/e;)V
    .locals 0

    invoke-static {p0}, Lvc/e;->g(Lvc/e;)V

    return-void
.end method

.method public static final synthetic e(Lvc/e;)LHg/d;
    .locals 0

    iget-object p0, p0, Lvc/e;->a:LHg/d;

    return-object p0
.end method

.method private static final f(Lgg/t;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method private static final g(Lvc/e;)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "SCREEN FORCED ON state - false"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object p0, p0, Lvc/e;->a:LHg/d;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lgg/x;->h(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()Lgg/b;
    .locals 1

    iget-object v0, p0, Lvc/e;->b:Lgg/b;

    return-object v0
.end method

.method public b()Lgg/s;
    .locals 1

    iget-object v0, p0, Lvc/e;->c:Lgg/s;

    return-object v0
.end method
