.class final LO/g$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO/g$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LO/g;

.field final synthetic c:F


# direct methods
.method constructor <init>(LO/g;FLdh/e;)V
    .locals 0

    iput-object p1, p0, LO/g$b$a;->b:LO/g;

    iput p2, p0, LO/g$b$a;->c:F

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, LO/g$b$a;

    iget-object v1, p0, LO/g$b$a;->b:LO/g;

    iget v2, p0, LO/g$b$a;->c:F

    invoke-direct {v0, v1, v2, p1}, LO/g$b$a;-><init>(LO/g;FLdh/e;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldh/e;

    invoke-virtual {p0, p1}, LO/g$b$a;->n(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LO/g$b$a;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LO/g$b$a;->b:LO/g;

    invoke-static {p1}, LO/g;->c(LO/g;)F

    move-result v3

    iget v4, p0, LO/g$b$a;->c:F

    new-instance v7, LO/g$b$a$a;

    iget-object p1, p0, LO/g$b$a;->b:LO/g;

    invoke-direct {v7, p1}, LO/g$b$a$a;-><init>(LO/g;)V

    iput v2, p0, LO/g$b$a;->a:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v9, 0xc

    const/4 v10, 0x0

    move-object v8, p0

    invoke-static/range {v3 .. v10}, Lr/m0;->e(FFFLr/i;Lmh/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Ldh/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, LO/g$b$a;->create(Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LO/g$b$a;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-virtual {p1, v0}, LO/g$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
