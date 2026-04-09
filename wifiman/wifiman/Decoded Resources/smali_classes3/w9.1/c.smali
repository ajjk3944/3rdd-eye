.class public final enum Lw9/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lw9/c;

.field public static final enum CLEAR:Lw9/c;

.field public static final enum DEFAULT:Lw9/c;


# direct methods
.method private static final synthetic $values()[Lw9/c;
    .locals 2

    sget-object v0, Lw9/c;->DEFAULT:Lw9/c;

    sget-object v1, Lw9/c;->CLEAR:Lw9/c;

    filled-new-array {v0, v1}, [Lw9/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lw9/c;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lw9/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw9/c;->DEFAULT:Lw9/c;

    new-instance v0, Lw9/c;

    const-string v1, "CLEAR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lw9/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw9/c;->CLEAR:Lw9/c;

    invoke-static {}, Lw9/c;->$values()[Lw9/c;

    move-result-object v0

    sput-object v0, Lw9/c;->$VALUES:[Lw9/c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lw9/c;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lw9/c;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lw9/c;
    .locals 1

    const-class v0, Lw9/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw9/c;

    return-object p0
.end method

.method public static values()[Lw9/c;
    .locals 1

    sget-object v0, Lw9/c;->$VALUES:[Lw9/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw9/c;

    return-object v0
.end method
