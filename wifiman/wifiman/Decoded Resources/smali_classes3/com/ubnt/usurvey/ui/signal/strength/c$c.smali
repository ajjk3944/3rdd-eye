.class final Lcom/ubnt/usurvey/ui/signal/strength/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/usurvey/ui/signal/strength/c;-><init>(Lje/u;Ly8/p;Ly8/d;Ly8/n;Ly8/m;LCd/f;Ly8/v;Lde/z;Lre/a;Li8/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ubnt/usurvey/ui/signal/strength/c$c$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/ubnt/usurvey/ui/signal/strength/c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/usurvey/ui/signal/strength/c$c;

    invoke-direct {v0}, Lcom/ubnt/usurvey/ui/signal/strength/c$c;-><init>()V

    sput-object v0, Lcom/ubnt/usurvey/ui/signal/strength/c$c;->a:Lcom/ubnt/usurvey/ui/signal/strength/c$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgc/b;

    check-cast p2, Ljava/lang/Boolean;

    check-cast p3, Ljava/lang/Integer;

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ubnt/usurvey/ui/signal/strength/c$c;->b(Lgc/b;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;)Ll9/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lgc/b;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;)Ll9/a;
    .locals 3

    const-string/jumbo v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "apCompareAvailable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "apCompareCount"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "isWifiConnected"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    sget-object v1, Lcom/ubnt/usurvey/ui/signal/strength/c$c$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p1, v1, :cond_1

    const/4 p2, 0x2

    if-eq p1, p2, :cond_4

    const/4 p2, 0x3

    if-ne p1, p2, :cond_0

    goto :goto_1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-lez p1, :cond_4

    :cond_2
    new-instance v2, LTe/K0$a;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-lez p1, :cond_3

    new-instance p1, Ls9/d$b;

    const p2, 0x7f110248

    invoke-static {p3}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Ls9/d$b;-><init>(ILjava/util/List;)V

    goto :goto_0

    :cond_3
    new-instance p1, Ls9/d$b;

    const p2, 0x7f110244

    invoke-direct {p1, p2}, Ls9/d$b;-><init>(I)V

    :goto_0
    invoke-direct {v2, p1}, LTe/K0$a;-><init>(Ls9/d;)V

    :cond_4
    :goto_1
    invoke-direct {v0, v2}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
