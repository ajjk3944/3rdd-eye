.class public final enum LPb/i$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LPb/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LPb/i$b;

.field public static final enum IP:LPb/i$b;

.field public static final enum NAME:LPb/i$b;


# direct methods
.method private static final synthetic $values()[LPb/i$b;
    .locals 2

    sget-object v0, LPb/i$b;->NAME:LPb/i$b;

    sget-object v1, LPb/i$b;->IP:LPb/i$b;

    filled-new-array {v0, v1}, [LPb/i$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LPb/i$b;

    const-string/jumbo v1, "NAME"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LPb/i$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LPb/i$b;->NAME:LPb/i$b;

    new-instance v0, LPb/i$b;

    const-string/jumbo v1, "IP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LPb/i$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LPb/i$b;->IP:LPb/i$b;

    invoke-static {}, LPb/i$b;->$values()[LPb/i$b;

    move-result-object v0

    sput-object v0, LPb/i$b;->$VALUES:[LPb/i$b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LPb/i$b;->$ENTRIES:Lfh/a;

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

    sget-object v0, LPb/i$b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LPb/i$b;
    .locals 1

    const-class v0, LPb/i$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LPb/i$b;

    return-object p0
.end method

.method public static values()[LPb/i$b;
    .locals 1

    sget-object v0, LPb/i$b;->$VALUES:[LPb/i$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LPb/i$b;

    return-object v0
.end method
