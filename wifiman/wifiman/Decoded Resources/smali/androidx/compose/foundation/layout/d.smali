.class public abstract Landroidx/compose/foundation/layout/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/HashMap;

.field private static final b:Ljava/util/HashMap;

.field private static final c:LC0/C;

.field private static final d:LC0/C;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    invoke-static {v0}, Landroidx/compose/foundation/layout/d;->d(Z)Ljava/util/HashMap;

    move-result-object v0

    sput-object v0, Landroidx/compose/foundation/layout/d;->a:Ljava/util/HashMap;

    const/4 v0, 0x0

    invoke-static {v0}, Landroidx/compose/foundation/layout/d;->d(Z)Ljava/util/HashMap;

    move-result-object v1

    sput-object v1, Landroidx/compose/foundation/layout/d;->b:Ljava/util/HashMap;

    new-instance v1, Landroidx/compose/foundation/layout/e;

    sget-object v2, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v2}, Lf0/c$a;->o()Lf0/c;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroidx/compose/foundation/layout/e;-><init>(Lf0/c;Z)V

    sput-object v1, Landroidx/compose/foundation/layout/d;->c:LC0/C;

    sget-object v0, Landroidx/compose/foundation/layout/d$b;->a:Landroidx/compose/foundation/layout/d$b;

    sput-object v0, Landroidx/compose/foundation/layout/d;->d:LC0/C;

    return-void
.end method

