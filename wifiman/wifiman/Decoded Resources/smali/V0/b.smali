.class public final LV0/b;
.super Landroid/text/style/CharacterStyle;
.source "SourceFile"

# interfaces
.implements Landroid/text/style/UpdateAppearance;


# instance fields
.field private final a:Lm0/e1;

.field private final b:F

.field private final c:LT/q0;

.field private final d:LT/z1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lm0/e1;F)V
    .locals 1

    invoke-direct {p0}, Landroid/text/style/CharacterStyle;-><init>()V

    iput-object p1, p0, LV0/b;->a:Lm0/e1;

    iput p2, p0, LV0/b;->b:F

    sget-object p1, Ll0/m;->b:Ll0/m$a;

    invoke-virtual {p1}, Ll0/m$a;->a()J

    move-result-wide p1

    invoke-static {p1, p2}, Ll0/m;->c(J)Ll0/m;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v0, 0x2

    invoke-static {p1, p2, v0, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LV0/b;->c:LT/q0;

    new-instance p1, LV0/b$a;

    invoke-direct {p1, p0}, LV0/b$a;-><init>(LV0/b;)V

    invoke-static {p1}, LT/o1;->e(Lmh/a;)LT/z1;

    move-result-object p1

    iput-object p1, p0, LV0/b;->d:LT/z1;

    return-void
.end method


# virtual methods
.method public final a()Lm0/e1;
    .locals 1

    iget-object v0, p0, LV0/b;->a:Lm0/e1;

    return-object v0
.end method

.method public final b()J
    .locals 2

    iget-object v0, p0, LV0/b;->c:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/m;

    invoke-virtual {v0}, Ll0/m;->m()J

    move-result-wide v0

    return-wide v0
.end method

.method public final c(J)V
    .locals 1

    iget-object v0, p0, LV0/b;->c:LT/q0;

    invoke-static {p1, p2}, Ll0/m;->c(J)Ll0/m;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    iget v0, p0, LV0/b;->b:F

    invoke-static {p1, v0}, LT0/h;->a(Landroid/text/TextPaint;F)V

    iget-object v0, p0, LV0/b;->d:LT/z1;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Shader;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void
.end method
