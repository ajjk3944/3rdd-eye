.class public final LFc/a$b;
.super LEc/t$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFc/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Linet/ipaddr/g;

.field private final b:J

.field private final c:J

.field private final d:Ljava/util/List;

.field private final e:LEc/t$c;

.field private final f:LCc/b;

.field private final g:LYg/m;

.field private final h:LYg/m;


# direct methods
.method public constructor <init>(Linet/ipaddr/g;JJLjava/util/List;)V
    .locals 1

    const-string v0, "ipAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wifiSignals"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LEc/t$b;-><init>()V

    iput-object p1, p0, LFc/a$b;->a:Linet/ipaddr/g;

    iput-wide p2, p0, LFc/a$b;->b:J

    iput-wide p4, p0, LFc/a$b;->c:J

    iput-object p6, p0, LFc/a$b;->d:Ljava/util/List;

    sget-object p1, LEc/t$c;->AP:LEc/t$c;

    iput-object p1, p0, LFc/a$b;->e:LEc/t$c;

    sget-object p1, LCc/b$g$a;->b:LCc/b$g$a;

    iput-object p1, p0, LFc/a$b;->f:LCc/b;

    new-instance p1, LFc/b;

    invoke-direct {p1, p0}, LFc/b;-><init>(LFc/a$b;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LFc/a$b;->g:LYg/m;

    new-instance p1, LFc/c;

    invoke-direct {p1, p0}, LFc/c;-><init>(LFc/a$b;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LFc/a$b;->h:LYg/m;

    return-void
.end method

.method public static synthetic g(LFc/a$b;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, LFc/a$b;->m(LFc/a$b;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(LFc/a$b;)Lcom/ui/wifiman/model/vendor/d;
    .locals 0

    invoke-static {p0}, LFc/a$b;->n(LFc/a$b;)Lcom/ui/wifiman/model/vendor/d;

    move-result-object p0

    return-object p0
.end method

.method private static final m(LFc/a$b;)Ljava/util/List;
    .locals 2

    iget-object p0, p0, LFc/a$b;->d:Ljava/util/List;

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lle/i;

    invoke-virtual {v1}, Lle/i;->r()Lke/c;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lke/c;->b()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v0}, LZg/v;->g0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final n(LFc/a$b;)Lcom/ui/wifiman/model/vendor/d;
    .locals 1

    iget-object p0, p0, LFc/a$b;->d:Ljava/util/List;

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lle/i;

    invoke-virtual {v0}, Lle/i;->u()Lcom/ui/wifiman/model/vendor/d;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method


# virtual methods
.method public a()LEc/t$c;
    .locals 1

    iget-object v0, p0, LFc/a$b;->e:LEc/t$c;

    return-object v0
.end method

.method public c()Linet/ipaddr/g;
    .locals 1

    iget-object v0, p0, LFc/a$b;->a:Linet/ipaddr/g;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LFc/a$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LFc/a$b;

    iget-object v1, p0, LFc/a$b;->a:Linet/ipaddr/g;

    iget-object v3, p1, LFc/a$b;->a:Linet/ipaddr/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, LFc/a$b;->b:J

    iget-wide v5, p1, LFc/a$b;->b:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, LFc/a$b;->c:J

    iget-wide v5, p1, LFc/a$b;->c:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LFc/a$b;->d:Ljava/util/List;

    iget-object p1, p1, LFc/a$b;->d:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, LFc/a$b;->c:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, LEc/t$b;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i()LCc/b;
    .locals 1

    iget-object v0, p0, LFc/a$b;->f:LCc/b;

    return-object v0
.end method

.method public final j()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LFc/a$b;->g:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final k()Lcom/ui/wifiman/model/vendor/d;
    .locals 1

    iget-object v0, p0, LFc/a$b;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/vendor/d;

    return-object v0
.end method

.method public final l()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LFc/a$b;->d:Ljava/util/List;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, LFc/a$b;->a:Linet/ipaddr/g;

    iget-wide v1, p0, LFc/a$b;->b:J

    iget-wide v3, p0, LFc/a$b;->c:J

    iget-object v5, p0, LFc/a$b;->d:Ljava/util/List;

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

    const-string v0, ", wifiSignals="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
