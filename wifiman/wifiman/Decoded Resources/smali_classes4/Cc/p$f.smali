.class final LCc/p$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCc/p;-><init>(LOb/a;LDc/e;Lle/g;Lwc/h;Lcom/ui/wifiman/model/bluetooth/le/a;Lmc/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LCc/p;


# direct methods
.method constructor <init>(LCc/p;)V
    .locals 0

    iput-object p1, p0, LCc/p$f;->a:LCc/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LCc/j;)LDj/a;
    .locals 3

    const-string v0, "myselfTemplate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LCc/p$f;->a:LCc/p;

    invoke-static {v0}, LCc/p;->i(LCc/p;)Lgg/i;

    move-result-object v0

    iget-object v1, p0, LCc/p$f;->a:LCc/p;

    invoke-static {v1}, LCc/p;->h(LCc/p;)Lgg/i;

    move-result-object v1

    new-instance v2, LCc/p$f$a;

    invoke-direct {v2, p1}, LCc/p$f$a;-><init>(LCc/j;)V

    invoke-static {v0, v1, v2}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LCc/j;

    invoke-virtual {p0, p1}, LCc/p$f;->a(LCc/j;)LDj/a;

    move-result-object p1

    return-object p1
.end method