.method public static final a(Landroidx/compose/ui/e;LT/l;I)V
    .locals 7

    const v0, -0xc96ce69

    invoke-interface {p1, v0}, LT/l;->r(I)LT/l;

    move-result-object p1

    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v3, v1, 0x3

    if-ne v3, v2, :cond_3

    invoke-interface {p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_4

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.layout.Box (Box.kt:236)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object v0, Landroidx/compose/foundation/layout/d;->d:LC0/C;

    const/4 v1, 0x0

    invoke-static {p1, v1}, LT/j;->a(LT/l;I)I

    move-result v1

    invoke-static {p1, p0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-interface {p1}, LT/l;->G()LT/x;

    move-result-object v3

    sget-object v4, LE0/g;->K:LE0/g$a;

    invoke-virtual {v4}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface {p1}, LT/l;->x()LT/f;

    move-result-object v6

    if-nez v6, :cond_5

    invoke-static {}, LT/j;->c()V

    :cond_5
    invoke-interface {p1}, LT/l;->u()V

    invoke-interface {p1}, LT/l;->o()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {p1, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_6
    invoke-interface {p1}, LT/l;->I()V

    :goto_3
    invoke-static {p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual {v4}, LE0/g$a;->e()Lmh/p;

    move-result-object v6

    invoke-static {v5, v0, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v5, v3, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v5, v2, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v5}, LT/l;->o()Z

    move-result v2

    if-nez v2, :cond_7

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    :cond_7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v5, v2}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v1, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-interface {p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_4
    invoke-interface {p1}, LT/l;->z()LT/X0;

    move-result-object p1

    if-eqz p1, :cond_a

    new-instance v0, Landroidx/compose/foundation/layout/d$a;

    invoke-direct {v0, p0, p2}, Landroidx/compose/foundation/layout/d$a;-><init>(Landroidx/compose/ui/e;I)V

    invoke-interface {p1, v0}, LT/X0;->a(Lmh/p;)V

    :cond_a
    return-void
.end method

.method public static final synthetic b(LC0/B;)Z
    .locals 0

    invoke-static {p0}, Landroidx/compose/foundation/layout/d;->g(LC0/B;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic c(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;LC0/B;LY0/t;IILf0/c;)V
    .locals 0

    invoke-static/range {p0 .. p6}, Landroidx/compose/foundation/layout/d;->i(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;LC0/B;LY0/t;IILf0/c;)V

    return-void
.end method

.method private static final d(Z)Ljava/util/HashMap;
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    sget-object v1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v1}, Lf0/c$a;->o()Lf0/c;

    move-result-object v2

    invoke-static {v0, p0, v2}, Landroidx/compose/foundation/layout/d;->e(Ljava/util/HashMap;ZLf0/c;)V

    invoke-virtual {v1}, Lf0/c$a;->m()Lf0/c;

    move-result-object v2

    invoke-static {v0, p0, v2}, Landroidx/compose/foundation/layout/d;->e(Ljava/util/HashMap;ZLf0/c;)V

    invoke-virtual {v1}, Lf0/c$a;->n()Lf0/c;

    move-result-object v2

    invoke-static {v0, p0, v2}, Landroidx/compose/foundation/layout/d;->e(Ljava/util/HashMap;ZLf0/c;)V

    invoke-virtual {v1}, Lf0/c$a;->h()Lf0/c;

    move-result-object v2

    invoke-static {v0, p0, v2}, Landroidx/compose/foundation/layout/d;->e(Ljava/util/HashMap;ZLf0/c;)V

    invoke-virtual {v1}, Lf0/c$a;->e()Lf0/c;

    move-result-object v2

    invoke-static {v0, p0, v2}, Landroidx/compose/foundation/layout/d;->e(Ljava/util/HashMap;ZLf0/c;)V

    invoke-virtual {v1}, Lf0/c$a;->f()Lf0/c;

    move-result-object v2

    invoke-static {v0, p0, v2}, Landroidx/compose/foundation/layout/d;->e(Ljava/util/HashMap;ZLf0/c;)V

    invoke-virtual {v1}, Lf0/c$a;->d()Lf0/c;

    move-result-object v2

    invoke-static {v0, p0, v2}, Landroidx/compose/foundation/layout/d;->e(Ljava/util/HashMap;ZLf0/c;)V

    invoke-virtual {v1}, Lf0/c$a;->b()Lf0/c;

    move-result-object v2

    invoke-static {v0, p0, v2}, Landroidx/compose/foundation/layout/d;->e(Ljava/util/HashMap;ZLf0/c;)V

    invoke-virtual {v1}, Lf0/c$a;->c()Lf0/c;

    move-result-object v1

    invoke-static {v0, p0, v1}, Landroidx/compose/foundation/layout/d;->e(Ljava/util/HashMap;ZLf0/c;)V

    return-object v0
.end method

.method private static final e(Ljava/util/HashMap;ZLf0/c;)V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/e;

    invoke-direct {v0, p2, p1}, Landroidx/compose/foundation/layout/e;-><init>(Lf0/c;Z)V

    invoke-virtual {p0, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final f(LC0/B;)Landroidx/compose/foundation/layout/c;
    .locals 1

    invoke-interface {p0}, LC0/n;->b()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Landroidx/compose/foundation/layout/c;

    if-eqz v0, :cond_0

    check-cast p0, Landroidx/compose/foundation/layout/c;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static final g(LC0/B;)Z
    .locals 0

    invoke-static {p0}, Landroidx/compose/foundation/layout/d;->f(LC0/B;)Landroidx/compose/foundation/layout/c;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/foundation/layout/c;->E2()Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final h(Lf0/c;Z)LC0/C;
    .locals 1

    if-eqz p1, :cond_0

    sget-object v0, Landroidx/compose/foundation/layout/d;->a:Ljava/util/HashMap;

    goto :goto_0

    :cond_0
    sget-object v0, Landroidx/compose/foundation/layout/d;->b:Ljava/util/HashMap;

    :goto_0
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC0/C;

    if-nez v0, :cond_1

    new-instance v0, Landroidx/compose/foundation/layout/e;

    invoke-direct {v0, p0, p1}, Landroidx/compose/foundation/layout/e;-><init>(Lf0/c;Z)V

    :cond_1
    return-object v0
.end method

.method private static final i(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;LC0/B;LY0/t;IILf0/c;)V
    .locals 13

    invoke-static {p2}, Landroidx/compose/foundation/layout/d;->f(LC0/B;)Landroidx/compose/foundation/layout/c;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/c;->D2()Lf0/c;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v0

    goto :goto_1

    :cond_1
    :goto_0
    move-object/from16 v1, p6

    :goto_1
    invoke-virtual {p1}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v0

    invoke-virtual {p1}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v2

    invoke-static {v0, v2}, LY0/s;->a(II)J

    move-result-wide v2

    invoke-static/range {p4 .. p5}, LY0/s;->a(II)J

    move-result-wide v4

    move-object/from16 v6, p3

    invoke-interface/range {v1 .. v6}, Lf0/c;->a(JJLY0/t;)J

    move-result-wide v8

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v6, p0

    move-object v7, p1

    invoke-static/range {v6 .. v12}, Landroidx/compose/ui/layout/t$a;->j(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;JFILjava/lang/Object;)V

    return-void
.end method

.method public static final j(Lf0/c;ZLT/l;I)LC0/C;
    .locals 5

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:113)"

    const v2, 0x35e7844

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v0}, Lf0/c$a;->o()Lf0/c;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_1

    const p0, -0x65eea939

    invoke-interface {p2, p0}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->J()V

    sget-object p0, Landroidx/compose/foundation/layout/d;->c:LC0/C;

    goto :goto_1

    :cond_1
    const v0, -0x65ee0ef3

    invoke-interface {p2, v0}, LT/l;->U(I)V

    and-int/lit8 v0, p3, 0xe

    xor-int/lit8 v0, v0, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x4

    if-le v0, v3, :cond_2

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    and-int/lit8 v0, p3, 0x6

    if-ne v0, v3, :cond_4

    :cond_3
    move v0, v2

    goto :goto_0

    :cond_4
    move v0, v1

    :goto_0
    and-int/lit8 v3, p3, 0x70

    xor-int/lit8 v3, v3, 0x30

    const/16 v4, 0x20

    if-le v3, v4, :cond_5

    invoke-interface {p2, p1}, LT/l;->c(Z)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    and-int/lit8 p3, p3, 0x30

    if-ne p3, v4, :cond_7

    :cond_6
    move v1, v2

    :cond_7
    or-int p3, v0, v1

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_8

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_9

    :cond_8
    new-instance v0, Landroidx/compose/foundation/layout/e;

    invoke-direct {v0, p0, p1}, Landroidx/compose/foundation/layout/e;-><init>(Lf0/c;Z)V

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    move-object p0, v0

    check-cast p0, Landroidx/compose/foundation/layout/e;

    invoke-interface {p2}, LT/l;->J()V

    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    return-object p0
.end method
