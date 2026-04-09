.class public abstract LE0/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lo/E;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lo/L;->b()Lo/E;

    move-result-object v0

    sput-object v0, LE0/f0;->a:Lo/E;

    return-void
.end method

.method public static final a(Landroidx/compose/ui/e$c;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "autoInvalidateInsertedNode called on unattached node"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    const/4 v0, -0x1

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, LE0/f0;->b(Landroidx/compose/ui/e$c;II)V

    return-void
.end method

.method public static final b(Landroidx/compose/ui/e$c;II)V
    .locals 2

    instance-of v0, p0, LE0/m;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, LE0/m;

    invoke-virtual {v0}, LE0/m;->F2()I

    move-result v1

    and-int/2addr v1, p1

    invoke-static {p0, v1, p2}, LE0/f0;->c(Landroidx/compose/ui/e$c;II)V

    invoke-virtual {v0}, LE0/m;->F2()I

    move-result p0

    not-int p0, p0

    and-int/2addr p0, p1

    invoke-virtual {v0}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    invoke-static {p1, p0, p2}, LE0/f0;->b(Landroidx/compose/ui/e$c;II)V

    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v0

    and-int/2addr p1, v0

    invoke-static {p0, p1, p2}, LE0/f0;->c(Landroidx/compose/ui/e$c;II)V

    :cond_1
    return-void
.end method

.method private static final c(Landroidx/compose/ui/e$c;II)V
    .locals 3

    if-nez p2, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->i2()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x2

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v1

    and-int/2addr v1, p1

    if-eqz v1, :cond_1

    instance-of v1, p0, LE0/B;

    if-eqz v1, :cond_1

    move-object v1, p0

    check-cast v1, LE0/B;

    invoke-static {v1}, LE0/E;->b(LE0/B;)V

    if-ne p2, v0, :cond_1

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v1

    invoke-static {p0, v1}, LE0/k;->h(LE0/j;I)LE0/c0;

    move-result-object v1

    invoke-virtual {v1}, LE0/c0;->b3()V

    :cond_1
    const/16 v1, 0x80

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    and-int/2addr v1, p1

    if-eqz v1, :cond_2

    instance-of v1, p0, LE0/A;

    if-eqz v1, :cond_2

    if-eq p2, v0, :cond_2

    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object v1

    invoke-virtual {v1}, LE0/G;->F0()V

    :cond_2
    const/16 v1, 0x100

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    and-int/2addr v1, p1

    if-eqz v1, :cond_3

    instance-of v1, p0, LE0/t;

    if-eqz v1, :cond_3

    if-eq p2, v0, :cond_3

    invoke-static {p0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object v1

    invoke-virtual {v1}, LE0/G;->G0()V

    :cond_3
    const/4 v1, 0x4

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    and-int/2addr v1, p1

    if-eqz v1, :cond_4

    instance-of v1, p0, LE0/r;

    if-eqz v1, :cond_4

    move-object v1, p0

    check-cast v1, LE0/r;

    invoke-static {v1}, LE0/s;->a(LE0/r;)V

    :cond_4
    const/16 v1, 0x8

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    and-int/2addr v1, p1

    if-eqz v1, :cond_5

    instance-of v1, p0, LE0/v0;

    if-eqz v1, :cond_5

    move-object v1, p0

    check-cast v1, LE0/v0;

    invoke-static {v1}, LE0/w0;->b(LE0/v0;)V

    :cond_5
    const/16 v1, 0x40

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    and-int/2addr v1, p1

    if-eqz v1, :cond_6

    instance-of v1, p0, LE0/p0;

    if-eqz v1, :cond_6

    move-object v1, p0

    check-cast v1, LE0/p0;

    invoke-static {v1}, LE0/q0;->a(LE0/p0;)V

    :cond_6
    const/16 v1, 0x400

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    and-int/2addr v1, p1

    if-eqz v1, :cond_7

    instance-of v1, p0, Landroidx/compose/ui/focus/FocusTargetNode;

    if-eqz v1, :cond_7

    if-eq p2, v0, :cond_7

    move-object v1, p0

    check-cast v1, Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v1}, Lk0/p;->c(Landroidx/compose/ui/focus/FocusTargetNode;)V

    :cond_7
    const/16 v1, 0x800

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    and-int/2addr v1, p1

    if-eqz v1, :cond_9

    instance-of v1, p0, Lk0/h;

    if-eqz v1, :cond_9

    move-object v1, p0

    check-cast v1, Lk0/h;

    invoke-static {v1}, LE0/f0;->k(Lk0/h;)Z

    move-result v2

    if-eqz v2, :cond_9

    if-ne p2, v0, :cond_8

    invoke-static {v1}, LE0/f0;->j(Lk0/h;)V

    goto :goto_0

    :cond_8
    invoke-static {v1}, Lk0/i;->a(Lk0/h;)V

    :cond_9
    :goto_0
    const/16 p2, 0x1000

    invoke-static {p2}, LE0/e0;->a(I)I

    move-result p2

    and-int/2addr p1, p2

    if-eqz p1, :cond_a

    instance-of p1, p0, Lk0/b;

    if-eqz p1, :cond_a

    check-cast p0, Lk0/b;

    invoke-static {p0}, Lk0/c;->b(Lk0/b;)V

    :cond_a
    return-void
.end method

.method public static final d(Landroidx/compose/ui/e$c;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "autoInvalidateRemovedNode called on unattached node"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    const/4 v0, -0x1

    const/4 v1, 0x2

    invoke-static {p0, v0, v1}, LE0/f0;->b(Landroidx/compose/ui/e$c;II)V

    return-void
.end method

.method public static final e(Landroidx/compose/ui/e$c;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "autoInvalidateUpdatedNode called on unattached node"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, LE0/f0;->b(Landroidx/compose/ui/e$c;II)V

    return-void
.end method

.method public static final f(Landroidx/compose/ui/e$b;)I
    .locals 2

    const/4 v0, 0x1

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    instance-of v1, p0, LC0/x;

    if-eqz v1, :cond_0

    const/4 v1, 0x2

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    or-int/2addr v0, v1

    :cond_0
    instance-of v1, p0, Lj0/g;

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    or-int/2addr v0, v1

    :cond_1
    instance-of v1, p0, LJ0/l;

    if-eqz v1, :cond_2

    const/16 v1, 0x8

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    or-int/2addr v0, v1

    :cond_2
    instance-of v1, p0, Ly0/F;

    if-eqz v1, :cond_3

    const/16 v1, 0x10

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    or-int/2addr v0, v1

    :cond_3
    instance-of v1, p0, LD0/d;

    if-nez v1, :cond_4

    instance-of v1, p0, LD0/j;

    if-eqz v1, :cond_5

    :cond_4
    const/16 v1, 0x20

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    or-int/2addr v0, v1

    :cond_5
    instance-of v1, p0, LC0/J;

    if-eqz v1, :cond_6

    const/16 v1, 0x100

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    or-int/2addr v0, v1

    :cond_6
    instance-of p0, p0, LC0/K;

    if-eqz p0, :cond_7

    const/16 p0, 0x40

    invoke-static {p0}, LE0/e0;->a(I)I

    move-result p0

    or-int/2addr v0, p0

    :cond_7
    return v0
.end method

.method public static final g(Landroidx/compose/ui/e$c;)I
    .locals 4

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->f2()I

    move-result p0

    return p0

    :cond_0
    sget-object v0, LE0/f0;->a:Lo/E;

    invoke-static {p0}, Lf0/b;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/K;->a(Ljava/lang/Object;)I

    move-result v2

    if-ltz v2, :cond_1

    iget-object p0, v0, Lo/K;->c:[I

    aget p0, p0, v2

    goto/16 :goto_1

    :cond_1
    const/4 v2, 0x1

    invoke-static {v2}, LE0/e0;->a(I)I

    move-result v2

    instance-of v3, p0, LE0/B;

    if-eqz v3, :cond_2

    const/4 v3, 0x2

    invoke-static {v3}, LE0/e0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_2
    instance-of v3, p0, LE0/r;

    if-eqz v3, :cond_3

    const/4 v3, 0x4

    invoke-static {v3}, LE0/e0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_3
    instance-of v3, p0, LE0/v0;

    if-eqz v3, :cond_4

    const/16 v3, 0x8

    invoke-static {v3}, LE0/e0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_4
    instance-of v3, p0, LE0/s0;

    if-eqz v3, :cond_5

    const/16 v3, 0x10

    invoke-static {v3}, LE0/e0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_5
    instance-of v3, p0, LD0/h;

    if-eqz v3, :cond_6

    const/16 v3, 0x20

    invoke-static {v3}, LE0/e0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_6
    instance-of v3, p0, LE0/p0;

    if-eqz v3, :cond_7

    const/16 v3, 0x40

    invoke-static {v3}, LE0/e0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_7
    instance-of v3, p0, LE0/A;

    if-eqz v3, :cond_8

    const/16 v3, 0x80

    invoke-static {v3}, LE0/e0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_8
    instance-of v3, p0, LE0/t;

    if-eqz v3, :cond_9

    const/16 v3, 0x100

    invoke-static {v3}, LE0/e0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_9
    instance-of v3, p0, Landroidx/compose/ui/layout/b;

    if-eqz v3, :cond_a

    const/16 v3, 0x200

    invoke-static {v3}, LE0/e0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_a
    instance-of v3, p0, Landroidx/compose/ui/focus/FocusTargetNode;

    if-eqz v3, :cond_b

    const/16 v3, 0x400

    invoke-static {v3}, LE0/e0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_b
    instance-of v3, p0, Lk0/h;

    if-eqz v3, :cond_c

    const/16 v3, 0x800

    invoke-static {v3}, LE0/e0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_c
    instance-of v3, p0, Lk0/b;

    if-eqz v3, :cond_d

    const/16 v3, 0x1000

    invoke-static {v3}, LE0/e0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_d
    instance-of v3, p0, Lw0/e;

    if-eqz v3, :cond_e

    const/16 v3, 0x2000

    invoke-static {v3}, LE0/e0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_e
    instance-of v3, p0, LA0/a;

    if-eqz v3, :cond_f

    const/16 v3, 0x4000

    invoke-static {v3}, LE0/e0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_f
    instance-of v3, p0, LE0/h;

    if-eqz v3, :cond_10

    const v3, 0x8000

    invoke-static {v3}, LE0/e0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_10
    instance-of p0, p0, LE0/A0;

    if-eqz p0, :cond_11

    const/high16 p0, 0x40000

    invoke-static {p0}, LE0/e0;->a(I)I

    move-result p0

    or-int/2addr p0, v2

    goto :goto_0

    :cond_11
    move p0, v2

    :goto_0
    invoke-virtual {v0, v1, p0}, Lo/E;->r(Ljava/lang/Object;I)V

    :goto_1
    return p0
.end method

.method public static final h(Landroidx/compose/ui/e$c;)I
    .locals 2

    instance-of v0, p0, LE0/m;

    if-eqz v0, :cond_0

    check-cast p0, LE0/m;

    invoke-virtual {p0}, LE0/m;->F2()I

    move-result v0

    invoke-virtual {p0}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_1

    invoke-static {p0}, LE0/f0;->h(Landroidx/compose/ui/e$c;)I

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, LE0/f0;->g(Landroidx/compose/ui/e$c;)I

    move-result v0

    :cond_1
    return v0
.end method

.method public static final i(I)Z
    .locals 1

    const/16 v0, 0x80

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    and-int/2addr p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final j(Lk0/h;)V
    .locals 10

    const/16 v0, 0x400

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v1

    if-eqz v1, :cond_c

    new-instance v1, LV/b;

    const/16 v2, 0x10

    new-array v3, v2, [Landroidx/compose/ui/e$c;

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4}, LV/b;-><init>([Ljava/lang/Object;I)V

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v3

    if-nez v3, :cond_0

    invoke-interface {p0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object p0

    invoke-static {v1, p0}, LE0/k;->a(LV/b;Landroidx/compose/ui/e$c;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v3}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    invoke-virtual {v1}, LV/b;->u()Z

    move-result p0

    if-eqz p0, :cond_b

    invoke-virtual {v1}, LV/b;->o()I

    move-result p0

    const/4 v3, 0x1

    sub-int/2addr p0, v3

    invoke-virtual {v1, p0}, LV/b;->z(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/e$c;

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->a2()I

    move-result v5

    and-int/2addr v5, v0

    if-nez v5, :cond_2

    invoke-static {v1, p0}, LE0/k;->a(LV/b;Landroidx/compose/ui/e$c;)V

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v5

    and-int/2addr v5, v0

    if-eqz v5, :cond_a

    const/4 v5, 0x0

    move-object v6, v5

    :goto_2
    if-eqz p0, :cond_1

    instance-of v7, p0, Landroidx/compose/ui/focus/FocusTargetNode;

    if-eqz v7, :cond_3

    check-cast p0, Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {p0}, Lk0/p;->c(Landroidx/compose/ui/focus/FocusTargetNode;)V

    goto :goto_5

    :cond_3
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v7

    and-int/2addr v7, v0

    if-eqz v7, :cond_9

    instance-of v7, p0, LE0/m;

    if-eqz v7, :cond_9

    move-object v7, p0

    check-cast v7, LE0/m;

    invoke-virtual {v7}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v7

    move v8, v4

    :goto_3
    if-eqz v7, :cond_8

    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->f2()I

    move-result v9

    and-int/2addr v9, v0

    if-eqz v9, :cond_7

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v3, :cond_4

    move-object p0, v7

    goto :goto_4

    :cond_4
    if-nez v6, :cond_5

    new-instance v6, LV/b;

    new-array v9, v2, [Landroidx/compose/ui/e$c;

    invoke-direct {v6, v9, v4}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_5
    if-eqz p0, :cond_6

    invoke-virtual {v6, p0}, LV/b;->b(Ljava/lang/Object;)Z

    move-object p0, v5

    :cond_6
    invoke-virtual {v6, v7}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_7
    :goto_4
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v7

    goto :goto_3

    :cond_8
    if-ne v8, v3, :cond_9

    goto :goto_2

    :cond_9
    :goto_5
    invoke-static {v6}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object p0

    goto :goto_2

    :cond_a
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object p0

    goto :goto_1

    :cond_b
    return-void

    :cond_c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "visitChildren called on an unattached node"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final k(Lk0/h;)Z
    .locals 1

    sget-object v0, LE0/e;->a:LE0/e;

    invoke-virtual {v0}, LE0/e;->b()V

    invoke-interface {p0, v0}, Lk0/h;->o0(Landroidx/compose/ui/focus/k;)V

    invoke-virtual {v0}, LE0/e;->a()Z

    move-result p0

    return p0
.end method
