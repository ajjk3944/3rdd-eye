.class public abstract Landroidx/lifecycle/H;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lb2/a$b;

.field public static final b:Lb2/a$b;

.field public static final c:Lb2/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/H$b;

    invoke-direct {v0}, Landroidx/lifecycle/H$b;-><init>()V

    sput-object v0, Landroidx/lifecycle/H;->a:Lb2/a$b;

    new-instance v0, Landroidx/lifecycle/H$c;

    invoke-direct {v0}, Landroidx/lifecycle/H$c;-><init>()V

    sput-object v0, Landroidx/lifecycle/H;->b:Lb2/a$b;

    new-instance v0, Landroidx/lifecycle/H$a;

    invoke-direct {v0}, Landroidx/lifecycle/H$a;-><init>()V

    sput-object v0, Landroidx/lifecycle/H;->c:Lb2/a$b;

    return-void
.end method

.method public static final a(Lb2/a;)Landroidx/lifecycle/E;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/lifecycle/H;->a:Lb2/a$b;

    invoke-virtual {p0, v0}, Lb2/a;->a(Lb2/a$b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq2/f;

    if-eqz v0, :cond_2

    sget-object v1, Landroidx/lifecycle/H;->b:Lb2/a$b;

    invoke-virtual {p0, v1}, Lb2/a;->a(Lb2/a$b;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/S;

    if-eqz v1, :cond_1

    sget-object v2, Landroidx/lifecycle/H;->c:Lb2/a$b;

    invoke-virtual {p0, v2}, Lb2/a;->a(Lb2/a$b;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Bundle;

    sget-object v3, Landroidx/lifecycle/P$d;->d:Lb2/a$b;

    invoke-virtual {p0, v3}, Lb2/a;->a(Lb2/a$b;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_0

    invoke-static {v0, v1, p0, v2}, Landroidx/lifecycle/H;->b(Lq2/f;Landroidx/lifecycle/S;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/E;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final b(Lq2/f;Landroidx/lifecycle/S;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/E;
    .locals 1

    invoke-static {p0}, Landroidx/lifecycle/H;->d(Lq2/f;)Landroidx/lifecycle/I;

    move-result-object p0

    invoke-static {p1}, Landroidx/lifecycle/H;->e(Landroidx/lifecycle/S;)Landroidx/lifecycle/J;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/J;->X()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/E;

    if-nez v0, :cond_0

    sget-object v0, Landroidx/lifecycle/E;->f:Landroidx/lifecycle/E$a;

    invoke-virtual {p0, p2}, Landroidx/lifecycle/I;->b(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    invoke-virtual {v0, p0, p3}, Landroidx/lifecycle/E$a;->a(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/E;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/lifecycle/J;->X()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public static final c(Lq2/f;)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/k$b;->INITIALIZED:Landroidx/lifecycle/k$b;

    if-eq v0, v1, :cond_1

    sget-object v1, Landroidx/lifecycle/k$b;->CREATED:Landroidx/lifecycle/k$b;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Lq2/f;->t()Lq2/d;

    move-result-object v0

    const-string v1, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    invoke-virtual {v0, v1}, Lq2/d;->c(Ljava/lang/String;)Lq2/d$c;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Landroidx/lifecycle/I;

    invoke-interface {p0}, Lq2/f;->t()Lq2/d;

    move-result-object v2

    move-object v3, p0

    check-cast v3, Landroidx/lifecycle/S;

    invoke-direct {v0, v2, v3}, Landroidx/lifecycle/I;-><init>(Lq2/d;Landroidx/lifecycle/S;)V

    invoke-interface {p0}, Lq2/f;->t()Lq2/d;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Lq2/d;->h(Ljava/lang/String;Lq2/d$c;)V

    invoke-interface {p0}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object p0

    new-instance v1, Landroidx/lifecycle/F;

    invoke-direct {v1, v0}, Landroidx/lifecycle/F;-><init>(Landroidx/lifecycle/I;)V

    invoke-virtual {p0, v1}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/n;)V

    :cond_2
    return-void
.end method

.method public static final d(Lq2/f;)Landroidx/lifecycle/I;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lq2/f;->t()Lq2/d;

    move-result-object p0

    const-string v0, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    invoke-virtual {p0, v0}, Lq2/d;->c(Ljava/lang/String;)Lq2/d$c;

    move-result-object p0

    instance-of v0, p0, Landroidx/lifecycle/I;

    if-eqz v0, :cond_0

    check-cast p0, Landroidx/lifecycle/I;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "enableSavedStateHandles() wasn\'t called prior to createSavedStateHandle() call"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final e(Landroidx/lifecycle/S;)Landroidx/lifecycle/J;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/lifecycle/P;

    new-instance v1, Landroidx/lifecycle/H$d;

    invoke-direct {v1}, Landroidx/lifecycle/H$d;-><init>()V

    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/P;-><init>(Landroidx/lifecycle/S;Landroidx/lifecycle/P$c;)V

    const-string p0, "androidx.lifecycle.internal.SavedStateHandlesVM"

    const-class v1, Landroidx/lifecycle/J;

    invoke-virtual {v0, p0, v1}, Landroidx/lifecycle/P;->b(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/N;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/J;

    return-object p0
.end method
