.class public final enum LE0/G$g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE0/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "g"
.end annotation


# static fields
.field private static final synthetic $VALUES:[LE0/G$g;

.field public static final enum InLayoutBlock:LE0/G$g;

.field public static final enum InMeasureBlock:LE0/G$g;

.field public static final enum NotUsed:LE0/G$g;


# direct methods
.method private static final synthetic $values()[LE0/G$g;
    .locals 3

    sget-object v0, LE0/G$g;->InMeasureBlock:LE0/G$g;

    sget-object v1, LE0/G$g;->InLayoutBlock:LE0/G$g;

    sget-object v2, LE0/G$g;->NotUsed:LE0/G$g;

    filled-new-array {v0, v1, v2}, [LE0/G$g;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LE0/G$g;

    const-string v1, "InMeasureBlock"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LE0/G$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, LE0/G$g;->InMeasureBlock:LE0/G$g;

    new-instance v0, LE0/G$g;

    const-string v1, "InLayoutBlock"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LE0/G$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, LE0/G$g;->InLayoutBlock:LE0/G$g;

    new-instance v0, LE0/G$g;

    const-string v1, "NotUsed"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LE0/G$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, LE0/G$g;->NotUsed:LE0/G$g;

    invoke-static {}, LE0/G$g;->$values()[LE0/G$g;

    move-result-object v0

    sput-object v0, LE0/G$g;->$VALUES:[LE0/G$g;

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

.method public static valueOf(Ljava/lang/String;)LE0/G$g;
    .locals 1

    const-class v0, LE0/G$g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LE0/G$g;

    return-object p0
.end method

.method public static values()[LE0/G$g;
    .locals 1

    sget-object v0, LE0/G$g;->$VALUES:[LE0/G$g;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LE0/G$g;

    return-object v0
.end method
