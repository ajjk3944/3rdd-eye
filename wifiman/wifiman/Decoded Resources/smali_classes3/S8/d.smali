.class public final enum LS8/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS8/d$a;
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LS8/d;

.field public static final Companion:LS8/d$a;

.field public static final enum MHZ_160:LS8/d;

.field public static final enum MHZ_20:LS8/d;

.field public static final enum MHZ_320:LS8/d;

.field public static final enum MHZ_40:LS8/d;

.field public static final enum MHZ_80:LS8/d;

.field public static final enum MHZ_80_80:LS8/d;


# instance fields
.field private final width:I


# direct methods
.method private static final synthetic $values()[LS8/d;
    .locals 6

    sget-object v0, LS8/d;->MHZ_20:LS8/d;

    sget-object v1, LS8/d;->MHZ_40:LS8/d;

    sget-object v2, LS8/d;->MHZ_80:LS8/d;

    sget-object v3, LS8/d;->MHZ_160:LS8/d;

    sget-object v4, LS8/d;->MHZ_80_80:LS8/d;

    sget-object v5, LS8/d;->MHZ_320:LS8/d;

    filled-new-array/range {v0 .. v5}, [LS8/d;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LS8/d;

    const/4 v1, 0x0

    const/16 v2, 0x14

    const-string/jumbo v3, "MHZ_20"

    invoke-direct {v0, v3, v1, v2}, LS8/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, LS8/d;->MHZ_20:LS8/d;

    new-instance v0, LS8/d;

    const/4 v1, 0x1

    const/16 v2, 0x28

    const-string/jumbo v3, "MHZ_40"

    invoke-direct {v0, v3, v1, v2}, LS8/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, LS8/d;->MHZ_40:LS8/d;

    new-instance v0, LS8/d;

    const/4 v1, 0x2

    const/16 v2, 0x50

    const-string/jumbo v3, "MHZ_80"

    invoke-direct {v0, v3, v1, v2}, LS8/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, LS8/d;->MHZ_80:LS8/d;

    new-instance v0, LS8/d;

    const-string/jumbo v1, "MHZ_160"

    const/4 v2, 0x3

    const/16 v3, 0xa0

    invoke-direct {v0, v1, v2, v3}, LS8/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, LS8/d;->MHZ_160:LS8/d;

    new-instance v0, LS8/d;

    const-string/jumbo v1, "MHZ_80_80"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v3}, LS8/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, LS8/d;->MHZ_80_80:LS8/d;

    new-instance v0, LS8/d;

    const/4 v1, 0x5

    const/16 v2, 0x140

    const-string/jumbo v3, "MHZ_320"

    invoke-direct {v0, v3, v1, v2}, LS8/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, LS8/d;->MHZ_320:LS8/d;

    invoke-static {}, LS8/d;->$values()[LS8/d;

    move-result-object v0

    sput-object v0, LS8/d;->$VALUES:[LS8/d;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LS8/d;->$ENTRIES:Lfh/a;

    new-instance v0, LS8/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LS8/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LS8/d;->Companion:LS8/d$a;

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

    iput p3, p0, LS8/d;->width:I

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

    sget-object v0, LS8/d;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LS8/d;
    .locals 1

    const-class v0, LS8/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LS8/d;

    return-object p0
.end method

.method public static values()[LS8/d;
    .locals 1

    sget-object v0, LS8/d;->$VALUES:[LS8/d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LS8/d;

    return-object v0
.end method


# virtual methods
.method public final getWidth()I
    .locals 1

    iget v0, p0, LS8/d;->width:I

    return v0
.end method
