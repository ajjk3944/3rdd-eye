.class public Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# instance fields
.field private final a:LF4/A;

.field private final b:LF4/A;

.field private final c:LF4/A;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lp5/b$a;->CRASHLYTICS:Lp5/b$a;

    invoke-static {v0}, Lp5/a;->a(Lp5/b$a;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, LE4/a;

    const-class v1, Ljava/util/concurrent/ExecutorService;

    invoke-static {v0, v1}, LF4/A;->a(Ljava/lang/Class;Ljava/lang/Class;)LF4/A;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->a:LF4/A;

    const-class v0, LE4/b;

    invoke-static {v0, v1}, LF4/A;->a(Ljava/lang/Class;Ljava/lang/Class;)LF4/A;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->b:LF4/A;

    const-class v0, LE4/c;

    invoke-static {v0, v1}, LF4/A;->a(Ljava/lang/Class;Ljava/lang/Class;)LF4/A;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->c:LF4/A;

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;LF4/d;)Lcom/google/firebase/crashlytics/a;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->b(LF4/d;)Lcom/google/firebase/crashlytics/a;

    move-result-object p0

    return-object p0
.end method

.method private b(LF4/d;)Lcom/google/firebase/crashlytics/a;
    .locals 11

    const/4 v0, 0x0

    invoke-static {v0}, LL4/f;->f(Z)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-class v2, Lcom/google/firebase/f;

    invoke-interface {p1, v2}, LF4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/google/firebase/f;

    const-class v2, Lg5/e;

    invoke-interface {p1, v2}, LF4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lg5/e;

    const-class v2, LI4/a;

    invoke-interface {p1, v2}, LF4/d;->i(Ljava/lang/Class;)Lf5/a;

    move-result-object v5

    const-class v2, LD4/a;

    invoke-interface {p1, v2}, LF4/d;->i(Ljava/lang/Class;)Lf5/a;

    move-result-object v6

    const-class v2, Ln5/a;

    invoke-interface {p1, v2}, LF4/d;->i(Ljava/lang/Class;)Lf5/a;

    move-result-object v7

    iget-object v2, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->a:LF4/A;

    invoke-interface {p1, v2}, LF4/d;->f(LF4/A;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ljava/util/concurrent/ExecutorService;

    iget-object v2, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->b:LF4/A;

    invoke-interface {p1, v2}, LF4/d;->f(LF4/A;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Ljava/util/concurrent/ExecutorService;

    iget-object v2, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->c:LF4/A;

    invoke-interface {p1, v2}, LF4/d;->f(LF4/A;)Ljava/lang/Object;

    move-result-object p1

    move-object v10, p1

    check-cast v10, Ljava/util/concurrent/ExecutorService;

    invoke-static/range {v3 .. v10}, Lcom/google/firebase/crashlytics/a;->c(Lcom/google/firebase/f;Lg5/e;Lf5/a;Lf5/a;Lf5/a;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)Lcom/google/firebase/crashlytics/a;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    const-wide/16 v0, 0x10

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "Initializing Crashlytics blocked main for "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " ms"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LI4/g;->b(Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 3

    const-class v0, Lcom/google/firebase/crashlytics/a;

    invoke-static {v0}, LF4/c;->e(Ljava/lang/Class;)LF4/c$b;

    move-result-object v0

    const-string/jumbo v1, "fire-cls"

    invoke-virtual {v0, v1}, LF4/c$b;->g(Ljava/lang/String;)LF4/c$b;

    move-result-object v0

    const-class v2, Lcom/google/firebase/f;

    invoke-static {v2}, LF4/q;->j(Ljava/lang/Class;)LF4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    const-class v2, Lg5/e;

    invoke-static {v2}, LF4/q;->j(Ljava/lang/Class;)LF4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    iget-object v2, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->a:LF4/A;

    invoke-static {v2}, LF4/q;->i(LF4/A;)LF4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    iget-object v2, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->b:LF4/A;

    invoke-static {v2}, LF4/q;->i(LF4/A;)LF4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    iget-object v2, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->c:LF4/A;

    invoke-static {v2}, LF4/q;->i(LF4/A;)LF4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    const-class v2, LI4/a;

    invoke-static {v2}, LF4/q;->a(Ljava/lang/Class;)LF4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    const-class v2, LD4/a;

    invoke-static {v2}, LF4/q;->a(Ljava/lang/Class;)LF4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    const-class v2, Ln5/a;

    invoke-static {v2}, LF4/q;->a(Ljava/lang/Class;)LF4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    new-instance v2, LH4/f;

    invoke-direct {v2, p0}, LH4/f;-><init>(Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;)V

    invoke-virtual {v0, v2}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v0

    invoke-virtual {v0}, LF4/c$b;->d()LF4/c$b;

    move-result-object v0

    invoke-virtual {v0}, LF4/c$b;->c()LF4/c;

    move-result-object v0

    const-string v2, "19.4.1"

    invoke-static {v1, v2}, Lm5/h;->b(Ljava/lang/String;Ljava/lang/String;)LF4/c;

    move-result-object v1

    filled-new-array {v0, v1}, [LF4/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
