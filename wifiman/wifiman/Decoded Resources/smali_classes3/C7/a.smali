.class public final LC7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LC7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC7/a;

    invoke-direct {v0}, LC7/a;-><init>()V

    sput-object v0, LC7/a;->a:LC7/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a([B)Lt7/b;
    .locals 2

    const-string/jumbo v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lv7/b;->a:Lv7/b;

    sget-object v1, Lv7/a;->BIG_ENDIAN:Lv7/a;

    invoke-virtual {v0, p1, v1}, Lv7/b;->b([BLv7/a;)I

    move-result p1

    and-int/lit8 v0, p1, 0x1

    if-lez v0, :cond_0

    sget-object p1, Lt7/b;->FACTORY_DEFAULT:Lt7/b;

    goto :goto_0

    :cond_0
    and-int/lit8 p1, p1, 0x8

    if-lez p1, :cond_1

    sget-object p1, Lt7/b;->RECOVERY:Lt7/b;

    goto :goto_0

    :cond_1
    sget-object p1, Lt7/b;->NORMAL:Lt7/b;

    :goto_0
    return-object p1
.end method

.method public final b([BII)Ljava/net/InetAddress;
    .locals 1

    const-string/jumbo v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2, p3}, LZg/n;->r([BII)[B

    move-result-object p1

    invoke-static {p1}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final c([B)Ly7/l;
    .locals 4

    const-string/jumbo v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    const/4 v1, 0x6

    if-lt v0, v1, :cond_3

    const/4 v2, 0x0

    invoke-static {p1, v2, v1}, LZg/n;->r([BII)[B

    move-result-object v2

    sub-int/2addr v0, v1

    if-eqz v0, :cond_2

    const/4 v3, 0x4

    if-eq v0, v3, :cond_1

    const/16 v3, 0x10

    if-ne v0, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Unknown data after hw address present (size = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    array-length v0, p1

    invoke-virtual {p0, p1, v1, v0}, LC7/a;->b([BII)Ljava/net/InetAddress;

    move-result-object p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    new-instance v0, Ly7/l;

    invoke-direct {v0, v2, p1}, Ly7/l;-><init>([BLjava/net/InetAddress;)V

    return-object v0

    :cond_3
    new-instance p1, Lcom/ubnt/discovery/server/lan/processing/parser/IllegalFieldSizeException;

    invoke-direct {p1, v0, v1}, Lcom/ubnt/discovery/server/lan/processing/parser/IllegalFieldSizeException;-><init>(II)V

    throw p1
.end method
