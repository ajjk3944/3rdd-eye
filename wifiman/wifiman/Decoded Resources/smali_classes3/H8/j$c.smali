.class final LH8/j$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/j;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LH8/j$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH8/j$c;

    invoke-direct {v0}, LH8/j$c;-><init>()V

    sput-object v0, LH8/j$c;->a:LH8/j$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Ljava/lang/Boolean;)Lcom/ui/wifiman/ui/teleport/c;
    .locals 3

    const-string/jumbo v0, "consoles"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "inEditMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/ui/wifiman/model/teleport/h;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/teleport/h;->C()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lcom/ui/wifiman/model/teleport/h;

    instance-of v0, p1, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/teleport/h;

    instance-of v0, v0, Lcom/ui/wifiman/model/teleport/h$c;

    if-eqz v0, :cond_3

    const/4 v2, 0x1

    :cond_4
    :goto_1
    const p1, 0x7f1102d8

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lcom/ui/wifiman/model/teleport/h;->l()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance p1, Ls9/d$c;

    invoke-direct {p1, v0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_5
    new-instance v0, Ls9/d$b;

    invoke-direct {v0, p1}, Ls9/d$b;-><init>(I)V

    move-object p1, v0

    :goto_2
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    new-instance v0, Lcom/ui/wifiman/ui/teleport/c$a;

    invoke-direct {v0, p1, v2, p2}, Lcom/ui/wifiman/ui/teleport/c$a;-><init>(Ls9/d;ZZ)V

    goto :goto_3

    :cond_6
    new-instance v0, Lcom/ui/wifiman/ui/teleport/c$b;

    new-instance p2, Ls9/d$b;

    invoke-direct {p2, p1}, Ls9/d$b;-><init>(I)V

    invoke-direct {v0, p2}, Lcom/ui/wifiman/ui/teleport/c$b;-><init>(Ls9/d;)V

    :goto_3
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2}, LH8/j$c;->a(Ljava/util/List;Ljava/lang/Boolean;)Lcom/ui/wifiman/ui/teleport/c;

    move-result-object p1

    return-object p1
.end method
