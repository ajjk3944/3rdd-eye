.class final LH8/b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/b;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LH8/b$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH8/b$e;

    invoke-direct {v0}, LH8/b$e;-><init>()V

    sput-object v0, LH8/b$e;->a:LH8/b$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/ui/teleport/consoles/b;Ljava/util/List;)Ll9/a;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "teleports"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/teleport/consoles/b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/ui/wifiman/model/teleport/n;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/teleport/n;->a()LKd/a;

    move-result-object v1

    invoke-virtual {v1}, LKd/a;->c()LKd/a$a;

    move-result-object v1

    invoke-virtual {v1}, LKd/a$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->h(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    new-instance p1, Ll9/a;

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/ui/teleport/consoles/b;

    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, LH8/b$e;->a(Lcom/ui/wifiman/ui/teleport/consoles/b;Ljava/util/List;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
