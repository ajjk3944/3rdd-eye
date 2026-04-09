.class public final LI/Z0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI1/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/Z0;-><init>(LI/k1;Landroid/view/inputmethod/EditorInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LI/Z0;


# direct methods
.method constructor <init>(LI/Z0;)V
    .locals 0

    iput-object p1, p0, LI/Z0$a;->a:LI/Z0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LI1/d;ILandroid/os/Bundle;)Z
    .locals 1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_1

    :try_start_0
    invoke-virtual {p1}, LI1/d;->d()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1}, LI1/d;->e()Ljava/lang/Object;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type android.os.Parcelable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/os/Parcelable;

    if-nez p3, :cond_0

    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    move-object p3, v0

    :goto_0
    const-string v0, "EXTRA_INPUT_CONTENT_INFO"

    invoke-virtual {p3, v0, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    goto :goto_1

    :catch_0
    move-exception p1

    iget-object p2, p0, LI/Z0$a;->a:LI/Z0;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Can\'t insert content from IME; requestPermission() failed, "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, LI/Z0;->e(LI/Z0;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_1
    iget-object p2, p0, LI/Z0$a;->a:LI/Z0;

    invoke-static {p2}, LI/Z0;->c(LI/Z0;)LI/k1;

    move-result-object p2

    invoke-static {p1, p3}, LI/a1;->c(LI1/d;Landroid/os/Bundle;)Lt/c;

    move-result-object p1

    invoke-interface {p2, p1}, LI/k1;->c(Lt/c;)Z

    move-result p1

    return p1
.end method
