.class public final enum Lt6/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt6/c$a;
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lt6/c;

.field public static final enum Bottom:Lt6/c;

.field public static final enum Center:Lt6/c;

.field public static final enum Top:Lt6/c;


# direct methods
.method private static final synthetic $values()[Lt6/c;
    .locals 3

    sget-object v0, Lt6/c;->Top:Lt6/c;

    sget-object v1, Lt6/c;->Center:Lt6/c;

    sget-object v2, Lt6/c;->Bottom:Lt6/c;

    filled-new-array {v0, v1, v2}, [Lt6/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lt6/c;

    const-string/jumbo v1, "Top"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lt6/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lt6/c;->Top:Lt6/c;

    new-instance v0, Lt6/c;

    const-string v1, "Center"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lt6/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lt6/c;->Center:Lt6/c;

    new-instance v0, Lt6/c;

    const-string v1, "Bottom"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lt6/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lt6/c;->Bottom:Lt6/c;

    invoke-static {}, Lt6/c;->$values()[Lt6/c;

    move-result-object v0

    sput-object v0, Lt6/c;->$VALUES:[Lt6/c;

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

.method public static valueOf(Ljava/lang/String;)Lt6/c;
    .locals 1

    const-class v0, Lt6/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lt6/c;

    return-object p0
.end method

.method public static values()[Lt6/c;
    .locals 1

    sget-object v0, Lt6/c;->$VALUES:[Lt6/c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lt6/c;

    return-object v0
.end method


# virtual methods
.method public final negative()Lt6/c;
    .locals 2

    sget-object v0, Lt6/c$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    sget-object v0, Lt6/c;->Top:Lt6/c;

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    sget-object v0, Lt6/c;->Center:Lt6/c;

    goto :goto_0

    :cond_2
    sget-object v0, Lt6/c;->Bottom:Lt6/c;

    :goto_0
    return-object v0
.end method
