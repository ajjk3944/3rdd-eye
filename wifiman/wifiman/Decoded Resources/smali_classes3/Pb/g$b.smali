.class public final enum LPb/g$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LPb/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LPb/g$b;

.field public static final enum MAC:LPb/g$b;

.field public static final enum NAME:LPb/g$b;

.field public static final enum SIGNAL:LPb/g$b;


# direct methods
.method private static final synthetic $values()[LPb/g$b;
    .locals 3

    sget-object v0, LPb/g$b;->NAME:LPb/g$b;

    sget-object v1, LPb/g$b;->SIGNAL:LPb/g$b;

    sget-object v2, LPb/g$b;->MAC:LPb/g$b;

    filled-new-array {v0, v1, v2}, [LPb/g$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LPb/g$b;

    const-string/jumbo v1, "NAME"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LPb/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LPb/g$b;->NAME:LPb/g$b;

    new-instance v0, LPb/g$b;

    const-string/jumbo v1, "SIGNAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LPb/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LPb/g$b;->SIGNAL:LPb/g$b;

    new-instance v0, LPb/g$b;

    const-string/jumbo v1, "MAC"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LPb/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LPb/g$b;->MAC:LPb/g$b;

    invoke-static {}, LPb/g$b;->$values()[LPb/g$b;

    move-result-object v0

    sput-object v0, LPb/g$b;->$VALUES:[LPb/g$b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LPb/g$b;->$ENTRIES:Lfh/a;

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

    sget-object v0, LPb/g$b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LPb/g$b;
    .locals 1

    const-class v0, LPb/g$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LPb/g$b;

    return-object p0
.end method

.method public static values()[LPb/g$b;
    .locals 1

    sget-object v0, LPb/g$b;->$VALUES:[LPb/g$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LPb/g$b;

    return-object v0
.end method
