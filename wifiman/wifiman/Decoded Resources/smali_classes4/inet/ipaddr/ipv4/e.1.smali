.class public Linet/ipaddr/ipv4/e;
.super Linet/ipaddr/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/ipv4/e$a;
    }
.end annotation


# static fields
.field private static j:Linet/ipaddr/c$b;

.field private static k:Z

.field private static final l:[Linet/ipaddr/ipv4/M;

.field private static final m:[Linet/ipaddr/ipv4/I;

.field private static final n:[Linet/ipaddr/ipv4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Linet/ipaddr/c;->c()Linet/ipaddr/c$b;

    move-result-object v0

    sput-object v0, Linet/ipaddr/ipv4/e;->j:Linet/ipaddr/c$b;

    const/4 v0, 0x1

    sput-boolean v0, Linet/ipaddr/ipv4/e;->k:Z

    const/4 v0, 0x0

    new-array v1, v0, [Linet/ipaddr/ipv4/M;

    sput-object v1, Linet/ipaddr/ipv4/e;->l:[Linet/ipaddr/ipv4/M;

    new-array v1, v0, [Linet/ipaddr/ipv4/I;

    sput-object v1, Linet/ipaddr/ipv4/e;->m:[Linet/ipaddr/ipv4/I;

    new-array v0, v0, [Linet/ipaddr/ipv4/b;

    sput-object v0, Linet/ipaddr/ipv4/e;->n:[Linet/ipaddr/ipv4/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const-class v0, Linet/ipaddr/ipv4/b;

    invoke-direct {p0, v0}, Linet/ipaddr/i;-><init>(Ljava/lang/Class;)V

    return-void
.end method

.method public static synthetic J(Linet/ipaddr/ipv4/b;Ljava/lang/Integer;)Linet/ipaddr/ipv4/M;
    .locals 0

    invoke-static {p0, p1}, Linet/ipaddr/ipv4/e;->q0(Linet/ipaddr/ipv4/b;Ljava/lang/Integer;)Linet/ipaddr/ipv4/M;

    move-result-object p0

    return-object p0
.end method

.method static synthetic K()[Linet/ipaddr/ipv4/M;
    .locals 1

    sget-object v0, Linet/ipaddr/ipv4/e;->l:[Linet/ipaddr/ipv4/M;

    return-object v0
.end method

.method static synthetic P()Z
    .locals 1

    sget-boolean v0, Linet/ipaddr/ipv4/e;->k:Z

    return v0
.end method

.method static synthetic S(I)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Linet/ipaddr/i;->h(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic q0(Linet/ipaddr/ipv4/b;Ljava/lang/Integer;)Linet/ipaddr/ipv4/M;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv4/b;->G1(I)Linet/ipaddr/ipv4/M;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected E()Ljava/util/function/BiFunction;
    .locals 1

    new-instance v0, Linet/ipaddr/ipv4/c;

    invoke-direct {v0}, Linet/ipaddr/ipv4/c;-><init>()V

    return-object v0
.end method

.method protected T()Linet/ipaddr/ipv4/e$a;
    .locals 1

    new-instance v0, Linet/ipaddr/ipv4/e$a;

    invoke-direct {v0, p0}, Linet/ipaddr/ipv4/e$a;-><init>(Linet/ipaddr/ipv4/e;)V

    return-object v0
.end method

.method public bridge synthetic a()Lbg/a;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/e;->d0()Linet/ipaddr/ipv4/e$a;

    move-result-object v0

    return-object v0
.end method

.method protected b0()Linet/ipaddr/ipv4/b;
    .locals 5

    invoke-virtual {p0}, Linet/ipaddr/ipv4/e;->d0()Linet/ipaddr/ipv4/e$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Linet/ipaddr/ipv4/e$a;->a1(I)Linet/ipaddr/ipv4/M;

    move-result-object v2

    const/4 v3, 0x4

    invoke-virtual {v0, v3}, Linet/ipaddr/ipv4/e$a;->d1(I)[Linet/ipaddr/ipv4/M;

    move-result-object v3

    const/16 v4, 0x7f

    invoke-virtual {v0, v4}, Linet/ipaddr/ipv4/e$a;->a1(I)Linet/ipaddr/ipv4/M;

    move-result-object v4

    aput-object v4, v3, v1

    const/4 v1, 0x2

    aput-object v2, v3, v1

    const/4 v1, 0x1

    aput-object v2, v3, v1

    const/4 v2, 0x3

    invoke-virtual {v0, v1}, Linet/ipaddr/ipv4/e$a;->a1(I)Linet/ipaddr/ipv4/M;

    move-result-object v1

    aput-object v1, v3, v2

    invoke-virtual {v0, v3}, Linet/ipaddr/ipv4/e$a;->U0([Linet/ipaddr/ipv4/M;)Linet/ipaddr/ipv4/b;

    move-result-object v0

    return-object v0
.end method

.method public d()Linet/ipaddr/c$b;
    .locals 1

    sget-object v0, Linet/ipaddr/ipv4/e;->j:Linet/ipaddr/c$b;

    return-object v0
.end method

.method public d0()Linet/ipaddr/ipv4/e$a;
    .locals 1

    invoke-super {p0}, Linet/ipaddr/i;->m()Linet/ipaddr/i$a;

    move-result-object v0

    check-cast v0, Linet/ipaddr/ipv4/e$a;

    return-object v0
.end method

.method protected f0(Linet/ipaddr/ipv4/e;)Z
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/c;->g(Linet/ipaddr/c;)Z

    move-result p1

    return p1
.end method

.method protected bridge synthetic j()Linet/ipaddr/i$a;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/e;->T()Linet/ipaddr/ipv4/e$a;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic l()Linet/ipaddr/g;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/e;->b0()Linet/ipaddr/ipv4/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic m()Linet/ipaddr/i$a;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv4/e;->d0()Linet/ipaddr/ipv4/e$a;

    move-result-object v0

    return-object v0
.end method

.method public n0()Linet/ipaddr/g$a;
    .locals 1

    sget-object v0, Linet/ipaddr/g$a;->IPV4:Linet/ipaddr/g$a;

    return-object v0
.end method

.method protected y()Ljava/util/function/Function;
    .locals 1

    new-instance v0, Linet/ipaddr/ipv4/d;

    invoke-direct {v0}, Linet/ipaddr/ipv4/d;-><init>()V

    return-object v0
.end method
