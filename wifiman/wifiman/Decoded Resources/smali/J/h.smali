.class public final LJ/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ/h$a;
    }
.end annotation


# static fields
.field public static final i:LJ/h$a;

.field public static final j:I


# instance fields
.field private final a:LI/o1;

.field private final b:LL0/M;

.field private final c:Z

.field private final d:F

.field private final e:LJ/i;

.field private final f:LH/h;

.field private g:J

.field private final h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LJ/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LJ/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LJ/h;->i:LJ/h$a;

    const/16 v0, 0x8

    sput v0, LJ/h;->j:I

    return-void
.end method

.method public constructor <init>(LI/o1;LL0/M;ZFLJ/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ/h;->a:LI/o1;

    iput-object p2, p0, LJ/h;->b:LL0/M;

    iput-boolean p3, p0, LJ/h;->c:Z

    iput p4, p0, LJ/h;->d:F

    iput-object p5, p0, LJ/h;->e:LJ/i;

    sget-object p2, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {p2}, Landroidx/compose/runtime/snapshots/g$a;->d()Landroidx/compose/runtime/snapshots/g;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Landroidx/compose/runtime/snapshots/g;->h()Lmh/l;

    move-result-object p4

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    :goto_0
    invoke-virtual {p2, p3}, Landroidx/compose/runtime/snapshots/g$a;->f(Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/g;

    move-result-object p5

    :try_start_0
    invoke-virtual {p1}, LI/o1;->l()LH/h;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p2, p3, p5, p4}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    iput-object p1, p0, LJ/h;->f:LH/h;

    invoke-virtual {p1}, LH/h;->f()J

    move-result-wide p2

    iput-wide p2, p0, LJ/h;->g:J

    invoke-virtual {p1}, LH/h;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LJ/h;->h:Ljava/lang/String;

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p2, p3, p5, p4}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    throw p1
.end method

.method private final A(I)I
    .locals 3

    iget-object v0, p0, LJ/h;->f:LH/h;

    invoke-virtual {v0}, LH/h;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->i(J)I

    move-result v0

    iget-object v1, p0, LJ/h;->b:LL0/M;

    if-eqz v1, :cond_2

    iget v1, p0, LJ/h;->d:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, LJ/h;->b:LL0/M;

    invoke-virtual {v1, v0}, LL0/M;->e(I)Ll0/i;

    move-result-object v0

    iget v1, p0, LJ/h;->d:F

    int-to-float p1, p1

    mul-float/2addr v1, p1

    const/4 p1, 0x0

    invoke-virtual {v0, p1, v1}, Ll0/i;->w(FF)Ll0/i;

    move-result-object p1

    iget-object v0, p0, LJ/h;->b:LL0/M;

    invoke-virtual {p1}, Ll0/i;->n()F

    move-result v1

    invoke-virtual {v0, v1}, LL0/M;->r(F)I

    move-result v0

    iget-object v1, p0, LJ/h;->b:LL0/M;

    invoke-virtual {v1, v0}, LL0/M;->m(I)F

    move-result v0

    invoke-virtual {p1}, Ll0/i;->n()F

    move-result v1

    sub-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-virtual {p1}, Ll0/i;->e()F

    move-result v2

    sub-float/2addr v2, v0

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpl-float v0, v1, v0

    if-lez v0, :cond_1

    iget-object v0, p0, LJ/h;->b:LL0/M;

    invoke-virtual {p1}, Ll0/i;->p()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LL0/M;->x(J)I

    move-result p1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LJ/h;->b:LL0/M;

    invoke-virtual {p1}, Ll0/i;->g()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LL0/M;->x(J)I

    move-result p1

    :goto_0
    return p1

    :cond_2
    :goto_1
    return v0
.end method

