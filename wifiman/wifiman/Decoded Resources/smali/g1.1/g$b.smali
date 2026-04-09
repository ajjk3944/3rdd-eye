.class public final enum Lg1/g$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lg1/g$b;

.field public static final enum BASELINE_TO_BASELINE:Lg1/g$b;

.field public static final enum BASELINE_TO_BOTTOM:Lg1/g$b;

.field public static final enum BASELINE_TO_TOP:Lg1/g$b;

.field public static final enum BOTTOM_TO_BASELINE:Lg1/g$b;

.field public static final enum BOTTOM_TO_BOTTOM:Lg1/g$b;

.field public static final enum BOTTOM_TO_TOP:Lg1/g$b;

.field public static final enum CENTER_HORIZONTALLY:Lg1/g$b;

.field public static final enum CENTER_VERTICALLY:Lg1/g$b;

.field public static final enum CIRCULAR_CONSTRAINT:Lg1/g$b;

.field public static final enum END_TO_END:Lg1/g$b;

.field public static final enum END_TO_START:Lg1/g$b;

.field public static final enum LEFT_TO_LEFT:Lg1/g$b;

.field public static final enum LEFT_TO_RIGHT:Lg1/g$b;

.field public static final enum RIGHT_TO_LEFT:Lg1/g$b;

.field public static final enum RIGHT_TO_RIGHT:Lg1/g$b;

.field public static final enum START_TO_END:Lg1/g$b;

.field public static final enum START_TO_START:Lg1/g$b;

.field public static final enum TOP_TO_BASELINE:Lg1/g$b;

.field public static final enum TOP_TO_BOTTOM:Lg1/g$b;

.field public static final enum TOP_TO_TOP:Lg1/g$b;


