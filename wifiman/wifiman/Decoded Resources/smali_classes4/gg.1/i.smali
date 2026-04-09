.class public abstract Lgg/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDj/a;


# static fields
.field static final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "rx3.buffer-size"

    const/16 v1, 0x80

    invoke-static {v0, v1}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    sput v0, Lgg/i;->a:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static varargs A([LDj/a;)Lgg/i;
    .locals 3

    const-string v0, "sources is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    array-length v0, p0

    if-nez v0, :cond_0

    invoke-static {}, Lgg/i;->j0()Lgg/i;

    move-result-object p0

    return-object p0

    :cond_0
    array-length v0, p0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    aget-object p0, p0, v2

    invoke-static {p0}, Lgg/i;->B0(LDj/a;)Lgg/i;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v0, Lqg/f;

    invoke-direct {v0, p0, v2}, Lqg/f;-><init>([LDj/a;Z)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static A0(Ljava/lang/Iterable;)Lgg/i;
    .locals 1

    const-string v0, "source is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/D;

    invoke-direct {v0, p0}, Lqg/D;-><init>(Ljava/lang/Iterable;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static B0(LDj/a;)Lgg/i;
    .locals 1

    instance-of v0, p0, Lgg/i;

    if-eqz v0, :cond_0

    check-cast p0, Lgg/i;

    invoke-static {p0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p0

    return-object p0

    :cond_0
    const-string v0, "publisher is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/F;

    invoke-direct {v0, p0}, Lqg/F;-><init>(LDj/a;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static C0(Lkg/f;)Lgg/i;
    .locals 2

    const-string v0, "generator is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {}, Lmg/a;->i()Lkg/q;

    move-result-object v0

    invoke-static {p0}, Lqg/J;->a(Lkg/f;)Lkg/b;

    move-result-object p0

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v1

    invoke-static {v0, p0, v1}, Lgg/i;->D0(Lkg/q;Lkg/b;Lkg/f;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static D0(Lkg/q;Lkg/b;Lkg/f;)Lgg/i;
    .locals 1

    const-string v0, "initialState is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "generator is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "disposeState is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/G;

    invoke-direct {v0, p0, p1, p2}, Lqg/G;-><init>(Lkg/q;Lkg/b;Lkg/f;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static F0(JJLjava/util/concurrent/TimeUnit;)Lgg/i;
    .locals 6

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v5

    move-wide v0, p0

    move-wide v2, p2

    move-object v4, p4

    invoke-static/range {v0 .. v5}, Lgg/i;->G0(JJLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static G0(JJLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;
    .locals 8

    const-string v0, "unit is null"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p5, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/K;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, p0, p1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p0

    invoke-static {v1, v2, p2, p3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    move-object v1, v0

    move-wide v2, p0

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lqg/K;-><init>(JJLjava/util/concurrent/TimeUnit;Lgg/y;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static H0(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;
    .locals 6

    move-wide v0, p0

    move-wide v2, p0

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Lgg/i;->G0(JJLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static I0(JJJJLjava/util/concurrent/TimeUnit;)Lgg/i;
    .locals 10

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v9

    move-wide v0, p0

    move-wide v2, p2

    move-wide v4, p4

    move-wide/from16 v6, p6

    move-object/from16 v8, p8

    invoke-static/range {v0 .. v9}, Lgg/i;->J0(JJJJLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method public static J0(JJJJLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;
    .locals 16

    move-wide/from16 v0, p2

    move-wide/from16 v2, p4

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    const-wide/16 v4, 0x0

    cmp-long v6, v0, v4

    if-ltz v6, :cond_3

    if-nez v6, :cond_0

    invoke-static {}, Lgg/i;->j0()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v2, v3, v9, v10}, Lgg/i;->S(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;

    move-result-object v0

    return-object v0

    :cond_0
    const-wide/16 v6, 0x1

    sub-long/2addr v0, v6

    add-long v6, p0, v0

    cmp-long v0, p0, v4

    if-lez v0, :cond_2

    cmp-long v0, v6, v4

    if-ltz v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Overflow! start + count is bigger than Long.MAX_VALUE"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    const-string v0, "unit is null"

    invoke-static {v9, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {v10, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v11, Lqg/L;

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v12

    move-wide/from16 v0, p6

    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v14

    move-object v0, v11

    move-wide/from16 v1, p0

    move-wide v3, v6

    move-wide v5, v12

    move-wide v7, v14

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v10}, Lqg/L;-><init>(JJJJLjava/util/concurrent/TimeUnit;Lgg/y;)V

    invoke-static {v11}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object v0

    return-object v0

    :cond_3
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "count >= 0 required but it was "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public static K0(Ljava/lang/Object;)Lgg/i;
    .locals 1

    const-string v0, "item is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/M;

    invoke-direct {v0, p0}, Lqg/M;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static L0(Ljava/lang/Object;Ljava/lang/Object;)Lgg/i;
    .locals 1

    const-string v0, "item1 is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "item2 is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lgg/i;->z0([Ljava/lang/Object;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static N(Lgg/k;Lgg/a;)Lgg/i;
    .locals 1

    const-string v0, "source is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "mode is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/i;

    invoke-direct {v0, p0, p1}, Lqg/i;-><init>(Lgg/k;Lgg/a;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static O0(LDj/a;)Lgg/i;
    .locals 1

    invoke-static {}, Lgg/i;->i()I

    move-result v0

    invoke-static {p0, v0}, Lgg/i;->P0(LDj/a;I)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static P0(LDj/a;I)Lgg/i;
    .locals 1

    invoke-static {p0}, Lgg/i;->B0(LDj/a;)Lgg/i;

    move-result-object p0

    invoke-static {}, Lmg/a;->f()Lkg/n;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lgg/i;->q0(Lkg/n;I)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static Q0(LDj/a;LDj/a;)Lgg/i;
    .locals 3

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x2

    new-array v1, v0, [LDj/a;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    invoke-static {v1}, Lgg/i;->z0([Ljava/lang/Object;)Lgg/i;

    move-result-object p0

    invoke-static {}, Lmg/a;->f()Lkg/n;

    move-result-object p1

    invoke-virtual {p0, p1, v2, v0}, Lgg/i;->r0(Lkg/n;ZI)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static R0(LDj/a;LDj/a;LDj/a;)Lgg/i;
    .locals 3

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source3 is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x3

    new-array v1, v0, [LDj/a;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    const/4 p0, 0x2

    aput-object p2, v1, p0

    invoke-static {v1}, Lgg/i;->z0([Ljava/lang/Object;)Lgg/i;

    move-result-object p0

    invoke-static {}, Lmg/a;->f()Lkg/n;

    move-result-object p1

    invoke-virtual {p0, p1, v2, v0}, Lgg/i;->r0(Lkg/n;ZI)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static S0(Ljava/lang/Iterable;)Lgg/i;
    .locals 1

    invoke-static {p0}, Lgg/i;->A0(Ljava/lang/Iterable;)Lgg/i;

    move-result-object p0

    invoke-static {}, Lmg/a;->f()Lkg/n;

    move-result-object v0

    invoke-virtual {p0, v0}, Lgg/i;->p0(Lkg/n;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static W0()Lgg/i;
    .locals 1

    sget-object v0, Lqg/S;->b:Lgg/i;

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method private b2(JLjava/util/concurrent/TimeUnit;LDj/a;Lgg/y;)Lgg/i;
    .locals 8

    const-string v0, "unit is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p5, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/y0;

    move-object v1, v0

    move-object v2, p0

    move-wide v3, p1

    move-object v5, p3

    move-object v6, p5

    move-object v7, p4

    invoke-direct/range {v1 .. v7}, Lqg/y0;-><init>(Lgg/i;JLjava/util/concurrent/TimeUnit;Lgg/y;LDj/a;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method private c0(Lkg/f;Lkg/f;Lkg/a;Lkg/a;)Lgg/i;
    .locals 7

    const-string v0, "onNext is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onError is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onComplete is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onAfterTerminate is null"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/o;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lqg/o;-><init>(Lgg/i;Lkg/f;Lkg/f;Lkg/a;Lkg/a;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method private c2(LDj/a;Lkg/n;LDj/a;)Lgg/i;
    .locals 1

    const-string v0, "itemTimeoutIndicator is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/x0;

    invoke-direct {v0, p0, p1, p2, p3}, Lqg/x0;-><init>(Lgg/i;LDj/a;Lkg/n;LDj/a;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public static d2(JLjava/util/concurrent/TimeUnit;)Lgg/i;
    .locals 1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lgg/i;->e2(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static e2(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;
    .locals 3

    const-string v0, "unit is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/z0;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, p0, p1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p0

    invoke-direct {v0, p0, p1, p2, p3}, Lqg/z0;-><init>(JLjava/util/concurrent/TimeUnit;Lgg/y;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static i()I
    .locals 1

    sget v0, Lgg/i;->a:I

    return v0
.end method

.method public static j0()Lgg/i;
    .locals 1

    sget-object v0, Lqg/t;->b:Lgg/i;

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method public static j1(II)Lgg/i;
    .locals 4

    if-ltz p1, :cond_3

    if-nez p1, :cond_0

    invoke-static {}, Lgg/i;->j0()Lgg/i;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p0

    return-object p0

    :cond_1
    int-to-long v0, p0

    add-int/lit8 v2, p1, -0x1

    int-to-long v2, v2

    add-long/2addr v0, v2

    const-wide/32 v2, 0x7fffffff

    cmp-long v0, v0, v2

    if-gtz v0, :cond_2

    new-instance v0, Lqg/b0;

    invoke-direct {v0, p0, p1}, Lqg/b0;-><init>(II)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Integer overflow"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "count >= 0 required but it was "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static k0(Ljava/lang/Throwable;)Lgg/i;
    .locals 1

    const-string v0, "throwable is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p0}, Lmg/a;->h(Ljava/lang/Object;)Lkg/q;

    move-result-object p0

    invoke-static {p0}, Lgg/i;->l0(Lkg/q;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static l0(Lkg/q;)Lgg/i;
    .locals 1

    const-string v0, "supplier is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/u;

    invoke-direct {v0, p0}, Lqg/u;-><init>(Lkg/q;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static o(LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;Lkg/m;)Lgg/i;
    .locals 2

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source3 is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source4 is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source5 is null"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source6 is null"

    invoke-static {p5, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source7 is null"

    invoke-static {p6, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source8 is null"

    invoke-static {p7, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source9 is null"

    invoke-static {p8, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "combiner is null"

    invoke-static {p9, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/16 v0, 0x9

    new-array v0, v0, [LDj/a;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    const/4 p0, 0x3

    aput-object p3, v0, p0

    const/4 p0, 0x4

    aput-object p4, v0, p0

    const/4 p0, 0x5

    aput-object p5, v0, p0

    const/4 p0, 0x6

    aput-object p6, v0, p0

    const/4 p0, 0x7

    aput-object p7, v0, p0

    const/16 p0, 0x8

    aput-object p8, v0, p0

    invoke-static {p9}, Lmg/a;->q(Lkg/m;)Lkg/n;

    move-result-object p0

    invoke-static {}, Lgg/i;->i()I

    move-result p1

    invoke-static {v0, p0, p1}, Lgg/i;->w([LDj/a;Lkg/n;I)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static p(LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;Lkg/l;)Lgg/i;
    .locals 2

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source3 is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source4 is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source5 is null"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source6 is null"

    invoke-static {p5, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source7 is null"

    invoke-static {p6, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source8 is null"

    invoke-static {p7, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "combiner is null"

    invoke-static {p8, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/16 v0, 0x8

    new-array v0, v0, [LDj/a;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    const/4 p0, 0x3

    aput-object p3, v0, p0

    const/4 p0, 0x4

    aput-object p4, v0, p0

    const/4 p0, 0x5

    aput-object p5, v0, p0

    const/4 p0, 0x6

    aput-object p6, v0, p0

    const/4 p0, 0x7

    aput-object p7, v0, p0

    invoke-static {p8}, Lmg/a;->p(Lkg/l;)Lkg/n;

    move-result-object p0

    invoke-static {}, Lgg/i;->i()I

    move-result p1

    invoke-static {v0, p0, p1}, Lgg/i;->w([LDj/a;Lkg/n;I)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static q(LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;Lkg/k;)Lgg/i;
    .locals 2

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source3 is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source4 is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source5 is null"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source6 is null"

    invoke-static {p5, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source7 is null"

    invoke-static {p6, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "combiner is null"

    invoke-static {p7, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x7

    new-array v0, v0, [LDj/a;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    const/4 p0, 0x3

    aput-object p3, v0, p0

    const/4 p0, 0x4

    aput-object p4, v0, p0

    const/4 p0, 0x5

    aput-object p5, v0, p0

    const/4 p0, 0x6

    aput-object p6, v0, p0

    invoke-static {p7}, Lmg/a;->o(Lkg/k;)Lkg/n;

    move-result-object p0

    invoke-static {}, Lgg/i;->i()I

    move-result p1

    invoke-static {v0, p0, p1}, Lgg/i;->w([LDj/a;Lkg/n;I)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static r(LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;Lkg/j;)Lgg/i;
    .locals 2

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source3 is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source4 is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source5 is null"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source6 is null"

    invoke-static {p5, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "combiner is null"

    invoke-static {p6, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x6

    new-array v0, v0, [LDj/a;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    const/4 p0, 0x3

    aput-object p3, v0, p0

    const/4 p0, 0x4

    aput-object p4, v0, p0

    const/4 p0, 0x5

    aput-object p5, v0, p0

    invoke-static {p6}, Lmg/a;->n(Lkg/j;)Lkg/n;

    move-result-object p0

    invoke-static {}, Lgg/i;->i()I

    move-result p1

    invoke-static {v0, p0, p1}, Lgg/i;->w([LDj/a;Lkg/n;I)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static s(LDj/a;LDj/a;LDj/a;LDj/a;LDj/a;Lkg/i;)Lgg/i;
    .locals 2

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source3 is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source4 is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source5 is null"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "combiner is null"

    invoke-static {p5, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x5

    new-array v0, v0, [LDj/a;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    const/4 p0, 0x3

    aput-object p3, v0, p0

    const/4 p0, 0x4

    aput-object p4, v0, p0

    invoke-static {p5}, Lmg/a;->m(Lkg/i;)Lkg/n;

    move-result-object p0

    invoke-static {}, Lgg/i;->i()I

    move-result p1

    invoke-static {v0, p0, p1}, Lgg/i;->w([LDj/a;Lkg/n;I)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static t(LDj/a;LDj/a;LDj/a;LDj/a;Lkg/h;)Lgg/i;
    .locals 2

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source3 is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source4 is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "combiner is null"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x4

    new-array v0, v0, [LDj/a;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    const/4 p0, 0x3

    aput-object p3, v0, p0

    invoke-static {p4}, Lmg/a;->l(Lkg/h;)Lkg/n;

    move-result-object p0

    invoke-static {}, Lgg/i;->i()I

    move-result p1

    invoke-static {v0, p0, p1}, Lgg/i;->w([LDj/a;Lkg/n;I)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;
    .locals 2

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source3 is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "combiner is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x3

    new-array v0, v0, [LDj/a;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    invoke-static {p3}, Lmg/a;->k(Lkg/g;)Lkg/n;

    move-result-object p0

    invoke-static {}, Lgg/i;->i()I

    move-result p1

    invoke-static {v0, p0, p1}, Lgg/i;->w([LDj/a;Lkg/n;I)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static v(LDj/a;LDj/a;Lkg/b;)Lgg/i;
    .locals 2

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "combiner is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x2

    new-array v0, v0, [LDj/a;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    invoke-static {p2}, Lmg/a;->j(Lkg/b;)Lkg/n;

    move-result-object p0

    invoke-static {}, Lgg/i;->i()I

    move-result p1

    invoke-static {v0, p0, p1}, Lgg/i;->w([LDj/a;Lkg/n;I)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static w([LDj/a;Lkg/n;I)Lgg/i;
    .locals 2

    const-string v0, "sources is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    array-length v0, p0

    if-nez v0, :cond_0

    invoke-static {}, Lgg/i;->j0()Lgg/i;

    move-result-object p0

    return-object p0

    :cond_0
    const-string v0, "combiner is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "bufferSize"

    invoke-static {p2, v0}, Lmg/b;->b(ILjava/lang/String;)I

    new-instance v0, Lqg/e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lqg/e;-><init>([LDj/a;Lkg/n;IZ)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static y(LDj/a;LDj/a;)Lgg/i;
    .locals 2

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x2

    new-array v0, v0, [LDj/a;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    invoke-static {v0}, Lgg/i;->A([LDj/a;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static z(Ljava/lang/Iterable;)Lgg/i;
    .locals 3

    const-string v0, "sources is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p0}, Lgg/i;->A0(Ljava/lang/Iterable;)Lgg/i;

    move-result-object p0

    invoke-static {}, Lmg/a;->f()Lkg/n;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {p0, v0, v1, v2}, Lgg/i;->H(Lkg/n;ZI)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static varargs z0([Ljava/lang/Object;)Lgg/i;
    .locals 2

    const-string v0, "items is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    array-length v0, p0

    if-nez v0, :cond_0

    invoke-static {}, Lgg/i;->j0()Lgg/i;

    move-result-object p0

    return-object p0

    :cond_0
    array-length v0, p0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    aget-object p0, p0, v0

    invoke-static {p0}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v0, Lqg/B;

    invoke-direct {v0, p0}, Lqg/B;-><init>([Ljava/lang/Object;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A1()Lhg/c;
    .locals 3

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v0

    sget-object v1, Lmg/a;->f:Lkg/f;

    sget-object v2, Lmg/a;->c:Lkg/a;

    invoke-virtual {p0, v0, v1, v2}, Lgg/i;->C1(Lkg/f;Lkg/f;Lkg/a;)Lhg/c;

    move-result-object v0

    return-object v0
.end method

.method public final B(Lkg/n;)Lgg/i;
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lgg/i;->C(Lkg/n;I)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final B1(Lkg/f;Lkg/f;)Lhg/c;
    .locals 1

    sget-object v0, Lmg/a;->c:Lkg/a;

    invoke-virtual {p0, p1, p2, v0}, Lgg/i;->C1(Lkg/f;Lkg/f;Lkg/a;)Lhg/c;

    move-result-object p1

    return-object p1
.end method

.method public final C(Lkg/n;I)Lgg/i;
    .locals 2

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "prefetch"

    invoke-static {p2, v0}, Lmg/b;->b(ILjava/lang/String;)I

    instance-of v0, p0, LDg/e;

    if-eqz v0, :cond_1

    move-object p2, p0

    check-cast p2, LDg/e;

    invoke-interface {p2}, LDg/e;->get()Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_0

    invoke-static {}, Lgg/i;->j0()Lgg/i;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p2, p1}, Lqg/i0;->a(Ljava/lang/Object;Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Lqg/g;

    sget-object v1, Lzg/g;->IMMEDIATE:Lzg/g;

    invoke-direct {v0, p0, p1, p2, v1}, Lqg/g;-><init>(Lgg/i;Lkg/n;ILzg/g;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final C1(Lkg/f;Lkg/f;Lkg/a;)Lhg/c;
    .locals 2

    const-string v0, "onNext is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onError is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onComplete is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lxg/c;

    sget-object v1, Lqg/J$a;->INSTANCE:Lqg/J$a;

    invoke-direct {v0, p1, p2, p3, v1}, Lxg/c;-><init>(Lkg/f;Lkg/f;Lkg/a;Lkg/f;)V

    invoke-virtual {p0, v0}, Lgg/i;->D1(Lgg/l;)V

    return-object v0
.end method

.method public final D(Lkg/n;)Lgg/b;
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lgg/i;->E(Lkg/n;I)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final D1(Lgg/l;)V
    .locals 2

    const-string v0, "subscriber is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    :try_start_0
    invoke-static {p0, p1}, LEg/a;->z(Lgg/i;LDj/b;)LDj/b;

    move-result-object p1

    const-string v0, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lgg/i;->E1(LDj/b;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :goto_0
    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Actually not, but can\'t throw other exceptions due to RS"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v0

    :goto_1
    throw p1
.end method

.method public final E(Lkg/n;I)Lgg/b;
    .locals 2

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "prefetch"

    invoke-static {p2, v0}, Lmg/b;->b(ILjava/lang/String;)I

    new-instance v0, Lsg/d;

    sget-object v1, Lzg/g;->IMMEDIATE:Lzg/g;

    invoke-direct {v0, p0, p1, v1, p2}, Lsg/d;-><init>(Lgg/i;Lkg/n;Lzg/g;I)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final E0()Lgg/b;
    .locals 1

    new-instance v0, Lqg/I;

    invoke-direct {v0, p0}, Lqg/I;-><init>(Lgg/i;)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object v0

    return-object v0
.end method

.method protected abstract E1(LDj/b;)V
.end method

.method public final F(Lkg/n;)Lgg/b;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-virtual {p0, p1, v0, v1}, Lgg/i;->G(Lkg/n;ZI)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final F1(Lgg/y;)Lgg/i;
    .locals 1

    const-string v0, "scheduler is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    instance-of v0, p0, Lqg/i;

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, p1, v0}, Lgg/i;->G1(Lgg/y;Z)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final G(Lkg/n;ZI)Lgg/b;
    .locals 1

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "prefetch"

    invoke-static {p3, v0}, Lmg/b;->b(ILjava/lang/String;)I

    new-instance v0, Lsg/d;

    if-eqz p2, :cond_0

    sget-object p2, Lzg/g;->END:Lzg/g;

    goto :goto_0

    :cond_0
    sget-object p2, Lzg/g;->BOUNDARY:Lzg/g;

    :goto_0
    invoke-direct {v0, p0, p1, p2, p3}, Lsg/d;-><init>(Lgg/i;Lkg/n;Lzg/g;I)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final G1(Lgg/y;Z)Lgg/i;
    .locals 1

    const-string v0, "scheduler is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/p0;

    invoke-direct {v0, p0, p1, p2}, Lqg/p0;-><init>(Lgg/i;Lgg/y;Z)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final H(Lkg/n;ZI)Lgg/i;
    .locals 1

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "prefetch"

    invoke-static {p3, v0}, Lmg/b;->b(ILjava/lang/String;)I

    instance-of v0, p0, LDg/e;

    if-eqz v0, :cond_1

    move-object p2, p0

    check-cast p2, LDg/e;

    invoke-interface {p2}, LDg/e;->get()Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_0

    invoke-static {}, Lgg/i;->j0()Lgg/i;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p2, p1}, Lqg/i0;->a(Ljava/lang/Object;Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Lqg/g;

    if-eqz p2, :cond_2

    sget-object p2, Lzg/g;->END:Lzg/g;

    goto :goto_0

    :cond_2
    sget-object p2, Lzg/g;->BOUNDARY:Lzg/g;

    :goto_0
    invoke-direct {v0, p0, p1, p3, p2}, Lqg/g;-><init>(Lgg/i;Lkg/n;ILzg/g;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final H1(LDj/a;)Lgg/i;
    .locals 1

    const-string v0, "other is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/q0;

    invoke-direct {v0, p0, p1}, Lqg/q0;-><init>(Lgg/i;LDj/a;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final I(Lkg/n;)Lgg/i;
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lgg/i;->J(Lkg/n;I)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final I1(Lkg/n;)Lgg/i;
    .locals 1

    invoke-static {}, Lgg/i;->i()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lgg/i;->J1(Lkg/n;I)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final J(Lkg/n;I)Lgg/i;
    .locals 2

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "prefetch"

    invoke-static {p2, v0}, Lmg/b;->b(ILjava/lang/String;)I

    new-instance v0, Lsg/e;

    sget-object v1, Lzg/g;->IMMEDIATE:Lzg/g;

    invoke-direct {v0, p0, p1, v1, p2}, Lsg/e;-><init>(Lgg/i;Lkg/n;Lzg/g;I)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final J1(Lkg/n;I)Lgg/i;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lgg/i;->K1(Lkg/n;IZ)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final K(Lkg/n;)Lgg/i;
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lgg/i;->L(Lkg/n;I)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method K1(Lkg/n;IZ)Lgg/i;
    .locals 1

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "bufferSize"

    invoke-static {p2, v0}, Lmg/b;->b(ILjava/lang/String;)I

    instance-of v0, p0, LDg/e;

    if-eqz v0, :cond_1

    move-object p2, p0

    check-cast p2, LDg/e;

    invoke-interface {p2}, LDg/e;->get()Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_0

    invoke-static {}, Lgg/i;->j0()Lgg/i;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p2, p1}, Lqg/i0;->a(Ljava/lang/Object;Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Lqg/r0;

    invoke-direct {v0, p0, p1, p2, p3}, Lqg/r0;-><init>(Lgg/i;Lkg/n;IZ)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final L(Lkg/n;I)Lgg/i;
    .locals 2

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "prefetch"

    invoke-static {p2, v0}, Lmg/b;->b(ILjava/lang/String;)I

    new-instance v0, Lsg/f;

    sget-object v1, Lzg/g;->IMMEDIATE:Lzg/g;

    invoke-direct {v0, p0, p1, v1, p2}, Lsg/f;-><init>(Lgg/i;Lkg/n;Lzg/g;I)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final L1(Lkg/n;)Lgg/b;
    .locals 2

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lsg/g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lsg/g;-><init>(Lgg/i;Lkg/n;Z)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final M(Lgg/D;)Lgg/i;
    .locals 1

    const-string v0, "other is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/h;

    invoke-direct {v0, p0, p1}, Lqg/h;-><init>(Lgg/i;Lgg/D;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final M0()Lgg/n;
    .locals 1

    new-instance v0, Lqg/N;

    invoke-direct {v0, p0}, Lqg/N;-><init>(LDj/a;)V

    invoke-static {v0}, LEg/a;->p(Lgg/n;)Lgg/n;

    move-result-object v0

    return-object v0
.end method

.method public final M1(Lkg/n;)Lgg/i;
    .locals 2

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lsg/h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lsg/h;-><init>(Lgg/i;Lkg/n;Z)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final N0(Lkg/n;)Lgg/i;
    .locals 1

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/O;

    invoke-direct {v0, p0, p1}, Lqg/O;-><init>(Lgg/i;Lkg/n;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final N1(Lkg/n;)Lgg/i;
    .locals 2

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lsg/i;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lsg/i;-><init>(Lgg/i;Lkg/n;Z)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final O(JLjava/util/concurrent/TimeUnit;)Lgg/i;
    .locals 1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3, v0}, Lgg/i;->P(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final O1(J)Lgg/i;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    new-instance v0, Lqg/s0;

    invoke-direct {v0, p0, p1, p2}, Lqg/s0;-><init>(Lgg/i;J)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "count >= 0 required but it was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final P(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;
    .locals 8

    const-string v0, "unit is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/j;

    const/4 v7, 0x0

    move-object v1, v0

    move-object v2, p0

    move-wide v3, p1

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v7}, Lqg/j;-><init>(Lgg/i;JLjava/util/concurrent/TimeUnit;Lgg/y;Lkg/f;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final P1(JLjava/util/concurrent/TimeUnit;)Lgg/i;
    .locals 0

    invoke-static {p1, p2, p3}, Lgg/i;->d2(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object p1

    invoke-virtual {p0, p1}, Lgg/i;->Q1(LDj/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final Q(Ljava/lang/Object;)Lgg/i;
    .locals 1

    const-string v0, "defaultItem is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-virtual {p0, p1}, Lgg/i;->H1(LDj/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final Q1(LDj/a;)Lgg/i;
    .locals 1

    const-string v0, "other is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/t0;

    invoke-direct {v0, p0, p1}, Lqg/t0;-><init>(Lgg/i;LDj/a;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final R(JLjava/util/concurrent/TimeUnit;)Lgg/i;
    .locals 6

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lgg/i;->T(JLjava/util/concurrent/TimeUnit;Lgg/y;Z)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final R1(Lkg/p;)Lgg/i;
    .locals 1

    const-string v0, "stopPredicate is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/u0;

    invoke-direct {v0, p0, p1}, Lqg/u0;-><init>(Lgg/i;Lkg/p;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final S(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lgg/i;->T(JLjava/util/concurrent/TimeUnit;Lgg/y;Z)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final S1(JLjava/util/concurrent/TimeUnit;)Lgg/i;
    .locals 1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3, v0}, Lgg/i;->T1(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final T(JLjava/util/concurrent/TimeUnit;Lgg/y;Z)Lgg/i;
    .locals 8

    const-string v0, "unit is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/k;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    move-object v1, v0

    move-object v2, p0

    move-object v5, p3

    move-object v6, p4

    move v7, p5

    invoke-direct/range {v1 .. v7}, Lqg/k;-><init>(Lgg/i;JLjava/util/concurrent/TimeUnit;Lgg/y;Z)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final T0(LDj/a;)Lgg/i;
    .locals 1

    const-string v0, "other is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p0, p1}, Lgg/i;->Q0(LDj/a;LDj/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final T1(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;
    .locals 8

    const-string v0, "unit is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/v0;

    const/4 v7, 0x0

    move-object v1, v0

    move-object v2, p0

    move-wide v3, p1

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v7}, Lqg/v0;-><init>(Lgg/i;JLjava/util/concurrent/TimeUnit;Lgg/y;Lkg/f;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final U()Lgg/i;
    .locals 2

    invoke-static {}, Lmg/a;->f()Lkg/n;

    move-result-object v0

    invoke-static {}, Lmg/a;->d()Lkg/q;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lgg/i;->V(Lkg/n;Lkg/q;)Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method public final U0(Lgg/f;)Lgg/i;
    .locals 1

    const-string v0, "other is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/P;

    invoke-direct {v0, p0, p1}, Lqg/P;-><init>(Lgg/i;Lgg/f;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final U1(JLjava/util/concurrent/TimeUnit;)Lgg/i;
    .locals 6

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lgg/i;->W1(JLjava/util/concurrent/TimeUnit;Lgg/y;Z)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final V(Lkg/n;Lkg/q;)Lgg/i;
    .locals 1

    const-string v0, "keySelector is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "collectionSupplier is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/l;

    invoke-direct {v0, p0, p1, p2}, Lqg/l;-><init>(Lgg/i;Lkg/n;Lkg/q;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final V0(Lgg/r;)Lgg/i;
    .locals 1

    const-string v0, "other is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/Q;

    invoke-direct {v0, p0, p1}, Lqg/Q;-><init>(Lgg/i;Lgg/r;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final V1(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lgg/i;->W1(JLjava/util/concurrent/TimeUnit;Lgg/y;Z)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final W()Lgg/i;
    .locals 1

    invoke-static {}, Lmg/a;->f()Lkg/n;

    move-result-object v0

    invoke-virtual {p0, v0}, Lgg/i;->Y(Lkg/n;)Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method public final W1(JLjava/util/concurrent/TimeUnit;Lgg/y;Z)Lgg/i;
    .locals 9

    const-string v0, "unit is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/w0;

    const/4 v8, 0x0

    move-object v1, v0

    move-object v2, p0

    move-wide v3, p1

    move-object v5, p3

    move-object v6, p4

    move v7, p5

    invoke-direct/range {v1 .. v8}, Lqg/w0;-><init>(Lgg/i;JLjava/util/concurrent/TimeUnit;Lgg/y;ZLkg/f;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final X(Lkg/c;)Lgg/i;
    .locals 2

    const-string v0, "comparer is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/m;

    invoke-static {}, Lmg/a;->f()Lkg/n;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, Lqg/m;-><init>(Lgg/i;Lkg/n;Lkg/c;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final X0(Lgg/y;)Lgg/i;
    .locals 2

    const/4 v0, 0x0

    invoke-static {}, Lgg/i;->i()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final X1(JLjava/util/concurrent/TimeUnit;Z)Lgg/i;
    .locals 6

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v4

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lgg/i;->W1(JLjava/util/concurrent/TimeUnit;Lgg/y;Z)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final Y(Lkg/n;)Lgg/i;
    .locals 2

    const-string v0, "keySelector is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/m;

    invoke-static {}, Lmg/b;->a()Lkg/c;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1}, Lqg/m;-><init>(Lgg/i;Lkg/n;Lkg/c;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final Y0(Lgg/y;ZI)Lgg/i;
    .locals 1

    const-string v0, "scheduler is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "bufferSize"

    invoke-static {p3, v0}, Lmg/b;->b(ILjava/lang/String;)I

    new-instance v0, Lqg/T;

    invoke-direct {v0, p0, p1, p2, p3}, Lqg/T;-><init>(Lgg/i;Lgg/y;ZI)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final Y1(JLjava/util/concurrent/TimeUnit;)Lgg/i;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lgg/i;->O(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final Z(Lkg/a;)Lgg/i;
    .locals 1

    const-string v0, "onFinally is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/n;

    invoke-direct {v0, p0, p1}, Lqg/n;-><init>(Lgg/i;Lkg/a;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final Z0(Ljava/lang/Class;)Lgg/i;
    .locals 1

    const-string v0, "clazz is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p1}, Lmg/a;->g(Ljava/lang/Class;)Lkg/p;

    move-result-object v0

    invoke-virtual {p0, v0}, Lgg/i;->m0(Lkg/p;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lgg/i;->n(Ljava/lang/Class;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final Z1(JLjava/util/concurrent/TimeUnit;)Lgg/i;
    .locals 6

    const/4 v4, 0x0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v5

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lgg/i;->b2(JLjava/util/concurrent/TimeUnit;LDj/a;Lgg/y;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final a0(Lkg/a;)Lgg/i;
    .locals 3

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v0

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v1

    sget-object v2, Lmg/a;->c:Lkg/a;

    invoke-direct {p0, v0, v1, p1, v2}, Lgg/i;->c0(Lkg/f;Lkg/f;Lkg/a;Lkg/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final a1()Lgg/i;
    .locals 3

    invoke-static {}, Lgg/i;->i()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Lgg/i;->b1(IZZ)Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method public final a2(LDj/a;Lkg/n;)Lgg/i;
    .locals 1

    const-string v0, "firstTimeoutIndicator is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lgg/i;->c2(LDj/a;Lkg/n;LDj/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final b(LDj/b;)V
    .locals 1

    instance-of v0, p1, Lgg/l;

    if-eqz v0, :cond_0

    check-cast p1, Lgg/l;

    invoke-virtual {p0, p1}, Lgg/i;->D1(Lgg/l;)V

    goto :goto_0

    :cond_0
    const-string v0, "subscriber is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lxg/k;

    invoke-direct {v0, p1}, Lxg/k;-><init>(LDj/b;)V

    invoke-virtual {p0, v0}, Lgg/i;->D1(Lgg/l;)V

    :goto_0
    return-void
.end method

.method public final b0(LDj/b;)Lgg/i;
    .locals 3

    const-string v0, "subscriber is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p1}, Lqg/J;->d(LDj/b;)Lkg/f;

    move-result-object v0

    invoke-static {p1}, Lqg/J;->c(LDj/b;)Lkg/f;

    move-result-object v1

    invoke-static {p1}, Lqg/J;->b(LDj/b;)Lkg/a;

    move-result-object p1

    sget-object v2, Lmg/a;->c:Lkg/a;

    invoke-direct {p0, v0, v1, p1, v2}, Lgg/i;->c0(Lkg/f;Lkg/f;Lkg/a;Lkg/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final b1(IZZ)Lgg/i;
    .locals 8

    const-string v0, "capacity"

    invoke-static {p1, v0}, Lmg/b;->b(ILjava/lang/String;)I

    new-instance v0, Lqg/U;

    sget-object v6, Lmg/a;->c:Lkg/a;

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v7

    move-object v1, v0

    move-object v2, p0

    move v3, p1

    move v4, p3

    move v5, p2

    invoke-direct/range {v1 .. v7}, Lqg/U;-><init>(Lgg/i;IZZLkg/a;Lkg/f;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final c(JJLjava/util/concurrent/TimeUnit;Lgg/y;Lkg/q;)Lgg/i;
    .locals 12

    const-string v0, "unit is null"

    move-object/from16 v7, p5

    invoke-static {v7, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    move-object/from16 v8, p6

    invoke-static {v8, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "bufferSupplier is null"

    move-object/from16 v9, p7

    invoke-static {v9, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/c;

    const v10, 0x7fffffff

    const/4 v11, 0x0

    move-object v1, v0

    move-object v2, p0

    move-wide v3, p1

    move-wide v5, p3

    invoke-direct/range {v1 .. v11}, Lqg/c;-><init>(Lgg/i;JJLjava/util/concurrent/TimeUnit;Lgg/y;Lkg/q;IZ)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method public final c1()Lgg/i;
    .locals 1

    new-instance v0, Lqg/V;

    invoke-direct {v0, p0}, Lqg/V;-><init>(Lgg/i;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method public final d(JLjava/util/concurrent/TimeUnit;)Lgg/i;
    .locals 6

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v4

    const v5, 0x7fffffff

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lgg/i;->f(JLjava/util/concurrent/TimeUnit;Lgg/y;I)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final d0(Lkg/f;)Lgg/i;
    .locals 2

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v0

    sget-object v1, Lmg/a;->c:Lkg/a;

    invoke-direct {p0, v0, p1, v1, v1}, Lgg/i;->c0(Lkg/f;Lkg/f;Lkg/a;Lkg/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final d1(Lkg/f;)Lgg/i;
    .locals 1

    const-string v0, "onDrop is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/V;

    invoke-direct {v0, p0, p1}, Lqg/V;-><init>(Lgg/i;Lkg/f;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final e(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;
    .locals 8

    invoke-static {}, Lzg/b;->asSupplier()Lkg/q;

    move-result-object v6

    const/4 v7, 0x0

    const v5, 0x7fffffff

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v7}, Lgg/i;->g(JLjava/util/concurrent/TimeUnit;Lgg/y;ILkg/q;Z)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final e0(Lkg/f;Lkg/o;Lkg/a;)Lgg/i;
    .locals 1

    const-string v0, "onSubscribe is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onRequest is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onCancel is null"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/p;

    invoke-direct {v0, p0, p1, p2, p3}, Lqg/p;-><init>(Lgg/i;Lkg/f;Lkg/o;Lkg/a;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final e1()Lgg/i;
    .locals 2

    new-instance v0, Lqg/X;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lqg/X;-><init>(Lgg/i;Lkg/f;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method public final f(JLjava/util/concurrent/TimeUnit;Lgg/y;I)Lgg/i;
    .locals 8

    invoke-static {}, Lzg/b;->asSupplier()Lkg/q;

    move-result-object v6

    const/4 v7, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v7}, Lgg/i;->g(JLjava/util/concurrent/TimeUnit;Lgg/y;ILkg/q;Z)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final f0(Lkg/f;)Lgg/i;
    .locals 2

    invoke-static {}, Lmg/a;->e()Lkg/f;

    move-result-object v0

    sget-object v1, Lmg/a;->c:Lkg/a;

    invoke-direct {p0, p1, v0, v1, v1}, Lgg/i;->c0(Lkg/f;Lkg/f;Lkg/a;Lkg/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final f1(Lkg/n;)Lgg/i;
    .locals 1

    const-string v0, "fallbackSupplier is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/Y;

    invoke-direct {v0, p0, p1}, Lqg/Y;-><init>(Lgg/i;Lkg/n;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final f2()Lgg/s;
    .locals 1

    new-instance v0, Ltg/E;

    invoke-direct {v0, p0}, Ltg/E;-><init>(LDj/a;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object v0

    return-object v0
.end method

.method public final g(JLjava/util/concurrent/TimeUnit;Lgg/y;ILkg/q;Z)Lgg/i;
    .locals 12

    const-string v0, "unit is null"

    move-object v7, p3

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "scheduler is null"

    move-object/from16 v8, p4

    invoke-static {v8, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "bufferSupplier is null"

    move-object/from16 v9, p6

    invoke-static {v9, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "count"

    move/from16 v10, p5

    invoke-static {v10, v0}, Lmg/b;->b(ILjava/lang/String;)I

    new-instance v0, Lqg/c;

    move-object v1, v0

    move-object v2, p0

    move-wide v3, p1

    move-wide v5, p1

    move/from16 v11, p7

    invoke-direct/range {v1 .. v11}, Lqg/c;-><init>(Lgg/i;JJLjava/util/concurrent/TimeUnit;Lgg/y;Lkg/q;IZ)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method public final g0(Lkg/f;)Lgg/i;
    .locals 2

    sget-object v0, Lmg/a;->g:Lkg/o;

    sget-object v1, Lmg/a;->c:Lkg/a;

    invoke-virtual {p0, p1, v0, v1}, Lgg/i;->e0(Lkg/f;Lkg/o;Lkg/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final g1(Lkg/n;)Lgg/i;
    .locals 1

    const-string v0, "itemSupplier is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/Z;

    invoke-direct {v0, p0, p1}, Lqg/Z;-><init>(Lgg/i;Lkg/n;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final g2(Lgg/y;)Lgg/i;
    .locals 1

    const-string v0, "scheduler is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/A0;

    invoke-direct {v0, p0, p1}, Lqg/A0;-><init>(Lgg/i;Lgg/y;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final h0(J)Lgg/n;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    new-instance v0, Lqg/r;

    invoke-direct {v0, p0, p1, p2}, Lqg/r;-><init>(Lgg/i;J)V

    invoke-static {v0}, LEg/a;->p(Lgg/n;)Lgg/n;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "index >= 0 required but it was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h1()Ljg/a;
    .locals 1

    invoke-static {}, Lgg/i;->i()I

    move-result v0

    invoke-virtual {p0, v0}, Lgg/i;->i1(I)Ljg/a;

    move-result-object v0

    return-object v0
.end method

.method public final i0(J)Lgg/z;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    new-instance v0, Lqg/s;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lqg/s;-><init>(Lgg/i;JLjava/lang/Object;)V

    invoke-static {v0}, LEg/a;->r(Lgg/z;)Lgg/z;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "index >= 0 required but it was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final i1(I)Ljg/a;
    .locals 1

    const-string v0, "bufferSize"

    invoke-static {p1, v0}, Lmg/b;->b(ILjava/lang/String;)I

    new-instance v0, Lqg/a0;

    invoke-direct {v0, p0, p1}, Lqg/a0;-><init>(LDj/a;I)V

    invoke-static {v0}, LEg/a;->s(Ljg/a;)Ljg/a;

    move-result-object p1

    return-object p1
.end method

.method public final k()Lgg/i;
    .locals 1

    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lgg/i;->l(I)Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method public final k1()Lgg/i;
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, v0, v1}, Lgg/i;->l1(J)Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method public final l(I)Lgg/i;
    .locals 1

    const-string v0, "initialCapacity"

    invoke-static {p1, v0}, Lmg/b;->b(ILjava/lang/String;)I

    new-instance v0, Lqg/d;

    invoke-direct {v0, p0, p1}, Lqg/d;-><init>(Lgg/i;I)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final l1(J)Lgg/i;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_1

    if-nez v0, :cond_0

    invoke-static {}, Lgg/i;->j0()Lgg/i;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lqg/d0;

    invoke-direct {v0, p0, p1, p2}, Lqg/d0;-><init>(Lgg/i;J)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "times >= 0 required but it was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final m0(Lkg/p;)Lgg/i;
    .locals 1

    const-string v0, "predicate is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/v;

    invoke-direct {v0, p0, p1}, Lqg/v;-><init>(Lgg/i;Lkg/p;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final m1(Lkg/d;)Lgg/i;
    .locals 1

    const-string v0, "stop is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/e0;

    invoke-direct {v0, p0, p1}, Lqg/e0;-><init>(Lgg/i;Lkg/d;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final n(Ljava/lang/Class;)Lgg/i;
    .locals 1

    const-string v0, "clazz is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p1}, Lmg/a;->c(Ljava/lang/Class;)Lkg/n;

    move-result-object p1

    invoke-virtual {p0, p1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final n0()Lgg/n;
    .locals 2

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lgg/i;->h0(J)Lgg/n;

    move-result-object v0

    return-object v0
.end method

.method public final n1(Lkg/n;)Lgg/i;
    .locals 1

    const-string v0, "handler is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/f0;

    invoke-direct {v0, p0, p1}, Lqg/f0;-><init>(Lgg/i;Lkg/n;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final o0()Lgg/z;
    .locals 2

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lgg/i;->i0(J)Lgg/z;

    move-result-object v0

    return-object v0
.end method

.method public final o1(I)Ljg/a;
    .locals 1

    const-string v0, "bufferSize"

    invoke-static {p1, v0}, Lmg/b;->b(ILjava/lang/String;)I

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lqg/g0;->m2(Lgg/i;IZ)Ljg/a;

    move-result-object p1

    return-object p1
.end method

.method public final p0(Lkg/n;)Lgg/i;
    .locals 3

    invoke-static {}, Lgg/i;->i()I

    move-result v0

    invoke-static {}, Lgg/i;->i()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v2, v0, v1}, Lgg/i;->s0(Lkg/n;ZII)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final p1(Lkg/n;)Lgg/i;
    .locals 1

    const-string v0, "handler is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/h0;

    invoke-direct {v0, p0, p1}, Lqg/h0;-><init>(Lgg/i;Lkg/n;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final q0(Lkg/n;I)Lgg/i;
    .locals 2

    const/4 v0, 0x0

    invoke-static {}, Lgg/i;->i()I

    move-result v1

    invoke-virtual {p0, p1, v0, p2, v1}, Lgg/i;->s0(Lkg/n;ZII)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final q1(Ljava/lang/Object;Lkg/b;)Lgg/i;
    .locals 1

    const-string v0, "initialValue is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p1}, Lmg/a;->h(Ljava/lang/Object;)Lkg/q;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lgg/i;->s1(Lkg/q;Lkg/b;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final r0(Lkg/n;ZI)Lgg/i;
    .locals 1

    invoke-static {}, Lgg/i;->i()I

    move-result v0

    invoke-virtual {p0, p1, p2, p3, v0}, Lgg/i;->s0(Lkg/n;ZII)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final r1(Lkg/b;)Lgg/i;
    .locals 1

    const-string v0, "accumulator is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/j0;

    invoke-direct {v0, p0, p1}, Lqg/j0;-><init>(Lgg/i;Lkg/b;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final s0(Lkg/n;ZII)Lgg/i;
    .locals 7

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "maxConcurrency"

    invoke-static {p3, v0}, Lmg/b;->b(ILjava/lang/String;)I

    const-string v0, "bufferSize"

    invoke-static {p4, v0}, Lmg/b;->b(ILjava/lang/String;)I

    instance-of v0, p0, LDg/e;

    if-eqz v0, :cond_1

    move-object p2, p0

    check-cast p2, LDg/e;

    invoke-interface {p2}, LDg/e;->get()Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_0

    invoke-static {}, Lgg/i;->j0()Lgg/i;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p2, p1}, Lqg/i0;->a(Ljava/lang/Object;Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v6, Lqg/w;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lqg/w;-><init>(Lgg/i;Lkg/n;ZII)V

    invoke-static {v6}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final s1(Lkg/q;Lkg/b;)Lgg/i;
    .locals 1

    const-string v0, "seedSupplier is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "accumulator is null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/k0;

    invoke-direct {v0, p0, p1, p2}, Lqg/k0;-><init>(Lgg/i;Lkg/q;Lkg/b;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final t0(Lkg/n;)Lgg/b;
    .locals 2

    const/4 v0, 0x0

    const v1, 0x7fffffff

    invoke-virtual {p0, p1, v0, v1}, Lgg/i;->u0(Lkg/n;ZI)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final t1()Lgg/i;
    .locals 1

    invoke-virtual {p0}, Lgg/i;->h1()Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method public final u0(Lkg/n;ZI)Lgg/b;
    .locals 1

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "maxConcurrency"

    invoke-static {p3, v0}, Lmg/b;->b(ILjava/lang/String;)I

    new-instance v0, Lqg/y;

    invoke-direct {v0, p0, p1, p2, p3}, Lqg/y;-><init>(Lgg/i;Lkg/n;ZI)V

    invoke-static {v0}, LEg/a;->n(Lgg/b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public final u1(J)Lgg/i;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_1

    if-nez v0, :cond_0

    invoke-static {p0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lqg/n0;

    invoke-direct {v0, p0, p1, p2}, Lqg/n0;-><init>(Lgg/i;J)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "count >= 0 expected but it was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final v0(Lkg/n;)Lgg/i;
    .locals 2

    const/4 v0, 0x0

    const v1, 0x7fffffff

    invoke-virtual {p0, p1, v0, v1}, Lgg/i;->w0(Lkg/n;ZI)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final v1(JLjava/util/concurrent/TimeUnit;)Lgg/i;
    .locals 0

    invoke-static {p1, p2, p3}, Lgg/i;->d2(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object p1

    invoke-virtual {p0, p1}, Lgg/i;->w1(LDj/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final w0(Lkg/n;ZI)Lgg/i;
    .locals 1

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "maxConcurrency"

    invoke-static {p3, v0}, Lmg/b;->b(ILjava/lang/String;)I

    new-instance v0, Lqg/z;

    invoke-direct {v0, p0, p1, p2, p3}, Lqg/z;-><init>(Lgg/i;Lkg/n;ZI)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final w1(LDj/a;)Lgg/i;
    .locals 1

    const-string v0, "other is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqg/o0;

    invoke-direct {v0, p0, p1}, Lqg/o0;-><init>(Lgg/i;LDj/a;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final x(Lgg/m;)Lgg/i;
    .locals 1

    const-string v0, "composer is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Lgg/m;

    invoke-interface {p1, p0}, Lgg/m;->a(Lgg/i;)LDj/a;

    move-result-object p1

    invoke-static {p1}, Lgg/i;->B0(LDj/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final x0(Lkg/n;)Lgg/i;
    .locals 2

    const/4 v0, 0x0

    const v1, 0x7fffffff

    invoke-virtual {p0, p1, v0, v1}, Lgg/i;->y0(Lkg/n;ZI)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final x1(LDj/a;)Lgg/i;
    .locals 2

    const-string v0, "other is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x2

    new-array v0, v0, [LDj/a;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p0, v0, p1

    invoke-static {v0}, Lgg/i;->A([LDj/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final y0(Lkg/n;ZI)Lgg/i;
    .locals 1

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "maxConcurrency"

    invoke-static {p3, v0}, Lmg/b;->b(ILjava/lang/String;)I

    new-instance v0, Lqg/A;

    invoke-direct {v0, p0, p1, p2, p3}, Lqg/A;-><init>(Lgg/i;Lkg/n;ZI)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final y1(Lgg/D;)Lgg/i;
    .locals 1

    const-string v0, "other is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p1}, Lgg/z;->a0(Lgg/D;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->W()Lgg/i;

    move-result-object p1

    invoke-static {p1, p0}, Lgg/i;->y(LDj/a;LDj/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final z1(Ljava/lang/Object;)Lgg/i;
    .locals 2

    const-string v0, "item is null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const/4 v0, 0x2

    new-array v0, v0, [LDj/a;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p0, v0, p1

    invoke-static {v0}, Lgg/i;->A([LDj/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method
