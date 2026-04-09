.class final LUe/f$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUe/f;->i(IILjava/lang/Long;Lmh/a;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field b:I

.field c:Ljava/lang/Object;

.field d:I

.field final synthetic e:Ljava/lang/Long;

.field final synthetic f:Lmh/a;

.field final synthetic g:I

.field final synthetic h:I

.field final synthetic i:LT/q0;


# direct methods
.method constructor <init>(Ljava/lang/Long;Lmh/a;IILT/q0;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LUe/f$c;->e:Ljava/lang/Long;

    iput-object p2, p0, LUe/f$c;->f:Lmh/a;

    iput p3, p0, LUe/f$c;->g:I

    iput p4, p0, LUe/f$c;->h:I

    iput-object p5, p0, LUe/f$c;->i:LT/q0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 7

    new-instance p1, LUe/f$c;

    iget-object v1, p0, LUe/f$c;->e:Ljava/lang/Long;

    iget-object v2, p0, LUe/f$c;->f:Lmh/a;

    iget v3, p0, LUe/f$c;->g:I

    iget v4, p0, LUe/f$c;->h:I

    iget-object v5, p0, LUe/f$c;->i:LT/q0;

    move-object v0, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, LUe/f$c;-><init>(Ljava/lang/Long;Lmh/a;IILT/q0;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LUe/f$c;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LUe/f$c;->d:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, LUe/f$c;->c:Ljava/lang/Object;

    check-cast v0, LT/q0;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v1, p0, LUe/f$c;->b:I

    iget v3, p0, LUe/f$c;->a:I

    iget-object v4, p0, LUe/f$c;->c:Ljava/lang/Object;

    check-cast v4, LT/q0;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LUe/f$c;->e:Ljava/lang/Long;

    if-eqz p1, :cond_5

    iget-object v1, p0, LUe/f$c;->f:Lmh/a;

    iget v4, p0, LUe/f$c;->g:I

    iget v5, p0, LUe/f$c;->h:I

    iget-object v6, p0, LUe/f$c;->i:LT/q0;

    invoke-interface {v1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lmh/p;

    iput-object v6, p0, LUe/f$c;->c:Ljava/lang/Object;

    iput v4, p0, LUe/f$c;->a:I

    iput v5, p0, LUe/f$c;->b:I

    iput v3, p0, LUe/f$c;->d:I

    invoke-interface {v1, p1, p0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    move v3, v4

    move v1, v5

    move-object v4, v6

    :goto_0
    check-cast p1, LUe/g;

    if-eqz p1, :cond_5

    iput-object v4, p0, LUe/f$c;->c:Ljava/lang/Object;

    iput v2, p0, LUe/f$c;->d:I

    invoke-interface {p1, v3, v1, p0}, LUe/g;->c(IILdh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    move-object v0, v4

    :goto_1
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-static {p1}, Lm0/O;->c(Landroid/graphics/Bitmap;)Lm0/J0;

    move-result-object p1

    invoke-static {v0, p1}, LUe/f;->o(LT/q0;Lm0/J0;)V

    :cond_5
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LUe/f$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LUe/f$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LUe/f$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
