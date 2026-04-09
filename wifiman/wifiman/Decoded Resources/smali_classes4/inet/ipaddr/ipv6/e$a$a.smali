.class public Linet/ipaddr/ipv6/e$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/ipv6/e$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "a"
.end annotation


# instance fields
.field private transient a:Linet/ipaddr/ipv6/V;

.field private transient b:Linet/ipaddr/ipv6/V;

.field private transient c:[[Linet/ipaddr/ipv6/V;

.field private transient d:[[[Linet/ipaddr/ipv6/V;

.field private transient e:[Linet/ipaddr/ipv6/V;

.field private transient f:Ljava/util/LinkedHashMap;

.field private g:Ljava/util/concurrent/locks/ReadWriteLock;

.field private transient h:[Linet/ipaddr/ipv6/b$c;


# direct methods
.method protected constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Linet/ipaddr/ipv6/e$a$a$a;

    const/high16 v1, 0x3f400000    # 0.75f

    const/4 v2, 0x1

    const/16 v3, 0x10

    invoke-direct {v0, p0, v3, v1, v2}, Linet/ipaddr/ipv6/e$a$a$a;-><init>(Linet/ipaddr/ipv6/e$a$a;IFZ)V

    iput-object v0, p0, Linet/ipaddr/ipv6/e$a$a;->f:Ljava/util/LinkedHashMap;

    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Linet/ipaddr/ipv6/e$a$a;->g:Ljava/util/concurrent/locks/ReadWriteLock;

    const/16 v0, 0x100

    new-array v0, v0, [Linet/ipaddr/ipv6/b$c;

    iput-object v0, p0, Linet/ipaddr/ipv6/e$a$a;->h:[Linet/ipaddr/ipv6/b$c;

    return-void
.end method

.method static synthetic a(Linet/ipaddr/ipv6/e$a$a;)[[Linet/ipaddr/ipv6/V;
    .locals 0

    iget-object p0, p0, Linet/ipaddr/ipv6/e$a$a;->c:[[Linet/ipaddr/ipv6/V;

    return-object p0
.end method

.method static synthetic c(Linet/ipaddr/ipv6/e$a$a;[[Linet/ipaddr/ipv6/V;)[[Linet/ipaddr/ipv6/V;
    .locals 0

    iput-object p1, p0, Linet/ipaddr/ipv6/e$a$a;->c:[[Linet/ipaddr/ipv6/V;

    return-object p1
.end method

.method static synthetic d(Linet/ipaddr/ipv6/e$a$a;)Linet/ipaddr/ipv6/V;
    .locals 0

    iget-object p0, p0, Linet/ipaddr/ipv6/e$a$a;->a:Linet/ipaddr/ipv6/V;

    return-object p0
.end method

.method static synthetic g(Linet/ipaddr/ipv6/e$a$a;)Ljava/util/LinkedHashMap;
    .locals 0

    iget-object p0, p0, Linet/ipaddr/ipv6/e$a$a;->f:Ljava/util/LinkedHashMap;

    return-object p0
.end method

.method static synthetic h(Linet/ipaddr/ipv6/e$a$a;Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/V;
    .locals 0

    iput-object p1, p0, Linet/ipaddr/ipv6/e$a$a;->a:Linet/ipaddr/ipv6/V;

    return-object p1
.end method

.method static synthetic j(Linet/ipaddr/ipv6/e$a$a;)[[[Linet/ipaddr/ipv6/V;
    .locals 0

    iget-object p0, p0, Linet/ipaddr/ipv6/e$a$a;->d:[[[Linet/ipaddr/ipv6/V;

    return-object p0
.end method

.method static synthetic l(Linet/ipaddr/ipv6/e$a$a;[[[Linet/ipaddr/ipv6/V;)[[[Linet/ipaddr/ipv6/V;
    .locals 0

    iput-object p1, p0, Linet/ipaddr/ipv6/e$a$a;->d:[[[Linet/ipaddr/ipv6/V;

    return-object p1
.end method

.method static synthetic m(Linet/ipaddr/ipv6/e$a$a;)Linet/ipaddr/ipv6/V;
    .locals 0

    iget-object p0, p0, Linet/ipaddr/ipv6/e$a$a;->b:Linet/ipaddr/ipv6/V;

    return-object p0
.end method

.method static synthetic n(Linet/ipaddr/ipv6/e$a$a;Linet/ipaddr/ipv6/V;)Linet/ipaddr/ipv6/V;
    .locals 0

    iput-object p1, p0, Linet/ipaddr/ipv6/e$a$a;->b:Linet/ipaddr/ipv6/V;

    return-object p1
.end method

.method static synthetic o(Linet/ipaddr/ipv6/e$a$a;)[Linet/ipaddr/ipv6/V;
    .locals 0

    iget-object p0, p0, Linet/ipaddr/ipv6/e$a$a;->e:[Linet/ipaddr/ipv6/V;

    return-object p0
.end method

.method static synthetic p(Linet/ipaddr/ipv6/e$a$a;[Linet/ipaddr/ipv6/V;)[Linet/ipaddr/ipv6/V;
    .locals 0

    iput-object p1, p0, Linet/ipaddr/ipv6/e$a$a;->e:[Linet/ipaddr/ipv6/V;

    return-object p1
.end method

.method static synthetic r(Linet/ipaddr/ipv6/e$a$a;)[Linet/ipaddr/ipv6/b$c;
    .locals 0

    iget-object p0, p0, Linet/ipaddr/ipv6/e$a$a;->h:[Linet/ipaddr/ipv6/b$c;

    return-object p0
.end method

.method static synthetic s(Linet/ipaddr/ipv6/e$a$a;)Ljava/util/concurrent/locks/ReadWriteLock;
    .locals 0

    iget-object p0, p0, Linet/ipaddr/ipv6/e$a$a;->g:Ljava/util/concurrent/locks/ReadWriteLock;

    return-object p0
.end method
