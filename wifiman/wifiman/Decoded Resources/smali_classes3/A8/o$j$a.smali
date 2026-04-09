.class final LA8/o$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA8/o$j;->a(Landroid/graphics/PointF;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LA8/o;

.field final synthetic b:Landroid/graphics/PointF;


# direct methods
.method constructor <init>(LA8/o;Landroid/graphics/PointF;)V
    .locals 0

    iput-object p1, p0, LA8/o$j$a;->a:LA8/o;

    iput-object p2, p0, LA8/o$j$a;->b:Landroid/graphics/PointF;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LA8/o$c;)Lgg/f;
    .locals 3

    const-string/jumbo v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LA8/o$j$a;->a:LA8/o;

    iget-object v1, p0, LA8/o$j$a;->b:Landroid/graphics/PointF;

    new-instance v2, LA8/o$j$a$a;

    invoke-direct {v2, v0, v1, p1}, LA8/o$j$a$a;-><init>(LA8/o;Landroid/graphics/PointF;LA8/o$c;)V

    invoke-static {v2}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA8/o$c;

    invoke-virtual {p0, p1}, LA8/o$j$a;->a(LA8/o$c;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
