.class final Lw8/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw8/a;->u0()Lgg/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw8/a;


# direct methods
.method constructor <init>(Lw8/a;)V
    .locals 0

    iput-object p1, p0, Lw8/a$c;->a:Lw8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lgg/D;
    .locals 3

    const-string/jumbo v0, "comment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lw8/a$c;->a:Lw8/a;

    invoke-static {v0}, Lw8/a;->r0(Lw8/a;)Lcom/ui/wifiman/model/support/SupportManager;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wifiman/model/support/SupportManager;->c()Lgg/z;

    move-result-object v0

    sget-object v1, Lw8/a$c$a;->a:Lw8/a$c$a;

    invoke-virtual {v0, v1}, Lgg/z;->m(Lkg/f;)Lgg/z;

    move-result-object v0

    sget-object v1, Lw8/a$c$b;->a:Lw8/a$c$b;

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v1, Ll9/a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lgg/z;->H(Ljava/lang/Object;)Lgg/z;

    move-result-object v0

    iget-object v1, p0, Lw8/a$c;->a:Lw8/a;

    invoke-static {v1}, Lw8/a;->q0(Lw8/a;)Lld/b;

    move-result-object v1

    invoke-interface {v1}, Lld/b;->a()Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    new-instance v2, Lw8/a$c$c;

    invoke-direct {v2, p1}, Lw8/a$c$c;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, v2}, Lgg/z;->e0(Lgg/D;Lgg/D;Lkg/b;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lw8/a$c;->a(Ljava/lang/String;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
