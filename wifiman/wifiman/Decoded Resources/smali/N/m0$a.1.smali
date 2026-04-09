.class public final LN/m0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/m0;->a(LN/b;Lw/q;)Lx0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/b;

.field final synthetic b:Lw/q;


# direct methods
.method constructor <init>(LN/b;Lw/q;)V
    .locals 0

    iput-object p1, p0, LN/m0$a;->a:LN/b;

    iput-object p2, p0, LN/m0$a;->b:Lw/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(J)F
    .locals 2

    iget-object v0, p0, LN/m0$a;->b:Lw/q;

    sget-object v1, Lw/q;->Horizontal:Lw/q;

    if-ne v0, v1, :cond_0

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p1

    :goto_0
    return p1
.end method

.method private final b(F)J
    .locals 4

    iget-object v0, p0, LN/m0$a;->b:Lw/q;

    sget-object v1, Lw/q;->Horizontal:Lw/q;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    move v1, p1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    sget-object v3, Lw/q;->Vertical:Lw/q;

    if-ne v0, v3, :cond_1

    goto :goto_1

    :cond_1
    move p1, v2

    :goto_1
    invoke-static {v1, p1}, Ll0/h;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method private final c(J)F
    .locals 2

    iget-object v0, p0, LN/m0$a;->b:Lw/q;

    sget-object v1, Lw/q;->Horizontal:Lw/q;

    if-ne v0, v1, :cond_0

    invoke-static {p1, p2}, LY0/y;->h(J)F

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, LY0/y;->i(J)F

    move-result p1

    :goto_0
    return p1
.end method


# virtual methods
.method public L1(JJI)J
    .locals 0

    sget-object p1, Lx0/e;->a:Lx0/e$a;

    invoke-virtual {p1}, Lx0/e$a;->b()I

    move-result p1

    invoke-static {p5, p1}, Lx0/e;->d(II)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LN/m0$a;->a:LN/b;

    invoke-direct {p0, p3, p4}, LN/m0$a;->a(J)F

    move-result p2

    invoke-virtual {p1, p2}, LN/b;->n(F)F

    move-result p1

    invoke-direct {p0, p1}, LN/m0$a;->b(F)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->c()J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public R(JLdh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, LN/m0$a$b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LN/m0$a$b;

    iget v1, v0, LN/m0$a$b;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LN/m0$a$b;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, LN/m0$a$b;

    invoke-direct {v0, p0, p3}, LN/m0$a$b;-><init>(LN/m0$a;Ldh/e;)V

    :goto_0
    iget-object p3, v0, LN/m0$a$b;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LN/m0$a$b;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-wide p1, v0, LN/m0$a$b;->a:J

    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2}, LN/m0$a;->c(J)F

    move-result p3

    iget-object v2, p0, LN/m0$a;->a:LN/b;

    invoke-virtual {v2}, LN/b;->A()F

    move-result v2

    const/4 v4, 0x0

    cmpg-float v4, p3, v4

    if-gez v4, :cond_3

    iget-object v4, p0, LN/m0$a;->a:LN/b;

    invoke-virtual {v4}, LN/b;->o()LN/D;

    move-result-object v4

    invoke-interface {v4}, LN/D;->b()F

    move-result v4

    cmpl-float v2, v2, v4

    if-lez v2, :cond_3

    iget-object v2, p0, LN/m0$a;->a:LN/b;

    iput-wide p1, v0, LN/m0$a$b;->a:J

    iput v3, v0, LN/m0$a$b;->d:I

    invoke-virtual {v2, p3, v0}, LN/b;->G(FLdh/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_3
    sget-object p1, LY0/y;->b:LY0/y$a;

    invoke-virtual {p1}, LY0/y$a;->a()J

    move-result-wide p1

    :cond_4
    :goto_1
    invoke-static {p1, p2}, LY0/y;->b(J)LY0/y;

    move-result-object p1

    return-object p1
.end method

.method public V0(JI)J
    .locals 0

    invoke-direct {p0, p1, p2}, LN/m0$a;->a(J)F

    move-result p1

    const/4 p2, 0x0

    cmpg-float p2, p1, p2

    if-gez p2, :cond_0

    sget-object p2, Lx0/e;->a:Lx0/e$a;

    invoke-virtual {p2}, Lx0/e$a;->b()I

    move-result p2

    invoke-static {p3, p2}, Lx0/e;->d(II)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, LN/m0$a;->a:LN/b;

    invoke-virtual {p2, p1}, LN/b;->n(F)F

    move-result p1

    invoke-direct {p0, p1}, LN/m0$a;->b(F)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->c()J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public g1(JJLdh/e;)Ljava/lang/Object;
    .locals 2

    instance-of p1, p5, LN/m0$a$a;

    if-eqz p1, :cond_0

    move-object p1, p5

    check-cast p1, LN/m0$a$a;

    iget p2, p1, LN/m0$a$a;->d:I

    const/high16 v0, -0x80000000

    and-int v1, p2, v0

    if-eqz v1, :cond_0

    sub-int/2addr p2, v0

    iput p2, p1, LN/m0$a$a;->d:I

    goto :goto_0

    :cond_0
    new-instance p1, LN/m0$a$a;

    invoke-direct {p1, p0, p5}, LN/m0$a$a;-><init>(LN/m0$a;Ldh/e;)V

    :goto_0
    iget-object p2, p1, LN/m0$a$a;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p5

    iget v0, p1, LN/m0$a$a;->d:I

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-ne v0, v1, :cond_1

    iget-wide p3, p1, LN/m0$a$a;->a:J

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LN/m0$a;->a:LN/b;

    invoke-direct {p0, p3, p4}, LN/m0$a;->c(J)F

    move-result v0

    iput-wide p3, p1, LN/m0$a$a;->a:J

    iput v1, p1, LN/m0$a$a;->d:I

    invoke-virtual {p2, v0, p1}, LN/b;->G(FLdh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, p5, :cond_3

    return-object p5

    :cond_3
    :goto_1
    invoke-static {p3, p4}, LY0/y;->b(J)LY0/y;

    move-result-object p1

    return-object p1
.end method
