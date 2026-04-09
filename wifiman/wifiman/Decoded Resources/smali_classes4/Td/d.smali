.class public final LTd/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LTd/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LTd/d$a;
    }
.end annotation


# static fields
.field public static final g:LTd/d$a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LTd/a$a;

.field private final c:LUd/a;

.field private final d:Lxa/o;

.field private final e:Lgg/i;

.field private final f:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LTd/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LTd/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LTd/d;->g:LTd/d$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;LTd/a$a;LUd/a;Lxa/o;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "api"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productCatalog"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LTd/d;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, LTd/d;->b:LTd/a$a;

    .line 5
    iput-object p3, p0, LTd/d;->c:LUd/a;

    .line 6
    iput-object p4, p0, LTd/d;->d:Lxa/o;

    .line 7
    invoke-interface {p4}, Lxa/o;->b()Lgg/i;

    move-result-object p1

    .line 8
    invoke-interface {p3}, LUd/a;->a()Lgg/z;

    move-result-object p2

    .line 9
    sget-object p4, LTd/d$b;->a:LTd/d$b;

    invoke-virtual {p2, p4}, Lgg/z;->K(Lkg/n;)Lgg/i;

    move-result-object p2

    .line 10
    sget-object p4, LTd/d$c;->a:LTd/d$c;

    invoke-static {p1, p2, p4}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    const-string p2, "combineLatest(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, LTd/b;

    invoke-direct {p2}, LTd/b;-><init>()V

    .line 11
    invoke-static {p1, p2}, Lfe/h;->c(Lgg/i;Lmh/l;)Lgg/i;

    move-result-object p1

    .line 12
    sget-object p2, LTd/d$d;->a:LTd/d$d;

    invoke-virtual {p1, p2}, Lgg/i;->n1(Lkg/n;)Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    .line 13
    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    .line 14
    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    .line 15
    const-string p4, "refCount(...)"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    iput-object p1, p0, LTd/d;->e:Lgg/i;

    .line 17
    invoke-interface {p3}, LUd/a;->e()Lgg/z;

    move-result-object p1

    .line 18
    sget-object p3, LTd/d$e;->a:LTd/d$e;

    invoke-virtual {p1, p3}, Lgg/z;->K(Lkg/n;)Lgg/i;

    move-result-object p1

    .line 19
    sget-object p3, LTd/d$f;->a:LTd/d$f;

    invoke-virtual {p1, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string p3, "map(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, LTd/c;

    invoke-direct {p3}, LTd/c;-><init>()V

    .line 20
    invoke-static {p1, p3}, Lfe/h;->c(Lgg/i;Lmh/l;)Lgg/i;

    move-result-object p1

    .line 21
    sget-object p3, LTd/d$g;->a:LTd/d$g;

    invoke-virtual {p1, p3}, Lgg/i;->n1(Lkg/n;)Lgg/i;

    move-result-object p1

    .line 22
    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    .line 23
    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    .line 24
    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    iput-object p1, p0, LTd/d;->f:Lgg/i;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;LTd/a$a;LUd/a;Lxa/o;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, LTd/d;-><init>(Ljava/lang/String;LTd/a$a;LUd/a;Lxa/o;)V

    return-void
.end method

.method public static synthetic g(Ljava/lang/Throwable;)Lgg/i;
    .locals 0

    invoke-static {p0}, LTd/d;->j(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/Throwable;)Lgg/i;
    .locals 0

    invoke-static {p0}, LTd/d;->k(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(LTd/d;Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1}, LTd/d;->n(Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Ljava/lang/Throwable;)Lgg/i;
    .locals 1

    const-string v0, "error"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;

    if-eqz v0, :cond_0

    new-instance v0, LWc/b$a$a;

    invoke-direct {v0, p0}, LWc/b$a$a;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p0

    const-string v0, "just(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_0
    invoke-static {p0}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p0

    const-string v0, "error(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final k(Ljava/lang/Throwable;)Lgg/i;
    .locals 1

    const-string v0, "error"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;

    if-eqz v0, :cond_0

    new-instance v0, LWc/b$a$a;

    invoke-direct {v0, p0}, LWc/b$a$a;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p0

    const-string v0, "just(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_0
    invoke-static {p0}, Lgg/i;->k0(Ljava/lang/Throwable;)Lgg/i;

    move-result-object p0

    const-string v0, "error(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private final l(Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;)LVd/c$a;
    .locals 5

    new-instance v0, LVd/c$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->e()Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;->b()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->e()Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;->a()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v2

    :goto_1
    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->e()Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;->e()Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_2
    move-object v4, v2

    :goto_2
    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->e()Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Server;->f()Ljava/lang/String;

    move-result-object v2

    :cond_3
    invoke-direct {v0, v1, v3, v4, v2}, LVd/c$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final m(Lgg/i;)Lgg/i;
    .locals 6

    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    const-wide/16 v1, 0x32

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x0

    invoke-static {v4, v5, v1, v2, v3}, Lgg/i;->F0(JJLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object v1

    new-instance v2, LTd/d$h;

    invoke-direct {v2, v0}, LTd/d$h;-><init>(Ljava/util/concurrent/ConcurrentLinkedQueue;)V

    invoke-virtual {v1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    const-string v2, "map(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Ll9/f;->e(Lgg/i;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->e1()Lgg/i;

    move-result-object v1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v3, v4}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object v1

    new-instance v2, LTd/d$i;

    invoke-direct {v2, v0}, LTd/d$i;-><init>(Ljava/util/concurrent/ConcurrentLinkedQueue;)V

    invoke-virtual {p1, v2}, Lgg/i;->D(Lkg/n;)Lgg/b;

    move-result-object p1

    invoke-virtual {v1, p1}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p1

    const-string v0, "mergeWith(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final n(Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;)Ljava/util/List;
    .locals 16

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->h()Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;->IN_PROGRESS:Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    const-wide v2, 0x412e848000000000L    # 1000000.0

    const/4 v4, 0x0

    if-eq v0, v1, :cond_2

    sget-object v6, LVd/c$b;->FINISHED:LVd/c$b;

    invoke-direct/range {p0 .. p1}, LTd/d;->l(Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;)LVd/c$a;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->b()Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->a()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    mul-double/2addr v0, v2

    double-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object v9, v0

    goto :goto_0

    :cond_0
    move-object v9, v4

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->k()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    mul-double/2addr v0, v2

    double-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    :cond_1
    move-object v10, v4

    new-instance v0, LVd/c;

    move-object v5, v0

    invoke-direct/range {v5 .. v10}, LVd/c;-><init>(LVd/c$b;LVd/c$a;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;)V

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_b

    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->g()Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    move-result-object v0

    if-ne v0, v1, :cond_3

    new-instance v0, LVd/c;

    sget-object v6, LVd/c$b;->LATENCY_CHECK:LVd/c$b;

    invoke-direct/range {p0 .. p1}, LTd/d;->l(Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;)LVd/c$a;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->b()Ljava/lang/Integer;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v5, v0

    invoke-direct/range {v5 .. v10}, LVd/c;-><init>(LVd/c$b;LVd/c$a;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;)V

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_b

    :cond_3
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->f()Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    move-result-object v0

    const-wide/16 v5, 0x2710

    const/4 v7, 0x1

    const/16 v8, 0xa

    if-ne v0, v1, :cond_a

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_a

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_5

    :cond_4
    invoke-direct/range {p0 .. p1}, LTd/d;->l(Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;)LVd/c$a;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->c()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;

    invoke-virtual {v10}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;->b()Ljava/util/List;

    move-result-object v10

    if-nez v10, :cond_5

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v10

    :cond_5
    check-cast v10, Ljava/lang/Iterable;

    invoke-static {v9, v10}, LZg/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_1

    :cond_6
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v9, v8}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v1, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    sget-object v10, LVd/c$b;->DOWNLOAD:LVd/c$b;

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->b()Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v7}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Long;

    if-eqz v9, :cond_7

    invoke-virtual {v9}, Ljava/lang/Number;->longValue()J

    move-result-wide v13

    mul-long/2addr v13, v5

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    move-object v13, v9

    goto :goto_3

    :cond_7
    move-object v13, v4

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->k()Ljava/lang/Double;

    move-result-object v9

    if-eqz v9, :cond_8

    invoke-virtual {v9}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v14

    mul-double/2addr v14, v2

    double-to-long v14, v14

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    move-object v14, v9

    goto :goto_4

    :cond_8
    move-object v14, v4

    :goto_4
    new-instance v15, LVd/c;

    move-object v9, v15

    move-object v11, v0

    invoke-direct/range {v9 .. v14}, LVd/c;-><init>(LVd/c$b;LVd/c$a;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;)V

    invoke-interface {v1, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_9
    move-object v0, v1

    goto/16 :goto_b

    :cond_a
    :goto_5
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->i()Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$a;

    move-result-object v0

    if-ne v0, v1, :cond_10

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->d()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_10

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_b

    goto/16 :goto_a

    :cond_b
    invoke-direct/range {p0 .. p1}, LTd/d;->l(Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;)LVd/c$a;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->d()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;

    invoke-virtual {v10}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State$Progress;->b()Ljava/util/List;

    move-result-object v10

    if-nez v10, :cond_c

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v10

    :cond_c
    check-cast v10, Ljava/lang/Iterable;

    invoke-static {v9, v10}, LZg/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_6

    :cond_d
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v9, v8}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v1, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    sget-object v10, LVd/c$b;->UPLOAD:LVd/c$b;

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->b()Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;->a()Ljava/lang/Double;

    move-result-object v11

    if-eqz v11, :cond_e

    invoke-virtual {v11}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v13

    mul-double/2addr v13, v2

    double-to-long v13, v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    move-object v13, v11

    goto :goto_8

    :cond_e
    move-object v13, v4

    :goto_8
    invoke-static {v9, v7}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Long;

    if-eqz v9, :cond_f

    invoke-virtual {v9}, Ljava/lang/Number;->longValue()J

    move-result-wide v14

    mul-long/2addr v14, v5

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    move-object v14, v9

    goto :goto_9

    :cond_f
    move-object v14, v4

    :goto_9
    new-instance v15, LVd/c;

    move-object v9, v15

    move-object v11, v0

    invoke-direct/range {v9 .. v14}, LVd/c;-><init>(LVd/c$b;LVd/c$a;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;)V

    invoke-interface {v1, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_10
    :goto_a
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    :goto_b
    return-object v0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, LTd/d;->e:Lgg/i;

    return-object v0
.end method

.method public b()LTd/a$a;
    .locals 1

    iget-object v0, p0, LTd/d;->b:LTd/a$a;

    return-object v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)Lgg/z;
    .locals 2

    const-string v0, "clientName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LTd/d;->c:LUd/a;

    new-instance v1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleTeleportAccess$Request;

    invoke-direct {v1, p2, p1}, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleTeleportAccess$Request;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, LUd/a;->d(Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleTeleportAccess$Request;)Lgg/z;

    move-result-object p1

    sget-object p2, LTd/d$j;->a:LTd/d$j;

    invoke-virtual {p1, p2}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string p2, "map(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LTd/d;->a:Ljava/lang/String;

    return-object v0
.end method

.method public e()Lgg/i;
    .locals 1

    iget-object v0, p0, LTd/d;->f:Lgg/i;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LTd/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LTd/d;

    iget-object v1, p0, LTd/d;->a:Ljava/lang/String;

    iget-object v3, p1, LTd/d;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->h(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LTd/d;->b:LTd/a$a;

    iget-object v3, p1, LTd/d;->b:LTd/a$a;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LTd/d;->c:LUd/a;

    iget-object v3, p1, LTd/d;->c:LUd/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LTd/d;->d:Lxa/o;

    iget-object p1, p1, LTd/d;->d:Lxa/o;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public f()Lgg/i;
    .locals 8

    iget-object v0, p0, LTd/d;->c:LUd/a;

    invoke-interface {v0}, LUd/a;->b()Lgg/i;

    move-result-object v0

    const-class v1, Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSpeedtest$State;

    invoke-virtual {v0, v1}, Lgg/i;->Z0(Ljava/lang/Class;)Lgg/i;

    move-result-object v0

    const-string v1, "ofType(R::class.java)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LTd/d;->c:LUd/a;

    invoke-interface {v1}, LUd/a;->c()Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object v0

    new-instance v1, LTd/d$k;

    invoke-direct {v1, p0}, LTd/d$k;-><init>(LTd/d;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    const-wide/16 v1, 0x7530

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lgg/i;->Z1(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object v0

    const-string v1, "timeout(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, LTd/d;->m(Lgg/i;)Lgg/i;

    move-result-object v0

    sget-object v1, LTd/d$l;->a:LTd/d$l;

    invoke-virtual {v0, v1}, Lgg/i;->R1(Lkg/p;)Lgg/i;

    move-result-object v0

    new-instance v7, LVd/c;

    sget-object v2, LVd/c$b;->LATENCY_CHECK:LVd/c$b;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, LVd/c;-><init>(LVd/c$b;LVd/c$a;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;)V

    invoke-virtual {v0, v7}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object v0

    sget-object v1, LTd/d$m;->a:LTd/d$m;

    invoke-virtual {v0, v1}, Lgg/i;->f1(Lkg/n;)Lgg/i;

    move-result-object v0

    const-string v1, "onErrorResumeNext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LTd/d;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->j(Ljava/lang/String;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LTd/d;->b:LTd/a$a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LTd/d;->c:LUd/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LTd/d;->d:Lxa/o;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, LTd/d;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LTd/d;->b:LTd/a$a;

    iget-object v2, p0, LTd/d;->c:LUd/a;

    iget-object v3, p0, LTd/d;->d:Lxa/o;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "UnifiNetworkConsoleSessionImpl(id="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", connectionType="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", api="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", productCatalog="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
