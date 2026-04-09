.class public abstract LVf/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(IILr/E;)Lr/T;
    .locals 3

    const-string v0, "easing"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr/T$b;

    invoke-direct {v0}, Lr/T$b;-><init>()V

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lr/T$b;->f(Ljava/lang/Object;I)Lr/T$a;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lr/U;->e(Lr/S;Lr/E;)Lr/S;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {v0, p2, p0}, Lr/T$b;->f(Ljava/lang/Object;I)Lr/T$a;

    if-lez p1, :cond_0

    add-int v1, p0, p1

    invoke-virtual {v0, p2, v1}, Lr/T$b;->f(Ljava/lang/Object;I)Lr/T$a;

    :cond_0
    add-int/2addr p0, p1

    invoke-virtual {v0, p0}, Lr/U;->d(I)V

    new-instance p0, Lr/T;

    invoke-direct {p0, v0}, Lr/T;-><init>(Lr/T$b;)V

    return-object p0
.end method
