.class public final enum Lu9/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lu9/d;

.field public static final enum MFA:Lu9/d;

.field public static final enum RECOVERY:Lu9/d;


# instance fields
.field private final params:Lu9/c;


# direct methods
.method private static final synthetic $values()[Lu9/d;
    .locals 2

    sget-object v0, Lu9/d;->MFA:Lu9/d;

    sget-object v1, Lu9/d;->RECOVERY:Lu9/d;

    filled-new-array {v0, v1}, [Lu9/d;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lu9/d;

    new-instance v1, Lu9/c;

    new-instance v2, Lu9/b;

    const/4 v8, 0x1

    invoke-direct {v2, v8}, Lu9/b;-><init>(I)V

    new-instance v3, Lu9/b;

    invoke-direct {v3, v8}, Lu9/b;-><init>(I)V

    new-instance v4, Lu9/b;

    invoke-direct {v4, v8}, Lu9/b;-><init>(I)V

    new-instance v5, Lu9/b;

    invoke-direct {v5, v8}, Lu9/b;-><init>(I)V

    new-instance v6, Lu9/b;

    invoke-direct {v6, v8}, Lu9/b;-><init>(I)V

    new-instance v7, Lu9/b;

    invoke-direct {v7, v8}, Lu9/b;-><init>(I)V

    filled-new-array/range {v2 .. v7}, [Lu9/b;

    move-result-object v2

    invoke-static {v2}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v3, ""

    invoke-direct {v1, v2, v3}, Lu9/c;-><init>(Ljava/util/List;Ljava/lang/String;)V

    const-string/jumbo v2, "MFA"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lu9/d;-><init>(Ljava/lang/String;ILu9/c;)V

    sput-object v0, Lu9/d;->MFA:Lu9/d;

    new-instance v0, Lu9/d;

    new-instance v1, Lu9/c;

    new-instance v2, Lu9/b;

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Lu9/b;-><init>(I)V

    new-instance v4, Lu9/b;

    invoke-direct {v4, v3}, Lu9/b;-><init>(I)V

    filled-new-array {v2, v4}, [Lu9/b;

    move-result-object v2

    invoke-static {v2}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v3, "-"

    invoke-direct {v1, v2, v3}, Lu9/c;-><init>(Ljava/util/List;Ljava/lang/String;)V

    const-string/jumbo v2, "RECOVERY"

    invoke-direct {v0, v2, v8, v1}, Lu9/d;-><init>(Ljava/lang/String;ILu9/c;)V

    sput-object v0, Lu9/d;->RECOVERY:Lu9/d;

    invoke-static {}, Lu9/d;->$values()[Lu9/d;

    move-result-object v0

    sput-object v0, Lu9/d;->$VALUES:[Lu9/d;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lu9/d;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILu9/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu9/c;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lu9/d;->params:Lu9/c;

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

    sget-object v0, Lu9/d;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lu9/d;
    .locals 1

    const-class v0, Lu9/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lu9/d;

    return-object p0
.end method

.method public static values()[Lu9/d;
    .locals 1

    sget-object v0, Lu9/d;->$VALUES:[Lu9/d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lu9/d;

    return-object v0
.end method


# virtual methods
.method public final getParams()Lu9/c;
    .locals 1

    iget-object v0, p0, Lu9/d;->params:Lu9/c;

    return-object v0
.end method
