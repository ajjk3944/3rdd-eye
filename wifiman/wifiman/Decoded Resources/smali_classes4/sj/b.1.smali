.class final Lsj/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lth/l;)LYg/m;
    .locals 0

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p0, p1, p2}, Lsj/b;->b(Landroid/content/Context;Lth/l;)LYg/m;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/content/Context;Lth/l;)LYg/m;
    .locals 0

    const-string p2, "thisRef"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lsj/b$a;

    invoke-direct {p2, p1}, Lsj/b$a;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    return-object p1
.end method
