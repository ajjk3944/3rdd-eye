.class public abstract LR0/G;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/view/inputmethod/InputConnection;Lmh/l;)LR0/z;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    new-instance v0, LR0/F;

    invoke-direct {v0, p0, p1}, LR0/F;-><init>(Landroid/view/inputmethod/InputConnection;Lmh/l;)V

    goto :goto_0

    :cond_0
    new-instance v0, LR0/C;

    invoke-direct {v0, p0, p1}, LR0/C;-><init>(Landroid/view/inputmethod/InputConnection;Lmh/l;)V

    :goto_0
    return-object v0
.end method
