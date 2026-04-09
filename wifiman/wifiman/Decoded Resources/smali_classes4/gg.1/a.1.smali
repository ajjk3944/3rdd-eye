.class public final enum Lgg/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lgg/a;

.field public static final enum BUFFER:Lgg/a;

.field public static final enum DROP:Lgg/a;

.field public static final enum ERROR:Lgg/a;

.field public static final enum LATEST:Lgg/a;

.field public static final enum MISSING:Lgg/a;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lgg/a;

    const-string v1, "MISSING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lgg/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgg/a;->MISSING:Lgg/a;

    new-instance v1, Lgg/a;

    const-string v2, "ERROR"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lgg/a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lgg/a;->ERROR:Lgg/a;

    new-instance v2, Lgg/a;

    const-string v3, "BUFFER"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lgg/a;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lgg/a;->BUFFER:Lgg/a;

    new-instance v3, Lgg/a;

    const-string v4, "DROP"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lgg/a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lgg/a;->DROP:Lgg/a;

    new-instance v4, Lgg/a;

    const-string v5, "LATEST"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Lgg/a;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lgg/a;->LATEST:Lgg/a;

    filled-new-array {v0, v1, v2, v3, v4}, [Lgg/a;

    move-result-object v0

    sput-object v0, Lgg/a;->$VALUES:[Lgg/a;

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

.method public static valueOf(Ljava/lang/String;)Lgg/a;
    .locals 1

    const-class v0, Lgg/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgg/a;

    return-object p0
.end method

.method public static values()[Lgg/a;
    .locals 1

    sget-object v0, Lgg/a;->$VALUES:[Lgg/a;

    invoke-virtual {v0}, [Lgg/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgg/a;

    return-object v0
.end method
