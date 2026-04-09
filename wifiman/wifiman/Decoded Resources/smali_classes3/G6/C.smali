.class public final enum LG6/C;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[LG6/C;

.field public static final enum COMPAT:LG6/C;

.field public static final enum DEFAULT:LG6/C;

.field public static final enum QUICK_SETUP:LG6/C;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, LG6/C;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LG6/C;-><init>(Ljava/lang/String;I)V

    sput-object v0, LG6/C;->DEFAULT:LG6/C;

    new-instance v1, LG6/C;

    const-string v2, "COMPAT"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, LG6/C;-><init>(Ljava/lang/String;I)V

    sput-object v1, LG6/C;->COMPAT:LG6/C;

    new-instance v2, LG6/C;

    const-string/jumbo v3, "QUICK_SETUP"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, LG6/C;-><init>(Ljava/lang/String;I)V

    sput-object v2, LG6/C;->QUICK_SETUP:LG6/C;

    filled-new-array {v0, v1, v2}, [LG6/C;

    move-result-object v0

    sput-object v0, LG6/C;->$VALUES:[LG6/C;

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

.method public static valueOf(Ljava/lang/String;)LG6/C;
    .locals 1

    const-class v0, LG6/C;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LG6/C;

    return-object p0
.end method

.method public static values()[LG6/C;
    .locals 1

    sget-object v0, LG6/C;->$VALUES:[LG6/C;

    invoke-virtual {v0}, [LG6/C;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LG6/C;

    return-object v0
.end method
