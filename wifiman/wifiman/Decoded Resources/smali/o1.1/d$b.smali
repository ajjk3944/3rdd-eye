.class public final enum Lo1/d$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lo1/d$b;

.field public static final enum BASELINE:Lo1/d$b;

.field public static final enum BOTTOM:Lo1/d$b;

.field public static final enum CENTER:Lo1/d$b;

.field public static final enum CENTER_X:Lo1/d$b;

.field public static final enum CENTER_Y:Lo1/d$b;

.field public static final enum LEFT:Lo1/d$b;

.field public static final enum NONE:Lo1/d$b;

.field public static final enum RIGHT:Lo1/d$b;

.field public static final enum TOP:Lo1/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lo1/d$b;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo1/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo1/d$b;->NONE:Lo1/d$b;

    new-instance v1, Lo1/d$b;

    const-string v2, "LEFT"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lo1/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lo1/d$b;->LEFT:Lo1/d$b;

    new-instance v2, Lo1/d$b;

    const-string v3, "TOP"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lo1/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lo1/d$b;->TOP:Lo1/d$b;

    new-instance v3, Lo1/d$b;

    const-string v4, "RIGHT"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lo1/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lo1/d$b;->RIGHT:Lo1/d$b;

    new-instance v4, Lo1/d$b;

    const-string v5, "BOTTOM"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Lo1/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lo1/d$b;->BOTTOM:Lo1/d$b;

    new-instance v5, Lo1/d$b;

    const-string v6, "BASELINE"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Lo1/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lo1/d$b;->BASELINE:Lo1/d$b;

    new-instance v6, Lo1/d$b;

    const-string v7, "CENTER"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Lo1/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lo1/d$b;->CENTER:Lo1/d$b;

    new-instance v7, Lo1/d$b;

    const-string v8, "CENTER_X"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9}, Lo1/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lo1/d$b;->CENTER_X:Lo1/d$b;

    new-instance v8, Lo1/d$b;

    const-string v9, "CENTER_Y"

    const/16 v10, 0x8

    invoke-direct {v8, v9, v10}, Lo1/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v8, Lo1/d$b;->CENTER_Y:Lo1/d$b;

    filled-new-array/range {v0 .. v8}, [Lo1/d$b;

    move-result-object v0

    sput-object v0, Lo1/d$b;->$VALUES:[Lo1/d$b;

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

.method public static valueOf(Ljava/lang/String;)Lo1/d$b;
    .locals 1

    const-class v0, Lo1/d$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo1/d$b;

    return-object p0
.end method

.method public static values()[Lo1/d$b;
    .locals 1

    sget-object v0, Lo1/d$b;->$VALUES:[Lo1/d$b;

    invoke-virtual {v0}, [Lo1/d$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo1/d$b;

    return-object v0
.end method
