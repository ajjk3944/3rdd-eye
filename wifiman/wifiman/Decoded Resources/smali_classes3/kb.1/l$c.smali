.class public final enum Lkb/l$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkb/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkb/l$c$a;
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lkb/l$c;

.field public static final enum BODY:Lkb/l$c;

.field public static final Companion:Lkb/l$c$a;

.field public static final enum HEADER:Lkb/l$c;

.field public static final enum INVALID:Lkb/l$c;


# instance fields
.field private final value:B


# direct methods
.method private static final synthetic $values()[Lkb/l$c;
    .locals 3

    sget-object v0, Lkb/l$c;->INVALID:Lkb/l$c;

    sget-object v1, Lkb/l$c;->HEADER:Lkb/l$c;

    sget-object v2, Lkb/l$c;->BODY:Lkb/l$c;

    filled-new-array {v0, v1, v2}, [Lkb/l$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lkb/l$c;

    const-string/jumbo v1, "INVALID"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lkb/l$c;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lkb/l$c;->INVALID:Lkb/l$c;

    new-instance v0, Lkb/l$c;

    const-string/jumbo v1, "HEADER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lkb/l$c;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lkb/l$c;->HEADER:Lkb/l$c;

    new-instance v0, Lkb/l$c;

    const-string v1, "BODY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lkb/l$c;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lkb/l$c;->BODY:Lkb/l$c;

    invoke-static {}, Lkb/l$c;->$values()[Lkb/l$c;

    move-result-object v0

    sput-object v0, Lkb/l$c;->$VALUES:[Lkb/l$c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lkb/l$c;->$ENTRIES:Lfh/a;

    new-instance v0, Lkb/l$c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkb/l$c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkb/l$c;->Companion:Lkb/l$c$a;

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

    iput-byte p3, p0, Lkb/l$c;->value:B

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

    sget-object v0, Lkb/l$c;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lkb/l$c;
    .locals 1

    const-class v0, Lkb/l$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkb/l$c;

    return-object p0
.end method

.method public static values()[Lkb/l$c;
    .locals 1

    sget-object v0, Lkb/l$c;->$VALUES:[Lkb/l$c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkb/l$c;

    return-object v0
.end method


# virtual methods
.method public final getValue()B
    .locals 1

    iget-byte v0, p0, Lkb/l$c;->value:B

    return v0
.end method
