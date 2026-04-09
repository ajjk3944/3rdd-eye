.class public final enum LW7/f$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW7/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LW7/f$a;

.field public static final enum EXCELLENT:LW7/f$a;

.field public static final enum GOOD:LW7/f$a;

.field public static final enum POOR:LW7/f$a;


# direct methods
.method private static final synthetic $values()[LW7/f$a;
    .locals 3

    sget-object v0, LW7/f$a;->EXCELLENT:LW7/f$a;

    sget-object v1, LW7/f$a;->GOOD:LW7/f$a;

    sget-object v2, LW7/f$a;->POOR:LW7/f$a;

    filled-new-array {v0, v1, v2}, [LW7/f$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LW7/f$a;

    const-string/jumbo v1, "EXCELLENT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LW7/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LW7/f$a;->EXCELLENT:LW7/f$a;

    new-instance v0, LW7/f$a;

    const-string/jumbo v1, "GOOD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LW7/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LW7/f$a;->GOOD:LW7/f$a;

    new-instance v0, LW7/f$a;

    const-string/jumbo v1, "POOR"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LW7/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LW7/f$a;->POOR:LW7/f$a;

    invoke-static {}, LW7/f$a;->$values()[LW7/f$a;

    move-result-object v0

    sput-object v0, LW7/f$a;->$VALUES:[LW7/f$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LW7/f$a;->$ENTRIES:Lfh/a;

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

    sget-object v0, LW7/f$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LW7/f$a;
    .locals 1

    const-class v0, LW7/f$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LW7/f$a;

    return-object p0
.end method

.method public static values()[LW7/f$a;
    .locals 1

    sget-object v0, LW7/f$a;->$VALUES:[LW7/f$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LW7/f$a;

    return-object v0
.end method
