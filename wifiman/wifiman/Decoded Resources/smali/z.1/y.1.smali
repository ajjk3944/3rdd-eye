.class final Lz/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/G;
.implements Lz/x;


# instance fields
.field private final a:Z

.field private final b:Lz/c$e;

.field private final c:Lz/c$m;

.field private final d:F

.field private final e:Lz/m;

.field private final f:F

.field private final g:I

.field private final h:I

.field private final i:Lz/v;

.field private final j:Lmh/q;

.field private final k:Lmh/q;

.field private final l:Lmh/q;

.field private final m:Lmh/q;


# direct methods
.method private constructor <init>(ZLz/c$e;Lz/c$m;FLz/m;FIILz/v;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lz/y;->a:Z

    .line 4
    iput-object p2, p0, Lz/y;->b:Lz/c$e;

    .line 5
    iput-object p3, p0, Lz/y;->c:Lz/c$m;

    .line 6
    iput p4, p0, Lz/y;->d:F

    .line 7
    iput-object p5, p0, Lz/y;->e:Lz/m;

    .line 8
    iput p6, p0, Lz/y;->f:F

    .line 9
    iput p7, p0, Lz/y;->g:I

    .line 10
    iput p8, p0, Lz/y;->h:I

    .line 11
    iput-object p9, p0, Lz/y;->i:Lz/v;

    .line 12
    invoke-virtual {p0}, Lz/y;->j()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lz/y$c;->a:Lz/y$c;

    goto :goto_0

    .line 13
    :cond_0
    sget-object p1, Lz/y$d;->a:Lz/y$d;

    .line 14
    :goto_0
    iput-object p1, p0, Lz/y;->j:Lmh/q;

    .line 15
    invoke-virtual {p0}, Lz/y;->j()Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lz/y$a;->a:Lz/y$a;

    goto :goto_1

    .line 16
    :cond_1
    sget-object p1, Lz/y$b;->a:Lz/y$b;

    .line 17
    :goto_1
    iput-object p1, p0, Lz/y;->k:Lmh/q;

    .line 18
    invoke-virtual {p0}, Lz/y;->j()Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lz/y$g;->a:Lz/y$g;

    goto :goto_2

    .line 19
    :cond_2
    sget-object p1, Lz/y$h;->a:Lz/y$h;

    .line 20
    :goto_2
    iput-object p1, p0, Lz/y;->l:Lmh/q;

    .line 21
    invoke-virtual {p0}, Lz/y;->j()Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lz/y$i;->a:Lz/y$i;

    goto :goto_3

    .line 22
    :cond_3
    sget-object p1, Lz/y$j;->a:Lz/y$j;

    .line 23
    :goto_3
    iput-object p1, p0, Lz/y;->m:Lmh/q;

    return-void
.end method

.method public synthetic constructor <init>(ZLz/c$e;Lz/c$m;FLz/m;FIILz/v;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p9}, Lz/y;-><init>(ZLz/c$e;Lz/c$m;FLz/m;FIILz/v;)V

    return-void
.end method


# virtual methods
.method public b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
    .locals 18

    move-object/from16 v10, p0

    move-object/from16 v0, p2

    iget v1, v10, Lz/y;->h:I

    if-eqz v1, :cond_5

    iget v1, v10, Lz/y;->g:I

    if-eqz v1, :cond_5

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-static/range {p3 .. p4}, LY0/b;->k(J)I

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, v10, Lz/y;->i:Lz/v;

    invoke-virtual {v1}, Lz/v;->i()Lz/u$a;

    move-result-object v1

    sget-object v2, Lz/u$a;->Visible:Lz/u$a;

    if-eq v1, v2, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-static/range {p2 .. p2}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v15, Lz/y$f;->a:Lz/y$f;

    const/16 v16, 0x4

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v11, p1

    invoke-static/range {v11 .. v17}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v1, 0x1

    invoke-static {v0, v1}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-static {v1}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LC0/B;

    move-object v3, v1

    goto :goto_0

    :cond_2
    move-object v3, v2

    :goto_0
    const/4 v1, 0x2

    invoke-static {v0, v1}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_3

    invoke-static {v0}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC0/B;

    move-object v4, v0

    goto :goto_1

    :cond_3
    move-object v4, v2

    :goto_1
    iget-object v0, v10, Lz/y;->i:Lz/v;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Lz/v;->j(I)V

    iget-object v0, v10, Lz/y;->i:Lz/v;

    move-object/from16 v1, p0

    move-object v2, v3

    move-object v3, v4

    move-wide/from16 v4, p3

    invoke-virtual/range {v0 .. v5}, Lz/v;->m(Lz/x;LC0/B;LC0/B;J)V

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    iget v3, v10, Lz/y;->d:F

    iget v4, v10, Lz/y;->f:F

    invoke-virtual/range {p0 .. p0}, Lz/y;->j()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lz/K;->Horizontal:Lz/K;

    :goto_2
    move-wide/from16 v5, p3

    goto :goto_3

    :cond_4
    sget-object v0, Lz/K;->Vertical:Lz/K;

    goto :goto_2

    :goto_3
    invoke-static {v5, v6, v0}, Lz/M;->c(JLz/K;)J

    move-result-wide v5

    iget v7, v10, Lz/y;->g:I

    iget v8, v10, Lz/y;->h:I

    iget-object v9, v10, Lz/y;->i:Lz/v;

    move-object/from16 v0, p1

    move-object/from16 v1, p0

    invoke-static/range {v0 .. v9}, Lz/t;->e(Landroidx/compose/ui/layout/m;Lz/x;Ljava/util/Iterator;FFJIILz/v;)LC0/D;

    move-result-object v0

    return-object v0

    :cond_5
    :goto_4
    sget-object v5, Lz/y$e;->a:Lz/y$e;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object v0

    return-object v0
.end method

.method public c(LC0/o;Ljava/util/List;I)I
    .locals 10

    iget-object v0, p0, Lz/y;->i:Lz/v;

    const/4 v1, 0x1

    invoke-static {p2, v1}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {v1}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LC0/n;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const/4 v3, 0x2

    invoke-static {p2, v3}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_1

    invoke-static {v3}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LC0/n;

    :cond_1
    invoke-virtual {p0}, Lz/y;->j()Z

    move-result v3

    const/16 v8, 0xd

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v5, p3

    invoke-static/range {v4 .. v9}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v4

    invoke-virtual/range {v0 .. v5}, Lz/v;->l(LC0/n;LC0/n;ZJ)V

    invoke-virtual {p0}, Lz/y;->j()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p2}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_2

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p2

    :cond_2
    move-object v1, p2

    iget p2, p0, Lz/y;->d:F

    invoke-interface {p1, p2}, LY0/d;->x1(F)I

    move-result v3

    iget p2, p0, Lz/y;->f:F

    invoke-interface {p1, p2}, LY0/d;->x1(F)I

    move-result v4

    iget v6, p0, Lz/y;->h:I

    iget v5, p0, Lz/y;->g:I

    iget-object v7, p0, Lz/y;->i:Lz/v;

    move-object v0, p0

    move v2, p3

    invoke-virtual/range {v0 .. v7}, Lz/y;->q(Ljava/util/List;IIIIILz/v;)I

    move-result p1

    goto :goto_1

    :cond_3
    invoke-static {p2}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_4

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p2

    :cond_4
    iget v0, p0, Lz/y;->d:F

    invoke-interface {p1, v0}, LY0/d;->x1(F)I

    move-result p1

    invoke-virtual {p0, p2, p3, p1}, Lz/y;->r(Ljava/util/List;II)I

    move-result p1

    :goto_1
    return p1
