.class public final LGc/a$a;
.super LEc/t$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LGc/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Linet/ipaddr/g;

.field private final b:Lh9/a;

.field private final c:Lcom/ui/wifiman/model/vendor/d;

.field private final d:J

.field private final e:J

.field private final f:LEc/t$c;


# direct methods
.method public constructor <init>(Linet/ipaddr/g;Lh9/a;Lcom/ui/wifiman/model/vendor/d;JJ)V
    .locals 1

    const-string v0, "ipAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mac"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LEc/t$a;-><init>()V

    iput-object p1, p0, LGc/a$a;->a:Linet/ipaddr/g;

    iput-object p2, p0, LGc/a$a;->b:Lh9/a;

    iput-object p3, p0, LGc/a$a;->c:Lcom/ui/wifiman/model/vendor/d;

    iput-wide p4, p0, LGc/a$a;->d:J

    iput-wide p6, p0, LGc/a$a;->e:J

    sget-object p1, LEc/t$c;->ARP:LEc/t$c;

    iput-object p1, p0, LGc/a$a;->f:LEc/t$c;

    return-void
.end method


# virtual methods
.method public a()LEc/t$c;
    .locals 1

    iget-object v0, p0, LGc/a$a;->f:LEc/t$c;

    return-object v0
.end method

.method public c()Linet/ipaddr/g;
    .locals 1

    iget-object v0, p0, LGc/a$a;->a:Linet/ipaddr/g;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LGc/a$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LGc/a$a;

    iget-object v1, p0, LGc/a$a;->a:Linet/ipaddr/g;

    iget-object v3, p1, LGc/a$a;->a:Linet/ipaddr/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LGc/a$a;->b:Lh9/a;

    iget-object v3, p1, LGc/a$a;->b:Lh9/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LGc/a$a;->c:Lcom/ui/wifiman/model/vendor/d;

    iget-object v3, p1, LGc/a$a;->c:Lcom/ui/wifiman/model/vendor/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, LGc/a$a;->d:J

    iget-wide v5, p1, LGc/a$a;->d:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, LGc/a$a;->e:J

    iget-wide v5, p1, LGc/a$a;->e:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, LGc/a$a;->e:J

    return-wide v0
.end method

.method public g()Lh9/a;
    .locals 1

    iget-object v0, p0, LGc/a$a;->b:Lh9/a;

    return-object v0
.end method

.method public final h()Lcom/ui/wifiman/model/vendor/d;
    .locals 1

    iget-object v0, p0, LGc/a$a;->c:Lcom/ui/wifiman/model/vendor/d;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, LEc/t$a;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, LGc/a$a;->a:Linet/ipaddr/g;

    iget-object v1, p0, LGc/a$a;->b:Lh9/a;

    iget-object v2, p0, LGc/a$a;->c:Lcom/ui/wifiman/model/vendor/d;

    iget-wide v3, p0, LGc/a$a;->d:J

    iget-wide v5, p0, LGc/a$a;->e:J

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Result(ipAddress="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", mac="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", vendor="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", createdAt="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", validUntil="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
