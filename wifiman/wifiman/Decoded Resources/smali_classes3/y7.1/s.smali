.class public final enum Ly7/s;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ls7/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly7/s$a;
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ly7/s;

.field public static final enum ADHOC:Ly7/s;

.field public static final enum AUTO:Ly7/s;

.field public static final Companion:Ly7/s$a;

.field public static final enum MANAGED:Ly7/s;

.field public static final enum MASTER:Ly7/s;

.field public static final enum MONITOR:Ly7/s;

.field public static final enum REPEATER:Ly7/s;

.field public static final enum SECONDARY:Ly7/s;

.field public static final enum UNDEFINED:Ly7/s;


# instance fields
.field private final code:I

.field private final isSingle:Z


# direct methods
.method private static final synthetic $values()[Ly7/s;
    .locals 8

    sget-object v0, Ly7/s;->UNDEFINED:Ly7/s;

    sget-object v1, Ly7/s;->AUTO:Ly7/s;

    sget-object v2, Ly7/s;->ADHOC:Ly7/s;

    sget-object v3, Ly7/s;->MANAGED:Ly7/s;

    sget-object v4, Ly7/s;->MASTER:Ly7/s;

    sget-object v5, Ly7/s;->REPEATER:Ly7/s;

    sget-object v6, Ly7/s;->SECONDARY:Ly7/s;

    sget-object v7, Ly7/s;->MONITOR:Ly7/s;

    filled-new-array/range {v0 .. v7}, [Ly7/s;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ly7/s;

    const/4 v1, -0x1

    const-string/jumbo v2, "UNDEFINED"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Ly7/s;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ly7/s;->UNDEFINED:Ly7/s;

    new-instance v0, Ly7/s;

    const-string v1, "AUTO"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, Ly7/s;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ly7/s;->AUTO:Ly7/s;

    new-instance v0, Ly7/s;

    const-string v1, "ADHOC"

    const/4 v3, 0x2

    invoke-direct {v0, v1, v3, v2}, Ly7/s;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ly7/s;->ADHOC:Ly7/s;

    new-instance v0, Ly7/s;

    const-string/jumbo v1, "MANAGED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v3}, Ly7/s;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ly7/s;->MANAGED:Ly7/s;

    new-instance v0, Ly7/s;

    const-string/jumbo v1, "MASTER"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v3, v2}, Ly7/s;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ly7/s;->MASTER:Ly7/s;

    new-instance v0, Ly7/s;

    const-string/jumbo v1, "REPEATER"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v3}, Ly7/s;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ly7/s;->REPEATER:Ly7/s;

    new-instance v0, Ly7/s;

    const-string/jumbo v1, "SECONDARY"

    const/4 v3, 0x6

    invoke-direct {v0, v1, v3, v2}, Ly7/s;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ly7/s;->SECONDARY:Ly7/s;

    new-instance v0, Ly7/s;

    const-string/jumbo v1, "MONITOR"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, v3}, Ly7/s;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ly7/s;->MONITOR:Ly7/s;

    invoke-static {}, Ly7/s;->$values()[Ly7/s;

    move-result-object v0

    sput-object v0, Ly7/s;->$VALUES:[Ly7/s;

    new-instance v0, Ly7/s$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ly7/s$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ly7/s;->Companion:Ly7/s$a;

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

    iput p3, p0, Ly7/s;->code:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ly7/s;
    .locals 1

    const-class v0, Ly7/s;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly7/s;

    return-object p0
.end method

.method public static values()[Ly7/s;
    .locals 1

    sget-object v0, Ly7/s;->$VALUES:[Ly7/s;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly7/s;

    return-object v0
.end method


# virtual methods
.method public final getCode()I
    .locals 1

    iget v0, p0, Ly7/s;->code:I

    return v0
.end method

.method public isSingle()Z
    .locals 1

    iget-boolean v0, p0, Ly7/s;->isSingle:Z

    return v0
.end method
