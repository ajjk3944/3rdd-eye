.class public final Lkd/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkd/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkd/g$a;
    }
.end annotation


# static fields
.field public static final c:Lkd/g$a;


# instance fields
.field private final a:Lgg/z;

.field private final b:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkd/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkd/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkd/g;->c:Lkd/g$a;

    return-void
.end method

.method public constructor <init>(LZc/f;Ltd/d;)V
    .locals 3

    const-string v0, "networkConnectionManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lkd/g$b;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Lkd/g$b;-><init>(Ltd/d;Ldh/e;)V

    const/4 p2, 0x1

    invoke-static {v1, v0, p2, v1}, LQi/l;->c(Ldh/i;Lmh/p;ILjava/lang/Object;)Lgg/z;

    move-result-object v0

    invoke-virtual {v0}, Lgg/z;->e()Lgg/z;

    move-result-object v0

    const-string v2, "cache(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lkd/g;->a:Lgg/z;

    invoke-interface {p1}, LZc/f;->getState()Lgg/i;

    move-result-object p1

    new-instance v0, Lkd/g$c;

    invoke-direct {v0, p0}, Lkd/g$c;-><init>(Lkd/g;)V

    invoke-virtual {p1, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v0, LWc/b$b;

    invoke-direct {v0, v1, p2, v1}, LWc/b$b;-><init>(Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->x1(LDj/a;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    sget-object v0, Lkd/g$d;->a:Lkd/g$d;

    invoke-virtual {p1, v0}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p1

    sget-object v0, Lkd/g$e;->a:Lkd/g$e;

    invoke-virtual {p1, v0}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    new-instance v0, Lkd/f;

    invoke-direct {v0}, Lkd/f;-><init>()V

    invoke-virtual {p1, v0}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lkd/g;->b:Lgg/i;

    return-void
.end method

.method public static synthetic b()V
    .locals 0

    invoke-static {}, Lkd/g;->f()V

    return-void
.end method

.method public static final synthetic c(Lkd/g;LLa/b;)Lkd/e;
    .locals 0

    invoke-direct {p0, p1}, Lkd/g;->e(LLa/b;)Lkd/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lkd/g;)Lgg/z;
    .locals 0

    iget-object p0, p0, Lkd/g;->a:Lgg/z;

    return-object p0
.end method

.method private final e(LLa/b;)Lkd/e;
    .locals 12

    new-instance v6, Lkd/e;

    invoke-virtual {p1}, LLa/b;->f()Ljava/net/InetAddress;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lee/b;->a(Ljava/net/InetAddress;)Linet/ipaddr/g;

    move-result-object v0

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {p1}, LLa/b;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, LLa/b;->b()Ljava/net/URL;

    move-result-object v4

    invoke-virtual {p1}, LLa/b;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, LLa/b;->d()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LLa/b;->e()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v0, LW7/c;

    new-instance v7, LW7/c$a;

    invoke-virtual {p1}, LLa/b;->d()Ljava/lang/Double;

    move-result-object v8

    invoke-static {v8}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    invoke-virtual {p1}, LLa/b;->e()Ljava/lang/Double;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    invoke-direct {v7, v8, v9, v10, v11}, LW7/c$a;-><init>(DD)V

    const/4 p1, 0x2

    invoke-direct {v0, v7, v1, p1, v1}, LW7/c;-><init>(LW7/c$a;Ljava/lang/Double;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v0

    goto :goto_1

    :cond_1
    move-object p1, v1

    :goto_1
    move-object v0, v6

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lkd/e;-><init>(Linet/ipaddr/g;Ljava/lang/String;Ljava/net/URL;Ljava/lang/String;LW7/c;)V

    return-object v6
.end method

.method private static final f()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "PublicIP status Finished"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lkd/g;->b:Lgg/i;

    return-object v0
.end method
