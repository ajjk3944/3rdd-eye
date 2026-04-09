.class public final LM0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LM0/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM0/f;

    invoke-direct {v0}, LM0/f;-><init>()V

    sput-object v0, LM0/f;->a:LM0/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lmh/p;Landroid/graphics/RectF;Landroid/graphics/RectF;)Z
    .locals 0

    invoke-static {p0, p1, p2}, LM0/f;->b(Lmh/p;Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    move-result p0

    return p0
.end method

.method private static final b(Lmh/p;Landroid/graphics/RectF;Landroid/graphics/RectF;)Z
    .locals 0

    invoke-interface {p0, p1, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final c(LM0/f0;Landroid/graphics/RectF;ILmh/p;)[I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LM0/f0;",
            "Landroid/graphics/RectF;",
            "I",
            "Lmh/p;",
            ")[I"
        }
    .end annotation

    const/4 v0, 0x1

    if-ne p3, v0, :cond_0

    sget-object p3, LN0/a;->a:LN0/a;

    new-instance v0, LN0/j;

    invoke-virtual {p1}, LM0/f0;->G()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p1}, LM0/f0;->I()LN0/i;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LN0/j;-><init>(Ljava/lang/CharSequence;LN0/i;)V

    invoke-virtual {p3, v0}, LN0/a;->a(LN0/f;)Landroid/text/SegmentFinder;

    move-result-object p3

    goto :goto_0

    :cond_0
    invoke-static {}, LM0/b;->a()V

    invoke-virtual {p1}, LM0/f0;->G()Ljava/lang/CharSequence;

    move-result-object p3

    invoke-virtual {p1}, LM0/f0;->H()Landroid/text/TextPaint;

    move-result-object v0

    invoke-static {p3, v0}, LM0/a;->a(Ljava/lang/CharSequence;Landroid/text/TextPaint;)Landroid/text/GraphemeClusterSegmentFinder;

    move-result-object p3

    invoke-static {p3}, LM0/c;->a(Ljava/lang/Object;)Landroid/text/SegmentFinder;

    move-result-object p3

    :goto_0
    invoke-virtual {p1}, LM0/f0;->i()Landroid/text/Layout;

    move-result-object p1

    new-instance v0, LM0/e;

    invoke-direct {v0, p4}, LM0/e;-><init>(Lmh/p;)V

    invoke-static {p1, p2, p3, v0}, LM0/d;->a(Landroid/text/Layout;Landroid/graphics/RectF;Landroid/text/SegmentFinder;Landroid/text/Layout$TextInclusionStrategy;)[I

    move-result-object p1

    return-object p1
.end method
