.class public interface abstract LL0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic d(LL0/p;Lm0/n0;Lm0/l0;FLm0/g1;LW0/k;Lo0/g;IILjava/lang/Object;)V
    .locals 9

    if-nez p9, :cond_5

    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_0

    const/high16 v0, 0x7fc00000    # Float.NaN

    move v4, v0

    goto :goto_0

    :cond_0
    move v4, p3

    :goto_0
    and-int/lit8 v0, p8, 0x8

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v5, v1

    goto :goto_1

    :cond_1
    move-object v5, p4

    :goto_1
    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_2

    move-object v6, v1

    goto :goto_2

    :cond_2
    move-object v6, p5

    :goto_2
    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_3

    move-object v7, v1

    goto :goto_3

    :cond_3
    move-object v7, p6

    :goto_3
    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_4

    sget-object v0, Lo0/f;->d1:Lo0/f$a;

    invoke-virtual {v0}, Lo0/f$a;->a()I

    move-result v0

    move v8, v0

    goto :goto_4

    :cond_4
    move/from16 v8, p7

    :goto_4
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-interface/range {v1 .. v8}, LL0/p;->y(Lm0/n0;Lm0/l0;FLm0/g1;LW0/k;Lo0/g;I)V

    return-void

    :cond_5
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: paint-hn5TExg"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic w(LL0/p;Lm0/n0;JLm0/g1;LW0/k;Lo0/g;IILjava/lang/Object;)V
    .locals 6

    if-nez p9, :cond_5

    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_0

    sget-object v0, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v0}, Lm0/v0$a;->e()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    move-wide v0, p2

    :goto_0
    and-int/lit8 v2, p8, 0x4

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    move-object v2, v3

    goto :goto_1

    :cond_1
    move-object v2, p4

    :goto_1
    and-int/lit8 v4, p8, 0x8

    if-eqz v4, :cond_2

    move-object v4, v3

    goto :goto_2

    :cond_2
    move-object v4, p5

    :goto_2
    and-int/lit8 v5, p8, 0x10

    if-eqz v5, :cond_3

    goto :goto_3

    :cond_3
    move-object v3, p6

    :goto_3
    and-int/lit8 v5, p8, 0x20

    if-eqz v5, :cond_4

    sget-object v5, Lo0/f;->d1:Lo0/f$a;

    invoke-virtual {v5}, Lo0/f$a;->a()I

    move-result v5

    goto :goto_4

    :cond_4
    move v5, p7

    :goto_4
    move-object p2, p0

    move-object p3, p1

    move-wide p4, v0

    move-object p6, v2

    move-object p7, v4

    move-object p8, v3

    move p9, v5

    invoke-interface/range {p2 .. p9}, LL0/p;->v(Lm0/n0;JLm0/g1;LW0/k;Lo0/g;I)V

    return-void

    :cond_5
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: paint-LG529CI"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public abstract A(II)Lm0/U0;
.end method

.method public abstract B(IZ)F
.end method

.method public abstract C(I)F
.end method

.method public abstract a()F
.end method

.method public abstract b()F
.end method

.method public abstract c(J[FI)V
.end method

.method public abstract e(I)LW0/i;
.end method

.method public abstract f(I)F
.end method

.method public abstract g()F
.end method

.method public abstract getHeight()F
.end method

.method public abstract getWidth()F
.end method

.method public abstract h(I)Ll0/i;
.end method

.method public abstract i(I)J
.end method

.method public abstract j(I)I
.end method

.method public abstract k()F
.end method

.method public abstract l(I)LW0/i;
.end method

.method public abstract m(I)F
.end method

.method public abstract n(Ll0/i;ILL0/J;)J
.end method

.method public abstract o(J)I
.end method

.method public abstract p(I)Ll0/i;
.end method

.method public abstract q()Ljava/util/List;
.end method

.method public abstract r(I)I
.end method

.method public abstract s(IZ)I
.end method

.method public abstract t()I
.end method

.method public abstract u(I)F
.end method

.method public abstract v(Lm0/n0;JLm0/g1;LW0/k;Lo0/g;I)V
.end method

.method public abstract x()Z
.end method

.method public abstract y(Lm0/n0;Lm0/l0;FLm0/g1;LW0/k;Lo0/g;I)V
.end method

.method public abstract z(F)I
.end method
