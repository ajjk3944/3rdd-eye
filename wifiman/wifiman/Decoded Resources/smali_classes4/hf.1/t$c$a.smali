.class public final enum Lhf/t$c$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhf/t$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lhf/t$c$a;

.field public static final enum COMPLETE:Lhf/t$c$a;

.field public static final enum DOWN:Lhf/t$c$a;

.field public static final enum IDLE:Lhf/t$c$a;

.field public static final enum UP:Lhf/t$c$a;


# direct methods
.method private static final synthetic $values()[Lhf/t$c$a;
    .locals 4

    sget-object v0, Lhf/t$c$a;->IDLE:Lhf/t$c$a;

    sget-object v1, Lhf/t$c$a;->DOWN:Lhf/t$c$a;

    sget-object v2, Lhf/t$c$a;->UP:Lhf/t$c$a;

    sget-object v3, Lhf/t$c$a;->COMPLETE:Lhf/t$c$a;

    filled-new-array {v0, v1, v2, v3}, [Lhf/t$c$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lhf/t$c$a;

    const-string v1, "IDLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhf/t$c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhf/t$c$a;->IDLE:Lhf/t$c$a;

    new-instance v0, Lhf/t$c$a;

    const-string v1, "DOWN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lhf/t$c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhf/t$c$a;->DOWN:Lhf/t$c$a;

    new-instance v0, Lhf/t$c$a;

    const-string v1, "UP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lhf/t$c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhf/t$c$a;->UP:Lhf/t$c$a;

    new-instance v0, Lhf/t$c$a;

    const-string v1, "COMPLETE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lhf/t$c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhf/t$c$a;->COMPLETE:Lhf/t$c$a;

    invoke-static {}, Lhf/t$c$a;->$values()[Lhf/t$c$a;

    move-result-object v0

    sput-object v0, Lhf/t$c$a;->$VALUES:[Lhf/t$c$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lhf/t$c$a;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lhf/t$c$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lhf/t$c$a;
    .locals 1

    const-class v0, Lhf/t$c$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhf/t$c$a;

    return-object p0
.end method

.method public static values()[Lhf/t$c$a;
    .locals 1

    sget-object v0, Lhf/t$c$a;->$VALUES:[Lhf/t$c$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhf/t$c$a;

    return-object v0
.end method
