.class final LE8/A$s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/A;->v0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE8/A;


# direct methods
.method constructor <init>(LE8/A;)V
    .locals 0

    iput-object p1, p0, LE8/A$s;->a:LE8/A;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lgg/f;
    .locals 7

    const-string/jumbo v0, "shareLink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LE8/A$s;->a:LE8/A;

    invoke-static {v0}, LE8/A;->B0(LE8/A;)LP7/a;

    move-result-object v0

    new-instance v1, LP7/c$h$c;

    invoke-direct {v1}, LP7/c$h$c;-><init>()V

    invoke-interface {v0, v1}, LP7/a;->d(LP7/c;)Lgg/b;

    move-result-object v0

    iget-object v1, p0, LE8/A$s;->a:LE8/A;

    invoke-static {v1}, LE8/A;->K0(LE8/A;)Li8/a;

    move-result-object v1

    new-instance v2, Li8/a$b$D$f;

    iget-object v3, p0, LE8/A$s;->a:LE8/A;

    invoke-static {v3}, LE8/A;->D0(LE8/A;)Landroid/content/Context;

    move-result-object v3

    const v4, 0x7f1102bb

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string/jumbo v4, "getString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, p0, LE8/A$s;->a:LE8/A;

    invoke-static {v5}, LE8/A;->D0(LE8/A;)Landroid/content/Context;

    move-result-object v5

    const v6, 0x7f1102bc

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {v5, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string/jumbo v5, "format(...)"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v3, p1}, Li8/a$b$D$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-array p1, v4, [Li8/a$b;

    const/4 v3, 0x0

    aput-object v2, p1, v3

    invoke-interface {v1, p1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    const/4 v1, 0x2

    new-array v1, v1, [Lgg/f;

    aput-object v0, v1, v3

    aput-object p1, v1, v4

    invoke-static {v1}, Lgg/b;->I([Lgg/f;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LE8/A$s;->a(Ljava/lang/String;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
