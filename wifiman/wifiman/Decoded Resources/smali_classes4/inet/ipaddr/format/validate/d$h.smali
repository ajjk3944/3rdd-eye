.class public final enum Linet/ipaddr/format/validate/d$h;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/format/validate/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "h"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Linet/ipaddr/format/validate/d$h;

.field public static final enum ALL:Linet/ipaddr/format/validate/d$h;

.field public static final enum EMPTY:Linet/ipaddr/format/validate/d$h;

.field public static final enum INVALID:Linet/ipaddr/format/validate/d$h;

.field public static final enum IPV4:Linet/ipaddr/format/validate/d$h;

.field public static final enum IPV6:Linet/ipaddr/format/validate/d$h;

.field public static final enum PREFIX_ONLY:Linet/ipaddr/format/validate/d$h;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Linet/ipaddr/format/validate/d$h;

    const-string v1, "INVALID"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Linet/ipaddr/format/validate/d$h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Linet/ipaddr/format/validate/d$h;->INVALID:Linet/ipaddr/format/validate/d$h;

    new-instance v1, Linet/ipaddr/format/validate/d$h;

    const-string v2, "EMPTY"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Linet/ipaddr/format/validate/d$h;-><init>(Ljava/lang/String;I)V

    sput-object v1, Linet/ipaddr/format/validate/d$h;->EMPTY:Linet/ipaddr/format/validate/d$h;

    new-instance v2, Linet/ipaddr/format/validate/d$h;

    const-string v3, "IPV4"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Linet/ipaddr/format/validate/d$h;-><init>(Ljava/lang/String;I)V

    sput-object v2, Linet/ipaddr/format/validate/d$h;->IPV4:Linet/ipaddr/format/validate/d$h;

    new-instance v3, Linet/ipaddr/format/validate/d$h;

    const-string v4, "IPV6"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Linet/ipaddr/format/validate/d$h;-><init>(Ljava/lang/String;I)V

    sput-object v3, Linet/ipaddr/format/validate/d$h;->IPV6:Linet/ipaddr/format/validate/d$h;

    new-instance v4, Linet/ipaddr/format/validate/d$h;

    const-string v5, "PREFIX_ONLY"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Linet/ipaddr/format/validate/d$h;-><init>(Ljava/lang/String;I)V

    sput-object v4, Linet/ipaddr/format/validate/d$h;->PREFIX_ONLY:Linet/ipaddr/format/validate/d$h;

    new-instance v5, Linet/ipaddr/format/validate/d$h;

    const-string v6, "ALL"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Linet/ipaddr/format/validate/d$h;-><init>(Ljava/lang/String;I)V

    sput-object v5, Linet/ipaddr/format/validate/d$h;->ALL:Linet/ipaddr/format/validate/d$h;

    filled-new-array/range {v0 .. v5}, [Linet/ipaddr/format/validate/d$h;

    move-result-object v0

    sput-object v0, Linet/ipaddr/format/validate/d$h;->$VALUES:[Linet/ipaddr/format/validate/d$h;

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

.method static from(Linet/ipaddr/g$a;)Linet/ipaddr/format/validate/d$h;
    .locals 1

    sget-object v0, Linet/ipaddr/format/validate/d$d;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Linet/ipaddr/format/validate/d$h;->IPV6:Linet/ipaddr/format/validate/d$h;

    return-object p0

    :cond_1
    sget-object p0, Linet/ipaddr/format/validate/d$h;->IPV4:Linet/ipaddr/format/validate/d$h;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Linet/ipaddr/format/validate/d$h;
    .locals 1

    const-class v0, Linet/ipaddr/format/validate/d$h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Linet/ipaddr/format/validate/d$h;

    return-object p0
.end method

.method public static values()[Linet/ipaddr/format/validate/d$h;
    .locals 1

    sget-object v0, Linet/ipaddr/format/validate/d$h;->$VALUES:[Linet/ipaddr/format/validate/d$h;

    invoke-virtual {v0}, [Linet/ipaddr/format/validate/d$h;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Linet/ipaddr/format/validate/d$h;

    return-object v0
.end method
