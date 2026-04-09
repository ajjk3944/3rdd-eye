.class public final enum LWb/e$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LWb/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LWb/e$c;

.field public static final enum CELLULAR:LWb/e$c;

.field public static final enum WIFI:LWb/e$c;


# direct methods
.method private static final synthetic $values()[LWb/e$c;
    .locals 2

    sget-object v0, LWb/e$c;->WIFI:LWb/e$c;

    sget-object v1, LWb/e$c;->CELLULAR:LWb/e$c;

    filled-new-array {v0, v1}, [LWb/e$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LWb/e$c;

    const-string/jumbo v1, "WIFI"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LWb/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LWb/e$c;->WIFI:LWb/e$c;

    new-instance v0, LWb/e$c;

    const-string v1, "CELLULAR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LWb/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LWb/e$c;->CELLULAR:LWb/e$c;

    invoke-static {}, LWb/e$c;->$values()[LWb/e$c;

    move-result-object v0

    sput-object v0, LWb/e$c;->$VALUES:[LWb/e$c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LWb/e$c;->$ENTRIES:Lfh/a;

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

    sget-object v0, LWb/e$c;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LWb/e$c;
    .locals 1

    const-class v0, LWb/e$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LWb/e$c;

    return-object p0
.end method

.method public static values()[LWb/e$c;
    .locals 1

    sget-object v0, LWb/e$c;->$VALUES:[LWb/e$c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LWb/e$c;

    return-object v0
.end method
