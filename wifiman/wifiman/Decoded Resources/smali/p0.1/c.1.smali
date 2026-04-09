.class public final Lp0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp0/c$a;
    }
.end annotation


# static fields
.field public static final x:Lp0/c$a;

.field private static final y:Lp0/G;


# instance fields
.field private final a:Lp0/d;

.field private b:LY0/d;

.field private c:LY0/t;

.field private d:Lmh/l;

.field private final e:Lmh/l;

.field private f:Landroid/graphics/Outline;

.field private g:Z

.field private h:J

.field private i:J

.field private j:F

.field private k:Lm0/Q0;

.field private l:Lm0/U0;

.field private m:Lm0/U0;

.field private n:Z

.field private o:Lm0/S0;

.field private p:I

.field private final q:Lp0/a;

.field private r:Z

.field private s:J

.field private t:J

.field private u:J

.field private v:Z

.field private w:Landroid/graphics/RectF;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp0/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp0/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lp0/c;->x:Lp0/c$a;

    sget-object v0, Lp0/F;->a:Lp0/F$a;

    invoke-virtual {v0}, Lp0/F$a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lp0/H;->a:Lp0/H;

    goto :goto_0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    sget-object v0, Lp0/J;->a:Lp0/J;

    goto :goto_0

    :cond_1
    sget-object v0, Lp0/S;->a:Lp0/S;

    invoke-virtual {v0}, Lp0/S;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lp0/I;->a:Lp0/I;

    goto :goto_0

    :cond_2
    sget-object v0, Lp0/H;->a:Lp0/H;

    :goto_0
    sput-object v0, Lp0/c;->y:Lp0/G;

    return-void
.end method

.method public constructor <init>(Lp0/d;Lp0/F;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/c;->a:Lp0/d;

    invoke-static {}, Lo0/e;->a()LY0/d;

    move-result-object p2

    iput-object p2, p0, Lp0/c;->b:LY0/d;

    sget-object p2, LY0/t;->Ltr:LY0/t;

    iput-object p2, p0, Lp0/c;->c:LY0/t;

    sget-object p2, Lp0/c$c;->a:Lp0/c$c;

    iput-object p2, p0, Lp0/c;->d:Lmh/l;

    new-instance p2, Lp0/c$b;

    invoke-direct {p2, p0}, Lp0/c$b;-><init>(Lp0/c;)V

    iput-object p2, p0, Lp0/c;->e:Lmh/l;

    const/4 p2, 0x1

    iput-boolean p2, p0, Lp0/c;->g:Z

    sget-object p2, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p2}, Ll0/g$a;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lp0/c;->h:J

    sget-object v0, Ll0/m;->b:Ll0/m$a;

    invoke-virtual {v0}, Ll0/m$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lp0/c;->i:J

    new-instance v0, Lp0/a;

    invoke-direct {v0}, Lp0/a;-><init>()V

    iput-object v0, p0, Lp0/c;->q:Lp0/a;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lp0/d;->G(Z)V

    sget-object p1, LY0/n;->b:LY0/n$a;

    invoke-virtual {p1}, LY0/n$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lp0/c;->s:J

    sget-object p1, LY0/r;->b:LY0/r$a;

    invoke-virtual {p1}, LY0/r$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lp0/c;->t:J

    invoke-virtual {p2}, Ll0/g$a;->b()J

    move-result-wide p1

    iput-wide p1, p0, Lp0/c;->u:J

    return-void
.end method

.method private final A()Landroid/graphics/Outline;
    .locals 1

    iget-object v0, p0, Lp0/c;->f:Landroid/graphics/Outline;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Outline;

    invoke-direct {v0}, Landroid/graphics/Outline;-><init>()V

    iput-object v0, p0, Lp0/c;->f:Landroid/graphics/Outline;

    :cond_0
    return-object v0
.end method

.method private final B()Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, Lp0/c;->w:Landroid/graphics/RectF;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lp0/c;->w:Landroid/graphics/RectF;

    :cond_0
    return-object v0
.end method

.method private final C()V
    .locals 1

    iget v0, p0, Lp0/c;->p:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lp0/c;->p:I

    return-void
.end method

.method private final D()V
    .locals 1

    iget v0, p0, Lp0/c;->p:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lp0/c;->p:I

    invoke-direct {p0}, Lp0/c;->f()V

    return-void
.end method

