.class final LP8/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/d;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LP8/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LP8/d$b;

    invoke-direct {v0}, LP8/d$b;-><init>()V

    sput-object v0, LP8/d$b;->a:LP8/d$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/wmw/g$a;)Ljava/lang/Boolean;
    .locals 1

    const-string/jumbo v0, "availability"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/g$a$c;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/g$a$b;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lcom/ui/wifiman/model/wmw/g$a$a;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/wmw/g$a;

    invoke-virtual {p0, p1}, LP8/d$b;->a(Lcom/ui/wifiman/model/wmw/g$a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
