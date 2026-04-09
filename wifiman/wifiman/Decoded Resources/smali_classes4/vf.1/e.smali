.class public final Lvf/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvf/e$a;,
        Lvf/e$b;,
        Lvf/e$c;
    }
.end annotation


# static fields
.field public static final d:Lvf/e$a;


# instance fields
.field private final a:Landroidx/compose/ui/platform/t1;

.field private final b:[Lvf/e$c;

.field private final c:LLi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvf/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvf/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lvf/e;->d:Lvf/e$a;

    return-void
.end method

.method private constructor <init>(LL0/d;JLandroidx/compose/ui/platform/t1;LIi/N;)V
    .locals 7

    const-string v0, "str"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uriHandler"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p4, p0, Lvf/e;->a:Landroidx/compose/ui/platform/t1;

    .line 4
    invoke-static {}, Lvf/e$c;->getEntries()Lfh/a;

    move-result-object p4

    const/4 v0, 0x0

    .line 5
    new-array v0, v0, [Lvf/e$c;

    invoke-interface {p4, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p4

    check-cast p4, [Lvf/e$c;

    .line 6
    iput-object p4, p0, Lvf/e;->b:[Lvf/e$c;

    .line 7
    invoke-direct {p0, p1, p2, p3}, Lvf/e;->f(LL0/d;J)LLi/g;

    move-result-object p2

    .line 8
    sget-object v0, LLi/J;->a:LLi/J$a;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    invoke-static/range {v0 .. v6}, LLi/J$a;->b(LLi/J$a;JJILjava/lang/Object;)LLi/J;

    move-result-object p3

    .line 9
    invoke-static {p2, p5, p3, p1}, LLi/i;->M(LLi/g;LIi/N;LLi/J;Ljava/lang/Object;)LLi/N;

    move-result-object p1

    iput-object p1, p0, Lvf/e;->c:LLi/N;

    return-void
.end method

.method public synthetic constructor <init>(LL0/d;JLandroidx/compose/ui/platform/t1;LIi/N;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lvf/e;-><init>(LL0/d;JLandroidx/compose/ui/platform/t1;LIi/N;)V

    return-void
.end method

.method public static final synthetic a(Lvf/e;Lvf/e$b;)Lvf/e$c;
    .locals 0

    invoke-direct {p0, p1}, Lvf/e;->c(Lvf/e$b;)Lvf/e$c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lvf/e;Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lvf/e;->h(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lvf/e$b;)Lvf/e$c;
    .locals 10

    iget-object v0, p0, Lvf/e;->b:[Lvf/e$c;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lvf/e$c;->getPort()I

    move-result v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v4, p0

    move-object v5, p1

    invoke-static/range {v4 .. v9}, Lvf/e;->e(Lvf/e;Lvf/e$b;IIILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    return-object v3
.end method

.method private final d(Lvf/e$b;II)Z
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HyperlinkString - Checking host: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v2, v3, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    const/4 v0, 0x0

    :try_start_0
    new-instance v4, Ljava/net/Socket;

    invoke-direct {v4}, Ljava/net/Socket;-><init>()V

    instance-of v5, p1, Lvf/e$b$b;

    if-eqz v5, :cond_0

    new-instance v5, Ljava/net/InetSocketAddress;

    move-object v6, p1

    check-cast v6, Lvf/e$b$b;

    invoke-virtual {v6}, Lvf/e$b$b;->a()Linet/ipaddr/g;

    move-result-object v6

    invoke-virtual {v6}, Linet/ipaddr/g;->p1()Ljava/net/InetAddress;

    move-result-object v6

    invoke-direct {v5, v6, p2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    goto :goto_0

    :cond_0
    instance-of v5, p1, Lvf/e$b$a;

    if-eqz v5, :cond_1

    new-instance v5, Ljava/net/InetSocketAddress;

    move-object v6, p1

    check-cast v6, Lvf/e$b$a;

    invoke-virtual {v6}, Lvf/e$b$a;->a()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6, p2}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    :goto_0
    invoke-virtual {v4, v5, p3}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    invoke-virtual {v4}, Ljava/net/Socket;->close()V

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    new-instance p3, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p3}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_1
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", port: "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " - RESULT "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2, v3, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return v0
.end method

.method static synthetic e(Lvf/e;Lvf/e$b;IIILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/16 p3, 0xc8

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lvf/e;->d(Lvf/e$b;II)Z

    move-result p0

    return p0
.end method

.method private final f(LL0/d;J)LLi/g;
    .locals 7

    new-instance v6, Lvf/e$d;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p1

    move-object v2, p0

    move-wide v3, p2

    invoke-direct/range {v0 .. v5}, Lvf/e$d;-><init>(LL0/d;Lvf/e;JLdh/e;)V

    invoke-static {v6}, LLi/i;->A(Lmh/p;)LLi/g;

    move-result-object p1

    return-object p1
.end method

.method private final h(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, LIi/c0;->b()LIi/J;

    move-result-object v0

    new-instance v1, Lvf/e$e;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lvf/e$e;-><init>(Ljava/lang/String;Lvf/e;Ldh/e;)V

    invoke-static {v0, v1, p2}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final g()LLi/N;
    .locals 1

    iget-object v0, p0, Lvf/e;->c:LLi/N;

    return-object v0
.end method

.method public final i(I)V
    .locals 4

    iget-object v0, p0, Lvf/e;->c:LLi/N;

    invoke-interface {v0}, LLi/N;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LL0/d;

    invoke-virtual {v0, p1, p1}, LL0/d;->i(II)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LL0/d$c;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LL0/d$c;->i()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    const-string v2, "hostAddress"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, LL0/d$c;->g()Ljava/lang/Object;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "User clicked on \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\'. Opening default web browser..."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v0, v2, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lvf/e;->a:Landroidx/compose/ui/platform/t1;

    invoke-virtual {p1}, LL0/d$c;->g()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-interface {v0, p1}, Landroidx/compose/ui/platform/t1;->a(Ljava/lang/String;)V

    :cond_1
    return-void
.end method
