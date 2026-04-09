.class public final enum Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

.field public static final enum MISMATCHED_TYPE:Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

.field public static final enum NO_REQUEST:Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

.field public static final enum UNKNOWN_TYPE:Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

.field public static final enum UNSUPPORTED:Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;


# instance fields
.field private final code:I


# direct methods
.method private static final synthetic $values()[Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;
    .locals 4

    sget-object v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;->UNKNOWN_TYPE:Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

    sget-object v1, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;->UNSUPPORTED:Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

    sget-object v2, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;->NO_REQUEST:Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

    sget-object v3, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;->MISMATCHED_TYPE:Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

    filled-new-array {v0, v1, v2, v3}, [Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

    const/4 v1, 0x0

    const/16 v2, 0x3e9

    const-string/jumbo v3, "UNKNOWN_TYPE"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;->UNKNOWN_TYPE:Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

    const/4 v1, 0x1

    const/16 v2, 0x3ea

    const-string/jumbo v3, "UNSUPPORTED"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;->UNSUPPORTED:Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

    const/4 v1, 0x2

    const/16 v2, 0x3eb

    const-string/jumbo v3, "NO_REQUEST"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;->NO_REQUEST:Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

    const/4 v1, 0x3

    const/16 v2, 0x3ec

    const-string/jumbo v3, "MISMATCHED_TYPE"

    invoke-direct {v0, v3, v1, v2}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;->MISMATCHED_TYPE:Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

    invoke-static {}, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;->$values()[Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

    move-result-object v0

    sput-object v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;->$VALUES:[Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;->code:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;
    .locals 1

    const-class v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

    return-object p0
.end method

.method public static values()[Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;
    .locals 1

    sget-object v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;->$VALUES:[Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;

    return-object v0
.end method


# virtual methods
.method public final getCode()I
    .locals 1

    iget v0, p0, Lcom/ui/comm/v4/UiCommV4Specs$Header$Error$a;->code:I

    return v0
.end method
