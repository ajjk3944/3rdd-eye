.class public abstract Lk9/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lgg/z;Lmh/l;Ljava/lang/Long;)Lgg/D;
    .locals 0

    invoke-static {p0, p1, p2}, Lk9/e;->g(Lgg/z;Lmh/l;Ljava/lang/Long;)Lgg/D;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lgg/b;Lmh/l;Ljava/lang/Long;)Lgg/f;
    .locals 0

    invoke-static {p0, p1, p2}, Lk9/e;->i(Lgg/b;Lmh/l;Ljava/lang/Long;)Lgg/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lmh/l;Ljava/lang/Long;)V
    .locals 0

    invoke-static {p0, p1}, Lk9/e;->j(Lmh/l;Ljava/lang/Long;)V

    return-void
.end method

.method public static synthetic d(Lmh/l;Ljava/lang/Long;)V
    .locals 0

    invoke-static {p0, p1}, Lk9/e;->h(Lmh/l;Ljava/lang/Long;)V

    return-void
.end method

.method public static final e(Lgg/b;Lmh/l;)Lgg/b;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "resultHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk9/e$b;

    invoke-direct {v0}, Lk9/e$b;-><init>()V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lk9/d;

    invoke-direct {v1, p0, p1}, Lk9/d;-><init>(Lgg/b;Lmh/l;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p0

    const-string/jumbo p1, "single { System.currentT\u2026              }\n        }"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final f(Lgg/z;Lmh/l;)Lgg/z;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "resultHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk9/e$a;

    invoke-direct {v0}, Lk9/e$a;-><init>()V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lk9/b;

    invoke-direct {v1, p0, p1}, Lk9/b;-><init>(Lgg/z;Lmh/l;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p0

    const-string/jumbo p1, "single { System.currentT\u2026              }\n        }"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final g(Lgg/z;Lmh/l;Ljava/lang/Long;)Lgg/D;
    .locals 1

    const-string v0, "$this_measureDuration"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$resultHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk9/c;

    invoke-direct {v0, p1, p2}, Lk9/c;-><init>(Lmh/l;Ljava/lang/Long;)V

    invoke-virtual {p0, v0}, Lgg/z;->l(Lkg/a;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lmh/l;Ljava/lang/Long;)V
    .locals 4

    const-string v0, "$resultHandler"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-string/jumbo v2, "startTime"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final i(Lgg/b;Lmh/l;Ljava/lang/Long;)Lgg/f;
    .locals 1

    const-string v0, "$this_measureDuration"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$resultHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk9/a;

    invoke-direct {v0, p1, p2}, Lk9/a;-><init>(Lmh/l;Ljava/lang/Long;)V

    invoke-virtual {p0, v0}, Lgg/b;->w(Lkg/a;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lmh/l;Ljava/lang/Long;)V
    .locals 4

    const-string v0, "$resultHandler"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-string/jumbo v2, "startTime"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
