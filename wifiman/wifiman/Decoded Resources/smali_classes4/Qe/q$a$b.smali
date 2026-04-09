.class final LQe/q$a$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQe/q$a;->b(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lf2/w;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Lf2/w;Ljava/lang/String;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LQe/q$a$b;->b:Lf2/w;

    iput-object p2, p0, LQe/q$a$b;->c:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method

.method private static final E(Lf2/G;)LYg/J;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lf2/G;->d(Z)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static synthetic n(Lf2/w;Lf2/z;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LQe/q$a$b;->v(Lf2/w;Lf2/z;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lf2/G;)LYg/J;
    .locals 0

    invoke-static {p0}, LQe/q$a$b;->E(Lf2/G;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final v(Lf2/w;Lf2/z;)LYg/J;
    .locals 1

    sget-object v0, Lf2/t;->q:Lf2/t$a;

    invoke-virtual {p0}, Lf2/n;->I()Lf2/t;

    move-result-object p0

    invoke-virtual {v0, p0}, Lf2/t$a;->b(Lf2/t;)Lf2/r;

    move-result-object p0

    invoke-virtual {p0}, Lf2/r;->s()I

    move-result p0

    new-instance v0, LQe/s;

    invoke-direct {v0}, LQe/s;-><init>()V

    invoke-virtual {p1, p0, v0}, Lf2/z;->c(ILmh/l;)V

    const/4 p0, 0x1

    invoke-virtual {p1, p0}, Lf2/z;->g(Z)V

    invoke-virtual {p1, p0}, Lf2/z;->j(Z)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, LQe/q$a$b;

    iget-object v0, p0, LQe/q$a$b;->b:Lf2/w;

    iget-object v1, p0, LQe/q$a$b;->c:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, LQe/q$a$b;-><init>(Lf2/w;Ljava/lang/String;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LQe/q$a$b;->t(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LQe/q$a$b;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LQe/q$a$b;->b:Lf2/w;

    iget-object v0, p0, LQe/q$a$b;->c:Ljava/lang/String;

    new-instance v1, LQe/r;

    invoke-direct {v1, p1}, LQe/r;-><init>(Lf2/w;)V

    invoke-virtual {p1, v0, v1}, Lf2/n;->V(Ljava/lang/String;Lmh/l;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final t(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LQe/q$a$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LQe/q$a$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LQe/q$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