.method private final F()V
    .locals 15

    iget-object v0, p0, Lp0/c;->q:Lp0/a;

    invoke-static {v0}, Lp0/a;->b(Lp0/a;)Lp0/c;

    move-result-object v1

    invoke-static {v0, v1}, Lp0/a;->g(Lp0/a;Lp0/c;)V

    invoke-static {v0}, Lp0/a;->a(Lp0/a;)Lo/I;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lo/T;->e()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v0}, Lp0/a;->c(Lp0/a;)Lo/I;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-static {}, Lo/U;->a()Lo/I;

    move-result-object v2

    invoke-static {v0, v2}, Lp0/a;->f(Lp0/a;Lo/I;)V

    :cond_0
    invoke-virtual {v2, v1}, Lo/I;->j(Lo/T;)Z

    invoke-virtual {v1}, Lo/I;->m()V

    :cond_1
    const/4 v1, 0x1

    invoke-static {v0, v1}, Lp0/a;->h(Lp0/a;Z)V

    iget-object v1, p0, Lp0/c;->a:Lp0/d;

    iget-object v2, p0, Lp0/c;->b:LY0/d;

    iget-object v3, p0, Lp0/c;->c:LY0/t;

    iget-object v4, p0, Lp0/c;->e:Lmh/l;

    invoke-interface {v1, v2, v3, p0, v4}, Lp0/d;->J(LY0/d;LY0/t;Lp0/c;Lmh/l;)V

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lp0/a;->h(Lp0/a;Z)V

    invoke-static {v0}, Lp0/a;->d(Lp0/a;)Lp0/c;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-direct {v2}, Lp0/c;->D()V

    :cond_2
    invoke-static {v0}, Lp0/a;->c(Lp0/a;)Lo/I;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lo/T;->e()Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v2, v0, Lo/T;->b:[Ljava/lang/Object;

    iget-object v3, v0, Lo/T;->a:[J

    array-length v4, v3

    add-int/lit8 v4, v4, -0x2

    if-ltz v4, :cond_6

    move v5, v1

    :goto_0
    aget-wide v6, v3, v5

    not-long v8, v6

    const/4 v10, 0x7

    shl-long/2addr v8, v10

    and-long/2addr v8, v6

    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v8, v10

    cmp-long v8, v8, v10

    if-eqz v8, :cond_5

    sub-int v8, v5, v4

    not-int v8, v8

    ushr-int/lit8 v8, v8, 0x1f

    const/16 v9, 0x8

    rsub-int/lit8 v8, v8, 0x8

    move v10, v1

    :goto_1
    if-ge v10, v8, :cond_4

    const-wide/16 v11, 0xff

    and-long/2addr v11, v6

    const-wide/16 v13, 0x80

    cmp-long v11, v11, v13

    if-gez v11, :cond_3

    shl-int/lit8 v11, v5, 0x3

    add-int/2addr v11, v10

    aget-object v11, v2, v11

    check-cast v11, Lp0/c;

    invoke-direct {v11}, Lp0/c;->D()V

    :cond_3
    shr-long/2addr v6, v9

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_4
    if-ne v8, v9, :cond_6

    :cond_5
    if-eq v5, v4, :cond_6

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_6
    invoke-virtual {v0}, Lo/I;->m()V

    :cond_7
    return-void
.end method

.method private final G()V
    .locals 1

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->q()Z

    move-result v0

    if-nez v0, :cond_0

    :try_start_0
    invoke-direct {p0}, Lp0/c;->F()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method private final I()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lp0/c;->k:Lm0/Q0;

    iput-object v0, p0, Lp0/c;->l:Lm0/U0;

    sget-object v0, Ll0/m;->b:Ll0/m$a;

    invoke-virtual {v0}, Ll0/m$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lp0/c;->i:J

    sget-object v0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v0}, Ll0/g$a;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lp0/c;->h:J

    const/4 v0, 0x0

    iput v0, p0, Lp0/c;->j:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Lp0/c;->g:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lp0/c;->n:Z

    return-void
.end method

.method private final Q(JJ)V
    .locals 2

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-static {p1, p2}, LY0/n;->h(J)I

    move-result v1

    invoke-static {p1, p2}, LY0/n;->i(J)I

    move-result p1

    invoke-interface {v0, v1, p1, p3, p4}, Lp0/d;->y(IIJ)V

    return-void
.end method

.method public static final synthetic a(Lp0/c;)Lmh/l;
    .locals 0

    iget-object p0, p0, Lp0/c;->d:Lmh/l;

    return-object p0
.end method

.method private final a0(J)V
    .locals 2

    iget-wide v0, p0, Lp0/c;->t:J

    invoke-static {v0, v1, p1, p2}, LY0/r;->e(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iput-wide p1, p0, Lp0/c;->t:J

    iget-wide v0, p0, Lp0/c;->s:J

    invoke-direct {p0, v0, v1, p1, p2}, Lp0/c;->Q(JJ)V

    iget-wide p1, p0, Lp0/c;->i:J

    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long p1, p1, v0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lp0/c;->g:Z

    invoke-direct {p0}, Lp0/c;->e()V

    :cond_0
    return-void
.end method

.method public static final synthetic b(Lp0/c;)Lm0/U0;
    .locals 0

    iget-object p0, p0, Lp0/c;->l:Lm0/U0;

    return-object p0
.end method

.method public static final synthetic c(Lp0/c;)Z
    .locals 0

    iget-boolean p0, p0, Lp0/c;->n:Z

    return p0
.end method

.method private final d(Lp0/c;)V
    .locals 1

    iget-object v0, p0, Lp0/c;->q:Lp0/a;

    invoke-virtual {v0, p1}, Lp0/a;->i(Lp0/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p1}, Lp0/c;->C()V

    :cond_0
    return-void
.end method

.method private final e()V
    .locals 12

    iget-boolean v0, p0, Lp0/c;->g:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    iget-boolean v0, p0, Lp0/c;->v:Z

    const/4 v2, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lp0/c;->u()F

    move-result v0

    const/4 v3, 0x0

    cmpl-float v0, v0, v3

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0, v1}, Lp0/d;->G(Z)V

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    sget-object v3, LY0/r;->b:LY0/r$a;

    invoke-virtual {v3}, LY0/r$a;->a()J

    move-result-wide v3

    invoke-interface {v0, v2, v3, v4}, Lp0/d;->v(Landroid/graphics/Outline;J)V

    goto/16 :goto_2

    :cond_1
    :goto_0
    iget-object v0, p0, Lp0/c;->l:Lm0/U0;

    if-eqz v0, :cond_5

    invoke-direct {p0}, Lp0/c;->B()Landroid/graphics/RectF;

    move-result-object v3

    instance-of v4, v0, Lm0/T;

    if-eqz v4, :cond_4

    move-object v4, v0

    check-cast v4, Lm0/T;

    invoke-virtual {v4}, Lm0/T;->v()Landroid/graphics/Path;

    move-result-object v4

    invoke-virtual {v4, v3, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    invoke-direct {p0, v0}, Lp0/c;->g0(Lm0/U0;)Landroid/graphics/Outline;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lp0/c;->i()F

    move-result v2

    invoke-virtual {v0, v2}, Landroid/graphics/Outline;->setAlpha(F)V

    move-object v2, v0

    :cond_2
    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-static {v4, v3}, LY0/s;->a(II)J

    move-result-wide v3

    invoke-interface {v0, v2, v3, v4}, Lp0/d;->v(Landroid/graphics/Outline;J)V

    iget-boolean v0, p0, Lp0/c;->n:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lp0/c;->v:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0, v1}, Lp0/d;->G(Z)V

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->h()V

    goto/16 :goto_2

    :cond_3
    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    iget-boolean v2, p0, Lp0/c;->v:Z

    invoke-interface {v0, v2}, Lp0/d;->G(Z)V

    goto/16 :goto_2

    :cond_4
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Unable to obtain android.graphics.Path"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    iget-boolean v2, p0, Lp0/c;->v:Z

    invoke-interface {v0, v2}, Lp0/d;->G(Z)V

    sget-object v0, Ll0/m;->b:Ll0/m$a;

    invoke-virtual {v0}, Ll0/m$a;->b()J

    invoke-direct {p0}, Lp0/c;->A()Landroid/graphics/Outline;

    move-result-object v0

    iget-wide v2, p0, Lp0/c;->t:J

    invoke-static {v2, v3}, LY0/s;->d(J)J

    move-result-wide v2

    iget-wide v4, p0, Lp0/c;->h:J

    iget-wide v6, p0, Lp0/c;->i:J

    const-wide v8, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v8, v6, v8

    if-nez v8, :cond_6

    move-wide v8, v2

    goto :goto_1

    :cond_6
    move-wide v8, v6

    :goto_1
    invoke-static {v4, v5}, Ll0/g;->m(J)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-static {v4, v5}, Ll0/g;->n(J)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v6

    invoke-static {v4, v5}, Ll0/g;->m(J)F

    move-result v2

    invoke-static {v8, v9}, Ll0/m;->i(J)F

    move-result v7

    add-float/2addr v2, v7

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v7

    invoke-static {v4, v5}, Ll0/g;->n(J)F

    move-result v2

    invoke-static {v8, v9}, Ll0/m;->g(J)F

    move-result v4

    add-float/2addr v2, v4

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v10

    iget v11, p0, Lp0/c;->j:F

    move-object v2, v0

    move v4, v6

    move v5, v7

    move v6, v10

    move v7, v11

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    invoke-virtual {p0}, Lp0/c;->i()F

    move-result v2

    invoke-virtual {v0, v2}, Landroid/graphics/Outline;->setAlpha(F)V

    iget-object v2, p0, Lp0/c;->a:Lp0/d;

    invoke-static {v8, v9}, LY0/s;->c(J)J

    move-result-wide v3

    invoke-interface {v2, v0, v3, v4}, Lp0/d;->v(Landroid/graphics/Outline;J)V

    :cond_7
    :goto_2
    iput-boolean v1, p0, Lp0/c;->g:Z

    return-void
.end method

.method private final f()V
    .locals 1

    iget-boolean v0, p0, Lp0/c;->r:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lp0/c;->p:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lp0/c;->g()V

    :cond_0
    return-void
.end method

.method private final f0(Landroid/graphics/Canvas;)V
    .locals 9

    iget-wide v0, p0, Lp0/c;->s:J

    invoke-static {v0, v1}, LY0/n;->h(J)I

    move-result v0

    int-to-float v0, v0

    iget-wide v1, p0, Lp0/c;->s:J

    invoke-static {v1, v2}, LY0/n;->i(J)I

    move-result v1

    int-to-float v7, v1

    iget-wide v1, p0, Lp0/c;->s:J

    invoke-static {v1, v2}, LY0/n;->h(J)I

    move-result v1

    int-to-float v1, v1

    iget-wide v2, p0, Lp0/c;->t:J

    invoke-static {v2, v3}, LY0/r;->g(J)I

    move-result v2

    int-to-float v2, v2

    add-float v4, v1, v2

    iget-wide v1, p0, Lp0/c;->s:J

    invoke-static {v1, v2}, LY0/n;->i(J)I

    move-result v1

    int-to-float v1, v1

    iget-wide v2, p0, Lp0/c;->t:J

    invoke-static {v2, v3}, LY0/r;->f(J)I

    move-result v2

    int-to-float v2, v2

    add-float v5, v1, v2

    invoke-virtual {p0}, Lp0/c;->i()F

    move-result v1

    invoke-virtual {p0}, Lp0/c;->l()Lm0/w0;

    move-result-object v2

    invoke-virtual {p0}, Lp0/c;->j()I

    move-result v3

    const/high16 v6, 0x3f800000    # 1.0f

    cmpg-float v6, v1, v6

    if-ltz v6, :cond_1

    sget-object v6, Lm0/d0;->a:Lm0/d0$a;

    invoke-virtual {v6}, Lm0/d0$a;->B()I

    move-result v6

    invoke-static {v3, v6}, Lm0/d0;->E(II)Z

    move-result v6

    if-eqz v6, :cond_1

    if-nez v2, :cond_1

    invoke-virtual {p0}, Lp0/c;->m()I

    move-result v6

    sget-object v8, Lp0/b;->a:Lp0/b$a;

    invoke-virtual {v8}, Lp0/b$a;->c()I

    move-result v8

    invoke-static {v6, v8}, Lp0/b;->e(II)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v6, p0, Lp0/c;->o:Lm0/S0;

    if-nez v6, :cond_2

    invoke-static {}, Lm0/S;->a()Lm0/S0;

    move-result-object v6

    iput-object v6, p0, Lp0/c;->o:Lm0/S0;

    :cond_2
    invoke-interface {v6, v1}, Lm0/S0;->a(F)V

    invoke-interface {v6, v3}, Lm0/S0;->v(I)V

    invoke-interface {v6, v2}, Lm0/S0;->D(Lm0/w0;)V

    invoke-interface {v6}, Lm0/S0;->x()Landroid/graphics/Paint;

    move-result-object v6

    move-object v1, p1

    move v2, v0

    move v3, v7

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;)I

    :goto_1
    invoke-virtual {p1, v0, v7}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->M()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    return-void
