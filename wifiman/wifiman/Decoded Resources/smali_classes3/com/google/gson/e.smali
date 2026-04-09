.class public final Lcom/google/gson/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/gson/e$f;
    }
.end annotation


# static fields
.field static final A:Lcom/google/gson/d;

.field static final B:Ljava/lang/String;

.field static final C:Lcom/google/gson/c;

.field static final D:Lcom/google/gson/o;

.field static final E:Lcom/google/gson/o;

.field static final z:Lcom/google/gson/m;


# instance fields
.field private final a:Ljava/lang/ThreadLocal;

.field private final b:Ljava/util/concurrent/ConcurrentMap;

.field private final c:Lt5/c;

.field private final d:Lcom/google/gson/internal/bind/d;

.field final e:Ljava/util/List;

.field final f:Lt5/d;

.field final g:Lcom/google/gson/c;

.field final h:Ljava/util/Map;

.field final i:Z

.field final j:Z

.field final k:Z

.field final l:Z

.field final m:Lcom/google/gson/d;

.field final n:Lcom/google/gson/m;

.field final o:Z

.field final p:Z

.field final q:Ljava/lang/String;

.field final r:I

.field final s:I

.field final t:Lcom/google/gson/k;

.field final u:Ljava/util/List;

.field final v:Ljava/util/List;

.field final w:Lcom/google/gson/o;

.field final x:Lcom/google/gson/o;

.field final y:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/gson/d;->d:Lcom/google/gson/d;

    sput-object v0, Lcom/google/gson/e;->A:Lcom/google/gson/d;

    const/4 v0, 0x0

    sput-object v0, Lcom/google/gson/e;->B:Ljava/lang/String;

    sget-object v0, Lcom/google/gson/b;->IDENTITY:Lcom/google/gson/b;

    sput-object v0, Lcom/google/gson/e;->C:Lcom/google/gson/c;

    sget-object v0, Lcom/google/gson/n;->DOUBLE:Lcom/google/gson/n;

    sput-object v0, Lcom/google/gson/e;->D:Lcom/google/gson/o;

    sget-object v0, Lcom/google/gson/n;->LAZILY_PARSED_NUMBER:Lcom/google/gson/n;

    sput-object v0, Lcom/google/gson/e;->E:Lcom/google/gson/o;

    return-void
.end method

.method public constructor <init>()V
    .locals 22

    move-object/from16 v0, p0

    .line 1
    sget-object v1, Lt5/d;->g:Lt5/d;

    sget-object v2, Lcom/google/gson/e;->C:Lcom/google/gson/c;

    .line 2
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v3

    sget-object v8, Lcom/google/gson/e;->A:Lcom/google/gson/d;

    sget-object v9, Lcom/google/gson/e;->z:Lcom/google/gson/m;

    sget-object v12, Lcom/google/gson/k;->DEFAULT:Lcom/google/gson/k;

    sget-object v13, Lcom/google/gson/e;->B:Ljava/lang/String;

    .line 3
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v16

    .line 4
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v17

    .line 5
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v18

    sget-object v19, Lcom/google/gson/e;->D:Lcom/google/gson/o;

    sget-object v20, Lcom/google/gson/e;->E:Lcom/google/gson/o;

    .line 6
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v21

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v14, 0x2

    const/4 v15, 0x2

    .line 7
    invoke-direct/range {v0 .. v21}, Lcom/google/gson/e;-><init>(Lt5/d;Lcom/google/gson/c;Ljava/util/Map;ZZZZLcom/google/gson/d;Lcom/google/gson/m;ZZLcom/google/gson/k;Ljava/lang/String;IILjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/google/gson/o;Lcom/google/gson/o;Ljava/util/List;)V

    return-void
.end method

