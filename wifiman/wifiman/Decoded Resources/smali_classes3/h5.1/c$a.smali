.class public final enum Lh5/c$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lh5/c$a;

.field public static final enum ATTEMPT_MIGRATION:Lh5/c$a;

.field public static final enum NOT_GENERATED:Lh5/c$a;

.field public static final enum REGISTERED:Lh5/c$a;

.field public static final enum REGISTER_ERROR:Lh5/c$a;

.field public static final enum UNREGISTERED:Lh5/c$a;


# direct methods
.method private static synthetic $values()[Lh5/c$a;
    .locals 5

    sget-object v0, Lh5/c$a;->ATTEMPT_MIGRATION:Lh5/c$a;

    sget-object v1, Lh5/c$a;->NOT_GENERATED:Lh5/c$a;

    sget-object v2, Lh5/c$a;->UNREGISTERED:Lh5/c$a;

    sget-object v3, Lh5/c$a;->REGISTERED:Lh5/c$a;

    sget-object v4, Lh5/c$a;->REGISTER_ERROR:Lh5/c$a;

    filled-new-array {v0, v1, v2, v3, v4}, [Lh5/c$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lh5/c$a;

    const-string v1, "ATTEMPT_MIGRATION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lh5/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh5/c$a;->ATTEMPT_MIGRATION:Lh5/c$a;

    new-instance v0, Lh5/c$a;

    const-string/jumbo v1, "NOT_GENERATED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lh5/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh5/c$a;->NOT_GENERATED:Lh5/c$a;

    new-instance v0, Lh5/c$a;

    const-string/jumbo v1, "UNREGISTERED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lh5/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh5/c$a;->UNREGISTERED:Lh5/c$a;

    new-instance v0, Lh5/c$a;

    const-string/jumbo v1, "REGISTERED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lh5/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh5/c$a;->REGISTERED:Lh5/c$a;

    new-instance v0, Lh5/c$a;

    const-string/jumbo v1, "REGISTER_ERROR"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lh5/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh5/c$a;->REGISTER_ERROR:Lh5/c$a;

    invoke-static {}, Lh5/c$a;->$values()[Lh5/c$a;

    move-result-object v0

    sput-object v0, Lh5/c$a;->$VALUES:[Lh5/c$a;

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

.method public static valueOf(Ljava/lang/String;)Lh5/c$a;
    .locals 1

    const-class v0, Lh5/c$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lh5/c$a;

    return-object p0
.end method

.method public static values()[Lh5/c$a;
    .locals 1

    sget-object v0, Lh5/c$a;->$VALUES:[Lh5/c$a;

    invoke-virtual {v0}, [Lh5/c$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lh5/c$a;

    return-object v0
.end method
