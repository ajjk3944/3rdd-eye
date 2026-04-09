.class public final enum Lp5/b$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp5/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lp5/b$a;

.field public static final enum CRASHLYTICS:Lp5/b$a;

.field public static final enum MATT_SAYS_HI:Lp5/b$a;

.field public static final enum PERFORMANCE:Lp5/b$a;


# direct methods
.method private static final synthetic $values()[Lp5/b$a;
    .locals 3

    sget-object v0, Lp5/b$a;->CRASHLYTICS:Lp5/b$a;

    sget-object v1, Lp5/b$a;->PERFORMANCE:Lp5/b$a;

    sget-object v2, Lp5/b$a;->MATT_SAYS_HI:Lp5/b$a;

    filled-new-array {v0, v1, v2}, [Lp5/b$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lp5/b$a;

    const-string v1, "CRASHLYTICS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lp5/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp5/b$a;->CRASHLYTICS:Lp5/b$a;

    new-instance v0, Lp5/b$a;

    const-string/jumbo v1, "PERFORMANCE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lp5/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp5/b$a;->PERFORMANCE:Lp5/b$a;

    new-instance v0, Lp5/b$a;

    const-string/jumbo v1, "MATT_SAYS_HI"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lp5/b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp5/b$a;->MATT_SAYS_HI:Lp5/b$a;

    invoke-static {}, Lp5/b$a;->$values()[Lp5/b$a;

    move-result-object v0

    sput-object v0, Lp5/b$a;->$VALUES:[Lp5/b$a;

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

.method public static valueOf(Ljava/lang/String;)Lp5/b$a;
    .locals 1

    const-class v0, Lp5/b$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lp5/b$a;

    return-object p0
.end method

.method public static values()[Lp5/b$a;
    .locals 1

    sget-object v0, Lp5/b$a;->$VALUES:[Lp5/b$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp5/b$a;

    return-object v0
.end method
