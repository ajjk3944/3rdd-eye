.class final enum LE0/g0$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE0/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "d"
.end annotation


# static fields
.field private static final synthetic $VALUES:[LE0/g0$d;

.field public static final enum Max:LE0/g0$d;

.field public static final enum Min:LE0/g0$d;


# direct methods
.method private static final synthetic $values()[LE0/g0$d;
    .locals 2

    sget-object v0, LE0/g0$d;->Min:LE0/g0$d;

    sget-object v1, LE0/g0$d;->Max:LE0/g0$d;

    filled-new-array {v0, v1}, [LE0/g0$d;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LE0/g0$d;

    const-string v1, "Min"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LE0/g0$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LE0/g0$d;->Min:LE0/g0$d;

    new-instance v0, LE0/g0$d;

    const-string v1, "Max"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LE0/g0$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LE0/g0$d;->Max:LE0/g0$d;

    invoke-static {}, LE0/g0$d;->$values()[LE0/g0$d;

    move-result-object v0

    sput-object v0, LE0/g0$d;->$VALUES:[LE0/g0$d;

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

.method public static valueOf(Ljava/lang/String;)LE0/g0$d;
    .locals 1

    const-class v0, LE0/g0$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LE0/g0$d;

    return-object p0
.end method

.method public static values()[LE0/g0$d;
    .locals 1

    sget-object v0, LE0/g0$d;->$VALUES:[LE0/g0$d;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LE0/g0$d;

    return-object v0
.end method
