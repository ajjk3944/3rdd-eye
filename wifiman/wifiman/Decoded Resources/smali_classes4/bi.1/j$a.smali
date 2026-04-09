.class public final enum Lbi/j$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbi/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lbi/j$a;

.field public static final enum BOTH:Lbi/j$a;

.field public static final enum CONFLICTS_ONLY:Lbi/j$a;

.field public static final enum SUCCESS_ONLY:Lbi/j$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lbi/j$a;

    const-string v1, "CONFLICTS_ONLY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lbi/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbi/j$a;->CONFLICTS_ONLY:Lbi/j$a;

    new-instance v1, Lbi/j$a;

    const-string v2, "SUCCESS_ONLY"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lbi/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lbi/j$a;->SUCCESS_ONLY:Lbi/j$a;

    new-instance v2, Lbi/j$a;

    const-string v3, "BOTH"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lbi/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lbi/j$a;->BOTH:Lbi/j$a;

    filled-new-array {v0, v1, v2}, [Lbi/j$a;

    move-result-object v0

    sput-object v0, Lbi/j$a;->$VALUES:[Lbi/j$a;

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

.method public static valueOf(Ljava/lang/String;)Lbi/j$a;
    .locals 1

    const-class v0, Lbi/j$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbi/j$a;

    return-object p0
.end method

.method public static values()[Lbi/j$a;
    .locals 1

    sget-object v0, Lbi/j$a;->$VALUES:[Lbi/j$a;

    invoke-virtual {v0}, [Lbi/j$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbi/j$a;

    return-object v0
.end method
