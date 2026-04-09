.class public final enum LYd/e$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYd/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LYd/e$a;

.field public static final enum INTERNET:LYd/e$a;

.field public static final enum LOCAL_DEVICE:LYd/e$a;


# instance fields
.field private final apiId:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[LYd/e$a;
    .locals 2

    sget-object v0, LYd/e$a;->INTERNET:LYd/e$a;

    sget-object v1, LYd/e$a;->LOCAL_DEVICE:LYd/e$a;

    filled-new-array {v0, v1}, [LYd/e$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LYd/e$a;

    const-string v1, "INTERNET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, LYd/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LYd/e$a;->INTERNET:LYd/e$a;

    new-instance v0, LYd/e$a;

    const-string v1, "LOCAL_DEVICE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, LYd/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LYd/e$a;->LOCAL_DEVICE:LYd/e$a;

    invoke-static {}, LYd/e$a;->$values()[LYd/e$a;

    move-result-object v0

    sput-object v0, LYd/e$a;->$VALUES:[LYd/e$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LYd/e$a;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LYd/e$a;->apiId:Ljava/lang/String;

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

    sget-object v0, LYd/e$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LYd/e$a;
    .locals 1

    const-class v0, LYd/e$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LYd/e$a;

    return-object p0
.end method

.method public static values()[LYd/e$a;
    .locals 1

    sget-object v0, LYd/e$a;->$VALUES:[LYd/e$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LYd/e$a;

    return-object v0
.end method


# virtual methods
.method public final getApiId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYd/e$a;->apiId:Ljava/lang/String;

    return-object v0
.end method
