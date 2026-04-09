.class public final LL0/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LL0/Q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LL0/Q;

    invoke-direct {v0}, LL0/Q;-><init>()V

    sput-object v0, LL0/Q;->a:LL0/Q;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lm0/n0;LL0/M;)V
    .locals 13

    invoke-virtual {p2}, LL0/M;->i()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, LL0/M;->l()LL0/L;

    move-result-object v0

    invoke-virtual {v0}, LL0/L;->f()I

    move-result v0

    sget-object v2, LW0/t;->a:LW0/t$a;

    invoke-virtual {v2}, LW0/t$a;->c()I

    move-result v2

    invoke-static {v0, v2}, LW0/t;->e(II)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p2}, LL0/M;->B()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/r;->g(J)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p2}, LL0/M;->B()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/r;->f(J)I

    move-result v3

    int-to-float v3, v3

    sget-object v4, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v4}, Ll0/g$a;->c()J

    move-result-wide v4

    invoke-static {v2, v3}, Ll0/n;->a(FF)J

    move-result-wide v2

    invoke-static {v4, v5, v2, v3}, Ll0/j;->b(JJ)Ll0/i;

    move-result-object v2

    invoke-interface {p1}, Lm0/n0;->j()V

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {p1, v2, v1, v3, v4}, Lm0/n0;->o(Lm0/n0;Ll0/i;IILjava/lang/Object;)V

    :cond_1
    invoke-virtual {p2}, LL0/M;->l()LL0/L;

    move-result-object v1

    invoke-virtual {v1}, LL0/L;->i()LL0/U;

    move-result-object v1

    invoke-virtual {v1}, LL0/U;->y()LL0/D;

    move-result-object v1

    invoke-virtual {v1}, LL0/D;->s()LW0/k;

    move-result-object v2

    if-nez v2, :cond_2

    sget-object v2, LW0/k;->b:LW0/k$a;

    invoke-virtual {v2}, LW0/k$a;->c()LW0/k;

    move-result-object v2

    :cond_2
    move-object v8, v2

    invoke-virtual {v1}, LL0/D;->r()Lm0/g1;

    move-result-object v2

    if-nez v2, :cond_3

    sget-object v2, Lm0/g1;->d:Lm0/g1$a;

    invoke-virtual {v2}, Lm0/g1$a;->a()Lm0/g1;

    move-result-object v2

    :cond_3
    move-object v7, v2

    invoke-virtual {v1}, LL0/D;->h()Lo0/g;

    move-result-object v2

    if-nez v2, :cond_4

    sget-object v2, Lo0/j;->a:Lo0/j;

    :cond_4
    move-object v9, v2

    :try_start_0
    invoke-virtual {v1}, LL0/D;->f()Lm0/l0;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-virtual {v1}, LL0/D;->t()LW0/n;

    move-result-object v2

    sget-object v3, LW0/n$b;->b:LW0/n$b;

    if-eq v2, v3, :cond_5

    invoke-virtual {v1}, LL0/D;->t()LW0/n;

    move-result-object v1

    invoke-interface {v1}, LW0/n;->b()F

    move-result v1

    :goto_1
    move v6, v1

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_6

    :cond_5
    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_1

    :goto_2
    invoke-virtual {p2}, LL0/M;->w()LL0/k;

    move-result-object v3

    const/16 v11, 0x40

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v4, p1

    invoke-static/range {v3 .. v12}, LL0/k;->F(LL0/k;Lm0/n0;Lm0/l0;FLm0/g1;LW0/k;Lo0/g;IILjava/lang/Object;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v1}, LL0/D;->t()LW0/n;

    move-result-object v2

    sget-object v3, LW0/n$b;->b:LW0/n$b;

    if-eq v2, v3, :cond_7

    invoke-virtual {v1}, LL0/D;->t()LW0/n;

    move-result-object v1

    invoke-interface {v1}, LW0/n;->c()J

    move-result-wide v1

    :goto_3
    move-wide v5, v1

    goto :goto_4

    :cond_7
    sget-object v1, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v1}, Lm0/v0$a;->a()J

    move-result-wide v1

    goto :goto_3

    :goto_4
    invoke-virtual {p2}, LL0/M;->w()LL0/k;

    move-result-object v3

    const/16 v11, 0x20

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v4, p1

    invoke-static/range {v3 .. v12}, LL0/k;->D(LL0/k;Lm0/n0;JLm0/g1;LW0/k;Lo0/g;IILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_5
    if-eqz v0, :cond_8

    invoke-interface {p1}, Lm0/n0;->r()V

    :cond_8
    return-void

    :goto_6
    if-eqz v0, :cond_9

    invoke-interface {p1}, Lm0/n0;->r()V

    :cond_9
    throw p2
.end method
