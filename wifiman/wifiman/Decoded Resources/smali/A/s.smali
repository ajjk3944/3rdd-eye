.class public final LA/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA/q;
.implements LC0/D;


# instance fields
.field private final a:LA/t;

.field private b:I

.field private c:Z

.field private d:F

.field private final e:F

.field private final f:Z

.field private final g:LIi/N;

.field private final h:LY0/d;

.field private final i:J

.field private final j:Ljava/util/List;

.field private final k:I

.field private final l:I

.field private final m:I

.field private final n:Z

.field private final o:Lw/q;

.field private final p:I

.field private final q:I

.field private final synthetic r:LC0/D;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(LA/t;IZFLC0/D;FZLIi/N;LY0/d;JLjava/util/List;IIIZLw/q;II)V
    .locals 3

    move-object v0, p0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 3
    iput-object v1, v0, LA/s;->a:LA/t;

    move v1, p2

    .line 4
    iput v1, v0, LA/s;->b:I

    move v1, p3

    .line 5
    iput-boolean v1, v0, LA/s;->c:Z

    move v1, p4

    .line 6
    iput v1, v0, LA/s;->d:F

    move v1, p6

    .line 7
    iput v1, v0, LA/s;->e:F

    move v1, p7

    .line 8
    iput-boolean v1, v0, LA/s;->f:Z

    move-object v1, p8

    .line 9
    iput-object v1, v0, LA/s;->g:LIi/N;

    move-object v1, p9

    .line 10
    iput-object v1, v0, LA/s;->h:LY0/d;

    move-wide v1, p10

    .line 11
    iput-wide v1, v0, LA/s;->i:J

    move-object v1, p12

    .line 12
    iput-object v1, v0, LA/s;->j:Ljava/util/List;

    move/from16 v1, p13

    .line 13
    iput v1, v0, LA/s;->k:I

    move/from16 v1, p14

    .line 14
    iput v1, v0, LA/s;->l:I

    move/from16 v1, p15

    .line 15
    iput v1, v0, LA/s;->m:I

    move/from16 v1, p16

    .line 16
    iput-boolean v1, v0, LA/s;->n:Z

    move-object/from16 v1, p17

    .line 17
    iput-object v1, v0, LA/s;->o:Lw/q;

    move/from16 v1, p18

    .line 18
    iput v1, v0, LA/s;->p:I

    move/from16 v1, p19

    .line 19
    iput v1, v0, LA/s;->q:I

    move-object v1, p5

    .line 20
    iput-object v1, v0, LA/s;->r:LC0/D;

    return-void
.end method

.method public synthetic constructor <init>(LA/t;IZFLC0/D;FZLIi/N;LY0/d;JLjava/util/List;IIIZLw/q;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p19}, LA/s;-><init>(LA/t;IZFLC0/D;FZLIi/N;LY0/d;JLjava/util/List;IIIZLw/q;II)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, LA/s;->n:Z

    return v0
.end method

