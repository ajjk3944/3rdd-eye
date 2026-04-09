.class public final enum LJa/a$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJa/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field private static final synthetic $VALUES:[LJa/a$c;

.field public static final enum ACTIVE:LJa/a$c;

.field public static final enum IDLE:LJa/a$c;

.field public static final enum OFF:LJa/a$c;

.field public static final enum STARTING:LJa/a$c;


# direct methods
.method private static final synthetic $values()[LJa/a$c;
    .locals 4

    sget-object v0, LJa/a$c;->OFF:LJa/a$c;

    sget-object v1, LJa/a$c;->STARTING:LJa/a$c;

    sget-object v2, LJa/a$c;->IDLE:LJa/a$c;

    sget-object v3, LJa/a$c;->ACTIVE:LJa/a$c;

    filled-new-array {v0, v1, v2, v3}, [LJa/a$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LJa/a$c;

    const-string/jumbo v1, "OFF"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LJa/a$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LJa/a$c;->OFF:LJa/a$c;

    new-instance v0, LJa/a$c;

    const-string/jumbo v1, "STARTING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LJa/a$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LJa/a$c;->STARTING:LJa/a$c;

    new-instance v0, LJa/a$c;

    const-string/jumbo v1, "IDLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LJa/a$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LJa/a$c;->IDLE:LJa/a$c;

    new-instance v0, LJa/a$c;

    const-string v1, "ACTIVE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LJa/a$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LJa/a$c;->ACTIVE:LJa/a$c;

    invoke-static {}, LJa/a$c;->$values()[LJa/a$c;

    move-result-object v0

    sput-object v0, LJa/a$c;->$VALUES:[LJa/a$c;

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

.method public static valueOf(Ljava/lang/String;)LJa/a$c;
    .locals 1

    const-class v0, LJa/a$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LJa/a$c;

    return-object p0
.end method

.method public static values()[LJa/a$c;
    .locals 1

    sget-object v0, LJa/a$c;->$VALUES:[LJa/a$c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LJa/a$c;

    return-object v0
.end method
