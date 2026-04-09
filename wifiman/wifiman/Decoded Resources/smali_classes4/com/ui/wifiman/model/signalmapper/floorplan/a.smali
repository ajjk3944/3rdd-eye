.class public final Lcom/ui/wifiman/model/signalmapper/floorplan/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/signalmapper/floorplan/WifimanFloorplanSessionGpxSerializer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/signalmapper/floorplan/a$a;,
        Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;
    }
.end annotation


# static fields
.field public static final b:Lcom/ui/wifiman/model/signalmapper/floorplan/a$a;


# instance fields
.field private final a:LRf/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/signalmapper/floorplan/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/signalmapper/floorplan/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/signalmapper/floorplan/a;->b:Lcom/ui/wifiman/model/signalmapper/floorplan/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LRf/a;

    invoke-direct {v0}, LRf/a;-><init>()V

    new-instance v1, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b$a;

    invoke-direct {v1}, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b$a;-><init>()V

    invoke-virtual {v0, v1}, LRf/a;->b(LTf/a;)V

    iput-object v0, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/a;->a:LRf/a;

    return-void
.end method

.method public static synthetic c(LSf/e;)Z
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/signalmapper/floorplan/a;->f(LSf/e;)Z

    move-result p0

    return p0
.end method

.method private final d(IF)F
    .locals 0

    int-to-float p1, p1

    mul-float/2addr p1, p2

    return p1
.end method

.method private static final f(LSf/e;)Z
    .locals 1

    invoke-virtual {p0}, LSf/e;->v()Ljava/lang/String;

    move-result-object p0

    const-string v0, "objectDetection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private final g(FF)F
    .locals 0

    mul-float/2addr p1, p2

    return p1
.end method

.method static synthetic h(Lcom/ui/wifiman/model/signalmapper/floorplan/a;FFILjava/lang/Object;)F
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const p2, 0x3a83126f    # 0.001f

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/ui/wifiman/model/signalmapper/floorplan/a;->g(FF)F

    move-result p0

    return p0
.end method

.method private final i(FF)F
    .locals 0

    div-float/2addr p1, p2

    return p1
.end method

