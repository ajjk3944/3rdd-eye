.class public abstract Ldd/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldd/a;


# instance fields
.field private final a:Lcd/a;

.field private final b:LYc/c;


# direct methods
.method public constructor <init>(Lcd/a;LYc/c;)V
    .locals 1

    const-string v0, "icmp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkHandle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldd/c;->a:Lcd/a;

    iput-object p2, p0, Ldd/c;->b:LYc/c;

    return-void
.end method

.method public static synthetic b(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Ldd/c;->g(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic c(Ldd/c;)Lcd/a;
    .locals 0

    iget-object p0, p0, Ldd/c;->a:Lcd/a;

    return-object p0
.end method

.method public static final synthetic d(Ldd/c;)LYc/c;
    .locals 0

    iget-object p0, p0, Ldd/c;->b:LYc/c;

    return-object p0
.end method

.method public static final synthetic e(Ldd/c;Ljava/lang/String;Linet/ipaddr/g;Ljava/util/List;Ljava/util/LinkedList;IZ)Ldd/i;
    .locals 0

    invoke-direct/range {p0 .. p6}, Ldd/c;->f(Ljava/lang/String;Linet/ipaddr/g;Ljava/util/List;Ljava/util/LinkedList;IZ)Ldd/i;

    move-result-object p0

    return-object p0
.end method

.method private final f(Ljava/lang/String;Linet/ipaddr/g;Ljava/util/List;Ljava/util/LinkedList;IZ)Ldd/i;
    .locals 16

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    move/from16 v3, p5

    int-to-long v3, v3

    sub-long/2addr v1, v3

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lsh/m;->p(II)Lsh/g;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v5, v3

    check-cast v5, LZg/Q;

    invoke-virtual {v5}, LZg/Q;->d()I

    move-result v5

    move-object/from16 v6, p3

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LWc/c;

    invoke-virtual {v5}, LWc/c;->c()J

    move-result-wide v7

    cmp-long v7, v7, v1

    if-gez v7, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v5}, LWc/c;->d()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcd/a$c;

    if-eqz v5, :cond_0

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    move-object/from16 v6, p3

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move-object v5, v2

    move v3, v4

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcd/a$c;

    instance-of v8, v7, Lcd/a$c$b;

    if-eqz v8, :cond_4

    add-int/lit8 v4, v4, 0x1

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    check-cast v7, Lcd/a$c$b;

    invoke-virtual {v7}, Lcd/a$c$b;->a()I

    move-result v7

    add-int/2addr v3, v7

    goto :goto_1

    :cond_4
    instance-of v7, v7, Lcd/a$c$a;

    if-eqz v7, :cond_5

    if-nez v5, :cond_3

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_1

    :cond_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_6
    if-nez p6, :cond_7

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_7
    move-object v9, v5

    if-eqz p6, :cond_8

    if-lez v4, :cond_8

    sget-object v1, Lb8/b;->a:Lb8/b$b;

    div-int/2addr v3, v4

    invoke-virtual {v1, v3}, Lb8/b$b;->a(I)Lb8/b;

    move-result-object v1

    goto :goto_2

    :cond_8
    move-object v1, v2

    :goto_2
    new-instance v3, LWc/c;

    const/4 v14, 0x1

    const/4 v15, 0x0

    const-wide/16 v11, 0x0

    move-object v10, v3

    move-object v13, v1

    invoke-direct/range {v10 .. v15}, LWc/c;-><init>(JLjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v5, p4

    invoke-virtual {v5, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    if-eqz p6, :cond_b

    invoke-static/range {p3 .. p3}, LZg/v;->D0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LWc/c;

    if-eqz v3, :cond_b

    invoke-virtual {v3}, LWc/c;->d()Ljava/lang/Object;

    move-result-object v3

    instance-of v6, v3, Lcd/a$c$b;

    if-eqz v6, :cond_9

    check-cast v3, Lcd/a$c$b;

    goto :goto_3

    :cond_9
    move-object v3, v2

    :goto_3
    if-eqz v3, :cond_a

    sget-object v6, Lb8/b;->a:Lb8/b$b;

    invoke-virtual {v3}, Lcd/a$c$b;->a()I

    move-result v3

    invoke-virtual {v6, v3}, Lb8/b$b;->a(I)Lb8/b;

    move-result-object v3

    goto :goto_4

    :cond_a
    move-object v3, v2

    :goto_4
    move-object v11, v3

    goto :goto_5

    :cond_b
    move-object v11, v2

    :goto_5
    if-nez p6, :cond_d

    sget-object v0, Lb8/d;->a:Lb8/d$b;

    invoke-virtual {v0}, Lb8/d$b;->c()Lb8/d;

    move-result-object v2

    :cond_c
    :goto_6
    move-object v12, v2

    goto :goto_7

    :cond_d
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_c

    sget-object v2, Lb8/d;->a:Lb8/d$b;

    int-to-float v3, v4

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v3, v0

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, v3

    invoke-virtual {v2, v0}, Lb8/d$b;->b(F)Lb8/d;

    move-result-object v2

    goto :goto_6

    :goto_7
    invoke-static/range {p4 .. p4}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v13

    new-instance v0, Ldd/i;

    move-object v6, v0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move-object v10, v1

    invoke-direct/range {v6 .. v13}, Ldd/i;-><init>(Ljava/lang/String;Linet/ipaddr/g;Ljava/lang/Boolean;Lb8/b;Lb8/b;Lb8/d;Ljava/util/List;)V

    return-object v0
.end method

.method private static final g(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HOST "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " status finished"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;II)Lgg/i;
    .locals 2

    const-string v0, "host"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldd/c$a;

    invoke-direct {v0}, Ldd/c$a;-><init>()V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ldd/c$b;

    invoke-direct {v1, p0, p1, p3, p2}, Ldd/c$b;-><init>(Ldd/c;Ljava/lang/String;II)V

    invoke-virtual {v0, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p2

    new-instance p3, Ldd/c$c;

    invoke-direct {p3, p1}, Ldd/c$c;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p2

    new-instance p3, Ldd/b;

    invoke-direct {p3, p1}, Ldd/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p1

    const-string p2, "doFinally(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
