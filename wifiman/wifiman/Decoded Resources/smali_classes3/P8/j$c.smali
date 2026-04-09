.class final LP8/j$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/j;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LP8/j$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LP8/j$c;

    invoke-direct {v0}, LP8/j$c;-><init>()V

    sput-object v0, LP8/j$c;->a:LP8/j$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/wmw/g$c;)Ljava/lang/Float;
    .locals 1

    const-string/jumbo v0, "upgradeState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/g$c$a;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/g$c$b;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/ui/wifiman/model/wmw/g$c$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/g$c$b;->a()F

    move-result p1

    :goto_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/wmw/g$c;

    invoke-virtual {p0, p1}, LP8/j$c;->a(Lcom/ui/wifiman/model/wmw/g$c;)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method
