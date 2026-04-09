.class public final enum Lm2/q$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm2/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lm2/q$c;

.field public static final enum AUTOMATIC:Lm2/q$c;

.field public static final enum TRUNCATE:Lm2/q$c;

.field public static final enum WRITE_AHEAD_LOGGING:Lm2/q$c;


# direct methods
.method private static final synthetic $values()[Lm2/q$c;
    .locals 3

    sget-object v0, Lm2/q$c;->AUTOMATIC:Lm2/q$c;

    sget-object v1, Lm2/q$c;->TRUNCATE:Lm2/q$c;

    sget-object v2, Lm2/q$c;->WRITE_AHEAD_LOGGING:Lm2/q$c;

    filled-new-array {v0, v1, v2}, [Lm2/q$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lm2/q$c;

    const-string v1, "AUTOMATIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lm2/q$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm2/q$c;->AUTOMATIC:Lm2/q$c;

    new-instance v0, Lm2/q$c;

    const-string v1, "TRUNCATE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lm2/q$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm2/q$c;->TRUNCATE:Lm2/q$c;

    new-instance v0, Lm2/q$c;

    const-string v1, "WRITE_AHEAD_LOGGING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lm2/q$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm2/q$c;->WRITE_AHEAD_LOGGING:Lm2/q$c;

    invoke-static {}, Lm2/q$c;->$values()[Lm2/q$c;

    move-result-object v0

    sput-object v0, Lm2/q$c;->$VALUES:[Lm2/q$c;

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

.method private final isLowRamDevice(Landroid/app/ActivityManager;)Z
    .locals 0

    invoke-static {p1}, Lr2/c;->b(Landroid/app/ActivityManager;)Z

    move-result p1

    return p1
.end method

.method public static valueOf(Ljava/lang/String;)Lm2/q$c;
    .locals 1

    const-class v0, Lm2/q$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm2/q$c;

    return-object p0
.end method

.method public static values()[Lm2/q$c;
    .locals 1

    sget-object v0, Lm2/q$c;->$VALUES:[Lm2/q$c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm2/q$c;

    return-object v0
.end method


# virtual methods
.method public final resolve$room_runtime_release(Landroid/content/Context;)Lm2/q$c;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lm2/q$c;->AUTOMATIC:Lm2/q$c;

    if-eq p0, v0, :cond_0

    return-object p0

    :cond_0
    const-string v0, "activity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/app/ActivityManager;

    if-eqz v0, :cond_1

    check-cast p1, Landroid/app/ActivityManager;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    invoke-direct {p0, p1}, Lm2/q$c;->isLowRamDevice(Landroid/app/ActivityManager;)Z

    move-result p1

    if-nez p1, :cond_2

    sget-object p1, Lm2/q$c;->WRITE_AHEAD_LOGGING:Lm2/q$c;

    return-object p1

    :cond_2
    sget-object p1, Lm2/q$c;->TRUNCATE:Lm2/q$c;

    return-object p1
.end method
