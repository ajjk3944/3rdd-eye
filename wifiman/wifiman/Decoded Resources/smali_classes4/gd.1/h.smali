.class public final Lgd/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgd/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgd/h$a;
    }
.end annotation


# static fields
.field public static final c:Lgd/h$a;


# instance fields
.field private final a:Lgd/a$b;

.field private final b:Lgg/y;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgd/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lgd/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lgd/h;->c:Lgd/h$a;

    return-void
.end method

.method public constructor <init>(Lgd/a$b;Lgg/y;)V
    .locals 1

    const-string v0, "servicesLookupManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgd/h;->a:Lgd/a$b;

    iput-object p2, p0, Lgd/h;->b:Lgg/y;

    return-void
.end method

.method public static final synthetic c(Lgd/h;Ljava/lang/String;II)Z
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lgd/h;->f(Ljava/lang/String;II)Z

    move-result p0

    return p0
.end method

.method public static final synthetic d(Lgd/h;)Lgg/y;
    .locals 0

    iget-object p0, p0, Lgd/h;->b:Lgg/y;

    return-object p0
.end method

.method public static final synthetic e(Ljava/util/concurrent/atomic/AtomicInteger;ILgd/g$b$b;Ljava/util/concurrent/CopyOnWriteArraySet;Lgd/h;Lgd/a$a;)Lgd/g$b;
    .locals 0

    invoke-static/range {p0 .. p5}, Lgd/h;->i(Ljava/util/concurrent/atomic/AtomicInteger;ILgd/g$b$b;Ljava/util/concurrent/CopyOnWriteArraySet;Lgd/h;Lgd/a$a;)Lgd/g$b;

    move-result-object p0

    return-object p0
.end method

.method private final f(Ljava/lang/String;II)Z
    .locals 2

    :try_start_0
    new-instance v0, Ljava/net/Socket;

    invoke-direct {v0}, Ljava/net/Socket;-><init>()V

    new-instance v1, Ljava/net/InetSocketAddress;

    invoke-direct {v1, p1, p2}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v1, p3}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final g(ILgd/a$a;)Lgd/a;
    .locals 1

    invoke-interface {p2, p1}, Lgd/a$a;->a(I)Lgd/a;

    move-result-object p2

    if-nez p2, :cond_0

    new-instance p2, Lgd/a;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0, v0, v0}, Lgd/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object p2
.end method

.method private static final i(Ljava/util/concurrent/atomic/AtomicInteger;ILgd/g$b$b;Ljava/util/concurrent/CopyOnWriteArraySet;Lgd/h;Lgd/a$a;)Lgd/g$b;
    .locals 3

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {p4, v2, p5}, Lgd/h;->g(ILgd/a$a;)Lgd/a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p3

    if-lt p3, p1, :cond_1

    new-instance p0, Lgd/g$b$a;

    invoke-virtual {p2}, Lgd/g$b$b;->a()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2, p1, v0}, Lgd/g$b$a;-><init>(Ljava/lang/String;ILjava/util/TreeMap;)V

    goto :goto_1

    :cond_1
    new-instance p3, Lgd/g$b$b;

    invoke-virtual {p2}, Lgd/g$b$b;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p0

    invoke-direct {p3, p2, p0, p1, v0}, Lgd/g$b$b;-><init>(Ljava/lang/String;IILjava/util/TreeMap;)V

    move-object p0, p3

    :goto_1
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Lsh/i;)Lgg/i;
    .locals 3

    const-string v0, "host"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "portRange"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lsh/g;->i()I

    move-result v0

    if-ltz v0, :cond_2

    invoke-virtual {p2}, Lsh/g;->i()I

    move-result v0

    invoke-virtual {p2}, Lsh/g;->j()I

    move-result v1

    if-gt v0, v1, :cond_1

    invoke-virtual {p2}, Lsh/g;->j()I

    move-result v0

    const v1, 0xffff

    if-gt v0, v1, :cond_0

    new-instance v0, Lgd/g$b$b;

    invoke-virtual {p2}, Lsh/g;->j()I

    move-result p2

    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    const/4 v2, 0x0

    invoke-direct {v0, p1, v2, p2, v1}, Lgd/g$b$b;-><init>(Ljava/lang/String;IILjava/util/TreeMap;)V

    invoke-virtual {p0, v0}, Lgd/h;->b(Lgd/g$b$b;)Lgg/i;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "port range end must be lower than port count 65535"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "start port must be lower or equal to end port"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "port range start must be positive"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Lgd/g$b$b;)Lgg/i;
    .locals 9

    const-string v0, "from"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Lgd/g$b$b;->d()I

    move-result v0

    invoke-direct {v3, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    invoke-virtual {p1}, Lgd/g$b$b;->b()I

    move-result v4

    new-instance v7, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Lgd/g$b$b;->d()I

    move-result v0

    invoke-direct {v7, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    new-instance v6, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v6}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    invoke-virtual {p1}, Lgd/g$b$b;->e()Ljava/util/TreeMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgd/a;

    invoke-virtual {v1}, Lgd/a;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lgd/h;->a:Lgd/a$b;

    invoke-interface {v0}, Lgd/a$b;->a()Lgg/z;

    move-result-object v0

    new-instance v8, Lgd/h$b;

    move-object v1, v8

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v1 .. v7}, Lgd/h$b;-><init>(Lgd/h;Ljava/util/concurrent/atomic/AtomicInteger;ILgd/g$b$b;Ljava/util/concurrent/CopyOnWriteArraySet;Ljava/util/concurrent/atomic/AtomicInteger;)V

    invoke-virtual {v0, v8}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v0, "flatMapPublisher(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final h(I)I
    .locals 0

    const/16 p1, 0xc8

    return p1
.end method
