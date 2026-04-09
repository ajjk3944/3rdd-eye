.class public final enum Lz/K;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lz/K;

.field public static final enum Horizontal:Lz/K;

.field public static final enum Vertical:Lz/K;


# direct methods
.method private static final synthetic $values()[Lz/K;
    .locals 2

    sget-object v0, Lz/K;->Horizontal:Lz/K;

    sget-object v1, Lz/K;->Vertical:Lz/K;

    filled-new-array {v0, v1}, [Lz/K;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lz/K;

    const-string v1, "Horizontal"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lz/K;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz/K;->Horizontal:Lz/K;

    new-instance v0, Lz/K;

    const-string v1, "Vertical"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lz/K;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz/K;->Vertical:Lz/K;

    invoke-static {}, Lz/K;->$values()[Lz/K;

    move-result-object v0

    sput-object v0, Lz/K;->$VALUES:[Lz/K;

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

.method public static valueOf(Ljava/lang/String;)Lz/K;
    .locals 1

    const-class v0, Lz/K;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lz/K;

    return-object p0
.end method

.method public static values()[Lz/K;
    .locals 1

    sget-object v0, Lz/K;->$VALUES:[Lz/K;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lz/K;

    return-object v0
.end method
