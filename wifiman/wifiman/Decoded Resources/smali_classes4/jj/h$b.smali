.class final Ljj/h$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljj/h;->a(Lmh/p;LA/B;Lmh/p;Lmh/p;FLjj/b;LT/l;II)Ljj/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:F

.field b:I

.field final synthetic c:LA/B;

.field final synthetic d:Z

.field final synthetic e:Ljj/g;


# direct methods
.method constructor <init>(LA/B;ZLjj/g;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Ljj/h$b;->c:LA/B;

    iput-boolean p2, p0, Ljj/h$b;->d:Z

    iput-object p3, p0, Ljj/h$b;->e:Ljj/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, Ljj/h$b;

    iget-object v0, p0, Ljj/h$b;->c:LA/B;

    iget-boolean v1, p0, Ljj/h$b;->d:Z

    iget-object v2, p0, Ljj/h$b;->e:Ljj/g;

    invoke-direct {p1, v0, v1, v2, p2}, Ljj/h$b;-><init>(LA/B;ZLjj/g;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Ljj/h$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ljj/h$b;->b:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget v1, p0, Ljj/h$b;->a:F

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :cond_0
    move p1, v1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v1, p0, Ljj/h$b;->a:F

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ljj/h$b;->c:LA/B;

    invoke-virtual {p1}, LA/B;->w()LA/q;

    move-result-object p1

    invoke-interface {p1}, LA/q;->a()Z

    move-result p1

    xor-int/lit8 v1, p1, 0x1

    iget-boolean v4, p0, Ljj/h$b;->d:Z

    if-eqz v4, :cond_4

    iget-object v4, p0, Ljj/h$b;->c:LA/B;

    invoke-virtual {v4}, LA/B;->w()LA/q;

    move-result-object v4

    invoke-interface {v4}, LA/q;->e()Lw/q;

    move-result-object v4

    sget-object v5, Lw/q;->Vertical:Lw/q;

    if-eq v4, v5, :cond_4

    goto :goto_0

    :cond_4
    move p1, v1

    :goto_0
    if-eqz p1, :cond_5

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_5
    const/high16 p1, -0x40800000    # -1.0f

    :goto_1
    iget-object v1, p0, Ljj/h$b;->e:Ljj/g;

    invoke-virtual {v1}, Ljj/i;->B()LKi/g;

    move-result-object v1

    iput p1, p0, Ljj/h$b;->a:F

    iput v3, p0, Ljj/h$b;->b:I

    invoke-interface {v1, p0}, LKi/v;->c(Ldh/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_6

    return-object v0

    :cond_6
    move-object v6, v1

    move v1, p1

    move-object p1, v6

    :goto_2
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iget-object v4, p0, Ljj/h$b;->c:LA/B;

    mul-float/2addr p1, v1

    iput v1, p0, Ljj/h$b;->a:F

    iput v2, p0, Ljj/h$b;->b:I

    invoke-static {v4, p1, p0}, Lw/u;->b(Lw/y;FLdh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_0

    return-object v0
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ljj/h$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Ljj/h$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Ljj/h$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
