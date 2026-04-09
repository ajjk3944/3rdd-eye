.class public abstract LN0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/CharSequence;Landroid/text/TextPaint;)LN0/f;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    new-instance v0, LN0/d;

    invoke-direct {v0, p0, p1}, LN0/d;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;)V

    goto :goto_0

    :cond_0
    new-instance v0, LN0/e;

    invoke-direct {v0, p0}, LN0/e;-><init>(Ljava/lang/CharSequence;)V

    :goto_0
    return-object v0
.end method
