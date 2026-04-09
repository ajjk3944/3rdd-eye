.class public final enum LLg/n$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLg/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation


# static fields
.field private static final synthetic $VALUES:[LLg/n$d;

.field public static final enum HOST:LLg/n$d;

.field public static final enum SERVICE:LLg/n$d;


# direct methods
.method private static synthetic $values()[LLg/n$d;
    .locals 2

    sget-object v0, LLg/n$d;->HOST:LLg/n$d;

    sget-object v1, LLg/n$d;->SERVICE:LLg/n$d;

    filled-new-array {v0, v1}, [LLg/n$d;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LLg/n$d;

    const-string v1, "HOST"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LLg/n$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LLg/n$d;->HOST:LLg/n$d;

    new-instance v0, LLg/n$d;

    const-string v1, "SERVICE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LLg/n$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LLg/n$d;->SERVICE:LLg/n$d;

    invoke-static {}, LLg/n$d;->$values()[LLg/n$d;

    move-result-object v0

    sput-object v0, LLg/n$d;->$VALUES:[LLg/n$d;

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

.method public static valueOf(Ljava/lang/String;)LLg/n$d;
    .locals 1

    const-class v0, LLg/n$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LLg/n$d;

    return-object p0
.end method

.method public static values()[LLg/n$d;
    .locals 1

    sget-object v0, LLg/n$d;->$VALUES:[LLg/n$d;

    invoke-virtual {v0}, [LLg/n$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LLg/n$d;

    return-object v0
.end method
