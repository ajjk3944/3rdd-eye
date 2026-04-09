.class public final enum LYb/a$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYb/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYb/a$b$a;
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LYb/a$b;

.field public static final enum AUTO:LYb/a$b;

.field public static final enum ISP:LYb/a$b;

.field public static final enum MANUAL:LYb/a$b;


# direct methods
.method private static final synthetic $values()[LYb/a$b;
    .locals 3

    sget-object v0, LYb/a$b;->AUTO:LYb/a$b;

    sget-object v1, LYb/a$b;->MANUAL:LYb/a$b;

    sget-object v2, LYb/a$b;->ISP:LYb/a$b;

    filled-new-array {v0, v1, v2}, [LYb/a$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LYb/a$b;

    const-string v1, "AUTO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LYb/a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LYb/a$b;->AUTO:LYb/a$b;

    new-instance v0, LYb/a$b;

    const-string/jumbo v1, "MANUAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LYb/a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LYb/a$b;->MANUAL:LYb/a$b;

    new-instance v0, LYb/a$b;

    const-string/jumbo v1, "ISP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LYb/a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LYb/a$b;->ISP:LYb/a$b;

    invoke-static {}, LYb/a$b;->$values()[LYb/a$b;

    move-result-object v0

    sput-object v0, LYb/a$b;->$VALUES:[LYb/a$b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LYb/a$b;->$ENTRIES:Lfh/a;

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

.method public static getEntries()Lfh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfh/a;"
        }
    .end annotation

    sget-object v0, LYb/a$b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LYb/a$b;
    .locals 1

    const-class v0, LYb/a$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LYb/a$b;

    return-object p0
.end method

.method public static values()[LYb/a$b;
    .locals 1

    sget-object v0, LYb/a$b;->$VALUES:[LYb/a$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LYb/a$b;

    return-object v0
.end method


# virtual methods
.method public final getDbId()Ljava/lang/String;
    .locals 2

    sget-object v0, LYb/a$b$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const-string/jumbo v0, "isp"

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    const-string/jumbo v0, "man"

    goto :goto_0

    :cond_2
    const-string/jumbo v0, "auto"

    :goto_0
    return-object v0
.end method
