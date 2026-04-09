.class final LBe/m0$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBe/m0$a;->f(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Z

.field final synthetic c:Landroidx/compose/ui/focus/o;

.field final synthetic d:Landroidx/compose/ui/platform/n1;


# direct methods
.method constructor <init>(ZLandroidx/compose/ui/focus/o;Landroidx/compose/ui/platform/n1;Ldh/e;)V
    .locals 0

    iput-boolean p1, p0, LBe/m0$a$a;->b:Z

    iput-object p2, p0, LBe/m0$a$a;->c:Landroidx/compose/ui/focus/o;

    iput-object p3, p0, LBe/m0$a$a;->d:Landroidx/compose/ui/platform/n1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, LBe/m0$a$a;

    iget-boolean v0, p0, LBe/m0$a$a;->b:Z

    iget-object v1, p0, LBe/m0$a$a;->c:Landroidx/compose/ui/focus/o;

    iget-object v2, p0, LBe/m0$a$a;->d:Landroidx/compose/ui/platform/n1;

    invoke-direct {p1, v0, v1, v2, p2}, LBe/m0$a$a;-><init>(ZLandroidx/compose/ui/focus/o;Landroidx/compose/ui/platform/n1;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LBe/m0$a$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LBe/m0$a$a;->a:I

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

    iget-boolean p1, p0, LBe/m0$a$a;->b:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, LBe/m0$a$a;->c:Landroidx/compose/ui/focus/o;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/o;->f()V

    iput v2, p0, LBe/m0$a$a;->a:I

    invoke-static {p0}, LJi/i;->e(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, LBe/m0$a$a;->d:Landroidx/compose/ui/platform/n1;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Landroidx/compose/ui/platform/n1;->b()V

    :cond_3
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LBe/m0$a$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LBe/m0$a$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LBe/m0$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
