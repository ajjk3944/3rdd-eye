.class public abstract LF/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LL0/d$a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "androidx.compose.foundation.text.inlineContent"

    invoke-virtual {p0, v0, p1}, LL0/d$a;->m(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p2}, LL0/d$a;->i(Ljava/lang/String;)V

    invoke-virtual {p0}, LL0/d$a;->k()V

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "alternateText can\'t be an empty string."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic b(LL0/d$a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-string p2, "\ufffd"

    :cond_0
    invoke-static {p0, p1, p2}, LF/u;->a(LL0/d$a;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
