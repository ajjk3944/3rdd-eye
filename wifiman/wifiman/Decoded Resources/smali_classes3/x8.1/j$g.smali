.class final Lx8/j$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx8/j;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx8/j$g$a;
    }
.end annotation


# static fields
.field public static final a:Lx8/j$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx8/j$g;

    invoke-direct {v0}, Lx8/j$g;-><init>()V

    sput-object v0, Lx8/j$g;->a:Lx8/j$g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lde/y;Lcom/ubnt/usurvey/ui/signal/strength/a$a;)Lgc/c;
    .locals 1

    const-string/jumbo v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "cellularDeviceState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lde/y;->e()Lgc/c;

    move-result-object p1

    sget-object v0, Lx8/j$g$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    instance-of p1, p2, Lcom/ubnt/usurvey/ui/signal/strength/a$a$a;

    if-eqz p1, :cond_0

    sget-object p1, Lgc/c;->CELLULAR:Lgc/c;

    goto :goto_0

    :cond_0
    sget-object p1, Lgc/c;->WIFI:Lgc/c;

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    sget-object p1, Lgc/c;->WIFI:Lgc/c;

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lde/y;

    check-cast p2, Lcom/ubnt/usurvey/ui/signal/strength/a$a;

    invoke-virtual {p0, p1, p2}, Lx8/j$g;->a(Lde/y;Lcom/ubnt/usurvey/ui/signal/strength/a$a;)Lgc/c;

    move-result-object p1

    return-object p1
.end method
