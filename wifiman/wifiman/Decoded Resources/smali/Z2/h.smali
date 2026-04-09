.class public final LZ2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LT/q0;

.field private final b:LT/q0;

.field private final c:LT/q0;

.field private final d:LT/q0;

.field private final e:LT/q0;

.field private final f:Landroidx/compose/runtime/snapshots/k;

.field private g:Landroid/os/Bundle;

.field private final h:LT/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LZ2/d;)V
    .locals 3

    const-string v0, "webContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {v0, v0, v1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v2

    iput-object v2, p0, LZ2/h;->a:LT/q0;

    invoke-static {p1, v0, v1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LZ2/h;->b:LT/q0;

    sget-object p1, LZ2/c$b;->a:LZ2/c$b;

    invoke-static {p1, v0, v1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LZ2/h;->c:LT/q0;

    invoke-static {v0, v0, v1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LZ2/h;->d:LT/q0;

    invoke-static {v0, v0, v1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LZ2/h;->e:LT/q0;

    invoke-static {}, LT/o1;->f()Landroidx/compose/runtime/snapshots/k;

    move-result-object p1

    iput-object p1, p0, LZ2/h;->f:Landroidx/compose/runtime/snapshots/k;

    invoke-static {v0, v0, v1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LZ2/h;->h:LT/q0;

    return-void
.end method


# virtual methods
.method public final a()LZ2/d;
    .locals 1

    iget-object v0, p0, LZ2/h;->b:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ2/d;

    return-object v0
.end method

.method public final b()Landroidx/compose/runtime/snapshots/k;
    .locals 1

    iget-object v0, p0, LZ2/h;->f:Landroidx/compose/runtime/snapshots/k;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LZ2/h;->a:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final d()LZ2/c;
    .locals 1

    iget-object v0, p0, LZ2/h;->c:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ2/c;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LZ2/h;->d:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final f()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, LZ2/h;->g:Landroid/os/Bundle;

    return-object v0
.end method

.method public final g()Landroid/webkit/WebView;
    .locals 1

    iget-object v0, p0, LZ2/h;->h:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    return-object v0
.end method

.method public final h(LZ2/d;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LZ2/h;->b:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final i(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, LZ2/h;->a:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final j(LZ2/c;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LZ2/h;->c:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final k(Landroid/graphics/Bitmap;)V
    .locals 1

    iget-object v0, p0, LZ2/h;->e:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final l(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, LZ2/h;->d:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final m(Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, LZ2/h;->g:Landroid/os/Bundle;

    return-void
.end method

.method public final n(Landroid/webkit/WebView;)V
    .locals 1

    iget-object v0, p0, LZ2/h;->h:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
