.class public final enum LQe/c$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQe/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LQe/c$a;

.field public static final enum DISCOVERY:LQe/c$a;

.field public static final enum SCAN:LQe/c$a;

.field public static final enum SIGNAL:LQe/c$a;

.field public static final enum SPEED:LQe/c$a;

.field public static final enum TELEPORT:LQe/c$a;


# instance fields
.field private final icon:Ls9/b;

.field private final iconSelected:Ls9/b;

.field private final title:Ls9/d;


# direct methods
.method private static final synthetic $values()[LQe/c$a;
    .locals 5

    sget-object v0, LQe/c$a;->SPEED:LQe/c$a;

    sget-object v1, LQe/c$a;->SIGNAL:LQe/c$a;

    sget-object v2, LQe/c$a;->SCAN:LQe/c$a;

    sget-object v3, LQe/c$a;->DISCOVERY:LQe/c$a;

    sget-object v4, LQe/c$a;->TELEPORT:LQe/c$a;

    filled-new-array {v0, v1, v2, v3, v4}, [LQe/c$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 14

    new-instance v6, LQe/c$a;

    new-instance v3, Ls9/d$b;

    sget v0, Lm8/c;->i1:I

    invoke-direct {v3, v0}, Ls9/d$b;-><init>(I)V

    sget-object v7, LPe/a;->a:LPe/a;

    invoke-virtual {v7}, LPe/a;->L()Ls9/b;

    move-result-object v4

    invoke-virtual {v7}, LPe/a;->M()Ls9/b;

    move-result-object v5

    const-string v1, "SPEED"

    const/4 v2, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LQe/c$a;-><init>(Ljava/lang/String;ILs9/d;Ls9/b;Ls9/b;)V

    sput-object v6, LQe/c$a;->SPEED:LQe/c$a;

    new-instance v0, LQe/c$a;

    new-instance v11, Ls9/d$b;

    sget v1, Lm8/c;->h1:I

    invoke-direct {v11, v1}, Ls9/d$b;-><init>(I)V

    invoke-virtual {v7}, LPe/a;->I()Ls9/b;

    move-result-object v12

    invoke-virtual {v7}, LPe/a;->J()Ls9/b;

    move-result-object v13

    const-string v9, "SIGNAL"

    const/4 v10, 0x1

    move-object v8, v0

    invoke-direct/range {v8 .. v13}, LQe/c$a;-><init>(Ljava/lang/String;ILs9/d;Ls9/b;Ls9/b;)V

    sput-object v0, LQe/c$a;->SIGNAL:LQe/c$a;

    new-instance v0, LQe/c$a;

    new-instance v4, Ls9/d$b;

    sget v1, Lm8/c;->g1:I

    invoke-direct {v4, v1}, Ls9/d$b;-><init>(I)V

    invoke-virtual {v7}, LPe/a;->F()Ls9/b;

    move-result-object v5

    invoke-virtual {v7}, LPe/a;->G()Ls9/b;

    move-result-object v6

    const-string v2, "SCAN"

    const/4 v3, 0x2

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LQe/c$a;-><init>(Ljava/lang/String;ILs9/d;Ls9/b;Ls9/b;)V

    sput-object v0, LQe/c$a;->SCAN:LQe/c$a;

    new-instance v0, LQe/c$a;

    new-instance v11, Ls9/d$b;

    sget v1, Lm8/c;->f1:I

    invoke-direct {v11, v1}, Ls9/d$b;-><init>(I)V

    invoke-virtual {v7}, LPe/a;->l()Ls9/b;

    move-result-object v12

    invoke-virtual {v7}, LPe/a;->m()Ls9/b;

    move-result-object v13

    const-string v9, "DISCOVERY"

    const/4 v10, 0x3

    move-object v8, v0

    invoke-direct/range {v8 .. v13}, LQe/c$a;-><init>(Ljava/lang/String;ILs9/d;Ls9/b;Ls9/b;)V

    sput-object v0, LQe/c$a;->DISCOVERY:LQe/c$a;

    new-instance v0, LQe/c$a;

    new-instance v4, Ls9/d$b;

    sget v1, Lm8/c;->j1:I

    invoke-direct {v4, v1}, Ls9/d$b;-><init>(I)V

    invoke-virtual {v7}, LPe/a;->Q()Ls9/b;

    move-result-object v5

    invoke-virtual {v7}, LPe/a;->R()Ls9/b;

    move-result-object v6

    const-string v2, "TELEPORT"

    const/4 v3, 0x4

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LQe/c$a;-><init>(Ljava/lang/String;ILs9/d;Ls9/b;Ls9/b;)V

    sput-object v0, LQe/c$a;->TELEPORT:LQe/c$a;

    invoke-static {}, LQe/c$a;->$values()[LQe/c$a;

    move-result-object v0

    sput-object v0, LQe/c$a;->$VALUES:[LQe/c$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LQe/c$a;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILs9/d;Ls9/b;Ls9/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls9/d;",
            "Ls9/b;",
            "Ls9/b;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LQe/c$a;->title:Ls9/d;

    iput-object p4, p0, LQe/c$a;->icon:Ls9/b;

    iput-object p5, p0, LQe/c$a;->iconSelected:Ls9/b;

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

    sget-object v0, LQe/c$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LQe/c$a;
    .locals 1

    const-class v0, LQe/c$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LQe/c$a;

    return-object p0
.end method

.method public static values()[LQe/c$a;
    .locals 1

    sget-object v0, LQe/c$a;->$VALUES:[LQe/c$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LQe/c$a;

    return-object v0
.end method


# virtual methods
.method public final getIcon()Ls9/b;
    .locals 1

    iget-object v0, p0, LQe/c$a;->icon:Ls9/b;

    return-object v0
.end method

.method public final getIconSelected()Ls9/b;
    .locals 1

    iget-object v0, p0, LQe/c$a;->iconSelected:Ls9/b;

    return-object v0
.end method

.method public final getTitle()Ls9/d;
    .locals 1

    iget-object v0, p0, LQe/c$a;->title:Ls9/d;

    return-object v0
.end method
