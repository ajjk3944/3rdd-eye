.class public abstract Lt5/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt5/n$b;
    }
.end annotation


# direct methods
.method public static a(Lcom/google/gson/g;Lw5/c;)V
    .locals 1

    sget-object v0, Lcom/google/gson/internal/bind/l;->V:Lcom/google/gson/p;

    invoke-virtual {v0, p1, p0}, Lcom/google/gson/p;->d(Lw5/c;Ljava/lang/Object;)V

    return-void
.end method

.method public static b(Ljava/lang/Appendable;)Ljava/io/Writer;
    .locals 1

    instance-of v0, p0, Ljava/io/Writer;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/io/Writer;

    goto :goto_0

    :cond_0
    new-instance v0, Lt5/n$b;

    invoke-direct {v0, p0}, Lt5/n$b;-><init>(Ljava/lang/Appendable;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method
