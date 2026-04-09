.class final LId/d$i;
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


# static fields
.field public static final a:LId/d$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LId/d$i;

    invoke-direct {v0}, LId/d$i;-><init>()V

    sput-object v0, LId/d$i;->a:LId/d$i;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LJd/b;)LDj/a;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LJd/b;->a()Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJd/b;

    invoke-virtual {p0, p1}, LId/d$i;->a(LJd/b;)LDj/a;

    move-result-object p1

    return-object p1
.end method
