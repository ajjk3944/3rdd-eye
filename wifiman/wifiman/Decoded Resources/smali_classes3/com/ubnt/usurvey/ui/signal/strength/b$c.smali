.class final enum Lcom/ubnt/usurvey/ui/signal/strength/b$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ubnt/usurvey/ui/signal/strength/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "c"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ubnt/usurvey/ui/signal/strength/b$c;

.field public static final enum LOCATION_DISABLED:Lcom/ubnt/usurvey/ui/signal/strength/b$c;

.field public static final enum PERMISSIONS:Lcom/ubnt/usurvey/ui/signal/strength/b$c;


# instance fields
.field private final button:Ls9/d;

.field private final subtitle:Ls9/d;

.field private final title:Ls9/d;


# direct methods
.method private static final synthetic $values()[Lcom/ubnt/usurvey/ui/signal/strength/b$c;
    .locals 2

    sget-object v0, Lcom/ubnt/usurvey/ui/signal/strength/b$c;->PERMISSIONS:Lcom/ubnt/usurvey/ui/signal/strength/b$c;

    sget-object v1, Lcom/ubnt/usurvey/ui/signal/strength/b$c;->LOCATION_DISABLED:Lcom/ubnt/usurvey/ui/signal/strength/b$c;

    filled-new-array {v0, v1}, [Lcom/ubnt/usurvey/ui/signal/strength/b$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 13

    new-instance v6, Lcom/ubnt/usurvey/ui/signal/strength/b$c;

    new-instance v3, Ls9/d$b;

    const v0, 0x7f110263

    invoke-direct {v3, v0}, Ls9/d$b;-><init>(I)V

    new-instance v4, Ls9/d$b;

    const v0, 0x7f110262

    invoke-direct {v4, v0}, Ls9/d$b;-><init>(I)V

    new-instance v5, Ls9/d$b;

    const v0, 0x7f110261

    invoke-direct {v5, v0}, Ls9/d$b;-><init>(I)V

    const-string/jumbo v1, "PERMISSIONS"

    const/4 v2, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/ubnt/usurvey/ui/signal/strength/b$c;-><init>(Ljava/lang/String;ILs9/d;Ls9/d;Ls9/d;)V

    sput-object v6, Lcom/ubnt/usurvey/ui/signal/strength/b$c;->PERMISSIONS:Lcom/ubnt/usurvey/ui/signal/strength/b$c;

    new-instance v0, Lcom/ubnt/usurvey/ui/signal/strength/b$c;

    new-instance v10, Ls9/d$b;

    const v1, 0x7f11024d

    invoke-direct {v10, v1}, Ls9/d$b;-><init>(I)V

    new-instance v11, Ls9/d$b;

    const v1, 0x7f11024c

    invoke-direct {v11, v1}, Ls9/d$b;-><init>(I)V

    new-instance v12, Ls9/d$b;

    const v1, 0x7f11024b

    invoke-direct {v12, v1}, Ls9/d$b;-><init>(I)V

    const-string/jumbo v8, "LOCATION_DISABLED"

    const/4 v9, 0x1

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/ubnt/usurvey/ui/signal/strength/b$c;-><init>(Ljava/lang/String;ILs9/d;Ls9/d;Ls9/d;)V

    sput-object v0, Lcom/ubnt/usurvey/ui/signal/strength/b$c;->LOCATION_DISABLED:Lcom/ubnt/usurvey/ui/signal/strength/b$c;

    invoke-static {}, Lcom/ubnt/usurvey/ui/signal/strength/b$c;->$values()[Lcom/ubnt/usurvey/ui/signal/strength/b$c;

    move-result-object v0

    sput-object v0, Lcom/ubnt/usurvey/ui/signal/strength/b$c;->$VALUES:[Lcom/ubnt/usurvey/ui/signal/strength/b$c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ubnt/usurvey/ui/signal/strength/b$c;->$ENTRIES:Lfh/a;

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

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lcom/ubnt/usurvey/ui/signal/strength/b$c;->title:Ls9/d;

    .line 3
    iput-object p4, p0, Lcom/ubnt/usurvey/ui/signal/strength/b$c;->subtitle:Ls9/d;

    .line 4
    iput-object p5, p0, Lcom/ubnt/usurvey/ui/signal/strength/b$c;->button:Ls9/d;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILs9/d;Ls9/d;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 5
    invoke-direct/range {v0 .. v5}, Lcom/ubnt/usurvey/ui/signal/strength/b$c;-><init>(Ljava/lang/String;ILs9/d;Ls9/d;Ls9/d;)V

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

    sget-object v0, Lcom/ubnt/usurvey/ui/signal/strength/b$c;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ubnt/usurvey/ui/signal/strength/b$c;
    .locals 1

    const-class v0, Lcom/ubnt/usurvey/ui/signal/strength/b$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ubnt/usurvey/ui/signal/strength/b$c;

    return-object p0
.end method

.method public static values()[Lcom/ubnt/usurvey/ui/signal/strength/b$c;
    .locals 1

    sget-object v0, Lcom/ubnt/usurvey/ui/signal/strength/b$c;->$VALUES:[Lcom/ubnt/usurvey/ui/signal/strength/b$c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ubnt/usurvey/ui/signal/strength/b$c;

    return-object v0
.end method


# virtual methods
.method public final getButton()Ls9/d;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/strength/b$c;->button:Ls9/d;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getSubtitle()Ls9/d;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/strength/b$c;->subtitle:Ls9/d;

    return-object v0
.end method

.method public final getTitle()Ls9/d;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/strength/b$c;->title:Ls9/d;

    return-object v0
.end method
