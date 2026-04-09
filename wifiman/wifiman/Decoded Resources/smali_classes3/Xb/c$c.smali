.class public final enum LXb/c$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXb/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LXb/c$c;

.field public static final enum INTERNET:LXb/c$c;

.field public static final enum INTERNET_ISP:LXb/c$c;

.field public static final enum LOCAL_SERVER:LXb/c$c;

.field public static final enum WIFIMAN_APP:LXb/c$c;


# direct methods
.method private static final synthetic $values()[LXb/c$c;
    .locals 4

    sget-object v0, LXb/c$c;->INTERNET:LXb/c$c;

    sget-object v1, LXb/c$c;->INTERNET_ISP:LXb/c$c;

    sget-object v2, LXb/c$c;->LOCAL_SERVER:LXb/c$c;

    sget-object v3, LXb/c$c;->WIFIMAN_APP:LXb/c$c;

    filled-new-array {v0, v1, v2, v3}, [LXb/c$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LXb/c$c;

    const-string/jumbo v1, "INTERNET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LXb/c$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LXb/c$c;->INTERNET:LXb/c$c;

    new-instance v0, LXb/c$c;

    const-string/jumbo v1, "INTERNET_ISP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LXb/c$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LXb/c$c;->INTERNET_ISP:LXb/c$c;

    new-instance v0, LXb/c$c;

    const-string/jumbo v1, "LOCAL_SERVER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LXb/c$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LXb/c$c;->LOCAL_SERVER:LXb/c$c;

    new-instance v0, LXb/c$c;

    const-string/jumbo v1, "WIFIMAN_APP"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LXb/c$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LXb/c$c;->WIFIMAN_APP:LXb/c$c;

    invoke-static {}, LXb/c$c;->$values()[LXb/c$c;

    move-result-object v0

    sput-object v0, LXb/c$c;->$VALUES:[LXb/c$c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LXb/c$c;->$ENTRIES:Lfh/a;

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

    sget-object v0, LXb/c$c;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LXb/c$c;
    .locals 1

    const-class v0, LXb/c$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LXb/c$c;

    return-object p0
.end method

.method public static values()[LXb/c$c;
    .locals 1

    sget-object v0, LXb/c$c;->$VALUES:[LXb/c$c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LXb/c$c;

    return-object v0
.end method
