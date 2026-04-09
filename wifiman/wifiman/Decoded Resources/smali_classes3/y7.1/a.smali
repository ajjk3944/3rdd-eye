.class public final enum Ly7/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly7/a$a;
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ly7/a;

.field public static final Companion:Ly7/a$a;

.field public static final enum ETHERNET:Ly7/a;

.field public static final enum WIFI:Ly7/a;


# instance fields
.field private final value:I


# direct methods
.method private static final synthetic $values()[Ly7/a;
    .locals 2

    sget-object v0, Ly7/a;->ETHERNET:Ly7/a;

    sget-object v1, Ly7/a;->WIFI:Ly7/a;

    filled-new-array {v0, v1}, [Ly7/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ly7/a;

    const-string/jumbo v1, "ETHERNET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ly7/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ly7/a;->ETHERNET:Ly7/a;

    new-instance v0, Ly7/a;

    const-string/jumbo v1, "WIFI"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Ly7/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ly7/a;->WIFI:Ly7/a;

    invoke-static {}, Ly7/a;->$values()[Ly7/a;

    move-result-object v0

    sput-object v0, Ly7/a;->$VALUES:[Ly7/a;

    new-instance v0, Ly7/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ly7/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ly7/a;->Companion:Ly7/a$a;

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

    iput p3, p0, Ly7/a;->value:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ly7/a;
    .locals 1

    const-class v0, Ly7/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly7/a;

    return-object p0
.end method

.method public static values()[Ly7/a;
    .locals 1

    sget-object v0, Ly7/a;->$VALUES:[Ly7/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly7/a;

    return-object v0
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    iget v0, p0, Ly7/a;->value:I

    return v0
.end method
