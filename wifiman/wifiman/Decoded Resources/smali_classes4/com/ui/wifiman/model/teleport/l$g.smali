.class final Lcom/ui/wifiman/model/teleport/l$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/l;-><init>(LFd/D;LI7/a;LKd/d;LKd/b;LZc/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/teleport/l$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/l$g;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/l$g;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/teleport/l$g;->a:Lcom/ui/wifiman/model/teleport/l$g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Ll9/a;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/teleport/n;

    new-instance v0, Ll9/a;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/n;->a()LKd/a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LKd/a;->c()LKd/a$a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LKd/a$a;->b()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    invoke-static {p1}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->a(Ljava/lang/String;)Lcom/ui/wifiman/model/ubiquiti/console/e$b;

    move-result-object v1

    :cond_1
    invoke-direct {v0, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/l$g;->a(Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
