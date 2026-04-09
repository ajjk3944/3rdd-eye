.class final Lcom/ubnt/usurvey/ui/signal/strength/b$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/usurvey/ui/signal/strength/b;-><init>(LBc/a;Lde/z;Lcom/ui/wifiman/model/android/permissions/d;Ly8/g;Ly8/k;Ly8/u;Li8/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ubnt/usurvey/ui/signal/strength/b$o$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/ubnt/usurvey/ui/signal/strength/b$o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/usurvey/ui/signal/strength/b$o;

    invoke-direct {v0}, Lcom/ubnt/usurvey/ui/signal/strength/b$o;-><init>()V

    sput-object v0, Lcom/ubnt/usurvey/ui/signal/strength/b$o;->a:Lcom/ubnt/usurvey/ui/signal/strength/b$o;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lde/y;)Lcom/ubnt/usurvey/ui/signal/strength/b$a;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lde/y;->c()Lgc/b;

    move-result-object p1

    sget-object v0, Lcom/ubnt/usurvey/ui/signal/strength/b$o$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    sget-object p1, Lcom/ubnt/usurvey/ui/signal/strength/b$a;->LATENCY:Lcom/ubnt/usurvey/ui/signal/strength/b$a;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lcom/ubnt/usurvey/ui/signal/strength/b$a;->SIGNAL:Lcom/ubnt/usurvey/ui/signal/strength/b$a;

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lde/y;

    invoke-virtual {p0, p1}, Lcom/ubnt/usurvey/ui/signal/strength/b$o;->a(Lde/y;)Lcom/ubnt/usurvey/ui/signal/strength/b$a;

    move-result-object p1

    return-object p1
.end method
