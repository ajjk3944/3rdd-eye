.class final Lg2/m$h;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg2/m;->a(Lf2/w;Lf2/t;Landroidx/compose/ui/e;Lf0/c;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lr/c0;

.field final synthetic d:Lf2/k;

.field final synthetic e:Lr/o0;


# direct methods
.method constructor <init>(Lr/c0;Lf2/k;Lr/o0;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lg2/m$h;->c:Lr/c0;

    iput-object p2, p0, Lg2/m$h;->d:Lf2/k;

    iput-object p3, p0, Lg2/m$h;->e:Lr/o0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 4

    new-instance v0, Lg2/m$h;

    iget-object v1, p0, Lg2/m$h;->c:Lr/c0;

    iget-object v2, p0, Lg2/m$h;->d:Lf2/k;

    iget-object v3, p0, Lg2/m$h;->e:Lr/o0;

    invoke-direct {v0, v1, v2, v3, p2}, Lg2/m$h;-><init>(Lr/c0;Lf2/k;Lr/o0;Ldh/e;)V

    iput-object p1, v0, Lg2/m$h;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lg2/m$h;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lg2/m$h;->a:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lg2/m$h;->b:Ljava/lang/Object;

    check-cast p1, LIi/N;

    iget-object v1, p0, Lg2/m$h;->c:Lr/c0;

    invoke-virtual {v1}, Lr/c0;->a()Ljava/lang/Object;

    move-result-object v1

    iget-object v4, p0, Lg2/m$h;->d:Lf2/k;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v4, p0, Lg2/m$h;->c:Lr/c0;

    iget-object v5, p0, Lg2/m$h;->d:Lf2/k;

    iput v3, p0, Lg2/m$h;->a:I

    const/4 v6, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    move-object v7, p0

    invoke-static/range {v4 .. v9}, Lr/c0;->C(Lr/c0;Ljava/lang/Object;Lr/H;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_3
    iget-object v1, p0, Lg2/m$h;->e:Lr/o0;

    invoke-virtual {v1}, Lr/o0;->q()J

    move-result-wide v3

    const v1, 0xf4240

    int-to-long v5, v1

    div-long/2addr v3, v5

    iget-object v1, p0, Lg2/m$h;->c:Lr/c0;

    invoke-virtual {v1}, Lr/c0;->I()F

    move-result v5

    iget-object v1, p0, Lg2/m$h;->c:Lr/c0;

    invoke-virtual {v1}, Lr/c0;->I()F

    move-result v1

    long-to-float v3, v3

    mul-float/2addr v1, v3

    float-to-int v1, v1

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v6, 0x0

    invoke-static {v1, v3, v6, v4, v6}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object v8

    new-instance v9, Lg2/m$h$a;

    iget-object v1, p0, Lg2/m$h;->c:Lr/c0;

    iget-object v3, p0, Lg2/m$h;->d:Lf2/k;

    invoke-direct {v9, p1, v1, v3}, Lg2/m$h$a;-><init>(LIi/N;Lr/c0;Lf2/k;)V

    iput v2, p0, Lg2/m$h;->a:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-object v10, p0

    invoke-static/range {v5 .. v12}, Lr/m0;->e(FFFLr/i;Lmh/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lg2/m$h;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lg2/m$h;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lg2/m$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
