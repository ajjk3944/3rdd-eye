.class public final Lod/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj7/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lod/i$a;
    }
.end annotation


# instance fields
.field private final a:LW7/d;

.field private b:Lod/i$a;

.field private c:LW7/f;

.field private d:LW7/a;

.field private e:Lb8/b;

.field private final f:Ljava/util/Map;

.field private g:Lmh/l;

.field private h:I


# direct methods
.method public constructor <init>(LW7/d;)V
    .locals 9

    const-string v0, "coordinates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lod/i;->a:LW7/d;

    new-instance p1, Lod/i$a;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v8}, Lod/i$a;-><init>(LW7/f;LW7/a;Lb8/b;DILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lod/i;->b:Lod/i$a;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lod/i;->f:Ljava/util/Map;

    sget-object p1, Lod/i$b;->a:Lod/i$b;

    iput-object p1, p0, Lod/i;->g:Lmh/l;

    return-void
.end method

.method public static synthetic g(Lod/i;)Lod/i$a;
    .locals 0

    invoke-static {p0}, Lod/i;->t(Lod/i;)Lod/i$a;

    move-result-object p0

    return-object p0
.end method

.method private final h(LW7/d;LW7/d;)D
    .locals 4

    invoke-virtual {p1}, LW7/d;->a()I

    move-result v0

    invoke-virtual {p2}, LW7/d;->a()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-double v0, v0

    const/4 v2, 0x2

    int-to-double v2, v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    invoke-virtual {p1}, LW7/d;->b()I

    move-result p1

    invoke-virtual {p2}, LW7/d;->b()I

    move-result p2

    sub-int/2addr p1, p2

    int-to-double p1, p1

    invoke-static {p1, p2, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    add-double/2addr v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p1

    return-wide p1
.end method

.method private final i(LW7/d;)I
    .locals 1

    invoke-virtual {p1}, LW7/d;->a()I

    move-result v0

    mul-int/lit16 v0, v0, 0x20f

    invoke-virtual {p1}, LW7/d;->b()I

    move-result p1

    mul-int/2addr v0, p1

    return v0
.end method

.method private final n(Lod/i$a;)D
    .locals 6

    invoke-virtual {p1}, Lod/i$a;->a()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    int-to-double v0, v0

    invoke-virtual {p1}, Lod/i$a;->a()D

    move-result-wide v2

    const/4 p1, 0x3

    int-to-double v4, p1

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    div-double/2addr v0, v2

    goto :goto_0

    :cond_0
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    :goto_0
    return-wide v0
.end method

.method private final q()V
    .locals 1

    iget-object v0, p0, Lod/i;->g:Lmh/l;

    invoke-interface {v0, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lod/i;->o(I)V

    return-void
.end method

.method private final r()V
    .locals 2

    new-instance v0, Lod/h;

    invoke-direct {v0, p0}, Lod/h;-><init>(Lod/i;)V

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    invoke-virtual {p0}, Lod/i;->l()Lod/i$a;

    move-result-object v1

    invoke-virtual {v1}, Lod/i$a;->c()LW7/f;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lod/i;->l()Lod/i$a;

    move-result-object v1

    invoke-virtual {v1}, Lod/i$a;->c()LW7/f;

    move-result-object v1

    iput-object v1, p0, Lod/i;->c:LW7/f;

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lod/i;->s(LYg/m;)Lod/i$a;

    move-result-object v1

    invoke-virtual {v1}, Lod/i$a;->c()LW7/f;

    move-result-object v1

    iput-object v1, p0, Lod/i;->c:LW7/f;

    :goto_0
    invoke-virtual {p0}, Lod/i;->l()Lod/i$a;

    move-result-object v1

    invoke-virtual {v1}, Lod/i$a;->d()LW7/a;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lod/i;->l()Lod/i$a;

    move-result-object v1

    invoke-virtual {v1}, Lod/i$a;->d()LW7/a;

    move-result-object v1

    iput-object v1, p0, Lod/i;->d:LW7/a;

    goto :goto_1

    :cond_1
    invoke-static {v0}, Lod/i;->s(LYg/m;)Lod/i$a;

    move-result-object v1

    invoke-virtual {v1}, Lod/i$a;->d()LW7/a;

    move-result-object v1

    iput-object v1, p0, Lod/i;->d:LW7/a;

    :goto_1
    invoke-virtual {p0}, Lod/i;->l()Lod/i$a;

    move-result-object v1

    invoke-virtual {v1}, Lod/i$a;->b()Lb8/b;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lod/i;->l()Lod/i$a;

    move-result-object v0

    invoke-virtual {v0}, Lod/i$a;->b()Lb8/b;

    move-result-object v0

    iput-object v0, p0, Lod/i;->e:Lb8/b;

    goto :goto_2

    :cond_2
    invoke-static {v0}, Lod/i;->s(LYg/m;)Lod/i$a;

    move-result-object v0

    invoke-virtual {v0}, Lod/i$a;->b()Lb8/b;

    move-result-object v0

    iput-object v0, p0, Lod/i;->e:Lb8/b;

    :goto_2
    return-void
.end method

.method private static final s(LYg/m;)Lod/i$a;
    .locals 0

    invoke-interface {p0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lod/i$a;

    return-object p0
.end method

.method private static final t(Lod/i;)Lod/i$a;
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, Lod/i;->f:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lod/i$a;

    invoke-direct {v0, v10}, Lod/i;->n(Lod/i$a;)D

    move-result-wide v11

    invoke-virtual {v10}, Lod/i$a;->c()LW7/f;

    move-result-object v13

    if-eqz v13, :cond_1

    add-double/2addr v4, v11

    :cond_1
    invoke-virtual {v10}, Lod/i$a;->d()LW7/a;

    move-result-object v13

    if-eqz v13, :cond_2

    add-double/2addr v6, v11

    :cond_2
    invoke-virtual {v10}, Lod/i$a;->b()Lb8/b;

    move-result-object v10

    if-eqz v10, :cond_0

    add-double/2addr v8, v11

    goto :goto_0

    :cond_3
    iget-object v1, v0, Lod/i;->f:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/util/Map$Entry;

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v2, v16

    check-cast v2, Lod/i$a;

    invoke-direct {v0, v2}, Lod/i;->n(Lod/i$a;)D

    move-result-wide v17

    invoke-virtual {v2}, Lod/i$a;->c()LW7/f;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3}, LW7/f;->b()I

    move-result v3

    move-object/from16 v16, v1

    int-to-double v0, v3

    mul-double v0, v0, v17

    div-double/2addr v0, v4

    add-double/2addr v10, v0

    goto :goto_2

    :cond_4
    move-object/from16 v16, v1

    :goto_2
    invoke-virtual {v2}, Lod/i$a;->d()LW7/a;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, LW7/a;->c()F

    move-result v0

    float-to-double v0, v0

    mul-double v0, v0, v17

    div-double/2addr v0, v6

    add-double/2addr v12, v0

    :cond_5
    invoke-virtual {v2}, Lod/i$a;->b()Lb8/b;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lb8/b;->b()I

    move-result v0

    int-to-double v0, v0

    mul-double v0, v0, v17

    div-double/2addr v0, v8

    add-double/2addr v14, v0

    :cond_6
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    goto :goto_1

    :cond_7
    new-instance v0, Lod/i$a;

    const-wide/16 v1, 0x0

    cmpg-double v3, v4, v1

    const/4 v4, 0x0

    if-nez v3, :cond_8

    move-object/from16 v18, v4

    goto :goto_3

    :cond_8
    sget-object v3, LS8/l;->f:LS8/l$a;

    invoke-static {v10, v11}, Loh/b;->d(D)I

    move-result v5

    invoke-virtual {v3, v5}, LS8/l$a;->a(I)LS8/l;

    move-result-object v3

    move-object/from16 v18, v3

    :goto_3
    cmpg-double v3, v6, v1

    if-nez v3, :cond_9

    move-object/from16 v19, v4

    goto :goto_4

    :cond_9
    sget-object v3, LW7/a;->b:LW7/a$a;

    invoke-static {v12, v13}, Loh/b;->d(D)I

    move-result v5

    invoke-virtual {v3, v5}, LW7/a$a;->d(I)LW7/a;

    move-result-object v3

    move-object/from16 v19, v3

    :goto_4
    cmpg-double v1, v8, v1

    if-nez v1, :cond_a

    move-object/from16 v20, v4

    goto :goto_5

    :cond_a
    sget-object v1, Lb8/b;->a:Lb8/b$b;

    invoke-static {v14, v15}, Loh/b;->d(D)I

    move-result v2

    invoke-virtual {v1, v2}, Lb8/b$b;->a(I)Lb8/b;

    move-result-object v1

    move-object/from16 v20, v1

    :goto_5
    const-wide/16 v21, 0x0

    move-object/from16 v17, v0

    invoke-direct/range {v17 .. v22}, Lod/i$a;-><init>(LW7/f;LW7/a;Lb8/b;D)V

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lod/i;->h:I

    return v0
.end method

.method public c()LW7/d;
    .locals 1

    iget-object v0, p0, Lod/i;->a:LW7/d;

    return-object v0
.end method

.method public d(LW7/d;Lmh/l;)V
    .locals 11

    const-string v0, "point"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "update"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lod/i;->f:Ljava/util/Map;

    invoke-direct {p0, p1}, Lod/i;->i(LW7/d;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v2, Lod/i$a;

    invoke-virtual {p0}, Lod/i;->c()LW7/d;

    move-result-object v3

    invoke-direct {p0, p1, v3}, Lod/i;->h(LW7/d;LW7/d;)D

    move-result-wide v7

    const/4 v9, 0x7

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, v2

    invoke-direct/range {v3 .. v10}, Lod/i$a;-><init>(LW7/f;LW7/a;Lb8/b;DILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-interface {p2, v2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lod/i;->r()V

    invoke-direct {p0}, Lod/i;->q()V

    return-void
.end method

.method public f(Lmh/l;)V
    .locals 1

    const-string v0, "update"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lod/i;->l()Lod/i$a;

    move-result-object v0

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lod/i;->r()V

    invoke-direct {p0}, Lod/i;->q()V

    return-void
.end method

.method public final j()Lb8/b;
    .locals 1

    iget-object v0, p0, Lod/i;->e:Lb8/b;

    return-object v0
.end method

.method public final k()LW7/f;
    .locals 1

    iget-object v0, p0, Lod/i;->c:LW7/f;

    return-object v0
.end method

.method public l()Lod/i$a;
    .locals 1

    iget-object v0, p0, Lod/i;->b:Lod/i$a;

    return-object v0
.end method

.method public final m()LW7/a;
    .locals 1

    iget-object v0, p0, Lod/i;->d:LW7/a;

    return-object v0
.end method

.method public o(I)V
    .locals 0

    iput p1, p0, Lod/i;->h:I

    return-void
.end method

.method public final p(Lmh/l;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lod/i;->g:Lmh/l;

    invoke-direct {p0}, Lod/i;->q()V

    return-void
.end method
