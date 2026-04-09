.class public final enum Laf/J;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Laf/J;

.field public static final enum LOCATION_ACCESS:Laf/J;

.field public static final enum PERMISSION_CELLLAR:Laf/J;

.field public static final enum PERMISSION_LOCATION:Laf/J;

.field public static final enum WIFIMAN_SUPPORT_DISABLED:Laf/J;


# instance fields
.field private final text:Ls9/d;


# direct methods
.method private static final synthetic $values()[Laf/J;
    .locals 4

    sget-object v0, Laf/J;->PERMISSION_LOCATION:Laf/J;

    sget-object v1, Laf/J;->PERMISSION_CELLLAR:Laf/J;

    sget-object v2, Laf/J;->LOCATION_ACCESS:Laf/J;

    sget-object v3, Laf/J;->WIFIMAN_SUPPORT_DISABLED:Laf/J;

    filled-new-array {v0, v1, v2, v3}, [Laf/J;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Laf/J;

    new-instance v1, Ls9/d$b;

    sget v2, Lm8/c;->I1:I

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    const-string v2, "PERMISSION_LOCATION"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Laf/J;-><init>(Ljava/lang/String;ILs9/d;)V

    sput-object v0, Laf/J;->PERMISSION_LOCATION:Laf/J;

    new-instance v0, Laf/J;

    new-instance v1, Ls9/d$b;

    sget v2, Lm8/c;->E1:I

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    const-string v2, "PERMISSION_CELLLAR"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Laf/J;-><init>(Ljava/lang/String;ILs9/d;)V

    sput-object v0, Laf/J;->PERMISSION_CELLLAR:Laf/J;

    new-instance v0, Laf/J;

    new-instance v1, Ls9/d$b;

    sget v2, Lm8/c;->H1:I

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    const-string v2, "LOCATION_ACCESS"

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3, v1}, Laf/J;-><init>(Ljava/lang/String;ILs9/d;)V

    sput-object v0, Laf/J;->LOCATION_ACCESS:Laf/J;

    new-instance v0, Laf/J;

    new-instance v1, Ls9/d$b;

    sget v2, Lm8/c;->a0:I

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    const-string v2, "WIFIMAN_SUPPORT_DISABLED"

    const/4 v3, 0x3

    invoke-direct {v0, v2, v3, v1}, Laf/J;-><init>(Ljava/lang/String;ILs9/d;)V

    sput-object v0, Laf/J;->WIFIMAN_SUPPORT_DISABLED:Laf/J;

    invoke-static {}, Laf/J;->$values()[Laf/J;

    move-result-object v0

    sput-object v0, Laf/J;->$VALUES:[Laf/J;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Laf/J;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILs9/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls9/d;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Laf/J;->text:Ls9/d;

    return-void
.end method

.method public static getEntries()Lfh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfh/a;"
        }
    .end annotation

    sget-object v0, Laf/J;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Laf/J;
    .locals 1

    const-class v0, Laf/J;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Laf/J;

    return-object p0
.end method

.method public static values()[Laf/J;
    .locals 1

    sget-object v0, Laf/J;->$VALUES:[Laf/J;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Laf/J;

    return-object v0
.end method


# virtual methods
.method public final getText()Ls9/d;
    .locals 1

    iget-object v0, p0, Laf/J;->text:Ls9/d;

    return-object v0
.end method
