.class final Lcom/ui/wifiman/model/wmw/h$r$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/h$r;->b(LMf/a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LMf/a;


# direct methods
.method constructor <init>(LMf/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/h$r$c;->a:LMf/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wmw/g;)LDj/a;
    .locals 1

    const-string v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/ui/wmw/g;->b()LMf/a$a;

    move-result-object p1

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/h$r$c;->a:LMf/a;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, LMf/a$a;->b(LMf/a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wmw/g;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/h$r$c;->a(Lcom/ui/wmw/g;)LDj/a;

    move-result-object p1

    return-object p1
.end method
