.class public final Lo4/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo4/v$b;,
        Lo4/v$d;,
        Lo4/v$c;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/ConcurrentMap;

.field private b:Lo4/v$c;

.field private final c:Ljava/lang/Class;

.field private final d:Ly4/a;

.field private final e:Z


# direct methods
.method private constructor <init>(Ljava/util/concurrent/ConcurrentMap;Lo4/v$c;Ly4/a;Ljava/lang/Class;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lo4/v;->a:Ljava/util/concurrent/ConcurrentMap;

    .line 4
    iput-object p2, p0, Lo4/v;->b:Lo4/v$c;

    .line 5
    iput-object p4, p0, Lo4/v;->c:Ljava/lang/Class;

    .line 6
    iput-object p3, p0, Lo4/v;->d:Ly4/a;

    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lo4/v;->e:Z

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/concurrent/ConcurrentMap;Lo4/v$c;Ly4/a;Ljava/lang/Class;Lo4/v$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lo4/v;-><init>(Ljava/util/concurrent/ConcurrentMap;Lo4/v$c;Ly4/a;Ljava/lang/Class;)V

    return-void
.end method

.method static synthetic a(Ljava/lang/Object;Ljava/lang/Object;LA4/C$c;Ljava/util/concurrent/ConcurrentMap;)Lo4/v$c;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lo4/v;->b(Ljava/lang/Object;Ljava/lang/Object;LA4/C$c;Ljava/util/concurrent/ConcurrentMap;)Lo4/v$c;

    move-result-object p0

    return-object p0
.end method

.method private static b(Ljava/lang/Object;Ljava/lang/Object;LA4/C$c;Ljava/util/concurrent/ConcurrentMap;)Lo4/v$c;
    .locals 14

    move-object/from16 v0, p3

    invoke-virtual/range {p2 .. p2}, LA4/C$c;->Z()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, LA4/C$c;->a0()LA4/I;

    move-result-object v2

    sget-object v3, LA4/I;->RAW:LA4/I;

    const/4 v4, 0x0

    if-ne v2, v3, :cond_0

    move-object v1, v4

    :cond_0
    invoke-static {}, Lv4/i;->a()Lv4/i;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, LA4/C$c;->Y()LA4/y;

    move-result-object v3

    invoke-virtual {v3}, LA4/y;->Z()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, LA4/C$c;->Y()LA4/y;

    move-result-object v5

    invoke-virtual {v5}, LA4/y;->a0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, LA4/C$c;->Y()LA4/y;

    move-result-object v6

    invoke-virtual {v6}, LA4/y;->Y()LA4/y$c;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, LA4/C$c;->a0()LA4/I;

    move-result-object v7

    invoke-static {v3, v5, v6, v7, v1}, Lv4/o;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;LA4/y$c;LA4/I;Ljava/lang/Integer;)Lv4/o;

    move-result-object v1

    invoke-static {}, Lo4/f;->a()Lo4/y;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lv4/i;->d(Lv4/o;Lo4/y;)Lo4/g;

    move-result-object v13

    new-instance v1, Lo4/v$c;

    invoke-static/range {p2 .. p2}, Lo4/d;->a(LA4/C$c;)[B

    move-result-object v8

    invoke-virtual/range {p2 .. p2}, LA4/C$c;->b0()LA4/z;

    move-result-object v9

    invoke-virtual/range {p2 .. p2}, LA4/C$c;->a0()LA4/I;

    move-result-object v10

    invoke-virtual/range {p2 .. p2}, LA4/C$c;->Z()I

    move-result v11

    invoke-virtual/range {p2 .. p2}, LA4/C$c;->Y()LA4/y;

    move-result-object v2

    invoke-virtual {v2}, LA4/y;->Z()Ljava/lang/String;

    move-result-object v12

    move-object v5, v1

    move-object v6, p0

    move-object v7, p1

    invoke-direct/range {v5 .. v13}, Lo4/v$c;-><init>(Ljava/lang/Object;Ljava/lang/Object;[BLA4/z;LA4/I;ILjava/lang/String;Lo4/g;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Lo4/v$d;

    invoke-virtual {v1}, Lo4/v$c;->b()[B

    move-result-object v5

    invoke-direct {v3, v5, v4}, Lo4/v$d;-><init>([BLo4/v$a;)V

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_1

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v1
.end method

.method public static j(Ljava/lang/Class;)Lo4/v$b;
    .locals 2

    new-instance v0, Lo4/v$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo4/v$b;-><init>(Ljava/lang/Class;Lo4/v$a;)V

    return-object v0
.end method


# virtual methods
.method public c()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lo4/v;->a:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public d()Ly4/a;
    .locals 1

    iget-object v0, p0, Lo4/v;->d:Ly4/a;

    return-object v0
.end method

.method public e()Lo4/v$c;
    .locals 1

    iget-object v0, p0, Lo4/v;->b:Lo4/v$c;

    return-object v0
.end method

.method public f([B)Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lo4/v;->a:Ljava/util/concurrent/ConcurrentMap;

    new-instance v1, Lo4/v$d;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lo4/v$d;-><init>([BLo4/v$a;)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public g()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lo4/v;->c:Ljava/lang/Class;

    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 1

    sget-object v0, Lo4/d;->a:[B

    invoke-virtual {p0, v0}, Lo4/v;->f([B)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, Lo4/v;->d:Ly4/a;

    invoke-virtual {v0}, Ly4/a;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
