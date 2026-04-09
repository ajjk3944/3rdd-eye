.class public final enum Ln1/i$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln1/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ln1/i$a;

.field public static final enum CONSTANT:Ln1/i$a;

.field public static final enum ERROR:Ln1/i$a;

.field public static final enum SLACK:Ln1/i$a;

.field public static final enum UNKNOWN:Ln1/i$a;

.field public static final enum UNRESTRICTED:Ln1/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Ln1/i$a;

    const-string v1, "UNRESTRICTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln1/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln1/i$a;->UNRESTRICTED:Ln1/i$a;

    new-instance v1, Ln1/i$a;

    const-string v2, "CONSTANT"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ln1/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ln1/i$a;->CONSTANT:Ln1/i$a;

    new-instance v2, Ln1/i$a;

    const-string v3, "SLACK"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ln1/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v2, Ln1/i$a;->SLACK:Ln1/i$a;

    new-instance v3, Ln1/i$a;

    const-string v4, "ERROR"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ln1/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ln1/i$a;->ERROR:Ln1/i$a;

    new-instance v4, Ln1/i$a;

    const-string v5, "UNKNOWN"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ln1/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v4, Ln1/i$a;->UNKNOWN:Ln1/i$a;

    filled-new-array {v0, v1, v2, v3, v4}, [Ln1/i$a;

    move-result-object v0

    sput-object v0, Ln1/i$a;->$VALUES:[Ln1/i$a;

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

.method public static valueOf(Ljava/lang/String;)Ln1/i$a;
    .locals 1

    const-class v0, Ln1/i$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln1/i$a;

    return-object p0
.end method

.method public static values()[Ln1/i$a;
    .locals 1

    sget-object v0, Ln1/i$a;->$VALUES:[Ln1/i$a;

    invoke-virtual {v0}, [Ln1/i$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln1/i$a;

    return-object v0
.end method
