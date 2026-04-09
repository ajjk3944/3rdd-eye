.class final Lcom/ubnt/usurvey/ui/signal/strength/c$t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


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
        Lcom/ubnt/usurvey/ui/signal/strength/c$t$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/ubnt/usurvey/ui/signal/strength/c$t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/usurvey/ui/signal/strength/c$t;

    invoke-direct {v0}, Lcom/ubnt/usurvey/ui/signal/strength/c$t;-><init>()V

    sput-object v0, Lcom/ubnt/usurvey/ui/signal/strength/c$t;->a:Lcom/ubnt/usurvey/ui/signal/strength/c$t;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgc/b;LCd/f$a;)Ljava/lang/Boolean;
    .locals 2

    const-string/jumbo v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "speedtestState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, LCd/f$a$a;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    sget-object p2, Lcom/ubnt/usurvey/ui/signal/strength/c$t$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    if-eq p1, v1, :cond_3

    const/4 p2, 0x2

    if-eq p1, p2, :cond_1

    const/4 p2, 0x3

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    instance-of p1, p2, LCd/f$a$b;

    if-eqz p1, :cond_4

    :cond_3
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgc/b;

    check-cast p2, LCd/f$a;

    invoke-virtual {p0, p1, p2}, Lcom/ubnt/usurvey/ui/signal/strength/c$t;->a(Lgc/b;LCd/f$a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
