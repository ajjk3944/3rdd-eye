.class public final enum Lz/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lz/n;

.field public static final enum Both:Lz/n;

.field public static final enum Horizontal:Lz/n;

.field public static final enum Vertical:Lz/n;


# direct methods
.method private static final synthetic $values()[Lz/n;
    .locals 3

    sget-object v0, Lz/n;->Vertical:Lz/n;

    sget-object v1, Lz/n;->Horizontal:Lz/n;

    sget-object v2, Lz/n;->Both:Lz/n;

    filled-new-array {v0, v1, v2}, [Lz/n;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lz/n;

    const-string v1, "Vertical"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lz/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz/n;->Vertical:Lz/n;

    new-instance v0, Lz/n;

    const-string v1, "Horizontal"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lz/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz/n;->Horizontal:Lz/n;

    new-instance v0, Lz/n;

    const-string v1, "Both"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lz/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz/n;->Both:Lz/n;

    invoke-static {}, Lz/n;->$values()[Lz/n;

    move-result-object v0

    sput-object v0, Lz/n;->$VALUES:[Lz/n;

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

.method public static valueOf(Ljava/lang/String;)Lz/n;
    .locals 1

    const-class v0, Lz/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lz/n;

    return-object p0
.end method

.method public static values()[Lz/n;
    .locals 1

    sget-object v0, Lz/n;->$VALUES:[Lz/n;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lz/n;

    return-object v0
.end method
