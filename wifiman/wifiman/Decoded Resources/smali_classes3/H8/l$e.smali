.class final LH8/l$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/l;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LH8/l;


# direct methods
.method constructor <init>(LH8/l;)V
    .locals 0

    iput-object p1, p0, LH8/l$e;->a:LH8/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lsf/b;)Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor;
    .locals 5

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LH8/l$e;->a:LH8/l;

    invoke-virtual {v0}, LH8/l;->d()Lorg/kodein/di/DI;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/di/d;->f(Lorg/kodein/di/c;)Lrj/m2;

    move-result-object v0

    new-instance v1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    invoke-virtual {p1}, Lsf/b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;-><init>(Ljava/lang/String;)V

    invoke-interface {v0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p1

    new-instance v0, Lorg/kodein/type/d;

    new-instance v2, LH8/l$e$a;

    invoke-direct {v2}, LH8/l$e$a;-><init>()V

    invoke-virtual {v2}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-static {v2}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v2

    const-string/jumbo v3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    invoke-direct {v0, v2, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v2, Lorg/kodein/type/d;

    new-instance v4, LH8/l$e$b;

    invoke-direct {v4}, LH8/l$e$b;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor;

    invoke-direct {v2, v4, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v3, 0x0

    invoke-interface {p1, v0, v2, v3, v1}, Lrj/o2;->b(Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor;

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lsf/b;

    invoke-virtual {p0, p1}, LH8/l$e;->a(Lsf/b;)Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor;

    move-result-object p1

    return-object p1
.end method
