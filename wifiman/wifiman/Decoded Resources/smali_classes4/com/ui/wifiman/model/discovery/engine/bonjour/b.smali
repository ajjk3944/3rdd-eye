.class public final Lcom/ui/wifiman/model/discovery/engine/bonjour/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/discovery/engine/bonjour/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/discovery/engine/bonjour/b$a;
    }
.end annotation


# static fields
.field public static final f:Lcom/ui/wifiman/model/discovery/engine/bonjour/b$a;


# instance fields
.field private final a:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;

.field private final b:Lcom/ui/wifiman/model/discovery/engine/bonjour/c$g;

.field private final c:Lcom/ui/wifiman/model/vendor/d$b;

.field private final d:Lgd/a$b;

.field private final e:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b;->f:Lcom/ui/wifiman/model/discovery/engine/bonjour/b$a;

    return-void
.end method

.method public constructor <init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;Lcom/ui/wifiman/model/discovery/engine/bonjour/c$g;Lcom/ui/wifiman/model/vendor/d$b;Lgd/a$b;)V
    .locals 1

    const-string v0, "bonjour"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serviceCatalog"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vendorManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "servicesLookupManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;

    iput-object p2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b;->b:Lcom/ui/wifiman/model/discovery/engine/bonjour/c$g;

    iput-object p3, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b;->c:Lcom/ui/wifiman/model/vendor/d$b;

    iput-object p4, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b;->d:Lgd/a$b;

    invoke-interface {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;->a()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->U()Lgg/i;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$d;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$d;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/b;)V

    invoke-virtual {p1, p2}, Lgg/i;->p0(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$e;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/b$e;

    invoke-virtual {p1, p2}, Lgg/i;->p1(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string p2, "retryWhen(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/b;->g(Lgg/i;)Lgg/i;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$f;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/b$f;

    invoke-virtual {p1, p2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$g;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$g;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/b;)V

    invoke-virtual {p1, p2}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p1

    new-instance p2, LHc/b;

    invoke-direct {p2, p0}, LHc/b;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/b;)V

    invoke-virtual {p1, p2}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b;->e:Lgg/i;

    return-void
.end method

.method public static synthetic c(Lcom/ui/wifiman/model/discovery/engine/bonjour/b;)V
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/b;->j(Lcom/ui/wifiman/model/discovery/engine/bonjour/b;)V

    return-void
.end method

.method public static final synthetic d(Lcom/ui/wifiman/model/discovery/engine/bonjour/b;Ljava/lang/String;)Lgg/i;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/b;->h(Ljava/lang/String;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lcom/ui/wifiman/model/discovery/engine/bonjour/b;)Lcom/ui/wifiman/model/discovery/engine/bonjour/c$g;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b;->b:Lcom/ui/wifiman/model/discovery/engine/bonjour/c$g;

    return-object p0
.end method

.method public static final synthetic f(Lcom/ui/wifiman/model/discovery/engine/bonjour/b;JLinet/ipaddr/g;Ljava/util/List;Lcom/ui/wifiman/model/vendor/d$a;)Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/ui/wifiman/model/discovery/engine/bonjour/b;->i(JLinet/ipaddr/g;Ljava/util/List;Lcom/ui/wifiman/model/vendor/d$a;)Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;

    move-result-object p0

    return-object p0
.end method

.method private final g(Lgg/i;)Lgg/i;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b;->c:Lcom/ui/wifiman/model/vendor/d$b;

    invoke-interface {v0}, Lcom/ui/wifiman/model/vendor/d$b;->a()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$b;

    invoke-direct {v1, p1, p0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$b;-><init>(Lgg/i;Lcom/ui/wifiman/model/discovery/engine/bonjour/b;)V

    invoke-virtual {v0, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v0, "flatMapPublisher(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final h(Ljava/lang/String;)Lgg/i;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b;->a:Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;

    invoke-interface {v0, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;->b(Ljava/lang/String;)Lgg/i;

    move-result-object p1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b;->d:Lgd/a$b;

    invoke-interface {v0}, Lgd/a$b;->a()Lgg/z;

    move-result-object v0

    invoke-virtual {v0}, Lgg/z;->W()Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$c;

    invoke-direct {v1, p0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/b$c;-><init>(Lcom/ui/wifiman/model/discovery/engine/bonjour/b;)V

    invoke-static {p1, v0, v1}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    const-string v0, "combineLatest(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ll9/f;->e(Lgg/i;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method private final i(JLinet/ipaddr/g;Ljava/util/List;Lcom/ui/wifiman/model/vendor/d$a;)Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;
    .locals 14

    move-object/from16 v0, p4

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;->a()Lcom/ui/wifiman/model/discovery/engine/bonjour/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c;->c()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    if-eqz v2, :cond_2

    sget-object v1, Lh9/a;->b:Lh9/a$b;

    invoke-virtual {v1, v2}, Lh9/a$b;->e(Ljava/lang/String;)Lh9/a;

    move-result-object v1

    move-object v7, v1

    goto :goto_1

    :cond_2
    move-object v7, v3

    :goto_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;

    invoke-virtual {v4}, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;->a()Lcom/ui/wifiman/model/discovery/engine/bonjour/c;

    move-result-object v4

    invoke-virtual {v4}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c;->b()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_4
    move-object v2, v3

    :goto_2
    check-cast v2, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;->c()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    move-object v4, v1

    goto :goto_4

    :cond_6
    :goto_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;->a()Lcom/ui/wifiman/model/discovery/engine/bonjour/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c;->e()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    move-object v4, v2

    goto :goto_4

    :cond_8
    move-object v4, v3

    :goto_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;->a()Lcom/ui/wifiman/model/discovery/engine/bonjour/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c;->d()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_9

    move-object v5, v2

    goto :goto_5

    :cond_a
    move-object v5, v3

    :goto_5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;->a()Lcom/ui/wifiman/model/discovery/engine/bonjour/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c;->f()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_b

    goto :goto_6

    :cond_c
    move-object v2, v3

    :goto_6
    if-eqz v2, :cond_d

    new-instance v1, Lcom/ui/wifiman/model/vendor/d$e;

    const/4 v6, 0x2

    invoke-direct {v1, v2, v3, v6, v3}, Lcom/ui/wifiman/model/vendor/d$e;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_7
    move-object v6, v1

    goto :goto_8

    :cond_d
    if-eqz v7, :cond_e

    move-object/from16 v1, p5

    invoke-interface {v1, v7}, Lcom/ui/wifiman/model/vendor/d$a;->a(Lh9/a;)Lcom/ui/wifiman/model/vendor/d;

    move-result-object v1

    goto :goto_7

    :cond_e
    move-object v6, v3

    :goto_8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;->a()Lcom/ui/wifiman/model/discovery/engine/bonjour/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c;->g()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_f

    move-object v8, v2

    goto :goto_9

    :cond_10
    move-object v8, v3

    :goto_9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;->a()Lcom/ui/wifiman/model/discovery/engine/bonjour/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c;->a()LCc/b;

    move-result-object v1

    if-eqz v1, :cond_11

    move-object v9, v1

    goto :goto_a

    :cond_12
    move-object v9, v3

    :goto_a
    new-instance v13, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;

    const-wide v10, 0x7fffffffffffffffL

    move-object v0, v13

    move-object/from16 v1, p3

    move-wide v2, p1

    move-object/from16 v12, p4

    invoke-direct/range {v0 .. v12}, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;-><init>(Linet/ipaddr/g;JLjava/lang/String;Ljava/lang/String;Lcom/ui/wifiman/model/vendor/d;Lh9/a;Ljava/lang/String;LCc/b;JLjava/util/List;)V

    return-object v13
.end method

.method private static final j(Lcom/ui/wifiman/model/discovery/engine/bonjour/b;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "discovery "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " finished"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "BonjourDiscoveryEngine"

    invoke-static {p0, v0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/b;->e:Lgg/i;

    return-object v0
.end method