.method private final F()LJ/h;
    .locals 4

    invoke-static {p0}, LJ/h;->c(LJ/h;)LJ/i;

    move-result-object v0

    invoke-virtual {v0}, LJ/i;->b()V

    invoke-static {p0}, LJ/h;->b(LJ/h;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-wide v0, p0, LJ/h;->g:J

    invoke-static {v0, v1}, LL0/S;->i(J)I

    move-result v0

    iget-object v1, p0, LJ/h;->h:Ljava/lang/String;

    const/4 v2, 0x1

    iget-object v3, p0, LJ/h;->a:LI/o1;

    invoke-static {v1, v0, v2, v3}, LJ/m;->a(Ljava/lang/String;IZLI/o1;)I

    move-result v1

    if-eq v1, v0, :cond_0

    invoke-direct {p0, v1}, LJ/h;->X(I)V

    :cond_0
    return-object p0
.end method

.method private final H()LJ/h;
    .locals 1

    invoke-static {p0}, LJ/h;->c(LJ/h;)LJ/i;

    move-result-object v0

    invoke-virtual {v0}, LJ/i;->b()V

    invoke-static {p0}, LJ/h;->b(LJ/h;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, LJ/h;->q()I

    move-result v0

    invoke-direct {p0, v0}, LJ/h;->X(I)V

    :cond_0
    return-object p0
.end method

.method private final I()LJ/h;
    .locals 4

    invoke-static {p0}, LJ/h;->c(LJ/h;)LJ/i;

    move-result-object v0

    invoke-virtual {v0}, LJ/i;->b()V

    invoke-static {p0}, LJ/h;->b(LJ/h;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-wide v0, p0, LJ/h;->g:J

    invoke-static {v0, v1}, LL0/S;->i(J)I

    move-result v0

    iget-object v1, p0, LJ/h;->h:Ljava/lang/String;

    const/4 v2, 0x0

    iget-object v3, p0, LJ/h;->a:LI/o1;

    invoke-static {v1, v0, v2, v3}, LJ/m;->a(Ljava/lang/String;IZLI/o1;)I

    move-result v1

    if-eq v1, v0, :cond_0

    invoke-direct {p0, v1}, LJ/h;->X(I)V

    :cond_0
    return-object p0
.end method

.method private final K()LJ/h;
    .locals 1

    invoke-static {p0}, LJ/h;->c(LJ/h;)LJ/i;

    move-result-object v0

    invoke-virtual {v0}, LJ/i;->b()V

    invoke-static {p0}, LJ/h;->b(LJ/h;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, LJ/h;->w()I

    move-result v0

    invoke-direct {p0, v0}, LJ/h;->X(I)V

    :cond_0
    return-object p0
.end method

.method private final X(I)V
    .locals 2

    invoke-static {p1, p1}, LL0/T;->b(II)J

    move-result-wide v0

    iput-wide v0, p0, LJ/h;->g:J

    return-void
.end method

.method public static final synthetic a(LJ/h;)LI/o1;
    .locals 0

    iget-object p0, p0, LJ/h;->a:LI/o1;

    return-object p0
.end method

.method public static final synthetic b(LJ/h;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LJ/h;->h:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic c(LJ/h;)LJ/i;
    .locals 0

    iget-object p0, p0, LJ/h;->e:LJ/i;

    return-object p0
.end method

.method public static final synthetic d(LJ/h;)Z
    .locals 0

    iget-boolean p0, p0, LJ/h;->c:Z

    return p0
.end method

.method private final e(I)I
    .locals 1

    iget-object v0, p0, LJ/h;->h:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0}, Lsh/m;->g(II)I

    move-result p1

    return p1
.end method

.method private final k(LL0/M;I)I
    .locals 1

    invoke-virtual {p1, p2}, LL0/M;->q(I)I

    move-result p2

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, LL0/M;->o(IZ)I

    move-result p1

    return p1
.end method

.method static synthetic l(LJ/h;LL0/M;IILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    iget-wide p2, p0, LJ/h;->g:J

    invoke-static {p2, p3}, LL0/S;->k(J)I

    move-result p2

    :cond_0
    invoke-direct {p0, p1, p2}, LJ/h;->k(LL0/M;I)I

    move-result p0

    return p0
.end method

.method private final n(LL0/M;I)I
    .locals 0

    invoke-virtual {p1, p2}, LL0/M;->q(I)I

    move-result p2

    invoke-virtual {p1, p2}, LL0/M;->u(I)I

    move-result p1

    return p1
.end method

.method static synthetic o(LJ/h;LL0/M;IILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    iget-wide p2, p0, LJ/h;->g:J

    invoke-static {p2, p3}, LL0/S;->l(J)I

    move-result p2

    :cond_0
    invoke-direct {p0, p1, p2}, LJ/h;->n(LL0/M;I)I

    move-result p0

    return p0
.end method

.method private final r(LL0/M;I)I
    .locals 3

    :goto_0
    iget-object v0, p0, LJ/h;->f:LH/h;

    invoke-virtual {v0}, LH/h;->length()I

    move-result v0

    if-lt p2, v0, :cond_0

    iget-object p1, p0, LJ/h;->f:LH/h;

    invoke-virtual {p1}, LH/h;->length()I

    move-result p1

    return p1

    :cond_0
    invoke-direct {p0, p2}, LJ/h;->e(I)I

    move-result v0

    invoke-virtual {p1, v0}, LL0/M;->C(I)J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->i(J)I

    move-result v2

    if-gt v2, p2, :cond_1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v0, v1}, LL0/S;->i(J)I

    move-result p1

    return p1
.end method

.method static synthetic s(LJ/h;LL0/M;IILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    iget-wide p2, p0, LJ/h;->g:J

    invoke-static {p2, p3}, LL0/S;->i(J)I

    move-result p2

    :cond_0
    invoke-direct {p0, p1, p2}, LJ/h;->r(LL0/M;I)I

    move-result p0

    return p0
.end method

.method private final u(LL0/M;I)I
    .locals 3

    :goto_0
    if-gtz p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-direct {p0, p2}, LJ/h;->e(I)I

    move-result v0

    invoke-virtual {p1, v0}, LL0/M;->C(I)J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->n(J)I

    move-result v2

    if-lt v2, p2, :cond_1

    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_1
    invoke-static {v0, v1}, LL0/S;->n(J)I

    move-result p1

    return p1
.end method

.method static synthetic v(LJ/h;LL0/M;IILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    iget-wide p2, p0, LJ/h;->g:J

    invoke-static {p2, p3}, LL0/S;->i(J)I

    move-result p2

    :cond_0
    invoke-direct {p0, p1, p2}, LJ/h;->u(LL0/M;I)I

    move-result p0

    return p0
.end method

.method private final y()Z
    .locals 4

    iget-object v0, p0, LJ/h;->b:LL0/M;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    iget-wide v2, p0, LJ/h;->g:J

    invoke-static {v2, v3}, LL0/S;->i(J)I

    move-result v2

    invoke-virtual {v0, v2}, LL0/M;->y(I)LW0/i;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v2, LW0/i;->Ltr:LW0/i;

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    return v1
.end method

.method private final z(LL0/M;I)I
    .locals 4

    iget-wide v0, p0, LJ/h;->g:J

    invoke-static {v0, v1}, LL0/S;->i(J)I

    move-result v0

    iget-object v1, p0, LJ/h;->e:LJ/i;

    invoke-virtual {v1}, LJ/i;->a()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, LJ/h;->e:LJ/i;

    invoke-virtual {p1, v0}, LL0/M;->e(I)Ll0/i;

    move-result-object v2

    invoke-virtual {v2}, Ll0/i;->k()F

    move-result v2

    invoke-virtual {v1, v2}, LJ/i;->c(F)V

    :cond_0
    invoke-virtual {p1, v0}, LL0/M;->q(I)I

    move-result v0

    add-int/2addr v0, p2

    if-gez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-virtual {p1}, LL0/M;->n()I

    move-result p2

    if-lt v0, p2, :cond_2

    iget-object p1, p0, LJ/h;->h:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    return p1

    :cond_2
    invoke-virtual {p1, v0}, LL0/M;->m(I)F

    move-result p2

    const/4 v1, 0x1

    int-to-float v2, v1

    sub-float/2addr p2, v2

    iget-object v2, p0, LJ/h;->e:LJ/i;

    invoke-virtual {v2}, LJ/i;->a()F

    move-result v2

    invoke-direct {p0}, LJ/h;->y()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {p1, v0}, LL0/M;->t(I)F

    move-result v3

    cmpl-float v3, v2, v3

    if-gez v3, :cond_4

    :cond_3
    invoke-direct {p0}, LJ/h;->y()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {p1, v0}, LL0/M;->s(I)F

    move-result v3

    cmpg-float v3, v2, v3

    if-gtz v3, :cond_5

    :cond_4
    invoke-virtual {p1, v0, v1}, LL0/M;->o(IZ)I

    move-result p1

    return p1

    :cond_5
    invoke-static {v2, p2}, Ll0/h;->a(FF)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, LL0/M;->x(J)I

    move-result p1

    return p1
.end method


# virtual methods
.method public final B()LJ/h;
    .locals 2

    iget-object v0, p0, LJ/h;->b:LL0/M;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {p0}, LJ/h;->b(LJ/h;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, LJ/h;->b:LL0/M;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, LJ/h;->z(LL0/M;I)I

    move-result v0

    invoke-direct {p0, v0}, LJ/h;->X(I)V

    :cond_1
    return-object p0
.end method

.method public final C()LJ/h;
    .locals 1

    invoke-static {p0}, LJ/h;->b(LJ/h;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LJ/h;->A(I)I

    move-result v0

    invoke-direct {p0, v0}, LJ/h;->X(I)V

    :cond_0
    return-object p0
.end method

.method public final D()LJ/h;
    .locals 1

    invoke-static {p0}, LJ/h;->c(LJ/h;)LJ/i;

    move-result-object v0

    invoke-virtual {v0}, LJ/i;->b()V

    invoke-static {p0}, LJ/h;->b(LJ/h;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-direct {p0}, LJ/h;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LJ/h;->I()LJ/h;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LJ/h;->F()LJ/h;

    :cond_1
    :goto_0
    return-object p0
.end method

.method public final E()LJ/h;
    .locals 1

    invoke-static {p0}, LJ/h;->c(LJ/h;)LJ/i;

    move-result-object v0

    invoke-virtual {v0}, LJ/i;->b()V

    invoke-static {p0}, LJ/h;->b(LJ/h;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-direct {p0}, LJ/h;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LJ/h;->K()LJ/h;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LJ/h;->H()LJ/h;

    :cond_1
    :goto_0
    return-object p0
.end method

.method public final G()LJ/h;
    .locals 3

    invoke-static {p0}, LJ/h;->c(LJ/h;)LJ/i;

    move-result-object v0

    invoke-virtual {v0}, LJ/i;->b()V

    invoke-static {p0}, LJ/h;->b(LJ/h;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, LJ/h;->h:Ljava/lang/String;

    iget-wide v1, p0, LJ/h;->g:J

    invoke-static {v1, v2}, LL0/S;->k(J)I

    move-result v1

    invoke-static {v0, v1}, LF/M;->a(Ljava/lang/CharSequence;I)I

    move-result v0

    iget-wide v1, p0, LJ/h;->g:J

    invoke-static {v1, v2}, LL0/S;->k(J)I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v1, p0, LJ/h;->h:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-eq v0, v1, :cond_0

    iget-object v1, p0, LJ/h;->h:Ljava/lang/String;

    add-int/lit8 v0, v0, 0x1

    invoke-static {v1, v0}, LF/M;->a(Ljava/lang/CharSequence;I)I

    move-result v0

    :cond_0
    invoke-direct {p0, v0}, LJ/h;->X(I)V

    :cond_1
    return-object p0
.end method

.method public final J()LJ/h;
    .locals 3

    invoke-static {p0}, LJ/h;->c(LJ/h;)LJ/i;

    move-result-object v0

    invoke-virtual {v0}, LJ/i;->b()V

    invoke-static {p0}, LJ/h;->b(LJ/h;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, LJ/h;->h:Ljava/lang/String;

    iget-wide v1, p0, LJ/h;->g:J

    invoke-static {v1, v2}, LL0/S;->l(J)I

    move-result v1

    invoke-static {v0, v1}, LF/M;->b(Ljava/lang/CharSequence;I)I

    move-result v0

    iget-wide v1, p0, LJ/h;->g:J

    invoke-static {v1, v2}, LL0/S;->l(J)I

    move-result v1

    if-ne v0, v1, :cond_0

    if-eqz v0, :cond_0

    iget-object v1, p0, LJ/h;->h:Ljava/lang/String;

    add-int/lit8 v0, v0, -0x1

    invoke-static {v1, v0}, LF/M;->b(Ljava/lang/CharSequence;I)I

    move-result v0

    :cond_0
    invoke-direct {p0, v0}, LJ/h;->X(I)V

    :cond_1
    return-object p0
.end method

.method public final L()LJ/h;
    .locals 1

    invoke-static {p0}, LJ/h;->c(LJ/h;)LJ/i;

    move-result-object v0

    invoke-virtual {v0}, LJ/i;->b()V

    invoke-static {p0}, LJ/h;->b(LJ/h;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-direct {p0}, LJ/h;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LJ/h;->F()LJ/h;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LJ/h;->I()LJ/h;

    :cond_1
    :goto_0
    return-object p0
.end method

.method public final M()LJ/h;
    .locals 1

    invoke-static {p0}, LJ/h;->c(LJ/h;)LJ/i;

    move-result-object v0

    invoke-virtual {v0}, LJ/i;->b()V

    invoke-static {p0}, LJ/h;->b(LJ/h;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-direct {p0}, LJ/h;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LJ/h;->H()LJ/h;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LJ/h;->K()LJ/h;

    :cond_1
    :goto_0
    return-object p0
.end method

.method public final N()LJ/h;
    .locals 1

    invoke-static {p0}, LJ/h;->c(LJ/h;)LJ/i;

    move-result-object v0

    invoke-virtual {v0}, LJ/i;->b()V

    invoke-static {p0}, LJ/h;->b(LJ/h;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, LJ/h;->h:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-direct {p0, v0}, LJ/h;->X(I)V

    :cond_0
    return-object p0
.end method

.method public final O()LJ/h;
    .locals 1

    invoke-static {p0}, LJ/h;->c(LJ/h;)LJ/i;

    move-result-object v0

    invoke-virtual {v0}, LJ/i;->b()V

    invoke-static {p0}, LJ/h;->b(LJ/h;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LJ/h;->X(I)V

    :cond_0
    return-object p0
.end method

.method public final P()LJ/h;
    .locals 1

    invoke-static {p0}, LJ/h;->c(LJ/h;)LJ/i;

    move-result-object v0

    invoke-virtual {v0}, LJ/i;->b()V

    invoke-static {p0}, LJ/h;->b(LJ/h;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, LJ/h;->j()I

    move-result v0

    invoke-direct {p0, v0}, LJ/h;->X(I)V

    :cond_0
    return-object p0
.end method

.method public final Q()LJ/h;
    .locals 1

    invoke-static {p0}, LJ/h;->c(LJ/h;)LJ/i;

    move-result-object v0

    invoke-virtual {v0}, LJ/i;->b()V

    invoke-static {p0}, LJ/h;->b(LJ/h;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-direct {p0}, LJ/h;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LJ/h;->S()LJ/h;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LJ/h;->P()LJ/h;

    :cond_1
    :goto_0
    return-object p0
.end method

.method public final R()LJ/h;
    .locals 1

    invoke-static {p0}, LJ/h;->c(LJ/h;)LJ/i;

    move-result-object v0

    invoke-virtual {v0}, LJ/i;->b()V

    invoke-static {p0}, LJ/h;->b(LJ/h;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-direct {p0}, LJ/h;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LJ/h;->P()LJ/h;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LJ/h;->S()LJ/h;

    :cond_1
    :goto_0
    return-object p0
.end method

.method public final S()LJ/h;
    .locals 1

    invoke-static {p0}, LJ/h;->c(LJ/h;)LJ/i;

    move-result-object v0

    invoke-virtual {v0}, LJ/i;->b()V

    invoke-static {p0}, LJ/h;->b(LJ/h;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, LJ/h;->m()I

    move-result v0

    invoke-direct {p0, v0}, LJ/h;->X(I)V

    :cond_0
    return-object p0
.end method

.method public final T()LJ/h;
    .locals 2

    iget-object v0, p0, LJ/h;->b:LL0/M;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {p0}, LJ/h;->b(LJ/h;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, LJ/h;->b:LL0/M;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1}, LJ/h;->z(LL0/M;I)I

    move-result v0

    invoke-direct {p0, v0}, LJ/h;->X(I)V

    :cond_1
    return-object p0
.end method

.method public final U()LJ/h;
    .locals 1

    invoke-static {p0}, LJ/h;->b(LJ/h;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, -0x1

    invoke-direct {p0, v0}, LJ/h;->A(I)I

    move-result v0

    invoke-direct {p0, v0}, LJ/h;->X(I)V

    :cond_0
    return-object p0
.end method

.method public final V()LJ/h;
    .locals 2

    invoke-static {p0}, LJ/h;->c(LJ/h;)LJ/i;

    move-result-object v0

    invoke-virtual {v0}, LJ/i;->b()V

    invoke-static {p0}, LJ/h;->b(LJ/h;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, LJ/h;->h:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, LL0/T;->b(II)J

    move-result-wide v0

    iput-wide v0, p0, LJ/h;->g:J

    :cond_0
    return-object p0
.end method

.method public final W()LJ/h;
    .locals 3

    invoke-static {p0}, LJ/h;->b(LJ/h;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, LJ/h;->f:LH/h;

    invoke-virtual {v0}, LH/h;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->n(J)I

    move-result v0

    iget-wide v1, p0, LJ/h;->g:J

    invoke-static {v1, v2}, LL0/S;->i(J)I

    move-result v1

    invoke-static {v0, v1}, LL0/T;->b(II)J

    move-result-wide v0

    iput-wide v0, p0, LJ/h;->g:J

    :cond_0
    return-object p0
.end method

.method public final f(Lmh/l;)LJ/h;
    .locals 2

    invoke-static {p0}, LJ/h;->c(LJ/h;)LJ/i;

    move-result-object v0

    invoke-virtual {v0}, LJ/i;->b()V

    invoke-static {p0}, LJ/h;->b(LJ/h;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_2

    iget-wide v0, p0, LJ/h;->g:J

    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LJ/h;->y()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-wide v0, p0, LJ/h;->g:J

    invoke-static {v0, v1}, LL0/S;->l(J)I

    move-result p1

    invoke-direct {p0, p1}, LJ/h;->X(I)V

    goto :goto_0

    :cond_1
    iget-wide v0, p0, LJ/h;->g:J

    invoke-static {v0, v1}, LL0/S;->k(J)I

    move-result p1

    invoke-direct {p0, p1}, LJ/h;->X(I)V

    :cond_2
    :goto_0
    return-object p0
.end method

.method public final g(Lmh/l;)LJ/h;
    .locals 2

    invoke-static {p0}, LJ/h;->c(LJ/h;)LJ/i;

    move-result-object v0

    invoke-virtual {v0}, LJ/i;->b()V

    invoke-static {p0}, LJ/h;->b(LJ/h;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_2

    iget-wide v0, p0, LJ/h;->g:J

    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LJ/h;->y()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-wide v0, p0, LJ/h;->g:J

    invoke-static {v0, v1}, LL0/S;->k(J)I

    move-result p1

    invoke-direct {p0, p1}, LJ/h;->X(I)V

    goto :goto_0

    :cond_1
    iget-wide v0, p0, LJ/h;->g:J

    invoke-static {v0, v1}, LL0/S;->l(J)I

    move-result p1

    invoke-direct {p0, p1}, LJ/h;->X(I)V

    :cond_2
    :goto_0
    return-object p0
.end method

.method public final h()LJ/h;
    .locals 2

    invoke-static {p0}, LJ/h;->c(LJ/h;)LJ/i;

    move-result-object v0

    invoke-virtual {v0}, LJ/i;->b()V

    invoke-static {p0}, LJ/h;->b(LJ/h;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-wide v0, p0, LJ/h;->g:J

    invoke-static {v0, v1}, LL0/S;->i(J)I

    move-result v0

    invoke-direct {p0, v0}, LJ/h;->X(I)V

    :cond_0
    return-object p0
.end method

.method public final i()LH/h;
    .locals 1

    iget-object v0, p0, LJ/h;->f:LH/h;

    return-object v0
.end method

.method public final j()I
    .locals 4

    iget-object v0, p0, LJ/h;->b:LL0/M;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p0, v0, v3, v1, v2}, LJ/h;->l(LJ/h;LL0/M;IILjava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LJ/h;->h:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    :goto_0
    return v0
.end method

.method public final m()I
    .locals 4

    iget-object v0, p0, LJ/h;->b:LL0/M;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p0, v0, v1, v2, v3}, LJ/h;->o(LJ/h;LL0/M;IILjava/lang/Object;)I

    move-result v1

    :cond_0
    return v1
.end method

.method public final p()I
    .locals 3

    iget-object v0, p0, LJ/h;->h:Ljava/lang/String;

    iget-wide v1, p0, LJ/h;->g:J

    invoke-static {v1, v2}, LL0/S;->i(J)I

    move-result v1

    invoke-static {v0, v1}, LF/N;->a(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public final q()I
    .locals 4

    iget-object v0, p0, LJ/h;->b:LL0/M;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p0, v0, v3, v1, v2}, LJ/h;->s(LJ/h;LL0/M;IILjava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LJ/h;->h:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    :goto_0
    return v0
.end method

.method public final t()I
    .locals 3

    iget-object v0, p0, LJ/h;->h:Ljava/lang/String;

    iget-wide v1, p0, LJ/h;->g:J

    invoke-static {v1, v2}, LL0/S;->i(J)I

    move-result v1

    invoke-static {v0, v1}, LF/N;->b(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public final w()I
    .locals 4

    iget-object v0, p0, LJ/h;->b:LL0/M;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p0, v0, v1, v2, v3}, LJ/h;->v(LJ/h;LL0/M;IILjava/lang/Object;)I

    move-result v1

    :cond_0
    return v1
.end method

.method public final x()J
    .locals 2

    iget-wide v0, p0, LJ/h;->g:J

    return-wide v0
.end method
