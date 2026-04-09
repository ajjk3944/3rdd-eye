.class final LP8/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/a;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LP8/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LP8/a$a;

    invoke-direct {v0}, LP8/a$a;-><init>()V

    sput-object v0, LP8/a$a;->a:LP8/a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Ll9/a;
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/wmw/b$c$c;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/b$c;->a()Lcom/ui/wifiman/model/wmw/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    instance-of v1, p1, Lcom/ui/wifiman/model/wmw/b$a;

    if-eqz v1, :cond_1

    check-cast p1, Lcom/ui/wifiman/model/wmw/b$a;

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/b$a;->a()Lh9/a;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance v0, Ls9/d$a;

    const-string v1, ""

    invoke-virtual {p1, v1}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LP8/a$a$a;

    invoke-direct {v2, p1}, LP8/a$a$a;-><init>(Lh9/a;)V

    invoke-direct {v0, v1, v2}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    :cond_2
    new-instance p1, Ll9/a;

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, LP8/a$a;->a(Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