.method public b()J
    .locals 2

    invoke-virtual {p0}, LA/s;->getWidth()I

    move-result v0

    invoke-virtual {p0}, LA/s;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, LY0/s;->a(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, LA/s;->p:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, LA/s;->l:I

    return v0
.end method

.method public e()Lw/q;
    .locals 1

    iget-object v0, p0, LA/s;->o:Lw/q;

    return-object v0
.end method

.method public f()I
    .locals 1

    invoke-virtual {p0}, LA/s;->g()I

    move-result v0

    neg-int v0, v0

    return v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, LA/s;->k:I

    return v0
.end method

.method public getHeight()I
    .locals 1

    iget-object v0, p0, LA/s;->r:LC0/D;

    invoke-interface {v0}, LC0/D;->getHeight()I

    move-result v0

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget-object v0, p0, LA/s;->r:LC0/D;

    invoke-interface {v0}, LC0/D;->getWidth()I

    move-result v0

    return v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, LA/s;->m:I

    return v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, LA/s;->q:I

    return v0
.end method

.method public j()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LA/s;->j:Ljava/util/List;

    return-object v0
.end method

.method public final k()Z
    .locals 2

    iget-object v0, p0, LA/s;->a:LA/t;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LA/t;->getIndex()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    iget v0, p0, LA/s;->b:I

    if-eqz v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, LA/s;->c:Z

    return v0
.end method

.method public final m()J
    .locals 2

    iget-wide v0, p0, LA/s;->i:J

    return-wide v0
.end method

.method public final n()F
    .locals 1

    iget v0, p0, LA/s;->d:F

    return v0
.end method

.method public final o()LIi/N;
    .locals 1

    iget-object v0, p0, LA/s;->g:LIi/N;

    return-object v0
.end method

.method public p()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LA/s;->r:LC0/D;

    invoke-interface {v0}, LC0/D;->p()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public q()V
    .locals 1

    iget-object v0, p0, LA/s;->r:LC0/D;

    invoke-interface {v0}, LC0/D;->q()V

    return-void
.end method

.method public r()Lmh/l;
    .locals 1

    iget-object v0, p0, LA/s;->r:LC0/D;

    invoke-interface {v0}, LC0/D;->r()Lmh/l;

    move-result-object v0

    return-object v0
.end method

.method public final s()LY0/d;
    .locals 1

    iget-object v0, p0, LA/s;->h:LY0/d;

    return-object v0
.end method

.method public final t()LA/t;
    .locals 1

    iget-object v0, p0, LA/s;->a:LA/t;

    return-object v0
.end method

.method public final u()I
    .locals 1

    iget v0, p0, LA/s;->b:I

    return v0
.end method

.method public final v()F
    .locals 1

    iget v0, p0, LA/s;->e:F

    return v0
.end method

.method public final w(IZ)Z
    .locals 4

    iget-boolean v0, p0, LA/s;->f:Z

    const/4 v1, 0x0

    if-nez v0, :cond_3

    invoke-virtual {p0}, LA/s;->j()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, LA/s;->a:LA/t;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LA/t;->f()I

    move-result v0

    iget v2, p0, LA/s;->b:I

    sub-int/2addr v2, p1

    if-ltz v2, :cond_3

    if-ge v2, v0, :cond_3

    invoke-virtual {p0}, LA/s;->j()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LA/t;

    invoke-virtual {p0}, LA/s;->j()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, LZg/v;->B0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LA/t;

    invoke-virtual {v0}, LA/t;->q()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v2}, LA/t;->q()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_2

    :cond_0
    if-gez p1, :cond_1

    invoke-virtual {v0}, LA/t;->b()I

    move-result v3

    invoke-virtual {v0}, LA/t;->f()I

    move-result v0

    add-int/2addr v3, v0

    invoke-virtual {p0}, LA/s;->g()I

    move-result v0

    sub-int/2addr v3, v0

    invoke-virtual {v2}, LA/t;->b()I

    move-result v0

    invoke-virtual {v2}, LA/t;->f()I

    move-result v2

    add-int/2addr v0, v2

    invoke-virtual {p0}, LA/s;->d()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    neg-int v2, p1

    if-le v0, v2, :cond_3

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LA/s;->g()I

    move-result v3

    invoke-virtual {v0}, LA/t;->b()I

    move-result v0

    sub-int/2addr v3, v0

    invoke-virtual {p0}, LA/s;->d()I

    move-result v0

    invoke-virtual {v2}, LA/t;->b()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-le v0, p1, :cond_3

    :goto_0
    iget v0, p0, LA/s;->b:I

    sub-int/2addr v0, p1

    iput v0, p0, LA/s;->b:I

    invoke-virtual {p0}, LA/s;->j()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    :goto_1
    if-ge v1, v2, :cond_2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LA/t;

    invoke-virtual {v3, p1, p2}, LA/t;->m(IZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    int-to-float p2, p1

    iput p2, p0, LA/s;->d:F

    iget-boolean p2, p0, LA/s;->c:Z

    const/4 v1, 0x1

    if-nez p2, :cond_3

    if-lez p1, :cond_3

    iput-boolean v1, p0, LA/s;->c:Z

    :cond_3
    :goto_2
    return v1
.end method
