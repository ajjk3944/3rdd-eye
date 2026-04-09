.class public final Lkb/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkb/a$a;
    }
.end annotation


# static fields
.field public static final a:Lkb/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkb/a;

    invoke-direct {v0}, Lkb/a;-><init>()V

    sput-object v0, Lkb/a;->a:Lkb/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Lkb/a;ILkb/o;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZILjava/lang/Object;)Lkb/j;
    .locals 7

    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    const/4 p4, 0x0

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p7, 0x20

    if-eqz p4, :cond_1

    const/4 p6, 0x0

    :cond_1
    move v6, p6

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v6}, Lkb/a;->a(ILkb/o;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)Lkb/j;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(ILkb/o;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)Lkb/j;
    .locals 8

    const-string/jumbo v0, "method"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "path"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "headers"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkb/a$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const-string/jumbo v1, "{}"

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    const-string p4, ""

    goto :goto_0

    :pswitch_1
    if-nez p4, :cond_0

    :pswitch_2
    move-object p4, v1

    :cond_0
    :goto_0
    invoke-static {p4}, Lkotlin/text/t;->z(Ljava/lang/String;)[B

    move-result-object v5

    const-string/jumbo v4, "application/json"

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, p5

    move v7, p6

    invoke-virtual/range {v0 .. v7}, Lkb/a;->c(ILkb/o;Ljava/lang/String;Ljava/lang/String;[BLjava/util/Map;Z)Lkb/j;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(ILkb/o;Ljava/lang/String;Ljava/lang/String;[BLjava/util/Map;Z)Lkb/j;
    .locals 2

    const-string/jumbo v0, "method"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "path"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "headers"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p6}, LZg/U;->x(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p6

    if-eqz p5, :cond_0

    array-length v0, p5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Laj/k;->a(Ljava/lang/Number;)Laj/G;

    move-result-object v0

    const-string v1, "Content-Length"

    invoke-interface {p6, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    if-eqz p4, :cond_1

    const-string v0, "Content-Type"

    invoke-static {p4}, Laj/k;->b(Ljava/lang/String;)Laj/G;

    move-result-object p4

    invoke-interface {p6, v0, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p4, Lkb/a$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p4, p4, v0

    const/4 v0, 0x1

    if-ne p4, v0, :cond_2

    new-instance p1, Lkb/d;

    invoke-direct {p1, p3}, Lkb/d;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    new-instance p4, Lkb/n;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p4, p3, v0, p1, p6}, Lkb/n;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;)V

    move-object p1, p4

    :goto_0
    sget-object p4, LSj/a;->a:LSj/a$b;

    const-string/jumbo p6, "REQ: %s %s\nheaders: %s"

    filled-new-array {p2, p3, p1}, [Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p4, p6, p2}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p2, Lkb/j;

    if-nez p5, :cond_3

    const/4 p3, 0x0

    new-array p5, p3, [B

    :cond_3
    invoke-direct {p2, p1, p5, p7}, Lkb/j;-><init>(Lkb/f;[BZ)V

    return-object p2
.end method
