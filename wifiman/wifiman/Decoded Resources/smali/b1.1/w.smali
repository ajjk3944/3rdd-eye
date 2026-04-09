.class public final enum Lb1/w;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lb1/w;

.field public static final enum BOUNDS:Lb1/w;

.field public static final enum NONE:Lb1/w;


# direct methods
.method private static final synthetic $values()[Lb1/w;
    .locals 2

    sget-object v0, Lb1/w;->NONE:Lb1/w;

    sget-object v1, Lb1/w;->BOUNDS:Lb1/w;

    filled-new-array {v0, v1}, [Lb1/w;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lb1/w;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lb1/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb1/w;->NONE:Lb1/w;

    new-instance v0, Lb1/w;

    const-string v1, "BOUNDS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lb1/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb1/w;->BOUNDS:Lb1/w;

    invoke-static {}, Lb1/w;->$values()[Lb1/w;

    move-result-object v0

    sput-object v0, Lb1/w;->$VALUES:[Lb1/w;

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

.method public static valueOf(Ljava/lang/String;)Lb1/w;
    .locals 1

    const-class v0, Lb1/w;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb1/w;

    return-object p0
.end method

.method public static values()[Lb1/w;
    .locals 1

    sget-object v0, Lb1/w;->$VALUES:[Lb1/w;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb1/w;

    return-object v0
.end method
