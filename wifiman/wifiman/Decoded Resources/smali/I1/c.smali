.class public abstract LI1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI1/c$b;
    }
.end annotation


# direct methods
.method public static synthetic a(Landroid/view/View;LI1/d;ILandroid/os/Bundle;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, LI1/c;->e(Landroid/view/View;LI1/d;ILandroid/os/Bundle;)Z

    move-result p0

    return p0
.end method

.method private static b(Landroid/view/View;)LI1/c$b;
    .locals 1

    invoke-static {p0}, LE1/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LI1/b;

    invoke-direct {v0, p0}, LI1/b;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method public static c(Landroid/view/View;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 0

    invoke-static {p0}, LI1/c;->b(Landroid/view/View;)LI1/c$b;

    move-result-object p0

    invoke-static {p1, p2, p0}, LI1/c;->d(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;LI1/c$b;)Landroid/view/inputmethod/InputConnection;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;LI1/c$b;)Landroid/view/inputmethod/InputConnection;
    .locals 1

    const-string v0, "inputConnection must be non-null"

    invoke-static {p0, v0}, LE1/d;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "editorInfo must be non-null"

    invoke-static {p1, v0}, LE1/d;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string p1, "onCommitContentListener must be non-null"

    invoke-static {p2, p1}, LE1/d;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance p1, LI1/c$a;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0, p2}, LI1/c$a;-><init>(Landroid/view/inputmethod/InputConnection;ZLI1/c$b;)V

    return-object p1
.end method

.method private static synthetic e(Landroid/view/View;LI1/d;ILandroid/os/Bundle;)Z
    .locals 5

    const/4 v0, 0x1

    and-int/2addr p2, v0

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    :try_start_0
    invoke-virtual {p1}, LI1/d;->d()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1}, LI1/d;->e()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Parcelable;

    if-nez p3, :cond_0

    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    move-object p3, v2

    :goto_0
    const-string v2, "androidx.core.view.extra.INPUT_CONTENT_INFO"

    invoke-virtual {p3, v2, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    goto :goto_1

    :catch_0
    move-exception p0

    const-string p1, "InputConnectionCompat"

    const-string p2, "Can\'t insert content from IME; requestPermission() failed"

    invoke-static {p1, p2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return v1

    :cond_1
    :goto_1
    new-instance p2, Landroid/content/ClipData;

    invoke-virtual {p1}, LI1/d;->b()Landroid/content/ClipDescription;

    move-result-object v2

    new-instance v3, Landroid/content/ClipData$Item;

    invoke-virtual {p1}, LI1/d;->a()Landroid/net/Uri;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/content/ClipData$Item;-><init>(Landroid/net/Uri;)V

    invoke-direct {p2, v2, v3}, Landroid/content/ClipData;-><init>(Landroid/content/ClipDescription;Landroid/content/ClipData$Item;)V

    new-instance v2, LF1/d$a;

    const/4 v3, 0x2

    invoke-direct {v2, p2, v3}, LF1/d$a;-><init>(Landroid/content/ClipData;I)V

    invoke-virtual {p1}, LI1/d;->c()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v2, p1}, LF1/d$a;->d(Landroid/net/Uri;)LF1/d$a;

    move-result-object p1

    invoke-virtual {p1, p3}, LF1/d$a;->b(Landroid/os/Bundle;)LF1/d$a;

    move-result-object p1

    invoke-virtual {p1}, LF1/d$a;->a()LF1/d;

    move-result-object p1

    invoke-static {p0, p1}, LF1/W;->c0(Landroid/view/View;LF1/d;)LF1/d;

    move-result-object p0

    if-nez p0, :cond_2

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    return v0
.end method
