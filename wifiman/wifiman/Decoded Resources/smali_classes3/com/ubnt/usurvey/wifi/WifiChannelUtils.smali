.class public final Lcom/ubnt/usurvey/wifi/WifiChannelUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ubnt/usurvey/wifi/WifiChannelUtils$InternalError;,
        Lcom/ubnt/usurvey/wifi/WifiChannelUtils$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/ubnt/usurvey/wifi/WifiChannelUtils;

.field private static final b:Lsh/i;

.field private static final c:Lsh/i;

.field private static final d:Lsh/i;

.field private static final e:Lsh/i;

.field private static final f:Lsh/i;

.field private static final g:Lsh/i;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;

    invoke-direct {v0}, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;-><init>()V

    sput-object v0, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->a:Lcom/ubnt/usurvey/wifi/WifiChannelUtils;

    new-instance v0, Lsh/i;

    const/16 v1, 0x96c

    const/16 v2, 0x9b4

    invoke-direct {v0, v1, v2}, Lsh/i;-><init>(II)V

    sput-object v0, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->b:Lsh/i;

    new-instance v0, Lsh/i;

    const/16 v1, 0x1428

    const/16 v2, 0x16fd

    invoke-direct {v0, v1, v2}, Lsh/i;-><init>(II)V

    sput-object v0, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->c:Lsh/i;

    new-instance v0, Lsh/i;

    const/16 v1, 0x1743

    const/16 v2, 0x1bcb

    invoke-direct {v0, v1, v2}, Lsh/i;-><init>(II)V

    sput-object v0, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->d:Lsh/i;

    new-instance v0, Lsh/i;

    const/16 v1, 0xe

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lsh/i;-><init>(II)V

    sput-object v0, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->e:Lsh/i;

    new-instance v0, Lsh/i;

    const/16 v1, 0x20

    const/16 v3, 0xb1

    invoke-direct {v0, v1, v3}, Lsh/i;-><init>(II)V

    sput-object v0, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->f:Lsh/i;

    new-instance v0, Lsh/i;

    const/16 v1, 0xe9

    invoke-direct {v0, v2, v1}, Lsh/i;-><init>(II)V

    sput-object v0, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->g:Lsh/i;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)LS8/c;
    .locals 3

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->b:Lsh/i;

    invoke-virtual {v0}, Lsh/g;->i()I

    move-result v1

    invoke-virtual {v0}, Lsh/g;->j()I

    move-result v0

    const/4 v2, 0x0

    if-gt p1, v0, :cond_0

    if-gt v1, p1, :cond_0

    sget-object v0, LS8/c;->GHZ_2_4:LS8/c;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->c:Lsh/i;

    invoke-virtual {v0}, Lsh/g;->i()I

    move-result v1

    invoke-virtual {v0}, Lsh/g;->j()I

    move-result v0

    if-gt p1, v0, :cond_1

    if-gt v1, p1, :cond_1

    sget-object v0, LS8/c;->GHZ_5:LS8/c;

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->d:Lsh/i;

    invoke-virtual {v0}, Lsh/g;->i()I

    move-result v1

    invoke-virtual {v0}, Lsh/g;->j()I

    move-result v0

    if-gt p1, v0, :cond_2

    if-gt v1, p1, :cond_2

    sget-object v0, LS8/c;->GHZ_6:LS8/c;

    goto :goto_0

    :cond_2
    const/16 v0, 0x172f

    if-ne p1, v0, :cond_3

    sget-object v0, LS8/c;->GHZ_6:LS8/c;

    goto :goto_0

    :cond_3
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_4

    new-instance v1, Lcom/ubnt/usurvey/wifi/WifiChannelUtils$InternalError$c;

    invoke-direct {v1, p1}, Lcom/ubnt/usurvey/wifi/WifiChannelUtils$InternalError$c;-><init>(I)V

    const/4 p1, 0x2

    invoke-static {v1, v2, p1, v2}, LZ7/b;->f(Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_4
    return-object v0
.end method

.method public final b(ILS8/c;)Ljava/lang/Integer;
    .locals 4

    const-string/jumbo v0, "band"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiChannelUtils$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v2, :cond_4

    if-eq v0, v1, :cond_3

    const/4 v2, 0x3

    if-ne v0, v2, :cond_2

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->g:Lsh/i;

    invoke-virtual {v0}, Lsh/g;->i()I

    move-result v2

    invoke-virtual {v0}, Lsh/g;->j()I

    move-result v0

    if-gt p1, v0, :cond_1

    if-gt v2, p1, :cond_1

    if-ne p1, v1, :cond_0

    const/16 v0, 0x172f

    goto :goto_0

    :cond_0
    add-int/lit8 v0, p1, -0x1

    mul-int/lit8 v0, v0, 0x5

    add-int/lit16 v0, v0, 0x1743

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v3

    goto :goto_1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->f:Lsh/i;

    invoke-virtual {v0}, Lsh/g;->i()I

    move-result v2

    invoke-virtual {v0}, Lsh/g;->j()I

    move-result v0

    if-gt p1, v0, :cond_1

    if-gt v2, p1, :cond_1

    add-int/lit8 v0, p1, -0x20

    mul-int/lit8 v0, v0, 0x5

    add-int/lit16 v0, v0, 0x1428

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :cond_4
    const/16 v0, 0xe

    if-ne p1, v0, :cond_5

    const/16 v0, 0x9b4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :cond_5
    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->e:Lsh/i;

    invoke-virtual {v0}, Lsh/g;->i()I

    move-result v2

    invoke-virtual {v0}, Lsh/g;->j()I

    move-result v0

    if-gt p1, v0, :cond_1

    if-gt v2, p1, :cond_1

    add-int/lit8 v0, p1, -0x1

    mul-int/lit8 v0, v0, 0x5

    add-int/lit16 v0, v0, 0x96c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_1
    if-nez v0, :cond_6

    new-instance v2, Lcom/ubnt/usurvey/wifi/WifiChannelUtils$InternalError$b;

    invoke-direct {v2, p1, p2}, Lcom/ubnt/usurvey/wifi/WifiChannelUtils$InternalError$b;-><init>(ILS8/c;)V

    invoke-static {v2, v3, v1, v3}, LZ7/b;->f(Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_6
    return-object v0
.end method

.method public final c(I)Ljava/lang/Integer;
    .locals 5

    const/16 v0, 0x9b4

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-ne p1, v0, :cond_0

    const/16 v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->a(I)LS8/c;

    move-result-object v0

    const/4 v3, -0x1

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_0

    :cond_1
    sget-object v4, Lcom/ubnt/usurvey/wifi/WifiChannelUtils$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v4, v0

    :goto_0
    if-eq v0, v3, :cond_5

    const/4 v3, 0x1

    if-eq v0, v3, :cond_4

    if-eq v0, v1, :cond_3

    const/4 v4, 0x3

    if-ne v0, v4, :cond_2

    add-int/lit16 v0, p1, -0x1743

    div-int/lit8 v0, v0, 0x5

    add-int/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    add-int/lit16 v0, p1, -0x1428

    div-int/lit8 v0, v0, 0x5

    add-int/lit8 v0, v0, 0x20

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :cond_4
    add-int/lit16 v0, p1, -0x96c

    div-int/lit8 v0, v0, 0x5

    add-int/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :cond_5
    move-object v0, v2

    :goto_1
    if-nez v0, :cond_6

    new-instance v3, Lcom/ubnt/usurvey/wifi/WifiChannelUtils$InternalError$a;

    invoke-direct {v3, p1}, Lcom/ubnt/usurvey/wifi/WifiChannelUtils$InternalError$a;-><init>(I)V

    invoke-static {v3, v2, v1, v2}, LZ7/b;->f(Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_6
    return-object v0
.end method
