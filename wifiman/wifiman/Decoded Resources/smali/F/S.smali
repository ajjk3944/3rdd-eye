.class public final LF/S;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF/S$a;
    }
.end annotation


# static fields
.field public static final l:LF/S$a;


# instance fields
.field private final a:LL0/d;

.field private final b:LL0/U;

.field private final c:I

.field private final d:I

.field private final e:Z

.field private final f:I

.field private final g:LY0/d;

.field private final h:LQ0/k$b;

.field private final i:Ljava/util/List;

.field private j:LL0/l;

.field private k:LY0/t;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LF/S$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF/S$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LF/S;->l:LF/S$a;

    return-void
.end method

.method private constructor <init>(LL0/d;LL0/U;IIZILY0/d;LQ0/k$b;Ljava/util/List;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LF/S;->a:LL0/d;

    .line 4
    iput-object p2, p0, LF/S;->b:LL0/U;

    .line 5
    iput p3, p0, LF/S;->c:I

    .line 6
    iput p4, p0, LF/S;->d:I

    .line 7
    iput-boolean p5, p0, LF/S;->e:Z

    .line 8
    iput p6, p0, LF/S;->f:I

    .line 9
    iput-object p7, p0, LF/S;->g:LY0/d;

    .line 10
    iput-object p8, p0, LF/S;->h:LQ0/k$b;

    .line 11
    iput-object p9, p0, LF/S;->i:Ljava/util/List;

    if-lez p3, :cond_2

    if-lez p4, :cond_1

    if-gt p4, p3, :cond_0

    return-void

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "minLines greater than maxLines"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "no minLines"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 14
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "no maxLines"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(LL0/d;LL0/U;IIZILY0/d;LQ0/k$b;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    const v1, 0x7fffffff

    move v5, v1

    goto :goto_0

    :cond_0
    move/from16 v5, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    move v6, v2

    goto :goto_1

    :cond_1
    move/from16 v6, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    move v7, v2

    goto :goto_2

    :cond_2
    move/from16 v7, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    .line 15
    sget-object v1, LW0/t;->a:LW0/t$a;

    invoke-virtual {v1}, LW0/t$a;->a()I

    move-result v1

    move v8, v1

    goto :goto_3

    :cond_3
    move/from16 v8, p6

    :goto_3
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_4

    .line 16
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    move-object v11, v0

    goto :goto_4

    :cond_4
    move-object/from16 v11, p9

    :goto_4
    const/4 v12, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    .line 17
    invoke-direct/range {v2 .. v12}, LF/S;-><init>(LL0/d;LL0/U;IIZILY0/d;LQ0/k$b;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(LL0/d;LL0/U;IIZILY0/d;LQ0/k$b;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p9}, LF/S;-><init>(LL0/d;LL0/U;IIZILY0/d;LQ0/k$b;Ljava/util/List;)V

    return-void
.end method

.method private final f()LL0/l;
    .locals 2

    iget-object v0, p0, LF/S;->j:LL0/l;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "layoutIntrinsics must be called first"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final n(JLY0/t;)LL0/k;
    .locals 9

    invoke-virtual {p0, p3}, LF/S;->m(LY0/t;)V

    invoke-static {p1, p2}, LY0/b;->n(J)I

    move-result p3

    iget-boolean v0, p0, LF/S;->e:Z

    if-nez v0, :cond_0

    iget v0, p0, LF/S;->f:I

    sget-object v1, LW0/t;->a:LW0/t$a;

    invoke-virtual {v1}, LW0/t$a;->b()I

    move-result v1

    invoke-static {v0, v1}, LW0/t;->e(II)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-static {p1, p2}, LY0/b;->h(J)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, LY0/b;->l(J)I

    move-result v0

    goto :goto_0

    :cond_1
    const v0, 0x7fffffff

    :goto_0
    iget-boolean v1, p0, LF/S;->e:Z

    if-nez v1, :cond_2

    iget v1, p0, LF/S;->f:I

    sget-object v2, LW0/t;->a:LW0/t$a;

    invoke-virtual {v2}, LW0/t$a;->b()I

    move-result v2

    invoke-static {v1, v2}, LW0/t;->e(II)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    :goto_1
    move v6, v1

    goto :goto_2

    :cond_2
    iget v1, p0, LF/S;->c:I

    goto :goto_1

    :goto_2
    if-ne p3, v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p0}, LF/S;->c()I

    move-result v1

    invoke-static {v1, p3, v0}, Lsh/m;->k(III)I

    move-result v0

    :goto_3
    new-instance p3, LL0/k;

    invoke-direct {p0}, LF/S;->f()LL0/l;

    move-result-object v3

    sget-object v1, LY0/b;->b:LY0/b$a;

    invoke-static {p1, p2}, LY0/b;->k(J)I

    move-result p1

    const/4 p2, 0x0

    invoke-virtual {v1, p2, v0, p2, p1}, LY0/b$a;->b(IIII)J

    move-result-wide v4

    iget p1, p0, LF/S;->f:I

    sget-object p2, LW0/t;->a:LW0/t$a;

    invoke-virtual {p2}, LW0/t$a;->b()I

    move-result p2

    invoke-static {p1, p2}, LW0/t;->e(II)Z

    move-result v7

    const/4 v8, 0x0

    move-object v2, p3

    invoke-direct/range {v2 .. v8}, LL0/k;-><init>(LL0/l;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p3
.end method


# virtual methods
.method public final a()LY0/d;
    .locals 1

    iget-object v0, p0, LF/S;->g:LY0/d;

    return-object v0
.end method

.method public final b()LQ0/k$b;
    .locals 1

    iget-object v0, p0, LF/S;->h:LQ0/k$b;

    return-object v0
.end method

.method public final c()I
    .locals 1

    invoke-direct {p0}, LF/S;->f()LL0/l;

    move-result-object v0

    invoke-virtual {v0}, LL0/l;->b()F

    move-result v0

    invoke-static {v0}, LF/T;->a(F)I

    move-result v0

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, LF/S;->c:I

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, LF/S;->d:I

    return v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, LF/S;->f:I

    return v0
.end method

.method public final h()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LF/S;->i:Ljava/util/List;

    return-object v0
.end method

.method public final i()Z
    .locals 1

    iget-boolean v0, p0, LF/S;->e:Z

    return v0
.end method

.method public final j()LL0/U;
    .locals 1

    iget-object v0, p0, LF/S;->b:LL0/U;

    return-object v0
.end method

.method public final k()LL0/d;
    .locals 1

    iget-object v0, p0, LF/S;->a:LL0/d;

    return-object v0
.end method

.method public final l(JLY0/t;LL0/M;)LL0/M;
    .locals 21

    move-object/from16 v0, p0

    move-wide/from16 v14, p1

    move-object/from16 v13, p4

    if-eqz v13, :cond_0

    iget-object v2, v0, LF/S;->a:LL0/d;

    iget-object v3, v0, LF/S;->b:LL0/U;

    iget-object v4, v0, LF/S;->i:Ljava/util/List;

    iget v5, v0, LF/S;->c:I

    iget-boolean v6, v0, LF/S;->e:Z

    iget v7, v0, LF/S;->f:I

    iget-object v8, v0, LF/S;->g:LY0/d;

    iget-object v10, v0, LF/S;->h:LQ0/k$b;

    move-object/from16 v1, p4

    move-object/from16 v9, p3

    move-wide/from16 v11, p1

    invoke-static/range {v1 .. v12}, LF/i0;->a(LL0/M;LL0/d;LL0/U;Ljava/util/List;IZILY0/d;LY0/t;LQ0/k$b;J)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v11, LL0/L;

    invoke-virtual/range {p4 .. p4}, LL0/M;->l()LL0/L;

    move-result-object v1

    invoke-virtual {v1}, LL0/L;->j()LL0/d;

    move-result-object v2

    iget-object v3, v0, LF/S;->b:LL0/U;

    invoke-virtual/range {p4 .. p4}, LL0/M;->l()LL0/L;

    move-result-object v1

    invoke-virtual {v1}, LL0/L;->g()Ljava/util/List;

    move-result-object v4

    invoke-virtual/range {p4 .. p4}, LL0/M;->l()LL0/L;

    move-result-object v1

    invoke-virtual {v1}, LL0/L;->e()I

    move-result v5

    invoke-virtual/range {p4 .. p4}, LL0/M;->l()LL0/L;

    move-result-object v1

    invoke-virtual {v1}, LL0/L;->h()Z

    move-result v6

    invoke-virtual/range {p4 .. p4}, LL0/M;->l()LL0/L;

    move-result-object v1

    invoke-virtual {v1}, LL0/L;->f()I

    move-result v7

    invoke-virtual/range {p4 .. p4}, LL0/M;->l()LL0/L;

    move-result-object v1

    invoke-virtual {v1}, LL0/L;->b()LY0/d;

    move-result-object v8

    invoke-virtual/range {p4 .. p4}, LL0/M;->l()LL0/L;

    move-result-object v1

    invoke-virtual {v1}, LL0/L;->d()LY0/t;

    move-result-object v9

    invoke-virtual/range {p4 .. p4}, LL0/M;->l()LL0/L;

    move-result-object v1

    invoke-virtual {v1}, LL0/L;->c()LQ0/k$b;

    move-result-object v10

    const/16 v16, 0x0

    move-object v1, v11

    move-object v0, v11

    move-wide/from16 v11, p1

    move-object/from16 v13, v16

    invoke-direct/range {v1 .. v13}, LL0/L;-><init>(LL0/d;LL0/U;Ljava/util/List;IZILY0/d;LY0/t;LQ0/k$b;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p4 .. p4}, LL0/M;->w()LL0/k;

    move-result-object v1

    invoke-virtual {v1}, LL0/k;->A()F

    move-result v1

    invoke-static {v1}, LF/T;->a(F)I

    move-result v1

    invoke-virtual/range {p4 .. p4}, LL0/M;->w()LL0/k;

    move-result-object v2

    invoke-virtual {v2}, LL0/k;->h()F

    move-result v2

    invoke-static {v2}, LF/T;->a(F)I

    move-result v2

    invoke-static {v1, v2}, LY0/s;->a(II)J

    move-result-wide v1

    invoke-static {v14, v15, v1, v2}, LY0/c;->f(JJ)J

    move-result-wide v1

    move-object/from16 v3, p4

    invoke-virtual {v3, v0, v1, v2}, LL0/M;->a(LL0/L;J)LL0/M;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-direct/range {p0 .. p3}, LF/S;->n(JLY0/t;)LL0/k;

    move-result-object v0

    invoke-virtual {v0}, LL0/k;->A()F

    move-result v1

    invoke-static {v1}, LF/T;->a(F)I

    move-result v1

    invoke-virtual {v0}, LL0/k;->h()F

    move-result v2

    invoke-static {v2}, LF/T;->a(F)I

    move-result v2

    invoke-static {v1, v2}, LY0/s;->a(II)J

    move-result-wide v1

    invoke-static {v14, v15, v1, v2}, LY0/c;->f(JJ)J

    move-result-wide v16

    new-instance v18, LL0/M;

    new-instance v19, LL0/L;

    move-object/from16 v13, p0

    iget-object v2, v13, LF/S;->a:LL0/d;

    iget-object v3, v13, LF/S;->b:LL0/U;

    iget-object v4, v13, LF/S;->i:Ljava/util/List;

    iget v5, v13, LF/S;->c:I

    iget-boolean v6, v13, LF/S;->e:Z

    iget v7, v13, LF/S;->f:I

    iget-object v8, v13, LF/S;->g:LY0/d;

    iget-object v10, v13, LF/S;->h:LQ0/k$b;

    const/16 v20, 0x0

    move-object/from16 v1, v19

    move-object/from16 v9, p3

    move-wide/from16 v11, p1

    move-object/from16 v13, v20

    invoke-direct/range {v1 .. v13}, LL0/L;-><init>(LL0/d;LL0/U;Ljava/util/List;IZILY0/d;LY0/t;LQ0/k$b;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x0

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    move-object v3, v0

    move-wide/from16 v4, v16

    invoke-direct/range {v1 .. v6}, LL0/M;-><init>(LL0/L;LL0/k;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v18
.end method

.method public final m(LY0/t;)V
    .locals 8

    iget-object v0, p0, LF/S;->j:LL0/l;

    if-eqz v0, :cond_0

    iget-object v1, p0, LF/S;->k:LY0/t;

    if-ne p1, v1, :cond_0

    invoke-virtual {v0}, LL0/l;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    iput-object p1, p0, LF/S;->k:LY0/t;

    iget-object v3, p0, LF/S;->a:LL0/d;

    iget-object v0, p0, LF/S;->b:LL0/U;

    invoke-static {v0, p1}, LL0/V;->d(LL0/U;LY0/t;)LL0/U;

    move-result-object v4

    iget-object v6, p0, LF/S;->g:LY0/d;

    iget-object v7, p0, LF/S;->h:LQ0/k$b;

    iget-object v5, p0, LF/S;->i:Ljava/util/List;

    new-instance v0, LL0/l;

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, LL0/l;-><init>(LL0/d;LL0/U;Ljava/util/List;LY0/d;LQ0/k$b;)V

    :cond_1
    iput-object v0, p0, LF/S;->j:LL0/l;

    return-void
.end method
