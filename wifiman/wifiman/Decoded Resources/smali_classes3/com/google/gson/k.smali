.class public abstract enum Lcom/google/gson/k;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lcom/google/gson/k;

.field public static final enum DEFAULT:Lcom/google/gson/k;

.field public static final enum STRING:Lcom/google/gson/k;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/google/gson/k$a;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/gson/k$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/gson/k;->DEFAULT:Lcom/google/gson/k;

    new-instance v1, Lcom/google/gson/k$b;

    const-string/jumbo v3, "STRING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/google/gson/k$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/google/gson/k;->STRING:Lcom/google/gson/k;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/google/gson/k;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lcom/google/gson/k;->$VALUES:[Lcom/google/gson/k;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/google/gson/k$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/google/gson/k;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/gson/k;
    .locals 1

    const-class v0, Lcom/google/gson/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/gson/k;

    return-object p0
.end method

.method public static values()[Lcom/google/gson/k;
    .locals 1

    sget-object v0, Lcom/google/gson/k;->$VALUES:[Lcom/google/gson/k;

    invoke-virtual {v0}, [Lcom/google/gson/k;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/gson/k;

    return-object v0
.end method


# virtual methods
.method public abstract serialize(Ljava/lang/Long;)Lcom/google/gson/g;
.end method
