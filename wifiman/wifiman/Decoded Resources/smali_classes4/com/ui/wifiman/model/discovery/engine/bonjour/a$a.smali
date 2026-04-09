.class public final Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;
.super LEc/t$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Linet/ipaddr/g;

.field private final b:J

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Lcom/ui/wifiman/model/vendor/d;

.field private final f:Lh9/a;

.field private final g:Ljava/lang/String;

.field private final h:LCc/b;

.field private final i:J

.field private final j:Ljava/util/List;

.field private final k:LEc/t$c;

.field private final l:LYg/m;


# direct methods
.method public constructor <init>(Linet/ipaddr/g;JLjava/lang/String;Ljava/lang/String;Lcom/ui/wifiman/model/vendor/d;Lh9/a;Ljava/lang/String;LCc/b;JLjava/util/List;)V
    .locals 1

    const-string v0, "ipAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "services"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LEc/t$b;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->a:Linet/ipaddr/g;

    iput-wide p2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->b:J

    iput-object p4, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->d:Ljava/lang/String;

    iput-object p6, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->e:Lcom/ui/wifiman/model/vendor/d;

    iput-object p7, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->f:Lh9/a;

    iput-object p8, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->g:Ljava/lang/String;

    iput-object p9, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->h:LCc/b;

    iput-wide p10, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->i:J

    iput-object p12, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->j:Ljava/util/List;

    sget-object p1, LEc/t$c;->BONJOUR:LEc/t$c;

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->k:LEc/t$c;

    new-instance p1, LHc/a;

    invoke-direct {p1, p0}, LHc/a;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->l:LYg/m;

    return-void
.end method

.method public static synthetic g(Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;)Ljava/util/Map;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->k(Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;)Ljava/util/Map;
    .locals 3

    iget-object p0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->j:Ljava/util/List;

    check-cast p0, Ljava/lang/Iterable;

    const/16 v0, 0xa

    invoke-static {p0, v0}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, LZg/U;->d(I)I

    move-result v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lsh/m;->d(II)I

    move-result v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;->a()Lcom/ui/wifiman/model/discovery/engine/bonjour/c;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v1
.end method


# virtual methods
.method public a()LEc/t$c;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->k:LEc/t$c;

    return-object v0
.end method

.method public c()Linet/ipaddr/g;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->a:Linet/ipaddr/g;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->a:Linet/ipaddr/g;

    iget-object v3, p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->a:Linet/ipaddr/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->b:J

    iget-wide v5, p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->b:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->e:Lcom/ui/wifiman/model/vendor/d;

    iget-object v3, p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->e:Lcom/ui/wifiman/model/vendor/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->f:Lh9/a;

    iget-object v3, p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->f:Lh9/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->g:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->g:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->h:LCc/b;

    iget-object v3, p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->h:LCc/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->i:J

    iget-wide v5, p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->i:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->j:Ljava/util/List;

    iget-object p1, p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->j:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->i:J

    return-wide v0
.end method

.method public final h()LCc/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->h:LCc/b;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, LEc/t$b;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->j:Ljava/util/List;

    return-object v0
.end method

.method public final j()Lcom/ui/wifiman/model/vendor/d;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->e:Lcom/ui/wifiman/model/vendor/d;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->a:Linet/ipaddr/g;

    iget-wide v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->b:J

    iget-object v3, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->c:Ljava/lang/String;

    iget-object v4, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->d:Ljava/lang/String;

    iget-object v5, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->e:Lcom/ui/wifiman/model/vendor/d;

    iget-object v6, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->f:Lh9/a;

    iget-object v7, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->g:Ljava/lang/String;

    iget-object v8, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->h:LCc/b;

    iget-wide v9, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->i:J

    iget-object v11, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->j:Ljava/util/List;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "Result(ipAddress="

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", createdAt="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", model="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", vendor="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", mac="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", version="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", deviceType="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", validUntil="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", services="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
