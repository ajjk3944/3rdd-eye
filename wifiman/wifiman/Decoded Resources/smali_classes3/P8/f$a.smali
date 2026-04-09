.class public final enum LP8/f$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LP8/f$a;

.field public static final enum COMPLIANCE:LP8/f$a;

.field public static final enum FW_UPDATE:LP8/f$a;

.field public static final enum STATUS:LP8/f$a;


# direct methods
.method private static final synthetic $values()[LP8/f$a;
    .locals 3

    sget-object v0, LP8/f$a;->STATUS:LP8/f$a;

    sget-object v1, LP8/f$a;->FW_UPDATE:LP8/f$a;

    sget-object v2, LP8/f$a;->COMPLIANCE:LP8/f$a;

    filled-new-array {v0, v1, v2}, [LP8/f$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LP8/f$a;

    const-string/jumbo v1, "STATUS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LP8/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LP8/f$a;->STATUS:LP8/f$a;

    new-instance v0, LP8/f$a;

    const-string/jumbo v1, "FW_UPDATE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LP8/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LP8/f$a;->FW_UPDATE:LP8/f$a;

    new-instance v0, LP8/f$a;

    const-string v1, "COMPLIANCE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LP8/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LP8/f$a;->COMPLIANCE:LP8/f$a;

    invoke-static {}, LP8/f$a;->$values()[LP8/f$a;

    move-result-object v0

    sput-object v0, LP8/f$a;->$VALUES:[LP8/f$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LP8/f$a;->$ENTRIES:Lfh/a;

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

    sget-object v0, LP8/f$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LP8/f$a;
    .locals 1

    const-class v0, LP8/f$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LP8/f$a;

    return-object p0
.end method

.method public static values()[LP8/f$a;
    .locals 1

    sget-object v0, LP8/f$a;->$VALUES:[LP8/f$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LP8/f$a;

    return-object v0
.end method
