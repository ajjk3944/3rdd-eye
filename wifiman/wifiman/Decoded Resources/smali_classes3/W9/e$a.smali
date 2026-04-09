.class public final enum LW9/e$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW9/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401c
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LW9/e$a;

.field public static final enum IDLE:LW9/e$a;

.field public static final enum RESENDING:LW9/e$a;

.field public static final enum SUBMITTING:LW9/e$a;


# direct methods
.method private static final synthetic $values()[LW9/e$a;
    .locals 3

    sget-object v0, LW9/e$a;->IDLE:LW9/e$a;

    sget-object v1, LW9/e$a;->SUBMITTING:LW9/e$a;

    sget-object v2, LW9/e$a;->RESENDING:LW9/e$a;

    filled-new-array {v0, v1, v2}, [LW9/e$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LW9/e$a;

    const-string/jumbo v1, "IDLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LW9/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LW9/e$a;->IDLE:LW9/e$a;

    new-instance v0, LW9/e$a;

    const-string/jumbo v1, "SUBMITTING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LW9/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LW9/e$a;->SUBMITTING:LW9/e$a;

    new-instance v0, LW9/e$a;

    const-string/jumbo v1, "RESENDING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LW9/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LW9/e$a;->RESENDING:LW9/e$a;

    invoke-static {}, LW9/e$a;->$values()[LW9/e$a;

    move-result-object v0

    sput-object v0, LW9/e$a;->$VALUES:[LW9/e$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LW9/e$a;->$ENTRIES:Lfh/a;

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

    sget-object v0, LW9/e$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LW9/e$a;
    .locals 1

    const-class v0, LW9/e$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LW9/e$a;

    return-object p0
.end method

.method public static values()[LW9/e$a;
    .locals 1

    sget-object v0, LW9/e$a;->$VALUES:[LW9/e$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LW9/e$a;

    return-object v0
.end method
