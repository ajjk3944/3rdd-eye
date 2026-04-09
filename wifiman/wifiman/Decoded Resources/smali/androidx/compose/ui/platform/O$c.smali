.class final Landroidx/compose/ui/platform/O$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/O;->b(Landroidx/compose/ui/platform/L0;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:I

.field synthetic c:Ljava/lang/Object;

.field final synthetic d:Landroidx/compose/ui/platform/O;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/O;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/O$c;->d:Landroidx/compose/ui/platform/O;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, Landroidx/compose/ui/platform/O$c;

    iget-object v1, p0, Landroidx/compose/ui/platform/O$c;->d:Landroidx/compose/ui/platform/O;

    invoke-direct {v0, v1, p2}, Landroidx/compose/ui/platform/O$c;-><init>(Landroidx/compose/ui/platform/O;Ldh/e;)V

    iput-object p1, v0, Landroidx/compose/ui/platform/O$c;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/platform/x0;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/O$c;->n(Landroidx/compose/ui/platform/x0;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/ui/platform/O$c;->b:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/O$c;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/platform/O;

    iget-object v0, p0, Landroidx/compose/ui/platform/O$c;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/platform/x0;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/ui/platform/O$c;->c:Ljava/lang/Object;

    check-cast p1, Landroidx/compose/ui/platform/x0;

    iget-object v1, p0, Landroidx/compose/ui/platform/O$c;->d:Landroidx/compose/ui/platform/O;

    iput-object p1, p0, Landroidx/compose/ui/platform/O$c;->c:Ljava/lang/Object;

    iput-object v1, p0, Landroidx/compose/ui/platform/O$c;->a:Ljava/lang/Object;

    iput v2, p0, Landroidx/compose/ui/platform/O$c;->b:I

    new-instance v3, LIi/p;

    invoke-static {p0}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v4

    invoke-direct {v3, v4, v2}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {v3}, LIi/p;->A()V

    invoke-static {v1}, Landroidx/compose/ui/platform/O;->d(Landroidx/compose/ui/platform/O;)LR0/T;

    move-result-object v2

    invoke-virtual {v2}, LR0/T;->e()V

    new-instance v2, Landroidx/compose/ui/platform/O$c$a;

    invoke-direct {v2, p1, v1}, Landroidx/compose/ui/platform/O$c$a;-><init>(Landroidx/compose/ui/platform/x0;Landroidx/compose/ui/platform/O;)V

    invoke-interface {v3, v2}, LIi/n;->B(Lmh/l;)V

    invoke-virtual {v3}, LIi/p;->u()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne p1, v1, :cond_2

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_2
    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final n(Landroidx/compose/ui/platform/x0;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/O$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/platform/O$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Landroidx/compose/ui/platform/O$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
