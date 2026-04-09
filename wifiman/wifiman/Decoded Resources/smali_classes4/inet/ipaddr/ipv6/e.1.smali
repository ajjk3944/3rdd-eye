.class public Linet/ipaddr/ipv6/e;
.super Linet/ipaddr/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/ipv6/e$a;
    }
.end annotation


# static fields
.field private static j:Linet/ipaddr/c$b;

.field static final k:[Linet/ipaddr/ipv6/V;

.field private static final l:[Linet/ipaddr/ipv6/Q;

.field private static final m:[Linet/ipaddr/ipv6/b;

.field private static n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Linet/ipaddr/c;->c()Linet/ipaddr/c$b;

    move-result-object v0

    sput-object v0, Linet/ipaddr/ipv6/e;->j:Linet/ipaddr/c$b;

    const/4 v0, 0x0

    new-array v1, v0, [Linet/ipaddr/ipv6/V;

    sput-object v1, Linet/ipaddr/ipv6/e;->k:[Linet/ipaddr/ipv6/V;

    new-array v1, v0, [Linet/ipaddr/ipv6/Q;

    sput-object v1, Linet/ipaddr/ipv6/e;->l:[Linet/ipaddr/ipv6/Q;

    new-array v0, v0, [Linet/ipaddr/ipv6/b;

    sput-object v0, Linet/ipaddr/ipv6/e;->m:[Linet/ipaddr/ipv6/b;

    const/4 v0, 0x1

    sput-boolean v0, Linet/ipaddr/ipv6/e;->n:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const-class v0, Linet/ipaddr/ipv6/b;

    invoke-direct {p0, v0}, Linet/ipaddr/i;-><init>(Ljava/lang/Class;)V

    return-void
.end method

.method public static synthetic J(Linet/ipaddr/ipv6/b;Ljava/lang/Integer;)Linet/ipaddr/ipv6/V;
    .locals 0

    invoke-static {p0, p1}, Linet/ipaddr/ipv6/e;->d0(Linet/ipaddr/ipv6/b;Ljava/lang/Integer;)Linet/ipaddr/ipv6/V;

    move-result-object p0

    return-object p0
.end method

.method static synthetic K()Z
    .locals 1

    sget-boolean v0, Linet/ipaddr/ipv6/e;->n:Z

    return v0
.end method

.method private static synthetic d0(Linet/ipaddr/ipv6/b;Ljava/lang/Integer;)Linet/ipaddr/ipv6/V;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/b;->J1(I)Linet/ipaddr/ipv6/V;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected E()Ljava/util/function/BiFunction;
    .locals 1

    new-instance v0, Linet/ipaddr/ipv6/c;

    invoke-direct {v0}, Linet/ipaddr/ipv6/c;-><init>()V

    return-object v0
.end method

.method protected P()Linet/ipaddr/ipv6/e$a;
    .locals 1

    new-instance v0, Linet/ipaddr/ipv6/e$a;

    invoke-direct {v0, p0}, Linet/ipaddr/ipv6/e$a;-><init>(Linet/ipaddr/ipv6/e;)V

    return-object v0
.end method

.method protected S()Linet/ipaddr/ipv6/b;
    .locals 5

    invoke-virtual {p0}, Linet/ipaddr/ipv6/e;->T()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Linet/ipaddr/ipv6/e$a;->e1(I)Linet/ipaddr/ipv6/V;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Linet/ipaddr/ipv6/e$a;->h1(I)[Linet/ipaddr/ipv6/V;

    move-result-object v3

    const/4 v4, 0x6

    aput-object v2, v3, v4

    const/4 v4, 0x5

    aput-object v2, v3, v4

    const/4 v4, 0x4

    aput-object v2, v3, v4

    const/4 v4, 0x3

    aput-object v2, v3, v4

    const/4 v4, 0x2

    aput-object v2, v3, v4

    const/4 v4, 0x1

    aput-object v2, v3, v4

    aput-object v2, v3, v1

    const/4 v1, 0x7

    invoke-virtual {v0, v4}, Linet/ipaddr/ipv6/e$a;->e1(I)Linet/ipaddr/ipv6/V;

    move-result-object v2

    aput-object v2, v3, v1

    invoke-virtual {v0, v3}, Linet/ipaddr/ipv6/e$a;->W0([Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/b;

    move-result-object v0

    return-object v0
.end method

.method public T()Linet/ipaddr/ipv6/e$a;
    .locals 1

    invoke-super {p0}, Linet/ipaddr/i;->m()Linet/ipaddr/i$a;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv6/e$a;

    return-object v0
.end method

.method public bridge synthetic a()Lbg/a;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/e;->T()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    return-object v0
.end method

.method protected b0(Linet/ipaddr/ipv6/e;)Z
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/c;->g(Linet/ipaddr/c;)Z

    move-result p1

    return p1
.end method

.method public d()Linet/ipaddr/c$b;
    .locals 1

    sget-object v0, Linet/ipaddr/ipv6/e;->j:Linet/ipaddr/c$b;

    return-object v0
.end method

.method protected bridge synthetic j()Linet/ipaddr/i$a;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/e;->P()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic l()Linet/ipaddr/g;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/e;->S()Linet/ipaddr/ipv6/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic m()Linet/ipaddr/i$a;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/e;->T()Linet/ipaddr/ipv6/e$a;

    move-result-object v0

    return-object v0
.end method

.method public n0()Linet/ipaddr/g$a;
    .locals 1

    sget-object v0, Linet/ipaddr/g$a;->IPV6:Linet/ipaddr/g$a;

    return-object v0
.end method

.method protected y()Ljava/util/function/Function;
    .locals 1

    new-instance v0, Linet/ipaddr/ipv6/d;

    invoke-direct {v0}, Linet/ipaddr/ipv6/d;-><init>()V

    return-object v0
.end method
