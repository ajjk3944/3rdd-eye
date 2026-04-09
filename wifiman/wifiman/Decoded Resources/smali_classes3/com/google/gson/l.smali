.class public final enum Lcom/google/gson/l;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lcom/google/gson/l;

.field public static final enum ALLOW:Lcom/google/gson/l;

.field public static final enum BLOCK_ALL:Lcom/google/gson/l;

.field public static final enum BLOCK_INACCESSIBLE:Lcom/google/gson/l;

.field public static final enum INDECISIVE:Lcom/google/gson/l;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/google/gson/l;

    const-string v1, "ALLOW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/gson/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/gson/l;->ALLOW:Lcom/google/gson/l;

    new-instance v1, Lcom/google/gson/l;

    const-string/jumbo v2, "INDECISIVE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/google/gson/l;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/google/gson/l;->INDECISIVE:Lcom/google/gson/l;

    new-instance v2, Lcom/google/gson/l;

    const-string v3, "BLOCK_INACCESSIBLE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/google/gson/l;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/google/gson/l;->BLOCK_INACCESSIBLE:Lcom/google/gson/l;

    new-instance v3, Lcom/google/gson/l;

    const-string v4, "BLOCK_ALL"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lcom/google/gson/l;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/google/gson/l;->BLOCK_ALL:Lcom/google/gson/l;

    filled-new-array {v0, v1, v2, v3}, [Lcom/google/gson/l;

    move-result-object v0

    sput-object v0, Lcom/google/gson/l;->$VALUES:[Lcom/google/gson/l;

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

.method public static valueOf(Ljava/lang/String;)Lcom/google/gson/l;
    .locals 1

    const-class v0, Lcom/google/gson/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/gson/l;

    return-object p0
.end method

.method public static values()[Lcom/google/gson/l;
    .locals 1

    sget-object v0, Lcom/google/gson/l;->$VALUES:[Lcom/google/gson/l;

    invoke-virtual {v0}, [Lcom/google/gson/l;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/gson/l;

    return-object v0
.end method