.end method

.method private final g0(Lm0/U0;)Landroid/graphics/Outline;
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    const/4 v2, 0x1

    if-gt v0, v1, :cond_2

    invoke-interface {p1}, Lm0/U0;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp0/c;->f:Landroid/graphics/Outline;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/graphics/Outline;->setEmpty()V

    :cond_1
    iput-boolean v2, p0, Lp0/c;->n:Z

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0, v2}, Lp0/d;->s(Z)V

    const/4 v0, 0x0

    goto :goto_2

    :cond_2
    :goto_0
    invoke-direct {p0}, Lp0/c;->A()Landroid/graphics/Outline;

    move-result-object v1

    const/16 v3, 0x1e

    if-lt v0, v3, :cond_3

    sget-object v0, Lp0/M;->a:Lp0/M;

    invoke-virtual {v0, v1, p1}, Lp0/M;->a(Landroid/graphics/Outline;Lm0/U0;)V

    goto :goto_1

    :cond_3
    instance-of v0, p1, Lm0/T;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lm0/T;

    invoke-virtual {v0}, Lm0/T;->v()Landroid/graphics/Path;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/graphics/Outline;->setConvexPath(Landroid/graphics/Path;)V

    :goto_1
    invoke-virtual {v1}, Landroid/graphics/Outline;->canClip()Z

    move-result v0

    xor-int/2addr v0, v2

    iput-boolean v0, p0, Lp0/c;->n:Z

    move-object v0, v1

    :goto_2
    iput-object p1, p0, Lp0/c;->l:Lm0/U0;

    return-object v0

    :cond_4
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Unable to obtain android.graphics.Path"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final E(LY0/d;LY0/t;JLmh/l;)V
    .locals 0

    invoke-direct {p0, p3, p4}, Lp0/c;->a0(J)V

    iput-object p1, p0, Lp0/c;->b:LY0/d;

    iput-object p2, p0, Lp0/c;->c:LY0/t;

    iput-object p5, p0, Lp0/c;->d:Lmh/l;

    iget-object p1, p0, Lp0/c;->a:Lp0/d;

    const/4 p2, 0x1

    invoke-interface {p1, p2}, Lp0/d;->s(Z)V

    invoke-direct {p0}, Lp0/c;->F()V

    return-void
