.class public final enum Lcom/ui/wifiman/model/wmw/h$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/wmw/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/wmw/h$b$a;
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ui/wifiman/model/wmw/h$b;

.field public static final enum DOWNLOAD:Lcom/ui/wifiman/model/wmw/h$b;

.field public static final enum FINISH:Lcom/ui/wifiman/model/wmw/h$b;

.field public static final enum UPGRADE:Lcom/ui/wifiman/model/wmw/h$b;

.field public static final enum UPLOAD:Lcom/ui/wifiman/model/wmw/h$b;


# direct methods
.method private static final synthetic $values()[Lcom/ui/wifiman/model/wmw/h$b;
    .locals 4

    sget-object v0, Lcom/ui/wifiman/model/wmw/h$b;->DOWNLOAD:Lcom/ui/wifiman/model/wmw/h$b;

    sget-object v1, Lcom/ui/wifiman/model/wmw/h$b;->UPLOAD:Lcom/ui/wifiman/model/wmw/h$b;

    sget-object v2, Lcom/ui/wifiman/model/wmw/h$b;->UPGRADE:Lcom/ui/wifiman/model/wmw/h$b;

    sget-object v3, Lcom/ui/wifiman/model/wmw/h$b;->FINISH:Lcom/ui/wifiman/model/wmw/h$b;

    filled-new-array {v0, v1, v2, v3}, [Lcom/ui/wifiman/model/wmw/h$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ui/wifiman/model/wmw/h$b;

    const-string v1, "DOWNLOAD"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/wmw/h$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/wmw/h$b;->DOWNLOAD:Lcom/ui/wifiman/model/wmw/h$b;

    new-instance v0, Lcom/ui/wifiman/model/wmw/h$b;

    const-string v1, "UPLOAD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/wmw/h$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/wmw/h$b;->UPLOAD:Lcom/ui/wifiman/model/wmw/h$b;

    new-instance v0, Lcom/ui/wifiman/model/wmw/h$b;

    const-string v1, "UPGRADE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/wmw/h$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/wmw/h$b;->UPGRADE:Lcom/ui/wifiman/model/wmw/h$b;

    new-instance v0, Lcom/ui/wifiman/model/wmw/h$b;

    const-string v1, "FINISH"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/ui/wifiman/model/wmw/h$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/wifiman/model/wmw/h$b;->FINISH:Lcom/ui/wifiman/model/wmw/h$b;

    invoke-static {}, Lcom/ui/wifiman/model/wmw/h$b;->$values()[Lcom/ui/wifiman/model/wmw/h$b;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/wmw/h$b;->$VALUES:[Lcom/ui/wifiman/model/wmw/h$b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/wmw/h$b;->$ENTRIES:Lfh/a;

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

.method public static getEntries()Lfh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfh/a;"
        }
    .end annotation

    sget-object v0, Lcom/ui/wifiman/model/wmw/h$b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/wifiman/model/wmw/h$b;
    .locals 1

    const-class v0, Lcom/ui/wifiman/model/wmw/h$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/wifiman/model/wmw/h$b;

    return-object p0
.end method

.method public static values()[Lcom/ui/wifiman/model/wmw/h$b;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/model/wmw/h$b;->$VALUES:[Lcom/ui/wifiman/model/wmw/h$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/wifiman/model/wmw/h$b;

    return-object v0
.end method


# virtual methods
.method public final mapStageProgressToTotalProgress(F)F
    .locals 3

    sget-object v0, Lcom/ui/wifiman/model/wmw/h$b$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const v2, 0x3e4ccccd    # 0.2f

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 p1, 0x4

    if-ne v0, p1, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const/high16 v0, 0x3e800000    # 0.25f

    mul-float/2addr p1, v0

    const/high16 v0, 0x3f400000    # 0.75f

    add-float/2addr p1, v0

    goto :goto_0

    :cond_2
    const v0, 0x3f0ccccd    # 0.55f

    mul-float/2addr p1, v0

    add-float/2addr p1, v2

    goto :goto_0

    :cond_3
    mul-float/2addr p1, v2

    :goto_0
    return p1
.end method
