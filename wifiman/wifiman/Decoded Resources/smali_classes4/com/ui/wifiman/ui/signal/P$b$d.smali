.class final Lcom/ui/wifiman/ui/signal/P$b$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/signal/P$b;->c(Lz/N;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lf2/w;

.field final synthetic c:Lcom/ui/wifiman/ui/signal/d;


# direct methods
.method constructor <init>(Lf2/w;Lcom/ui/wifiman/ui/signal/d;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/P$b$d;->b:Lf2/w;

    iput-object p2, p0, Lcom/ui/wifiman/ui/signal/P$b$d;->c:Lcom/ui/wifiman/ui/signal/d;

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

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/signal/P$b$d;->v(Lf2/w;Lf2/z;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lf2/G;)LYg/J;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/ui/signal/P$b$d;->E(Lf2/G;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final v(Lf2/w;Lf2/z;)LYg/J;
    .locals 1

    invoke-virtual {p0}, Lf2/n;->I()Lf2/t;

    move-result-object p0

    invoke-virtual {p0}, Lf2/t;->V()I

    move-result p0

    new-instance v0, Lcom/ui/wifiman/ui/signal/U;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/signal/U;-><init>()V

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

    new-instance p1, Lcom/ui/wifiman/ui/signal/P$b$d;

    iget-object v0, p0, Lcom/ui/wifiman/ui/signal/P$b$d;->b:Lf2/w;

    iget-object v1, p0, Lcom/ui/wifiman/ui/signal/P$b$d;->c:Lcom/ui/wifiman/ui/signal/d;

    invoke-direct {p1, v0, v1, p2}, Lcom/ui/wifiman/ui/signal/P$b$d;-><init>(Lf2/w;Lcom/ui/wifiman/ui/signal/d;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/ui/signal/P$b$d;->t(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Lcom/ui/wifiman/ui/signal/P$b$d;->a:I

    if-nez v0, :cond_2

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/ui/wifiman/ui/signal/P$b$d;->b:Lf2/w;

    iget-object v0, p0, Lcom/ui/wifiman/ui/signal/P$b$d;->c:Lcom/ui/wifiman/ui/signal/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "SIGNAL"

    :cond_1
    iget-object v1, p0, Lcom/ui/wifiman/ui/signal/P$b$d;->b:Lf2/w;

    new-instance v2, Lcom/ui/wifiman/ui/signal/T;

    invoke-direct {v2, v1}, Lcom/ui/wifiman/ui/signal/T;-><init>(Lf2/w;)V

    invoke-virtual {p1, v0, v2}, Lf2/n;->V(Ljava/lang/String;Lmh/l;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final t(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/ui/signal/P$b$d;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/ui/signal/P$b$d;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/ui/wifiman/ui/signal/P$b$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
