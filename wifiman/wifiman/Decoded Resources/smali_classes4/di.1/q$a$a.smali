.class final enum Ldi/q$a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldi/q$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Ldi/q$a$a;

.field public static final enum COMMON_SUPER_TYPE:Ldi/q$a$a;

.field public static final enum INTERSECTION_TYPE:Ldi/q$a$a;


# direct methods
.method private static final synthetic $values()[Ldi/q$a$a;
    .locals 2

    sget-object v0, Ldi/q$a$a;->COMMON_SUPER_TYPE:Ldi/q$a$a;

    sget-object v1, Ldi/q$a$a;->INTERSECTION_TYPE:Ldi/q$a$a;

    filled-new-array {v0, v1}, [Ldi/q$a$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ldi/q$a$a;

    const-string v1, "COMMON_SUPER_TYPE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ldi/q$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldi/q$a$a;->COMMON_SUPER_TYPE:Ldi/q$a$a;

    new-instance v0, Ldi/q$a$a;

    const-string v1, "INTERSECTION_TYPE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ldi/q$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldi/q$a$a;->INTERSECTION_TYPE:Ldi/q$a$a;

    invoke-static {}, Ldi/q$a$a;->$values()[Ldi/q$a$a;

    move-result-object v0

    sput-object v0, Ldi/q$a$a;->$VALUES:[Ldi/q$a$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Ldi/q$a$a;->$ENTRIES:Lfh/a;

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

.method public static valueOf(Ljava/lang/String;)Ldi/q$a$a;
    .locals 1

    const-class v0, Ldi/q$a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldi/q$a$a;

    return-object p0
.end method

.method public static values()[Ldi/q$a$a;
    .locals 1

    sget-object v0, Ldi/q$a$a;->$VALUES:[Ldi/q$a$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldi/q$a$a;

    return-object v0
.end method
