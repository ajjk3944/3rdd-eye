.class final LX9/o$b$o$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX9/o$b$o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:LT/q0;

.field final synthetic d:Lk0/e;

.field final synthetic e:Landroidx/compose/ui/platform/n1;


# direct methods
.method constructor <init>(LT/q0;Lk0/e;Landroidx/compose/ui/platform/n1;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LX9/o$b$o$a;->c:LT/q0;

    iput-object p2, p0, LX9/o$b$o$a;->d:Lk0/e;

    iput-object p3, p0, LX9/o$b$o$a;->e:Landroidx/compose/ui/platform/n1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 4

    new-instance v0, LX9/o$b$o$a;

    iget-object v1, p0, LX9/o$b$o$a;->c:LT/q0;

    iget-object v2, p0, LX9/o$b$o$a;->d:Lk0/e;

    iget-object v3, p0, LX9/o$b$o$a;->e:Landroidx/compose/ui/platform/n1;

    invoke-direct {v0, v1, v2, v3, p2}, LX9/o$b$o$a;-><init>(LT/q0;Lk0/e;Landroidx/compose/ui/platform/n1;Ldh/e;)V

    iput-object p1, v0, LX9/o$b$o$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LX9/p$a;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LX9/o$b$o$a;->n(LX9/p$a;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LX9/o$b$o$a;->a:I

    if-nez v0, :cond_3

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LX9/o$b$o$a;->b:Ljava/lang/Object;

    check-cast p1, LX9/p$a;

    instance-of v0, p1, LX9/p$a$a;

    if-eqz v0, :cond_0

    iget-object p1, p0, LX9/o$b$o$a;->c:LT/q0;

    new-instance v7, LR0/Q;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const-string v1, ""

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LR0/Q;-><init>(Ljava/lang/String;JLL0/S;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v7}, LT/q0;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, LX9/p$a$c;

    if-eqz v0, :cond_1

    iget-object v0, p0, LX9/o$b$o$a;->c:LT/q0;

    new-instance v8, LR0/Q;

    check-cast p1, LX9/p$a$c;

    invoke-virtual {p1}, LX9/p$a$c;->a()Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x6

    const/4 v7, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, LR0/Q;-><init>(Ljava/lang/String;JLL0/S;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v8}, LT/q0;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    instance-of p1, p1, LX9/p$a$b;

    if-eqz p1, :cond_2

    iget-object p1, p0, LX9/o$b$o$a;->d:Lk0/e;

    iget-object v0, p0, LX9/o$b$o$a;->e:Landroidx/compose/ui/platform/n1;

    invoke-static {p1, v0}, LX9/o;->e(Lk0/e;Landroidx/compose/ui/platform/n1;)V

    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LX9/p$a;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LX9/o$b$o$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LX9/o$b$o$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LX9/o$b$o$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
