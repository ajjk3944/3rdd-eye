.class final LI/c1$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/c1;->Y2(LY0/d;IIJLY0/t;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LI/c1;

.field final synthetic c:F

.field final synthetic d:Ll0/i;


# direct methods
.method constructor <init>(LI/c1;FLl0/i;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LI/c1$d;->b:LI/c1;

    iput p2, p0, LI/c1$d;->c:F

    iput-object p3, p0, LI/c1$d;->d:Ll0/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, LI/c1$d;

    iget-object v0, p0, LI/c1$d;->b:LI/c1;

    iget v1, p0, LI/c1$d;->c:F

    iget-object v2, p0, LI/c1$d;->d:Ll0/i;

    invoke-direct {p1, v0, v1, v2, p2}, LI/c1$d;-><init>(LI/c1;FLl0/i;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LI/c1$d;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI/c1$d;->a:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

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

    iget-object p1, p0, LI/c1$d;->b:LI/c1;

    invoke-static {p1}, LI/c1;->K2(LI/c1;)Landroidx/compose/foundation/o;

    move-result-object p1

    iget v1, p0, LI/c1$d;->c:F

    invoke-static {v1}, LI/b1;->c(F)F

    move-result v1

    iput v3, p0, LI/c1$d;->a:I

    invoke-static {p1, v1, p0}, Lw/u;->b(Lw/y;FLdh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    iget-object p1, p0, LI/c1$d;->b:LI/c1;

    invoke-static {p1}, LI/c1;->M2(LI/c1;)LI/l1;

    move-result-object p1

    invoke-virtual {p1}, LI/l1;->c()LD/b;

    move-result-object p1

    iget-object v1, p0, LI/c1$d;->d:Ll0/i;

    iput v2, p0, LI/c1$d;->a:I

    invoke-interface {p1, v1, p0}, LD/b;->a(Ll0/i;Ldh/e;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, LI/c1$d;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LI/c1$d;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LI/c1$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
