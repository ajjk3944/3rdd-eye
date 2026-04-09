.class public final Lcom/marsounjan/icmp4a/h;
.super Lcom/marsounjan/icmp4a/f;
.source "SourceFile"


# instance fields
.field private final e:I

.field private final f:[B

.field private final g:Lcom/marsounjan/icmp4a/g;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    invoke-direct {p0}, Lcom/marsounjan/icmp4a/f;-><init>()V

    iput p1, p0, Lcom/marsounjan/icmp4a/h;->e:I

    invoke-virtual {p0}, Lcom/marsounjan/icmp4a/h;->d()I

    move-result p1

    const v0, 0xffe3

    if-gt p1, v0, :cond_0

    const/16 p1, 0x240

    invoke-virtual {p0}, Lcom/marsounjan/icmp4a/h;->d()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 p1, p1, 0x8

    new-array p1, p1, [B

    iput-object p1, p0, Lcom/marsounjan/icmp4a/h;->f:[B

    new-instance p1, Lcom/marsounjan/icmp4a/g;

    invoke-direct {p1}, Lcom/marsounjan/icmp4a/g;-><init>()V

    iput-object p1, p0, Lcom/marsounjan/icmp4a/h;->g:Lcom/marsounjan/icmp4a/g;

    return-void

    :cond_0
    new-instance p1, Lcom/marsounjan/icmp4a/Icmp$Error$ProtocolException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Packet size \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/marsounjan/icmp4a/h;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\' exceeded maximal IPv4 packet size 65507"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2, v1, v2}, Lcom/marsounjan/icmp4a/Icmp$Error$ProtocolException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
.end method


# virtual methods
.method public c()[B
    .locals 1

    iget-object v0, p0, Lcom/marsounjan/icmp4a/h;->f:[B

    return-object v0
.end method

.method protected d()I
    .locals 1

    iget v0, p0, Lcom/marsounjan/icmp4a/h;->e:I

    return v0
.end method

.method public bridge synthetic e(SS)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/marsounjan/icmp4a/h;->l(SS)Lcom/marsounjan/icmp4a/d$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic g()Lcom/marsounjan/icmp4a/IcmpMessageSerializer;
    .locals 1

    invoke-virtual {p0}, Lcom/marsounjan/icmp4a/h;->m()Lcom/marsounjan/icmp4a/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic h(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lcom/marsounjan/icmp4a/d$b;

    invoke-virtual {p0, p1}, Lcom/marsounjan/icmp4a/h;->n(Lcom/marsounjan/icmp4a/d$b;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;IJ)Lcom/marsounjan/icmp4a/Icmp$c;
    .locals 0

    check-cast p1, Lcom/marsounjan/icmp4a/d$b;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/marsounjan/icmp4a/h;->o(Lcom/marsounjan/icmp4a/d$b;IJ)Lcom/marsounjan/icmp4a/Icmp$c;

    move-result-object p1

    return-object p1
.end method

.method protected l(SS)Lcom/marsounjan/icmp4a/d$a;
    .locals 2

    new-instance v0, Lcom/marsounjan/icmp4a/d$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/marsounjan/icmp4a/d$a$a;-><init>(SSLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method protected m()Lcom/marsounjan/icmp4a/g;
    .locals 1

    iget-object v0, p0, Lcom/marsounjan/icmp4a/h;->g:Lcom/marsounjan/icmp4a/g;

    return-object v0
.end method

.method protected n(Lcom/marsounjan/icmp4a/d$b;)Z
    .locals 3

    const-string/jumbo v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/marsounjan/icmp4a/d$b$b;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    check-cast p1, Lcom/marsounjan/icmp4a/d$b$b;

    invoke-virtual {p1}, Lcom/marsounjan/icmp4a/d$b$b;->b()S

    move-result p1

    invoke-virtual {p0}, Lcom/marsounjan/icmp4a/b;->f()S

    move-result v0

    if-ne p1, v0, :cond_5

    :goto_0
    move v1, v2

    goto :goto_4

    :cond_0
    instance-of v0, p1, Lcom/marsounjan/icmp4a/d$b$a;

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lcom/marsounjan/icmp4a/d$b$e;

    :goto_1
    if-eqz v0, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    instance-of v0, p1, Lcom/marsounjan/icmp4a/d$b$f;

    :goto_2
    if-eqz v0, :cond_3

    move v0, v2

    goto :goto_3

    :cond_3
    instance-of v0, p1, Lcom/marsounjan/icmp4a/d$b$c;

    :goto_3
    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    instance-of p1, p1, Lcom/marsounjan/icmp4a/d$b$d;

    if-eqz p1, :cond_6

    :cond_5
    :goto_4
    return v1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method protected o(Lcom/marsounjan/icmp4a/d$b;IJ)Lcom/marsounjan/icmp4a/Icmp$c;
    .locals 2

    const-string/jumbo v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/marsounjan/icmp4a/d$b$b;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/marsounjan/icmp4a/Icmp$c$b;

    check-cast p1, Lcom/marsounjan/icmp4a/d$b$b;

    invoke-virtual {p1}, Lcom/marsounjan/icmp4a/d$b$b;->b()S

    move-result p1

    const v1, 0xffff

    and-int/2addr p1, v1

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/marsounjan/icmp4a/Icmp$c$b;-><init>(IIJ)V

    goto/16 :goto_0

    :cond_0
    instance-of p2, p1, Lcom/marsounjan/icmp4a/d$b$a;

    if-eqz p2, :cond_3

    new-instance v0, Lcom/marsounjan/icmp4a/Icmp$c$a$a;

    move-object p2, p1

    check-cast p2, Lcom/marsounjan/icmp4a/d$b$a;

    invoke-virtual {p2}, Lcom/marsounjan/icmp4a/d$b$a;->b()Lcom/marsounjan/icmp4a/d$b$a$a;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/marsounjan/icmp4a/d$b$a$a;->getMessage()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_2

    :cond_1
    const-string p2, "Destination Unreachable"

    :cond_2
    check-cast p1, LK5/a;

    invoke-direct {v0, p2, p1}, Lcom/marsounjan/icmp4a/Icmp$c$a$a;-><init>(Ljava/lang/String;LK5/a;)V

    goto :goto_0

    :cond_3
    instance-of p2, p1, Lcom/marsounjan/icmp4a/d$b$e;

    if-eqz p2, :cond_4

    new-instance v0, Lcom/marsounjan/icmp4a/Icmp$c$a$a;

    const-string/jumbo p2, "Source Quench"

    check-cast p1, LK5/a;

    invoke-direct {v0, p2, p1}, Lcom/marsounjan/icmp4a/Icmp$c$a$a;-><init>(Ljava/lang/String;LK5/a;)V

    goto :goto_0

    :cond_4
    instance-of p2, p1, Lcom/marsounjan/icmp4a/d$b$f;

    if-eqz p2, :cond_5

    new-instance v0, Lcom/marsounjan/icmp4a/Icmp$c$a$a;

    const-string/jumbo p2, "Transport Time Exceeded"

    check-cast p1, LK5/a;

    invoke-direct {v0, p2, p1}, Lcom/marsounjan/icmp4a/Icmp$c$a$a;-><init>(Ljava/lang/String;LK5/a;)V

    goto :goto_0

    :cond_5
    instance-of p2, p1, Lcom/marsounjan/icmp4a/d$b$c;

    if-eqz p2, :cond_6

    new-instance v0, Lcom/marsounjan/icmp4a/Icmp$c$a$a;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo p3, "Parameter Problem at index "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object p3, p1

    check-cast p3, Lcom/marsounjan/icmp4a/d$b$c;

    invoke-virtual {p3}, Lcom/marsounjan/icmp4a/d$b$c;->b()B

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    check-cast p1, LK5/a;

    invoke-direct {v0, p2, p1}, Lcom/marsounjan/icmp4a/Icmp$c$a$a;-><init>(Ljava/lang/String;LK5/a;)V

    goto :goto_0

    :cond_6
    instance-of p2, p1, Lcom/marsounjan/icmp4a/d$b$d;

    if-eqz p2, :cond_7

    new-instance v0, Lcom/marsounjan/icmp4a/Icmp$c$a$a;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo p3, "Redirected to "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object p3, p1

    check-cast p3, Lcom/marsounjan/icmp4a/d$b$d;

    invoke-virtual {p3}, Lcom/marsounjan/icmp4a/d$b$d;->b()Ljava/net/Inet4Address;

    move-result-object p3

    invoke-virtual {p3}, Ljava/net/Inet4Address;->getHostAddress()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    check-cast p1, LK5/a;

    invoke-direct {v0, p2, p1}, Lcom/marsounjan/icmp4a/Icmp$c$a$a;-><init>(Ljava/lang/String;LK5/a;)V

    :goto_0
    return-object v0

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
