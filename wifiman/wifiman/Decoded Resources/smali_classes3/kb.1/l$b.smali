.class public final enum Lkb/l$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkb/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkb/l$b$a;
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lkb/l$b;

.field public static final enum BINARY:Lkb/l$b;

.field public static final Companion:Lkb/l$b$a;

.field public static final enum INVALID:Lkb/l$b;

.field public static final enum JSON:Lkb/l$b;

.field public static final enum STRING:Lkb/l$b;


# instance fields
.field private final value:B


# direct methods
.method private static final synthetic $values()[Lkb/l$b;
    .locals 4

    sget-object v0, Lkb/l$b;->INVALID:Lkb/l$b;

    sget-object v1, Lkb/l$b;->JSON:Lkb/l$b;

    sget-object v2, Lkb/l$b;->STRING:Lkb/l$b;

    sget-object v3, Lkb/l$b;->BINARY:Lkb/l$b;

    filled-new-array {v0, v1, v2, v3}, [Lkb/l$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lkb/l$b;

    const-string/jumbo v1, "INVALID"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lkb/l$b;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lkb/l$b;->INVALID:Lkb/l$b;

    new-instance v0, Lkb/l$b;

    const-string/jumbo v1, "JSON"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lkb/l$b;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lkb/l$b;->JSON:Lkb/l$b;

    new-instance v0, Lkb/l$b;

    const-string/jumbo v1, "STRING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lkb/l$b;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lkb/l$b;->STRING:Lkb/l$b;

    new-instance v0, Lkb/l$b;

    const-string v1, "BINARY"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lkb/l$b;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lkb/l$b;->BINARY:Lkb/l$b;

    invoke-static {}, Lkb/l$b;->$values()[Lkb/l$b;

    move-result-object v0

    sput-object v0, Lkb/l$b;->$VALUES:[Lkb/l$b;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lkb/l$b;->$ENTRIES:Lfh/a;

    new-instance v0, Lkb/l$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkb/l$b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkb/l$b;->Companion:Lkb/l$b$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IB)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-byte p3, p0, Lkb/l$b;->value:B

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

    sget-object v0, Lkb/l$b;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lkb/l$b;
    .locals 1

    const-class v0, Lkb/l$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkb/l$b;

    return-object p0
.end method

.method public static values()[Lkb/l$b;
    .locals 1

    sget-object v0, Lkb/l$b;->$VALUES:[Lkb/l$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkb/l$b;

    return-object v0
.end method


# virtual methods
.method public final getValue()B
    .locals 1

    iget-byte v0, p0, Lkb/l$b;->value:B

    return v0
.end method
