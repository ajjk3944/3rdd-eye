.class final Landroidx/compose/foundation/a$i;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/a;->s0(Ly0/n;Ly0/p;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Landroidx/compose/foundation/a;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/a$i;->b:Landroidx/compose/foundation/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 1

    new-instance p1, Landroidx/compose/foundation/a$i;

    iget-object v0, p0, Landroidx/compose/foundation/a$i;->b:Landroidx/compose/foundation/a;

    invoke-direct {p1, v0, p2}, Landroidx/compose/foundation/a$i;-><init>(Landroidx/compose/foundation/a;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/a$i;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Landroidx/compose/foundation/a$i;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/foundation/a$i;->b:Landroidx/compose/foundation/a;

    invoke-static {p1}, Landroidx/compose/foundation/a;->L2(Landroidx/compose/foundation/a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/a$i;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/a$i;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/a$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