.method constructor <init>(Lt5/d;Lcom/google/gson/c;Ljava/util/Map;ZZZZLcom/google/gson/d;Lcom/google/gson/m;ZZLcom/google/gson/k;Ljava/lang/String;IILjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/google/gson/o;Lcom/google/gson/o;Ljava/util/List;)V
    .locals 13

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p3

    move/from16 v3, p5

    move/from16 v4, p10

    move/from16 v5, p11

    move-object/from16 v6, p21

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v7, Ljava/lang/ThreadLocal;

    invoke-direct {v7}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v7, v0, Lcom/google/gson/e;->a:Ljava/lang/ThreadLocal;

    .line 10
    new-instance v7, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v7}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v7, v0, Lcom/google/gson/e;->b:Ljava/util/concurrent/ConcurrentMap;

    .line 11
    iput-object v1, v0, Lcom/google/gson/e;->f:Lt5/d;

    move-object v7, p2

    .line 12
    iput-object v7, v0, Lcom/google/gson/e;->g:Lcom/google/gson/c;

    .line 13
    iput-object v2, v0, Lcom/google/gson/e;->h:Ljava/util/Map;

    .line 14
    new-instance v8, Lt5/c;

    invoke-direct {v8, v2, v5, v6}, Lt5/c;-><init>(Ljava/util/Map;ZLjava/util/List;)V

    iput-object v8, v0, Lcom/google/gson/e;->c:Lt5/c;

    move/from16 v2, p4

    .line 15
    iput-boolean v2, v0, Lcom/google/gson/e;->i:Z

    .line 16
    iput-boolean v3, v0, Lcom/google/gson/e;->j:Z

    move/from16 v2, p6

    .line 17
    iput-boolean v2, v0, Lcom/google/gson/e;->k:Z

    move/from16 v2, p7

    .line 18
    iput-boolean v2, v0, Lcom/google/gson/e;->l:Z

    move-object/from16 v2, p8

    .line 19
    iput-object v2, v0, Lcom/google/gson/e;->m:Lcom/google/gson/d;

    move-object/from16 v2, p9

    .line 20
    iput-object v2, v0, Lcom/google/gson/e;->n:Lcom/google/gson/m;

    .line 21
    iput-boolean v4, v0, Lcom/google/gson/e;->o:Z

    .line 22
    iput-boolean v5, v0, Lcom/google/gson/e;->p:Z

    move-object/from16 v2, p12

    .line 23
    iput-object v2, v0, Lcom/google/gson/e;->t:Lcom/google/gson/k;

    move-object/from16 v5, p13

    .line 24
    iput-object v5, v0, Lcom/google/gson/e;->q:Ljava/lang/String;

    move/from16 v5, p14

    .line 25
    iput v5, v0, Lcom/google/gson/e;->r:I

    move/from16 v5, p15

    .line 26
    iput v5, v0, Lcom/google/gson/e;->s:I

    move-object/from16 v5, p16

    .line 27
    iput-object v5, v0, Lcom/google/gson/e;->u:Ljava/util/List;

    move-object/from16 v5, p17

    .line 28
    iput-object v5, v0, Lcom/google/gson/e;->v:Ljava/util/List;

    move-object/from16 v5, p19

    .line 29
    iput-object v5, v0, Lcom/google/gson/e;->w:Lcom/google/gson/o;

    move-object/from16 v9, p20

    .line 30
    iput-object v9, v0, Lcom/google/gson/e;->x:Lcom/google/gson/o;

    .line 31
    iput-object v6, v0, Lcom/google/gson/e;->y:Ljava/util/List;

    .line 32
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 33
    sget-object v11, Lcom/google/gson/internal/bind/l;->W:Lcom/google/gson/q;

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    invoke-static/range {p19 .. p19}, Lcom/google/gson/internal/bind/h;->e(Lcom/google/gson/o;)Lcom/google/gson/q;

    move-result-object v5

    invoke-interface {v10, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    invoke-interface {v10, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v5, p18

    .line 36
    invoke-interface {v10, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 37
    sget-object v5, Lcom/google/gson/internal/bind/l;->C:Lcom/google/gson/q;

    invoke-interface {v10, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    sget-object v5, Lcom/google/gson/internal/bind/l;->m:Lcom/google/gson/q;

    invoke-interface {v10, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    sget-object v5, Lcom/google/gson/internal/bind/l;->g:Lcom/google/gson/q;

    invoke-interface {v10, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    sget-object v5, Lcom/google/gson/internal/bind/l;->i:Lcom/google/gson/q;

    invoke-interface {v10, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    sget-object v5, Lcom/google/gson/internal/bind/l;->k:Lcom/google/gson/q;

    invoke-interface {v10, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    invoke-static/range {p12 .. p12}, Lcom/google/gson/e;->o(Lcom/google/gson/k;)Lcom/google/gson/p;

    move-result-object v2

    .line 43
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class v11, Ljava/lang/Long;

    invoke-static {v5, v11, v2}, Lcom/google/gson/internal/bind/l;->b(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v5

    invoke-interface {v10, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    const-class v11, Ljava/lang/Double;

    .line 45
    invoke-direct {p0, v4}, Lcom/google/gson/e;->e(Z)Lcom/google/gson/p;

    move-result-object v12

    .line 46
    invoke-static {v5, v11, v12}, Lcom/google/gson/internal/bind/l;->b(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v5

    .line 47
    invoke-interface {v10, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const-class v11, Ljava/lang/Float;

    .line 49
    invoke-direct {p0, v4}, Lcom/google/gson/e;->f(Z)Lcom/google/gson/p;

    move-result-object v4

    .line 50
    invoke-static {v5, v11, v4}, Lcom/google/gson/internal/bind/l;->b(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v4

    .line 51
    invoke-interface {v10, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    invoke-static/range {p20 .. p20}, Lcom/google/gson/internal/bind/g;->e(Lcom/google/gson/o;)Lcom/google/gson/q;

    move-result-object v4

    invoke-interface {v10, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    sget-object v4, Lcom/google/gson/internal/bind/l;->o:Lcom/google/gson/q;

    invoke-interface {v10, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    sget-object v4, Lcom/google/gson/internal/bind/l;->q:Lcom/google/gson/q;

    invoke-interface {v10, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 55
    const-class v4, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v2}, Lcom/google/gson/e;->b(Lcom/google/gson/p;)Lcom/google/gson/p;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/google/gson/internal/bind/l;->a(Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v4

    invoke-interface {v10, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    const-class v4, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 57
    invoke-static {v2}, Lcom/google/gson/e;->c(Lcom/google/gson/p;)Lcom/google/gson/p;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/google/gson/internal/bind/l;->a(Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v2

    .line 58
    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    sget-object v2, Lcom/google/gson/internal/bind/l;->s:Lcom/google/gson/q;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    sget-object v2, Lcom/google/gson/internal/bind/l;->x:Lcom/google/gson/q;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    sget-object v2, Lcom/google/gson/internal/bind/l;->E:Lcom/google/gson/q;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    sget-object v2, Lcom/google/gson/internal/bind/l;->G:Lcom/google/gson/q;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    const-class v2, Ljava/math/BigDecimal;

    sget-object v4, Lcom/google/gson/internal/bind/l;->z:Lcom/google/gson/p;

    invoke-static {v2, v4}, Lcom/google/gson/internal/bind/l;->a(Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v2

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    const-class v2, Ljava/math/BigInteger;

    sget-object v4, Lcom/google/gson/internal/bind/l;->A:Lcom/google/gson/p;

    invoke-static {v2, v4}, Lcom/google/gson/internal/bind/l;->a(Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v2

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    const-class v2, Lt5/g;

    sget-object v4, Lcom/google/gson/internal/bind/l;->B:Lcom/google/gson/p;

    .line 66
    invoke-static {v2, v4}, Lcom/google/gson/internal/bind/l;->a(Ljava/lang/Class;Lcom/google/gson/p;)Lcom/google/gson/q;

    move-result-object v2

    .line 67
    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    sget-object v2, Lcom/google/gson/internal/bind/l;->I:Lcom/google/gson/q;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    sget-object v2, Lcom/google/gson/internal/bind/l;->K:Lcom/google/gson/q;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    sget-object v2, Lcom/google/gson/internal/bind/l;->O:Lcom/google/gson/q;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    sget-object v2, Lcom/google/gson/internal/bind/l;->Q:Lcom/google/gson/q;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    sget-object v2, Lcom/google/gson/internal/bind/l;->U:Lcom/google/gson/q;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    sget-object v2, Lcom/google/gson/internal/bind/l;->M:Lcom/google/gson/q;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    sget-object v2, Lcom/google/gson/internal/bind/l;->d:Lcom/google/gson/q;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    sget-object v2, Lcom/google/gson/internal/bind/c;->c:Lcom/google/gson/q;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    sget-object v2, Lcom/google/gson/internal/bind/l;->S:Lcom/google/gson/q;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 77
    sget-boolean v2, Lcom/google/gson/internal/sql/d;->a:Z

    if-eqz v2, :cond_0

    .line 78
    sget-object v2, Lcom/google/gson/internal/sql/d;->e:Lcom/google/gson/q;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    sget-object v2, Lcom/google/gson/internal/sql/d;->d:Lcom/google/gson/q;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    sget-object v2, Lcom/google/gson/internal/sql/d;->f:Lcom/google/gson/q;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 81
    :cond_0
    sget-object v2, Lcom/google/gson/internal/bind/a;->c:Lcom/google/gson/q;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    sget-object v2, Lcom/google/gson/internal/bind/l;->b:Lcom/google/gson/q;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    new-instance v2, Lcom/google/gson/internal/bind/b;

    invoke-direct {v2, v8}, Lcom/google/gson/internal/bind/b;-><init>(Lt5/c;)V

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    new-instance v2, Lcom/google/gson/internal/bind/f;

    invoke-direct {v2, v8, v3}, Lcom/google/gson/internal/bind/f;-><init>(Lt5/c;Z)V

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 85
    new-instance v2, Lcom/google/gson/internal/bind/d;

    invoke-direct {v2, v8}, Lcom/google/gson/internal/bind/d;-><init>(Lt5/c;)V

    iput-object v2, v0, Lcom/google/gson/e;->d:Lcom/google/gson/internal/bind/d;

    .line 86
    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 87
    sget-object v3, Lcom/google/gson/internal/bind/l;->X:Lcom/google/gson/q;

    invoke-interface {v10, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    new-instance v3, Lcom/google/gson/internal/bind/i;

    move-object/from16 p3, v3

    move-object/from16 p4, v8

    move-object/from16 p5, p2

    move-object/from16 p6, p1

    move-object/from16 p7, v2

    move-object/from16 p8, p21

    invoke-direct/range {p3 .. p8}, Lcom/google/gson/internal/bind/i;-><init>(Lt5/c;Lcom/google/gson/c;Lt5/d;Lcom/google/gson/internal/bind/d;Ljava/util/List;)V

    invoke-interface {v10, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 89
    invoke-static {v10}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lcom/google/gson/e;->e:Ljava/util/List;

    return-void
.end method

.method private static a(Ljava/lang/Object;Lw5/a;)V
    .locals 0

    if-eqz p0, :cond_1

    :try_start_0
    invoke-virtual {p1}, Lw5/a;->v0()Lw5/b;

    move-result-object p0

    sget-object p1, Lw5/b;->END_DOCUMENT:Lw5/b;

    if-ne p0, p1, :cond_0

    goto :goto_2

    :cond_0
    new-instance p0, Lcom/google/gson/JsonSyntaxException;

    const-string/jumbo p1, "JSON document was not fully consumed."

    invoke-direct {p0, p1}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Lcom/google/gson/stream/MalformedJsonException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    goto :goto_1

    :goto_0
    new-instance p1, Lcom/google/gson/JsonIOException;

    invoke-direct {p1, p0}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :goto_1
    new-instance p1, Lcom/google/gson/JsonSyntaxException;

    invoke-direct {p1, p0}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    :goto_2
    return-void
.end method

.method private static b(Lcom/google/gson/p;)Lcom/google/gson/p;
    .locals 1

    new-instance v0, Lcom/google/gson/e$d;

    invoke-direct {v0, p0}, Lcom/google/gson/e$d;-><init>(Lcom/google/gson/p;)V

    invoke-virtual {v0}, Lcom/google/gson/p;->a()Lcom/google/gson/p;

    move-result-object p0

    return-object p0
.end method

.method private static c(Lcom/google/gson/p;)Lcom/google/gson/p;
    .locals 1

    new-instance v0, Lcom/google/gson/e$e;

    invoke-direct {v0, p0}, Lcom/google/gson/e$e;-><init>(Lcom/google/gson/p;)V

    invoke-virtual {v0}, Lcom/google/gson/p;->a()Lcom/google/gson/p;

    move-result-object p0

    return-object p0
.end method

.method static d(D)V
    .locals 2

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p0, " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private e(Z)Lcom/google/gson/p;
    .locals 0

    if-eqz p1, :cond_0

    sget-object p1, Lcom/google/gson/internal/bind/l;->v:Lcom/google/gson/p;

    return-object p1

    :cond_0
    new-instance p1, Lcom/google/gson/e$a;

    invoke-direct {p1, p0}, Lcom/google/gson/e$a;-><init>(Lcom/google/gson/e;)V

    return-object p1
.end method

.method private f(Z)Lcom/google/gson/p;
    .locals 0

    if-eqz p1, :cond_0

    sget-object p1, Lcom/google/gson/internal/bind/l;->u:Lcom/google/gson/p;

    return-object p1

    :cond_0
    new-instance p1, Lcom/google/gson/e$b;

    invoke-direct {p1, p0}, Lcom/google/gson/e$b;-><init>(Lcom/google/gson/e;)V

    return-object p1
.end method

.method private static o(Lcom/google/gson/k;)Lcom/google/gson/p;
    .locals 1

    sget-object v0, Lcom/google/gson/k;->DEFAULT:Lcom/google/gson/k;

    if-ne p0, v0, :cond_0

    sget-object p0, Lcom/google/gson/internal/bind/l;->t:Lcom/google/gson/p;

    return-object p0

    :cond_0
    new-instance p0, Lcom/google/gson/e$c;

    invoke-direct {p0}, Lcom/google/gson/e$c;-><init>()V

    return-object p0
.end method


# virtual methods
.method public g(Ljava/io/Reader;Lcom/google/gson/reflect/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/gson/e;->p(Ljava/io/Reader;)Lw5/a;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/google/gson/e;->k(Lw5/a;Lcom/google/gson/reflect/a;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/google/gson/e;->a(Ljava/lang/Object;Lw5/a;)V

    return-object p2
.end method

.method public h(Ljava/lang/String;Lcom/google/gson/reflect/a;)Ljava/lang/Object;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, p2}, Lcom/google/gson/e;->g(Ljava/io/Reader;Lcom/google/gson/reflect/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public i(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    invoke-static {p2}, Lcom/google/gson/reflect/a;->a(Ljava/lang/Class;)Lcom/google/gson/reflect/a;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/gson/e;->h(Ljava/lang/String;Lcom/google/gson/reflect/a;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2}, Lt5/l;->b(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 0

    invoke-static {p2}, Lcom/google/gson/reflect/a;->b(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/a;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/google/gson/e;->h(Ljava/lang/String;Lcom/google/gson/reflect/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public k(Lw5/a;Lcom/google/gson/reflect/a;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p1}, Lw5/a;->S()Lcom/google/gson/m;

    move-result-object v0

    iget-object v1, p0, Lcom/google/gson/e;->n:Lcom/google/gson/m;

    if-eqz v1, :cond_0

    invoke-virtual {p1, v1}, Lw5/a;->A0(Lcom/google/gson/m;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lw5/a;->S()Lcom/google/gson/m;

    move-result-object v1

    sget-object v2, Lcom/google/gson/m;->LEGACY_STRICT:Lcom/google/gson/m;

    if-ne v1, v2, :cond_1

    sget-object v1, Lcom/google/gson/m;->LENIENT:Lcom/google/gson/m;

    invoke-virtual {p1, v1}, Lw5/a;->A0(Lcom/google/gson/m;)V

    :cond_1
    :goto_0
    :try_start_0
    invoke-virtual {p1}, Lw5/a;->v0()Lw5/b;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    :try_start_1
    invoke-virtual {p0, p2}, Lcom/google/gson/e;->l(Lcom/google/gson/reflect/a;)Lcom/google/gson/p;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/gson/p;->b(Lw5/a;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p1, v0}, Lw5/a;->A0(Lcom/google/gson/m;)V

    return-object p2

    :catchall_0
    move-exception p2

    goto :goto_5

    :catch_0
    move-exception p2

    goto :goto_1

    :catch_1
    move-exception p2

    goto :goto_2

    :catch_2
    move-exception p2

    goto :goto_3

    :catch_3
    move-exception p2

    goto :goto_4

    :goto_1
    :try_start_2
    new-instance v1, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AssertionError (GSON 2.11.0): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :goto_2
    new-instance v1, Lcom/google/gson/JsonSyntaxException;

    invoke-direct {v1, p2}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :goto_3
    new-instance v1, Lcom/google/gson/JsonSyntaxException;

    invoke-direct {v1, p2}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_4
    move-exception p2

    const/4 v1, 0x1

    :goto_4
    if-eqz v1, :cond_2

    invoke-virtual {p1, v0}, Lw5/a;->A0(Lcom/google/gson/m;)V

    const/4 p1, 0x0

    return-object p1

    :cond_2
    :try_start_3
    new-instance v1, Lcom/google/gson/JsonSyntaxException;

    invoke-direct {v1, p2}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_5
    invoke-virtual {p1, v0}, Lw5/a;->A0(Lcom/google/gson/m;)V

    throw p2
.end method

.method public l(Lcom/google/gson/reflect/a;)Lcom/google/gson/p;
    .locals 6

    const-string/jumbo v0, "type must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/gson/e;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/gson/p;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/gson/e;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/google/gson/e;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/gson/p;

    if-eqz v1, :cond_2

    return-object v1

    :cond_2
    const/4 v1, 0x0

    :goto_0
    :try_start_0
    new-instance v2, Lcom/google/gson/e$f;

    invoke-direct {v2}, Lcom/google/gson/e$f;-><init>()V

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/gson/e;->e:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/gson/q;

    invoke-interface {v4, p0, p1}, Lcom/google/gson/q;->b(Lcom/google/gson/e;Lcom/google/gson/reflect/a;)Lcom/google/gson/p;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v2, v4}, Lcom/google/gson/e$f;->g(Lcom/google/gson/p;)V

    invoke-interface {v0, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_4
    :goto_1
    if-eqz v1, :cond_5

    iget-object v2, p0, Lcom/google/gson/e;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->remove()V

    :cond_5
    if-eqz v4, :cond_7

    if-eqz v1, :cond_6

    iget-object p1, p0, Lcom/google/gson/e;->b:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {p1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_6
    return-object v4

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "GSON (2.11.0) cannot handle "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_2
    if-eqz v1, :cond_8

    iget-object v0, p0, Lcom/google/gson/e;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    :cond_8
    throw p1
.end method

.method public m(Ljava/lang/Class;)Lcom/google/gson/p;
    .locals 0

    invoke-static {p1}, Lcom/google/gson/reflect/a;->a(Ljava/lang/Class;)Lcom/google/gson/reflect/a;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/gson/e;->l(Lcom/google/gson/reflect/a;)Lcom/google/gson/p;

    move-result-object p1

    return-object p1
.end method

.method public n(Lcom/google/gson/q;Lcom/google/gson/reflect/a;)Lcom/google/gson/p;
    .locals 3

    const-string/jumbo v0, "skipPast must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string/jumbo v0, "type must not be null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/gson/e;->d:Lcom/google/gson/internal/bind/d;

    invoke-virtual {v0, p2, p1}, Lcom/google/gson/internal/bind/d;->e(Lcom/google/gson/reflect/a;Lcom/google/gson/q;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/google/gson/e;->d:Lcom/google/gson/internal/bind/d;

    :cond_0
    iget-object v0, p0, Lcom/google/gson/e;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/gson/q;

    if-nez v1, :cond_2

    if-ne v2, p1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {v2, p0, p2}, Lcom/google/gson/q;->b(Lcom/google/gson/e;Lcom/google/gson/reflect/a;)Lcom/google/gson/p;

    move-result-object v2

    if-eqz v2, :cond_1

    return-object v2

    :cond_3
    if-nez v1, :cond_4

    invoke-virtual {p0, p2}, Lcom/google/gson/e;->l(Lcom/google/gson/reflect/a;)Lcom/google/gson/p;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "GSON cannot serialize or deserialize "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public p(Ljava/io/Reader;)Lw5/a;
    .locals 1

    new-instance v0, Lw5/a;

    invoke-direct {v0, p1}, Lw5/a;-><init>(Ljava/io/Reader;)V

    iget-object p1, p0, Lcom/google/gson/e;->n:Lcom/google/gson/m;

    if-nez p1, :cond_0

    sget-object p1, Lcom/google/gson/m;->LEGACY_STRICT:Lcom/google/gson/m;

    :cond_0
    invoke-virtual {v0, p1}, Lw5/a;->A0(Lcom/google/gson/m;)V

    return-object v0
.end method

.method public q(Ljava/io/Writer;)Lw5/c;
    .locals 1

    iget-boolean v0, p0, Lcom/google/gson/e;->k:Z

    if-eqz v0, :cond_0

    const-string v0, ")]}\'\n"

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_0
    new-instance v0, Lw5/c;

    invoke-direct {v0, p1}, Lw5/c;-><init>(Ljava/io/Writer;)V

    iget-object p1, p0, Lcom/google/gson/e;->m:Lcom/google/gson/d;

    invoke-virtual {v0, p1}, Lw5/c;->o0(Lcom/google/gson/d;)V

    iget-boolean p1, p0, Lcom/google/gson/e;->l:Z

    invoke-virtual {v0, p1}, Lw5/c;->p0(Z)V

    iget-object p1, p0, Lcom/google/gson/e;->n:Lcom/google/gson/m;

    if-nez p1, :cond_1

    sget-object p1, Lcom/google/gson/m;->LEGACY_STRICT:Lcom/google/gson/m;

    :cond_1
    invoke-virtual {v0, p1}, Lw5/c;->r0(Lcom/google/gson/m;)V

    iget-boolean p1, p0, Lcom/google/gson/e;->i:Z

    invoke-virtual {v0, p1}, Lw5/c;->q0(Z)V

    return-object v0
.end method

.method public r(Lcom/google/gson/g;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    invoke-virtual {p0, p1, v0}, Lcom/google/gson/e;->u(Lcom/google/gson/g;Ljava/lang/Appendable;)V

    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public s(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Lcom/google/gson/h;->a:Lcom/google/gson/h;

    invoke-virtual {p0, p1}, Lcom/google/gson/e;->r(Lcom/google/gson/g;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/gson/e;->t(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public t(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/gson/e;->w(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Appendable;)V

    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "{serializeNulls:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/google/gson/e;->i:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",factories:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/gson/e;->e:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",instanceCreators:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/gson/e;->c:Lt5/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string/jumbo v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Lcom/google/gson/g;Ljava/lang/Appendable;)V
    .locals 0

    :try_start_0
    invoke-static {p2}, Lt5/n;->b(Ljava/lang/Appendable;)Ljava/io/Writer;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/google/gson/e;->q(Ljava/io/Writer;)Lw5/c;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/google/gson/e;->v(Lcom/google/gson/g;Lw5/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lcom/google/gson/JsonIOException;

    invoke-direct {p2, p1}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public v(Lcom/google/gson/g;Lw5/c;)V
    .locals 6

    invoke-virtual {p2}, Lw5/c;->C()Lcom/google/gson/m;

    move-result-object v0

    invoke-virtual {p2}, Lw5/c;->J()Z

    move-result v1

    invoke-virtual {p2}, Lw5/c;->y()Z

    move-result v2

    iget-boolean v3, p0, Lcom/google/gson/e;->l:Z

    invoke-virtual {p2, v3}, Lw5/c;->p0(Z)V

    iget-boolean v3, p0, Lcom/google/gson/e;->i:Z

    invoke-virtual {p2, v3}, Lw5/c;->q0(Z)V

    iget-object v3, p0, Lcom/google/gson/e;->n:Lcom/google/gson/m;

    if-eqz v3, :cond_0

    invoke-virtual {p2, v3}, Lw5/c;->r0(Lcom/google/gson/m;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lw5/c;->C()Lcom/google/gson/m;

    move-result-object v3

    sget-object v4, Lcom/google/gson/m;->LEGACY_STRICT:Lcom/google/gson/m;

    if-ne v3, v4, :cond_1

    sget-object v3, Lcom/google/gson/m;->LENIENT:Lcom/google/gson/m;

    invoke-virtual {p2, v3}, Lw5/c;->r0(Lcom/google/gson/m;)V

    :cond_1
    :goto_0
    :try_start_0
    invoke-static {p1, p2}, Lt5/n;->a(Lcom/google/gson/g;Lw5/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p2, v0}, Lw5/c;->r0(Lcom/google/gson/m;)V

    invoke-virtual {p2, v1}, Lw5/c;->p0(Z)V

    invoke-virtual {p2, v2}, Lw5/c;->q0(Z)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_1
    new-instance v3, Ljava/lang/AssertionError;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "AssertionError (GSON 2.11.0): "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    :catch_1
    move-exception p1

    new-instance v3, Lcom/google/gson/JsonIOException;

    invoke-direct {v3, p1}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/Throwable;)V

    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {p2, v0}, Lw5/c;->r0(Lcom/google/gson/m;)V

    invoke-virtual {p2, v1}, Lw5/c;->p0(Z)V

    invoke-virtual {p2, v2}, Lw5/c;->q0(Z)V

    throw p1
.end method

.method public w(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Appendable;)V
    .locals 0

    :try_start_0
    invoke-static {p3}, Lt5/n;->b(Ljava/lang/Appendable;)Ljava/io/Writer;

    move-result-object p3

    invoke-virtual {p0, p3}, Lcom/google/gson/e;->q(Ljava/io/Writer;)Lw5/c;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/gson/e;->x(Ljava/lang/Object;Ljava/lang/reflect/Type;Lw5/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lcom/google/gson/JsonIOException;

    invoke-direct {p2, p1}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public x(Ljava/lang/Object;Ljava/lang/reflect/Type;Lw5/c;)V
    .locals 5

    invoke-static {p2}, Lcom/google/gson/reflect/a;->b(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/a;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/google/gson/e;->l(Lcom/google/gson/reflect/a;)Lcom/google/gson/p;

    move-result-object p2

    invoke-virtual {p3}, Lw5/c;->C()Lcom/google/gson/m;

    move-result-object v0

    iget-object v1, p0, Lcom/google/gson/e;->n:Lcom/google/gson/m;

    if-eqz v1, :cond_0

    invoke-virtual {p3, v1}, Lw5/c;->r0(Lcom/google/gson/m;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Lw5/c;->C()Lcom/google/gson/m;

    move-result-object v1

    sget-object v2, Lcom/google/gson/m;->LEGACY_STRICT:Lcom/google/gson/m;

    if-ne v1, v2, :cond_1

    sget-object v1, Lcom/google/gson/m;->LENIENT:Lcom/google/gson/m;

    invoke-virtual {p3, v1}, Lw5/c;->r0(Lcom/google/gson/m;)V

    :cond_1
    :goto_0
    invoke-virtual {p3}, Lw5/c;->J()Z

    move-result v1

    invoke-virtual {p3}, Lw5/c;->y()Z

    move-result v2

    iget-boolean v3, p0, Lcom/google/gson/e;->l:Z

    invoke-virtual {p3, v3}, Lw5/c;->p0(Z)V

    iget-boolean v3, p0, Lcom/google/gson/e;->i:Z

    invoke-virtual {p3, v3}, Lw5/c;->q0(Z)V

    :try_start_0
    invoke-virtual {p2, p3, p1}, Lcom/google/gson/p;->d(Lw5/c;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p3, v0}, Lw5/c;->r0(Lcom/google/gson/m;)V

    invoke-virtual {p3, v1}, Lw5/c;->p0(Z)V

    invoke-virtual {p3, v2}, Lw5/c;->q0(Z)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_1
    new-instance p2, Ljava/lang/AssertionError;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "AssertionError (GSON 2.11.0): "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p2, v3, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    new-instance p2, Lcom/google/gson/JsonIOException;

    invoke-direct {p2, p1}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {p3, v0}, Lw5/c;->r0(Lcom/google/gson/m;)V

    invoke-virtual {p3, v1}, Lw5/c;->p0(Z)V

    invoke-virtual {p3, v2}, Lw5/c;->q0(Z)V

    throw p1
.end method
