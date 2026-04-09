.class public final enum Lcom/google/firebase/crashlytics/internal/common/H;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[Lcom/google/firebase/crashlytics/internal/common/H;

.field public static final enum APP_STORE:Lcom/google/firebase/crashlytics/internal/common/H;

.field public static final enum DEVELOPER:Lcom/google/firebase/crashlytics/internal/common/H;

.field public static final enum TEST_DISTRIBUTION:Lcom/google/firebase/crashlytics/internal/common/H;

.field public static final enum USER_SIDELOAD:Lcom/google/firebase/crashlytics/internal/common/H;


# instance fields
.field private final id:I


# direct methods
.method private static synthetic $values()[Lcom/google/firebase/crashlytics/internal/common/H;
    .locals 4

    sget-object v0, Lcom/google/firebase/crashlytics/internal/common/H;->DEVELOPER:Lcom/google/firebase/crashlytics/internal/common/H;

    sget-object v1, Lcom/google/firebase/crashlytics/internal/common/H;->USER_SIDELOAD:Lcom/google/firebase/crashlytics/internal/common/H;

    sget-object v2, Lcom/google/firebase/crashlytics/internal/common/H;->TEST_DISTRIBUTION:Lcom/google/firebase/crashlytics/internal/common/H;

    sget-object v3, Lcom/google/firebase/crashlytics/internal/common/H;->APP_STORE:Lcom/google/firebase/crashlytics/internal/common/H;

    filled-new-array {v0, v1, v2, v3}, [Lcom/google/firebase/crashlytics/internal/common/H;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/firebase/crashlytics/internal/common/H;

    const-string v1, "DEVELOPER"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/google/firebase/crashlytics/internal/common/H;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/firebase/crashlytics/internal/common/H;->DEVELOPER:Lcom/google/firebase/crashlytics/internal/common/H;

    new-instance v0, Lcom/google/firebase/crashlytics/internal/common/H;

    const-string/jumbo v1, "USER_SIDELOAD"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, Lcom/google/firebase/crashlytics/internal/common/H;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/firebase/crashlytics/internal/common/H;->USER_SIDELOAD:Lcom/google/firebase/crashlytics/internal/common/H;

    new-instance v0, Lcom/google/firebase/crashlytics/internal/common/H;

    const-string/jumbo v1, "TEST_DISTRIBUTION"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/firebase/crashlytics/internal/common/H;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/firebase/crashlytics/internal/common/H;->TEST_DISTRIBUTION:Lcom/google/firebase/crashlytics/internal/common/H;

    new-instance v0, Lcom/google/firebase/crashlytics/internal/common/H;

    const-string v1, "APP_STORE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v3, v2}, Lcom/google/firebase/crashlytics/internal/common/H;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/firebase/crashlytics/internal/common/H;->APP_STORE:Lcom/google/firebase/crashlytics/internal/common/H;

    invoke-static {}, Lcom/google/firebase/crashlytics/internal/common/H;->$values()[Lcom/google/firebase/crashlytics/internal/common/H;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/internal/common/H;->$VALUES:[Lcom/google/firebase/crashlytics/internal/common/H;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/firebase/crashlytics/internal/common/H;->id:I

    return-void
.end method

.method public static determineFrom(Ljava/lang/String;)Lcom/google/firebase/crashlytics/internal/common/H;
    .locals 0

    if-eqz p0, :cond_0

    sget-object p0, Lcom/google/firebase/crashlytics/internal/common/H;->APP_STORE:Lcom/google/firebase/crashlytics/internal/common/H;

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/google/firebase/crashlytics/internal/common/H;->DEVELOPER:Lcom/google/firebase/crashlytics/internal/common/H;

    :goto_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/firebase/crashlytics/internal/common/H;
    .locals 1

    const-class v0, Lcom/google/firebase/crashlytics/internal/common/H;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/crashlytics/internal/common/H;

    return-object p0
.end method

.method public static values()[Lcom/google/firebase/crashlytics/internal/common/H;
    .locals 1

    sget-object v0, Lcom/google/firebase/crashlytics/internal/common/H;->$VALUES:[Lcom/google/firebase/crashlytics/internal/common/H;

    invoke-virtual {v0}, [Lcom/google/firebase/crashlytics/internal/common/H;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/firebase/crashlytics/internal/common/H;

    return-object v0
.end method


# virtual methods
.method public getId()I
    .locals 1

    iget v0, p0, Lcom/google/firebase/crashlytics/internal/common/H;->id:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lcom/google/firebase/crashlytics/internal/common/H;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
