.class final Lf2/n$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf2/n;->v(Ljava/util/List;Lf2/r;ZZ)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/J;

.field final synthetic b:Lkotlin/jvm/internal/J;

.field final synthetic c:Lf2/n;

.field final synthetic d:Z

.field final synthetic e:LZg/m;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/J;Lkotlin/jvm/internal/J;Lf2/n;ZLZg/m;)V
    .locals 0

    iput-object p1, p0, Lf2/n$f;->a:Lkotlin/jvm/internal/J;

    iput-object p2, p0, Lf2/n$f;->b:Lkotlin/jvm/internal/J;

    iput-object p3, p0, Lf2/n$f;->c:Lf2/n;

    iput-boolean p4, p0, Lf2/n$f;->d:Z

    iput-object p5, p0, Lf2/n$f;->e:LZg/m;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lf2/k;)V
    .locals 3

    const-string v0, "entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf2/n$f;->a:Lkotlin/jvm/internal/J;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lkotlin/jvm/internal/J;->a:Z

    iget-object v0, p0, Lf2/n$f;->b:Lkotlin/jvm/internal/J;

    iput-boolean v1, v0, Lkotlin/jvm/internal/J;->a:Z

    iget-object v0, p0, Lf2/n$f;->c:Lf2/n;

    iget-boolean v1, p0, Lf2/n$f;->d:Z

    iget-object v2, p0, Lf2/n$f;->e:LZg/m;

    invoke-static {v0, p1, v1, v2}, Lf2/n;->o(Lf2/n;Lf2/k;ZLZg/m;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf2/k;

    invoke-virtual {p0, p1}, Lf2/n$f;->a(Lf2/k;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
