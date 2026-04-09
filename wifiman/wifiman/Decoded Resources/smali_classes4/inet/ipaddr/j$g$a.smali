.class public final enum Linet/ipaddr/j$g$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/j$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Linet/ipaddr/j$g$a;

.field public static final enum ALL:Linet/ipaddr/j$g$a;

.field public static final enum NETWORK_ONLY:Linet/ipaddr/j$g$a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Linet/ipaddr/j$g$a;

    const-string v1, "NETWORK_ONLY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Linet/ipaddr/j$g$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Linet/ipaddr/j$g$a;->NETWORK_ONLY:Linet/ipaddr/j$g$a;

    new-instance v1, Linet/ipaddr/j$g$a;

    const-string v2, "ALL"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Linet/ipaddr/j$g$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Linet/ipaddr/j$g$a;->ALL:Linet/ipaddr/j$g$a;

    filled-new-array {v0, v1}, [Linet/ipaddr/j$g$a;

    move-result-object v0

    sput-object v0, Linet/ipaddr/j$g$a;->$VALUES:[Linet/ipaddr/j$g$a;

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

.method public static valueOf(Ljava/lang/String;)Linet/ipaddr/j$g$a;
    .locals 1

    const-class v0, Linet/ipaddr/j$g$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Linet/ipaddr/j$g$a;

    return-object p0
.end method

.method public static values()[Linet/ipaddr/j$g$a;
    .locals 1

    sget-object v0, Linet/ipaddr/j$g$a;->$VALUES:[Linet/ipaddr/j$g$a;

    invoke-virtual {v0}, [Linet/ipaddr/j$g$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Linet/ipaddr/j$g$a;

    return-object v0
.end method
