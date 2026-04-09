.class public final Lcom/marsounjan/icmp4a/d$b$d;
.super Lcom/marsounjan/icmp4a/d$b;
.source "SourceFile"

# interfaces
.implements LK5/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/marsounjan/icmp4a/d$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final a:Ljava/net/Inet4Address;

.field private final b:Lcom/marsounjan/icmp4a/d$c;


# direct methods
.method public constructor <init>(Ljava/net/Inet4Address;)V
    .locals 1

    const-string/jumbo v0, "inetAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/marsounjan/icmp4a/d$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/marsounjan/icmp4a/d$b$d;->a:Ljava/net/Inet4Address;

    sget-object p1, Lcom/marsounjan/icmp4a/d$c;->REDIRECT:Lcom/marsounjan/icmp4a/d$c;

    iput-object p1, p0, Lcom/marsounjan/icmp4a/d$b$d;->b:Lcom/marsounjan/icmp4a/d$c;

    return-void
.end method


# virtual methods
.method public final b()Ljava/net/Inet4Address;
    .locals 1

    iget-object v0, p0, Lcom/marsounjan/icmp4a/d$b$d;->a:Ljava/net/Inet4Address;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/marsounjan/icmp4a/d$b$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/marsounjan/icmp4a/d$b$d;

    iget-object v1, p0, Lcom/marsounjan/icmp4a/d$b$d;->a:Ljava/net/Inet4Address;

    iget-object p1, p1, Lcom/marsounjan/icmp4a/d$b$d;->a:Ljava/net/Inet4Address;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/marsounjan/icmp4a/d$b$d;->a:Ljava/net/Inet4Address;

    invoke-virtual {v0}, Ljava/net/Inet4Address;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Redirect(inetAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/marsounjan/icmp4a/d$b$d;->a:Ljava/net/Inet4Address;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
