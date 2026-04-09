.class final LDc/m$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDc/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:LCc/l;

.field private final b:LCc/b;

.field private final c:Ljava/util/EnumMap;


# direct methods
.method public constructor <init>(LCc/l;LCc/b;Ljava/util/EnumMap;)V
    .locals 1

    const-string v0, "results"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LDc/m$a;->a:LCc/l;

    .line 3
    iput-object p2, p0, LDc/m$a;->b:LCc/b;

    .line 4
    iput-object p3, p0, LDc/m$a;->c:Ljava/util/EnumMap;

    return-void
.end method

.method public synthetic constructor <init>(LCc/l;LCc/b;Ljava/util/EnumMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 5
    new-instance p3, Ljava/util/EnumMap;

    .line 6
    const-class p4, LEc/t$c;

    .line 7
    invoke-direct {p3, p4}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 8
    :cond_2
    invoke-direct {p0, p1, p2, p3}, LDc/m$a;-><init>(LCc/l;LCc/b;Ljava/util/EnumMap;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/EnumMap;
    .locals 1

    iget-object v0, p0, LDc/m$a;->c:Ljava/util/EnumMap;

    return-object v0
.end method

.method public final b()Linet/ipaddr/g;
    .locals 5

    iget-object v0, p0, LDc/m$a;->c:Ljava/util/EnumMap;

    sget-object v1, LEc/t$c;->ICMP:LEc/t$c;

    invoke-virtual {v0, v1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEc/t$b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LEc/t$b;->c()Linet/ipaddr/g;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    instance-of v2, v0, Linet/ipaddr/ipv4/b;

    if-eqz v2, :cond_1

    check-cast v0, Linet/ipaddr/ipv4/b;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_2

    goto :goto_3

    :cond_2
    iget-object v0, p0, LDc/m$a;->c:Ljava/util/EnumMap;

    invoke-virtual {v0}, Ljava/util/EnumMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v2, "<get-values>(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, LEc/t$b;

    invoke-virtual {v4}, LEc/t$b;->d()Linet/ipaddr/ipv4/b;

    move-result-object v4

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_4
    move-object v3, v1

    :goto_2
    check-cast v3, LEc/t$b;

    if-eqz v3, :cond_5

    invoke-virtual {v3}, LEc/t$b;->d()Linet/ipaddr/ipv4/b;

    move-result-object v1

    :cond_5
    if-eqz v1, :cond_6

    move-object v0, v1

    goto :goto_3

    :cond_6
    iget-object v0, p0, LDc/m$a;->c:Ljava/util/EnumMap;

    invoke-virtual {v0}, Ljava/util/EnumMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, LZg/v;->p0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEc/t$b;

    invoke-virtual {v0}, LEc/t$b;->c()Linet/ipaddr/g;

    move-result-object v0

    :goto_3
    return-object v0
.end method

.method public final c()Lh9/a;
    .locals 4

    iget-object v0, p0, LDc/m$a;->c:Ljava/util/EnumMap;

    sget-object v1, LEc/t$c;->ARP:LEc/t$c;

    invoke-virtual {v0, v1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEc/t$b;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, LDc/m$a;->c:Ljava/util/EnumMap;

    invoke-virtual {v0}, Ljava/util/EnumMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v2, "<get-values>(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LEc/t$b;

    instance-of v3, v3, LEc/t$a;

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    move-object v0, v2

    check-cast v0, LEc/t$b;

    :cond_2
    instance-of v2, v0, LEc/t$a;

    if-eqz v2, :cond_3

    check-cast v0, LEc/t$a;

    goto :goto_1

    :cond_3
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_4

    invoke-virtual {v0}, LEc/t$a;->g()Lh9/a;

    move-result-object v1

    :cond_4
    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LDc/m$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LDc/m$a;

    iget-object v1, p0, LDc/m$a;->a:LCc/l;

    iget-object v3, p1, LDc/m$a;->a:LCc/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LDc/m$a;->b:LCc/b;

    iget-object v3, p1, LDc/m$a;->b:LCc/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LDc/m$a;->c:Ljava/util/EnumMap;

    iget-object p1, p1, LDc/m$a;->c:Ljava/util/EnumMap;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LDc/m$a;->a:LCc/l;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LCc/l;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LDc/m$a;->b:LCc/b;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LDc/m$a;->c:Ljava/util/EnumMap;

    invoke-virtual {v1}, Ljava/util/EnumMap;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, LDc/m$a;->a:LCc/l;

    iget-object v1, p0, LDc/m$a;->b:LCc/b;

    iget-object v2, p0, LDc/m$a;->c:Ljava/util/EnumMap;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "TempDeviceInfoHolder(deviceInfo="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", deviceType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", results="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
