.class final LP8/j$a;
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
.field public static final a:LP8/j$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LP8/j$a;

    invoke-direct {v0}, LP8/j$a;-><init>()V

    sput-object v0, LP8/j$a;->a:LP8/j$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/wmw/g$c;)Ll9/a;
    .locals 3

    const-string/jumbo v0, "upgradeState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    instance-of v1, p1, Lcom/ui/wifiman/model/wmw/g$c$a;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/wmw/g$c$b$a;

    if-eqz v1, :cond_1

    new-instance v2, Ls9/d$b;

    const p1, 0x7f11044a

    invoke-direct {v2, p1}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_1
    instance-of v1, p1, Lcom/ui/wifiman/model/wmw/g$c$b$d;

    if-eqz v1, :cond_2

    new-instance v2, Ls9/d$b;

    const p1, 0x7f110452

    invoke-direct {v2, p1}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_2
    instance-of v1, p1, Lcom/ui/wifiman/model/wmw/g$c$b$c;

    if-eqz v1, :cond_3

    new-instance v2, Ls9/d$b;

    const p1, 0x7f110451

    invoke-direct {v2, p1}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_3
    instance-of p1, p1, Lcom/ui/wifiman/model/wmw/g$c$b$b;

    if-eqz p1, :cond_4

    :goto_0
    invoke-direct {v0, v2}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/wmw/g$c;

    invoke-virtual {p0, p1}, LP8/j$a;->a(Lcom/ui/wifiman/model/wmw/g$c;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
