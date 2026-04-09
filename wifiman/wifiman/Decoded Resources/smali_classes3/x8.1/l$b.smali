.class final Lx8/l$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx8/l;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx8/l$b$a;
    }
.end annotation


# static fields
.field public static final a:Lx8/l$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx8/l$b;

    invoke-direct {v0}, Lx8/l$b;-><init>()V

    sput-object v0, Lx8/l$b;->a:Lx8/l$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lde/y;)Lcom/ui/wifiman/ui/signal/d;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lde/y;->d()Lgc/a;

    move-result-object p1

    sget-object v0, Lx8/l$b$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, Lcom/ui/wifiman/ui/signal/d;->FLOORPLAN:Lcom/ui/wifiman/ui/signal/d;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lcom/ui/wifiman/ui/signal/d;->SIGNAL:Lcom/ui/wifiman/ui/signal/d;

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lde/y;

    invoke-virtual {p0, p1}, Lx8/l$b;->a(Lde/y;)Lcom/ui/wifiman/ui/signal/d;

    move-result-object p1

    return-object p1
.end method
