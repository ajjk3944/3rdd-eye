.class public final LLc/a$a;
.super LEc/t$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLc/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Linet/ipaddr/g;

.field private final b:Lh9/a;

.field private final c:Ljava/util/List;

.field private final d:J

.field private final e:Lcom/ui/wifiman/model/vendor/d;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/Long;

.field private final h:Ljava/lang/String;

.field private final i:Ljava/lang/String;

.field private final j:Ljava/lang/String;

.field private final k:Ljava/lang/String;

.field private final l:Ljava/lang/Boolean;

.field private final m:LCc/b;

.field private final n:J

.field private final o:LEc/t$c;

.field private final p:Ljava/lang/String;


# direct methods
.method public constructor <init>(Linet/ipaddr/g;Lh9/a;Ljava/util/List;JLcom/ui/wifiman/model/vendor/d;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;LCc/b;J)V
    .locals 8

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p6

    move-object/from16 v5, p10

    move-object/from16 v6, p12

    const-string v7, "ipAddress"

    invoke-static {p1, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "mac"

    invoke-static {p2, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "addresses"

    invoke-static {p3, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "vendor"

    invoke-static {p6, v7}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LEc/t$a;-><init>()V

    iput-object v1, v0, LLc/a$a;->a:Linet/ipaddr/g;

    iput-object v2, v0, LLc/a$a;->b:Lh9/a;

    iput-object v3, v0, LLc/a$a;->c:Ljava/util/List;

    move-wide v1, p4

    iput-wide v1, v0, LLc/a$a;->d:J

    iput-object v4, v0, LLc/a$a;->e:Lcom/ui/wifiman/model/vendor/d;

    move-object v1, p7

    iput-object v1, v0, LLc/a$a;->f:Ljava/lang/String;

    move-object/from16 v1, p8

    iput-object v1, v0, LLc/a$a;->g:Ljava/lang/Long;

    move-object/from16 v1, p9

    iput-object v1, v0, LLc/a$a;->h:Ljava/lang/String;

    iput-object v5, v0, LLc/a$a;->i:Ljava/lang/String;

    move-object/from16 v1, p11

    iput-object v1, v0, LLc/a$a;->j:Ljava/lang/String;

    iput-object v6, v0, LLc/a$a;->k:Ljava/lang/String;

    move-object/from16 v1, p13

    iput-object v1, v0, LLc/a$a;->l:Ljava/lang/Boolean;

    move-object/from16 v1, p14

    iput-object v1, v0, LLc/a$a;->m:LCc/b;

    move-wide/from16 v1, p15

    iput-wide v1, v0, LLc/a$a;->n:J

    sget-object v1, LEc/t$c;->MIKROTIK:LEc/t$c;

    iput-object v1, v0, LLc/a$a;->o:LEc/t$c;

    if-eqz v5, :cond_0

    if-eqz v6, :cond_0

    invoke-virtual {p6}, Lcom/ui/wifiman/model/vendor/d;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v6

    :goto_0
    iput-object v1, v0, LLc/a$a;->p:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()LEc/t$c;
    .locals 1

    iget-object v0, p0, LLc/a$a;->o:LEc/t$c;

    return-object v0
.end method

.method public c()Linet/ipaddr/g;
    .locals 1

    iget-object v0, p0, LLc/a$a;->a:Linet/ipaddr/g;

    return-object v0
.end method

.method public d()Linet/ipaddr/ipv4/b;
    .locals 5

    iget-object v0, p0, LLc/a$a;->c:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Linet/ipaddr/g;

    instance-of v4, v2, Linet/ipaddr/ipv4/b;

    if-eqz v4, :cond_1

    move-object v3, v2

    check-cast v3, Linet/ipaddr/ipv4/b;

    :cond_1
    if-eqz v3, :cond_0

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Linet/ipaddr/ipv4/b;

    invoke-virtual {v4}, Linet/ipaddr/ipv4/b;->g1()Z

    move-result v4

    if-nez v4, :cond_3

    move-object v3, v2

    :cond_4
    check-cast v3, Linet/ipaddr/ipv4/b;

    if-nez v3, :cond_5

    invoke-static {v1}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Linet/ipaddr/ipv4/b;

    :cond_5
    return-object v3
.end method

.method public e()Linet/ipaddr/ipv6/b;
    .locals 5

    iget-object v0, p0, LLc/a$a;->c:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Linet/ipaddr/g;

    instance-of v4, v2, Linet/ipaddr/ipv6/b;

    if-eqz v4, :cond_1

    move-object v3, v2

    check-cast v3, Linet/ipaddr/ipv6/b;

    :cond_1
    if-eqz v3, :cond_0

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Linet/ipaddr/ipv6/b;

    invoke-virtual {v4}, Linet/ipaddr/ipv6/b;->g1()Z

    move-result v4

    if-nez v4, :cond_3

    move-object v3, v2

    :cond_4
    check-cast v3, Linet/ipaddr/ipv6/b;

    if-nez v3, :cond_5

    invoke-static {v1}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Linet/ipaddr/ipv6/b;

    :cond_5
    return-object v3
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, LLc/a$a;->n:J

    return-wide v0
.end method

.method public g()Lh9/a;
    .locals 1

    iget-object v0, p0, LLc/a$a;->b:Lh9/a;

    return-object v0
.end method

.method public final h()LCc/b;
    .locals 1

    iget-object v0, p0, LLc/a$a;->m:LCc/b;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, LEc/t$a;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LLc/a$a;->h:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, LLc/a$a;->l:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LLc/a$a;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LLc/a$a;->p:Ljava/lang/String;

    return-object v0
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LLc/a$a;->j:Ljava/lang/String;

    return-object v0
.end method

.method public final n()Ljava/lang/Long;
    .locals 4

    iget-object v0, p0, LLc/a$a;->g:Ljava/lang/Long;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    const/16 v2, 0x3e8

    int-to-long v2, v2

    mul-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final o()Lcom/ui/wifiman/model/vendor/d;
    .locals 1

    iget-object v0, p0, LLc/a$a;->e:Lcom/ui/wifiman/model/vendor/d;

    return-object v0
.end method
