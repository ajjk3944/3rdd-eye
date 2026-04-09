.class final Lt6/b$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt6/b;->h(Lu6/e;Ljava/lang/CharSequence;FIIF)Landroid/text/StaticLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lt6/b;

.field final synthetic b:F

.field final synthetic c:Ljava/lang/CharSequence;

.field final synthetic d:I


# direct methods
.method constructor <init>(Lt6/b;FLjava/lang/CharSequence;I)V
    .locals 0

    iput-object p1, p0, Lt6/b$c;->a:Lt6/b;

    iput p2, p0, Lt6/b$c;->b:F

    iput-object p3, p0, Lt6/b$c;->c:Ljava/lang/CharSequence;

    iput p4, p0, Lt6/b$c;->d:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/text/StaticLayout;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lt6/b$c;->a:Lt6/b;

    invoke-static {v1}, Lt6/b;->b(Lt6/b;)Landroid/text/TextPaint;

    move-result-object v1

    iget-object v2, v0, Lt6/b$c;->a:Lt6/b;

    invoke-virtual {v2}, Lt6/b;->p()F

    move-result v2

    iget v3, v0, Lt6/b$c;->b:F

    mul-float/2addr v2, v3

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v3, v0, Lt6/b$c;->c:Ljava/lang/CharSequence;

    iget-object v1, v0, Lt6/b$c;->a:Lt6/b;

    invoke-static {v1}, Lt6/b;->b(Lt6/b;)Landroid/text/TextPaint;

    move-result-object v4

    iget v5, v0, Lt6/b$c;->d:I

    iget-object v1, v0, Lt6/b$c;->a:Lt6/b;

    invoke-virtual {v1}, Lt6/b;->i()I

    move-result v6

    iget-object v1, v0, Lt6/b$c;->a:Lt6/b;

    invoke-virtual {v1}, Lt6/b;->e()Landroid/text/TextUtils$TruncateAt;

    move-result-object v12

    const/16 v15, 0xdf0    # 5.0E-42f

    const/16 v16, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v3 .. v16}, LF6/a;->d(Ljava/lang/CharSequence;Landroid/text/TextPaint;IIIIFFZLandroid/text/TextUtils$TruncateAt;ILandroid/text/Layout$Alignment;ILjava/lang/Object;)Landroid/text/StaticLayout;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lt6/b$c;->a()Landroid/text/StaticLayout;

    move-result-object v0

    return-object v0
.end method
