.class final Lg2/m$h$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg2/m$h$a;->a(FF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:F

.field final synthetic c:Lr/c0;

.field final synthetic d:Lf2/k;


# direct methods
.method constructor <init>(FLr/c0;Lf2/k;Ldh/e;)V
    .locals 0

    iput p1, p0, Lg2/m$h$a$a;->b:F

    iput-object p2, p0, Lg2/m$h$a$a;->c:Lr/c0;

    iput-object p3, p0, Lg2/m$h$a$a;->d:Lf2/k;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, Lg2/m$h$a$a;

    iget v0, p0, Lg2/m$h$a$a;->b:F

    iget-object v1, p0, Lg2/m$h$a$a;->c:Lr/c0;

    iget-object v2, p0, Lg2/m$h$a$a;->d:Lf2/k;

    invoke-direct {p1, v0, v1, v2, p2}, Lg2/m$h$a$a;-><init>(FLr/c0;Lf2/k;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lg2/m$h$a$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lg2/m$h$a$a;->a:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget v5, p0, Lg2/m$h$a$a;->b:F

    cmpl-float p1, v5, v2

    if-lez p1, :cond_3

    iget-object p1, p0, Lg2/m$h$a$a;->c:Lr/c0;

    iput v4, p0, Lg2/m$h$a$a;->a:I

    const/4 v6, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    move-object v4, p1

    move-object v7, p0

    invoke-static/range {v4 .. v9}, Lr/c0;->Q(Lr/c0;FLjava/lang/Object;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    iget p1, p0, Lg2/m$h$a$a;->b:F

    cmpg-float p1, p1, v2

    if-nez p1, :cond_4

    iget-object p1, p0, Lg2/m$h$a$a;->c:Lr/c0;

    iget-object v1, p0, Lg2/m$h$a$a;->d:Lf2/k;

    iput v3, p0, Lg2/m$h$a$a;->a:I

    invoke-virtual {p1, v1, p0}, Lr/c0;->X(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lg2/m$h$a$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lg2/m$h$a$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lg2/m$h$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
