.class final Lcom/ubnt/usurvey/ui/signal/strength/b$q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


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
        Lcom/ubnt/usurvey/ui/signal/strength/b$q$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/ubnt/usurvey/ui/signal/strength/b$q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/usurvey/ui/signal/strength/b$q;

    invoke-direct {v0}, Lcom/ubnt/usurvey/ui/signal/strength/b$q;-><init>()V

    sput-object v0, Lcom/ubnt/usurvey/ui/signal/strength/b$q;->a:Lcom/ubnt/usurvey/ui/signal/strength/b$q;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LBc/a$b;Lcom/ubnt/usurvey/ui/signal/strength/b$a;)Lcom/ubnt/usurvey/ui/signal/strength/b$b;
    .locals 3

    const-string/jumbo v0, "simState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "tab"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LBc/a$b$b$c;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-nez v0, :cond_9

    instance-of v0, p1, LBc/a$b$b$b;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, LBc/a$b$b$a;

    if-eqz v0, :cond_3

    sget-object p1, Lcom/ubnt/usurvey/ui/signal/strength/b$q$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    sget-object p1, Lcom/ubnt/usurvey/ui/signal/strength/b$b$a$a;->a:Lcom/ubnt/usurvey/ui/signal/strength/b$b$a$a;

    goto :goto_2

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    sget-object p1, Lcom/ubnt/usurvey/ui/signal/strength/b$b$a$b$b;->a:Lcom/ubnt/usurvey/ui/signal/strength/b$b$a$b$b;

    goto :goto_2

    :cond_3
    instance-of v0, p1, LBc/a$b$a$b;

    if-eqz v0, :cond_6

    sget-object p1, Lcom/ubnt/usurvey/ui/signal/strength/b$q$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    if-eq p1, v2, :cond_5

    if-ne p1, v1, :cond_4

    sget-object p1, Lcom/ubnt/usurvey/ui/signal/strength/b$b$a$a;->a:Lcom/ubnt/usurvey/ui/signal/strength/b$b$a$a;

    goto :goto_2

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    sget-object p1, Lcom/ubnt/usurvey/ui/signal/strength/b$b$a$b$a;->a:Lcom/ubnt/usurvey/ui/signal/strength/b$b$a$b$a;

    goto :goto_2

    :cond_6
    instance-of p2, p1, LBc/a$b$b$e;

    if-nez p2, :cond_8

    instance-of p2, p1, LBc/a$b$b$d;

    if-nez p2, :cond_8

    instance-of p2, p1, LBc/a$b$a$a;

    if-nez p2, :cond_8

    instance-of p1, p1, LBc/a$b$a$c;

    if-eqz p1, :cond_7

    goto :goto_0

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    :goto_0
    sget-object p1, Lcom/ubnt/usurvey/ui/signal/strength/b$b$b;->a:Lcom/ubnt/usurvey/ui/signal/strength/b$b$b;

    goto :goto_2

    :cond_9
    :goto_1
    sget-object p1, Lcom/ubnt/usurvey/ui/signal/strength/b$q$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    if-eq p1, v2, :cond_b

    if-ne p1, v1, :cond_a

    sget-object p1, Lcom/ubnt/usurvey/ui/signal/strength/b$b$a$a;->a:Lcom/ubnt/usurvey/ui/signal/strength/b$b$a$a;

    goto :goto_2

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_b
    sget-object p1, Lcom/ubnt/usurvey/ui/signal/strength/b$b$a$b$c;->a:Lcom/ubnt/usurvey/ui/signal/strength/b$b$a$b$c;

    :goto_2
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LBc/a$b;

    check-cast p2, Lcom/ubnt/usurvey/ui/signal/strength/b$a;

    invoke-virtual {p0, p1, p2}, Lcom/ubnt/usurvey/ui/signal/strength/b$q;->a(LBc/a$b;Lcom/ubnt/usurvey/ui/signal/strength/b$a;)Lcom/ubnt/usurvey/ui/signal/strength/b$b;

    move-result-object p1

    return-object p1
.end method
