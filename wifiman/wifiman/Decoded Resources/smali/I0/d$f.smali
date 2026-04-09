.class final LI0/d$f;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI0/d;-><init>(LJ0/n;LY0/p;LIi/N;LI0/d$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Z

.field b:I

.field synthetic c:F

.field final synthetic d:LI0/d;


# direct methods
.method constructor <init>(LI0/d;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LI0/d$f;->d:LI0/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, LI0/d$f;

    iget-object v1, p0, LI0/d$f;->d:LI0/d;

    invoke-direct {v0, v1, p2}, LI0/d$f;-><init>(LI0/d;Ldh/e;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iput p1, v0, LI0/d$f;->c:F

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LI0/d$f;->n(FLdh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI0/d$f;->b:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-boolean v0, p0, LI0/d$f;->a:Z

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget p1, p0, LI0/d$f;->c:F

    iget-object v1, p0, LI0/d$f;->d:LI0/d;

    invoke-static {v1}, LI0/d;->b(LI0/d;)LJ0/n;

    move-result-object v1

    invoke-static {v1}, LI0/n;->c(LJ0/n;)Lmh/p;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object v3, p0, LI0/d$f;->d:LI0/d;

    invoke-static {v3}, LI0/d;->b(LI0/d;)LJ0/n;

    move-result-object v3

    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v3

    sget-object v4, LJ0/q;->a:LJ0/q;

    invoke-virtual {v4}, LJ0/q;->I()LJ0/v;

    move-result-object v4

    invoke-virtual {v3, v4}, LJ0/j;->j(LJ0/v;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LJ0/h;

    invoke-virtual {v3}, LJ0/h;->b()Z

    move-result v3

    if-eqz v3, :cond_2

    neg-float p1, p1

    :cond_2
    const/4 v4, 0x0

    invoke-static {v4, p1}, Ll0/h;->a(FF)J

    move-result-wide v4

    invoke-static {v4, v5}, Ll0/g;->d(J)Ll0/g;

    move-result-object p1

    iput-boolean v3, p0, LI0/d$f;->a:Z

    iput v2, p0, LI0/d$f;->b:I

    invoke-interface {v1, p1, p0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    move v0, v3

    :goto_0
    check-cast p1, Ll0/g;

    invoke-virtual {p1}, Ll0/g;->v()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/g;->n(J)F

    move-result p1

    if-eqz v0, :cond_4

    neg-float p1, p1

    :cond_4
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :cond_5
    const-string p1, "Required value was null."

    invoke-static {p1}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final n(FLdh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, LI0/d$f;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LI0/d$f;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LI0/d$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
