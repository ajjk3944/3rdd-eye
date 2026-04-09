.class public final LSc/b$a;
.super LEc/t$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSc/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/Set;

.field private final b:Ljava/util/Set;

.field private final c:Lcom/ui/wifiman/model/vendor/d;

.field private final d:Lh9/a;

.field private final e:Lxa/a$d;

.field private final f:LCc/b;

.field private final g:Ljava/util/Set;

.field private final h:Ljava/util/Set;

.field private final i:Ljava/util/Map;

.field private final j:Ljava/lang/Long;

.field private final k:LS8/h;

.field private final l:Z

.field private final m:Ljava/lang/String;

.field private final n:J

.field private final o:J

.field private final p:LEc/t$c;

.field private final q:Linet/ipaddr/ipv4/b;

.field private final r:Linet/ipaddr/ipv6/b;


# direct methods
.method public constructor <init>(Ljava/util/Set;Ljava/util/Set;Lcom/ui/wifiman/model/vendor/d;Lh9/a;Lxa/a$d;LCc/b;Ljava/util/Set;Ljava/util/Set;Ljava/util/Map;Ljava/lang/Long;LS8/h;ZLjava/lang/String;JJ)V
    .locals 9

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    const-string v8, "deviceNames"

    invoke-static {p1, v8}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "addresses"

    invoke-static {p2, v8}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "vendor"

    invoke-static {p3, v8}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "mac"

    invoke-static {p4, v8}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "ssid"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "firmwareInfo"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "interfaces"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LEc/t$a;-><init>()V

    iput-object v1, v0, LSc/b$a;->a:Ljava/util/Set;

    iput-object v2, v0, LSc/b$a;->b:Ljava/util/Set;

    iput-object v3, v0, LSc/b$a;->c:Lcom/ui/wifiman/model/vendor/d;

    iput-object v4, v0, LSc/b$a;->d:Lh9/a;

    move-object v1, p5

    iput-object v1, v0, LSc/b$a;->e:Lxa/a$d;

    move-object v1, p6

    iput-object v1, v0, LSc/b$a;->f:LCc/b;

    iput-object v5, v0, LSc/b$a;->g:Ljava/util/Set;

    iput-object v6, v0, LSc/b$a;->h:Ljava/util/Set;

    iput-object v7, v0, LSc/b$a;->i:Ljava/util/Map;

    move-object/from16 v1, p10

    iput-object v1, v0, LSc/b$a;->j:Ljava/lang/Long;

    move-object/from16 v1, p11

    iput-object v1, v0, LSc/b$a;->k:LS8/h;

    move/from16 v1, p12

    iput-boolean v1, v0, LSc/b$a;->l:Z

    move-object/from16 v1, p13

    iput-object v1, v0, LSc/b$a;->m:Ljava/lang/String;

    move-wide/from16 v3, p14

    iput-wide v3, v0, LSc/b$a;->n:J

    move-wide/from16 v3, p16

    iput-wide v3, v0, LSc/b$a;->o:J

    sget-object v1, LEc/t$c;->UBNT:LEc/t$c;

    iput-object v1, v0, LSc/b$a;->p:LEc/t$c;

    move-object v1, v2

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Linet/ipaddr/g;

    instance-of v5, v3, Linet/ipaddr/ipv4/b;

    if-eqz v5, :cond_1

    move-object v4, v3

    check-cast v4, Linet/ipaddr/ipv4/b;

    :cond_1
    if-eqz v4, :cond_0

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Linet/ipaddr/ipv4/b;

    invoke-virtual {v5}, Linet/ipaddr/ipv4/b;->g1()Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_1

    :cond_4
    move-object v3, v4

    :goto_1
    check-cast v3, Linet/ipaddr/ipv4/b;

    if-nez v3, :cond_5

    invoke-static {v2}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Linet/ipaddr/ipv4/b;

    :cond_5
    iput-object v3, v0, LSc/b$a;->q:Linet/ipaddr/ipv4/b;

    iget-object v1, v0, LSc/b$a;->b:Ljava/util/Set;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Linet/ipaddr/g;

    instance-of v5, v3, Linet/ipaddr/ipv6/b;

    if-eqz v5, :cond_7

    check-cast v3, Linet/ipaddr/ipv6/b;

    goto :goto_3

    :cond_7
    move-object v3, v4

    :goto_3
    if-eqz v3, :cond_6

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Linet/ipaddr/ipv6/b;

    invoke-virtual {v5}, Linet/ipaddr/ipv6/b;->g1()Z

    move-result v5

    if-nez v5, :cond_9

    move-object v4, v3

    :cond_a
    check-cast v4, Linet/ipaddr/ipv6/b;

    if-nez v4, :cond_b

    invoke-static {v2}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Linet/ipaddr/ipv6/b;

    :cond_b
    iput-object v4, v0, LSc/b$a;->r:Linet/ipaddr/ipv6/b;

    return-void
