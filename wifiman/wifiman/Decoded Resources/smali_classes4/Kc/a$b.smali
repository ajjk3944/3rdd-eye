.class public final LKc/a$b;
.super LEc/t$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LKc/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Linet/ipaddr/g;

.field private final b:J

.field private final c:LEc/t$c;

.field private final d:J


# direct methods
.method public constructor <init>(Linet/ipaddr/g;J)V
    .locals 1

    const-string v0, "ipAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LEc/t$b;-><init>()V

    iput-object p1, p0, LKc/a$b;->a:Linet/ipaddr/g;

    iput-wide p2, p0, LKc/a$b;->b:J

    sget-object p1, LEc/t$c;->ICMP:LEc/t$c;

    iput-object p1, p0, LKc/a$b;->c:LEc/t$c;

    const-wide p1, 0x7fffffffffffffffL

    iput-wide p1, p0, LKc/a$b;->d:J

    return-void
.end method


# virtual methods
.method public a()LEc/t$c;
    .locals 1

    iget-object v0, p0, LKc/a$b;->c:LEc/t$c;

    return-object v0
.end method

.method public c()Linet/ipaddr/g;
    .locals 1

    iget-object v0, p0, LKc/a$b;->a:Linet/ipaddr/g;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LKc/a$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LKc/a$b;

    iget-object v1, p0, LKc/a$b;->a:Linet/ipaddr/g;

    iget-object v3, p1, LKc/a$b;->a:Linet/ipaddr/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, LKc/a$b;->b:J

    iget-wide v5, p1, LKc/a$b;->b:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, LKc/a$b;->d:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, LEc/t$b;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, LKc/a$b;->a:Linet/ipaddr/g;

    iget-wide v1, p0, LKc/a$b;->b:J

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Result(ipAddress="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", createdAt="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
