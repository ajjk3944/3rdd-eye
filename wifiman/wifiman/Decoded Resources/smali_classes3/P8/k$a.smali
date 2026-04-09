.class final LP8/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/k;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LP8/k$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LP8/k$a;

    invoke-direct {v0}, LP8/k$a;-><init>()V

    sput-object v0, LP8/k$a;->a:LP8/k$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/wmw/g$a;Ll9/a;)Ll9/a;
    .locals 2

    const-string/jumbo v0, "upgradeAvailability"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ui/wifiman/model/wmw/g$c$b$b;

    new-instance v0, Ll9/a;

    instance-of v1, p2, Lcom/ui/wifiman/model/wmw/g$c$b$b$b;

    if-eqz v1, :cond_0

    new-instance p1, LIf/E$c;

    check-cast p2, Lcom/ui/wifiman/model/wmw/g$c$b$b$b;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/wmw/g$c$b$b$b;->b()Lcom/ui/common/semver/SemVer;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ui/common/semver/SemVer;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, LIf/E$c;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    instance-of v1, p2, Lcom/ui/wifiman/model/wmw/g$c$b$b$a;

    if-eqz v1, :cond_1

    new-instance p1, LIf/E$b;

    check-cast p2, Lcom/ui/wifiman/model/wmw/g$c$b$b$a;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/wmw/g$c$b$b$a;->b()Lcom/ui/common/semver/SemVer;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ui/common/semver/SemVer;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, LIf/E$b;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    instance-of p2, p1, Lcom/ui/wifiman/model/wmw/g$a$a;

    if-eqz p2, :cond_2

    new-instance p2, LIf/E$a;

    check-cast p1, Lcom/ui/wifiman/model/wmw/g$a$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/g$a$a;->a()Lcom/ui/wifiman/model/wmw/g$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/g$b;->c()Lcom/ui/common/semver/SemVer;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/common/semver/SemVer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, LIf/E$a;-><init>(Ljava/lang/String;)V

    move-object p1, p2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/wmw/g$a;

    check-cast p2, Ll9/a;

    invoke-virtual {p0, p1, p2}, LP8/k$a;->a(Lcom/ui/wifiman/model/wmw/g$a;Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
