.class public final LN0/d;
.super LN0/b;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/CharSequence;

.field private final b:Landroid/text/TextPaint;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;)V
    .locals 0

    invoke-direct {p0}, LN0/b;-><init>()V

    iput-object p1, p0, LN0/d;->a:Ljava/lang/CharSequence;

    iput-object p2, p0, LN0/d;->b:Landroid/text/TextPaint;

    return-void
.end method


# virtual methods
.method public e(I)I
    .locals 7

    iget-object v0, p0, LN0/d;->b:Landroid/text/TextPaint;

    iget-object v1, p0, LN0/d;->a:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    move v5, p1

    invoke-static/range {v0 .. v6}, LN0/c;->a(Landroid/text/TextPaint;Ljava/lang/CharSequence;IIZII)I

    move-result p1

    return p1
.end method

.method public f(I)I
    .locals 7

    iget-object v0, p0, LN0/d;->b:Landroid/text/TextPaint;

    iget-object v1, p0, LN0/d;->a:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v4, 0x0

    const/4 v6, 0x2

    const/4 v2, 0x0

    move v5, p1

    invoke-static/range {v0 .. v6}, LN0/c;->a(Landroid/text/TextPaint;Ljava/lang/CharSequence;IIZII)I

    move-result p1

    return p1
.end method