# direct methods
.method private static synthetic $values()[Lg1/g$b;
    .locals 20

    sget-object v0, Lg1/g$b;->LEFT_TO_LEFT:Lg1/g$b;

    sget-object v1, Lg1/g$b;->LEFT_TO_RIGHT:Lg1/g$b;

    sget-object v2, Lg1/g$b;->RIGHT_TO_LEFT:Lg1/g$b;

    sget-object v3, Lg1/g$b;->RIGHT_TO_RIGHT:Lg1/g$b;

    sget-object v4, Lg1/g$b;->START_TO_START:Lg1/g$b;

    sget-object v5, Lg1/g$b;->START_TO_END:Lg1/g$b;

    sget-object v6, Lg1/g$b;->END_TO_START:Lg1/g$b;

    sget-object v7, Lg1/g$b;->END_TO_END:Lg1/g$b;

    sget-object v8, Lg1/g$b;->TOP_TO_TOP:Lg1/g$b;

    sget-object v9, Lg1/g$b;->TOP_TO_BOTTOM:Lg1/g$b;

    sget-object v10, Lg1/g$b;->TOP_TO_BASELINE:Lg1/g$b;

    sget-object v11, Lg1/g$b;->BOTTOM_TO_TOP:Lg1/g$b;

    sget-object v12, Lg1/g$b;->BOTTOM_TO_BOTTOM:Lg1/g$b;

    sget-object v13, Lg1/g$b;->BOTTOM_TO_BASELINE:Lg1/g$b;

    sget-object v14, Lg1/g$b;->BASELINE_TO_BASELINE:Lg1/g$b;

    sget-object v15, Lg1/g$b;->BASELINE_TO_TOP:Lg1/g$b;

    sget-object v16, Lg1/g$b;->BASELINE_TO_BOTTOM:Lg1/g$b;

    sget-object v17, Lg1/g$b;->CENTER_HORIZONTALLY:Lg1/g$b;

    sget-object v18, Lg1/g$b;->CENTER_VERTICALLY:Lg1/g$b;

    sget-object v19, Lg1/g$b;->CIRCULAR_CONSTRAINT:Lg1/g$b;

    filled-new-array/range {v0 .. v19}, [Lg1/g$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lg1/g$b;

    const-string v1, "LEFT_TO_LEFT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lg1/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$b;->LEFT_TO_LEFT:Lg1/g$b;

    new-instance v0, Lg1/g$b;

    const-string v1, "LEFT_TO_RIGHT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lg1/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$b;->LEFT_TO_RIGHT:Lg1/g$b;

    new-instance v0, Lg1/g$b;

    const-string v1, "RIGHT_TO_LEFT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lg1/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$b;->RIGHT_TO_LEFT:Lg1/g$b;

    new-instance v0, Lg1/g$b;

    const-string v1, "RIGHT_TO_RIGHT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lg1/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$b;->RIGHT_TO_RIGHT:Lg1/g$b;

    new-instance v0, Lg1/g$b;

    const-string v1, "START_TO_START"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lg1/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$b;->START_TO_START:Lg1/g$b;

    new-instance v0, Lg1/g$b;

    const-string v1, "START_TO_END"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lg1/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$b;->START_TO_END:Lg1/g$b;

    new-instance v0, Lg1/g$b;

    const-string v1, "END_TO_START"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lg1/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$b;->END_TO_START:Lg1/g$b;

    new-instance v0, Lg1/g$b;

    const-string v1, "END_TO_END"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lg1/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$b;->END_TO_END:Lg1/g$b;

    new-instance v0, Lg1/g$b;

    const-string v1, "TOP_TO_TOP"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lg1/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$b;->TOP_TO_TOP:Lg1/g$b;

    new-instance v0, Lg1/g$b;

    const-string v1, "TOP_TO_BOTTOM"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lg1/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$b;->TOP_TO_BOTTOM:Lg1/g$b;

    new-instance v0, Lg1/g$b;

    const-string v1, "TOP_TO_BASELINE"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lg1/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$b;->TOP_TO_BASELINE:Lg1/g$b;

    new-instance v0, Lg1/g$b;

    const-string v1, "BOTTOM_TO_TOP"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lg1/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$b;->BOTTOM_TO_TOP:Lg1/g$b;

    new-instance v0, Lg1/g$b;

    const-string v1, "BOTTOM_TO_BOTTOM"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Lg1/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$b;->BOTTOM_TO_BOTTOM:Lg1/g$b;

    new-instance v0, Lg1/g$b;

    const-string v1, "BOTTOM_TO_BASELINE"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Lg1/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$b;->BOTTOM_TO_BASELINE:Lg1/g$b;

    new-instance v0, Lg1/g$b;

    const-string v1, "BASELINE_TO_BASELINE"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Lg1/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$b;->BASELINE_TO_BASELINE:Lg1/g$b;

    new-instance v0, Lg1/g$b;

    const-string v1, "BASELINE_TO_TOP"

    const/16 v2, 0xf

    invoke-direct {v0, v1, v2}, Lg1/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$b;->BASELINE_TO_TOP:Lg1/g$b;

    new-instance v0, Lg1/g$b;

    const-string v1, "BASELINE_TO_BOTTOM"

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2}, Lg1/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$b;->BASELINE_TO_BOTTOM:Lg1/g$b;

    new-instance v0, Lg1/g$b;

    const-string v1, "CENTER_HORIZONTALLY"

    const/16 v2, 0x11

    invoke-direct {v0, v1, v2}, Lg1/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$b;->CENTER_HORIZONTALLY:Lg1/g$b;

    new-instance v0, Lg1/g$b;

    const-string v1, "CENTER_VERTICALLY"

    const/16 v2, 0x12

    invoke-direct {v0, v1, v2}, Lg1/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$b;->CENTER_VERTICALLY:Lg1/g$b;

    new-instance v0, Lg1/g$b;

    const-string v1, "CIRCULAR_CONSTRAINT"

    const/16 v2, 0x13

    invoke-direct {v0, v1, v2}, Lg1/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg1/g$b;->CIRCULAR_CONSTRAINT:Lg1/g$b;

    invoke-static {}, Lg1/g$b;->$values()[Lg1/g$b;

    move-result-object v0

    sput-object v0, Lg1/g$b;->$VALUES:[Lg1/g$b;

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

.method public static valueOf(Ljava/lang/String;)Lg1/g$b;
    .locals 1

    const-class v0, Lg1/g$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg1/g$b;

    return-object p0
.end method

.method public static values()[Lg1/g$b;
    .locals 1

    sget-object v0, Lg1/g$b;->$VALUES:[Lg1/g$b;

    invoke-virtual {v0}, [Lg1/g$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg1/g$b;

    return-object v0
.end method
