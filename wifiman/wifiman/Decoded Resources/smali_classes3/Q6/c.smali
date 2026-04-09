.class public final enum LQ6/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[LQ6/c;

.field public static final enum CALLBACK_TYPE_ALL_MATCHES:LQ6/c;

.field public static final enum CALLBACK_TYPE_BATCH:LQ6/c;

.field public static final enum CALLBACK_TYPE_FIRST_MATCH:LQ6/c;

.field public static final enum CALLBACK_TYPE_MATCH_LOST:LQ6/c;

.field public static final enum CALLBACK_TYPE_UNKNOWN:LQ6/c;

.field public static final enum CALLBACK_TYPE_UNSPECIFIED:LQ6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, LQ6/c;

    const-string v1, "CALLBACK_TYPE_ALL_MATCHES"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LQ6/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LQ6/c;->CALLBACK_TYPE_ALL_MATCHES:LQ6/c;

    new-instance v1, LQ6/c;

    const-string v2, "CALLBACK_TYPE_FIRST_MATCH"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, LQ6/c;-><init>(Ljava/lang/String;I)V

    sput-object v1, LQ6/c;->CALLBACK_TYPE_FIRST_MATCH:LQ6/c;

    new-instance v2, LQ6/c;

    const-string v3, "CALLBACK_TYPE_MATCH_LOST"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, LQ6/c;-><init>(Ljava/lang/String;I)V

    sput-object v2, LQ6/c;->CALLBACK_TYPE_MATCH_LOST:LQ6/c;

    new-instance v3, LQ6/c;

    const-string v4, "CALLBACK_TYPE_BATCH"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, LQ6/c;-><init>(Ljava/lang/String;I)V

    sput-object v3, LQ6/c;->CALLBACK_TYPE_BATCH:LQ6/c;

    new-instance v4, LQ6/c;

    const-string v5, "CALLBACK_TYPE_UNSPECIFIED"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, LQ6/c;-><init>(Ljava/lang/String;I)V

    sput-object v4, LQ6/c;->CALLBACK_TYPE_UNSPECIFIED:LQ6/c;

    new-instance v5, LQ6/c;

    const-string v6, "CALLBACK_TYPE_UNKNOWN"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, LQ6/c;-><init>(Ljava/lang/String;I)V

    sput-object v5, LQ6/c;->CALLBACK_TYPE_UNKNOWN:LQ6/c;

    filled-new-array/range {v0 .. v5}, [LQ6/c;

    move-result-object v0

    sput-object v0, LQ6/c;->$VALUES:[LQ6/c;

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

.method public static valueOf(Ljava/lang/String;)LQ6/c;
    .locals 1

    const-class v0, LQ6/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LQ6/c;

    return-object p0
.end method

.method public static values()[LQ6/c;
    .locals 1

    sget-object v0, LQ6/c;->$VALUES:[LQ6/c;

    invoke-virtual {v0}, [LQ6/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LQ6/c;

    return-object v0
.end method
