.class public final Lje/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lje/C;


# instance fields
.field private final a:LT7/d;

.field private b:Ljava/util/concurrent/LinkedBlockingDeque;

.field private c:LFg/a;

.field private final d:Lgg/b;

.field private final e:Lgg/b;

.field private final f:Lgg/b;

.field private final g:Lgg/i;


# direct methods
.method public constructor <init>(Lje/u;Lfe/u;LT7/d;JJ)V
    .locals 1

    const-string v0, "connectionService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "schedulers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "systemTimeProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p3, p0, Lje/D;->a:LT7/d;

    .line 3
    new-instance p3, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {p3}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    iput-object p3, p0, Lje/D;->b:Ljava/util/concurrent/LinkedBlockingDeque;

    .line 4
    invoke-static {p3}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p3

    invoke-static {p3}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p3

    const-string v0, "createDefault(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lje/D;->c:LFg/a;

    .line 5
    invoke-interface {p1}, Lje/u;->a()Lgg/i;

    move-result-object p1

    .line 6
    new-instance p3, Lje/D$f;

    invoke-direct {p3, p0}, Lje/D$f;-><init>(Lje/D;)V

    invoke-virtual {p1, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lgg/i;->E0()Lgg/b;

    move-result-object p1

    const-string p3, "ignoreElements(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lje/D;->d:Lgg/b;

    .line 8
    new-instance v0, Lje/D$e;

    invoke-direct {v0, p0, p4, p5}, Lje/D$e;-><init>(Lje/D;J)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p4

    const-string p5, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    new-instance p5, Lje/D$b;

    invoke-direct {p5, p6, p7, p2}, Lje/D$b;-><init>(JLfe/u;)V

    invoke-virtual {p4, p5}, Lgg/b;->P(Lkg/n;)Lgg/b;

    move-result-object p4

    const-string p5, "repeatWhen(...)"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p4, p0, Lje/D;->e:Lgg/b;

    const/4 p5, 0x2

    .line 10
    new-array p5, p5, [Lgg/f;

    const/4 p6, 0x0

    aput-object p1, p5, p6

    const/4 p1, 0x1

    aput-object p4, p5, p1

    .line 11
    invoke-static {p5}, Lgg/b;->I([Lgg/f;)Lgg/b;

    move-result-object p4

    .line 12
    sget-object p5, Lje/D$c;->a:Lje/D$c;

    invoke-virtual {p4, p5}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p4

    .line 13
    sget-object p5, Lje/D$d;->a:Lje/D$d;

    invoke-virtual {p4, p5}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p4

    .line 14
    invoke-interface {p2}, Lfe/u;->a()Lgg/y;

    move-result-object p5

    invoke-virtual {p4, p5}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p4

    .line 15
    invoke-virtual {p4}, Lgg/b;->f0()Lgg/s;

    move-result-object p4

    .line 16
    invoke-virtual {p4, p1}, Lgg/s;->x0(I)LBg/a;

    move-result-object p4

    .line 17
    invoke-virtual {p4}, LBg/a;->l1()Lgg/s;

    move-result-object p4

    .line 18
    invoke-virtual {p4}, Lgg/s;->f0()Lgg/b;

    move-result-object p4

    invoke-static {p4, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p4, p0, Lje/D;->f:Lgg/b;

    .line 19
    iget-object p3, p0, Lje/D;->c:LFg/a;

    .line 20
    invoke-virtual {p3}, Lgg/i;->e1()Lgg/i;

    move-result-object p3

    .line 21
    invoke-interface {p2}, Lfe/u;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p3, p2, p6, p1}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p2

    .line 22
    invoke-virtual {p0}, Lje/D;->a()Lgg/b;

    move-result-object p3

    invoke-virtual {p2, p3}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p2

    .line 23
    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    .line 24
    invoke-virtual {p2, p1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lje/D;->g:Lgg/i;

    return-void
.end method

.method public synthetic constructor <init>(Lje/u;Lfe/u;LT7/d;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_0

    const-wide/32 v0, 0x88b8

    move-wide v6, v0

    goto :goto_0

    :cond_0
    move-wide v6, p4

    :goto_0
    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_1

    const-wide/16 v0, 0x7d0

    move-wide v8, v0

    goto :goto_1

    :cond_1
    move-wide/from16 v8, p6

    :goto_1
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    .line 26
    invoke-direct/range {v2 .. v9}, Lje/D;-><init>(Lje/u;Lfe/u;LT7/d;JJ)V

    return-void
.end method

.method public static final synthetic c(Lje/D;J)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lje/D;->g(J)Z

    move-result p0

    return p0
.end method

.method public static final synthetic d(Lje/D;)Ljava/util/concurrent/LinkedBlockingDeque;
    .locals 0

    iget-object p0, p0, Lje/D;->b:Ljava/util/concurrent/LinkedBlockingDeque;

    return-object p0
.end method

.method public static final synthetic e(Lje/D;)LT7/d;
    .locals 0

    iget-object p0, p0, Lje/D;->a:LT7/d;

    return-object p0
.end method

.method public static final synthetic f(Lje/D;Lmh/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lje/D;->h(Lmh/a;)V

    return-void
.end method

.method private final g(J)Z
    .locals 7

    iget-object v0, p0, Lje/D;->b:Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingDeque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "iterator(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LWc/c;

    const/4 v4, 0x1

    if-nez v1, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, LWc/c;->c()J

    move-result-wide v5

    cmp-long v3, v5, p1

    if-gtz v3, :cond_1

    iget-object v2, p0, Lje/D;->b:Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-virtual {v2}, Ljava/util/concurrent/LinkedBlockingDeque;->removeFirst()Ljava/lang/Object;

    move v2, v4

    goto :goto_0

    :cond_1
    return v2
.end method

.method private final h(Lmh/a;)V
    .locals 1

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lje/D;->c:LFg/a;

    iget-object v0, p0, Lje/D;->b:Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-static {v0}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()Lgg/b;
    .locals 1

    iget-object v0, p0, Lje/D;->f:Lgg/b;

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Lje/D;->g:Lgg/i;

    return-object v0
.end method
