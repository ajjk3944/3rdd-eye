.class public final enum Lka/a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lka/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lka/a$a;

.field public static final enum TICK:Lka/a$a;


# direct methods
.method private static final synthetic $values()[Lka/a$a;
    .locals 1

    sget-object v0, Lka/a$a;->TICK:Lka/a$a;

    filled-new-array {v0}, [Lka/a$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lka/a$a;

    const-string/jumbo v1, "TICK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lka/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lka/a$a;->TICK:Lka/a$a;

    invoke-static {}, Lka/a$a;->$values()[Lka/a$a;

    move-result-object v0

    sput-object v0, Lka/a$a;->$VALUES:[Lka/a$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lka/a$a;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lka/a$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lka/a$a;
    .locals 1

    const-class v0, Lka/a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lka/a$a;

    return-object p0
.end method

.method public static values()[Lka/a$a;
    .locals 1

    sget-object v0, Lka/a$a;->$VALUES:[Lka/a$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lka/a$a;

    return-object v0
.end method
