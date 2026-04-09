.class public abstract LL8/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LL8/k$a;
    }
.end annotation


# direct methods
.method public static final a(Lcom/ui/wifiman/model/vendor/d;)Ls9/d;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/ui/wifiman/model/vendor/d$c;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Lcom/ui/wifiman/model/vendor/d$c;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/vendor/d$c;->c()Lcom/ui/wifiman/model/vendor/d$d;

    move-result-object v1

    sget-object v2, LL8/k$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    new-instance v1, Ls9/d$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/vendor/d$c;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/ui/wifiman/model/vendor/d$c;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, LL8/k$b;

    invoke-direct {v2, p0}, LL8/k$b;-><init>(Lcom/ui/wifiman/model/vendor/d;)V

    invoke-direct {v1, v0, v2}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ls9/d$c;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/vendor/d$c;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    new-instance v1, Ls9/d$c;

    invoke-virtual {p0}, Lcom/ui/wifiman/model/vendor/d;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    :goto_0
    return-object v1
.end method
