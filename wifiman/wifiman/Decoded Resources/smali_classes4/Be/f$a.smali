.class final LBe/f$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBe/f;->d(LL0/d;Landroidx/compose/ui/e;LL0/U;ZIILmh/l;Lmh/l;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lmh/l;

.field final synthetic d:Lmh/l;

.field final synthetic e:LT/q0;


# direct methods
.method constructor <init>(Lmh/l;Lmh/l;LT/q0;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LBe/f$a;->c:Lmh/l;

    iput-object p2, p0, LBe/f$a;->d:Lmh/l;

    iput-object p3, p0, LBe/f$a;->e:LT/q0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method

.method private static final E(LT/q0;Lmh/l;Ll0/g;)LYg/J;
    .locals 2

    invoke-interface {p0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LL0/M;

    if-eqz p0, :cond_0

    invoke-virtual {p2}, Ll0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LL0/M;->x(J)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p1, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static synthetic n(LT/q0;Lmh/l;Ll0/g;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LBe/f$a;->E(LT/q0;Lmh/l;Ll0/g;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(LT/q0;Lmh/l;Ll0/g;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LBe/f$a;->v(LT/q0;Lmh/l;Ll0/g;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final v(LT/q0;Lmh/l;Ll0/g;)LYg/J;
    .locals 2

    invoke-interface {p0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LL0/M;

    if-eqz p0, :cond_0

    invoke-virtual {p2}, Ll0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LL0/M;->x(J)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p1, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 4

    new-instance v0, LBe/f$a;

    iget-object v1, p0, LBe/f$a;->c:Lmh/l;

    iget-object v2, p0, LBe/f$a;->d:Lmh/l;

    iget-object v3, p0, LBe/f$a;->e:LT/q0;

    invoke-direct {v0, v1, v2, v3, p2}, LBe/f$a;-><init>(Lmh/l;Lmh/l;LT/q0;Ldh/e;)V

    iput-object p1, v0, LBe/f$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/G;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LBe/f$a;->t(Ly0/G;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LBe/f$a;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LBe/f$a;->b:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ly0/G;

    iget-object p1, p0, LBe/f$a;->c:Lmh/l;

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    iget-object v4, p0, LBe/f$a;->e:LT/q0;

    new-instance v5, LBe/d;

    invoke-direct {v5, v4, p1}, LBe/d;-><init>(LT/q0;Lmh/l;)V

    move-object v7, v5

    goto :goto_0

    :cond_2
    move-object v7, v1

    :goto_0
    iget-object p1, p0, LBe/f$a;->d:Lmh/l;

    if-eqz p1, :cond_3

    iget-object v1, p0, LBe/f$a;->e:LT/q0;

    new-instance v4, LBe/e;

    invoke-direct {v4, v1, p1}, LBe/e;-><init>(LT/q0;Lmh/l;)V

    move-object v5, v4

    goto :goto_1

    :cond_3
    move-object v5, v1

    :goto_1
    iput v2, p0, LBe/f$a;->a:I

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x5

    const/4 v10, 0x0

    move-object v8, p0

    invoke-static/range {v3 .. v10}, Lw/B;->k(Ly0/G;Lmh/l;Lmh/l;Lmh/q;Lmh/l;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final t(Ly0/G;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LBe/f$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LBe/f$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LBe/f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
