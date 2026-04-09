.class final LM0/Z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LM0/Z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM0/Z;

    invoke-direct {v0}, LM0/Z;-><init>()V

    sput-object v0, LM0/Z;->a:LM0/Z;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/text/StaticLayout;)Z
    .locals 0

    invoke-static {p0}, LM0/T;->a(Landroid/text/StaticLayout;)Z

    move-result p0

    return p0
.end method

.method public static final b(Landroid/text/StaticLayout$Builder;II)V
    .locals 1

    invoke-static {}, LM0/Y;->a()Landroid/graphics/text/LineBreakConfig$Builder;

    move-result-object v0

    invoke-static {v0, p1}, LM0/U;->a(Landroid/graphics/text/LineBreakConfig$Builder;I)Landroid/graphics/text/LineBreakConfig$Builder;

    move-result-object p1

    invoke-static {p1, p2}, LM0/V;->a(Landroid/graphics/text/LineBreakConfig$Builder;I)Landroid/graphics/text/LineBreakConfig$Builder;

    move-result-object p1

    invoke-static {p1}, LM0/W;->a(Landroid/graphics/text/LineBreakConfig$Builder;)Landroid/graphics/text/LineBreakConfig;

    move-result-object p1

    invoke-static {p0, p1}, LM0/X;->a(Landroid/text/StaticLayout$Builder;Landroid/graphics/text/LineBreakConfig;)Landroid/text/StaticLayout$Builder;

    return-void
.end method
