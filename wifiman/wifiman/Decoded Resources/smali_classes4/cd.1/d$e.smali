.class final Lcd/d$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcd/d;->a(Lcd/a$b;Ljava/lang/Integer;IJJLandroid/net/Network;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcd/d$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcd/d$e;

    invoke-direct {v0}, Lcd/d$e;-><init>()V

    sput-object v0, Lcd/d$e;->a:Lcd/d$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcd/a$d;Lcd/d$a;)Lcd/a$d;
    .locals 8

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lcd/d$a$b;

    if-eqz v0, :cond_8

    check-cast p2, Lcd/d$a$b;

    invoke-virtual {p2}, Lcd/d$a$b;->a()Lcom/marsounjan/icmp4a/Icmp$d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/marsounjan/icmp4a/Icmp$d;->a()Ljava/net/InetAddress;

    move-result-object v0

    invoke-static {v0}, Lee/b;->a(Ljava/net/InetAddress;)Linet/ipaddr/g;

    move-result-object v0

    invoke-virtual {p1}, Lcd/a$d;->f()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p1}, Lcd/a$d;->e()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p2}, Lcd/d$a$b;->a()Lcom/marsounjan/icmp4a/Icmp$d;

    move-result-object p2

    invoke-virtual {p2}, Lcom/marsounjan/icmp4a/Icmp$d;->b()Lcom/marsounjan/icmp4a/Icmp$c;

    move-result-object p2

    instance-of v3, p2, Lcom/marsounjan/icmp4a/Icmp$c$b;

    if-eqz v3, :cond_0

    new-instance v3, Lcd/a$c$b;

    check-cast p2, Lcom/marsounjan/icmp4a/Icmp$c$b;

    invoke-virtual {p2}, Lcom/marsounjan/icmp4a/Icmp$c$b;->a()J

    move-result-wide v4

    long-to-int p2, v4

    invoke-direct {v3, p2}, Lcd/a$c$b;-><init>(I)V

    goto/16 :goto_2

    :cond_0
    instance-of v3, p2, Lcom/marsounjan/icmp4a/Icmp$c$a$c;

    if-eqz v3, :cond_1

    new-instance v3, Lcd/a$c$a$c;

    check-cast p2, Lcom/marsounjan/icmp4a/Icmp$c$a$c;

    invoke-virtual {p2}, Lcom/marsounjan/icmp4a/Icmp$c$a$c;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Lcom/marsounjan/icmp4a/Icmp$c$a$c;->b()J

    move-result-wide v5

    invoke-direct {v3, v4, v5, v6}, Lcd/a$c$a$c;-><init>(Ljava/lang/String;J)V

    goto :goto_2

    :cond_1
    instance-of v3, p2, Lcom/marsounjan/icmp4a/Icmp$c$a$b;

    if-eqz v3, :cond_2

    new-instance v3, Lcd/a$c$a$a;

    check-cast p2, Lcom/marsounjan/icmp4a/Icmp$c$a$b;

    invoke-virtual {p2}, Lcom/marsounjan/icmp4a/Icmp$c$a$b;->a()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v3, p2}, Lcd/a$c$a$a;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    instance-of v3, p2, Lcom/marsounjan/icmp4a/Icmp$c$a$a;

    if-eqz v3, :cond_7

    check-cast p2, Lcom/marsounjan/icmp4a/Icmp$c$a$a;

    invoke-virtual {p2}, Lcom/marsounjan/icmp4a/Icmp$c$a$a;->a()LK5/a;

    move-result-object v3

    instance-of v4, v3, Lcom/marsounjan/icmp4a/d$b$a;

    if-nez v4, :cond_6

    instance-of v4, v3, Lcom/marsounjan/icmp4a/d$b$d;

    if-nez v4, :cond_6

    instance-of v4, v3, Lcom/marsounjan/icmp4a/d$b$e;

    if-nez v4, :cond_6

    instance-of v4, v3, Lcom/marsounjan/icmp4a/d$b$c;

    if-nez v4, :cond_6

    instance-of v4, v3, Lcom/marsounjan/icmp4a/d$b$f;

    if-eqz v4, :cond_3

    goto :goto_1

    :cond_3
    instance-of v4, v3, Lcom/marsounjan/icmp4a/i$b$a;

    if-nez v4, :cond_5

    instance-of v4, v3, Lcom/marsounjan/icmp4a/i$b$c;

    if-nez v4, :cond_5

    instance-of v4, v3, Lcom/marsounjan/icmp4a/i$b$d;

    if-nez v4, :cond_5

    instance-of v3, v3, Lcom/marsounjan/icmp4a/i$b$e;

    if-eqz v3, :cond_4

    goto :goto_0

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    :goto_0
    new-instance v3, Lcd/a$c$a$e;

    invoke-virtual {p2}, Lcom/marsounjan/icmp4a/Icmp$c$a$a;->b()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v3, p2}, Lcd/a$c$a$e;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    :goto_1
    new-instance v3, Lcd/a$c$a$e;

    invoke-virtual {p2}, Lcom/marsounjan/icmp4a/Icmp$c$a$a;->b()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v3, p2}, Lcd/a$c$a$e;-><init>(Ljava/lang/String;)V

    :goto_2
    invoke-virtual {p1, v0, v1, v2, v3}, Lcd/a$d;->a(Linet/ipaddr/g;IILcd/a$c;)Lcd/a$d;

    move-result-object p1

    goto :goto_6

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    instance-of v0, p2, Lcd/d$a$a;

    if-eqz v0, :cond_d

    invoke-virtual {p1}, Lcd/a$d;->f()I

    move-result v0

    add-int/lit8 v3, v0, 0x1

    check-cast p2, Lcd/d$a$a;

    invoke-virtual {p2}, Lcd/d$a$a;->a()Lcom/marsounjan/icmp4a/Icmp$Error;

    move-result-object v0

    instance-of v1, v0, Lcom/marsounjan/icmp4a/Icmp$Error$UnknownHost;

    if-eqz v1, :cond_9

    new-instance v0, Lcd/a$c$a$d;

    invoke-virtual {p2}, Lcd/d$a$a;->a()Lcom/marsounjan/icmp4a/Icmp$Error;

    move-result-object p2

    check-cast p2, Lcom/marsounjan/icmp4a/Icmp$Error$UnknownHost;

    invoke-virtual {p2}, Lcom/marsounjan/icmp4a/Icmp$Error$UnknownHost;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Lcd/a$c$a$d;-><init>(Ljava/lang/String;)V

    :goto_3
    move-object v5, v0

    goto :goto_5

    :cond_9
    instance-of v1, v0, Lcom/marsounjan/icmp4a/Icmp$Error$ProtocolException;

    if-nez v1, :cond_b

    instance-of v0, v0, Lcom/marsounjan/icmp4a/Icmp$Error$SocketException;

    if-eqz v0, :cond_a

    goto :goto_4

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_b
    :goto_4
    new-instance v0, Lcd/a$c$a$b;

    invoke-virtual {p2}, Lcd/d$a$a;->a()Lcom/marsounjan/icmp4a/Icmp$Error;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_c

    const-string p2, "Internal error"

    :cond_c
    invoke-direct {v0, p2}, Lcd/a$c$a$b;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :goto_5
    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcd/a$d;->b(Lcd/a$d;Linet/ipaddr/g;IILcd/a$c;ILjava/lang/Object;)Lcd/a$d;

    move-result-object p1

    :goto_6
    return-object p1

    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcd/a$d;

    check-cast p2, Lcd/d$a;

    invoke-virtual {p0, p1, p2}, Lcd/d$e;->a(Lcd/a$d;Lcd/d$a;)Lcd/a$d;

    move-result-object p1

    return-object p1
.end method
