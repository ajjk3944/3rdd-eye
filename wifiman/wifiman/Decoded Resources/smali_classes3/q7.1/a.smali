.class public final Lq7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq7/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq7/a$a;
    }
.end annotation


# instance fields
.field private final a:Lgg/y;

.field private final b:Lv7/e;

.field private final c:LFg/c;

.field private final d:LFg/a;

.field private final e:LFg/c;

.field private final f:Lgg/b;

.field private final g:Lgg/b;

.field private final h:Lgg/b;

.field private final i:Lgg/i;

.field private final j:Lgg/i;


# direct methods
.method public constructor <init>(JLgg/y;Lgg/y;Lv7/g;)V
    .locals 4

    const-string/jumbo v0, "resultsScheduler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "timedScheduler"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "cacheFactory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p3, p0, Lq7/a;->a:Lgg/y;

    .line 3
    invoke-interface {p5, p4}, Lv7/g;->a(Lgg/y;)Lv7/e;

    move-result-object p5

    iput-object p5, p0, Lq7/a;->b:Lv7/e;

    .line 4
    invoke-static {}, LFg/c;->j2()LFg/c;

    move-result-object v0

    const-string/jumbo v1, "create<ResultsEvent>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lq7/a;->c:LFg/c;

    .line 5
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object v1

    const-string/jumbo v2, "createDefault<List<Device>>(emptyList())"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lq7/a;->d:LFg/a;

    .line 6
    invoke-static {}, LFg/c;->j2()LFg/c;

    move-result-object v2

    const-string/jumbo v3, "create<Device>()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lq7/a;->e:LFg/c;

    .line 7
    invoke-interface {p5}, Lv7/e;->c()Lgg/i;

    move-result-object p5

    .line 8
    new-instance v3, Lq7/a$c;

    invoke-direct {v3, p0}, Lq7/a$c;-><init>(Lq7/a;)V

    invoke-virtual {p5, v3}, Lgg/i;->t0(Lkg/n;)Lgg/b;

    move-result-object p5

    const-string/jumbo v3, "discoveryResultsCache.ex\u2026          }\n            }"

    invoke-static {p5, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p5, p0, Lq7/a;->f:Lgg/b;

    .line 9
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p1, p2, v3, p4}, Lgg/i;->e(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/i;

    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    .line 11
    invoke-virtual {p1, p3}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    .line 12
    sget-object p2, Lq7/a$d;->a:Lq7/a$d;

    invoke-virtual {p1, p2}, Lgg/i;->m0(Lkg/p;)Lgg/i;

    move-result-object p1

    .line 13
    new-instance p2, Lq7/a$e;

    invoke-direct {p2, p0}, Lq7/a$e;-><init>(Lq7/a;)V

    invoke-virtual {p1, p2}, Lgg/i;->t0(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo p2, "resultsEventProcessor\n  \u2026          }\n            }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lq7/a;->g:Lgg/b;

    .line 14
    filled-new-array {p5, p1}, [Lgg/b;

    move-result-object p1

    .line 15
    invoke-static {p1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 16
    invoke-static {p1}, Lgg/b;->H(Ljava/lang/Iterable;)Lgg/b;

    move-result-object p1

    const-string/jumbo p2, "merge(\n            listO\u2026r\n            )\n        )"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lq7/a;->h:Lgg/b;

    .line 17
    invoke-virtual {v1, p1}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p2

    const-string/jumbo p3, "allDevicesProcessor\n    \u2026mergeWith(eventProcessor)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lq7/a;->i:Lgg/i;

    .line 18
    invoke-virtual {v2, p1}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p1

    const-string/jumbo p2, "lastDeviceProcessor\n    \u2026mergeWith(eventProcessor)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lq7/a;->j:Lgg/i;

    return-void
.end method

.method public synthetic constructor <init>(JLgg/y;Lgg/y;Lv7/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 19
    invoke-static {}, Lq7/b;->a()Lgg/y;

    move-result-object p4

    const-string/jumbo p7, "TIMED_SCHEDULER"

    invoke-static {p4, p7}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x8

    if-eqz p4, :cond_1

    .line 20
    new-instance p5, Lv7/h;

    invoke-direct {p5}, Lv7/h;-><init>()V

    :cond_1
    move-object v5, p5

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    .line 21
    invoke-direct/range {v0 .. v5}, Lq7/a;-><init>(JLgg/y;Lgg/y;Lv7/g;)V

    return-void
.end method

.method public static final synthetic d(Lq7/a;)LFg/a;
    .locals 0

    iget-object p0, p0, Lq7/a;->d:LFg/a;

    return-object p0
.end method

.method public static final synthetic e(Lq7/a;)Lv7/e;
    .locals 0

    iget-object p0, p0, Lq7/a;->b:Lv7/e;

    return-object p0
.end method

.method public static final synthetic f(Lq7/a;)LFg/c;
    .locals 0

    iget-object p0, p0, Lq7/a;->e:LFg/c;

    return-object p0
.end method

.method public static final synthetic g(Lq7/a;)LFg/c;
    .locals 0

    iget-object p0, p0, Lq7/a;->c:LFg/c;

    return-object p0
.end method


# virtual methods
.method public a(Ls7/g;JLr7/a;)Lgg/b;
    .locals 7

    const-string/jumbo v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "priority"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq7/a$b;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p0

    move-object v4, p4

    move-wide v5, p2

    invoke-direct/range {v1 .. v6}, Lq7/a$b;-><init>(Ls7/g;Lq7/a;Lr7/a;J)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string/jumbo p2, "crossinline action: () -\u2026       it\n        }\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lq7/a;->a:Lgg/y;

    invoke-virtual {p1, p2}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string/jumbo p2, "complete {\n            i\u2026cribeOn(resultsScheduler)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Lq7/a;->i:Lgg/i;

    return-object v0
.end method

.method public c()Lgg/i;
    .locals 1

    iget-object v0, p0, Lq7/a;->j:Lgg/i;

    return-object v0
.end method
