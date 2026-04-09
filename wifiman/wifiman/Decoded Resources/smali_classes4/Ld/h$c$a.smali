.class final LLd/h$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLd/h$c;->a(Ll9/a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LLd/h;

.field final synthetic b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;


# direct methods
.method constructor <init>(LLd/h;Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;)V
    .locals 0

    iput-object p1, p0, LLd/h$c$a;->a:LLd/h;

    iput-object p2, p0, LLd/h$c$a;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LGb/d;)Ll9/a;
    .locals 4

    const-string v0, "storage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    iget-object v1, p0, LLd/h$c$a;->a:LLd/h;

    iget-object v2, p0, LLd/h$c$a;->b:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;->e()Ljava/util/UUID;

    move-result-object v2

    iget-object v3, p0, LLd/h$c$a;->a:LLd/h;

    invoke-static {v3}, LLd/h;->c(LLd/h;)LQd/e;

    move-result-object v3

    invoke-static {v1, v2, v3, p1}, LLd/h;->e(LLd/h;Ljava/util/UUID;LQd/e;LGb/d;)LLd/e;

    move-result-object p1

    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LGb/d;

    invoke-virtual {p0, p1}, LLd/h$c$a;->a(LGb/d;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
