.class public final enum Lw9/l;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lw9/l;

.field public static final enum Alert:Lw9/l;

.field public static final enum Default:Lw9/l;


# direct methods
.method private static final synthetic $values()[Lw9/l;
    .locals 2

    sget-object v0, Lw9/l;->Default:Lw9/l;

    sget-object v1, Lw9/l;->Alert:Lw9/l;

    filled-new-array {v0, v1}, [Lw9/l;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lw9/l;

    const-string v1, "Default"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lw9/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw9/l;->Default:Lw9/l;

    new-instance v0, Lw9/l;

    const-string v1, "Alert"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lw9/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw9/l;->Alert:Lw9/l;

    invoke-static {}, Lw9/l;->$values()[Lw9/l;

    move-result-object v0

    sput-object v0, Lw9/l;->$VALUES:[Lw9/l;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lw9/l;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lw9/l;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lw9/l;
    .locals 1

    const-class v0, Lw9/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw9/l;

    return-object p0
.end method

.method public static values()[Lw9/l;
    .locals 1

    sget-object v0, Lw9/l;->$VALUES:[Lw9/l;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw9/l;

    return-object v0
.end method
