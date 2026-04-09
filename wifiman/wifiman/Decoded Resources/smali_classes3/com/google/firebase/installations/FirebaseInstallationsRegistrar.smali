.class public Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-installations"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LF4/d;)Lg5/e;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;->lambda$getComponents$0(LF4/d;)Lg5/e;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(LF4/d;)Lg5/e;
    .locals 6

    new-instance v0, Lcom/google/firebase/installations/c;

    const-class v1, Lcom/google/firebase/f;

    invoke-interface {p0, v1}, LF4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/f;

    const-class v2, Le5/i;

    invoke-interface {p0, v2}, LF4/d;->e(Ljava/lang/Class;)Lf5/b;

    move-result-object v2

    const-class v3, LE4/a;

    const-class v4, Ljava/util/concurrent/ExecutorService;

    invoke-static {v3, v4}, LF4/A;->a(Ljava/lang/Class;Ljava/lang/Class;)LF4/A;

    move-result-object v3

    invoke-interface {p0, v3}, LF4/d;->f(LF4/A;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/ExecutorService;

    const-class v4, LE4/b;

    const-class v5, Ljava/util/concurrent/Executor;

    invoke-static {v4, v5}, LF4/A;->a(Ljava/lang/Class;Ljava/lang/Class;)LF4/A;

    move-result-object v4

    invoke-interface {p0, v4}, LF4/d;->f(LF4/A;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/Executor;

    invoke-static {p0}, LG4/i;->a(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/google/firebase/installations/c;-><init>(Lcom/google/firebase/f;Lf5/b;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LF4/c;",
            ">;"
        }
    .end annotation

    const-class v0, Lg5/e;

    invoke-static {v0}, LF4/c;->e(Ljava/lang/Class;)LF4/c$b;

    move-result-object v0

    const-string/jumbo v1, "fire-installations"

    invoke-virtual {v0, v1}, LF4/c$b;->g(Ljava/lang/String;)LF4/c$b;

    move-result-object v0

    const-class v2, Lcom/google/firebase/f;

    invoke-static {v2}, LF4/q;->j(Ljava/lang/Class;)LF4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    const-class v2, Le5/i;

    invoke-static {v2}, LF4/q;->h(Ljava/lang/Class;)LF4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    const-class v2, LE4/a;

    const-class v3, Ljava/util/concurrent/ExecutorService;

    invoke-static {v2, v3}, LF4/A;->a(Ljava/lang/Class;Ljava/lang/Class;)LF4/A;

    move-result-object v2

    invoke-static {v2}, LF4/q;->i(LF4/A;)LF4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    const-class v2, LE4/b;

    const-class v3, Ljava/util/concurrent/Executor;

    invoke-static {v2, v3}, LF4/A;->a(Ljava/lang/Class;Ljava/lang/Class;)LF4/A;

    move-result-object v2

    invoke-static {v2}, LF4/q;->i(LF4/A;)LF4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    new-instance v2, Lg5/f;

    invoke-direct {v2}, Lg5/f;-><init>()V

    invoke-virtual {v0, v2}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v0

    invoke-virtual {v0}, LF4/c$b;->c()LF4/c;

    move-result-object v0

    invoke-static {}, Le5/h;->a()LF4/c;

    move-result-object v2

    const-string v3, "18.0.0"

    invoke-static {v1, v3}, Lm5/h;->b(Ljava/lang/String;Ljava/lang/String;)LF4/c;

    move-result-object v1

    filled-new-array {v0, v2, v1}, [LF4/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
