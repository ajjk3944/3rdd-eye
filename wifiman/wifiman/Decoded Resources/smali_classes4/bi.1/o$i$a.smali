.class public final enum Lbi/o$i$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbi/o$i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lbi/o$i$a;

.field public static final enum CONFLICT:Lbi/o$i$a;

.field public static final enum INCOMPATIBLE:Lbi/o$i$a;

.field public static final enum OVERRIDABLE:Lbi/o$i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lbi/o$i$a;

    const-string v1, "OVERRIDABLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lbi/o$i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbi/o$i$a;->OVERRIDABLE:Lbi/o$i$a;

    new-instance v1, Lbi/o$i$a;

    const-string v2, "INCOMPATIBLE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lbi/o$i$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lbi/o$i$a;->INCOMPATIBLE:Lbi/o$i$a;

    new-instance v2, Lbi/o$i$a;

    const-string v3, "CONFLICT"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lbi/o$i$a;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lbi/o$i$a;->CONFLICT:Lbi/o$i$a;

    filled-new-array {v0, v1, v2}, [Lbi/o$i$a;

    move-result-object v0

    sput-object v0, Lbi/o$i$a;->$VALUES:[Lbi/o$i$a;

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

.method public static valueOf(Ljava/lang/String;)Lbi/o$i$a;
    .locals 1

    const-class v0, Lbi/o$i$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbi/o$i$a;

    return-object p0
.end method

.method public static values()[Lbi/o$i$a;
    .locals 1

    sget-object v0, Lbi/o$i$a;->$VALUES:[Lbi/o$i$a;

    invoke-virtual {v0}, [Lbi/o$i$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbi/o$i$a;

    return-object v0
.end method