.method private final k(Lcom/ui/wifiman/model/signalmapper/floorplan/b;)LSf/b;
    .locals 16

    move-object/from16 v1, p0

    new-instance v0, LSf/b;

    invoke-direct {v0}, LSf/b;-><init>()V

    const-string v2, "wifiman"

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->e()F

    move-result v3

    new-instance v10, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    const v3, 0x3a83126f    # 0.001f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v5, 0x0

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;-><init>(LS8/l;Ljava/lang/Float;Ljava/lang/Float;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v2, v10}, LSf/a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v2, LSf/d;

    invoke-direct {v2}, LSf/d;-><init>()V

    const-string v3, "path"

    invoke-virtual {v2, v3}, LSf/d;->t(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->d()Ljava/util/LinkedList;

    move-result-object v3

    monitor-enter v3

    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->d()Ljava/util/LinkedList;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;

    new-instance v9, LSf/e;

    invoke-virtual {v5}, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;->a()LW7/d;

    move-result-object v10

    invoke-virtual {v10}, LW7/d;->a()I

    move-result v10

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->e()F

    move-result v11

    invoke-direct {v1, v10, v11}, Lcom/ui/wifiman/model/signalmapper/floorplan/a;->d(IF)F

    move-result v10

    invoke-static {v1, v10, v7, v6, v8}, Lcom/ui/wifiman/model/signalmapper/floorplan/a;->h(Lcom/ui/wifiman/model/signalmapper/floorplan/a;FFILjava/lang/Object;)F

    move-result v10

    invoke-virtual {v5}, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;->a()LW7/d;

    move-result-object v11

    invoke-virtual {v11}, LW7/d;->b()I

    move-result v11

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->e()F

    move-result v12

    invoke-direct {v1, v11, v12}, Lcom/ui/wifiman/model/signalmapper/floorplan/a;->d(IF)F

    move-result v11

    invoke-static {v1, v11, v7, v6, v8}, Lcom/ui/wifiman/model/signalmapper/floorplan/a;->h(Lcom/ui/wifiman/model/signalmapper/floorplan/a;FFILjava/lang/Object;)F

    move-result v6

    invoke-direct {v9, v8, v10, v6}, LSf/e;-><init>(Ljava/lang/String;FF)V

    new-instance v6, Ljava/util/Date;

    invoke-virtual {v5}, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;->b()J

    move-result-wide v7

    invoke-direct {v6, v7, v8}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v9, v6}, LSf/e;->N(Ljava/util/Date;)V

    const-string v6, "wifiman"

    new-instance v7, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;

    invoke-virtual {v5}, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;->c()LS8/l;

    move-result-object v11

    const/4 v14, 0x6

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v10, v7

    invoke-direct/range {v10 .. v15}, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;-><init>(LS8/l;Ljava/lang/Float;Ljava/lang/Float;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v9, v6, v7}, LSf/a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v2, v9}, LSf/d;->e(LSf/e;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_0
    sget-object v4, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v3

    invoke-virtual {v0, v2}, LSf/b;->f(LSf/d;)V

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->c()Ljava/util/LinkedList;

    move-result-object v2

    monitor-enter v2

    :try_start_1
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->c()Ljava/util/LinkedList;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ui/wifiman/model/signalmapper/floorplan/b$a;

    new-instance v5, LSf/e;

    invoke-virtual {v4}, Lcom/ui/wifiman/model/signalmapper/floorplan/b$a;->b()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4}, Lcom/ui/wifiman/model/signalmapper/floorplan/b$a;->a()LW7/d;

    move-result-object v10

    invoke-virtual {v10}, LW7/d;->a()I

    move-result v10

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->e()F

    move-result v11

    invoke-direct {v1, v10, v11}, Lcom/ui/wifiman/model/signalmapper/floorplan/a;->d(IF)F

    move-result v10

    invoke-static {v1, v10, v7, v6, v8}, Lcom/ui/wifiman/model/signalmapper/floorplan/a;->h(Lcom/ui/wifiman/model/signalmapper/floorplan/a;FFILjava/lang/Object;)F

    move-result v10

    invoke-virtual {v4}, Lcom/ui/wifiman/model/signalmapper/floorplan/b$a;->a()LW7/d;

    move-result-object v11

    invoke-virtual {v11}, LW7/d;->b()I

    move-result v11

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->e()F

    move-result v12

    invoke-direct {v1, v11, v12}, Lcom/ui/wifiman/model/signalmapper/floorplan/a;->d(IF)F

    move-result v11

    invoke-static {v1, v11, v7, v6, v8}, Lcom/ui/wifiman/model/signalmapper/floorplan/a;->h(Lcom/ui/wifiman/model/signalmapper/floorplan/a;FFILjava/lang/Object;)F

    move-result v11

    invoke-direct {v5, v9, v10, v11}, LSf/e;-><init>(Ljava/lang/String;FF)V

    const-string v9, "objectDetection"

    invoke-virtual {v5, v9}, LSf/e;->O(Ljava/lang/String;)V

    new-instance v9, Ljava/util/Date;

    invoke-virtual {v4}, Lcom/ui/wifiman/model/signalmapper/floorplan/b$a;->c()J

    move-result-wide v10

    invoke-direct {v9, v10, v11}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v5, v9}, LSf/e;->N(Ljava/util/Date;)V

    invoke-virtual {v0, v5}, LSf/b;->g(LSf/e;)V

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_1
    sget-object v3, LYg/J;->a:LYg/J;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v2

    return-object v0

    :goto_2
    monitor-exit v2

    throw v0

    :goto_3
    monitor-exit v3

    throw v0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/String;)Lod/d;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/signalmapper/floorplan/a;->e(Ljava/lang/String;)Lcom/ui/wifiman/model/signalmapper/floorplan/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Lod/d;)Ljava/lang/String;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/signalmapper/floorplan/b;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/signalmapper/floorplan/a;->j(Lcom/ui/wifiman/model/signalmapper/floorplan/b;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/String;)Lcom/ui/wifiman/model/signalmapper/floorplan/b;
    .locals 11

    const-string v0, "gpxSerialized"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/a;->a:LRf/a;

    new-instance v1, Ljava/io/ByteArrayInputStream;

    sget-object v2, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string v2, "getBytes(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v0, v1}, LRf/a;->l(Ljava/io/InputStream;)LSf/b;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v0, "wifiman"

    invoke-virtual {p1, v0}, LSf/a;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eqz v1, :cond_d

    instance-of v4, v1, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;

    if-eqz v4, :cond_0

    check-cast v1, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_d

    invoke-virtual {v1}, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;->a()Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    new-instance v10, Lcom/ui/wifiman/model/signalmapper/floorplan/b;

    invoke-direct {v10, v1}, Lcom/ui/wifiman/model/signalmapper/floorplan/b;-><init>(F)V

    invoke-virtual {p1, v0}, LSf/a;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_c

    instance-of v4, v1, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;

    if-eqz v4, :cond_1

    check-cast v1, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;

    goto :goto_1

    :cond_1
    move-object v1, v3

    :goto_1
    if-eqz v1, :cond_c

    invoke-virtual {v1}, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;->b()Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {p1}, LSf/b;->j()Ljava/util/HashSet;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual {p1}, LSf/b;->j()Ljava/util/HashSet;

    move-result-object v2

    const-string v4, "getTracks(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, LSf/d;

    invoke-virtual {v5}, LSf/d;->n()Ljava/lang/String;

    move-result-object v5

    const-string v6, "path"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_2

    :cond_3
    move-object v4, v3

    :goto_2
    check-cast v4, LSf/d;

    if-eqz v4, :cond_8

    invoke-virtual {v4}, LSf/d;->m()Ljava/util/ArrayList;

    move-result-object v2

    const-string v4, "getTrackPoints(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lcom/ui/wifiman/model/signalmapper/floorplan/a$c;

    invoke-direct {v4}, Lcom/ui/wifiman/model/signalmapper/floorplan/a$c;-><init>()V

    invoke-static {v2, v4}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LSf/e;

    invoke-virtual {v4}, LSf/e;->m()Ljava/lang/Double;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {v4}, LSf/e;->n()Ljava/lang/Double;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {v4}, LSf/e;->m()Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    double-to-float v5, v5

    invoke-direct {p0, v5, v1}, Lcom/ui/wifiman/model/signalmapper/floorplan/a;->i(FF)F

    move-result v5

    invoke-virtual {v4}, LSf/e;->n()Ljava/lang/Double;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    double-to-float v6, v6

    invoke-direct {p0, v6, v1}, Lcom/ui/wifiman/model/signalmapper/floorplan/a;->i(FF)F

    move-result v6

    invoke-virtual {v4, v0}, LSf/a;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_6

    instance-of v8, v7, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;

    if-eqz v8, :cond_5

    check-cast v7, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;

    goto :goto_4

    :cond_5
    move-object v7, v3

    :goto_4
    if-eqz v7, :cond_6

    invoke-virtual {v7}, Lcom/ui/wifiman/model/signalmapper/floorplan/a$b;->c()LS8/l;

    move-result-object v7

    move-object v9, v7

    goto :goto_5

    :cond_6
    move-object v9, v3

    :goto_5
    invoke-virtual {v4}, LSf/e;->u()Ljava/util/Date;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    goto :goto_6

    :cond_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    :goto_6
    move-object v4, v10

    invoke-virtual/range {v4 .. v9}, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->b(FFJLS8/l;)V

    goto :goto_3

    :cond_8
    invoke-virtual {p1}, LSf/b;->l()Ljava/util/HashSet;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {p1}, LSf/b;->l()Ljava/util/HashSet;

    move-result-object p1

    const-string v0, "getWaypoints(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object p1

    new-instance v0, Lod/e;

    invoke-direct {v0}, Lod/e;-><init>()V

    invoke-static {p1, v0}, Lzi/m;->C(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p1

    invoke-interface {p1}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_9
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LSf/e;

    invoke-virtual {v0}, LSf/e;->p()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_9

    invoke-virtual {v0}, LSf/e;->m()Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    double-to-float v2, v2

    invoke-direct {p0, v2, v1}, Lcom/ui/wifiman/model/signalmapper/floorplan/a;->i(FF)F

    move-result v5

    invoke-virtual {v0}, LSf/e;->n()Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    double-to-float v2, v2

    invoke-direct {p0, v2, v1}, Lcom/ui/wifiman/model/signalmapper/floorplan/a;->i(FF)F

    move-result v6

    invoke-virtual {v0}, LSf/e;->u()Ljava/util/Date;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    :goto_8
    move-wide v7, v2

    goto :goto_9

    :cond_a
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    goto :goto_8

    :goto_9
    move-object v4, v10

    invoke-virtual/range {v4 .. v9}, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->a(FFJLjava/lang/String;)V

    goto :goto_7

    :cond_b
    return-object v10

    :cond_c
    new-instance p1, Lcom/ui/wifiman/model/signalmapper/floorplan/WifimanFloorplanSessionGpxSerializer$Error;

    const-string v0, "scale not present"

    invoke-direct {p1, v0, v3, v2, v3}, Lcom/ui/wifiman/model/signalmapper/floorplan/WifimanFloorplanSessionGpxSerializer$Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :cond_d
    new-instance p1, Lcom/ui/wifiman/model/signalmapper/floorplan/WifimanFloorplanSessionGpxSerializer$Error;

    const-string v0, "granularity not present"

    invoke-direct {p1, v0, v3, v2, v3}, Lcom/ui/wifiman/model/signalmapper/floorplan/WifimanFloorplanSessionGpxSerializer$Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :catch_0
    move-exception p1

    new-instance v0, Lcom/ui/wifiman/model/signalmapper/floorplan/WifimanFloorplanSessionGpxSerializer$Error;

    const-string v1, "failed to deserialize floorplan"

    invoke-direct {v0, v1, p1}, Lcom/ui/wifiman/model/signalmapper/floorplan/WifimanFloorplanSessionGpxSerializer$Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public j(Lcom/ui/wifiman/model/signalmapper/floorplan/b;)Ljava/lang/String;
    .locals 3

    const-string v0, "failed to serialize floorplan"

    const-string v1, "session"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/signalmapper/floorplan/a;->k(Lcom/ui/wifiman/model/signalmapper/floorplan/b;)LSf/b;

    move-result-object p1

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    iget-object v2, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/a;->a:LRf/a;

    invoke-virtual {v2, p1, v1}, LRf/a;->q(LSf/b;Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljavax/xml/parsers/ParserConfigurationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljavax/xml/transform/TransformerException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object p1, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    new-instance v1, Lcom/ui/wifiman/model/signalmapper/floorplan/WifimanFloorplanSessionGpxSerializer$Error;

    invoke-direct {v1, v0, p1}, Lcom/ui/wifiman/model/signalmapper/floorplan/WifimanFloorplanSessionGpxSerializer$Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :goto_1
    new-instance v1, Lcom/ui/wifiman/model/signalmapper/floorplan/WifimanFloorplanSessionGpxSerializer$Error;

    invoke-direct {v1, v0, p1}, Lcom/ui/wifiman/model/signalmapper/floorplan/WifimanFloorplanSessionGpxSerializer$Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
