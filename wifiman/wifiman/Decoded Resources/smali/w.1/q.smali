.class public final enum Lw/q;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lw/q;

.field public static final enum Horizontal:Lw/q;

.field public static final enum Vertical:Lw/q;


# direct methods
.method private static final synthetic $values()[Lw/q;
    .locals 2

    sget-object v0, Lw/q;->Vertical:Lw/q;

    sget-object v1, Lw/q;->Horizontal:Lw/q;

    filled-new-array {v0, v1}, [Lw/q;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lw/q;

    const-string v1, "Vertical"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lw/q;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw/q;->Vertical:Lw/q;

    new-instance v0, Lw/q;

    const-string v1, "Horizontal"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lw/q;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw/q;->Horizontal:Lw/q;

    invoke-static {}, Lw/q;->$values()[Lw/q;

    move-result-object v0

    sput-object v0, Lw/q;->$VALUES:[Lw/q;

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

.method public static valueOf(Ljava/lang/String;)Lw/q;
    .locals 1

    const-class v0, Lw/q;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw/q;

    return-object p0
.end method

.method public static values()[Lw/q;
    .locals 1

    sget-object v0, Lw/q;->$VALUES:[Lw/q;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw/q;

    return-object v0
.end method
