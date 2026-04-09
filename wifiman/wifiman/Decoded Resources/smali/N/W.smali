.class final LN/W;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:F

.field private c:F

.field private d:F

.field private final e:Lr/a;

.field private f:Ly/j;

.field private g:Ly/j;


# direct methods
.method private constructor <init>(FFFF)V
    .locals 7

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, LN/W;->a:F

    .line 4
    iput p2, p0, LN/W;->b:F

    .line 5
    iput p3, p0, LN/W;->c:F

    .line 6
    iput p4, p0, LN/W;->d:F

    .line 7
    new-instance p1, Lr/a;

    iget p2, p0, LN/W;->a:F

    invoke-static {p2}, LY0/h;->d(F)LY0/h;

    move-result-object v1

    sget-object p2, LY0/h;->b:LY0/h$a;

    invoke-static {p2}, Lr/u0;->b(LY0/h$a;)Lr/s0;

    move-result-object v2

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, Lr/a;-><init>(Ljava/lang/Object;Lr/s0;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LN/W;->e:Lr/a;

    return-void
.end method

.method public synthetic constructor <init>(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, LN/W;-><init>(FFFF)V

    return-void
.end method

.method public static final synthetic a(LN/W;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LN/W;->e(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final d(Ly/j;)F
    .locals 1

    instance-of v0, p1, Ly/o$b;

    if-eqz v0, :cond_0

    iget p1, p0, LN/W;->b:F

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ly/g;

    if-eqz v0, :cond_1

    iget p1, p0, LN/W;->c:F

    goto :goto_0

    :cond_1
    instance-of p1, p1, Ly/d;

    if-eqz p1, :cond_2

    iget p1, p0, LN/W;->d:F

    goto :goto_0

    :cond_2
    iget p1, p0, LN/W;->a:F

    :goto_0
    return p1
.end method

.method private final e(Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, LN/W$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LN/W$b;

    iget v1, v0, LN/W$b;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LN/W$b;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, LN/W$b;

    invoke-direct {v0, p0, p1}, LN/W$b;-><init>(LN/W;Ldh/e;)V

    :goto_0
    iget-object p1, v0, LN/W$b;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LN/W$b;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, LN/W$b;->a:Ljava/lang/Object;

    check-cast v0, LN/W;

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LN/W;->g:Ly/j;

    invoke-direct {p0, p1}, LN/W;->d(Ly/j;)F

    move-result p1

    iget-object v2, p0, LN/W;->e:Lr/a;

    invoke-virtual {v2}, Lr/a;->k()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LY0/h;

    invoke-virtual {v2}, LY0/h;->s()F

    move-result v2

    invoke-static {v2, p1}, LY0/h;->n(FF)Z

    move-result v2

    if-nez v2, :cond_4

    :try_start_1
    iget-object v2, p0, LN/W;->e:Lr/a;

    invoke-static {p1}, LY0/h;->d(F)LY0/h;

    move-result-object p1

    iput-object p0, v0, LN/W$b;->a:Ljava/lang/Object;

    iput v3, v0, LN/W$b;->d:I

    invoke-virtual {v2, p1, v0}, Lr/a;->t(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    iget-object p1, v0, LN/W;->g:Ly/j;

    iput-object p1, v0, LN/W;->f:Ly/j;

    goto :goto_3

    :catchall_1
    move-exception p1

    move-object v0, p0

    :goto_2
    iget-object v1, v0, LN/W;->g:Ly/j;

    iput-object v1, v0, LN/W;->f:Ly/j;

    throw p1

    :cond_4
    :goto_3
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method


# virtual methods
.method public final b(Ly/j;Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, LN/W$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LN/W$a;

    iget v1, v0, LN/W$a;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LN/W$a;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, LN/W$a;

    invoke-direct {v0, p0, p2}, LN/W$a;-><init>(LN/W;Ldh/e;)V

    :goto_0
    iget-object p2, v0, LN/W$a;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LN/W$a;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LN/W$a;->b:Ljava/lang/Object;

    check-cast p1, Ly/j;

    iget-object v0, v0, LN/W$a;->a:Ljava/lang/Object;

    check-cast v0, LN/W;

    :try_start_0
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, LN/W;->d(Ly/j;)F

    move-result p2

    iput-object p1, p0, LN/W;->g:Ly/j;

    :try_start_1
    iget-object v2, p0, LN/W;->e:Lr/a;

    invoke-virtual {v2}, Lr/a;->k()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LY0/h;

    invoke-virtual {v2}, LY0/h;->s()F

    move-result v2

    invoke-static {v2, p2}, LY0/h;->n(FF)Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, LN/W;->e:Lr/a;

    iget-object v4, p0, LN/W;->f:Ly/j;

    iput-object p0, v0, LN/W$a;->a:Ljava/lang/Object;

    iput-object p1, v0, LN/W$a;->b:Ljava/lang/Object;

    iput v3, v0, LN/W$a;->e:I

    invoke-static {v2, p2, v4, p1, v0}, LN/L;->d(Lr/a;FLy/j;Ly/j;Ldh/e;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p2, v1, :cond_3

    return-object v1

    :catchall_1
    move-exception p2

    move-object v0, p0

    goto :goto_2

    :cond_3
    move-object v0, p0

    :goto_1
    iput-object p1, v0, LN/W;->f:Ly/j;

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :goto_2
    iput-object p1, v0, LN/W;->f:Ly/j;

    throw p2
.end method

.method public final c()LT/z1;
    .locals 1

    iget-object v0, p0, LN/W;->e:Lr/a;

    invoke-virtual {v0}, Lr/a;->g()LT/z1;

    move-result-object v0

    return-object v0
.end method

.method public final f(FFFFLdh/e;)Ljava/lang/Object;
    .locals 0

    iput p1, p0, LN/W;->a:F

    iput p2, p0, LN/W;->b:F

    iput p3, p0, LN/W;->c:F

    iput p4, p0, LN/W;->d:F

    invoke-direct {p0, p5}, LN/W;->e(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