.end method

.method public final H()V
    .locals 1

    iget-boolean v0, p0, Lp0/c;->r:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lp0/c;->r:Z

    invoke-direct {p0}, Lp0/c;->f()V

    :cond_0
    return-void
.end method

.method public final J(F)V
    .locals 1

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->b()F

    move-result v0

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0, p1}, Lp0/d;->a(F)V

    :goto_0
    return-void
.end method

.method public final K(J)V
    .locals 2

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->A()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Lm0/v0;->m(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0, p1, p2}, Lp0/d;->D(J)V

    :cond_0
    return-void
.end method

.method public final L(F)V
    .locals 1

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->E()F

    move-result v0

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0, p1}, Lp0/d;->l(F)V

    :goto_0
    return-void
.end method

.method public final M(Z)V
    .locals 1

    iget-boolean v0, p0, Lp0/c;->v:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lp0/c;->v:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lp0/c;->g:Z

    invoke-direct {p0}, Lp0/c;->e()V

    :cond_0
    return-void
.end method

.method public final N(I)V
    .locals 1

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->x()I

    move-result v0

    invoke-static {v0, p1}, Lp0/b;->e(II)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0, p1}, Lp0/d;->L(I)V

    :cond_0
    return-void
.end method

.method public final O(Lm0/U0;)V
    .locals 0

    invoke-direct {p0}, Lp0/c;->I()V

    iput-object p1, p0, Lp0/c;->l:Lm0/U0;

    invoke-direct {p0}, Lp0/c;->e()V

    return-void
