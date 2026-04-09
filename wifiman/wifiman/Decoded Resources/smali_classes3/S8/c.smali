.class public final enum LS8/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS8/c$a;
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LS8/c;

.field public static final enum GHZ_2_4:LS8/c;

.field public static final enum GHZ_5:LS8/c;

.field public static final enum GHZ_6:LS8/c;


# instance fields
.field private final channels$delegate:LYg/m;

.field private final channelsMap$delegate:LYg/m;

.field private final supportedBandwidths:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LS8/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[LS8/c;
    .locals 3

    sget-object v0, LS8/c;->GHZ_2_4:LS8/c;

    sget-object v1, LS8/c;->GHZ_5:LS8/c;

    sget-object v2, LS8/c;->GHZ_6:LS8/c;

    filled-new-array {v0, v1, v2}, [LS8/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 8

    new-instance v0, LS8/c;

    sget-object v1, LS8/d;->MHZ_20:LS8/d;

    sget-object v2, LS8/d;->MHZ_40:LS8/d;

    filled-new-array {v1, v2}, [LS8/d;

    move-result-object v3

    invoke-static {v3}, LZg/d0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    const-string/jumbo v4, "GHZ_2_4"

    const/4 v5, 0x0

    invoke-direct {v0, v4, v5, v3}, LS8/c;-><init>(Ljava/lang/String;ILjava/util/Set;)V

    sput-object v0, LS8/c;->GHZ_2_4:LS8/c;

    new-instance v0, LS8/c;

    sget-object v3, LS8/d;->MHZ_80:LS8/d;

    sget-object v4, LS8/d;->MHZ_160:LS8/d;

    filled-new-array {v1, v2, v3, v4}, [LS8/d;

    move-result-object v5

    invoke-static {v5}, LZg/d0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    const-string/jumbo v6, "GHZ_5"

    const/4 v7, 0x1

    invoke-direct {v0, v6, v7, v5}, LS8/c;-><init>(Ljava/lang/String;ILjava/util/Set;)V

    sput-object v0, LS8/c;->GHZ_5:LS8/c;

    new-instance v0, LS8/c;

    sget-object v5, LS8/d;->MHZ_320:LS8/d;

    filled-new-array {v1, v2, v3, v4, v5}, [LS8/d;

    move-result-object v1

    invoke-static {v1}, LZg/d0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    const-string/jumbo v2, "GHZ_6"

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3, v1}, LS8/c;-><init>(Ljava/lang/String;ILjava/util/Set;)V

    sput-object v0, LS8/c;->GHZ_6:LS8/c;

    invoke-static {}, LS8/c;->$values()[LS8/c;

    move-result-object v0

    sput-object v0, LS8/c;->$VALUES:[LS8/c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LS8/c;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "LS8/d;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LS8/c;->supportedBandwidths:Ljava/util/Set;

    new-instance p1, LS8/c$b;

    invoke-direct {p1, p0}, LS8/c$b;-><init>(LS8/c;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LS8/c;->channels$delegate:LYg/m;

    new-instance p1, LS8/c$c;

    invoke-direct {p1, p0}, LS8/c$c;-><init>(LS8/c;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LS8/c;->channelsMap$delegate:LYg/m;

    return-void
.end method

.method public static final synthetic access$getChannelList(LS8/c;LS8/c;Ljava/util/Set;)Ljava/util/Set;
    .locals 0

    invoke-direct {p0, p1, p2}, LS8/c;->getChannelList(LS8/c;Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method private final getChannelList(LS8/c;Ljava/util/Set;)Ljava/util/Set;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LS8/c;",
            "Ljava/util/Set<",
            "LKb/a$a;",
            ">;)",
            "Ljava/util/Set<",
            "LS8/e;",
            ">;"
        }
    .end annotation

    invoke-static {}, LZg/d0;->b()Ljava/util/Set;

    move-result-object v0

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LKb/a$a;

    sget-object v2, LS8/d;->Companion:LS8/d$a;

    invoke-virtual {v1}, LKb/a$a;->d()I

    move-result v3

    invoke-virtual {v2, v3}, LS8/d$a;->a(I)LS8/d;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    new-instance v3, LS8/e;

    invoke-virtual {v1}, LKb/a$a;->f()I

    move-result v4

    sget-object v5, LS8/c;->GHZ_2_4:LS8/c;

    if-ne p1, v5, :cond_1

    invoke-virtual {v1}, LKb/a$a;->d()I

    move-result v5

    const/16 v6, 0x28

    if-ne v5, v6, :cond_1

    sget-object v5, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->a:Lcom/ubnt/usurvey/wifi/WifiChannelUtils;

    invoke-virtual {v1}, LKb/a$a;->e()I

    move-result v6

    invoke-virtual {v5, v6}, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->c(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual {v1}, LKb/a$a;->f()I

    move-result v7

    invoke-virtual {v5, v7, p1}, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->b(ILS8/c;)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v1}, LKb/a$a;->f()I

    move-result v7

    if-le v6, v7, :cond_0

    invoke-virtual {v1}, LKb/a$a;->e()I

    move-result v1

    add-int/lit8 v1, v1, 0xa

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, LKb/a$a;->e()I

    move-result v1

    add-int/lit8 v1, v1, -0xa

    :goto_1
    new-instance v6, LS8/e$b$a;

    invoke-direct {v6, v2, v5, v1}, LS8/e$b$a;-><init>(LS8/d;II)V

    goto :goto_2

    :cond_1
    invoke-virtual {v1}, LKb/a$a;->e()I

    move-result v1

    new-instance v6, LS8/e$b$b;

    invoke-direct {v6, v2, v1}, LS8/e$b$b;-><init>(LS8/d;I)V

    :goto_2
    invoke-direct {v3, p1, v4, v6, v2}, LS8/e;-><init>(LS8/c;ILS8/e$b;LS8/d;)V

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v0}, LZg/d0;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method private final getChannelsMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "LS8/c$a;",
            "LS8/e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LS8/c;->channelsMap$delegate:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public static getEntries()Lfh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfh/a;"
        }
    .end annotation

    sget-object v0, LS8/c;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LS8/c;
    .locals 1

    const-class v0, LS8/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LS8/c;

    return-object p0
.end method

.method public static values()[LS8/c;
    .locals 1

    sget-object v0, LS8/c;->$VALUES:[LS8/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LS8/c;

    return-object v0
.end method


# virtual methods
.method public final getChannel(ILS8/d;)LS8/e;
    .locals 2

    const-string/jumbo v0, "bandwidth"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LS8/c;->getChannelsMap()Ljava/util/Map;

    move-result-object v0

    new-instance v1, LS8/c$a;

    invoke-direct {v1, p0, p1, p2}, LS8/c$a;-><init>(LS8/c;ILS8/d;)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LS8/e;

    return-object p1
.end method

.method public final getChannels()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "LS8/e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LS8/c;->channels$delegate:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method public final getSupportedBandwidths()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "LS8/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LS8/c;->supportedBandwidths:Ljava/util/Set;

    return-object v0
.end method
