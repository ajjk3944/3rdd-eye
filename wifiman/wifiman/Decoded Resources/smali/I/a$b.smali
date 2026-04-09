.class final LI/a$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/a;->q(Lmh/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lmh/l;

.field final synthetic d:LI/a;

.field final synthetic e:LI/N0$a;


# direct methods
.method constructor <init>(Lmh/l;LI/a;LI/N0$a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LI/a$b;->c:Lmh/l;

    iput-object p2, p0, LI/a$b;->d:LI/a;

    iput-object p3, p0, LI/a$b;->e:LI/N0$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 4

    new-instance v0, LI/a$b;

    iget-object v1, p0, LI/a$b;->c:Lmh/l;

    iget-object v2, p0, LI/a$b;->d:LI/a;

    iget-object v3, p0, LI/a$b;->e:LI/N0$a;

    invoke-direct {v0, v1, v2, v3, p2}, LI/a$b;-><init>(Lmh/l;LI/a;LI/N0$a;Ldh/e;)V

    iput-object p1, v0, LI/a$b;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/platform/O0;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LI/a$b;->n(Landroidx/compose/ui/platform/O0;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI/a$b;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI/a$b;->b:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Landroidx/compose/ui/platform/O0;

    new-instance p1, LI/a$b$a;

    iget-object v5, p0, LI/a$b;->c:Lmh/l;

    iget-object v6, p0, LI/a$b;->d:LI/a;

    iget-object v7, p0, LI/a$b;->e:LI/N0$a;

    const/4 v8, 0x0

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, LI/a$b$a;-><init>(Landroidx/compose/ui/platform/O0;Lmh/l;LI/a;LI/N0$a;Ldh/e;)V

    iput v2, p0, LI/a$b;->a:I

    invoke-static {p1, p0}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final n(Landroidx/compose/ui/platform/O0;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LI/a$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LI/a$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LI/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
