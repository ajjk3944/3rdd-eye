.class public final LIc/a$a;
.super LEc/t$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIc/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Linet/ipaddr/g;

.field private final b:J

.field private final c:J

.field private final d:Ljava/lang/Integer;

.field private final e:LEc/t$c;

.field private final f:LCc/b$g$b;


# direct methods
.method public constructor <init>(Linet/ipaddr/g;JJLjava/lang/Integer;)V
    .locals 1

    const-string v0, "ipAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LEc/t$b;-><init>()V

    iput-object p1, p0, LIc/a$a;->a:Linet/ipaddr/g;

    iput-wide p2, p0, LIc/a$a;->b:J

    iput-wide p4, p0, LIc/a$a;->c:J

    iput-object p6, p0, LIc/a$a;->d:Ljava/lang/Integer;

    sget-object p1, LEc/t$c;->GATEWAY:LEc/t$c;

    iput-object p1, p0, LIc/a$a;->e:LEc/t$c;

    sget-object p1, LCc/b$g$b;->b:LCc/b$g$b;

    iput-object p1, p0, LIc/a$a;->f:LCc/b$g$b;

    return-void
.end method


# virtual methods
.method public a()LEc/t$c;
    .locals 1

    iget-object v0, p0, LIc/a$a;->e:LEc/t$c;

    return-object v0
.end method

.method public c()Linet/ipaddr/g;
    .locals 1

    iget-object v0, p0, LIc/a$a;->a:Linet/ipaddr/g;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LIc/a$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LIc/a$a;

    iget-object v1, p0, LIc/a$a;->a:Linet/ipaddr/g;

    iget-object v3, p1, LIc/a$a;->a:Linet/ipaddr/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, LIc/a$a;->b:J

    iget-wide v5, p1, LIc/a$a;->b:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, LIc/a$a;->c:J

    iget-wide v5, p1, LIc/a$a;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LIc/a$a;->d:Ljava/lang/Integer;

    iget-object p1, p1, LIc/a$a;->d:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, LIc/a$a;->c:J

    return-wide v0
.end method

.method public final g()LCc/b$g$b;
    .locals 1

    iget-object v0, p0, LIc/a$a;->f:LCc/b$g$b;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, LEc/t$b;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, LIc/a$a;->a:Linet/ipaddr/g;

    iget-wide v1, p0, LIc/a$a;->b:J

    iget-wide v3, p0, LIc/a$a;->c:J

    iget-object v5, p0, LIc/a$a;->d:Ljava/lang/Integer;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Result(ipAddress="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", createdAt="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", validUntil="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", netmask="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
