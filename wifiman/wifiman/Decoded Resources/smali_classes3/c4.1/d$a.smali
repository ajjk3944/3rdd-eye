.class Lc4/d$a;
.super Lv1/h$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc4/d;->h(Landroid/content/Context;Lc4/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc4/f;

.field final synthetic b:Lc4/d;


# direct methods
.method constructor <init>(Lc4/d;Lc4/f;)V
    .locals 0

    iput-object p1, p0, Lc4/d$a;->b:Lc4/d;

    iput-object p2, p0, Lc4/d$a;->a:Lc4/f;

    invoke-direct {p0}, Lv1/h$e;-><init>()V

    return-void
.end method


# virtual methods
.method public h(I)V
    .locals 2

    iget-object v0, p0, Lc4/d$a;->b:Lc4/d;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lc4/d;->c(Lc4/d;Z)Z

    iget-object v0, p0, Lc4/d$a;->a:Lc4/f;

    invoke-virtual {v0, p1}, Lc4/f;->a(I)V

    return-void
.end method

.method public i(Landroid/graphics/Typeface;)V
    .locals 2

    iget-object v0, p0, Lc4/d$a;->b:Lc4/d;

    iget v1, v0, Lc4/d;->e:I

    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-static {v0, p1}, Lc4/d;->b(Lc4/d;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object p1, p0, Lc4/d$a;->b:Lc4/d;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lc4/d;->c(Lc4/d;Z)Z

    iget-object p1, p0, Lc4/d$a;->a:Lc4/f;

    iget-object v0, p0, Lc4/d$a;->b:Lc4/d;

    invoke-static {v0}, Lc4/d;->a(Lc4/d;)Landroid/graphics/Typeface;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lc4/f;->b(Landroid/graphics/Typeface;Z)V

    return-void
.end method
