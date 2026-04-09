.class public final Lje/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lje/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lje/p$a;
    }
.end annotation


# static fields
.field public static final c:Lje/p$a;


# instance fields
.field private final a:Lpe/a;

.field private final b:LT7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lje/p$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lje/p$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lje/p;->c:Lje/p$a;

    return-void
.end method

.method public constructor <init>(Lpe/a;LT7/a;)V
    .locals 1

    const-string v0, "ssidParser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkVersion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lje/p;->a:Lpe/a;

    iput-object p2, p0, Lje/p;->b:LT7/a;

    return-void
.end method

.method public static synthetic c(Lje/p;Lje/q;Landroid/net/wifi/MloLink;)Lje/q;
    .locals 0

    invoke-static {p0, p1, p2}, Lje/p;->q(Lje/p;Lje/q;Landroid/net/wifi/MloLink;)Lje/q;

    move-result-object p0

    return-object p0
.end method

.method private final d(Landroid/net/wifi/MloLink;)LS8/c;
    .locals 1

    invoke-static {p1}, Lje/g;->a(Landroid/net/wifi/MloLink;)I

    move-result p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/16 v0, 0x8

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    sget-object p1, LS8/c;->GHZ_6:LS8/c;

    goto :goto_0

    :cond_1
    sget-object p1, LS8/c;->GHZ_5:LS8/c;

    goto :goto_0

    :cond_2
    sget-object p1, LS8/c;->GHZ_2_4:LS8/c;

    :goto_0
    return-object p1
.end method

