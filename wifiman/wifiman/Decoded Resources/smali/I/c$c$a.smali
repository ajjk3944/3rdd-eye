.class final LI/c$c$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LI/o1;

.field final synthetic c:LI/q;


# direct methods
.method constructor <init>(LI/o1;LI/q;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LI/c$c$a;->b:LI/o1;

    iput-object p2, p0, LI/c$c$a;->c:LI/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method

.method public static synthetic n(LI/q;LH/h;LH/h;Z)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LI/c$c$a;->t(LI/q;LH/h;LH/h;Z)V

    return-void
.end method

.method private static final t(LI/q;LH/h;LH/h;Z)V
    .locals 6

    invoke-virtual {p1}, LH/h;->f()J

    move-result-wide v0

    invoke-virtual {p2}, LH/h;->f()J

    move-result-wide v2

    invoke-virtual {p1}, LH/h;->c()LL0/S;

    move-result-object v4

    invoke-virtual {p2}, LH/h;->c()LL0/S;

    move-result-object v5

    if-eqz p3, :cond_0

    invoke-virtual {p1}, LH/h;->c()LL0/S;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-virtual {p1, p2}, LH/h;->a(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-interface {p0}, LI/q;->b()V

    goto :goto_1

    :cond_0
    invoke-static {v0, v1, v2, v3}, LL0/S;->g(JJ)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    :cond_1
    invoke-static {v2, v3}, LL0/S;->l(J)I

    move-result p1

    invoke-static {v2, v3}, LL0/S;->k(J)I

    move-result p2

    const/4 p3, -0x1

    if-eqz v5, :cond_2

    invoke-virtual {v5}, LL0/S;->r()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->l(J)I

    move-result v0

    goto :goto_0

    :cond_2
    move v0, p3

    :goto_0
    if-eqz v5, :cond_3

    invoke-virtual {v5}, LL0/S;->r()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->k(J)I

    move-result p3

    :cond_3
    invoke-interface {p0, p1, p2, v0, p3}, LI/q;->a(IIII)V

    :cond_4
    :goto_1
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance p1, LI/c$c$a;

    iget-object v0, p0, LI/c$c$a;->b:LI/o1;

    iget-object v1, p0, LI/c$c$a;->c:LI/q;

    invoke-direct {p1, v0, v1, p2}, LI/c$c$a;-><init>(LI/o1;LI/q;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LI/c$c$a;->o(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI/c$c$a;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI/c$c$a;->b:LI/o1;

    iget-object v1, p0, LI/c$c$a;->c:LI/q;

    new-instance v3, LI/e;

    invoke-direct {v3, v1}, LI/e;-><init>(LI/q;)V

    iput v2, p0, LI/c$c$a;->a:I

    invoke-virtual {p1, v3, p0}, LI/o1;->g(LH/l$a;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final o(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LI/c$c$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LI/c$c$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LI/c$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
