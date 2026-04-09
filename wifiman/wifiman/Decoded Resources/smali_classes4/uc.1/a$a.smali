.class public final enum Luc/a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luc/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Luc/a$a;

.field public static final enum TICK:Luc/a$a;


# direct methods
.method private static final synthetic $values()[Luc/a$a;
    .locals 1

    sget-object v0, Luc/a$a;->TICK:Luc/a$a;

    filled-new-array {v0}, [Luc/a$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Luc/a$a;

    const-string v1, "TICK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Luc/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Luc/a$a;->TICK:Luc/a$a;

    invoke-static {}, Luc/a$a;->$values()[Luc/a$a;

    move-result-object v0

    sput-object v0, Luc/a$a;->$VALUES:[Luc/a$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Luc/a$a;->$ENTRIES:Lfh/a;

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

    sget-object v0, Luc/a$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Luc/a$a;
    .locals 1

    const-class v0, Luc/a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Luc/a$a;

    return-object p0
.end method

.method public static values()[Luc/a$a;
    .locals 1

    sget-object v0, Luc/a$a;->$VALUES:[Luc/a$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Luc/a$a;

    return-object v0
.end method
