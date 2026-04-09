.class public final enum Lj1/d$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lj1/d$a;

.field public static final enum BASELINE:Lj1/d$a;

.field public static final enum BOTTOM:Lj1/d$a;

.field public static final enum CENTER:Lj1/d$a;

.field public static final enum CENTER_X:Lj1/d$a;

.field public static final enum CENTER_Y:Lj1/d$a;

.field public static final enum LEFT:Lj1/d$a;

.field public static final enum NONE:Lj1/d$a;

.field public static final enum RIGHT:Lj1/d$a;

.field public static final enum TOP:Lj1/d$a;


# direct methods
.method private static synthetic $values()[Lj1/d$a;
    .locals 9

    sget-object v0, Lj1/d$a;->NONE:Lj1/d$a;

    sget-object v1, Lj1/d$a;->LEFT:Lj1/d$a;

    sget-object v2, Lj1/d$a;->TOP:Lj1/d$a;

    sget-object v3, Lj1/d$a;->RIGHT:Lj1/d$a;

    sget-object v4, Lj1/d$a;->BOTTOM:Lj1/d$a;

    sget-object v5, Lj1/d$a;->BASELINE:Lj1/d$a;

    sget-object v6, Lj1/d$a;->CENTER:Lj1/d$a;

    sget-object v7, Lj1/d$a;->CENTER_X:Lj1/d$a;

    sget-object v8, Lj1/d$a;->CENTER_Y:Lj1/d$a;

    filled-new-array/range {v0 .. v8}, [Lj1/d$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lj1/d$a;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lj1/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj1/d$a;->NONE:Lj1/d$a;

    new-instance v0, Lj1/d$a;

    const-string v1, "LEFT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lj1/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj1/d$a;->LEFT:Lj1/d$a;

    new-instance v0, Lj1/d$a;

    const-string v1, "TOP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lj1/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj1/d$a;->TOP:Lj1/d$a;

    new-instance v0, Lj1/d$a;

    const-string v1, "RIGHT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lj1/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj1/d$a;->RIGHT:Lj1/d$a;

    new-instance v0, Lj1/d$a;

    const-string v1, "BOTTOM"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lj1/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj1/d$a;->BOTTOM:Lj1/d$a;

    new-instance v0, Lj1/d$a;

    const-string v1, "BASELINE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lj1/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj1/d$a;->BASELINE:Lj1/d$a;

    new-instance v0, Lj1/d$a;

    const-string v1, "CENTER"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lj1/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj1/d$a;->CENTER:Lj1/d$a;

    new-instance v0, Lj1/d$a;

    const-string v1, "CENTER_X"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lj1/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj1/d$a;->CENTER_X:Lj1/d$a;

    new-instance v0, Lj1/d$a;

    const-string v1, "CENTER_Y"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lj1/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj1/d$a;->CENTER_Y:Lj1/d$a;

    invoke-static {}, Lj1/d$a;->$values()[Lj1/d$a;

    move-result-object v0

    sput-object v0, Lj1/d$a;->$VALUES:[Lj1/d$a;

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

.method public static valueOf(Ljava/lang/String;)Lj1/d$a;
    .locals 1

    const-class v0, Lj1/d$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj1/d$a;

    return-object p0
.end method

.method public static values()[Lj1/d$a;
    .locals 1

    sget-object v0, Lj1/d$a;->$VALUES:[Lj1/d$a;

    invoke-virtual {v0}, [Lj1/d$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj1/d$a;

    return-object v0
.end method
