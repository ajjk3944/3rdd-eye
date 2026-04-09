.class abstract enum Lcom/google/common/collect/z$a;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lm4/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/collect/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x440a
    name = "a"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/common/collect/z$a;

.field public static final enum KEY:Lcom/google/common/collect/z$a;

.field public static final enum VALUE:Lcom/google/common/collect/z$a;


# direct methods
.method private static synthetic $values()[Lcom/google/common/collect/z$a;
    .locals 2

    sget-object v0, Lcom/google/common/collect/z$a;->KEY:Lcom/google/common/collect/z$a;

    sget-object v1, Lcom/google/common/collect/z$a;->VALUE:Lcom/google/common/collect/z$a;

    filled-new-array {v0, v1}, [Lcom/google/common/collect/z$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/common/collect/z$a$a;

    const-string/jumbo v1, "KEY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/common/collect/z$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/collect/z$a;->KEY:Lcom/google/common/collect/z$a;

    new-instance v0, Lcom/google/common/collect/z$a$b;

    const-string/jumbo v1, "VALUE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/google/common/collect/z$a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/collect/z$a;->VALUE:Lcom/google/common/collect/z$a;

    invoke-static {}, Lcom/google/common/collect/z$a;->$values()[Lcom/google/common/collect/z$a;

    move-result-object v0

    sput-object v0, Lcom/google/common/collect/z$a;->$VALUES:[Lcom/google/common/collect/z$a;

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

.method synthetic constructor <init>(Ljava/lang/String;ILcom/google/common/collect/y;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/google/common/collect/z$a;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/common/collect/z$a;
    .locals 1

    const-class v0, Lcom/google/common/collect/z$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/common/collect/z$a;

    return-object p0
.end method

.method public static values()[Lcom/google/common/collect/z$a;
    .locals 1

    sget-object v0, Lcom/google/common/collect/z$a;->$VALUES:[Lcom/google/common/collect/z$a;

    invoke-virtual {v0}, [Lcom/google/common/collect/z$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/common/collect/z$a;

    return-object v0
.end method


# virtual methods
.method public abstract synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
.end method
