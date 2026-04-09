.class final Lxe/B$a$a$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxe/B$a$a;->b(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Z

.field final synthetic c:Lf2/w;


# direct methods
.method constructor <init>(ZLf2/w;Ldh/e;)V
    .locals 0

    iput-boolean p1, p0, Lxe/B$a$a$c;->b:Z

    iput-object p2, p0, Lxe/B$a$a$c;->c:Lf2/w;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method

.method private static final E(Lf2/G;)LYg/J;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lf2/G;->c(Z)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static synthetic n(Lf2/G;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxe/B$a$a$c;->E(Lf2/G;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lf2/z;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxe/B$a$a$c;->v(Lf2/z;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final v(Lf2/z;)LYg/J;
    .locals 2

    new-instance v0, Lxe/D;

    invoke-direct {v0}, Lxe/D;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lf2/z;->c(ILmh/l;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, Lxe/B$a$a$c;

    iget-boolean v0, p0, Lxe/B$a$a$c;->b:Z

    iget-object v1, p0, Lxe/B$a$a$c;->c:Lf2/w;

    invoke-direct {p1, v0, v1, p2}, Lxe/B$a$a$c;-><init>(ZLf2/w;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lxe/B$a$a$c;->t(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Lxe/B$a$a$c;->a:I

    if-nez v0, :cond_1

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lxe/B$a$a$c;->b:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lxe/B$a$a$c;->c:Lf2/w;

    new-instance v0, Lxe/C;

    invoke-direct {v0}, Lxe/C;-><init>()V

    const-string v1, "empty"

    invoke-virtual {p1, v1, v0}, Lf2/n;->V(Ljava/lang/String;Lmh/l;)V

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final t(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lxe/B$a$a$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lxe/B$a$a$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lxe/B$a$a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