.end method

.method public final P(J)V
    .locals 2

    iget-wide v0, p0, Lp0/c;->u:J

    invoke-static {v0, v1, p1, p2}, Ll0/g;->j(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iput-wide p1, p0, Lp0/c;->u:J

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0, p1, p2}, Lp0/d;->z(J)V

    :cond_0
    return-void
.end method

.method public final R(JJ)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    invoke-virtual/range {v0 .. v5}, Lp0/c;->W(JJF)V

    return-void
.end method

.method public final S(Lm0/d1;)V
    .locals 1

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->t()Lm0/d1;

    const/4 v0, 0x0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0, p1}, Lp0/d;->k(Lm0/d1;)V

    :cond_0
    return-void
.end method

.method public final T(F)V
    .locals 1

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->H()F

    move-result v0

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0, p1}, Lp0/d;->m(F)V

    :goto_0
    return-void
.end method

.method public final U(F)V
    .locals 1

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->u()F

    move-result v0

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0, p1}, Lp0/d;->d(F)V

    :goto_0
    return-void
.end method

.method public final V(F)V
    .locals 1

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->w()F

    move-result v0

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0, p1}, Lp0/d;->e(F)V

    :goto_0
    return-void
.end method

.method public final W(JJF)V
    .locals 2

    iget-wide v0, p0, Lp0/c;->h:J

    invoke-static {v0, v1, p1, p2}, Ll0/g;->j(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lp0/c;->i:J

    invoke-static {v0, v1, p3, p4}, Ll0/m;->f(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lp0/c;->j:F

    cmpg-float v0, v0, p5

    if-nez v0, :cond_0

    iget-object v0, p0, Lp0/c;->l:Lm0/U0;

    if-eqz v0, :cond_1

    :cond_0
    invoke-direct {p0}, Lp0/c;->I()V

    iput-wide p1, p0, Lp0/c;->h:J

    iput-wide p3, p0, Lp0/c;->i:J

    iput p5, p0, Lp0/c;->j:F

    invoke-direct {p0}, Lp0/c;->e()V

    :cond_1
    return-void
.end method

.method public final X(F)V
    .locals 1

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->n()F

    move-result v0

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0, p1}, Lp0/d;->i(F)V

    :goto_0
    return-void
.end method

.method public final Y(F)V
    .locals 1

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->K()F

    move-result v0

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0, p1}, Lp0/d;->g(F)V

    :goto_0
    return-void
