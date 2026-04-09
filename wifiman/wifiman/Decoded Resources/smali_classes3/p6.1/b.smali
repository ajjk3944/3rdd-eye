.class public final enum Lp6/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lp6/b;

.field public static final enum BottomLeft:Lp6/b;

.field public static final enum BottomRight:Lp6/b;

.field public static final enum TopLeft:Lp6/b;

.field public static final enum TopRight:Lp6/b;


# direct methods
.method private static final synthetic $values()[Lp6/b;
    .locals 4

    sget-object v0, Lp6/b;->TopLeft:Lp6/b;

    sget-object v1, Lp6/b;->TopRight:Lp6/b;

    sget-object v2, Lp6/b;->BottomRight:Lp6/b;

    sget-object v3, Lp6/b;->BottomLeft:Lp6/b;

    filled-new-array {v0, v1, v2, v3}, [Lp6/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lp6/b;

    const-string/jumbo v1, "TopLeft"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lp6/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp6/b;->TopLeft:Lp6/b;

    new-instance v0, Lp6/b;

    const-string/jumbo v1, "TopRight"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lp6/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp6/b;->TopRight:Lp6/b;

    new-instance v0, Lp6/b;

    const-string v1, "BottomRight"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lp6/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp6/b;->BottomRight:Lp6/b;

    new-instance v0, Lp6/b;

    const-string v1, "BottomLeft"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lp6/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp6/b;->BottomLeft:Lp6/b;

    invoke-static {}, Lp6/b;->$values()[Lp6/b;

    move-result-object v0

    sput-object v0, Lp6/b;->$VALUES:[Lp6/b;

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

.method public static valueOf(Ljava/lang/String;)Lp6/b;
    .locals 1

    const-class v0, Lp6/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lp6/b;

    return-object p0
.end method

.method public static values()[Lp6/b;
    .locals 1

    sget-object v0, Lp6/b;->$VALUES:[Lp6/b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp6/b;

    return-object v0
.end method
