.class final Landroidx/compose/foundation/relocation/f$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/relocation/f;->r1(LC0/r;Lmh/a;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Landroidx/compose/foundation/relocation/f;

.field final synthetic d:LC0/r;

.field final synthetic e:Lmh/a;

.field final synthetic f:Lmh/a;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/relocation/f;LC0/r;Lmh/a;Lmh/a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/relocation/f$b;->c:Landroidx/compose/foundation/relocation/f;

    iput-object p2, p0, Landroidx/compose/foundation/relocation/f$b;->d:LC0/r;

    iput-object p3, p0, Landroidx/compose/foundation/relocation/f$b;->e:Lmh/a;

    iput-object p4, p0, Landroidx/compose/foundation/relocation/f$b;->f:Lmh/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 7

    new-instance v6, Landroidx/compose/foundation/relocation/f$b;

    iget-object v1, p0, Landroidx/compose/foundation/relocation/f$b;->c:Landroidx/compose/foundation/relocation/f;

    iget-object v2, p0, Landroidx/compose/foundation/relocation/f$b;->d:LC0/r;

    iget-object v3, p0, Landroidx/compose/foundation/relocation/f$b;->e:Lmh/a;

    iget-object v4, p0, Landroidx/compose/foundation/relocation/f$b;->f:Lmh/a;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/relocation/f$b;-><init>(Landroidx/compose/foundation/relocation/f;LC0/r;Lmh/a;Lmh/a;Ldh/e;)V

    iput-object p1, v6, Landroidx/compose/foundation/relocation/f$b;->b:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/relocation/f$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Landroidx/compose/foundation/relocation/f$b;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/foundation/relocation/f$b;->b:Ljava/lang/Object;

    check-cast p1, LIi/N;

    new-instance v3, Landroidx/compose/foundation/relocation/f$b$a;

    iget-object v0, p0, Landroidx/compose/foundation/relocation/f$b;->c:Landroidx/compose/foundation/relocation/f;

    iget-object v1, p0, Landroidx/compose/foundation/relocation/f$b;->d:LC0/r;

    iget-object v2, p0, Landroidx/compose/foundation/relocation/f$b;->e:Lmh/a;

    const/4 v6, 0x0

    invoke-direct {v3, v0, v1, v2, v6}, Landroidx/compose/foundation/relocation/f$b$a;-><init>(Landroidx/compose/foundation/relocation/f;LC0/r;Lmh/a;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    new-instance v3, Landroidx/compose/foundation/relocation/f$b$b;

    iget-object v0, p0, Landroidx/compose/foundation/relocation/f$b;->c:Landroidx/compose/foundation/relocation/f;

    iget-object v1, p0, Landroidx/compose/foundation/relocation/f$b;->f:Lmh/a;

    invoke-direct {v3, v0, v1, v6}, Landroidx/compose/foundation/relocation/f$b$b;-><init>(Landroidx/compose/foundation/relocation/f;Lmh/a;Ldh/e;)V

    const/4 v1, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/relocation/f$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/relocation/f$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/relocation/f$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
