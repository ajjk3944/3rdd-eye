.class final LId/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LId/d;-><init>(Landroid/content/Context;Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager;Lcom/ui/wifiman/model/teleport/session/TeleportSession;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager;

.field final synthetic b:LId/d;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager;LId/d;)V
    .locals 0

    iput-object p1, p0, LId/d$b;->a:Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager;

    iput-object p2, p0, LId/d$b;->b:LId/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/atomic/AtomicInteger;)Lgg/D;
    .locals 3

    const-string v0, "retryCounter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LId/d$b;->a:Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager;

    sget-object v1, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;->TELEPORT:Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;

    invoke-interface {v0, v1}, Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager;->a(Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;)Lgg/z;

    move-result-object v0

    new-instance v1, LId/d$b$a;

    iget-object v2, p0, LId/d$b;->b:LId/d;

    invoke-direct {v1, p1, v2}, LId/d$b$a;-><init>(Ljava/util/concurrent/atomic/AtomicInteger;LId/d;)V

    invoke-virtual {v0, v1}, Lgg/z;->L(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0, p1}, LId/d$b;->a(Ljava/util/concurrent/atomic/AtomicInteger;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
