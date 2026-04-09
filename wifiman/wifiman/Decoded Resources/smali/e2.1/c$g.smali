.class public final enum Le2/c$g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "g"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Le2/c$g;

.field public static final enum FINISHED:Le2/c$g;

.field public static final enum PENDING:Le2/c$g;

.field public static final enum RUNNING:Le2/c$g;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Le2/c$g;

    const-string v1, "PENDING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Le2/c$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le2/c$g;->PENDING:Le2/c$g;

    new-instance v1, Le2/c$g;

    const-string v2, "RUNNING"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Le2/c$g;-><init>(Ljava/lang/String;I)V

    sput-object v1, Le2/c$g;->RUNNING:Le2/c$g;

    new-instance v2, Le2/c$g;

    const-string v3, "FINISHED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Le2/c$g;-><init>(Ljava/lang/String;I)V

    sput-object v2, Le2/c$g;->FINISHED:Le2/c$g;

    filled-new-array {v0, v1, v2}, [Le2/c$g;

    move-result-object v0

    sput-object v0, Le2/c$g;->$VALUES:[Le2/c$g;

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

.method public static valueOf(Ljava/lang/String;)Le2/c$g;
    .locals 1

    const-class v0, Le2/c$g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le2/c$g;

    return-object p0
.end method

.method public static values()[Le2/c$g;
    .locals 1

    sget-object v0, Le2/c$g;->$VALUES:[Le2/c$g;

    invoke-virtual {v0}, [Le2/c$g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le2/c$g;

    return-object v0
.end method
