.class public final Lcom/ui/wifiman/model/vendor/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/vendor/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/vendor/e;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LF7/a$a;

.field final synthetic b:Lcom/ui/wifiman/model/vendor/e;


# direct methods
.method constructor <init>(LF7/a$a;Lcom/ui/wifiman/model/vendor/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/vendor/e$a;->a:LF7/a$a;

    iput-object p2, p0, Lcom/ui/wifiman/model/vendor/e$a;->b:Lcom/ui/wifiman/model/vendor/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lh9/a;)Lcom/ui/wifiman/model/vendor/d;
    .locals 2

    const-string v0, "mac"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/vendor/e$a;->a:LF7/a$a;

    const-string v1, ":"

    invoke-virtual {p1, v1}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, LF7/a$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/model/vendor/e$a;->b:Lcom/ui/wifiman/model/vendor/e;

    invoke-virtual {v0, p1}, Lcom/ui/wifiman/model/vendor/e;->b(Ljava/lang/String;)Lcom/ui/wifiman/model/vendor/d;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
