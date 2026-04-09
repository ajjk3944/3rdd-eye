.class public final Lw8/c$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw8/c$h;->a(Lld/a;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw8/c;

.field final synthetic b:Lld/a;


# direct methods
.method public constructor <init>(Lw8/c;Lld/a;)V
    .locals 0

    iput-object p1, p0, Lw8/c$h$a;->a:Lw8/c;

    iput-object p2, p0, Lw8/c$h$a;->b:Lld/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lw8/c$h$a;->a:Lw8/c;

    invoke-static {v0}, Lw8/c;->G0(Lw8/c;)Landroid/content/ClipboardManager;

    move-result-object v0

    const-string/jumbo v1, "WiFiman Report Key"

    iget-object v2, p0, Lw8/c$h$a;->b:Lld/a;

    invoke-virtual {v2}, Lld/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