.end method

.method public e(LC0/o;Ljava/util/List;I)I
    .locals 10

    iget-object v0, p0, Lz/y;->i:Lz/v;

    const/4 v1, 0x1

    invoke-static {p2, v1}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {v1}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LC0/n;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const/4 v3, 0x2

    invoke-static {p2, v3}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_1

    invoke-static {v3}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LC0/n;

    :cond_1
    invoke-virtual {p0}, Lz/y;->j()Z

    move-result v3

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v7, p3

    invoke-static/range {v4 .. v9}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v4

    invoke-virtual/range {v0 .. v5}, Lz/v;->l(LC0/n;LC0/n;ZJ)V

    invoke-virtual {p0}, Lz/y;->j()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p2}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_2

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p2

    :cond_2
    iget v0, p0, Lz/y;->d:F

    invoke-interface {p1, v0}, LY0/d;->x1(F)I

    move-result p1

    invoke-virtual {p0, p2, p3, p1}, Lz/y;->r(Ljava/util/List;II)I

    move-result p1

    goto :goto_1

    :cond_3
    invoke-static {p2}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_4

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p2

    :cond_4
    move-object v1, p2

    iget p2, p0, Lz/y;->d:F

    invoke-interface {p1, p2}, LY0/d;->x1(F)I

    move-result v3

    iget p2, p0, Lz/y;->f:F

    invoke-interface {p1, p2}, LY0/d;->x1(F)I

    move-result v4

    iget v6, p0, Lz/y;->h:I

    iget v5, p0, Lz/y;->g:I

    iget-object v7, p0, Lz/y;->i:Lz/v;

    move-object v0, p0

    move v2, p3

    invoke-virtual/range {v0 .. v7}, Lz/y;->q(Ljava/util/List;IIIIILz/v;)I

    move-result p1

    :goto_1
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lz/y;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lz/y;

    iget-boolean v1, p0, Lz/y;->a:Z

    iget-boolean v3, p1, Lz/y;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lz/y;->b:Lz/c$e;

    iget-object v3, p1, Lz/y;->b:Lz/c$e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lz/y;->c:Lz/c$m;

    iget-object v3, p1, Lz/y;->c:Lz/c$m;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lz/y;->d:F

    iget v3, p1, Lz/y;->d:F

    invoke-static {v1, v3}, LY0/h;->n(FF)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lz/y;->e:Lz/m;

    iget-object v3, p1, Lz/y;->e:Lz/m;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lz/y;->f:F

    iget v3, p1, Lz/y;->f:F

    invoke-static {v1, v3}, LY0/h;->n(FF)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lz/y;->g:I

    iget v3, p1, Lz/y;->g:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lz/y;->h:I

    iget v3, p1, Lz/y;->h:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lz/y;->i:Lz/v;

    iget-object p1, p1, Lz/y;->i:Lz/v;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public f(LC0/o;Ljava/util/List;I)I
    .locals 10

    iget-object v0, p0, Lz/y;->i:Lz/v;

    const/4 v1, 0x1

    invoke-static {p2, v1}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {v1}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LC0/n;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const/4 v3, 0x2

    invoke-static {p2, v3}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_1

    invoke-static {v3}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LC0/n;

    :cond_1
    invoke-virtual {p0}, Lz/y;->j()Z

    move-result v3

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v7, p3

    invoke-static/range {v4 .. v9}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v4

    invoke-virtual/range {v0 .. v5}, Lz/v;->l(LC0/n;LC0/n;ZJ)V

    invoke-virtual {p0}, Lz/y;->j()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p2}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_2

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p2

    :cond_2
    move-object v1, p2

    iget p2, p0, Lz/y;->d:F

    invoke-interface {p1, p2}, LY0/d;->x1(F)I

    move-result v3

    iget p2, p0, Lz/y;->f:F

    invoke-interface {p1, p2}, LY0/d;->x1(F)I

    move-result v4

    iget v6, p0, Lz/y;->h:I

    iget v5, p0, Lz/y;->g:I

    iget-object v7, p0, Lz/y;->i:Lz/v;

    move-object v0, p0

    move v2, p3

    invoke-virtual/range {v0 .. v7}, Lz/y;->s(Ljava/util/List;IIIIILz/v;)I

    move-result p1

    goto :goto_1

    :cond_3
    invoke-static {p2}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_4

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p2

    :cond_4
    move-object v1, p2

    iget p2, p0, Lz/y;->d:F

    invoke-interface {p1, p2}, LY0/d;->x1(F)I

    move-result v3

    iget p2, p0, Lz/y;->f:F

    invoke-interface {p1, p2}, LY0/d;->x1(F)I

    move-result v4

    iget v6, p0, Lz/y;->h:I

    iget v5, p0, Lz/y;->g:I

    iget-object v7, p0, Lz/y;->i:Lz/v;

    move-object v0, p0

    move v2, p3

    invoke-virtual/range {v0 .. v7}, Lz/y;->q(Ljava/util/List;IIIIILz/v;)I

    move-result p1

    :goto_1
    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lz/y;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lz/y;->b:Lz/c$e;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lz/y;->c:Lz/c$m;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lz/y;->d:F

    invoke-static {v1}, LY0/h;->p(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lz/y;->e:Lz/m;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lz/y;->f:F

    invoke-static {v1}, LY0/h;->p(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lz/y;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lz/y;->h:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lz/y;->i:Lz/v;

    invoke-virtual {v1}, Lz/v;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public i(LC0/o;Ljava/util/List;I)I
    .locals 10

    iget-object v0, p0, Lz/y;->i:Lz/v;

    const/4 v1, 0x1

    invoke-static {p2, v1}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {v1}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LC0/n;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const/4 v3, 0x2

    invoke-static {p2, v3}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_1

    invoke-static {v3}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LC0/n;

    :cond_1
    invoke-virtual {p0}, Lz/y;->j()Z

    move-result v3

    const/16 v8, 0xd

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v5, p3

    invoke-static/range {v4 .. v9}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v4

    invoke-virtual/range {v0 .. v5}, Lz/v;->l(LC0/n;LC0/n;ZJ)V

    invoke-virtual {p0}, Lz/y;->j()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p2}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_2

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p2

    :cond_2
    move-object v1, p2

    iget p2, p0, Lz/y;->d:F

    invoke-interface {p1, p2}, LY0/d;->x1(F)I

    move-result v3

    iget p2, p0, Lz/y;->f:F

    invoke-interface {p1, p2}, LY0/d;->x1(F)I

    move-result v4

    iget v6, p0, Lz/y;->h:I

    iget v5, p0, Lz/y;->g:I

    iget-object v7, p0, Lz/y;->i:Lz/v;

    move-object v0, p0

    move v2, p3

    invoke-virtual/range {v0 .. v7}, Lz/y;->q(Ljava/util/List;IIIIILz/v;)I

    move-result p1

    goto :goto_1

    :cond_3
    invoke-static {p2}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_4

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p2

    :cond_4
    move-object v1, p2

    iget p2, p0, Lz/y;->d:F

    invoke-interface {p1, p2}, LY0/d;->x1(F)I

    move-result v3

    iget p2, p0, Lz/y;->f:F

    invoke-interface {p1, p2}, LY0/d;->x1(F)I

    move-result v4

    iget v6, p0, Lz/y;->h:I

    iget v5, p0, Lz/y;->g:I

    iget-object v7, p0, Lz/y;->i:Lz/v;

    move-object v0, p0

    move v2, p3

    invoke-virtual/range {v0 .. v7}, Lz/y;->s(Ljava/util/List;IIIIILz/v;)I

    move-result p1

    :goto_1
    return p1
.end method

.method public j()Z
    .locals 1

    iget-boolean v0, p0, Lz/y;->a:Z

    return v0
.end method

.method public l()Lz/m;
    .locals 1

    iget-object v0, p0, Lz/y;->e:Lz/m;

    return-object v0
.end method

.method public o()Lz/c$e;
    .locals 1

    iget-object v0, p0, Lz/y;->b:Lz/c$e;

    return-object v0
.end method

.method public p()Lz/c$m;
    .locals 1

    iget-object v0, p0, Lz/y;->c:Lz/c$m;

    return-object v0
.end method

.method public final q(Ljava/util/List;IIIIILz/v;)I
    .locals 10

    move-object v0, p0

    iget-object v2, v0, Lz/y;->m:Lmh/q;

    iget-object v3, v0, Lz/y;->l:Lmh/q;

    move-object v1, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    move/from16 v8, p6

    move-object/from16 v9, p7

    invoke-static/range {v1 .. v9}, Lz/t;->b(Ljava/util/List;Lmh/q;Lmh/q;IIIIILz/v;)J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/j;->e(J)I

    move-result v1

    return v1
.end method

.method public final r(Ljava/util/List;II)I
    .locals 2

    iget-object v0, p0, Lz/y;->j:Lmh/q;

    iget v1, p0, Lz/y;->g:I

    invoke-static {p1, v0, p2, p3, v1}, Lz/t;->c(Ljava/util/List;Lmh/q;III)I

    move-result p1

    return p1
.end method

.method public final s(Ljava/util/List;IIIIILz/v;)I
    .locals 10

    move-object v0, p0

    iget-object v2, v0, Lz/y;->m:Lmh/q;

    iget-object v3, v0, Lz/y;->l:Lmh/q;

    move-object v1, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    move/from16 v8, p6

    move-object/from16 v9, p7

    invoke-static/range {v1 .. v9}, Lz/t;->d(Ljava/util/List;Lmh/q;Lmh/q;IIIIILz/v;)I

    move-result v1

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FlowMeasurePolicy(isHorizontal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lz/y;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", horizontalArrangement="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz/y;->b:Lz/c$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", verticalArrangement="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz/y;->c:Lz/c$m;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mainAxisSpacing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lz/y;->d:F

    invoke-static {v1}, LY0/h;->r(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", crossAxisAlignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz/y;->e:Lz/m;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", crossAxisArrangementSpacing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lz/y;->f:F

    invoke-static {v1}, LY0/h;->r(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", maxItemsInMainAxis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lz/y;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", maxLines="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lz/y;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", overflow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz/y;->i:Lz/v;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