.method private final e(Landroid/net/wifi/WifiInfo;)LS8/c;
    .locals 1

    invoke-direct {p0, p1}, Lje/p;->i(Landroid/net/wifi/WifiInfo;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->a:Lcom/ubnt/usurvey/wifi/WifiChannelUtils;

    invoke-virtual {v0, p1}, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->a(I)LS8/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private final f(Landroid/net/wifi/WifiInfo;)Lh9/a;
    .locals 2

    invoke-virtual {p1}, Landroid/net/wifi/WifiInfo;->getBSSID()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    invoke-static {p1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "00:00:00:00:00:00"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    const-string v1, "02:00:00:00:00:00"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    :cond_2
    sget-object v0, Lh9/a;->b:Lh9/a$b;

    invoke-virtual {v0, p1}, Lh9/a$b;->e(Ljava/lang/String;)Lh9/a;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_0
    return-object v0
.end method

.method private final g(Landroid/net/wifi/MloLink;)I
    .locals 0

    invoke-static {p1}, Lje/h;->a(Landroid/net/wifi/MloLink;)I

    move-result p1

    return p1
.end method

.method private final h(Landroid/net/wifi/WifiInfo;)Ljava/lang/Integer;
    .locals 1

    invoke-direct {p0, p1}, Lje/p;->i(Landroid/net/wifi/WifiInfo;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->a:Lcom/ubnt/usurvey/wifi/WifiChannelUtils;

    invoke-virtual {v0, p1}, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->c(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private final i(Landroid/net/wifi/WifiInfo;)Ljava/lang/Integer;
    .locals 3

    invoke-virtual {p1}, Landroid/net/wifi/WifiInfo;->getFrequency()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    return-object v2

    :cond_0
    sget-object v1, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->a:Lcom/ubnt/usurvey/wifi/WifiChannelUtils;

    invoke-virtual {p1}, Landroid/net/wifi/WifiInfo;->getFrequency()I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->a(I)LS8/c;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v2

    :cond_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method private final j(Landroid/net/wifi/WifiInfo;)Lje/q;
    .locals 9

    invoke-direct {p0, p1}, Lje/p;->e(Landroid/net/wifi/WifiInfo;)LS8/c;

    move-result-object v1

    const/4 v0, 0x0

    if-nez v1, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed get band for Wifi Info which seems to be connected. "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {v2, v0, v0, v3, v0}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_0
    if-eqz v1, :cond_1

    new-instance v8, Lje/q;

    invoke-direct {p0, p1}, Lje/p;->f(Landroid/net/wifi/WifiInfo;)Lh9/a;

    move-result-object v2

    invoke-direct {p0, p1}, Lje/p;->v(Landroid/net/wifi/WifiInfo;)LS8/l;

    move-result-object v3

    invoke-direct {p0, p1}, Lje/p;->s(Landroid/net/wifi/WifiInfo;)LW7/b;

    move-result-object v4

    invoke-direct {p0, p1}, Lje/p;->h(Landroid/net/wifi/WifiInfo;)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    sget-object v7, Lke/a$a$a$a;->a:Lke/a$a$a$a;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lje/q;-><init>(LS8/c;Lh9/a;LS8/l;LW7/b;Ljava/lang/Integer;LS8/d;Lke/a;)V

    :cond_1
    return-object v0
.end method

.method private final k(Landroid/net/wifi/WifiInfo;)LS8/a;
    .locals 2

    iget-object v0, p0, Lje/p;->b:LT7/a;

    const/16 v1, 0x1e

    invoke-virtual {v0, v1}, LT7/a;->c(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {p1}, Lje/m;->a(Landroid/net/wifi/WifiInfo;)I

    move-result p1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unknown WIFI Standard "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x6

    invoke-static {p1, v1, v1, v0, v1}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_0

    :pswitch_0
    sget-object v1, LS8/a;->BE:LS8/a;

    goto :goto_0

    :pswitch_1
    sget-object v1, LS8/a;->AD:LS8/a;

    goto :goto_0

    :pswitch_2
    sget-object v1, LS8/a;->AX:LS8/a;

    goto :goto_0

    :pswitch_3
    sget-object v1, LS8/a;->AC:LS8/a;

    goto :goto_0

    :pswitch_4
    sget-object v1, LS8/a;->N:LS8/a;

    goto :goto_0

    :cond_1
    sget-object v1, LS8/a;->G:LS8/a;

    :cond_2
    :goto_0
    return-object v1

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final l(Ljava/lang/Integer;Ljava/lang/Integer;)LW7/b;
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {p0, p1}, Lje/p;->z(I)LW7/a;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-direct {p0, p2}, Lje/p;->z(I)LW7/a;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, v0

    :goto_1
    if-nez p1, :cond_2

    if-nez p2, :cond_2

    return-object v0

    :cond_2
    new-instance v0, LW7/b;

    invoke-direct {v0, p1, p2}, LW7/b;-><init>(LW7/a;LW7/a;)V

    return-object v0
.end method

.method static synthetic m(Lje/p;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)LW7/b;
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-direct {p0, p1, p2}, Lje/p;->l(Ljava/lang/Integer;Ljava/lang/Integer;)LW7/b;

    move-result-object p0

    return-object p0
.end method

.method private final n(Landroid/net/wifi/MloLink;)Lke/a;
    .locals 2

    invoke-static {p1}, Lje/f;->a(Landroid/net/wifi/MloLink;)I

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    const/4 v1, 0x1

    if-eq p1, v1, :cond_2

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    const/4 v1, 0x3

    if-eq p1, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lke/a$a$a$a;->a:Lke/a$a$a$a;

    goto :goto_0

    :cond_1
    sget-object v0, Lke/a$a$a$b;->a:Lke/a$a$a$b;

    goto :goto_0

    :cond_2
    sget-object v0, Lke/a$a$b;->a:Lke/a$a$b;

    :cond_3
    :goto_0
    return-object v0
.end method

.method private final o(Landroid/net/wifi/WifiInfo;Ljava/util/Map;)Lje/r$b$a;
    .locals 9

    new-instance v8, Lje/r$b$a$a;

    invoke-direct {p0, p1}, Lje/p;->x(Landroid/net/wifi/WifiInfo;)Lke/c;

    move-result-object v1

    invoke-direct {p0, p1}, Lje/p;->f(Landroid/net/wifi/WifiInfo;)Lh9/a;

    move-result-object v2

    invoke-direct {p0, p1}, Lje/p;->k(Landroid/net/wifi/WifiInfo;)LS8/a;

    move-result-object v3

    invoke-direct {p0, p1}, Lje/p;->t(Landroid/net/wifi/WifiInfo;)LS8/j;

    move-result-object v4

    sget-object p1, LS8/c;->GHZ_2_4:LS8/c;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lje/q;

    sget-object p1, LS8/c;->GHZ_5:LS8/c;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lje/q;

    sget-object p1, LS8/c;->GHZ_6:LS8/c;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Lje/q;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lje/r$b$a$a;-><init>(Lke/c;Lh9/a;LS8/a;LS8/j;Lje/q;Lje/q;Lje/q;)V

    return-object v8
.end method

.method private final p(Landroid/net/wifi/WifiInfo;)Ljava/util/Map;
    .locals 3

    invoke-direct {p0, p1}, Lje/p;->j(Landroid/net/wifi/WifiInfo;)Lje/q;

    move-result-object v0

    invoke-static {p1}, Lje/l;->a(Landroid/net/wifi/WifiInfo;)Ljava/util/List;

    move-result-object p1

    const-string v1, "getAffiliatedMloLinks(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object p1

    new-instance v1, Lje/o;

    invoke-direct {v1, p0, v0}, Lje/o;-><init>(Lje/p;Lje/q;)V

    invoke-static {p1, v1}, Lzi/m;->O(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p1

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lje/q;

    invoke-virtual {v2}, Lje/q;->c()LS8/c;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private static final q(Lje/p;Lje/q;Landroid/net/wifi/MloLink;)Lje/q;
    .locals 8

    invoke-static {p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, p2}, Lje/p;->n(Landroid/net/wifi/MloLink;)Lke/a;

    move-result-object v7

    const/4 v0, 0x0

    if-nez v7, :cond_0

    return-object v0

    :cond_0
    invoke-direct {p0, p2}, Lje/p;->d(Landroid/net/wifi/MloLink;)LS8/c;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lje/q;->c()LS8/c;

    move-result-object v2

    if-ne v2, v1, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v0

    :goto_0
    invoke-static {p2}, Lje/d;->a(Landroid/net/wifi/MloLink;)Landroid/net/MacAddress;

    move-result-object v2

    if-eqz v2, :cond_3

    sget-object v3, Lh9/a;->b:Lh9/a$b;

    invoke-static {v2}, Lje/e;->a(Landroid/net/MacAddress;)[B

    move-result-object v2

    const-string v4, "toByteArray(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Lh9/a$b;->d([B)Lh9/a;

    move-result-object v2

    goto :goto_1

    :cond_3
    move-object v2, v0

    :goto_1
    invoke-direct {p0, p2}, Lje/p;->u(Landroid/net/wifi/MloLink;)LS8/l;

    move-result-object v3

    if-nez v3, :cond_5

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lje/q;->h()LS8/l;

    move-result-object v3

    goto :goto_2

    :cond_4
    move-object v3, v0

    :cond_5
    :goto_2
    invoke-direct {p0, p2}, Lje/p;->r(Landroid/net/wifi/MloLink;)LW7/b;

    move-result-object v4

    if-nez v4, :cond_7

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lje/q;->g()LW7/b;

    move-result-object p1

    move-object v4, p1

    goto :goto_3

    :cond_6
    move-object v4, v0

    :cond_7
    :goto_3
    invoke-direct {p0, p2}, Lje/p;->g(Landroid/net/wifi/MloLink;)I

    move-result p0

    new-instance p1, Lje/q;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v7}, Lje/q;-><init>(LS8/c;Lh9/a;LS8/l;LW7/b;Ljava/lang/Integer;LS8/d;Lke/a;)V

    return-object p1
.end method

.method private final r(Landroid/net/wifi/MloLink;)LW7/b;
    .locals 1

    invoke-static {p1}, Lje/i;->a(Landroid/net/wifi/MloLink;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1}, Lje/j;->a(Landroid/net/wifi/MloLink;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lje/p;->l(Ljava/lang/Integer;Ljava/lang/Integer;)LW7/b;

    move-result-object p1

    return-object p1
.end method

.method private final s(Landroid/net/wifi/WifiInfo;)LW7/b;
    .locals 2

    iget-object v0, p0, Lje/p;->b:LT7/a;

    const/16 v1, 0x1d

    invoke-virtual {v0, v1}, LT7/a;->c(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/net/wifi/WifiInfo;->getLinkSpeed()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0, v1}, Lje/p;->m(Lje/p;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)LW7/b;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Lje/n;->a(Landroid/net/wifi/WifiInfo;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1}, Lje/c;->a(Landroid/net/wifi/WifiInfo;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lje/p;->l(Ljava/lang/Integer;Ljava/lang/Integer;)LW7/b;

    move-result-object p1

    return-object p1
.end method

.method private final t(Landroid/net/wifi/WifiInfo;)LS8/j;
    .locals 3

    iget-object v0, p0, Lje/p;->b:LT7/a;

    const/16 v1, 0x1f

    invoke-virtual {v0, v1}, LT7/a;->c(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {p1}, Lje/k;->a(Landroid/net/wifi/WifiInfo;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lje/k;->a(Landroid/net/wifi/WifiInfo;)I

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown WifiInfo security type \'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x6

    invoke-static {p1, v1, v1, v0, v1}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :pswitch_0
    move-object p1, v1

    goto :goto_0

    :pswitch_1
    sget-object p1, LS8/j$b$h$a;->a:LS8/j$b$h$a;

    goto :goto_0

    :pswitch_2
    sget-object p1, LS8/j$b$c;->a:LS8/j$b$c;

    goto :goto_0

    :pswitch_3
    sget-object p1, LS8/j$b$h$b;->a:LS8/j$b$h$b;

    goto :goto_0

    :pswitch_4
    sget-object p1, LS8/j$b$d;->a:LS8/j$b$d;

    goto :goto_0

    :pswitch_5
    sget-object p1, LS8/j$b$d;->a:LS8/j$b$d;

    goto :goto_0

    :pswitch_6
    sget-object p1, LS8/j$b$h$c;->a:LS8/j$b$h$c;

    goto :goto_0

    :pswitch_7
    sget-object p1, LS8/j$b$h$b;->a:LS8/j$b$h$b;

    goto :goto_0

    :pswitch_8
    sget-object p1, LS8/j$b$h$d;->a:LS8/j$b$h$d;

    goto :goto_0

    :pswitch_9
    sget-object p1, LS8/j$b$f$a;->a:LS8/j$b$f$a;

    goto :goto_0

    :pswitch_a
    sget-object p1, LS8/j$b$f$b;->a:LS8/j$b$f$b;

    goto :goto_0

    :pswitch_b
    sget-object p1, LS8/j$b$e;->a:LS8/j$b$e;

    goto :goto_0

    :pswitch_c
    sget-object p1, LS8/j$b$b;->a:LS8/j$b$b;

    :goto_0
    if-nez p1, :cond_1

    return-object v1

    :cond_1
    sget-object v0, LS8/j;->c:LS8/j$a;

    invoke-static {p1}, LZg/d0;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v0, p1}, LS8/j$a;->a(Ljava/util/Set;)LS8/j;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private final u(Landroid/net/wifi/MloLink;)LS8/l;
    .locals 1

    sget-object v0, LS8/l;->f:LS8/l$a;

    invoke-static {p1}, Lje/b;->a(Landroid/net/wifi/MloLink;)I

    move-result p1

    invoke-virtual {v0, p1}, LS8/l$a;->a(I)LS8/l;

    move-result-object p1

    return-object p1
.end method

.method private final v(Landroid/net/wifi/WifiInfo;)LS8/l;
    .locals 1

    sget-object v0, LS8/l;->f:LS8/l$a;

    invoke-virtual {p1}, Landroid/net/wifi/WifiInfo;->getRssi()I

    move-result p1

    invoke-virtual {v0, p1}, LS8/l$a;->a(I)LS8/l;

    move-result-object p1

    return-object p1
.end method

.method private final w(Landroid/net/wifi/WifiInfo;)Lje/r$b$a;
    .locals 7

    invoke-direct {p0, p1}, Lje/p;->j(Landroid/net/wifi/WifiInfo;)Lje/q;

    move-result-object v5

    new-instance v6, Lje/r$b$a$b;

    invoke-direct {p0, p1}, Lje/p;->x(Landroid/net/wifi/WifiInfo;)Lke/c;

    move-result-object v1

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lje/q;->e()Lh9/a;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v2, v0

    goto :goto_2

    :cond_1
    :goto_1
    invoke-direct {p0, p1}, Lje/p;->f(Landroid/net/wifi/WifiInfo;)Lh9/a;

    move-result-object v0

    goto :goto_0

    :goto_2
    invoke-direct {p0, p1}, Lje/p;->k(Landroid/net/wifi/WifiInfo;)LS8/a;

    move-result-object v3

    invoke-direct {p0, p1}, Lje/p;->t(Landroid/net/wifi/WifiInfo;)LS8/j;

    move-result-object v4

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lje/r$b$a$b;-><init>(Lke/c;Lh9/a;LS8/a;LS8/j;Lje/q;)V

    return-object v6
.end method

.method private final x(Landroid/net/wifi/WifiInfo;)Lke/c;
    .locals 2

    invoke-virtual {p1}, Landroid/net/wifi/WifiInfo;->getHiddenSSID()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lke/c$b;->a:Lke/c$b;

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_1

    return-object v0

    :cond_1
    iget-object v1, p0, Lje/p;->a:Lpe/a;

    invoke-interface {v1, p1}, Lpe/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance v0, Lke/c$a;

    invoke-direct {v0, p1}, Lke/c$a;-><init>(Ljava/lang/String;)V

    :cond_2
    return-object v0
.end method

.method private final y(Landroid/net/wifi/WifiInfo;)Z
    .locals 1

    invoke-virtual {p1}, Landroid/net/wifi/WifiInfo;->getBSSID()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move p1, v0

    :goto_1
    xor-int/2addr p1, v0

    return p1
.end method

.method private final z(I)LW7/a;
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    return-object v1

    :cond_0
    if-gez p1, :cond_1

    return-object v1

    :cond_1
    sget-object v0, LW7/a;->b:LW7/a$a;

    invoke-virtual {v0, p1}, LW7/a$a;->d(I)LW7/a;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(Landroid/net/wifi/WifiInfo;)Lje/r$b;
    .locals 4

    const-string v0, "wifiInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lje/p;->y(Landroid/net/wifi/WifiInfo;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lje/r$b$b;->a:Lje/r$b$b;

    return-object p1

    :cond_0
    iget-object v0, p0, Lje/p;->b:LT7/a;

    const/16 v1, 0x22

    invoke-virtual {v0, v1}, LT7/a;->b(I)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0, p1}, Lje/p;->p(Landroid/net/wifi/WifiInfo;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    instance-of v2, v1, Ljava/util/Collection;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lje/q;

    invoke-virtual {v2}, Lje/q;->i()Lke/a;

    move-result-object v2

    instance-of v2, v2, Lke/a$a$a;

    if-eqz v2, :cond_2

    add-int/lit8 v3, v3, 0x1

    if-gez v3, :cond_2

    invoke-static {}, LZg/v;->u()V

    goto :goto_0

    :cond_3
    :goto_1
    const/4 v1, 0x1

    if-le v3, v1, :cond_4

    invoke-direct {p0, p1, v0}, Lje/p;->o(Landroid/net/wifi/WifiInfo;Ljava/util/Map;)Lje/r$b$a;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-direct {p0, p1}, Lje/p;->w(Landroid/net/wifi/WifiInfo;)Lje/r$b$a;

    move-result-object p1

    return-object p1
.end method

.method public b(LS8/j;LS8/j;)LS8/j;
    .locals 4

    const-string v0, "securityFromWifiInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "securityFromWifiScan"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LS8/j;->a()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LS8/j$b;

    instance-of v2, v1, LS8/j$b$f$b;

    if-nez v2, :cond_2

    instance-of v1, v1, LS8/j$b$f$a;

    if-eqz v1, :cond_1

    :cond_2
    sget-object v0, LS8/j;->c:LS8/j$a;

    invoke-static {}, LZg/d0;->b()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1}, LS8/j;->a()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LS8/j$b;

    instance-of v3, v2, LS8/j$b$f$b;

    if-eqz v3, :cond_4

    invoke-virtual {p2}, LS8/j;->a()Ljava/util/Set;

    move-result-object v2

    sget-object v3, LS8/j$b$g$b;->a:LS8/j$b$g$b;

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    sget-object v2, LS8/j$b$f$b;->a:LS8/j$b$f$b;

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    instance-of v3, v2, LS8/j$b$f$a;

    if-eqz v3, :cond_6

    invoke-virtual {p2}, LS8/j;->a()Ljava/util/Set;

    move-result-object v2

    sget-object v3, LS8/j$b$g$a;->a:LS8/j$b$g$a;

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    sget-object v2, LS8/j$b$f$a;->a:LS8/j$b$f$a;

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_6
    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_7
    invoke-static {v1}, LZg/d0;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v0, p1}, LS8/j$a;->a(Ljava/util/Set;)LS8/j;

    move-result-object p1

    :cond_8
    :goto_1
    return-object p1
.end method
