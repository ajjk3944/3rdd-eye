.class Lf4/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/l$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf4/g;-><init>(Lf4/g$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf4/g;


# direct methods
.method constructor <init>(Lf4/g;)V
    .locals 0

    iput-object p1, p0, Lf4/g$a;->a:Lf4/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lf4/m;Landroid/graphics/Matrix;I)V
    .locals 2

    iget-object v0, p0, Lf4/g$a;->a:Lf4/g;

    invoke-static {v0}, Lf4/g;->b(Lf4/g;)Ljava/util/BitSet;

    move-result-object v0

    invoke-virtual {p1}, Lf4/m;->e()Z

    move-result v1

    invoke-virtual {v0, p3, v1}, Ljava/util/BitSet;->set(IZ)V

    iget-object v0, p0, Lf4/g$a;->a:Lf4/g;

    invoke-static {v0}, Lf4/g;->c(Lf4/g;)[Lf4/m$g;

    move-result-object v0

    invoke-virtual {p1, p2}, Lf4/m;->f(Landroid/graphics/Matrix;)Lf4/m$g;

    move-result-object p1

    aput-object p1, v0, p3

    return-void
.end method

.method public b(Lf4/m;Landroid/graphics/Matrix;I)V
    .locals 3

    iget-object v0, p0, Lf4/g$a;->a:Lf4/g;

    invoke-static {v0}, Lf4/g;->b(Lf4/g;)Ljava/util/BitSet;

    move-result-object v0

    add-int/lit8 v1, p3, 0x4

    invoke-virtual {p1}, Lf4/m;->e()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/util/BitSet;->set(IZ)V

    iget-object v0, p0, Lf4/g$a;->a:Lf4/g;

    invoke-static {v0}, Lf4/g;->d(Lf4/g;)[Lf4/m$g;

    move-result-object v0

    invoke-virtual {p1, p2}, Lf4/m;->f(Landroid/graphics/Matrix;)Lf4/m$g;

    move-result-object p1

    aput-object p1, v0, p3

    return-void
.end method
