.class final Lz7/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz7/d;->a(Ljava/lang/Integer;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz7/d;

.field final synthetic b:Ljava/lang/Integer;


# direct methods
.method constructor <init>(Lz7/d;Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lz7/d$a;->a:Lz7/d;

    iput-object p2, p0, Lz7/d$a;->b:Ljava/lang/Integer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/net/DatagramSocket;)V
    .locals 0

    invoke-static {p0}, Lz7/d$a;->e(Ljava/net/DatagramSocket;)V

    return-void
.end method

.method public static synthetic b(Lz7/d;Ljava/lang/Integer;Lo7/a;Lgg/j;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lz7/d$a;->d(Lz7/d;Ljava/lang/Integer;Lo7/a;Lgg/j;)V

    return-void
.end method

.method private static final d(Lz7/d;Ljava/lang/Integer;Lo7/a;Lgg/j;)V
    .locals 1

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$network"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "emitter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lz7/d;->b(Lz7/d;)Lz7/x;

    move-result-object p0

    invoke-interface {p0, p1}, Lz7/x;->a(Ljava/lang/Integer;)Ljava/net/DatagramSocket;

    move-result-object p0

    instance-of p1, p2, Lo7/a$a;

    if-eqz p1, :cond_0

    :try_start_0
    check-cast p2, Lo7/a$a;

    invoke-virtual {p2, p0}, Lo7/a$a;->a(Ljava/net/DatagramSocket;)V
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object p2, Lz7/d$a$a;->a:Lz7/d$a$a;

    invoke-static {p2, p1}, Lx7/a;->d(Lmh/a;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    new-instance p1, Lz7/c;

    invoke-direct {p1, p0}, Lz7/c;-><init>(Ljava/net/DatagramSocket;)V

    invoke-interface {p3, p1}, Lgg/j;->d(Lkg/e;)V

    new-instance p1, Lz7/z;

    invoke-direct {p1, p0}, Lz7/z;-><init>(Ljava/net/DatagramSocket;)V

    invoke-interface {p3, p1}, Lgg/h;->h(Ljava/lang/Object;)V

    return-void
.end method

.method private static final e(Ljava/net/DatagramSocket;)V
    .locals 1

    const-string v0, "$socket"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Ljava/net/DatagramSocket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    sget-object v0, Lz7/d$a$b;->a:Lz7/d$a$b;

    invoke-static {v0, p0}, Lx7/a;->d(Lmh/a;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo7/a;

    invoke-virtual {p0, p1}, Lz7/d$a;->c(Lo7/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lo7/a;)LDj/a;
    .locals 3

    const-string/jumbo v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lo7/a$a;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lo7/a$c;->a:Lo7/a$c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lz7/d$a;->a:Lz7/d;

    iget-object v1, p0, Lz7/d$a;->b:Ljava/lang/Integer;

    new-instance v2, Lz7/b;

    invoke-direct {v2, v0, v1, p1}, Lz7/b;-><init>(Lz7/d;Ljava/lang/Integer;Lo7/a;)V

    sget-object p1, Lgg/a;->ERROR:Lgg/a;

    invoke-static {v2, p1}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object p1

    goto :goto_1

    :cond_1
    sget-object v0, Lo7/a$b;->a:Lo7/a$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lz7/z;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lz7/z;-><init>(Ljava/net/DatagramSocket;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    :goto_1
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
