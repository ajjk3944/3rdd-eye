.class public final enum Lg1/g$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lg1/g$a;

.field public static final enum PACKED:Lg1/g$a;

.field public static final enum SPREAD:Lg1/g$a;

.field public static final enum SPREAD_INSIDE:Lg1/g$a;

.field public static chainMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lg1/g$a;",
            ">;"
        }
    .end annotation
.end field

.field public static valueMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private static synthetic $values()[Lg1/g$a;
    .locals 3

    sget-object v0, Lg1/g$a;->SPREAD:Lg1/g$a;

    sget-object v1, Lg1/g$a;->SPREAD_INSIDE:Lg1/g$a;

    sget-object v2, Lg1/g$a;->PACKED:Lg1/g$a;

    filled-new-array {v0, v1, v2}, [Lg1/g$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lg1/g$a;

    const-string v1, "SPREAD"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lg1/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$a;->SPREAD:Lg1/g$a;

    new-instance v1, Lg1/g$a;

    const-string v3, "SPREAD_INSIDE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lg1/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lg1/g$a;->SPREAD_INSIDE:Lg1/g$a;

    new-instance v3, Lg1/g$a;

    const-string v5, "PACKED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lg1/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lg1/g$a;->PACKED:Lg1/g$a;

    invoke-static {}, Lg1/g$a;->$values()[Lg1/g$a;

    move-result-object v5

    sput-object v5, Lg1/g$a;->$VALUES:[Lg1/g$a;

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    sput-object v5, Lg1/g$a;->chainMap:Ljava/util/Map;

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    sput-object v5, Lg1/g$a;->valueMap:Ljava/util/Map;

    sget-object v5, Lg1/g$a;->chainMap:Ljava/util/Map;

    const-string v7, "packed"

    invoke-interface {v5, v7, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lg1/g$a;->chainMap:Ljava/util/Map;

    const-string v5, "spread_inside"

    invoke-interface {v3, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lg1/g$a;->chainMap:Ljava/util/Map;

    const-string v3, "spread"

    invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lg1/g$a;->valueMap:Ljava/util/Map;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lg1/g$a;->valueMap:Ljava/util/Map;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lg1/g$a;->valueMap:Ljava/util/Map;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getChainByString(Ljava/lang/String;)Lg1/g$a;
    .locals 1

    sget-object v0, Lg1/g$a;->chainMap:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lg1/g$a;->chainMap:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg1/g$a;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getValueByString(Ljava/lang/String;)I
    .locals 1

    sget-object v0, Lg1/g$a;->valueMap:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lg1/g$a;->valueMap:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_0
    const/4 p0, -0x1

    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lg1/g$a;
    .locals 1

    const-class v0, Lg1/g$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg1/g$a;

    return-object p0
.end method

.method public static values()[Lg1/g$a;
    .locals 1

    sget-object v0, Lg1/g$a;->$VALUES:[Lg1/g$a;

    invoke-virtual {v0}, [Lg1/g$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg1/g$a;

    return-object v0
.end method
