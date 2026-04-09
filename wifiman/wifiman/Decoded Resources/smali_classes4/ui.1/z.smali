.class public abstract Lui/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/concurrent/ConcurrentHashMap;

.field private final b:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lui/z;->a:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lui/z;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method static synthetic a(Lui/z;Ljava/lang/String;)I
    .locals 0

    invoke-static {p0, p1}, Lui/z;->f(Lui/z;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private static final f(Lui/z;Ljava/lang/String;)I
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lui/z;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p0

    return p0
.end method


# virtual methods
.method public abstract b(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lmh/l;)I
.end method

.method public final c(Lth/d;)Lui/n;
    .locals 1

    const-string v0, "kClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lui/n;

    invoke-virtual {p0, p1}, Lui/z;->e(Lth/d;)I

    move-result p1

    invoke-direct {v0, p1}, Lui/n;-><init>(I)V

    return-object v0
.end method

.method public final d(Ljava/lang/String;)I
    .locals 2

    const-string v0, "keyQualifiedName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lui/z;->a:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Lui/y;

    invoke-direct {v1, p0}, Lui/y;-><init>(Lui/z;)V

    invoke-virtual {p0, v0, p1, v1}, Lui/z;->b(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lmh/l;)I

    move-result p1

    return p1
.end method

.method public final e(Lth/d;)I
    .locals 1

    const-string v0, "kClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lth/d;->l()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lui/z;->d(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method protected final g()Ljava/util/Collection;
    .locals 2

    iget-object v0, p0, Lui/z;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
