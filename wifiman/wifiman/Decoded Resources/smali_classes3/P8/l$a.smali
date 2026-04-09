.class final enum LP8/l$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LP8/l$a;

.field public static final enum BLUETOOTH_ADAPTER_DISABLED:LP8/l$a;

.field public static final enum BLUETOOTH_ADAPTER_UNAVAILABLE:LP8/l$a;

.field public static final enum LOCATION_DISABLED:LP8/l$a;

.field public static final enum PERMISSIONS:LP8/l$a;


# instance fields
.field private final buttonPrimary:Ls9/d;

.field private final subtitle:Ls9/d;

.field private final title:Ls9/d;


# direct methods
.method private static final synthetic $values()[LP8/l$a;
    .locals 4

    sget-object v0, LP8/l$a;->LOCATION_DISABLED:LP8/l$a;

    sget-object v1, LP8/l$a;->PERMISSIONS:LP8/l$a;

    sget-object v2, LP8/l$a;->BLUETOOTH_ADAPTER_UNAVAILABLE:LP8/l$a;

    sget-object v3, LP8/l$a;->BLUETOOTH_ADAPTER_DISABLED:LP8/l$a;

    filled-new-array {v0, v1, v2, v3}, [LP8/l$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 13

    new-instance v6, LP8/l$a;

    new-instance v3, Ls9/d$b;

    const v0, 0x7f11045e

    invoke-direct {v3, v0}, Ls9/d$b;-><init>(I)V

    new-instance v4, Ls9/d$b;

    const v0, 0x7f11045d

    invoke-direct {v4, v0}, Ls9/d$b;-><init>(I)V

    new-instance v5, Ls9/d$b;

    const v0, 0x7f11045c

    invoke-direct {v5, v0}, Ls9/d$b;-><init>(I)V

    const-string/jumbo v1, "LOCATION_DISABLED"

    const/4 v2, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LP8/l$a;-><init>(Ljava/lang/String;ILs9/d;Ls9/d;Ls9/d;)V

    sput-object v6, LP8/l$a;->LOCATION_DISABLED:LP8/l$a;

    new-instance v0, LP8/l$a;

    new-instance v10, Ls9/d$b;

    const v1, 0x7f11045b

    invoke-direct {v10, v1}, Ls9/d$b;-><init>(I)V

    new-instance v11, Ls9/d$b;

    const v1, 0x7f11045a

    invoke-direct {v11, v1}, Ls9/d$b;-><init>(I)V

    new-instance v12, Ls9/d$b;

    const v1, 0x7f110459

    invoke-direct {v12, v1}, Ls9/d$b;-><init>(I)V

    const-string/jumbo v8, "PERMISSIONS"

    const/4 v9, 0x1

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, LP8/l$a;-><init>(Ljava/lang/String;ILs9/d;Ls9/d;Ls9/d;)V

    sput-object v0, LP8/l$a;->PERMISSIONS:LP8/l$a;

    new-instance v0, LP8/l$a;

    new-instance v4, Ls9/d$b;

    const v1, 0x7f110458

    invoke-direct {v4, v1}, Ls9/d$b;-><init>(I)V

    new-instance v5, Ls9/d$b;

    const v1, 0x7f110457

    invoke-direct {v5, v1}, Ls9/d$b;-><init>(I)V

    const/4 v6, 0x0

    const-string v2, "BLUETOOTH_ADAPTER_UNAVAILABLE"

    const/4 v3, 0x2

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LP8/l$a;-><init>(Ljava/lang/String;ILs9/d;Ls9/d;Ls9/d;)V

    sput-object v0, LP8/l$a;->BLUETOOTH_ADAPTER_UNAVAILABLE:LP8/l$a;

    new-instance v0, LP8/l$a;

    new-instance v10, Ls9/d$b;

    const v1, 0x7f110456

    invoke-direct {v10, v1}, Ls9/d$b;-><init>(I)V

    new-instance v11, Ls9/d$b;

    const v1, 0x7f110455

    invoke-direct {v11, v1}, Ls9/d$b;-><init>(I)V

    new-instance v12, Ls9/d$b;

    const v1, 0x7f110454

    invoke-direct {v12, v1}, Ls9/d$b;-><init>(I)V

    const-string v8, "BLUETOOTH_ADAPTER_DISABLED"

    const/4 v9, 0x3

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, LP8/l$a;-><init>(Ljava/lang/String;ILs9/d;Ls9/d;Ls9/d;)V

    sput-object v0, LP8/l$a;->BLUETOOTH_ADAPTER_DISABLED:LP8/l$a;

    invoke-static {}, LP8/l$a;->$values()[LP8/l$a;

    move-result-object v0

    sput-object v0, LP8/l$a;->$VALUES:[LP8/l$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LP8/l$a;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILs9/d;Ls9/d;Ls9/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls9/d;",
            "Ls9/d;",
            "Ls9/d;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LP8/l$a;->title:Ls9/d;

    iput-object p4, p0, LP8/l$a;->subtitle:Ls9/d;

    iput-object p5, p0, LP8/l$a;->buttonPrimary:Ls9/d;

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

    sget-object v0, LP8/l$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LP8/l$a;
    .locals 1

    const-class v0, LP8/l$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LP8/l$a;

    return-object p0
.end method

.method public static values()[LP8/l$a;
    .locals 1

    sget-object v0, LP8/l$a;->$VALUES:[LP8/l$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LP8/l$a;

    return-object v0
.end method


# virtual methods
.method public final getButtonPrimary()Ls9/d;
    .locals 1

    iget-object v0, p0, LP8/l$a;->buttonPrimary:Ls9/d;

    return-object v0
.end method

.method public final getSubtitle()Ls9/d;
    .locals 1

    iget-object v0, p0, LP8/l$a;->subtitle:Ls9/d;

    return-object v0
.end method

.method public final getTitle()Ls9/d;
    .locals 1

    iget-object v0, p0, LP8/l$a;->title:Ls9/d;

    return-object v0
.end method
