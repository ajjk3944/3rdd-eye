.class public final Llb/h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVi/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llb/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:LVi/b;

.field private final b:LXi/f;


# direct methods
.method public constructor <init>(LVi/b;)V
    .locals 1

    const-string/jumbo v0, "tSerializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb/h$c;->a:LVi/b;

    invoke-interface {p1}, LVi/b;->a()LXi/f;

    move-result-object p1

    iput-object p1, p0, Llb/h$c;->b:LXi/f;

    return-void
.end method

.method public static synthetic g(Laj/i;)Laj/j;
    .locals 0

    invoke-static {p0}, Llb/h$c;->n(Laj/i;)Laj/j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(LYi/e;)Laj/i;
    .locals 0

    invoke-static {p0}, Llb/h$c;->m(LYi/e;)Laj/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Llb/h$c;Laj/j;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Llb/h$c;->p(Llb/h$c;Laj/j;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Llb/h$c;Laj/j;)Llb/h;
    .locals 0

    invoke-static {p0, p1}, Llb/h$c;->o(Llb/h$c;Laj/j;)Llb/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Laj/j;Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 0

    invoke-static {p0, p1}, Llb/h$c;->q(Laj/j;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method private static final m(LYi/e;)Laj/i;
    .locals 1

    instance-of v0, p0, Laj/i;

    if-eqz v0, :cond_0

    check-cast p0, Laj/i;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Can only parse JSON"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final n(Laj/i;)Laj/j;
    .locals 1

    const-string/jumbo v0, "jsonDecoder"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Laj/i;->m()Laj/j;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Llb/h$c;Laj/j;)Llb/h;
    .locals 2

    const-string/jumbo v0, "jsonElement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb/h;->Companion:Llb/h$a;

    new-instance v1, Llb/l;

    invoke-direct {v1, p0, p1}, Llb/l;-><init>(Llb/h$c;Laj/j;)V

    invoke-virtual {v0, v1}, Llb/h$a;->a(Lmh/a;)Llb/h;

    move-result-object p0

    new-instance v0, Llb/m;

    invoke-direct {v0, p1}, Llb/m;-><init>(Laj/j;)V

    invoke-virtual {p0, v0}, Llb/h;->f(Lmh/l;)Llb/h;

    move-result-object p0

    return-object p0
.end method

.method private static final p(Llb/h$c;Laj/j;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lub/c;->a:Lub/c;

    invoke-virtual {v0}, Lub/c;->d()Laj/b;

    move-result-object v0

    iget-object p0, p0, Llb/h$c;->a:LVi/b;

    invoke-virtual {v0, p0, p1}, Laj/b;->d(LVi/a;Laj/j;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final q(Laj/j;Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 3

    const-string/jumbo v0, "t"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object v0, LSj/a;->a:LSj/a$b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Error parsing JSON: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1, v2}, LSj/a$b;->p(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/ui/unifi/core/base/net/models/ResultDeserializeException;

    invoke-direct {v0, p0, p1}, Lcom/ui/unifi/core/base/net/models/ResultDeserializeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method


# virtual methods
.method public a()LXi/f;
    .locals 1

    iget-object v0, p0, Llb/h$c;->b:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Llb/h$c;->l(LYi/e;)Llb/h;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Llb/h;

    invoke-virtual {p0, p1, p2}, Llb/h$c;->r(LYi/f;Llb/h;)V

    return-void
.end method

.method public l(LYi/e;)Llb/h;
    .locals 2

    const-string/jumbo v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb/h;->Companion:Llb/h$a;

    new-instance v1, Llb/i;

    invoke-direct {v1, p1}, Llb/i;-><init>(LYi/e;)V

    invoke-virtual {v0, v1}, Llb/h$a;->a(Lmh/a;)Llb/h;

    move-result-object p1

    new-instance v0, Llb/j;

    invoke-direct {v0}, Llb/j;-><init>()V

    invoke-virtual {p1, v0}, Llb/h;->d(Lmh/l;)Llb/h;

    move-result-object p1

    new-instance v0, Llb/k;

    invoke-direct {v0, p0}, Llb/k;-><init>(Llb/h$c;)V

    invoke-virtual {p1, v0}, Llb/h;->b(Lmh/l;)Llb/h;

    move-result-object p1

    return-object p1
.end method

.method public r(LYi/f;Llb/h;)V
    .locals 1

    const-string/jumbo v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Llb/h$d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Llb/h$c;->a:LVi/b;

    check-cast p2, Llb/h$d;

    invoke-virtual {p2}, Llb/h$d;->g()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v0, p1, p2}, LVi/o;->e(LYi/f;Ljava/lang/Object;)V

    return-void

    :cond_0
    instance-of p1, p2, Llb/h$b;

    if-eqz p1, :cond_1

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Can\'t serialize Result.Error to JSON"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
