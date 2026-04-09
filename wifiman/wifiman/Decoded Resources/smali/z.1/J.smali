.class public final enum Lz/J;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lz/J;

.field public static final enum Max:Lz/J;

.field public static final enum Min:Lz/J;


# direct methods
.method private static final synthetic $values()[Lz/J;
    .locals 2

    sget-object v0, Lz/J;->Min:Lz/J;

    sget-object v1, Lz/J;->Max:Lz/J;

    filled-new-array {v0, v1}, [Lz/J;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lz/J;

    const-string v1, "Min"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lz/J;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz/J;->Min:Lz/J;

    new-instance v0, Lz/J;

    const-string v1, "Max"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lz/J;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz/J;->Max:Lz/J;

    invoke-static {}, Lz/J;->$values()[Lz/J;

    move-result-object v0

    sput-object v0, Lz/J;->$VALUES:[Lz/J;

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

.method public static valueOf(Ljava/lang/String;)Lz/J;
    .locals 1

    const-class v0, Lz/J;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lz/J;

    return-object p0
.end method

.method public static values()[Lz/J;
    .locals 1

    sget-object v0, Lz/J;->$VALUES:[Lz/J;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lz/J;

    return-object v0
.end method
