.class public final Lcom/marsounjan/icmp4a/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/net/InetAddress;

.field private b:Lcom/marsounjan/icmp4a/Icmp$d;

.field private c:J

.field private d:J

.field private e:J

.field private f:I

.field private g:I


# direct methods
.method public constructor <init>(Ljava/net/InetAddress;)V
    .locals 2

    const-string/jumbo v0, "ip"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/marsounjan/icmp4a/c;->a:Ljava/net/InetAddress;

    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Lcom/marsounjan/icmp4a/c;->d:J

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lcom/marsounjan/icmp4a/c;->e:J

    return-void
.end method

.method private final a(Lcom/marsounjan/icmp4a/Icmp$c;)Lcom/marsounjan/icmp4a/Icmp$d;
    .locals 12

    iget-object v1, p0, Lcom/marsounjan/icmp4a/c;->a:Ljava/net/InetAddress;

    iget v2, p0, Lcom/marsounjan/icmp4a/c;->f:I

    iget v3, p0, Lcom/marsounjan/icmp4a/c;->g:I

    const/high16 v0, 0x3f800000    # 1.0f

    if-eqz v2, :cond_0

    int-to-float v4, v3

    int-to-float v5, v2

    div-float/2addr v4, v5

    sub-float/2addr v0, v4

    :cond_0
    move v4, v0

    if-lez v3, :cond_1

    iget-wide v6, p0, Lcom/marsounjan/icmp4a/c;->d:J

    iget-wide v10, p0, Lcom/marsounjan/icmp4a/c;->e:J

    iget-wide v8, p0, Lcom/marsounjan/icmp4a/c;->c:J

    long-to-float v0, v8

    int-to-float v5, v3

    div-float/2addr v0, v5

    invoke-static {v0}, Loh/b;->g(F)J

    move-result-wide v8

    new-instance v0, Lcom/marsounjan/icmp4a/Icmp$b;

    move-object v5, v0

    invoke-direct/range {v5 .. v11}, Lcom/marsounjan/icmp4a/Icmp$b;-><init>(JJJ)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    move-object v5, v0

    :goto_0
    new-instance v7, Lcom/marsounjan/icmp4a/Icmp$d;

    move-object v0, v7

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/marsounjan/icmp4a/Icmp$d;-><init>(Ljava/net/InetAddress;IIFLcom/marsounjan/icmp4a/Icmp$b;Lcom/marsounjan/icmp4a/Icmp$c;)V

    return-object v7
.end method

.method private final c(Lcom/marsounjan/icmp4a/Icmp$c;)V
    .locals 4

    instance-of v0, p1, Lcom/marsounjan/icmp4a/Icmp$c$b;

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/marsounjan/icmp4a/c;->c:J

    check-cast p1, Lcom/marsounjan/icmp4a/Icmp$c$b;

    invoke-virtual {p1}, Lcom/marsounjan/icmp4a/Icmp$c$b;->a()J

    move-result-wide v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/marsounjan/icmp4a/c;->c:J

    iget-wide v0, p0, Lcom/marsounjan/icmp4a/c;->d:J

    invoke-virtual {p1}, Lcom/marsounjan/icmp4a/Icmp$c$b;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lcom/marsounjan/icmp4a/Icmp$c$b;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/marsounjan/icmp4a/c;->d:J

    :cond_0
    iget-wide v0, p0, Lcom/marsounjan/icmp4a/c;->e:J

    invoke-virtual {p1}, Lcom/marsounjan/icmp4a/Icmp$c$b;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    invoke-virtual {p1}, Lcom/marsounjan/icmp4a/Icmp$c$b;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/marsounjan/icmp4a/c;->e:J

    goto :goto_0

    :cond_1
    instance-of p1, p1, Lcom/marsounjan/icmp4a/Icmp$c$a;

    :cond_2
    :goto_0
    return-void
.end method

.method private final d(Lcom/marsounjan/icmp4a/Icmp$c;)V
    .locals 1

    iget v0, p0, Lcom/marsounjan/icmp4a/c;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/marsounjan/icmp4a/c;->f:I

    instance-of v0, p1, Lcom/marsounjan/icmp4a/Icmp$c$b;

    if-eqz v0, :cond_0

    iget p1, p0, Lcom/marsounjan/icmp4a/c;->g:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/marsounjan/icmp4a/c;->g:I

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lcom/marsounjan/icmp4a/Icmp$c$a;

    :goto_0
    return-void
.end method


# virtual methods
.method public final b(Lcom/marsounjan/icmp4a/Icmp$c;)Lcom/marsounjan/icmp4a/Icmp$d;
    .locals 1

    const-string/jumbo v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/marsounjan/icmp4a/c;->c(Lcom/marsounjan/icmp4a/Icmp$c;)V

    invoke-direct {p0, p1}, Lcom/marsounjan/icmp4a/c;->d(Lcom/marsounjan/icmp4a/Icmp$c;)V

    invoke-direct {p0, p1}, Lcom/marsounjan/icmp4a/c;->a(Lcom/marsounjan/icmp4a/Icmp$c;)Lcom/marsounjan/icmp4a/Icmp$d;

    move-result-object p1

    iput-object p1, p0, Lcom/marsounjan/icmp4a/c;->b:Lcom/marsounjan/icmp4a/Icmp$d;

    return-object p1
.end method
