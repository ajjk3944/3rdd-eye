.class public final Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;
.super LEc/t$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/discovery/engine/snmp/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Linet/ipaddr/g;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:J

.field private final i:J

.field private final j:LEc/t$c;


# direct methods
.method public constructor <init>(Linet/ipaddr/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V
    .locals 1

    const-string v0, "ipAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LEc/t$b;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->a:Linet/ipaddr/g;

    iput-object p2, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->f:Ljava/lang/String;

    iput-object p7, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->g:Ljava/lang/String;

    iput-wide p8, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->h:J

    iput-wide p10, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->i:J

    sget-object p1, LEc/t$c;->SNMP:LEc/t$c;

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->j:LEc/t$c;

    return-void
.end method


# virtual methods
.method public a()LEc/t$c;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->j:LEc/t$c;

    return-object v0
.end method

.method public c()Linet/ipaddr/g;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->a:Linet/ipaddr/g;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->a:Linet/ipaddr/g;

    iget-object v3, p1, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->a:Linet/ipaddr/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->e:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->f:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->g:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->g:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-wide v3, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->h:J

    iget-wide v5, p1, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->h:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->i:J

    iget-wide v5, p1, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->i:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->i:J

    return-wide v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, LEc/t$b;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->a:Linet/ipaddr/g;

    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->e:Ljava/lang/String;

    iget-object v5, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->f:Ljava/lang/String;

    iget-object v6, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->g:Ljava/lang/String;

    iget-wide v7, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->h:J

    iget-wide v9, p0, Lcom/ui/wifiman/model/discovery/engine/snmp/a$a;->i:J

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Result(ipAddress="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", description="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", uptime="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", contact="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", location="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", services="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", createdAt="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", validUntil="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
