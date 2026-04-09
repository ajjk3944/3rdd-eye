.class public abstract LB/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(LB/t;Ljava/lang/Object;ILjava/lang/Object;LT/l;I)V
    .locals 7

    const v0, 0x55d242fd

    invoke-interface {p4, v0}, LT/l;->r(I)LT/l;

    move-result-object p4

    and-int/lit8 v1, p5, 0x6

    if-nez v1, :cond_1

    invoke-interface {p4, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p5

    goto :goto_1

    :cond_1
    move v1, p5

    :goto_1
    and-int/lit8 v2, p5, 0x30

    if-nez v2, :cond_3

    invoke-interface {p4, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p5, 0x180

    if-nez v2, :cond_5

    invoke-interface {p4, p2}, LT/l;->i(I)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, p5, 0xc00

    if-nez v2, :cond_7

    invoke-interface {p4, p3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x800

    goto :goto_4

    :cond_6
    const/16 v2, 0x400

    :goto_4
    or-int/2addr v1, v2

    :cond_7
    and-int/lit16 v2, v1, 0x493

    const/16 v3, 0x492

    if-ne v2, v3, :cond_9

    invoke-interface {p4}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_5

    :cond_8
    invoke-interface {p4}, LT/l;->C()V

    goto :goto_6

    :cond_9
    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_a

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:133)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_a
    move-object v0, p1

    check-cast v0, Lc0/e;

    new-instance v1, LB/s$a;

    invoke-direct {v1, p0, p2, p3}, LB/s$a;-><init>(LB/t;ILjava/lang/Object;)V

    const/16 v2, 0x36

    const v3, 0x3a785bde

    const/4 v4, 0x1

    invoke-static {v3, v4, v1, p4, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v1

    const/16 v2, 0x30

    invoke-interface {v0, p3, v1, p4, v2}, Lc0/e;->d(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_6
    invoke-interface {p4}, LT/l;->z()LT/X0;

    move-result-object p4

    if-eqz p4, :cond_c

    new-instance v6, LB/s$b;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, LB/s$b;-><init>(LB/t;Ljava/lang/Object;ILjava/lang/Object;I)V

    invoke-interface {p4, v6}, LT/X0;->a(Lmh/p;)V

    :cond_c
    return-void
.end method

.method public static final synthetic b(LB/t;Ljava/lang/Object;ILjava/lang/Object;LT/l;I)V
    .locals 0

    invoke-static/range {p0 .. p5}, LB/s;->a(LB/t;Ljava/lang/Object;ILjava/lang/Object;LT/l;I)V

    return-void
.end method
