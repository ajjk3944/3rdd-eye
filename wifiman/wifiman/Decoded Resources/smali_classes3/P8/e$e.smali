.class final LP8/e$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/e;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LP8/e$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LP8/e$e;

    invoke-direct {v0}, LP8/e$e;-><init>()V

    sput-object v0, LP8/e$e;->a:LP8/e$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/wmw/b$c;

    check-cast p2, Ll9/a;

    check-cast p3, Lcom/ui/wifiman/model/wmw/WifimanWizard$a;

    invoke-virtual {p0, p1, p2, p3}, LP8/e$e;->b(Lcom/ui/wifiman/model/wmw/b$c;Ll9/a;Lcom/ui/wifiman/model/wmw/WifimanWizard$a;)LP8/e$a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/ui/wifiman/model/wmw/b$c;Ll9/a;Lcom/ui/wifiman/model/wmw/WifimanWizard$a;)LP8/e$a;
    .locals 1

    const-string/jumbo v0, "adoptionState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "connectionState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ui/wifiman/model/wmw/b$c$c;

    if-eqz p2, :cond_0

    new-instance p1, LP8/e$a$a;

    invoke-direct {p1, p2}, LP8/e$a$a;-><init>(Lcom/ui/wifiman/model/wmw/b$c;)V

    goto :goto_1

    :cond_0
    instance-of p2, p1, Lcom/ui/wifiman/model/wmw/b$c$b;

    if-eqz p2, :cond_1

    new-instance p2, LP8/e$a$a;

    invoke-direct {p2, p1}, LP8/e$a$a;-><init>(Lcom/ui/wifiman/model/wmw/b$c;)V

    :goto_0
    move-object p1, p2

    goto :goto_1

    :cond_1
    instance-of p2, p1, Lcom/ui/wifiman/model/wmw/b$c$a;

    if-eqz p2, :cond_2

    new-instance p2, LP8/e$a$a;

    invoke-direct {p2, p1}, LP8/e$a$a;-><init>(Lcom/ui/wifiman/model/wmw/b$c;)V

    goto :goto_0

    :cond_2
    new-instance p1, LP8/e$a$b;

    invoke-direct {p1, p3}, LP8/e$a$b;-><init>(Lcom/ui/wifiman/model/wmw/WifimanWizard$a;)V

    :goto_1
    return-object p1
.end method
