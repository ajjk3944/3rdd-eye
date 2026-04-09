.class public final LL/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:LL0/d;

.field private b:LL0/U;

.field private c:LQ0/k$b;

.field private d:I

.field private e:Z

.field private f:I

.field private g:I

.field private h:Ljava/util/List;

.field private i:LL/c;

.field private j:J

.field private k:LY0/d;

.field private l:LL0/l;

.field private m:LY0/t;

.field private n:LL0/M;

.field private o:I

.field private p:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(LL0/d;LL0/U;LQ0/k$b;IZIILjava/util/List;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LL/e;->a:LL0/d;

    .line 4
    iput-object p2, p0, LL/e;->b:LL0/U;

    .line 5
    iput-object p3, p0, LL/e;->c:LQ0/k$b;

    .line 6
    iput p4, p0, LL/e;->d:I

    .line 7
    iput-boolean p5, p0, LL/e;->e:Z

    .line 8
    iput p6, p0, LL/e;->f:I

    .line 9
    iput p7, p0, LL/e;->g:I

    .line 10
    iput-object p8, p0, LL/e;->h:Ljava/util/List;

    .line 11
    sget-object p1, LL/a;->a:LL/a$a;

    invoke-virtual {p1}, LL/a$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, LL/e;->j:J

    const/4 p1, -0x1

    .line 12
    iput p1, p0, LL/e;->o:I

    .line 13
    iput p1, p0, LL/e;->p:I

    return-void
.end method

.method public synthetic constructor <init>(LL0/d;LL0/U;LQ0/k$b;IZIILjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, LL/e;-><init>(LL0/d;LL0/U;LQ0/k$b;IZIILjava/util/List;)V

    return-void
.end method

.method private final e(JLY0/t;)LL0/k;
    .locals 7

    invoke-direct {p0, p3}, LL/e;->l(LY0/t;)LL0/l;

    move-result-object v1

    new-instance p3, LL0/k;

    iget-boolean v0, p0, LL/e;->e:Z

    iget v2, p0, LL/e;->d:I

    invoke-virtual {v1}, LL0/l;->b()F

    move-result v3

    invoke-static {p1, p2, v0, v2, v3}, LL/b;->a(JZIF)J

    move-result-wide v2

    iget-boolean p1, p0, LL/e;->e:Z

    iget p2, p0, LL/e;->d:I

    iget v0, p0, LL/e;->f:I

    invoke-static {p1, p2, v0}, LL/b;->b(ZII)I

    move-result v4

    iget p1, p0, LL/e;->d:I

    sget-object p2, LW0/t;->a:LW0/t$a;

    invoke-virtual {p2}, LW0/t$a;->b()I

    move-result p2

    invoke-static {p1, p2}, LW0/t;->e(II)Z

    move-result v5

    const/4 v6, 0x0

    move-object v0, p3

    invoke-direct/range {v0 .. v6}, LL0/k;-><init>(LL0/l;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p3
.end method

.method private final g()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LL/e;->l:LL0/l;

    iput-object v0, p0, LL/e;->n:LL0/M;

    const/4 v0, -0x1

    iput v0, p0, LL/e;->p:I

    iput v0, p0, LL/e;->o:I

    return-void
.end method

.method private final j(LL0/M;JLY0/t;)Z
    .locals 4

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, LL0/M;->w()LL0/k;

    move-result-object v1

    invoke-virtual {v1}, LL0/k;->j()LL0/l;

    move-result-object v1

    invoke-virtual {v1}, LL0/l;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p1}, LL0/M;->l()LL0/L;

    move-result-object v1

    invoke-virtual {v1}, LL0/L;->d()LY0/t;

    move-result-object v1

    if-eq p4, v1, :cond_2

    return v0

    :cond_2
    invoke-virtual {p1}, LL0/M;->l()LL0/L;

    move-result-object p4

    invoke-virtual {p4}, LL0/L;->a()J

    move-result-wide v1

    invoke-static {p2, p3, v1, v2}, LY0/b;->f(JJ)Z

    move-result p4

    const/4 v1, 0x0

    if-eqz p4, :cond_3

    return v1

    :cond_3
    invoke-static {p2, p3}, LY0/b;->l(J)I

    move-result p4

    invoke-virtual {p1}, LL0/M;->l()LL0/L;

    move-result-object v2

    invoke-virtual {v2}, LL0/L;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/b;->l(J)I

    move-result v2

    if-eq p4, v2, :cond_4

    return v0

    :cond_4
    invoke-static {p2, p3}, LY0/b;->k(J)I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p1}, LL0/M;->w()LL0/k;

    move-result-object p3

    invoke-virtual {p3}, LL0/k;->h()F

    move-result p3

    cmpg-float p2, p2, p3

    if-ltz p2, :cond_6

    invoke-virtual {p1}, LL0/M;->w()LL0/k;

    move-result-object p1

    invoke-virtual {p1}, LL0/k;->f()Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_0

    :cond_5
    return v1

    :cond_6
    :goto_0
    return v0
.end method

.method private final l(LY0/t;)LL0/l;
    .locals 8

    iget-object v0, p0, LL/e;->l:LL0/l;

    if-eqz v0, :cond_0

    iget-object v1, p0, LL/e;->m:LY0/t;

    if-ne p1, v1, :cond_0

    invoke-virtual {v0}, LL0/l;->c()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_0
    iput-object p1, p0, LL/e;->m:LY0/t;

    iget-object v3, p0, LL/e;->a:LL0/d;

    iget-object v0, p0, LL/e;->b:LL0/U;

    invoke-static {v0, p1}, LL0/V;->d(LL0/U;LY0/t;)LL0/U;

    move-result-object v4

    iget-object v6, p0, LL/e;->k:LY0/d;

    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v7, p0, LL/e;->c:LQ0/k$b;

    iget-object p1, p0, LL/e;->h:Ljava/util/List;

    if-nez p1, :cond_1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    :cond_1
    move-object v5, p1

    new-instance v0, LL0/l;

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, LL0/l;-><init>(LL0/d;LL0/U;Ljava/util/List;LY0/d;LQ0/k$b;)V

    :cond_2
    iput-object v0, p0, LL/e;->l:LL0/l;

    return-object v0
.end method

.method private final m(LY0/t;JLL0/k;)LL0/M;
    .locals 22

    move-object/from16 v0, p0

    invoke-virtual/range {p4 .. p4}, LL0/k;->j()LL0/l;

    move-result-object v1

    invoke-virtual {v1}, LL0/l;->b()F

    move-result v1

    invoke-virtual/range {p4 .. p4}, LL0/k;->A()F

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    new-instance v8, LL0/M;

    new-instance v3, LL0/L;

    iget-object v10, v0, LL/e;->a:LL0/d;

    iget-object v11, v0, LL/e;->b:LL0/U;

    iget-object v2, v0, LL/e;->h:Ljava/util/List;

    if-nez v2, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v2

    :cond_0
    move-object v12, v2

    iget v13, v0, LL/e;->f:I

    iget-boolean v14, v0, LL/e;->e:Z

    iget v15, v0, LL/e;->d:I

    iget-object v2, v0, LL/e;->k:LY0/d;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v4, v0, LL/e;->c:LQ0/k$b;

    const/16 v21, 0x0

    move-object v9, v3

    move-object/from16 v16, v2

    move-object/from16 v17, p1

    move-object/from16 v18, v4

    move-wide/from16 v19, p2

    invoke-direct/range {v9 .. v21}, LL0/L;-><init>(LL0/d;LL0/U;Ljava/util/List;IZILY0/d;LY0/t;LQ0/k$b;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, LF/T;->a(F)I

    move-result v1

    invoke-virtual/range {p4 .. p4}, LL0/k;->h()F

    move-result v2

    invoke-static {v2}, LF/T;->a(F)I

    move-result v2

    invoke-static {v1, v2}, LY0/s;->a(II)J

    move-result-wide v1

    move-wide/from16 v4, p2

    invoke-static {v4, v5, v1, v2}, LY0/c;->f(JJ)J

    move-result-wide v5

    const/4 v7, 0x0

    move-object v2, v8

    move-object/from16 v4, p4

    invoke-direct/range {v2 .. v7}, LL0/M;-><init>(LL0/L;LL0/k;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method


# virtual methods
.method public final a()LY0/d;
    .locals 1

    iget-object v0, p0, LL/e;->k:LY0/d;

    return-object v0
.end method

.method public final b()LL0/M;
    .locals 1

    iget-object v0, p0, LL/e;->n:LL0/M;

    return-object v0
.end method

.method public final c()LL0/M;
    .locals 2

    iget-object v0, p0, LL/e;->n:LL0/M;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You must call layoutWithConstraints first"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d(ILY0/t;)I
    .locals 3

    iget v0, p0, LL/e;->o:I

    iget v1, p0, LL/e;->p:I

    if-ne p1, v0, :cond_0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    return v1

    :cond_0
    const v0, 0x7fffffff

    const/4 v1, 0x0

    invoke-static {v1, p1, v1, v0}, LY0/c;->a(IIII)J

    move-result-wide v0

    invoke-direct {p0, v0, v1, p2}, LL/e;->e(JLY0/t;)LL0/k;

    move-result-object p2

    invoke-virtual {p2}, LL0/k;->h()F

    move-result p2

    invoke-static {p2}, LF/T;->a(F)I

    move-result p2

    iput p1, p0, LL/e;->o:I

    iput p2, p0, LL/e;->p:I

    return p2
.end method

.method public final f(JLY0/t;)Z
    .locals 8

    iget v0, p0, LL/e;->g:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    sget-object v2, LL/c;->h:LL/c$a;

    iget-object v3, p0, LL/e;->i:LL/c;

    iget-object v5, p0, LL/e;->b:LL0/U;

    iget-object v6, p0, LL/e;->k:LY0/d;

    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v7, p0, LL/e;->c:LQ0/k$b;

    move-object v4, p3

    invoke-virtual/range {v2 .. v7}, LL/c$a;->a(LL/c;LY0/t;LL0/U;LY0/d;LQ0/k$b;)LL/c;

    move-result-object v0

    iput-object v0, p0, LL/e;->i:LL/c;

    iget v2, p0, LL/e;->g:I

    invoke-virtual {v0, p1, p2, v2}, LL/c;->c(JI)J

    move-result-wide p1

    :cond_0
    iget-object v0, p0, LL/e;->n:LL0/M;

    invoke-direct {p0, v0, p1, p2, p3}, LL/e;->j(LL0/M;JLY0/t;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LL/e;->n:LL0/M;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, LL0/M;->l()LL0/L;

    move-result-object v0

    invoke-virtual {v0}, LL0/L;->a()J

    move-result-wide v2

    invoke-static {p1, p2, v2, v3}, LY0/b;->f(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object v0, p0, LL/e;->n:LL0/M;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, LL0/M;->w()LL0/k;

    move-result-object v0

    invoke-direct {p0, p3, p1, p2, v0}, LL/e;->m(LY0/t;JLL0/k;)LL0/M;

    move-result-object p1

    iput-object p1, p0, LL/e;->n:LL0/M;

    return v1

    :cond_2
    invoke-direct {p0, p1, p2, p3}, LL/e;->e(JLY0/t;)LL0/k;

    move-result-object v0

    invoke-direct {p0, p3, p1, p2, v0}, LL/e;->m(LY0/t;JLL0/k;)LL0/M;

    move-result-object p1

    iput-object p1, p0, LL/e;->n:LL0/M;

    return v1
.end method

.method public final h(LY0/t;)I
    .locals 0

    invoke-direct {p0, p1}, LL/e;->l(LY0/t;)LL0/l;

    move-result-object p1

    invoke-virtual {p1}, LL0/l;->b()F

    move-result p1

    invoke-static {p1}, LF/T;->a(F)I

    move-result p1

    return p1
.end method

.method public final i(LY0/t;)I
    .locals 0

    invoke-direct {p0, p1}, LL/e;->l(LY0/t;)LL0/l;

    move-result-object p1

    invoke-virtual {p1}, LL0/l;->a()F

    move-result p1

    invoke-static {p1}, LF/T;->a(F)I

    move-result p1

    return p1
.end method

.method public final k(LY0/d;)V
    .locals 5

    iget-object v0, p0, LL/e;->k:LY0/d;

    if-eqz p1, :cond_0

    invoke-static {p1}, LL/a;->d(LY0/d;)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    sget-object v1, LL/a;->a:LL/a$a;

    invoke-virtual {v1}, LL/a$a;->a()J

    move-result-wide v1

    :goto_0
    if-nez v0, :cond_1

    iput-object p1, p0, LL/e;->k:LY0/d;

    iput-wide v1, p0, LL/e;->j:J

    return-void

    :cond_1
    if-eqz p1, :cond_2

    iget-wide v3, p0, LL/e;->j:J

    invoke-static {v3, v4, v1, v2}, LL/a;->e(JJ)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    iput-object p1, p0, LL/e;->k:LY0/d;

    iput-wide v1, p0, LL/e;->j:J

    invoke-direct {p0}, LL/e;->g()V

    :cond_3
    return-void
.end method

.method public final n(LL0/d;LL0/U;LQ0/k$b;IZIILjava/util/List;)V
    .locals 0

    iput-object p1, p0, LL/e;->a:LL0/d;

    iput-object p2, p0, LL/e;->b:LL0/U;

    iput-object p3, p0, LL/e;->c:LQ0/k$b;

    iput p4, p0, LL/e;->d:I

    iput-boolean p5, p0, LL/e;->e:Z

    iput p6, p0, LL/e;->f:I

    iput p7, p0, LL/e;->g:I

    iput-object p8, p0, LL/e;->h:Ljava/util/List;

    invoke-direct {p0}, LL/e;->g()V

    return-void
.end method
