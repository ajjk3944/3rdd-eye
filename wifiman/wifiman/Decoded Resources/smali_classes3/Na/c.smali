.class public final enum LNa/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LNa/c;

.field public static final enum ANDROID:LNa/c;

.field public static final enum LOCAL:LNa/c;


# direct methods
.method private static final synthetic $values()[LNa/c;
    .locals 2

    sget-object v0, LNa/c;->ANDROID:LNa/c;

    sget-object v1, LNa/c;->LOCAL:LNa/c;

    filled-new-array {v0, v1}, [LNa/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LNa/c;

    const-string v1, "ANDROID"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LNa/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LNa/c;->ANDROID:LNa/c;

    new-instance v0, LNa/c;

    const-string/jumbo v1, "LOCAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LNa/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LNa/c;->LOCAL:LNa/c;

    invoke-static {}, LNa/c;->$values()[LNa/c;

    move-result-object v0

    sput-object v0, LNa/c;->$VALUES:[LNa/c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LNa/c;->$ENTRIES:Lfh/a;

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

    sget-object v0, LNa/c;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LNa/c;
    .locals 1

    const-class v0, LNa/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LNa/c;

    return-object p0
.end method

.method public static values()[LNa/c;
    .locals 1

    sget-object v0, LNa/c;->$VALUES:[LNa/c;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LNa/c;

    return-object v0
.end method
