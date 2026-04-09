.class public final LI/F;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LI/o1;

.field private final b:LI/l1;

.field private final c:LI/q;

.field private final d:LIi/N;

.field private e:Z

.field private f:Z

.field private g:LIi/y0;

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Z

.field private final l:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

.field private final m:[F

.field private final n:Landroid/graphics/Matrix;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LI/o1;LI/l1;LI/q;LIi/N;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI/F;->a:LI/o1;

    iput-object p2, p0, LI/F;->b:LI/l1;

    iput-object p3, p0, LI/F;->c:LI/q;

    iput-object p4, p0, LI/F;->d:LIi/N;

    new-instance p1, Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    invoke-direct {p1}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;-><init>()V

    iput-object p1, p0, LI/F;->l:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {p1, p2, p1}, Lm0/O0;->c([FILkotlin/jvm/internal/DefaultConstructorMarker;)[F

    move-result-object p1

    iput-object p1, p0, LI/F;->m:[F

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, LI/F;->n:Landroid/graphics/Matrix;

    return-void
.end method

.method public static final synthetic a(LI/F;)Landroid/view/inputmethod/CursorAnchorInfo;
    .locals 0

    invoke-direct {p0}, LI/F;->c()Landroid/view/inputmethod/CursorAnchorInfo;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LI/F;)LI/q;
    .locals 0

    iget-object p0, p0, LI/F;->c:LI/q;

    return-object p0
.end method

.method private final c()Landroid/view/inputmethod/CursorAnchorInfo;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, LI/F;->b:LI/l1;

    invoke-virtual {v1}, LI/l1;->j()LC0/r;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    invoke-interface {v1}, LC0/r;->M()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_4

    iget-object v3, v0, LI/F;->b:LI/l1;

    invoke-virtual {v3}, LI/l1;->d()LC0/r;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-interface {v3}, LC0/r;->M()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    move-object v3, v2

    :goto_1
    if-eqz v3, :cond_4

    iget-object v4, v0, LI/F;->b:LI/l1;

    invoke-virtual {v4}, LI/l1;->e()LC0/r;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-interface {v4}, LC0/r;->M()Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_2

    :cond_2
    move-object v4, v2

    :goto_2
    if-eqz v4, :cond_4

    iget-object v5, v0, LI/F;->b:LI/l1;

    invoke-virtual {v5}, LI/l1;->f()LL0/M;

    move-result-object v11

    if-nez v11, :cond_3

    return-object v2

    :cond_3
    iget-object v2, v0, LI/F;->a:LI/o1;

    invoke-virtual {v2}, LI/o1;->l()LH/h;

    move-result-object v7

    iget-object v2, v0, LI/F;->m:[F

    invoke-static {v2}, Lm0/O0;->h([F)V

    iget-object v2, v0, LI/F;->m:[F

    invoke-interface {v1, v2}, LC0/r;->O([F)V

    iget-object v2, v0, LI/F;->n:Landroid/graphics/Matrix;

    iget-object v5, v0, LI/F;->m:[F

    invoke-static {v2, v5}, Lm0/P;->a(Landroid/graphics/Matrix;[F)V

    invoke-static {v3}, LM/A;->b(LC0/r;)Ll0/i;

    move-result-object v2

    sget-object v5, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v5}, Ll0/g$a;->c()J

    move-result-wide v8

    invoke-interface {v1, v3, v8, v9}, LC0/r;->b0(LC0/r;J)J

    move-result-wide v8

    invoke-virtual {v2, v8, v9}, Ll0/i;->x(J)Ll0/i;

    move-result-object v13

    invoke-static {v4}, LM/A;->b(LC0/r;)Ll0/i;

    move-result-object v2

    invoke-virtual {v5}, Ll0/g$a;->c()J

    move-result-wide v5

    invoke-interface {v1, v4, v5, v6}, LC0/r;->b0(LC0/r;J)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ll0/i;->x(J)Ll0/i;

    move-result-object v14

    iget-object v6, v0, LI/F;->l:Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    invoke-virtual {v7}, LH/h;->f()J

    move-result-wide v8

    invoke-virtual {v7}, LH/h;->c()LL0/S;

    move-result-object v10

    iget-object v12, v0, LI/F;->n:Landroid/graphics/Matrix;

    iget-boolean v15, v0, LI/F;->h:Z

    iget-boolean v1, v0, LI/F;->i:Z

    iget-boolean v2, v0, LI/F;->j:Z

    iget-boolean v3, v0, LI/F;->k:Z

    move/from16 v16, v1

    move/from16 v17, v2

    move/from16 v18, v3

    invoke-static/range {v6 .. v18}, LI/E;->b(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Ljava/lang/CharSequence;JLL0/S;LL0/M;Landroid/graphics/Matrix;Ll0/i;Ll0/i;ZZZZ)Landroid/view/inputmethod/CursorAnchorInfo;

    move-result-object v1

    return-object v1

    :cond_4
    return-object v2
.end method

.method private final e(ZZZZZZ)V
    .locals 0

    iput-boolean p3, p0, LI/F;->h:Z

    iput-boolean p4, p0, LI/F;->i:Z

    iput-boolean p5, p0, LI/F;->j:Z

    iput-boolean p6, p0, LI/F;->k:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, LI/F;->f:Z

    invoke-direct {p0}, LI/F;->c()Landroid/view/inputmethod/CursorAnchorInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p3, p0, LI/F;->c:LI/q;

    invoke-interface {p3, p1}, LI/q;->c(Landroid/view/inputmethod/CursorAnchorInfo;)V

    :cond_0
    iput-boolean p2, p0, LI/F;->e:Z

    invoke-direct {p0}, LI/F;->f()V

    return-void
.end method

.method private final f()V
    .locals 9

    iget-boolean v0, p0, LI/F;->e:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, LI/F;->g:LIi/y0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LIi/y0;->isActive()Z

    move-result v0

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, LI/F;->d:LIi/N;

    sget-object v5, LIi/P;->UNDISPATCHED:LIi/P;

    new-instance v6, LI/F$a;

    invoke-direct {v6, p0, v2}, LI/F$a;-><init>(LI/F;Ldh/e;)V

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v4, 0x0

    invoke-static/range {v3 .. v8}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    move-result-object v0

    iput-object v0, p0, LI/F;->g:LIi/y0;

    goto :goto_0

    :cond_1
    iget-object v0, p0, LI/F;->g:LIi/y0;

    if-eqz v0, :cond_2

    invoke-static {v0, v2, v1, v2}, LIi/y0$a;->b(LIi/y0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_2
    iput-object v2, p0, LI/F;->g:LIi/y0;

    :goto_0
    return-void
.end method


# virtual methods
.method public final d(I)V
    .locals 10

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v1

    :goto_0
    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_1

    move v5, v2

    goto :goto_1

    :cond_1
    move v5, v1

    :goto_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x21

    if-lt v0, v3, :cond_8

    and-int/lit8 v3, p1, 0x10

    if-eqz v3, :cond_2

    move v3, v2

    goto :goto_2

    :cond_2
    move v3, v1

    :goto_2
    and-int/lit8 v6, p1, 0x8

    if-eqz v6, :cond_3

    move v6, v2

    goto :goto_3

    :cond_3
    move v6, v1

    :goto_3
    and-int/lit8 v7, p1, 0x4

    if-eqz v7, :cond_4

    move v7, v2

    goto :goto_4

    :cond_4
    move v7, v1

    :goto_4
    const/16 v8, 0x22

    if-lt v0, v8, :cond_5

    and-int/lit8 p1, p1, 0x20

    if-eqz p1, :cond_5

    move v1, v2

    :cond_5
    if-nez v3, :cond_7

    if-nez v6, :cond_7

    if-nez v7, :cond_7

    if-nez v1, :cond_7

    if-lt v0, v8, :cond_6

    move v6, v2

    move v7, v6

    move v8, v7

    move v9, v8

    goto :goto_5

    :cond_6
    move v9, v1

    move v6, v2

    move v7, v6

    move v8, v7

    goto :goto_5

    :cond_7
    move v9, v1

    move v8, v7

    move v7, v6

    move v6, v3

    goto :goto_5

    :cond_8
    move v8, v1

    move v9, v8

    move v6, v2

    move v7, v6

    :goto_5
    move-object v3, p0

    invoke-direct/range {v3 .. v9}, LI/F;->e(ZZZZZZ)V

    return-void
.end method
