.class public final enum LTb/a$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LTb/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LTb/a$b;

.field public static final enum CHANNEL_HEALTH:LTb/a$b;

.field public static final enum NETWORKS:LTb/a$b;


# direct methods
.method private static final synthetic $values()[LTb/a$b;
    .locals 2

    sget-object v0, LTb/a$b;->NETWORKS:LTb/a$b;

    sget-object v1, LTb/a$b;->CHANNEL_HEALTH:LTb/a$b;

    filled-new-array {v0, v1}, [LTb/a$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LTb/a$b;

    const-string/jumbo v1, "NETWORKS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LTb/a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LTb/a$b;->NETWORKS:LTb/a$b;

    new-instance v0, LTb/a$b;

    const-string v1, "CHANNEL_HEALTH"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LTb/a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LTb/a$b;->CHANNEL_HEALTH:LTb/a$b;

    invoke-static {}, LTb/a$b;->$values()[LTb/a$b;

    move-result-object v0

    sput-object v0, LTb/a$b;->$VALUES:[LTb/a$b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LTb/a$b;->$ENTRIES:Lfh/a;

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

    sget-object v0, LTb/a$b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LTb/a$b;
    .locals 1

    const-class v0, LTb/a$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LTb/a$b;

    return-object p0
.end method

.method public static values()[LTb/a$b;
    .locals 1

    sget-object v0, LTb/a$b;->$VALUES:[LTb/a$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LTb/a$b;

    return-object v0
.end method
