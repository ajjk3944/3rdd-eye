.class final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;->D(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b;LEb/r;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LEb/r;


# direct methods
.method constructor <init>(LEb/r;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$E;->a:LEb/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LLb/a;)LLb/a;
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "persistent"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$E;->a:LEb/r;

    invoke-virtual {v1}, LEb/r;->d()Ljava/lang/String;

    move-result-object v5

    iget-object v1, v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$E;->a:LEb/r;

    invoke-virtual {v1}, LEb/r;->e()Ljava/lang/String;

    move-result-object v6

    iget-object v1, v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$E;->a:LEb/r;

    invoke-virtual {v1}, LEb/r;->c()Ljava/lang/String;

    move-result-object v7

    iget-object v1, v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$E;->a:LEb/r;

    invoke-virtual {v1}, LEb/r;->f()Ljava/lang/String;

    move-result-object v8

    iget-object v1, v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$E;->a:LEb/r;

    invoke-virtual {v1}, LEb/r;->i()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    iget-object v1, v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$E;->a:LEb/r;

    invoke-virtual {v1}, LEb/r;->a()Ljava/lang/String;

    move-result-object v10

    iget-object v1, v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$E;->a:LEb/r;

    invoke-virtual {v1}, LEb/r;->b()Ljava/lang/String;

    move-result-object v11

    const/16 v15, 0x603

    const/16 v16, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    invoke-static/range {v2 .. v16}, LLb/a;->b(LLb/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/Object;)LLb/a;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLb/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$E;->a(LLb/a;)LLb/a;

    move-result-object p1

    return-object p1
.end method
