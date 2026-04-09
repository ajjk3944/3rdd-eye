.class public final Lr/A0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/z0;


# instance fields
.field private final a:Lr/s;

.field private b:Lr/q;

.field private c:Lr/q;

.field private d:Lr/q;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lr/I;)V
    .locals 1

    .line 3
    new-instance v0, Lr/A0$a;

    invoke-direct {v0, p1}, Lr/A0$a;-><init>(Lr/I;)V

    invoke-direct {p0, v0}, Lr/A0;-><init>(Lr/s;)V

    return-void
.end method

.method public constructor <init>(Lr/s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lr/A0;->a:Lr/s;

    return-void
.end method


# virtual methods
.method public b(Lr/q;Lr/q;Lr/q;)J
    .locals 7

    invoke-virtual {p1}, Lr/q;->b()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lsh/m;->s(II)Lsh/i;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, LZg/Q;

    invoke-virtual {v3}, LZg/Q;->d()I

    move-result v3

    iget-object v4, p0, Lr/A0;->a:Lr/s;

    invoke-interface {v4, v3}, Lr/s;->get(I)Lr/I;

    move-result-object v4

    invoke-virtual {p1, v3}, Lr/q;->a(I)F

    move-result v5

    invoke-virtual {p2, v3}, Lr/q;->a(I)F

    move-result v6

    invoke-virtual {p3, v3}, Lr/q;->a(I)F

    move-result v3

    invoke-interface {v4, v5, v6, v3}, Lr/I;->c(FFF)J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    return-wide v1
.end method

.method public c(JLr/q;Lr/q;Lr/q;)Lr/q;
    .locals 15

    move-object v0, p0

    iget-object v1, v0, Lr/A0;->b:Lr/q;

    if-nez v1, :cond_0

    invoke-static/range {p3 .. p3}, Lr/r;->g(Lr/q;)Lr/q;

    move-result-object v1

    iput-object v1, v0, Lr/A0;->b:Lr/q;

    :cond_0
    iget-object v1, v0, Lr/A0;->b:Lr/q;

    const/4 v2, 0x0

    const-string v3, "valueVector"

    if-nez v1, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v1, v2

    :cond_1
    invoke-virtual {v1}, Lr/q;->b()I

    move-result v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_3

    iget-object v5, v0, Lr/A0;->b:Lr/q;

    if-nez v5, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v5, v2

    :cond_2
    iget-object v6, v0, Lr/A0;->a:Lr/s;

    invoke-interface {v6, v4}, Lr/s;->get(I)Lr/I;

    move-result-object v7

    move-object/from16 v6, p3

    invoke-virtual {v6, v4}, Lr/q;->a(I)F

    move-result v10

    move-object/from16 v13, p4

    invoke-virtual {v13, v4}, Lr/q;->a(I)F

    move-result v11

    move-object/from16 v14, p5

    invoke-virtual {v14, v4}, Lr/q;->a(I)F

    move-result v12

    move-wide/from16 v8, p1

    invoke-interface/range {v7 .. v12}, Lr/I;->e(JFFF)F

    move-result v7

    invoke-virtual {v5, v4, v7}, Lr/q;->e(IF)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    iget-object v1, v0, Lr/A0;->b:Lr/q;

    if-nez v1, :cond_4

    invoke-static {v3}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v2, v1

    :goto_1
    return-object v2
.end method

.method public d(Lr/q;Lr/q;Lr/q;)Lr/q;
    .locals 9

    iget-object v0, p0, Lr/A0;->d:Lr/q;

    if-nez v0, :cond_0

    invoke-static {p3}, Lr/r;->g(Lr/q;)Lr/q;

    move-result-object v0

    iput-object v0, p0, Lr/A0;->d:Lr/q;

    :cond_0
    iget-object v0, p0, Lr/A0;->d:Lr/q;

    const/4 v1, 0x0

    const-string v2, "endVelocityVector"

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    invoke-virtual {v0}, Lr/q;->b()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_3

    iget-object v4, p0, Lr/A0;->d:Lr/q;

    if-nez v4, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v4, v1

    :cond_2
    iget-object v5, p0, Lr/A0;->a:Lr/s;

    invoke-interface {v5, v3}, Lr/s;->get(I)Lr/I;

    move-result-object v5

    invoke-virtual {p1, v3}, Lr/q;->a(I)F

    move-result v6

    invoke-virtual {p2, v3}, Lr/q;->a(I)F

    move-result v7

    invoke-virtual {p3, v3}, Lr/q;->a(I)F

    move-result v8

    invoke-interface {v5, v6, v7, v8}, Lr/I;->d(FFF)F

    move-result v5

    invoke-virtual {v4, v3, v5}, Lr/q;->e(IF)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lr/A0;->d:Lr/q;

    if-nez p1, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v1, p1

    :goto_1
    return-object v1
.end method

.method public f(JLr/q;Lr/q;Lr/q;)Lr/q;
    .locals 15

    move-object v0, p0

    iget-object v1, v0, Lr/A0;->c:Lr/q;

    if-nez v1, :cond_0

    invoke-static/range {p5 .. p5}, Lr/r;->g(Lr/q;)Lr/q;

    move-result-object v1

    iput-object v1, v0, Lr/A0;->c:Lr/q;

    :cond_0
    iget-object v1, v0, Lr/A0;->c:Lr/q;

    const/4 v2, 0x0

    const-string v3, "velocityVector"

    if-nez v1, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v1, v2

    :cond_1
    invoke-virtual {v1}, Lr/q;->b()I

    move-result v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_3

    iget-object v5, v0, Lr/A0;->c:Lr/q;

    if-nez v5, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v5, v2

    :cond_2
    iget-object v6, v0, Lr/A0;->a:Lr/s;

    invoke-interface {v6, v4}, Lr/s;->get(I)Lr/I;

    move-result-object v7

    move-object/from16 v6, p3

    invoke-virtual {v6, v4}, Lr/q;->a(I)F

    move-result v10

    move-object/from16 v13, p4

    invoke-virtual {v13, v4}, Lr/q;->a(I)F

    move-result v11

    move-object/from16 v14, p5

    invoke-virtual {v14, v4}, Lr/q;->a(I)F

    move-result v12

    move-wide/from16 v8, p1

    invoke-interface/range {v7 .. v12}, Lr/I;->b(JFFF)F

    move-result v7

    invoke-virtual {v5, v4, v7}, Lr/q;->e(IF)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    iget-object v1, v0, Lr/A0;->c:Lr/q;

    if-nez v1, :cond_4

    invoke-static {v3}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v2, v1

    :goto_1
    return-object v2
.end method
