.class final enum LSh/e$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSh/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "c"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LSh/e$c;

.field public static final enum BACKING_FIELD:LSh/e$c;

.field public static final enum DELEGATE_FIELD:LSh/e$c;

.field public static final enum PROPERTY:LSh/e$c;


# direct methods
.method private static final synthetic $values()[LSh/e$c;
    .locals 3

    sget-object v0, LSh/e$c;->PROPERTY:LSh/e$c;

    sget-object v1, LSh/e$c;->BACKING_FIELD:LSh/e$c;

    sget-object v2, LSh/e$c;->DELEGATE_FIELD:LSh/e$c;

    filled-new-array {v0, v1, v2}, [LSh/e$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LSh/e$c;

    const-string v1, "PROPERTY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LSh/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LSh/e$c;->PROPERTY:LSh/e$c;

    new-instance v0, LSh/e$c;

    const-string v1, "BACKING_FIELD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LSh/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LSh/e$c;->BACKING_FIELD:LSh/e$c;

    new-instance v0, LSh/e$c;

    const-string v1, "DELEGATE_FIELD"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LSh/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, LSh/e$c;->DELEGATE_FIELD:LSh/e$c;

    invoke-static {}, LSh/e$c;->$values()[LSh/e$c;

    move-result-object v0

    sput-object v0, LSh/e$c;->$VALUES:[LSh/e$c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LSh/e$c;->$ENTRIES:Lfh/a;

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

.method public static valueOf(Ljava/lang/String;)LSh/e$c;
    .locals 1

    const-class v0, LSh/e$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LSh/e$c;

    return-object p0
.end method

.method public static values()[LSh/e$c;
    .locals 1

    sget-object v0, LSh/e$c;->$VALUES:[LSh/e$c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LSh/e$c;

    return-object v0
.end method
