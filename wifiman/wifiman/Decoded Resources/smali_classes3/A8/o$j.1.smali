.class final LA8/o$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA8/o;->u1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LA8/o;


# direct methods
.method constructor <init>(LA8/o;)V
    .locals 0

    iput-object p1, p0, LA8/o$j;->a:LA8/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/PointF;)Lgg/f;
    .locals 3

    const-string/jumbo v0, "position"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LA8/o$j;->a:LA8/o;

    invoke-static {v0}, LA8/o;->R0(LA8/o;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, LA8/o$j$a;

    iget-object v2, p0, LA8/o$j;->a:LA8/o;

    invoke-direct {v1, v2, p1}, LA8/o$j$a;-><init>(LA8/o;Landroid/graphics/PointF;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/graphics/PointF;

    invoke-virtual {p0, p1}, LA8/o$j;->a(Landroid/graphics/PointF;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
