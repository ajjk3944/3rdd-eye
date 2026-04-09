.class public final LF4/n$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF4/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Ljava/util/List;

.field private final c:Ljava/util/List;

.field private d:LF4/i;


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LF4/n$b;->b:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LF4/n$b;->c:Ljava/util/List;

    sget-object v0, LF4/i;->a:LF4/i;

    iput-object v0, p0, LF4/n$b;->d:LF4/i;

    iput-object p1, p0, LF4/n$b;->a:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/components/ComponentRegistrar;)Lcom/google/firebase/components/ComponentRegistrar;
    .locals 0

    invoke-static {p0}, LF4/n$b;->f(Lcom/google/firebase/components/ComponentRegistrar;)Lcom/google/firebase/components/ComponentRegistrar;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic f(Lcom/google/firebase/components/ComponentRegistrar;)Lcom/google/firebase/components/ComponentRegistrar;
    .locals 0

    return-object p0
.end method


# virtual methods
.method public b(LF4/c;)LF4/n$b;
    .locals 1

    iget-object v0, p0, LF4/n$b;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public c(Lcom/google/firebase/components/ComponentRegistrar;)LF4/n$b;
    .locals 2

    iget-object v0, p0, LF4/n$b;->b:Ljava/util/List;

    new-instance v1, LF4/o;

    invoke-direct {v1, p1}, LF4/o;-><init>(Lcom/google/firebase/components/ComponentRegistrar;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public d(Ljava/util/Collection;)LF4/n$b;
    .locals 1

    iget-object v0, p0, LF4/n$b;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public e()LF4/n;
    .locals 7

    new-instance v6, LF4/n;

    iget-object v1, p0, LF4/n$b;->a:Ljava/util/concurrent/Executor;

    iget-object v2, p0, LF4/n$b;->b:Ljava/util/List;

    iget-object v3, p0, LF4/n$b;->c:Ljava/util/List;

    iget-object v4, p0, LF4/n$b;->d:LF4/i;

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LF4/n;-><init>(Ljava/util/concurrent/Executor;Ljava/lang/Iterable;Ljava/util/Collection;LF4/i;LF4/n$a;)V

    return-object v6
.end method

.method public g(LF4/i;)LF4/n$b;
    .locals 0

    iput-object p1, p0, LF4/n$b;->d:LF4/i;

    return-object p0
.end method