.end method

.method public final Z(F)V
    .locals 1

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->N()F

    move-result v0

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0, p1}, Lp0/d;->o(F)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lp0/c;->g:Z

    invoke-direct {p0}, Lp0/c;->e()V

    :goto_0
    return-void
.end method

.method public final b0(J)V
    .locals 2

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->B()J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Lm0/v0;->m(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0, p1, p2}, Lp0/d;->I(J)V

    :cond_0
    return-void
.end method

.method public final c0(J)V
    .locals 2

    iget-wide v0, p0, Lp0/c;->s:J

    invoke-static {v0, v1, p1, p2}, LY0/n;->g(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iput-wide p1, p0, Lp0/c;->s:J

    iget-wide v0, p0, Lp0/c;->t:J

    invoke-direct {p0, p1, p2, v0, v1}, Lp0/c;->Q(JJ)V

    :cond_0
    return-void
.end method

.method public final d0(F)V
    .locals 1

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->F()F

    move-result v0

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0, p1}, Lp0/d;->j(F)V

    :goto_0
    return-void
.end method

.method public final e0(F)V
    .locals 1

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->C()F

    move-result v0

    cmpg-float v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0, p1}, Lp0/d;->f(F)V

    :goto_0
    return-void
.end method

.method public final g()V
    .locals 15

    iget-object v0, p0, Lp0/c;->q:Lp0/a;

    invoke-static {v0}, Lp0/a;->b(Lp0/a;)Lp0/c;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-direct {v1}, Lp0/c;->D()V

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lp0/a;->e(Lp0/a;Lp0/c;)V

    :cond_0
    invoke-static {v0}, Lp0/a;->a(Lp0/a;)Lo/I;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v1, v0, Lo/T;->b:[Ljava/lang/Object;

    iget-object v2, v0, Lo/T;->a:[J

    array-length v3, v2

    add-int/lit8 v3, v3, -0x2

    if-ltz v3, :cond_4

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    aget-wide v6, v2, v5

    not-long v8, v6

    const/4 v10, 0x7

    shl-long/2addr v8, v10

    and-long/2addr v8, v6

    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v8, v10

    cmp-long v8, v8, v10

    if-eqz v8, :cond_3

    sub-int v8, v5, v3

    not-int v8, v8

    ushr-int/lit8 v8, v8, 0x1f

    const/16 v9, 0x8

    rsub-int/lit8 v8, v8, 0x8

    move v10, v4

    :goto_1
    if-ge v10, v8, :cond_2

    const-wide/16 v11, 0xff

    and-long/2addr v11, v6

    const-wide/16 v13, 0x80

    cmp-long v11, v11, v13

    if-gez v11, :cond_1

    shl-int/lit8 v11, v5, 0x3

    add-int/2addr v11, v10

    aget-object v11, v1, v11

    check-cast v11, Lp0/c;

    invoke-direct {v11}, Lp0/c;->D()V

    :cond_1
    shr-long/2addr v6, v9

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_2
    if-ne v8, v9, :cond_4

    :cond_3
    if-eq v5, v3, :cond_4

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, Lo/I;->m()V

    :cond_5
    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->h()V

    return-void
.end method

.method public final h(Lm0/n0;Lp0/c;)V
    .locals 9

    iget-boolean v0, p0, Lp0/c;->r:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lp0/c;->e()V

    invoke-direct {p0}, Lp0/c;->G()V

    invoke-virtual {p0}, Lp0/c;->u()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    if-eqz v0, :cond_2

    invoke-interface {p1}, Lm0/n0;->y()V

    :cond_2
    invoke-static {p1}, Lm0/H;->d(Lm0/n0;)Landroid/graphics/Canvas;

    move-result-object v3

    invoke-virtual {v3}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    move-result v4

    if-nez v4, :cond_3

    invoke-virtual {v3}, Landroid/graphics/Canvas;->save()I

    invoke-direct {p0, v3}, Lp0/c;->f0(Landroid/graphics/Canvas;)V

    :cond_3
    if-nez v4, :cond_4

    iget-boolean v5, p0, Lp0/c;->v:Z

    if-eqz v5, :cond_4

    goto :goto_1

    :cond_4
    move v1, v2

    :goto_1
    if-eqz v1, :cond_8

    invoke-interface {p1}, Lm0/n0;->j()V

    invoke-virtual {p0}, Lp0/c;->n()Lm0/Q0;

    move-result-object v5

    instance-of v6, v5, Lm0/Q0$b;

    const/4 v7, 0x2

    const/4 v8, 0x0

    if-eqz v6, :cond_5

    invoke-virtual {v5}, Lm0/Q0;->a()Ll0/i;

    move-result-object v5

    invoke-static {p1, v5, v2, v7, v8}, Lm0/n0;->o(Lm0/n0;Ll0/i;IILjava/lang/Object;)V

    goto :goto_3

    :cond_5
    instance-of v6, v5, Lm0/Q0$c;

    if-eqz v6, :cond_7

    iget-object v6, p0, Lp0/c;->m:Lm0/U0;

    if-eqz v6, :cond_6

    invoke-interface {v6}, Lm0/U0;->q()V

    goto :goto_2

    :cond_6
    invoke-static {}, Lm0/Y;->a()Lm0/U0;

    move-result-object v6

    iput-object v6, p0, Lp0/c;->m:Lm0/U0;

    :goto_2
    check-cast v5, Lm0/Q0$c;

    invoke-virtual {v5}, Lm0/Q0$c;->b()Ll0/k;

    move-result-object v5

    invoke-static {v6, v5, v8, v7, v8}, Lm0/U0;->t(Lm0/U0;Ll0/k;Lm0/U0$b;ILjava/lang/Object;)V

    invoke-static {p1, v6, v2, v7, v8}, Lm0/n0;->t(Lm0/n0;Lm0/U0;IILjava/lang/Object;)V

    goto :goto_3

    :cond_7
    instance-of v6, v5, Lm0/Q0$a;

    if-eqz v6, :cond_8

    check-cast v5, Lm0/Q0$a;

    invoke-virtual {v5}, Lm0/Q0$a;->b()Lm0/U0;

    move-result-object v5

    invoke-static {p1, v5, v2, v7, v8}, Lm0/n0;->t(Lm0/n0;Lm0/U0;IILjava/lang/Object;)V

    :cond_8
    :goto_3
    if-eqz p2, :cond_9

    invoke-direct {p2, p0}, Lp0/c;->d(Lp0/c;)V

    :cond_9
    iget-object p2, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {p2, p1}, Lp0/d;->c(Lm0/n0;)V

    if-eqz v1, :cond_a

    invoke-interface {p1}, Lm0/n0;->r()V

    :cond_a
    if-eqz v0, :cond_b

    invoke-interface {p1}, Lm0/n0;->k()V

    :cond_b
    if-nez v4, :cond_c

    invoke-virtual {v3}, Landroid/graphics/Canvas;->restore()V

    :cond_c
    return-void
.end method

.method public final i()F
    .locals 1

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->b()F

    move-result v0

    return v0
.end method

.method public final j()I
    .locals 1

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->r()I

    move-result v0

    return v0
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, Lp0/c;->v:Z

    return v0
.end method

.method public final l()Lm0/w0;
    .locals 1

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->p()Lm0/w0;

    move-result-object v0

    return-object v0
.end method

.method public final m()I
    .locals 1

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->x()I

    move-result v0

    return v0
.end method

.method public final n()Lm0/Q0;
    .locals 10

    iget-object v0, p0, Lp0/c;->k:Lm0/Q0;

    iget-object v1, p0, Lp0/c;->l:Lm0/U0;

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    if-eqz v1, :cond_1

    new-instance v0, Lm0/Q0$a;

    invoke-direct {v0, v1}, Lm0/Q0$a;-><init>(Lm0/U0;)V

    iput-object v0, p0, Lp0/c;->k:Lm0/Q0;

    goto :goto_2

    :cond_1
    iget-wide v0, p0, Lp0/c;->t:J

    invoke-static {v0, v1}, LY0/s;->d(J)J

    move-result-wide v0

    iget-wide v2, p0, Lp0/c;->h:J

    iget-wide v4, p0, Lp0/c;->i:J

    const-wide v6, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v6, v4, v6

    if-nez v6, :cond_2

    goto :goto_0

    :cond_2
    move-wide v0, v4

    :goto_0
    invoke-static {v2, v3}, Ll0/g;->m(J)F

    move-result v4

    invoke-static {v2, v3}, Ll0/g;->n(J)F

    move-result v5

    invoke-static {v0, v1}, Ll0/m;->i(J)F

    move-result v2

    add-float v6, v4, v2

    invoke-static {v0, v1}, Ll0/m;->g(J)F

    move-result v0

    add-float v7, v5, v0

    iget v0, p0, Lp0/c;->j:F

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-lez v2, :cond_3

    new-instance v2, Lm0/Q0$c;

    const/4 v3, 0x2

    const/4 v8, 0x0

    invoke-static {v0, v1, v3, v8}, Ll0/b;->b(FFILjava/lang/Object;)J

    move-result-wide v8

    invoke-static/range {v4 .. v9}, Ll0/l;->d(FFFFJ)Ll0/k;

    move-result-object v0

    invoke-direct {v2, v0}, Lm0/Q0$c;-><init>(Ll0/k;)V

    move-object v0, v2

    goto :goto_1

    :cond_3
    new-instance v0, Lm0/Q0$b;

    new-instance v1, Ll0/i;

    invoke-direct {v1, v4, v5, v6, v7}, Ll0/i;-><init>(FFFF)V

    invoke-direct {v0, v1}, Lm0/Q0$b;-><init>(Ll0/i;)V

    :goto_1
    iput-object v0, p0, Lp0/c;->k:Lm0/Q0;

    :goto_2
    return-object v0
.end method

.method public final o()J
    .locals 2

    iget-wide v0, p0, Lp0/c;->u:J

    return-wide v0
.end method

.method public final p()F
    .locals 1

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->H()F

    move-result v0

    return v0
.end method

.method public final q()F
    .locals 1

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->u()F

    move-result v0

    return v0
.end method

.method public final r()F
    .locals 1

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->w()F

    move-result v0

    return v0
.end method

.method public final s()F
    .locals 1

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->n()F

    move-result v0

    return v0
.end method

.method public final t()F
    .locals 1

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->K()F

    move-result v0

    return v0
.end method

.method public final u()F
    .locals 1

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->N()F

    move-result v0

    return v0
.end method

.method public final v()J
    .locals 2

    iget-wide v0, p0, Lp0/c;->t:J

    return-wide v0
.end method

.method public final w()J
    .locals 2

    iget-wide v0, p0, Lp0/c;->s:J

    return-wide v0
.end method

.method public final x()F
    .locals 1

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->F()F

    move-result v0

    return v0
.end method

.method public final y()F
    .locals 1

    iget-object v0, p0, Lp0/c;->a:Lp0/d;

    invoke-interface {v0}, Lp0/d;->C()F

    move-result v0

    return v0
.end method

.method public final z()Z
    .locals 1

    iget-boolean v0, p0, Lp0/c;->r:Z

    return v0
.end method