.end method

.method public static synthetic h(LSc/b$a;Ly7/n;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0, p1}, LSc/b$a;->i(LSc/b$a;Ly7/n;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method private static final i(LSc/b$a;Ly7/n;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LSc/b$a;->l(Ly7/n;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final l(Ly7/n;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p1}, Ly7/n;->e()Lcom/ui/common/semver/SemVer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/common/semver/SemVer;->d()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1}, Ly7/n;->e()Lcom/ui/common/semver/SemVer;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/common/semver/SemVer;->g()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Ly7/n;->e()Lcom/ui/common/semver/SemVer;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/common/semver/SemVer;->h()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v0, v1, p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x3

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "%d.%d.%d"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "format(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public a()LEc/t$c;
    .locals 1

    iget-object v0, p0, LSc/b$a;->p:LEc/t$c;

    return-object v0
.end method

.method public c()Linet/ipaddr/g;
    .locals 2

    invoke-virtual {p0}, LSc/b$a;->d()Linet/ipaddr/ipv4/b;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LSc/b$a;->e()Linet/ipaddr/ipv6/b;

    move-result-object v0

    if-eqz v0, :cond_1

    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "There must be at least since IP for the result"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d()Linet/ipaddr/ipv4/b;
    .locals 1

    iget-object v0, p0, LSc/b$a;->q:Linet/ipaddr/ipv4/b;

    return-object v0
.end method

.method public e()Linet/ipaddr/ipv6/b;
    .locals 1

    iget-object v0, p0, LSc/b$a;->r:Linet/ipaddr/ipv6/b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LSc/b$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LSc/b$a;

    iget-object v1, p0, LSc/b$a;->a:Ljava/util/Set;

    iget-object v3, p1, LSc/b$a;->a:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LSc/b$a;->b:Ljava/util/Set;

    iget-object v3, p1, LSc/b$a;->b:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LSc/b$a;->c:Lcom/ui/wifiman/model/vendor/d;

    iget-object v3, p1, LSc/b$a;->c:Lcom/ui/wifiman/model/vendor/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LSc/b$a;->d:Lh9/a;

    iget-object v3, p1, LSc/b$a;->d:Lh9/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, LSc/b$a;->e:Lxa/a$d;

    iget-object v3, p1, LSc/b$a;->e:Lxa/a$d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, LSc/b$a;->f:LCc/b;

    iget-object v3, p1, LSc/b$a;->f:LCc/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, LSc/b$a;->g:Ljava/util/Set;

    iget-object v3, p1, LSc/b$a;->g:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, LSc/b$a;->h:Ljava/util/Set;

    iget-object v3, p1, LSc/b$a;->h:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, LSc/b$a;->i:Ljava/util/Map;

    iget-object v3, p1, LSc/b$a;->i:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, LSc/b$a;->j:Ljava/lang/Long;

    iget-object v3, p1, LSc/b$a;->j:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, LSc/b$a;->k:LS8/h;

    iget-object v3, p1, LSc/b$a;->k:LS8/h;

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, LSc/b$a;->l:Z

    iget-boolean v3, p1, LSc/b$a;->l:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, LSc/b$a;->m:Ljava/lang/String;

    iget-object v3, p1, LSc/b$a;->m:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-wide v3, p0, LSc/b$a;->n:J

    iget-wide v5, p1, LSc/b$a;->n:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_f

    return v2

    :cond_f
    iget-wide v3, p0, LSc/b$a;->o:J

    iget-wide v5, p1, LSc/b$a;->o:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_10

    return v2

    :cond_10
    return v0
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, LSc/b$a;->o:J

    return-wide v0
.end method

.method public g()Lh9/a;
    .locals 1

    iget-object v0, p0, LSc/b$a;->d:Lh9/a;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, LEc/t$a;->hashCode()I

    move-result v0

    return v0
.end method

.method public final j()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LSc/b$a;->a:Ljava/util/Set;

    return-object v0
.end method

.method public final k()LCc/b;
    .locals 1

    iget-object v0, p0, LSc/b$a;->f:LCc/b;

    return-object v0
.end method

.method public final m()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, LSc/b$a;->h:Ljava/util/Set;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LSc/b$a;->h:Ljava/util/Set;

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v7, LSc/a;

    invoke-direct {v7, p0}, LSc/a;-><init>(LSc/b$a;)V

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const-string v2, "\n"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final n()Z
    .locals 1

    iget-boolean v0, p0, LSc/b$a;->l:Z

    return v0
.end method

.method public final o()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LSc/b$a;->i:Ljava/util/Map;

    return-object v0
.end method

.method public final p()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LSc/b$a;->e:Lxa/a$d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lua/a;->getName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, LSc/b$a;->m:Ljava/lang/String;

    :cond_1
    return-object v0
.end method

.method public final q()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LSc/b$a;->g:Ljava/util/Set;

    return-object v0
.end method

.method public final r()Lxa/a$d;
    .locals 1

    iget-object v0, p0, LSc/b$a;->e:Lxa/a$d;

    return-object v0
.end method

.method public final s()Ljava/lang/Long;
    .locals 4

    iget-object v0, p0, LSc/b$a;->j:Ljava/lang/Long;

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

.method public final t()Lcom/ui/wifiman/model/vendor/d;
    .locals 1

    iget-object v0, p0, LSc/b$a;->c:Lcom/ui/wifiman/model/vendor/d;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, LSc/b$a;->a:Ljava/util/Set;

    iget-object v2, v0, LSc/b$a;->b:Ljava/util/Set;

    iget-object v3, v0, LSc/b$a;->c:Lcom/ui/wifiman/model/vendor/d;

    iget-object v4, v0, LSc/b$a;->d:Lh9/a;

    iget-object v5, v0, LSc/b$a;->e:Lxa/a$d;

    iget-object v6, v0, LSc/b$a;->f:LCc/b;

    iget-object v7, v0, LSc/b$a;->g:Ljava/util/Set;

    iget-object v8, v0, LSc/b$a;->h:Ljava/util/Set;

    iget-object v9, v0, LSc/b$a;->i:Ljava/util/Map;

    iget-object v10, v0, LSc/b$a;->j:Ljava/lang/Long;

    iget-object v11, v0, LSc/b$a;->k:LS8/h;

    iget-boolean v12, v0, LSc/b$a;->l:Z

    iget-object v13, v0, LSc/b$a;->m:Ljava/lang/String;

    iget-wide v14, v0, LSc/b$a;->n:J

    move-wide/from16 v16, v14

    iget-wide v14, v0, LSc/b$a;->o:J

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-wide/from16 v18, v14

    const-string v14, "Result(deviceNames="

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", addresses="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", vendor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mac="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ubntProduct="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", deviceType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ssid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", firmwareInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", interfaces="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", uptimeSeconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", wirelessMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", inFactoryDefaults="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", _productName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", createdAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v16

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", validUntil="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v18

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()LS8/h;
    .locals 1

    iget-object v0, p0, LSc/b$a;->k:LS8/h;

    return-object v0
.end method
